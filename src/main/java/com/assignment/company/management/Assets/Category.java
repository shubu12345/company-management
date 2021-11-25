package com.assignment.company.management.Assets;



import javax.persistence.*;

@Entity
public class Category {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public long Id ;

    @Column(name = "name")
    private String Name ;

    @Column(name = "description")
    private String Description ;

    public Category() {

    }


    @Override
    public String toString() {
        return "Category{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public Category(long id, String name, String description) {
        Id = id;
        Name = name;
        Description = description;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
