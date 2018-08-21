package za.co.wethinkcode.swingy.model.artefacts;

public class Shield extends Artefact {
    public Shield(String name, int power, ArtefactType type) {
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
