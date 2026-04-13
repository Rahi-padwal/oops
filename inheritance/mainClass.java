package inheritance;

public class mainClass {
    public static void main(String[] args) {
        
    //box box1 = new box(4.6, 7.9, 8.2);
    //box box2 = new box(box1);
    //System.out.println(box1.l + " " + box1.h + " " + box1.w);

    boxWeight box3 = new boxWeight();
    System.out.println(box3.h + " " + box3.wt); //boxWeight only defines wt, 
    // but because it extends box, it automatically gets l, h, w from the parent.

    boxWeight box4 = new boxWeight(2, 5, 7, 9);
    System.out.println(box4.l + " " + box4.wt);



}
}



//use of super:
//class box {
//    double w = 10.0;   // parent's w
//}

//class boxWeight extends box {
//    double w = 99.0;   // child's OWN w — shadows parent's w

//    void show() {
//        System.out.println(this.w);   // 99.0 → current class (boxWeight)
//        System.out.println(super.w);  // 10.0 → parent class (box)
//    }
//}