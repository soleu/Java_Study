package GoldGame;

import java.util.Scanner;

public class GameManager {
    private static GameManager instance = new GameManager();
    Scanner sc = new Scanner(System.in);
    String map[][] = new String[10][20];
    Main main = new Main();
    Monster monster = new Monster();
    Gold gold = new Gold();

    public static GameManager getInstance() {
        return instance;
    }

    void markMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || j == 0 || i == map.length - 1 || j == map[i].length - 1) map[i][j] = "#";
                else if (main.y == i && main.x == j) map[i][j] = "@";
                else if (monster.y == i && monster.x == j) map[i][j] = "M";
                else if (gold.y == i && gold.x == j) map[i][j] = "G";
                else map[i][j] = " ";
            }
        }
    }

    void showMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    String moveMops() {
        String input = "";
        while (true) {
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
            input = sc.nextLine();
            if (input.equals("h") || input.equals("j")
                    || input.equals("k") || input.equals("l")) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

        int beforeX = main.x;
        int beforeY = main.y;

        main.move(input.charAt(0));

        if (main.x == 0 || main.x == 19 || main.y == 0 || main.y == 9) {
            System.out.println("벽에 막혀 갈 수 없습니다.");
            main.x = beforeX;
            main.y = beforeY;
        }
        monster.move();

        if (main.x == monster.x && main.y == monster.y) {
            return "die";
        } else if (main.x == gold.x && main.y == gold.y) {
            return "win";
        } else return "keep";
    }

    public void startGame() {
        while (true) {
            markMap();
            showMap();
            String result = moveMops();

            if (result.equals("win")) {
                System.out.println("[승리!] 황금을 획득하셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }
            if (result.equals("die")) {
                System.out.println("[패배] 몬스터에게 잡아먹혔습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }
            System.out.println("다음턴 진행");
        }
    }

}
