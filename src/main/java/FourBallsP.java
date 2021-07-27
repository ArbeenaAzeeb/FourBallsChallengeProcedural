import processing.core.PApplet;

public class FourBallsP extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 20;
    int [] x = {0,0,0,0,0};
    int i;

    public static void main(String[] args){
        PApplet.main("FourBallsP", args);
    }

    @java.lang.Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @java.lang.Override
    public void draw() {
        for(i=1; i<5; i++) {
            ellipse(x[i], i * HEIGHT / 5, DIAMETER, DIAMETER);
            x[i] += i;
        }
    }
}
