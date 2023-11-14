public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void play(){
        System.out.println(this.name + " is playing");
    }

    @Override
    public void eat(){
        System.out.println(this.name + " is eating");
    }

    @Override
    public void setName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

}
