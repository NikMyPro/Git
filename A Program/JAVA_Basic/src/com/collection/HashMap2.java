package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap2 {

    public static void main(String[] args) {
        HashMap<String, Item> mainArray = new HashMap<String, Item>();
        HashMap<String, Item> level1 = new HashMap<String, Item>();
        HashMap<String, Item> level2 = new HashMap<String, Item>();
        HashMap<String, Item> bunchForLevel3 = new HashMap<String, Item>();
        HashMap<String, String> finalArray = new HashMap<String, String>();

        Item item1 = new Item();
        item1.id = "1";
        item1.name = "B";
        item1.GroupParentId = "0";
        mainArray.put(item1.id, item1);

        Item item2 = new Item();
        item2.id = "2";
        item2.name = "A";
        item2.GroupParentId = "0";
        mainArray.put(item2.id, item2);

        Item item3 = new Item();
        item3.id = "3";
        item3.name = "C";
        item3.GroupParentId = "1";
        mainArray.put(item3.id, item3);

        Item item4 = new Item();
        item4.id = "4";
        item4.name = "D";
        item4.GroupParentId = "2";
        mainArray.put(item4.id, item4);

        Item item5 = new Item();
        item5.id = "5";
        item5.name = "E";
        item5.GroupParentId = "1";
        mainArray.put(item5.id, item5);

        Item item6 = new Item();
        item6.id = "6";
        item6.name = "F";
        item6.GroupParentId = "3";
        mainArray.put(item6.id, item6);

        Item item7 = new Item();
        item7.id = "7";
        item7.name = "G";
        item7.GroupParentId = "3";
        mainArray.put(item7.id, item7);

        Item item8 = new Item();
        item8.id = "8";
        item8.name = "H";
        item8.GroupParentId = "3";
        mainArray.put(item8.id, item8);

        Item item9 = new Item();
        item9.id = "9";
        item9.name = "I";
        item9.GroupParentId = "6";
        mainArray.put(item9.id, item9);
        // -------------------------------------------------------------------------------------
        // Get parent level id from service
        level1.put(item1.id, item1); // 1,2
        level1.put(item2.id, item2);
        // -------------------------------------------------------------------------------------

        Iterator it = mainArray.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            Item currentItem = (Item) pairs.getValue();
            if (level1.containsKey(currentItem.getGroupParentId())) {
                level2.put(currentItem.getId(), currentItem); // 3,4,5
            } else {
                bunchForLevel3.put(currentItem.getGroupParentId(), currentItem); // ParentID 3,6 //5,6,7,8,9
            }
        }

        Iterator it1 = mainArray.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry pairs = (Map.Entry) it1.next();
            Item currentItem = (Item) pairs.getValue();
            if (level2.containsKey(currentItem.getId())) {
                if (!bunchForLevel3.containsKey(currentItem.getId())) {
                    finalArray.put(currentItem.getId(), "MainParent"); // 3,4,5
                }
            } else {
                if ((level2).containsKey(currentItem.getGroupParentId())) {
                    finalArray.put(currentItem.getId(), currentItem.getGroupParentId()); // ParentID 3,6 //5,6,7,8,9
                }
            }
        }

        /*Iterator it3 = finalArray.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry pairs = (Map.Entry) it3.next();
            Item currentItem = (Item) pairs.getValue();
            System.out.println(mainArray.get(currentItem.getId()).getName() + " " + mainArray.get(currentItem.getId()).getName());
        }*/
        
            Iterator it4 = finalArray.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry pairs = (Map.Entry) it4.next();
                String key = pairs.getKey().toString();
                String parentKey = pairs.getValue().toString();
                if (parentKey.equals("MainParent")) {
                    System.out.println(getName(mainArray, finalArray, key));
                }else{
                    System.out.println(getName(mainArray, finalArray,parentKey) + " " + getName(mainArray, finalArray,key));
                }
            }
        }

    public static String getName(HashMap<String, Item> mainArray, HashMap<String, String> finalArray,String key) {
        String name = "";
        Iterator it5 = finalArray.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry pairs2 = (Map.Entry) it5.next();
            name =mainArray.get(key).getName();
            break;
        }
        return name;
    }
}

/*7 3
6 3
5 1
4 2
8 3*/
