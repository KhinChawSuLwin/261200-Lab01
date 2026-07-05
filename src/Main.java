public class Main {
    public static void main(String[] args) {
        Turtle july = new Turtle();

        july.bgcolor("light blue");

        july.speed(10);
        july.up();
        july.setPosition(-120, 100);
        july.down();
        july.penColor("white");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                july.forward(6);
                july.left(10);
            }
            july.right(40);
        }

        july.up();
        july.setPosition(-200, -150);
        july.setDirection(0);
        july.down();

        for (int i = 0; i < 40; i++)
        {
            if (i % 3 == 0)
            {
                july.penColor("darkgreen");
            } else if (i % 3 == 1) {
                july.penColor("green");
            } else {
                july.penColor("forestgreen");
            }

            int bladeHeight = 60 + (int)(Math.random() * 40);
            int swayAngle = 5 + (int)(Math.random() * 10);

            july.left(90 - swayAngle);
            july.forward(bladeHeight);
            july.right(160);
            july.forward(bladeHeight);
            july.left(70 + swayAngle);
            july.up();
            july.forward(12);
            july.down();
        }
    }
}