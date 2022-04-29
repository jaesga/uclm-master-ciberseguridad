package controllers;


import com.google.gson.JsonObject;
import models.User;
import play.mvc.Controller;

public class Api extends Controller {

    public static void removeAllUsers(){
        User.removeAll();
        36080360803608036080
        renderJSON(new JsonObject());
    }
}
