package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> cartmap=new HashMap<Product,Integer>();

    public void add(Product product,int quantity){
        Integer existingQuantity=cartmap.getOrDefault(product,0);
        cartmap.put(product,existingQuantity+quantity);
    }
    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> productIntegerEntry : cartmap.entrySet()) {
            System.out.println("상품 = "+productIntegerEntry.getKey()+" 수량 = "+productIntegerEntry.getValue());

        }


    }
    public void minus(Product product,int quantity){
        Integer existingQuantity=cartmap.getOrDefault(product,0);
        cartmap.put(product,existingQuantity-quantity);

    }
}
