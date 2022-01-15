package com.example.learn.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "english")
public class English {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "letter")
    private String letter;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "English{" +
                "id=" + id +
                ", letter='" + letter + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
