import java.util.Locale;

public class GameMaster {

    public String describe(Character character) {
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();
        String characterClass = character.getCharacterClass();

        return "You're a level %s %s with %s hit points.".formatted(level, characterClass, hitPoints);
    }

    public String describe(Destination destination) {
        String name = destination.getName();
        int inhabitants = destination.getInhabitants();

        return "You've arrived at %s, which has %s inhabitants.".formatted(name, inhabitants);
    }

    public String describe(TravelMethod travelMethod) {
        return switch (travelMethod) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on horseback.";
        };
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();
        String name = destination.getName();
        int inhabitants = destination.getInhabitants();

        return "You're a level %s Wizard with %s hit points. You're traveling to your destination on %s. You've arrived at %s, which has %s inhabitants.".formatted(level, hitPoints, travelMethod.name().toLowerCase(Locale.ROOT), name, inhabitants);
    }

    public String describe(Character character, Destination destination) {
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();
        String characterClass = character.getCharacterClass();
        String name = destination.getName();
        int inhabitants = destination.getInhabitants();

        return "You're a level %s %s with %s hit points. You're traveling to your destination by walking. You've arrived at %s, which has %s inhabitants.".formatted(level, characterClass, hitPoints, name, inhabitants);
    }
}
