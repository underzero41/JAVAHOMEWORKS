package Homework3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Good> goods = getGood();
        Good currentMaxFirstGradeGood = null;
        Double maxFirstGradeGood = -1.00;
        Good currentMaxSecondGradeGood = null;
        Double maxSecondGradeGood = -1.00;

        for (Good good: goods) {
            if(good.getSort().contains("high") && good.getCategory() == 1)
            {
                if(maxFirstGradeGood < good.getPrice()){
                    maxFirstGradeGood =good.getPrice();
                    currentMaxFirstGradeGood = good;
                }
            }
            else if (good.getSort().contains("high") && good.getCategory() == 2) {
                if(maxSecondGradeGood < good.getPrice()){
                    maxSecondGradeGood = good.getPrice();
                    currentMaxSecondGradeGood = good;
                }
            }

        }
        System.out.println(currentMaxFirstGradeGood.toString());
        System.out.println(currentMaxSecondGradeGood.toString());
        }

    /**
     *
      * @return goods from the list
     */
    private static ArrayList<Good> getGood() {
        ArrayList<Good> goods = new ArrayList<Good>();
        goods.add(new Good("buckwheat", 56.00, "high", 1));
        goods.add(new Good("buckwheat", 50.00, "middle",1));
        goods.add(new Good("buckwheat", 45.50, "low", 2));
        goods.add(new Good("rice", 46.00, "high", 2));
        goods.add(new Good("rice", 40.00, "middle", 1));
        goods.add(new Good("rice", 35.50, "low", 1));
        goods.add(new Good("oatmeal", 36.00, "high", 1));
        goods.add(new Good("oatmeal", 30.00, "middle", 2));
        goods.add(new Good("oatmeal", 25.50, "low", 1));
        return goods;
    }
}
