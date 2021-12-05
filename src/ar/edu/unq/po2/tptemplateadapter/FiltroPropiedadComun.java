package ar.edu.unq.po2.tptemplateadapter;

public class FiltroPropiedadComun extends FiltroDePagina{

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		
		return pagina1.getInfobox().keySet()
				.stream().anyMatch(key -> pagina2.getInfobox().containsKey(key));
	}

}
