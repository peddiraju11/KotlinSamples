package interoperability.kotlinTojava;


import com.sun.istack.internal.Nullable;


public class Bus {

    public static int x = 5;

    private String color;
    private String model;
    private int year;

    public Bus(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void demoMethod(Runnable r) {

        new Thread(r).start();

    }

    public static String xString() {
        return "This is x: " + x++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public @Nullable
    String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void variableMethod(int num, String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void getIntArray(int[] theArray) {
        for (int i : theArray) {
            System.out.println("Here's the int: " + i);
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
