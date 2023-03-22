import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ------------------------------------

        System.out.println("Hello\sworld!"); // \s - символ пробела

        System.out.println("Hello\nworld!"); // \n - символ новой строки

        System.out.println("Hello \"world\"!"); // \ANY - экранируем символ

        System.out.println("Hello\tworld!"); // \t - символ табуляции

        System.out.println("Hello\u26D4world!"); // \[Юникод код] - выводим любой символ из Юникода https://symbl.cc/ru

        lineSpace();
        // ------------------------------------

        int[] arrayInt = new int[]{ 0, 5, 4, 83, 9, 4, 1, 1 };

        for(int i=0; i<arrayInt.length; i++)
            System.out.print(i + "\t");

        lineSpace();

        for(int i=0; i<arrayInt.length; i++)
            System.out.print("\uD83E\uDC17\t");

        lineSpace();

        for(int i : arrayInt)
            System.out.print(i + "\t");

        lineSpace();

        for(int i=0; i<arrayInt.length; i++)
            System.out.print(arrayInt[i] + "\t");

        lineSpace();

        // ------------------------------------

        long[] arrayLong = new long[5];

        for(int i=0; i<arrayLong.length; i++){
            System.out.print("arrayLong["+i+"]=");
            arrayLong[i] = in.nextLong();
        }

        for(long i : arrayLong)
            System.out.print(i + "\t");

        lineSpace();

        for(long i : arrayLong){
            System.out.print("EnterNumber: ");
            i = in.nextLong();
            i *= 100;
        }

        for(long i : arrayLong)
            System.out.print(i + "\t");

        lineSpace();

        // ------------------------------------
        short arrayShort[] = new short[]{1,2,3,4,5};

        for(long i : arrayShort)
            System.out.print(i + "\t");

        lineSpace();

        // ------------------------------------
        byte[] arrayByte;

        System.out.print("ArrayLength: ");
        int lengthByteArray = in.nextInt();

        arrayByte = new byte[lengthByteArray];
        lineSpace();

        for(int i=0; i<arrayByte.length; i++){
            System.out.print("arrayByte["+i+"]=");
            arrayByte[i] = in.nextByte();
        }

        for(long i : arrayByte)
            System.out.print(i + "\t");

        lineSpace();
        // ------------------------------------
        float[] arrayFloat = {0f, 1f, 2f, 3f};

        for(float i : arrayFloat)
            System.out.print(i + "\t");

        lineSpace();

        arrayFloat[0] = arrayFloat[1] * 3f;

        for(float i : arrayFloat)
            System.out.print(i + "\t");

        lineSpace();
        // ------------------------------------

        int[][] twoDimIntArray = new int[][]{{1, 2, 3},
                                             {4, 5, 6},
                                             {7, 8, 9}};

        for(int[] intStr: twoDimIntArray){
            for(int intColumn: intStr)
                System.out.print(intColumn + "\t");
            lineSpace();
        }

        lineSpace();

        twoDimIntArray[1][2] = twoDimIntArray[2][1];

        for(int i=0; i< twoDimIntArray.length; i++){
            for (int k=0; k<twoDimIntArray[i].length; k++)
                System.out.print(twoDimIntArray[i][k] + "\t");
            lineSpace();
        }

        lineSpace();
        // ------------------------------------

        long[][] twoDimLongArray;

        System.out.print("StringCount: ");
        int stringCount = in.nextInt();

        System.out.print("ColumnCount: ");
        int columnCount = in.nextInt();

        twoDimLongArray = new long[stringCount][columnCount];

        for(int i=0; i< twoDimLongArray.length; i++){
            for (int k=0; k<twoDimLongArray[0].length; k++){
                System.out.print("twoDimLongArray[" + i + ']' + '[' + k + "]=");
                twoDimLongArray[i][k] = in.nextLong();
            }
            lineSpace();
        }

        for(long[] longStr: twoDimLongArray){
            for(long longColumn: longStr)
                System.out.print(longColumn + "\t");
            lineSpace();
        }
    }

    private static void lineSpace(){
        System.out.println();
    }

    /*
    0. Из массива случайных целочисленных элементов нам нужно найти:
            Максимум.
            Минимум.
            Среднее арифметическое.
            Количество элементов между максимальным и минимальным элементом.
            Первое простое число.
            Последнее простое число.
            Количество простых чисел в массиве.

    1. Введите одномерный целочисленный массив. Найдите наибольший нечетный элемент.
    Далее трижды осуществите циклический сдвиг влево элементов, стоящих справа от найденного максимума,
    и один раз сдвиг элементов вправо, стоящих слева от найденного максимума.

    2. Найдите сумму элементов массива между двумя первыми нулями. Если двух нулей нет в массиве, то выведите ноль.

    3. Найти подмножество данного множества чисел такое, что сумма его элементов равна заданному числу.

    4. Найдите сумму номеров минимального и максимального элементов.

    5. В матрице удалите столбцы с положительными суммами элементов, а затем в качестве первого
    вставьте столбец из минимальных элементов соответствующих строк.

    6. Применить
        Пузырьковая сортировка (Bubble sort);
        Сортировка выбором (Selection sort);
        Сортировка вставками (Insertion sort);
        Быстрая сортировка (Quick sort);
        Сортировка слиянием (Merge sort);
        Сортировка Шелла (Shell sort);
        Сортировка кучей (Heap sort).

        Для массива целых чисел.

    7. Применить бинарный поиск в отсортированном массиве целых чисел. Пользователь вводит число, найти его в отсортированном массиве.

    8. Даны две квадратных таблицы чисел. Требуется построить третью,
        каждый элемент которой равен сумме элементов, стоящих на том же месте
        в 1-й и 2-й таблицах.

    10. Перевернуть на 270° квадратную матрицу.

    11*. Однажды царь решил вознаградить одного из своих мудрецов за хорошую работу.
        Он привел его в прямоугольную комнату размром NxM, в каждой клетке
        которой лежало несколько килограммов золота. Царь разрешил мудрецу
        обойти несколько клеток (переходя с клетки, где сейчас
        находится мудрец, в одну из четырех с ней соседних), и собрать все
        золото, которое попадется на его пути.

        Вам дан маршрут мудреца. Требуется определить, сколько килограммов золота
        он собрал.

        Входные данные
        Пользователь вводит количество
        строк N, затем - количество столбцов M (1<=N<=20,1<=M<=20).
        Затем вводит N строк по M чисел в каждой - количество килограммов
        золота, которое лежит в данной клетке (число от 0 до 50).
        Далее записано число X - сколько клеток обошел мудрец. Далее
        записаны координаты этих клеток (координаты клетки - это два числа:
        первое определяет номер строки, второе - номер столбца, верхняя
        левая клетка на плане имеет координаты (0,0), правая нижняя - (N-1,M-1)).
        Гарантируется, что мудрец не проходил по одной и той же клетке дважды.

        ВЫВЕСТИ - кол-во золота и каждый этап и шаг мудреца в виде "Палочек" и "Стрелочек"

    12*. КОНТРОЛЬНАЯ.
         Поле чудес. Пользователь вводит кол-во букв в слове и буквы по очереди.
         Далее в консоли вместо слова появляется кол-во звёздочек равной кол-во букв в слове.(вид ******* )
         Пользователь начинает игру с 1500 очками. За каждую угаданную букву получает +200 очков,
         за каждый промах -300 очков. При кол-ве очков <=0 игра заканчивается. Пользователю сообщается. что он проиграл.
         При полностью отгаданном слове Пользователю сообщается, что он выиграл и выводится набранное им кол-во очков.
         Когда пользователь в свой ход вписывает букву и она есть в слове - звёздочка, отображаемая пользователю заменяется
         на эту букву. (Вид **а**а*) Если эта буква в слове встречается несколько раз, открываются все, но очки засчитываются,
         как за одну.
         */
}