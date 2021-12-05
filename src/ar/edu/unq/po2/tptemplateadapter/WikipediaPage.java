package ar.edu.unq.po2.tptemplateadapter;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {

	public String getTitle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String, WikipediaPage> getInfobox();
	
}
