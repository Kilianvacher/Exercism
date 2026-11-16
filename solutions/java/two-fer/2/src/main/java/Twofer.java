public class Twofer {
    String name = null;
    public String twofer(String name) {
     return String.format("One for %s, one for me.", (name == null)? "you" : name);
    }
}
