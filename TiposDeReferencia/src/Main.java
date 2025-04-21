//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Hola Mundo!";

        int textLength = text.length();
        System.out.println(textLength);

        String texto = text.replace("Hola", "Chao");
        System.out.println(text);
        System.out.println(texto.endsWith("undoR"));
        System.out.println(texto.startsWith("Cha"));
    }
}