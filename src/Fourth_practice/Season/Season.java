package Fourth_practice.Season;

public enum Season {
    WINTER(-10), SPRING(20), SUMMER(35), AUTUMN(10);
    private double tempereture;

    public void setTempereture(double tempereture) {
        this.tempereture = tempereture;
    }

    public double getTempereture() {
        return tempereture;
    }

    Season(double temperature){
        this.tempereture = temperature;
    }

    public String getDiscription(){
        return "it's cold time now";
    }

    public String getDiscription(Season SUMMER){
        return "it's warm time now";
    }
}
