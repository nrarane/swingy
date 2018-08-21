package za.co.wethinkcode.swingy.model.artefacts;

public class Artefact {

    protected String name;
    protected int power;
    protected ArtefactType type;

    public Artefact(String name, int power, ArtefactType type) {
        this.name = name;
        this.power = power;
        this.type = type;
    }
}
