package controllers;


import com.google.gson.JsonObject;
import models.User;
import play.mvc.Controller;

public class Api extends Controller {

    public static void removeAllUsers(){
        User.removeAll();
        System.out.println("User removed");
        renderJSON(new JsonObject());
    }
}
