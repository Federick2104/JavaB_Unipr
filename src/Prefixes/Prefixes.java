package src.Prefixes;
import java.util.Iterator;
public class Prefixes implements Iterable<String>{
    private final String frase;

    public Prefixes(String frase) {
        this.frase = frase;
    }



    private class PrefixesIterator implements Iterator<String> {

        private String str;

        public PrefixesIterator(String str) {
            this.str = str;
        }


        @Override
        public boolean hasNext() {
            return str != null;
        }

        @Override
        public String next() {
            String result = str;
            if(str.isEmpty()) str = null;
            else str = str.substring(0, str.length()-1);

            return result;
        }
    }

    @Override
    public Iterator<String> iterator(){
        return new PrefixesIterator(frase);
    }
    public static void main(String[] args) {
        Prefixes pr = new Prefixes("Andrea Munaro Teoria Grafi!");

        for (String p : pr){
            System.out.println(p);
        }
    }
}
