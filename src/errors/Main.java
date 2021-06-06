package errors;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            double[][] array = new double[12][12];
            int line;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scn.nextDouble();
                }
            }

            String t = scn.nextLine();
            line = scn.nextInt();

            switch (t) {
                case "S":
                    double sum = 0;
                    for (int row = 0; row < array.length; row++) {
                        for (int col = 0; col < array[row].length; col++) {
                            sum += array[line][col];
                        }
                    }
                    System.out.println(sum);
                    break;
                case "M":
                    double average = 0;

                    for (int row = 0; row < array.length; row++) {
                        for (int col = 0; col < array[row].length; col++) {
                            average += array[line][col];
                        }
                    }
                    average /= array[2].length;
                    System.out.println(average);
                    break;
            }

        }
    }

