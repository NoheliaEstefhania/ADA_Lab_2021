package E001_Group_Anagrams;
import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Group Anagrams
 * Date	  		: 21/12/2021
 */

public class Solution {
    public static void main(String[] args) {        
    	Solution main = new Solution();
        String[] anagrams = new String[] {"abcd", "bcad", "eaft", "tfea", "abc", "def"};
        List<List<String>> result = main.groupAnagrams(anagrams);
        for(List<String> list : result) {
            for(String str : list) {
                System.out.print(str + ", ");
            }
            System.out.println();
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {       
        String aux;
        char[] array;
        List<String> list;
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
             
            array = str.toCharArray();
            Arrays.sort(array);
            aux = String.valueOf(array);
             
            if(map.containsKey(aux)){
                map.get(aux).add(str);
            }else {
                list = new ArrayList<>();
                list.add(str);
                map.put(aux, list);
            }
             
        }
         
        List<List<String>> result = new ArrayList<>();
        for(List<String> value: map.values()){
            result.add(value);
        }
        return result;        
    }
}
