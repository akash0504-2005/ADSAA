import java.util.Arrays;
import java.util.Comparator;


class Item {
    int value;
    int weight;
    
    
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

  
    public double getRatio() {
        return (double) value / weight;
    }
}

public class Knapsack {

    
    public static double getMaxValue(Item[] items, int capacity) {
        
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item item1, Item item2) {
                return Double.compare(item2.getRatio(), item1.getRatio());
            }
        });

        double totalValue = 0.0;  
        for (Item item : items) {
            if (capacity == 0) {
                break;  
            }

            
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
              
                totalValue += item.value * ((double) capacity / item.weight);
                capacity = 0;  
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
      
        Item[] items = {
            new Item(60, 10),  
            new Item(100, 20), 
            new Item(120, 30)  
        };

        int capacity = 50;  

        double maxValue = getMaxValue(items, capacity);

        System.out.println("Maximum value in the knapsack: " + maxValue);
    }
}


output:-
  Maximum value in the knapsack: 240.0

