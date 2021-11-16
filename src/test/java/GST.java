public class GST {
    private double gst;
    public int isGstApplicable(Product product)
    {
        if (product instanceof FoodProducts)
            return 0;
        return 1;
    }
    public double getGstOfProduct(Product product)
    {
        if(product instanceof CosmeticProducts)
            gst=10;
        if(product instanceof GoldProducts)
            gst=20;
        if (product instanceof FoodProducts)
            gst=0;
        return gst;
    }
}
