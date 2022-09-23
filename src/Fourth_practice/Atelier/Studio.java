package Fourth_practice.Atelier;

public enum Studio {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "adult size";
    }
    public String getDescription(Studio XXS){
        return "child size";
    }
    Studio(int euroSize){
        this.euroSize = euroSize;
    }
}
