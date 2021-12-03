package ar.edu.unq.po2.tpobserver;

import java.util.List;

public interface IPartidoListener {
	public void recibirPartido(Partido partido);
	public List<String> intereses();
}
