public class Salesperson {
    private int id;
    private double sales;
    Salesperson(int idNum, double salesAmt)
    {
        id = idNum;
        sales = salesAmt;
    }
    public int getId()
    {
        return id;
    }
    public double getSales()
    {
        return sales;
    }
    public void setId(int idNum)
    {
        id = idNum;
    }
    public void setSales(double salesAmt)
    {
        sales = salesAmt;
    }
}
