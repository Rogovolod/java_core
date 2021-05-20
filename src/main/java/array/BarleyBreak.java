package array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = j + 1 + i * num.length;
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
       }

