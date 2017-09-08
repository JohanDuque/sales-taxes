package com.johanduke.sales.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void ifIPassNoParametersIgetAnItemWithDefaultVlues(){
        Item item = new Item();

        assertEquals(item.getCategory(), ItemCategory.ANY_GOOD);
        assertEquals(item.getName(), "");
        assertEquals(item.getPrice(), 0, 0);
        assertEquals(item.isImported(), false);
    }

    @Test
    public void ifIPassOnlyNameAndPriceOtherParametersWillBeDefaults(){
        String name = "banana";
        double price = 12.20;

        Item item = new Item(name, price);

        assertEquals(item.getCategory(), ItemCategory.ANY_GOOD);
        assertEquals(item.getName(), name);
        assertEquals(item.getPrice(), price, 0);
        assertEquals(item.isImported(), false);
    }

    @Test
    public void ifIPassCategoryyNameAndPriceOtherParametersWillBewDefault(){
        String name = "Steppen Wolf";
        double price = 15.23;
        ItemCategory category = ItemCategory.BOOKS;

        Item item = new Item(category, name, price);

        assertEquals(item.getCategory(), category);
        assertEquals(item.getName(), name);
        assertEquals(item.getPrice(), price, 0);
        assertEquals(item.isImported(), false);
    }

    @Test
    public void ifIPassIsImportedyNameAndPriceOtherParametersWillBewDefault(){
        String name = "Steppen Wolf";
        double price = 15.23;
        boolean isImported = true;

        Item item = new Item(isImported, name, price);

        assertEquals(item.getCategory(), ItemCategory.ANY_GOOD);
        assertEquals(item.getName(), name);
        assertEquals(item.getPrice(), 15.25, 0.02);
        assertEquals(item.isImported(), isImported);
    }

    @Test
    public void fullParametersConstructorTest(){
        String name = "Aspirin";
        double price = 1.53;
        boolean isImported = true;
        ItemCategory category = ItemCategory.MEDICAL;

        Item item = new Item(isImported, category, name, price);

        assertEquals(item.getCategory(), category);
        assertEquals(item.getName(), name);
        assertEquals(item.getPrice(), price, price);
        assertEquals(item.isImported(), isImported);
    }

}