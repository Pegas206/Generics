import ru.netology.magicbox.MagicBox;

public class Main {
        public static void main(String[] args) {
            System.out.println("==============================================================================");
            MagicBox<Number> magicBox = new MagicBox<>("Волшебный ящик", 4);
            magicBox.add(10);
            magicBox.add(200);
            magicBox.add(1000);
            magicBox.add(555);


            System.out.print("Случайное значение: "); magicBox.Random();

            System.out.println("==============================================================================");



}
}
