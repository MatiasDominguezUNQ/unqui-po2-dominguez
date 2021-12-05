package ar.edu.unq.po2.tptemplateadapter;

import java.util.List;
import java.util.stream.Collectors;


public abstract class FiltroDePagina {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		List<WikipediaPage> paginasSimilares = wikipedia.stream()
				.filter(pagina -> this.esSimilar(pagina, page))
				.collect(Collectors.toList());
		return paginasSimilares;
		
		}

	public abstract boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2);

}
