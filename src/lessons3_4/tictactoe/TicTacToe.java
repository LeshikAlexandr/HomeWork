package lessons3_4.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] map = new String[3][3];

        // инициализация игрового поля
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = " ";
            }
        }

        // вывод пустого игрового поля
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print("|" + map[i][j] + "|" + "\t");
            }
            System.out.println();
        }

        String result = null;
        boolean keepGoing = true;
        int move = 1;
        while (keepGoing) {
            int x, y;
            // чередуем ходы игроков
            if (move % 2 != 0) {
                System.out.println("X-player choose: ");
            } else {
                System.out.println("Y-player choose: ");
            }
            // проверяем правильнось введенных координат
            while (true) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x > 3 || y > 3 || x < 1 || y < 1 || map[x - 1][y - 1].equals("X") || map[x - 1][y - 1].equals("Y")) {
                    System.out.println("Wrong position, try again:");
                } else {
                    break;
                }
            }
            // записываем ход
            map[x - 1][y - 1] = move % 2 != 0 ? "X" : "Y";
            // выводим игровое поле
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print("|" + map[i][j] + "|" + "\t");
                }
                System.out.println();
            }
            move++;

            // проверяем победу

            // проверяем строки и столбцы
            for (int i = 0; i < map.length; i++) {
                int countXHorizontal = 0;
                int countYHorizontal = 0;
                int countXVertical = 0;
                int countYVertical = 0;
                for (int j = 0; j < map[i].length - 1; j++) {
                    if (map[i][j].equals(map[i][j + 1]) && map[i][j].equals("X")) {
                        countXHorizontal++;
                    } else if (map[i][j].equals(map[i][j + 1]) && map[i][j].equals("Y")) {
                        countYHorizontal++;
                    }

                    // попробую проверить столбцы
                    if (map[j][i].equals(map[j + 1][i]) && map[j][i].equals("X")) {
                        countXVertical++;
                    } else if (map[j][i].equals(map[j + 1][i]) && map[j][i].equals("Y")) {
                        countYVertical++;
                    }
                }
                if (countXHorizontal == 2 || countXVertical == 2) {
                    result = "X win";
                    keepGoing = false;
                } else if (countYHorizontal == 2 || countYVertical == 2) {
                    result = "Y win";
                    keepGoing = false;
                }
            }

            // проверяем главную диагональ
            int countXMainDiagonal = 0;
            int countYMainDiagonal = 0;
            for (int i = 0; i < map.length - 1; i++) {
                if (map[i][i].equals(map[i + 1][i + 1]) && map[i][i].equals("X")) {
                    countXMainDiagonal++;
                } else if (map[i][i].equals(map[i + 1][i + 1]) && map[i][i].equals("Y")) {
                    countYMainDiagonal++;
                }
            }

            // проверяем побочную диагональ
            int countXSideDiagonal = 0;
            int countYSideDiagonal = 0;
            for (int i = 0; i < map.length - 1; i++) {
                for (int j = map[i].length - 1; j >= 1; j--) {
                    if (map[i][j].equals(map[i + 1][j - 1]) && map[i][j].equals("X")) {
                        countXSideDiagonal++;
                    } else if (map[i][j].equals(map[i + 1][j - 1]) && map[i][j].equals("Y")) {
                        countYSideDiagonal++;
                    }
                }
            }

            // выявляем победителя по диагоналям
            if (countXMainDiagonal == 2 || countXSideDiagonal == 2) {
                result = "X win";
                keepGoing = false;
            } else if (countYMainDiagonal == 2 || countYSideDiagonal == 2) {
                result = "Y win";
                keepGoing = false;
            }

            // проверка ничьи
            int countX = 0;
            int countY = 0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j].equals("X")) {
                        countX++;
                    } else if (map[i][j].equals("Y")) {
                        countY++;
                    }
                }
            }
            if (countX == 4 && countY == 5 || countX == 5 && countY == 4) {
                result = "Draw.";
                keepGoing = false;
            }
        }
        System.out.println(result);
    }
}