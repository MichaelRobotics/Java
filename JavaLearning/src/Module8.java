import java.util.Arrays;
public class Module8 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
    
        animal1.makeSound();
        animal2.makeSound();

        Object[] objects = {animal1, animal2};

    for (Object obj : objects) {
        if (obj instanceof Dog) {
            ((Dog) obj).makeSound();
        } else if (obj instanceof Cat) {
            ((Cat) obj).makeSound();
        }
    }
        int[] numbers = generateRandomArray(10); // Change the size of the array as needed
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        
        System.out.println("After sorting: " + Arrays.toString(numbers));
    
    }
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }
    
    static class Dog extends Animal {
        public void makeSound() {
            super.makeSound();
            System.out.println("The dog barks");
        }
    }
    
    static class Cat extends Animal {
        public void makeSound() {
            super.makeSound();
            System.out.println("The cat meows");
        }
    }
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Change the range of random numbers as needed
        }
        return array;
    }

    

}