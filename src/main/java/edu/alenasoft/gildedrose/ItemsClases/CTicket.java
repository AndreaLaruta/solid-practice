/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.alenasoft.gildedrose.ItemsClases;

import edu.alenasoft.gildedrose.Interfaces.IItem;
import edu.alenasoft.gildedrose.Item;

/**
 *
 * @author Andre
 */
public class CTicket extends Item implements IItem{
    
    public CTicket(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
