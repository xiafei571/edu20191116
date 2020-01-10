package edu20191116.common.page;

public class PaginationResult<T> {

	private Pagination pagination;

	private T pageData;

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public T getPageData() {
		return pageData;
	}

	public void setPageData(T pageData) {
		this.pageData = pageData;
	}

	public PaginationResult(Pagination pagination, T pageData) {
		super();
		this.pagination = pagination;
		this.pageData = pageData;
	}

	public PaginationResult() {
	}

}
