import ru.netology.magicbox.MagicBox;

public class Main {
        public static void main(String[] args) {
            System.out.println("==============================================================================");
            MagicBox<String> magicBox = new MagicBox<>("Волшебный ящик", 5);
            magicBox.add("Малина");
            magicBox.add("Монета");
            magicBox.add("Шар");
            magicBox.add("Звезда");
            magicBox.add("Конфета");
            magicBox.add("Кролик");

            System.out.print("Случайное значение: "); magicBox.Random();

            System.out.println("==============================================================================");



}
}
