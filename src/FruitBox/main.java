package FruitBox;

public class main {
        public static void main(String[] args) {
            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange(1.5F));
            orangeBox.addFruit(new Orange(1.5F));
            orangeBox.addFruit(new Orange(1.5F));
            System.out.println(orangeBox.getWeight());

            Box<Apple> appleBox = new Box<>();
            appleBox.addFruit(new Apple(1F));
            appleBox.addFruit(new Apple(1F));
            appleBox.addFruit(new Apple(1F));
            System.out.println(appleBox.getWeight());
          }

        public static void changeArrElements(Object[] array, int a, int b) {
            Object tmp = array[a];
            array[a] = array[b];
            array[b] = tmp;
        }
    }

