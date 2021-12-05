package ar.edu.unq.po2.tptemplateadapter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltroDePaginaTest {
		
	private FiltroLinkEnComun filtroLink;
	private FiltroMismaLetraInicial filtroLetra;
	private FiltroPropiedadComun filtroPropiedad;
	private WikipediaPage bernal;
	private WikipediaPage berazategui;
	private WikipediaPage quilmes;
	private WikipediaPage buenosAires;
	private List<WikipediaPage> paginas;

	@BeforeEach
	public void setUp() throws Exception {
		filtroLink = new FiltroLinkEnComun();
		filtroLetra = new FiltroMismaLetraInicial();
		filtroPropiedad = new FiltroPropiedadComun();
		bernal = mock(WikipediaPage.class);
		quilmes = mock(WikipediaPage.class);
		buenosAires = mock(WikipediaPage.class);
		berazategui = mock(WikipediaPage.class);
		paginas = Arrays.asList(bernal, quilmes, buenosAires);
	}
	
	@Test
	public void filtroMismaLetraInicialTest() {
		when(bernal.getTitle()).thenReturn("Bernal");
		when(quilmes.getTitle()).thenReturn("Quilmes");
		when(buenosAires.getTitle()).thenReturn("Buenos Aires");
		when(berazategui.getTitle()).thenReturn("Berazategui");
		
		assertEquals(filtroLetra.getSimilarPages(berazategui, paginas).size(),2);
	}
	

	@Test
	public void filtroLinksSimilares() {
		List<WikipediaPage> links1 = Arrays.asList(quilmes, buenosAires);
		List<WikipediaPage> links2 = Arrays.asList(buenosAires);
		when(berazategui.getLinks()).thenReturn(links1);
		when(bernal.getLinks()).thenReturn(links2);
		
		assertEquals(filtroLink.getSimilarPages(berazategui, paginas).size(),1);
	}
	
	@Test
	public void filtroPropiedadesSimilares() {		
		Map<String, WikipediaPage> propiedades1 = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> propiedades2 = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> propiedades3 = new HashMap<String, WikipediaPage>();
		
		propiedades1.put("birth_place", mock(WikipediaPage.class));
		propiedades2.put("birth_place", mock(WikipediaPage.class));
		propiedades3.put("school_place", mock(WikipediaPage.class));
		
		when(berazategui.getInfobox()).thenReturn(propiedades1);
		when(bernal.getInfobox()).thenReturn(propiedades2);
		when(quilmes.getInfobox()).thenReturn(propiedades3);
		
		assertEquals(filtroPropiedad.getSimilarPages(berazategui, paginas).size(),1);
	}

}
