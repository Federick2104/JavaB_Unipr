/**
 * The arrayUtility class fornisce dei metofi che possono essere,
 * usati su un array di interi (int[]), fornisce i metodi:
 * - Sort(int[] Arr)
 * - Search(int[] Arr)
 * - Compare(int[] Arr1, int[] Arr2)
 *
 * @author <a href="mailto:federicoschianchi@unipr.it">Federico Schianchi</a>
 * @version 1.0
 * @since   2024-04-18
 */
package src;

public class ArrayUtility {

    /**
     * Metodo sort della classe ArrayUtility, utilizza un algoritmo:
     * CountingSort che permette di ordinare un'array in tempo O(n).
     *
     *
     * @param Arr l'array passato come parametro dal sort
     * @return un nuovo array outArr con all'interno gli elementi ordinati di Arr
     */

    public static int[] Sort(int[] Arr){
        int l = Arr.length-1;
        int m = 0;

        for (int i : Arr) {
            m = Math.max(m, i);
        }
        /*
          Array per contare le apparenze
         */
        int[] countArr = new int[m + 1];

        for (int i = 0; i < Arr.length-1; i++) {
            countArr[Arr[i]]++;
        }

        for(int i = 1; i <= m; i++){
            countArr[i] += countArr[i-1];
        }
        /*
          Array che contiene gli elementi sortati di Arr, returnati in outArr()
         */
        int[] outArr = new int[l];

        for (int i = l - 1; i >= 0; i--) {
            outArr[countArr[Arr[i]] - 1] = Arr[i];
            countArr[Arr[i]]--;
        }

        return outArr;
    }

    /**
     * Metodo search della classe ArrayUtility, utilizza BinarySearch
     * che permette di ricercare un elemento k in un array di interi Arr,
     * usando BinarySearch risolve questo prooblema in tempo O(log.n).
     * Per rendere questo algoritmo general purpose, l'array viene sempre ordinato
     * prima di fare qualsiasi ricerca. La complessità dunque sale a O(n*log.n).
     *
     * @param Arr l'array passato come parametro dal search, algoritmo richiede,
     *            Arr già ordinato.
     * @param x elemento da cercare nell'array dato in input.
     *
     * @return un nuovo array outArr con all'interno gli elementi ordinati di Arr.
     */

    public static int BinarySearch(int[] Arr, int x ){
        int[] ArrCopy = ArrayUtility.Sort(Arr);
        /*
        * Indice sinistro dell'array in input
        * */
        int l = ArrCopy[0];
        int r = ArrCopy[ArrCopy.length-1];
        while(l <= r){
            int mid = (l+r)/2;
            /*
            * Se l'elemento da cercare k è l'elemento,
            * a metà dell'array, trovando subito indexOf(k)
            * */
            if (ArrCopy[mid] == x) {
                return mid;

                /*
                 * Se l'elemento è < di mid, allora sarà presente solo nella,
                 * parte sinistra del subArr, quindi decremento il nostro puntatore r(destro),
                 * a mid-1.
                 *
                 * */
            } else if (ArrCopy[mid] > x){
                r = mid-1;

            } else{
                l = mid+1;
            }
        }
        /*
         * Return -1 quando l'elemento non è presente in Arr
         * */
        return -1;

    }
    /**
     * Metodo Compare della classe ArrayUtility:
     *
     */
    public static boolean Compare(int[] Arr1, int[] Arr2){
        if (Arr1.length != Arr2.length)
            return false;

        for (int i = 0; i < Arr1.length-1; i++)
            if (Arr1[i] != Arr2[i]) return false;

        return true;
    }

    public static void Print(int[] arr){
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(" ,");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        int[] oArr = {1, 2, 3 ,4 ,5 ,6, 7, 8, 9, 10};
        int[] mixedArr = {190, 176, 132, 45, 45, 190, 23, 1, 12, 34 , 45 , 67, 190};
        System.out.println(ArrayUtility.Compare(oArr, mixedArr));

        ArrayUtility.Print(oArr);
        ArrayUtility.Print(mixedArr);

        int[] newArr = ArrayUtility.Sort(mixedArr);
        ArrayUtility.Print(newArr);



    }

}
