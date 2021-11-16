import org.testng.Assert;
import org.testng.annotations.Test;

public class EligibleProducts {
    int eligibleProducts=0;
    double totalPriceOfCosmeticProducts=0;
    double totalPriceOfFoodProducts=0;
    double totalPriceOfGoldProducts=0;

    @Test
    public void allEligibleProducts() {

        CosmeticProducts cosmeticProducts = new CosmeticProducts();
        FoodProducts foodProducts = new FoodProducts();
        GoldProducts goldProducts = new GoldProducts();
        int cosmeticProductsFlag=cosmeticProducts.isGstApplicableForProduct(cosmeticProducts);
        int foodProductsFlag=foodProducts.isGstApplicableForProduct(foodProducts);
        int goldProductsFlag=goldProducts.isGstApplicableForProduct(goldProducts);
        if (cosmeticProductsFlag>0) {
            totalPriceOfCosmeticProducts = cosmeticProducts.getTotalPrice(cosmeticProducts);
            if (totalPriceOfCosmeticProducts>2000)
                eligibleProducts++;

        }
        if (foodProductsFlag>0)
        {
            totalPriceOfFoodProducts = foodProducts.getTotalPrice(foodProducts);
            if (totalPriceOfFoodProducts>2000)
                eligibleProducts++;
        }
        if (goldProductsFlag >0)
        {
            totalPriceOfGoldProducts = goldProducts.getTotalPrice(goldProducts);
            if (totalPriceOfGoldProducts>2000)
                eligibleProducts++;
        }
        Assert.assertEquals(eligibleProducts,1);

    }

}

