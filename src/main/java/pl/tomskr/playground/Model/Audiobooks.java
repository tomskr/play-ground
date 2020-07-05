package pl.tomskr.playground.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Audiobooks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String Name;
    String Author;

    public Audiobooks() {
    }

    public Audiobooks(String name, String author) {
        Name = name;
        Author = author;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

