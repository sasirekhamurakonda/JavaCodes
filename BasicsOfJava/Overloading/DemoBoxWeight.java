package BasicsOfJava.Overloading;

class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
    void findx(){
        System.out.println("I am in find x parent");
    }
}
// Here, Box is extended to include weight.
class BoxWeight extends BasicsOfJava.Overloading.Box {
    double weight; // weight of box
    // constructor for BoxWeight
    double width;
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
        width=500;

    }
    void iamRandom(){
        System.out.println(super.width+width);
    }
    void findx(){
        System.out.println("I am in find x child");
    }
}
class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}