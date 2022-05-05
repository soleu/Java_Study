package GoldGame;

public class Gold {
    int x, y;

    Gold() {
        while (true) {
            x = (int) (Math.random() * 20);
            y = (int) (Math.random() * 10);
            if (x != 0 && y != 0 && x != 19 && y != 9) break;
        }
    }
}
