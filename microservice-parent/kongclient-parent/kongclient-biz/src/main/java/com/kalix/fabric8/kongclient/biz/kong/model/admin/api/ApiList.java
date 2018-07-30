package com.kalix.fabric8.kongclient.biz.kong.model.admin.api;

import com.kalix.fabric8.kongclient.biz.kong.model.common.AbstractEntityList;

import java.util.List;

//import lombok.Data;

/**
 * Created by vaibhav on 13/06/17.
 */
//@Data
public class ApiList extends AbstractEntityList {
    Long total;
    String next;
    List<Api> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<Api> getData() {
        return data;
    }

    public void setData(List<Api> data) {
        this.data = data;
    }
}
