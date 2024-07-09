package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item>list=new ArrayList<>();



    public void addItem(Item item){
        list.add(item);
    }
    public void displayItem(){
        System.out.println("상품 출력");
        for (Item item : list) {
            System.out.println("상품 이름: "+item.getName()+" , 상품 가격: "+item.getPrice());

        }
        int total=0;
        for (Item item : list) {
            total+=item.getTotalPrice();

        }
        System.out.print("상품 총합:");
        System.out.println(total);

    }
}
