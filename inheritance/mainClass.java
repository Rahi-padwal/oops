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
