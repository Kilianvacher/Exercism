class ResistorColor {
    int colorCode(String color) {
        String[] c = colors();
        for(int i = 0; i<c.length; i++){
            if(c[i] == color){
                return i;
            }
        }
        return -3;
    }

    String[] colors() {
        String[] c = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return c;
    }
}
