package cn.yy.ssm.po;

import java.util.List;
public class ResponseData<T>  {
	//总数
    private int total;
    //分页的数据
    private List<T> data;

    public int getTotal() {
        return total;
    }

    public ResponseData<T> setTotal(int total) {
        this.total = total;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public ResponseData<T> setRows(List<T> data) {
        this.data = data;
        return this;
    }
}
