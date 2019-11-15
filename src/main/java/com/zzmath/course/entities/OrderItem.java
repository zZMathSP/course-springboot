package com.zzmath.course.entities;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;

import com.zzmath.course.entities.pk.OrderItemPK;


@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private OrderItemPK id;
    
    private Integer quantity;
    private Double price;
    
    public OrderItem() {
        
    }

    public OrderItem(Order order, Product prouct, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(prouct);
        this.quantity = quantity;
        this.price = price;
    }
    
    public Order getOrder() {
        return id.getOrder();
    }
    
    public void setOrder(Order order) {
        id.setOrder(order);
    }
    
    public Product getProduct() {
        return id.getProduct();
    }
    
    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItem other = (OrderItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public OrderItemPK getId() {
        return id;
    }

    public void setId(OrderItemPK id) {
        this.id = id;
    }
    
    
    
}
