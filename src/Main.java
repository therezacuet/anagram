import java.util.HashMap;


public class Main {
	
	String str1, str2;

    public Main(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
	
	// Function to check whether two strings
    // are an anagram of each other
    public boolean areAnagram()
    {
        HashMap<Character, Integer> hmap1
                = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2
                = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Mapping first string
        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Mapping second String
        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int)hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

}
