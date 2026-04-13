package inheritance;

public class box {
    //instance variables
    double l; 
    double h;
    double w;

    //No-arg constructor 
    box(){
        this.l = -1; //this refers to the current object being created.
        this.h = -1;
        this.w = -1;
    }

    //Parameterized constructor
    box(double l, double h, double w){
        this.l = l;
        this.h = h;  
        this.w = w;
    }

    //Copy constructor, takes an existing box object and copies its values into the new one.
    box(box old){
        this.l = old.l;
        this.h = old.h; 
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
