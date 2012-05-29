package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<Item> allItems = Item.find("order by code asc").fetch();
        render(allItems);
    }
}