package ua.kpi.knight;


import java.util.ArrayList;
import ua.kpi.ammuntions.Ammunition;
import ua.kpi.knight.Knight;
import ua.kpi.shop.ArmoryShop;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lor1an
 */
public class KnightStuff {

    public static void main(String[] args) {
        Knight knight = new Knight("Duke", new ArrayList<Ammunition>(), "Roland", 29);
        ArmoryShop shop = new ArmoryShop();
        shop.buy(knight.getAmmunition(), "Sword", "Shield", "Lance", "Armor", "Helm");
        System.out.println(knight);
        knight.sortAmmunitionsByWeight();
        System.out.println(knight);
        ArrayList<Ammunition> f = knight.findAmmunitionsByCost(100, 201);
        StringBuilder k = new StringBuilder();
        if (!f.isEmpty()) {
            for (Ammunition ammunition : f) {
                k.append(new StringBuilder(ammunition.toString()));
            }
        }
        System.out.println(k);
    }
}
