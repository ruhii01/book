
class BookSales{
    String sales_name;
    int no_of_sales;
    String saler_id;

    BookSales(String sales_name, int no_of_sales, String saler_id){
        this.sales_name = sales_name;
        this.no_of_sales = no_of_sales;
        this.saler_id = saler_id;
    }

    public void show(){
        System.out.println("Sales Name: " +sales_name);
        System.out.println("No of Sales: " +no_of_sales);
        System.out.println("Saler ID: " +saler_id);
    }
}

