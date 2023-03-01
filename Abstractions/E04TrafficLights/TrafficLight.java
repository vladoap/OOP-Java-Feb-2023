package Abstractions.E04TrafficLights;


public class TrafficLight {

    private Color color;


    public TrafficLight(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    public void changeColor() {
       switch (color) {
           case RED:
               color = Color.GREEN;
               break;
           case YELLOW:
               color = Color.RED;
               break;
           case GREEN:
               color = Color.YELLOW;
               break;
       }
    }
}
