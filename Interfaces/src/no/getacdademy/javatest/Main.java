package no.getacdademy.javatest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var giraffe = new Mammal("Giraffe");
        var cat = new Mammal("Cat");
        var goat = new Mammal("Goat");
        var crocodile = new Reptile("Crocodile");

        Mammal[] mammals = {giraffe, cat, goat};

        Animal[] animals = {giraffe, crocodile};



        for(var mammal : mammals ){
            System.out.println(mammal.Walk());

        }

        for(var animal : animals){
            System.out.println(animal.Walk() + ", " +  animal.Eat() + " & " + animal.Speak());

        }
    }
}
