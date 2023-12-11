public class replace_key_in_string {

    public static void main(String[] args) {
        String seriesName = "Grand Theft Auto Premium Edition";
        Character searchKey = 't';
        Character replaceKey = '#';
        char[] nameArray = seriesName.toCharArray();
        int stringLength = nameArray.length;

        for(int i = 0; i<stringLength; i++){
            if (nameArray[i]==searchKey) {
                nameArray[i]= replaceKey;
            }
        }
        String replaced = new String(nameArray);
        System.out.println(replaced);
    }
}