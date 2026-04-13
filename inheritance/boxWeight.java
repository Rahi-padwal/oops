package inheritance;

public class boxWeight extends box {
    double wt;
    
    public boxWeight(){
        this.wt = 5;
    }

    public boxWeight(double l, double h, double w, double wt){
        super(l , h, w); //call the parent class constructor
        //used to initialize values present in parent class.
        this.wt = wt;
    }
}
