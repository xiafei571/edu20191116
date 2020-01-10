package edu20191116.common.page;

public class Pagination {
	// 1. 第几页
	private Integer pageIndex = 1;
	// 2. 一页多少个
	private Integer pageSize = 20;
	// 3. 一共多少条数据
	private Integer totalCount;
	// 4. 一共多少页 [5+(3-1）] / 3 = 2
	private Integer totalCountPage;
	// 5. 当前页数量 list.size
	private Integer currentPageCount;
	// 6. 游标开始 (pageIndex-1)*pageSize
	private Integer cursor = null;
	// 7. 游标数量
	private Integer offset;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalCountPage() {
//		if (totalCount % pageSize == 0)
//			return totalCount / pageSize;
//		return (totalCount / pageSize) + 1;
		// return totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount /
		// pageSize) + 1;
		return (totalCount + pageSize - 1) / pageSize;
	}

	public void setTotalCountPage(Integer totalCountPage) {
		this.totalCountPage = totalCountPage;
	}

	public Integer getCurrentPageCount() {
		return currentPageCount;
	}

	public void setCurrentPageCount(Integer currentPageCount) {
		this.currentPageCount = currentPageCount;
	}

	public Integer getCursor() {
		return (pageIndex - 1) * pageSize;
	}

	public void setCursor(Integer cursor) {
		this.cursor = cursor;
	}

	public Integer getOffset() {
		return pageSize;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public static void main(String[] args) {
		Pagination page = new Pagination(3,5);
		page.setTotalCount(21);

		System.out.println(page.getCursor());
	}

	public Pagination(Integer pageIndex, Integer pageSize) {
		if (null == pageIndex || pageIndex < 1) {
			pageIndex = 1;
		}
		if (null == pageSize) {
			pageSize = 10;
		}
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public Pagination() {
	}

}
