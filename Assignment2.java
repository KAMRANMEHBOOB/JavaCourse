class Qns{
    void question1(){

        int[] arr = {1,2,3,4,4,3,1,6,7,8,8,3,10,10,15};
        int[] duplicate = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    for(int l=0;l<duplicate.length;l++){
                        if(arr[j] == duplicate[l]){
                            flag = true;

                        }
                    }
                    if(!flag){
                        duplicate[k++] = arr[j];
                    }
                    
                }
            }
        }

        System.out.println("Duplicate elements are ");
        for(int i=0;i<k;i++){
            System.out.print(duplicate[i] + " ");
        }
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void question2(){
        int[] arr = {12,44,0,98,55,1,3,-8,77,65};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        System.out.println();
        System.out.print("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    void question3(){
        int[] arr= {13,12,33,4,6,11,8,9,7,4,0,99,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
        System.out.println();
        System.out.print("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    void merge(int[] arr, int low, int mid, int high)
    {
        int i, j, k;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[low + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        i = 0;
        j = 0; 
        k = low; 

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int low, int high)
    {
        int mid;
        if(low < high)
        {
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    void question4(){
        int[] arr = {2,8,4,4,96,67,11,27,76,47};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low,high);
        System.out.println();
        System.out.print("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    void question5(){

        int[] arr = {1,55,4,21,6,87,90,88};
        int high = arr.length-1;      
        for (int i = 0; i < high; i++){
            int min = i;
            for (int j = i+1; j< arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        System.out.println();
        System.out.print("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    void question6(){
        int[] arr = {1,3,4,5,7,8,9,11,12};
        int [] arr2 = {};
        int index = -1;
        boolean flag = true;
        System.out.println();

        if(arr2.length ==0){
            System.out.print("Yes it is a Subset");
            return;

        }

        for(int i=0;i< arr.length;i++){
            if(arr2[0] == arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.print("Not a Subset");
            return;
        }
        else{
            for(int i = 0; i< arr2.length;i++){
                if(arr2[i] != arr[index + i]){
                    System.out.print("Not a Subset");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print("Yes it is a Subset");
            }
        }
    }
}

class Assignment2{
    public static void main(String args[]){

        Qns ans1 = new Qns();
        ans1.question1();
        Qns ans2 = new Qns();
        ans2.question2();
        Qns ans3 = new Qns();
        ans3.question3();
        Qns ans4 = new Qns();
        ans4.question4();
        Qns ans5 = new Qns();
        ans5.question5();
        Qns ans6 = new Qns();
        ans6.question6();



        
    }
}