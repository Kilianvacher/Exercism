class SqueakyClean {
    static String clean(String identifier) {
        boolean itShouldBeCapitalizes = false;
        char[] charArray = identifier.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char i : charArray){
            switch(i){
                case ' ':
                    result.append('_');
                    break;
                case '0':
                    result.append('o');
                    break;
                case '1':
                    result.append('l');
                    break;
                case '3':
                    result.append('e');
                    break;
                case '4':
                    result.append('a');
                    break;
                case '7':
                    result.append('t');
                    break;
                case '-':
                    itShouldBeCapitalizes = true;
                    break;
                default:
                    if(itShouldBeCapitalizes){
                        result.append(Character.toUpperCase(i));
                        itShouldBeCapitalizes = false;
                    } else if(Character.isLetter(i)){
                    result.append(i);
                    }
            }
        }
        return result.toString();
    }
}
