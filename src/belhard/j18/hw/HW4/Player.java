package belhard.j18.hw.HW4;

public class Player {

    public String name ;
    public int x,y;
    public double d1 = 0;

    public Player(String name, int x , int y) {
        this.name = name;
        this.x=x;
        this.y = y;
        System.out.println(this.name + " Up-to-warp coordinates: x=" + this.x + ", y=" +this.y );

    }

    public void warp (int x1 , int y1){
        this.x=x+x1;
        this.y = y+y1;
        double d = 0;

        if (x1!=0 && y1!=0) {
            System.out.println("Warp Successful");
            d = x1 * x1 + y1 * y1;
            d = Math.sqrt(d);
        } else if (x1!=0) {
            System.out.println("Warp Successful");
            d = x1;
        } else if (y1!=0) {
            System.out.println("Warp Successful");
            d = y1;
        }
        else {
            System.out.println("Unable to warp on current position");
        }
        System.out.println("Warp distance " + d);
        this.d1 = this.d1 + d;
        System.out.println("Overall distance " + this.d1);
        System.out.println(this.name+" Up-to-warp coordinates: x=" + this.x + ", y=" +this.y );
    }



}
