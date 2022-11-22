package ru.netology.magicbox;

import java.util.Arrays;

public class MagicBox {
        protected String name;
        protected Arrays[] box;
        public MagicBox(String name, int maxAccount) {
            this.name = name;
            box = new Arrays[maxAccount];
        }


        public void add(Arrays cellBox) {
            for (int i = 0; i < box.length; i++) {
                if (box[i] == null) {
                    box[i] = cellBox;
                    System.out.println("Добавлен счет " + box);
                    return;
                }
            }
            System.out.println("Мест в волшебном ящике закончилось! :(");
            System.out.println();
        }
//    public class Shop<P extends Product> {
//        private List<P> items = new ArrayList<>();
//        private Random random = new Random();
//
//        public void add(P product) {
//            items.add(product);
//        }
//
//        public P getRandom() {
//            return items.get(random.nextInt(items.size()));
//        }
//
//        public P getCheapest() {
//            int minIndex = 0;
//            for (int i = 1; i < items.size(); i++) {
//                if (items.get(minIndex).getPrice() > items.get(i).getPrice()) {
//                    minIndex = i;
//                }
//            }
//            return items.get(minIndex);
//    }
//    }
}
