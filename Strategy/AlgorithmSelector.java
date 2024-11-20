package Strategy;

public class AlgorithmSelector {
	Isearch isearch;
	Isort isort;
	
	void setSort(Isort isort) {
		this.isort=isort;
	}
	void setSearch(Isearch isearch) {
		this.isearch=isearch;
	}
	void performSort() {
		this.isort.sort();
	}
	void performSearch() {
		this.isearch.search();
	}
}
