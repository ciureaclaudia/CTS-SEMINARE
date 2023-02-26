package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ZooKeeperName zooKeeperName=new ZooKeeperName("Andrei");
        Zoo zoo=new Zoo("zoo1",zooKeeperName);
        zoo.addAnimal(new Zebra("Zebrisor",10));
        zoo.addAnimal(new Lion("Leu fioros",12));

        zoo.feedAllAnimals();

        zoo.addAnimal(new Maimuta("Maimutel",2));
        zoo.addAnimal(new Maimuta("Maimu",21));

        zoo.feedAllAnimals();
    }
}