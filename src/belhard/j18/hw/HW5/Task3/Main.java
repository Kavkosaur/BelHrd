package belhard.j18.hw.HW5.Task3;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(9);

        Clothes clothes1 = new Clothes("T-shirt");
        Clothes clothes2 = new Clothes("Jacket");
        Clothes clothes3 = new Clothes("Shirt");

        wardrobe.Put(4,clothes1);
        wardrobe.Put(4,clothes2);
        wardrobe.Throw(clothes3);
        wardrobe.Take(4);
        wardrobe.Throw(clothes1);
        wardrobe.Throw(clothes2);
        wardrobe.Throw(clothes3);
        wardrobe.WhatsInside();
    }
}
