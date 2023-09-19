package com.CRUDOperation.Project.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class BookEntity {

    @Id
    private Integer id;

    private String author;

    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public BookEntity() {
    }

    public BookEntity(Integer id, String author, Integer price, String name) {
        this.id = id;
        this.author = author;
        this.price = price;
        this.name = name;
    }

}
