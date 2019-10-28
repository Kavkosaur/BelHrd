package belhard.j18.hw.HW5.Task3;

public class Wardrobe {
    int amm;
    Shelf shelves[];

    public Wardrobe(int amm) {
        this.amm = amm;
        for (int i = 0; i < amm - 1; i++) {
            Shelf newShelf = new Shelf();
            this.shelves[i] = newShelf;

        }

    }

    public void Put(int x, Clothes clothes) {
        if (x <= amm - 1) {
            if (clothes.in != ClInside.In) {
                if (shelves[x].in != Insides.Something) {
                    shelves[x].in = Insides.Something;
                    shelves[x].item = clothes.name;
                    clothes.in = ClInside.In;

                } else {
                    System.out.println("Полка занята");
                }

            } else {
                System.out.println("Эта вещь уже где то лежит");
            }
        } else {
            System.out.println("Такой полки то нет");
        }

    }

    public void Throw(Clothes clothes) {
        if (clothes.in != ClInside.In) {
            for (int i = 0; i < this.amm - 1; i++) {
                if (shelves[i].in != Insides.Something) {
                    shelves[i].in = Insides.Something;
                    shelves[i].item = clothes.name;
                    clothes.in = ClInside.In;

                } else {
                    System.out.println("Полка занята");
                }
            }

        } else {
            System.out.println("Эта вещь уже где то лежит");
        }

    }

    public void Take(int x) {
        if (x <= amm - 1) {
            if (shelves[x].in == Insides.Something) {
                shelves[x].in = Insides.Nothing;
                shelves[x].item = "";


            } else {
                System.out.println("Взят предмет 'пустота'");
            }

        } else {
            System.out.println("Вы всматриваетесь в пустоту под шкафом , в поисках еще одной полки");
        }
    }

    public void WhatsInside() {
        for (int i = 0; i < amm - 1; i++) {
            if (shelves[i].in == Insides.Something) {
                System.out.println("В полке номер " + i + " имеется предмет " + shelves[i].item);
            }
        }
    }
}
