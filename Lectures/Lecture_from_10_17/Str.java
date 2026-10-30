package Lecture_from_10_17;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Str {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Lectures/Lecture_from_10_17/testtext.md"));

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }




    static String clearWord(String word){
        char c = word.charAt(word.length() - 1);
        switch (c){
            case '.': case',': case'!': case':': case'?': case';':
                word = word.substring(0,word.length()-1);

        }
        return word;
    }

}
//считать файл
//определить кол-во символов
// максимальную длину строки
//кол-во слов
//посчитать кол-во вхождений каждого слова
/*
String[] words = new String[5000]; // храним в нижнем регистре
int[] counts = new int[5000];
int count = -1;
String clearWord(String word)// .,:!?
*/