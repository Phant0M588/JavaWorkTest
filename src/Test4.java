void main() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите количество элементов: ");
    int N = in.nextInt();
    double [] A = new double [N];
    for (int i = 0; i < N; i++){
        System.out.print("Введите элемент под №" + (i+1) + ": ");
        A[i] = in.nextDouble();
    }
    System.out.print("Исходный массив: ");
    for (int i = 0; i < N; i++){
        System.out.print(A[i]);
        if (i != A.length-1){
            System.out.print(", ");
        }
    }
    System.out.println();
    for (int i = 0; i < N; i++){
        if(i == 0){
            A[i] = A[i+1];
        }
        else if(i == A.length-1){
            A[i] = A[i-1];
        }
        else{
            A[i] = ((A[i-1]) + (A[i+1]))/2;
        }
    }
    System.out.print("Сглаженный массив: ");
    for (int i = 0; i < N; i++){
        System.out.print(A[i]);
        if (i != A.length-1){
            System.out.print(", ");
        }
    }
}
/*
Описать функцию Smooth(A,N), заменяющую каждый элемент
вещественного массива A размера N
на его среднее арифметическое со своими соседями ("сглаживание массива").
 */