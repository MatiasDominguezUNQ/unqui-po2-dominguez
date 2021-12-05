package ar.edu.unq.po2.tptemplateadapter;


public class FiltroLinkEnComun extends FiltroDePagina{

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		
		return pagina1.getLinks().stream().anyMatch(link -> pagina2.getLinks().contains(link));
	}

}
