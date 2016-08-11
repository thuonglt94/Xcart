package builder;

import detail.SearchDetail;

public class SearchDetailBuilder {
	private String search;

	public SearchDetailBuilder withSearch(String search) {
		this.search = search;
		return this;
	}

	public SearchDetail build() {
		return new SearchDetail(search);
	}
}
