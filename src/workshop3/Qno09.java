package workshop3;

 class Boxes {
     int width;
     int height;
     int depth;

     public Boxes(int length) {
         this.width = length;
         this.height = length;
         this.depth = length;
     }

     public Boxes(int width, int height, int depth) {
         this.width = width;
         this.height = height;
         this.depth = depth;
     }

     public Boxes() {
         this.width = 10;
         this.height = 8;
         this.depth = 12;
     }

     public void getVolume() {
         int volume = width * height * depth;
         System.out.println("Volume: " + volume);
     }
 }

public class Qno09 {
    Boxes cube = new Boxes(5);
    Boxes cuboid = new Boxes(5, 10, 15);
    Boxes defaultBox = new Boxes();

    public static void main(String[] args) {
        Qno09 mainInstance = new Qno09();
        mainInstance.getVolume();
    }

    public void getVolume() {
        cube.getVolume();
        cuboid.getVolume();
        defaultBox.getVolume();
    }

}
