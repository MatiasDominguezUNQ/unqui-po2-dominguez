package ar.edu.unq.po2.tptemplateadapter;

public class FiltroMismaLetraInicial extends FiltroDePagina{

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		
		return pagina1.getTitle().charAt(0) == pagina2.getTitle().charAt(0);
	}

}
