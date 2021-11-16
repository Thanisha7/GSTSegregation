public class Price {
    private double unitPrice;
    public double getUnitPrice(Product product)
    {
        if(product instanceof CosmeticProducts)
            unitPrice=1000;
        if(product instanceof GoldProducts)
            unitPrice=5000;
        if (product instanceof FoodProducts)
            unitPrice=500;
        return unitPrice;
    }
    public double calculateTotalPrice(double gst,double unitPrice)
    {
        double totalPrice = unitPrice + (unitPrice*gst)/100;
        return totalPrice;
    }
}
