package za.co.wethinkcode.swingy;

public class Knife extends Artefact {

    public Knife(String name, int power, ArtefactType type) {
        super(name, power, type);
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public ArtefactType getType() {
        return type;
    }

}
