package belhard.j18.hw;

public class Les2HW {
    public static void main(String[] args) {
        //task1
        for (int i = 0 ; i <= 100 ; i++){
            System.out.println("Остаток от деления i на 10 :" + (i % 10));
            System.out.println("Меньше 100? :" + (i<= 100));
        }
        //task2
        double pi = 3.14;
        double rad = 45;
        System.out.println("Длина окружности =" + (2*pi*rad));
        System.out.println("Площадь :" + (pi*rad*rad));

        //task3
        double rX = 5 , rY = 7 , dX = 3 , dY = 5 , sX = 0 , sY = 0 , XY = 0;
        if (rX > dX ) {

            sX = rX-dX;
        } else { sX = dX - rX;}
        if (rY > dY ) {

            sY= rY-dY;
        }    else { sY = dY - rY;}
        XY = sY*sY + sX*sX ;
        if (XY <= rad){
            System.out.println("Принадлежит окружности");
        } else {
            System.out.println("Не принадлежит окружности");
        }
    }
}
