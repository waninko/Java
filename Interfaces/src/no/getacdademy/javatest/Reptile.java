package no.getacdademy.javatest;

public class Reptile  implements  Animal{

    public String _name;

    public Reptile(String Name){
        _name = Name;
    }

    @Override
    public String Walk() {
        //System.out.println(_name + " walks");
        return _name + " walks";
    }

    @Override
    public String Eat() {
        //System.out.println(_name + " eats");
        return _name + " eats";
    }

    @Override
    public String Speak() {
        //System.out.println(_name + " hisses and growls");
        return _name + " hisses";
    }
}
