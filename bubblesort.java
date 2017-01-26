// Worst case and average is O(n^2), best case is O(n)
// 
// Pseudocode 
// 
// begin BubbleSort(list)
// 
//    for all elements of list
//       if list[i] > list[i+1]
//          swap(list[i], list[i+1])
//       end if
//    end for
//    
//    return list
//    
// end BubbleSort

private static int [] bublesort (int[] list , int length) {

    boolean swap = true;
    int temp;

    while(swap){

        swap = false;

        for(int i = 0;i < list.length-1; i++){              
            if(list[i] > list[i+1]){
                temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;                   
                swap = true;
            }
        }
    }
    return list;
}