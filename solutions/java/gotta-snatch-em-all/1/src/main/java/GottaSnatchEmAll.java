import java.util.*;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }

        if (theirCollection.containsAll(myCollection)) {
            return false;
        }
        return !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Map<String, Integer> mapSet = new HashMap<>();
        collections.forEach(strings -> {
            strings.forEach(s -> {
                if (mapSet.get(s) == null || mapSet.isEmpty()) {
                    mapSet.put(s, 1);
                    return;
                }
                mapSet.put(s, mapSet.get(s) + 1);
            });
        });
        return mapSet.keySet().stream().filter(key -> mapSet.get(key) == collections.size()).collect(Collectors.toSet());
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }
}
