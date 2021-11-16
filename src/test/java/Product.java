import java.util.Date;

public abstract class Product {
    private String productName;
    private Date manufacturingDate;
    public Price price;
    public GST gst;
    Product()
    {
        price=new Price();
        gst=new GST();
    }
    public int isGstApplicableForProduct(Product product)
    {
        int isGstOfProduct=gst.isGstApplicable(product);
        return isGstOfProduct;
    }
    public double getTotalPrice(Product product)
    {
        double unitPrice=price.getUnitPrice(product);
        double gstTax=gst.getGstOfProduct(product);
        double totalPrice=price.calculateTotalPrice(gstTax,unitPrice);
        return  totalPrice;
    }

}
