public class Twofer {
    public String twofer(String name) {
        var text = "One for %s, one for me.";
        if (name == null || name.isBlank()) {
            return text.formatted("you");
        }
        return text.formatted(name);
    }
}
