package prj.shtelo.inminic.server;

import java.awt.image.BufferedImage;

class Player {
    private double x, y;
    private String name;

    private BufferedImage[] images;

    private int form;

    Player(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;

        init();
    }

    private void init() {
        form = 0;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return x + "\t" + y + "\t" + name;
    }
}
