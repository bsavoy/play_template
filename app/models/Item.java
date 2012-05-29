package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Item extends Model {
 
    public String name;
    public int code;
    public int quantity;
    
    public Item(String name, int code, int quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
    }
}