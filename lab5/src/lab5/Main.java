package lab5;

public class Main {
    public static void main(String[] args) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String myText = "Апрель раньше мая";

        StringBuilder lettersLine = new StringBuilder();
        StringBuilder numbersLine = new StringBuilder();

        for (char i : myText.toCharArray()) {
            if (Character.isLetter(i)) {
                char lowerC = Character.toLowerCase(i);
                int position = alphabet.indexOf(lowerC) + 1;

                if (position == 0) {
                    System.out.println("Буква '" + i + "' не найдена в алфавите!");
                } else {
                    lettersLine.append(i).append("  ");
                    numbersLine.append(position).append(" ");
                    if (position < 10) {
                        numbersLine.append(" ");
                    }
                }
            } else {
                lettersLine.append(i).append("  ");
                numbersLine.append("   ");
            }
        }
        System.out.println(lettersLine.toString().trim());
        System.out.println(numbersLine.toString().trim());
    }
}