package cn.yy.ssm.po;


public class PageData<T>{
		//当前第几页
	    private int currentPage;
	    //当前页的总条数
	    private int pageSize;
	    //封装了要查询的条件
	    private T entity;
        //从哪条开始
        private int startPage;
	    public int getCurrentPage() {
	        return currentPage;
	    }

	    public PageData<T> setCurrentPage(int currentPage) {
	        this.currentPage = currentPage;
	        return this;
	    }

	    public int getPageSize() {
	        return pageSize;
	    }

	    public PageData<T> setPageSize(int pageSize) {
	        this.pageSize = pageSize;
	        return this;
	    }

	    public int getStartPage() {
	        return (currentPage - 1) * pageSize;
	    }

	    public T getEntity() {
	        return entity;
	    }

	    public PageData<T> setEntity(T entity) {
	        this.entity = entity;
	        return this;
	    }
	    }
