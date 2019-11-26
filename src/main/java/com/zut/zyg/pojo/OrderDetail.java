package com.zut.zyg.pojo;

public class OrderDetail {
    private Integer id;
    private Integer orders_id;
    private Integer items_id;
    private Integer items_name;
    public OrderDetail(){

    }

    public OrderDetail(Integer id, Integer orders_id, Integer items_id, Integer items_name) {
        this.id = id;
        this.orders_id = orders_id;
        this.items_id = items_id;
        this.items_name = items_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(Integer items_id) {
        this.items_id = items_id;
    }

    public Integer getItems_name() {
        return items_name;
    }

    public void setItems_name(Integer items_name) {
        this.items_name = items_name;
    }
}
