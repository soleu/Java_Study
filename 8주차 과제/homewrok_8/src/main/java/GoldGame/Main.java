package GoldGame;

public class Main extends Sprite {

    void move(char c) {
        if (c == 'h') x--;
        else if (c == 'j') y--;
        else if (c == 'k') y++;
        else if (c == 'l') x++;
    }
}