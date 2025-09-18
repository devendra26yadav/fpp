package Assignments.Assignment7.problem4;

import java.util.Random;

public class Ticket {
    private final int id;
    private  String description;
    public Ticket(int ID,String description){
       this.id=ID;
       this.description=description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    @Override
    public String toString(){
        return "Ticket[ ID :"+id+", Description :"+description+" ]";
    }
}
