public class Twofer {
    String name = null;
    public String twofer(String name) {
        if(name == null){
            return "One for you, one for me.";
        } else{
            return String.format("One for "+name+", one for me.");
        }
    }
}
