package AssignmentOnOOP.question14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null 
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
         //TODO change from null 
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
         //TODO change from -1 
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1 
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> itemNames = new ArrayList<>();

        for (Item item : regularItems) {
            itemNames.add(item.getName());
        }
        for (Item item : onSaleItems) {
            itemNames.add(item.getName());
        }
       return itemNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {

        List<Item> allItems = new ArrayList<>(onSaleItems);
        allItems.addAll(regularItems);

        for (Item item : allItems) {
            if(item.getCatalogNumber()==catalogNumber){
                return item.getPrice();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem item : onSaleItems) {
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        Iterator<OnSaleItem> onSaleItem = onSaleItems.listIterator();

        while (onSaleItem.hasNext()){
            OnSaleItem item = onSaleItem.next();
           if (item.getCatalogNumber()==catalogNumber){
               onSaleItem.remove();
           }

        }

        Iterator<Item> regularItem = regularItems.listIterator();

        while (regularItem.hasNext()){
            Item item = regularItem.next();

            if (item.getCatalogNumber()==catalogNumber){
                regularItem.remove();
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

//        for (OnSaleItem item : onSaleItems) {
//            if (item.getCatalogNumber()==catalogNumber){
//                item.setQuantity(item.getQuantity()-1);
//            }
//            if (item.getQuantity()<=0){
//
//            }
//        }
//        for (Item item : regularItems) {
//            if (item.getCatalogNumber()==catalogNumber){
//                item.setQuantity(item.getQuantity()-1);
//            }

        Iterator<OnSaleItem> onSaleItem = onSaleItems.listIterator();

        while (onSaleItem.hasNext()){
            OnSaleItem item = onSaleItem.next();

            if (item.getCatalogNumber()==catalogNumber){
               item.setQuantity(item.getQuantity()-1);
            }
            if (item.getQuantity()<=0){
                onSaleItem.remove();
            }

        }

        Iterator<Item> regularItem = regularItems.listIterator();

        while (regularItem.hasNext()){
            Item item = regularItem.next();

            if (item.getCatalogNumber()==catalogNumber){
                item.setQuantity(item.getQuantity()-1);
            }

            if (item.getQuantity()<=0){
                regularItem.remove();
            }
        }
    }
}
