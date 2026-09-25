void main() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите 1 число: ");
    int A = in.nextInt();
    System.out.print("Введите 2 число: ");
    int B = in.nextInt();
    if (A < B){
        int ReS = 0;
        for (int i = A; i <= B; i++){
            ReS += Math.pow(i, 2);
        }
        System.out.println("Ответ: " + ReS);
    }
}
/* Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел
от A до B включительно.*/