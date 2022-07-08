import java.util.Scanner;

public class ChislaMasiv {

    public static void main(String[] args) {

        Window.wndw();
        String input = null;
        int[] arr = new int[10];
        int sum = 0;
        int counter = 0;


        System.out.print(""); //ako go mahna se chupi programata


        Window.label.setText("Input next number:");
        while (counter < arr.length)
            while (true) {
                input = Window.savedInput;
                if (input != null) {
                    try {
                        arr[counter++] = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Ne vavejdai prazni masivi we.");
                    }
                    System.out.println(input);
                    Window.savedInput = null;
                    Window.textInput.setText(null);
                    break;
                }
            }
        for (int x: arr) {
            sum += x;
        }
        Window.label.setText("Result: " + sum);
        System.out.println(sum);
    }
}
