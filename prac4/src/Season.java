enum Seasons {
    WINTER("Cold season", -5),
    SPRING("Warm season", 15),
    SUMMER("Hot season", 25) {
        @Override
        public String getDescription() {
            return super.getDescription();
        }
    },
    AUTUMN("Cool season", 10);

    private String description;
    private int averageTemperature;

    Seasons(String description, int averageTemperature) {
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Disgusting season";
        } else if (this == AUTUMN) {
            return "Wet and stinky season";
        }
        else if (this == SPRING){
            return "Wet and shiny season";
        }
        else{
            return "Normal season";
        }
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
}
