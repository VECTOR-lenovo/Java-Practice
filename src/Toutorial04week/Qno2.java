package Toutorial04week;

        class Animal {
            String sound;

            public void makeSound(){
                System.out.println("sound: " + sound);
            }
        }

        class Dog extends Animal {
            public Dog(String sound) {
                this.sound = sound;
                makeSound();
            }
        }

        class Cat extends Animal {
            public Cat(String sound) {
                this.sound = sound;
                makeSound();
            }
        }

        public class Qno2 {
            public static void main(String[] args) {
                Qno2 q = new Qno2();
                q.dogSound();
                q.catSound();
            }

            public void dogSound(){
                Dog dog = new Dog("Bark");
            }

            public void catSound(){
                Cat cat = new Cat("Meow");
            }
        }