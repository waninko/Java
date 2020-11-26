package no.getacdademy.javatest;

public class Mammal implements Animal{

    public String _name;

    public Mammal(String Name){
        _name = Name;
    }

    @Override
    public String Walk() {
        //System.out.println(_name + " Walks.");
        return _name + " walks";
    }

    @Override
    public String Eat() {
        //System.out.println(_name + " Eats.");
        return _name + " eats";
    }

    @Override
    public String Speak() {
        //System.out.println(_name + " Makes a weird sound.");
        return _name + " grunts";
    }
}
