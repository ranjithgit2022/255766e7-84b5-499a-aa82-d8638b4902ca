package hackerrank;

import java.util.*;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    HashMap<Furniture,Integer> furnitureMap = null;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        furnitureMap = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        furnitureMap.put(type,furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return furnitureMap;
    }

    public float getTotalOrderCost() {
        float totalValue = 0f;
        for (Map.Entry<Furniture, Integer> entry : furnitureMap.entrySet()) {
            totalValue = totalValue +  entry.getValue() * entry.getKey().cost();
        }// TODO: Complete the method
        return totalValue;
    }

    public int getTypeCount(Furniture type) {
        return furnitureMap.get(type);
    }

    public float getTypeCost(Furniture type) {
        return type.cost();
    }

    public int getTotalOrderQuantity() {
        Collection<Integer> values = furnitureMap.values();
        return values.stream().reduce(0, (a, b) -> a + b);
    }
}
