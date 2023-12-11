public class search_key_in_string {

    public static void main(String[] args) {
        String seriesName = "Grand Theft Auto Premium Edition";
        Character searchKey = 't';
        char[] nameArray = seriesName.toCharArray();
        int stringLength = nameArray.length;

        int k = 0;
        for(char letter:nameArray){
            System.out.print(letter+""+k + " ,");
            k++;
        }
        for(int i = 0; i<stringLength; i++){
            if (nameArray[i]==searchKey) {
                System.out.println(searchKey + " positioned at " + i+ " index.");
            }
        }
    }
}