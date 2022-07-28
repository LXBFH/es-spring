package com.atguigu.es;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author LIXUBO
 * @Date 2022-07-28 10:35
 * @description
 * @Version 1.0
 */
@Document(indexName = "product", shards = 3, replicas = 1)
public class Product {
    @Id
    private Long id;//商品唯一标识
    @Field(type = FieldType.Text)
    private String title;//商品名称
    @Field(type = FieldType.Keyword)
    private String category;//分类名称
    @Field(type = FieldType.Double)
    private Double price;//商品价格
    @Field(type = FieldType.Keyword, index = false)
    private String images;//图片地址

    public Product() {
    }

    public Product(Long id, String title, String category, Double price, String images) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.images = images;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return images
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置
     * @param images
     */
    public void setImages(String images) {
        this.images = images;
    }
    @Override
    public String toString() {
        return "Product{id = " + id + ", title = " + title + ", category = " + category + ", price = " + price + ", images = " + images + "}";
    }
}
