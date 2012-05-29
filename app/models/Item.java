package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Item extends Model {
 
    public String name;
    public String comment;
    
    public Item(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
}