package uz.pdp.One;

import java.util.HashMap;

public class Fruit {
//    1.	Nomi(name), navi(type) va chegirma(sale) fieldlari bor bo’lgan Fruit klassini yarating
//2.	Mevalar  va  ularning narxlaridan map yarating.
//            3.	Jadvalda berilgan barcha mevalarni mapga joylashtiring
//4.	Mapda nechta meva borligini ekranga chiqazing
//5.	Barcha mevalarni narxlari bilan ekranga chiqazing
    private String name;
    private String type;
    private double sale;

    public Fruit(String name, String type, double sale) {
        this.name = name;
        this.type = type;
        this.sale = sale;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

}
