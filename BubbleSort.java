class BubbleSort {
  void Bubble(int Arr[]){
    int n = Arr.length;
    boolean sorted = false;
    while(sorted == false){
      sorted = true;
      for (int j = 0; j < n-1; j++){
        if(Arr[j] > Arr[j+1]){
          //code to swap 
          int temp = Arr[j];
          Arr[j] = Arr[j+1];
          Arr[j+1] = temp;
          sorted = false;
        }
      }
    }
    printArray(Arr);
  }
  void printArray(int Arr[]){
    int n = Arr.length;
    for (int j = 0; j < n; j++){
      System.out.print(Arr[j]+" ");

    }
    System.out.println();
  }
  public static void main(String[] args) {
  BubbleSort ob = new BubbleSort();
  int List[] = {72,43,90,54};
  ob.Bubble(List);

  }
}
