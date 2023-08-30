package uz.pdp.One;

import java.util.HashMap;
import java.util.Iterator;

public class ExampleOne {
    public static void main(String[] args) {
//        1.	Nomi(name), navi(type) va chegirma(sale) fieldlari bor bo’lgan Fruit klassini yarating
//        2.	Mevalar  va  ularning narxlaridan map yarating.
//        3.	Jadvalda berilgan barcha mevalarni mapga joylashtiring
//        4.	Mapda nechta meva borligini ekranga chiqazing
//        5.	Barcha mevalarni narxlari bilan ekranga chiqazing
        Fruit fruit1 = new Fruit("Anor", "quva", 15000);
        Fruit fruit2 = new Fruit("Anor", "Tuya tish", 16000);
        Fruit fruit3 = new Fruit("Anor", "Surxon", 14000);
        Fruit fruit4 = new Fruit("Olma", "Besh yuldiz", 9000);
        Fruit fruit5 = new Fruit("Olma", "Golden", 8000);
        Fruit fruit6 = new Fruit("Olma", "Qirmizi", 15000);
        Fruit fruit7 = new Fruit("Olma", "Semerenka", 6000);
        Fruit fruit8 = new Fruit("Banan 5% chegirma", "Bananza", 28500);
        Fruit fruit9 = new Fruit("Banan  5% chegirma", "Boshqa", 19000);
        Fruit fruit10 = new Fruit("Shaftoli", "Tukli", 6000);
        Fruit fruit11 = new Fruit("Shaftoli", "Tuksiz", 8000);
        Fruit fruit12 = new Fruit("Kivi", "Import", 21000);
        Fruit fruit13 = new Fruit("Kivi", "Mahalliy", 20000);
        Fruit fruit14 = new Fruit("Qulupnay", "Yirik", 18000);
        Fruit fruit15 = new Fruit("Qulupnay", "Mayda", 9000);
        Fruit fruit16 = new Fruit("Uzum", "Qora", 10000);
        Fruit fruit17 = new Fruit("Uzum", "Husayni", 15000);
        Fruit fruit18 = new Fruit("O’rik", "Surxon", 3000);
        Fruit fruit19 = new Fruit("O’rik", "Oq", 2000);
        Fruit fruit20 = new Fruit("O’rik", "Yirik", 12000);

        HashMap<String, Double> fruitHashMap = new HashMap<>();
        fruitHashMap.put(fruit1.getName()+"->"+fruit1.getType(), fruit1.getSale());
        fruitHashMap.put(fruit2.getName()+"->"+fruit2.getType(), fruit2.getSale());
        fruitHashMap.put(fruit3.getName()+"->"+fruit3.getType(), fruit3.getSale());
        fruitHashMap.put(fruit4.getName()+"->"+fruit4.getType(), fruit4.getSale());
        fruitHashMap.put(fruit5.getName()+"->"+fruit5.getType(), fruit5.getSale());
        fruitHashMap.put(fruit6.getName()+"->"+fruit6.getType(), fruit6.getSale());
        fruitHashMap.put(fruit7.getName()+"->"+fruit7.getType(), fruit7.getSale());
        fruitHashMap.put(fruit8.getName()+"->"+fruit8.getType(), fruit8.getSale());
        fruitHashMap.put(fruit9.getName()+"->"+fruit9.getType(), fruit9.getSale());
        fruitHashMap.put(fruit10.getName()+"->"+fruit10.getType(), fruit10.getSale());
        fruitHashMap.put(fruit11.getName()+"->"+fruit11.getType(), fruit11.getSale());
        fruitHashMap.put(fruit12.getName()+"->"+fruit12.getType(), fruit12.getSale());
        fruitHashMap.put(fruit13.getName()+"->"+fruit13.getType(), fruit13.getSale());
        fruitHashMap.put(fruit14.getName()+"->"+fruit14.getType(), fruit14.getSale());
        fruitHashMap.put(fruit15.getName()+"->"+fruit15.getType(), fruit15.getSale());
        fruitHashMap.put(fruit16.getName()+"->"+fruit16.getType(), fruit16.getSale());
        fruitHashMap.put(fruit17.getName()+"->"+fruit17.getType(), fruit17.getSale());
        fruitHashMap.put(fruit18.getName()+"->"+fruit18.getType(), fruit18.getSale());
        fruitHashMap.put(fruit19.getName()+"->"+fruit19.getType(), fruit19.getSale());
        fruitHashMap.put(fruit20.getName()+"->"+fruit20.getType(), fruit20.getSale());
        System.out.println(fruitHashMap.size());
Iterator<String>iterator=fruitHashMap.keySet().iterator();
while (iterator.hasNext())
{
    String s= iterator.next();
    System.out.println(s+":"+fruitHashMap.get(s));
}
    }
}
