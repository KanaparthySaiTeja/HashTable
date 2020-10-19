
import org.junit.Assert;
import org.junit.Test;

    public class HashTableTest
    {
        @Test
        public void given_a_string_whenPassed_returnFreq() {
            String str="To be or not to be";
            HashMap<String,Integer> hMap = new HashMap<>();
            String[] sentence=str.toLowerCase().split(" ");
            for(String word:sentence){
                Integer val = hMap.get(word);
                if(val==null)
                    val=1;
                else
                    val++;
                hMap.add(word,val);
            }
            int freq = hMap.get("to");
            Assert.assertEquals(2,freq);
        }
    }