public class DemoSalesperson2 {
    public static void main(String args[])
    {
        Salesperson[] salesperson = new Salesperson[10];

        for (int i = 0; i < salesperson.length; ++i)
        {
            salesperson[i] = new Salesperson(111, 25000.0);
            salesperson[i].setId(salesperson[i].getId() + i);
            salesperson[i].setSales(salesperson[i].getSales() + (i * 5000));
            System.out.println("Salesperson " + (i + 1) + " ID number is " + salesperson[i].getId() + " annual sales amount is $" + salesperson[i].getSales());
        }
    }
}
