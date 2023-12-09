public class SeasonDescription {
    public static void SeasoN() {
        Seasons favoriteSeason = Seasons.WINTER;

        switch (favoriteSeason) {
            case WINTER:
                System.out.println("I respect winter");
                System.out.println("My favorite season: " + favoriteSeason);
                System.out.println("Description of the season: " + favoriteSeason.getDescription());
                System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
                break;
            case SPRING:
                System.out.println("I hate spring");
                System.out.println("My favorite season: " + favoriteSeason);
                System.out.println("Description of the season: " + favoriteSeason.getDescription());
                System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
                break;
            case SUMMER:
                System.out.println("I hate summer");
                System.out.println("My favorite season: " + favoriteSeason);
                System.out.println("Description of the season: " + favoriteSeason.getDescription());
                System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
                break;
            case AUTUMN:
                System.out.println("I hate autumn");
                System.out.println("My favorite season: " + favoriteSeason);
                System.out.println("Description of the season: " + favoriteSeason.getDescription());
                System.out.println("Average temperature: " + favoriteSeason.getAverageTemperature());
                break;
        }

        System.out.println();

        for (Seasons season : Seasons.values()) {
            System.out.println("Season: " + season);
            System.out.println("Description of the season: " + season.getDescription());
            System.out.println("Average temperature: " + season.getAverageTemperature());
            System.out.println();
        }
    }
}