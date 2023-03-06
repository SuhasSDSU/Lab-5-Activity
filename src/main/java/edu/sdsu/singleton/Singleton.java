package edu.sdsu.singleton;

public class Singleton {

    private static Singleton instance;
    private String message;
    private Singleton(String message){
        this.message = message;
    }
    public static Singleton getInstance(String message){
        if(instance == null){
          instance = new Singleton(message);
        }
        return instance;
    }

    public String getMessage(){
        return this.message;
    }

}
