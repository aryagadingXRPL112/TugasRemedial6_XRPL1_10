package searchtes2;

public class SearchTes2 {
    
    int sequentialSearch(String[] elements, String target) {
        for(int j = 0; j < elements.length; j++) {
            if(elements[j].equals(target)){
                return j;
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            String[] arr1 = {"blue","red","purple","green"};
            
            int index = sequentialSearch(arr1,"red");
            System.out.println(index);
            
            index = sequentialSearch(arr1,"pink");
            System.out.println(index);
        
    }
    
}
