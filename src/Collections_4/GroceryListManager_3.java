package Collections_4;
// Task 3: Categorizing Items
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_3 {


    Map<String, Double> groceryList = new HashMap<>();
    Map<String, String> groceryCategory = new HashMap<>();



    public void addItem(String item, double cost, String category){
        groceryList.put(item, cost);
        groceryCategory.put(item, category);
    }

    public void removeItem(String item){
        groceryList.remove(item);
        groceryCategory.remove(item);
    }

    public String displayList(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String item: groceryList.keySet()  ){
            result.append(index).append(". ").append(item).append("\n");
            index++;
        }

        return result.toString();
    }

    public double calculateTotalCost(){
        double total = 0;
        for(double cost: groceryList.values()){
            total += cost;
        }
        return total;
    }

    public String displayByCategory(String category){
        StringBuilder result = new StringBuilder();
        int index =1;

        for(String item: groceryList.keySet()){
            if(groceryCategory.get(item).equalsIgnoreCase(category)){
                result.append(index).append(". ").append(item).append(" - ").append(groceryCategory.get(item)).append("\n");
                index++;
            }

        }
        return result.toString();
    }



    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        GroceryListManager_3 manager = new GroceryListManager_3();
        System.out.println("Grocery List:");
        manager.addItem("apple" , 10.00, "Fruits");
        manager.addItem("banana" , 50.00, "Fruits");
        manager.addItem("orange" , 60.00, "Fruits");
        manager.addItem("Milk", 10.00, "Dairy" );
        manager.addItem("Bread" , 10.00, "Bakery");

        System.out.println(manager.displayList());

        System.out.println(manager.displayByCategory("Fruits"));
        System.out.println(manager.displayByCategory("Dairy"));

        System.out.println("Total cost " + manager.calculateTotalCost() + "€");

        System.out.println("Is \"Milk\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");
        System.out.println("Updated Grocery List:");
        System.out.println(manager.displayList());
        System.out.println("Total cost " + manager.calculateTotalCost() + "€");

    }
}
