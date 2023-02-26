package clase;

public class Lion extends  Animal{


    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Leu: "+ super.getName()+" "+ super.getAge() +" hranit de "+ zooKeeperName);
    }
}
