public class Twofer {
    public String twofer(String name) {
        var text = "One for %s, one for me.";
        return name == null || name.isBlank()
                ? text.formatted("you")
                : text.formatted(name);
    }
}
