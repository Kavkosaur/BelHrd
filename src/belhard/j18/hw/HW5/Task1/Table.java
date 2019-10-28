package belhard.j18.hw.HW5.Task1;

public class Table {
    TableType type;
    int legs,c;
    double height, price;
    Material material;

    public Table (TableType type, int legs, double height,double price , Material material){
       this.type = type;
       this.legs = legs;
       this.height = height;
       this.price = price;
       this.material = material;
       c++;

    }
    public Table (int legs, double height,double price , Material material){
        this.type = TableType.Rectangle;
        this.legs = legs;
        this.height = height;
        this.price = price;
        this.material = material;
        c++;

    }
    public Table ( double height,double price , Material material){
        this.type = TableType.Rectangle;
        this.legs = 4;
        this.height = height;
        this.price = price;
        this.material = material;
        c++;

    }
    public Table (double height,double price){
        this.type = TableType.Rectangle;
        this.legs = 4;
        this.height = height;
        this.price = price;
        this.material = Material.Other;
        c++;

    }
    public int getCounter() {
        return c;
    }

    @Override
    public String toString() {
        return "Table is made of " + material + "\n Has " + legs +" legs" + "\n Shape : "+type +"\n Height :" + height + "\n Price :" + price + "\n\n\n";
    }
}




