package ar.edu.unq.po2.tpsolid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	private Cliente cliente;
	private Cliente cliente2;
	private Banco banco;
	private SolicitudCreditoHipotecario solicitudHipotecaria;
	private SolicitudCreditoHipotecario solicitudHipotecaria2;
	private SolicitudCreditoPersonal solicitudPersonal;
	private SolicitudCreditoPersonal solicitudPersonal2;
	private Propiedad casa;
	private Propiedad casa2;
	
	@BeforeEach
	public void setUp() throws Exception {
		cliente = new Cliente("Matias", "Dominguez", 22, "Alte. Brown 115", 100000);
		cliente2 = new Cliente("Juan", "Perez", 32, "Castelli 200", 20000);
		banco = new Banco();
		casa = new Propiedad("2 pisos y amplio patio", "Alte. Brown 115", 2800000);
		casa2 = new Propiedad("Monoambiente", "Castelli 200", 280000);
		solicitudHipotecaria = new SolicitudCreditoHipotecario(200000, 12, cliente, casa);
		solicitudHipotecaria2 = new SolicitudCreditoHipotecario(2000000, 12, cliente2, casa2);
		solicitudPersonal = new SolicitudCreditoPersonal(50000, 6, cliente);
		solicitudPersonal2 = new SolicitudCreditoPersonal(500000, 6, cliente2);
		banco.agregarCliente(cliente);
		banco.agregarCliente(cliente2);
		cliente.asociarBanco(banco);
		cliente2.asociarBanco(banco);
	}
	
	//En ambos tests el banco solo tiene que desembolsar el monto para la solicitud del primer cliente, 
	//ya que el cliente 2 no cumple con los requisitos.
	@Test
	public void testHipotecario() {
		cliente.enviarSolicitudDeCredito(solicitudHipotecaria);
		cliente2.enviarSolicitudDeCredito(solicitudHipotecaria2);
		assertEquals(banco.totalADesembolsar(), solicitudHipotecaria.getMonto());
	}
	
	@Test
	public void testPersonal() {
		cliente.enviarSolicitudDeCredito(solicitudPersonal);
		cliente2.enviarSolicitudDeCredito(solicitudPersonal2);
		assertEquals(banco.totalADesembolsar(), solicitudPersonal.getMonto());
	}
}
