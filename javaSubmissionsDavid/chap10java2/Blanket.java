package chap10java2;

public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;

    // Constructor
    public Blanket() {
        this.size = "Twin";
        this.color = "white";
        this.material = "cotton";
        this.price = 30.00;
    }

    // Setters
    public void setSize(String size) {
        this.size = size;
        // Validate and apply logic
        switch (size.toLowerCase()) {
            case "twin":
            case "double":
            case "queen":
            case "king":
                updatePrice();
                break;
            default:
                resetToDefault();
                break;
        }
    }

    public void setMaterial(String material) {
        this.material = material;
        // Validate and apply logic
        switch (material.toLowerCase()) {
            case "cotton":
            case "wool":
            case "cashmere":
                updatePrice();
                break;
            default:
                resetToDefault();
                break;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Helpers
    private void resetToDefault() {
        this.size = "Twin";
        this.color = "white";
        this.material = "cotton";
        updatePrice(); // Recalc to base $30
    }

    // Recalculates price based on current state
    protected void updatePrice() {
        this.price = 30.00; // Base

        // Size premiums
        if (this.size.equalsIgnoreCase("Double")) {
            this.price += 10.00;
        } else if (this.size.equalsIgnoreCase("Queen")) {
            this.price += 25.00;
        } else if (this.size.equalsIgnoreCase("King")) {
            this.price += 40.00;
        }

        // Material premiums
        if (this.material.equalsIgnoreCase("Wool")) {
            this.price += 20.00;
        } else if (this.material.equalsIgnoreCase("Cashmere")) {
            this.price += 45.00;
        }
    }

    @Override
    public String toString() {
        return "Blanket Type: " + size + " | Color: " + color + 
               " | Material: " + material + " | Price: $" + price;
    }
}