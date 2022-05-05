package GoldGame;

class Monster extends Sprite {

    Monster() {
        while (true) {
            x = (int) (Math.random() * 20);
            y = (int) (Math.random() * 10);
            if (x != 0 && y != 0 && x != 19 && y != 9) break;
        }
    }

    void move() {
        while (true) {
            int randX = (Math.random() - 0.5) > 0 ? 1 : -1;
            int randY = (Math.random() - 0.5) > 0 ? 1 : -1;
            if (randX + x != 0 && randY + y != 0 && randX + x != 19 && randY + y != 9) {
                x += randX;
                y += randY;
                break;
            }
        }

    }

    @Override
    void move(char c) {
    }
}
