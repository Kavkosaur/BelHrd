package belhard.j18.hw.HW5.Task1;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table (1.25,8999.99);

        Table table2 = new Table (TableType.Round,3,1.5,6999.99, Material.Metal);

        Table table3 = new Table (TableType.Other,8,1.12,10999.99, Material.Glass);

        Table table4 = new Table (1.6,3999.99, Material.Plastic);

        Table[] tables  = {table1,table2,table3,table4};

        for (int z = 0; z < tables.length ; z++){
            Table printTable = tables[z];
            //String f = toString(toString(printTable));
            //System.out.printf();
            System.out.println(tables[z]);

        }

    }



}
