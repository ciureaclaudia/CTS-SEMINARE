package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private ZooKeeperName zooKeeperName;
    private List<Animal> animals;
    public void feedAllAnimals(){
        if( this.animals!=null && this.zooKeeperName!=null){
            for(Animal a:this.animals){
                this.zooKeeperName.feedAnimal(a);
            }
        }
    }

    public void addAnimal(Animal animal){
        if(this.animals!=null){
            this.animals.add(animal);
        }
    }

    public Zoo(String name, ZooKeeperName zooKeeperName) {
        this.name = name;
        this.zooKeeperName = zooKeeperName;
        this.animals = new ArrayList<>();
    }
}
