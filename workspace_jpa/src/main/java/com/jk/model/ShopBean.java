package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>项目名称：workspace
 * 类名称：ShopBean
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 20:46
 * 修改人：张利瑶
 * 修改时间：2019/4/11 20:46
 * 修改备注：
 * @version </pre>
 */
@Entity
@Table(name="t_shop")
public class ShopBean implements Serializable {

    private static final long serialVersionUID = 3059514541134066095L;
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer price;
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd ")
    private Date riqi;
    private Integer statue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }


    @Override
    public String toString() {
        return "ShopBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", riqi=" + riqi +
                ", statue=" + statue +
                '}';
    }
}
