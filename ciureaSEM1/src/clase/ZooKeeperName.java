package clase;

public class ZooKeeperName {
    private String zooKeeperName;

    public ZooKeeperName(String zooKeeperName) {
        this.zooKeeperName = zooKeeperName;
    }

    public String getZooKeeperName() {
        return zooKeeperName;
    }

    public void feedAnimal( Animal animal){
        if(animal !=null){
            animal.eat(this.zooKeeperName);
        }
    }


}
