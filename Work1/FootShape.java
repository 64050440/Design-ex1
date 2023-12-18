import java.util.Scanner;

public class FootShape {
    private Foot foot;

    public void DrawEllipse() {
        foot = new Ellipse();

    }

    public void DrawRectangle() {
        foot = new Rectangle();

    }

    public String draw() {
        return foot.draw();
    }

    public static void main(String[] args) {

        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                app.DrawEllipse();
                break;
            case 2:
                app.DrawRectangle();
                break;

        }
        System.out.println(app.draw());
    }

}