package Encapsulatoin;

/**
 * Application class outside TextEditorGUI which doesn't know the implementation of the TextEditorGUI but knows only the public functions of TextEditorGUI.
 * Altering the implementation of TextEditorGUI wil not break or impact Application.
 */
public class Application {

    public static void main(String [] args) {
        TextEditorGUI textEditorGUI = new TextEditorGUI();
        System.out.println("\nApplication::\n     .......Lets print whatever is there on the screen.......");
        textEditorGUI.printScreen();
        System.out.println("\nApplication::\n     .......Lets cut whatever is there on the screen and print.......");
        textEditorGUI.cut();
        textEditorGUI.printScreen();
        System.out.println("\nApplication::\n     .......Lets paste whatever cut from the screen and print.......");
        textEditorGUI.paste();
        textEditorGUI.printScreen();
        System.out.println("\nApplication::\n     .......Lets cut whatever is there on the screen and print.......");
        textEditorGUI.cut();
        textEditorGUI.printScreen();
        System.out.println("\nApplication::\n     .......Lets paste whatever cut from the screen and print.......");
        textEditorGUI.paste();
        textEditorGUI.printScreen();
        System.out.println("\nApplication::\n     ....Done....");
    }

}
