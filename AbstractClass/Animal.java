public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs; // default value for all animals
    }

    abstract void eat();

    public void walk(){
       System.out.println("This animal walks on " + this.legs + " legs");
    }
}