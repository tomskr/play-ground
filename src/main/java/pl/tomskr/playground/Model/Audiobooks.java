package pl.tomskr.playground.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Audiobooks {

    @Id
    Long Id;

    String Name;
    String Author;



}

