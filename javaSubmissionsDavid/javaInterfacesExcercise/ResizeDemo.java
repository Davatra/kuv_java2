package javaInterfacesExcercise;

public class ResizeDemo {
	 public static void main(String[] args) {
	     Rectangle rect = new Rectangle(100, 50);
	     
	     System.out.println("--- Initial State ---");
	     rect.displayDimensions();

	     System.out.println("\n--- Resizing ---");
	     rect.resizeWidth(150);
	     rect.resizeHeight(75);

	     System.out.println("\n--- Final State ---");
	     rect.displayDimensions();
	 }
}