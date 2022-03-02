package entity;

import entity.Country;
import entity.Russia;
import entity.USA;

public class Main {
    public static void main(String[] args) {
        Russia one = new Russia("Россия", 1565456456,"Москва");
        Russia one2 = new Russia();
        USA two = new USA("США", 465456131,"Вашингтон");
        USA two2 = new USA();

        System.out.println(one.getLanguage() + "\nНазвание: " + one.getName()+ "\nВалюта: " + one.cash);
        System.out.println(one2.getLanguage() + "\nНазвание: " + one2.getName()+ "\nВалюта: " + one2.cash + "\nCity: " + one2.city + "\nPtople: " + one2.people);
        System.out.println(two.getLanguage() + "\nНазвание: " + two.getName()+ "\nВалюта: " + two.cash);
        System.out.println(two2.getLanguage() + "\nНазвание: " + two2.getName()+ "\nВалюта: " + two2.cash + "\nCity: " + two2.city + "\nPtople: " + two2.people);
    }
}
