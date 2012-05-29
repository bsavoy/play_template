package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<Item> allItems = Item.all().fetch();
        render(allItems);
    }

    public static void addItem(String name, String comment) {
    	new Item(name, comment).save();
    	index();
    }
}