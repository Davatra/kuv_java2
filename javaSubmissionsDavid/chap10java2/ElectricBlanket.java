package chap10java2;

public class ElectricBlanket extends Blanket {
    private int heatSettings;
    private boolean hasAutoShutoff;

    // Constructor
    public ElectricBlanket() {
        super(); // Sets Twin, white, cotton, $30
        this.heatSettings = 1;
        this.hasAutoShutoff = false;
    }

    // Setters
    public void setHeatSettings(int heatSettings) {
        if (heatSettings >= 1 && heatSettings <= 5) {
            this.heatSettings = heatSettings;
        } else {
            this.heatSettings = 1;
        }
    }

    public void setHasAutoShutoff(boolean hasAutoShutoff) {
        this.hasAutoShutoff = hasAutoShutoff;
        updatePrice(); // Trigger recalc
    }

    // Override price logic to include electric features
    @Override
    protected void updatePrice() {
        // Run parent logic first (sets base + size/mat premiums)
        super.updatePrice(); 
        
        if (hasAutoShutoff) {
            this.price += 5.75;
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               " | Settings: " + heatSettings + 
               " | Auto Shutoff: " + (hasAutoShutoff ? "Yes" : "No");
    }
}