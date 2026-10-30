package for_10_24;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Task1234 {
    public static void main(String[] args) throws IOException{
        int count_el = 0; // количество элементов
        int maxlength = 0; // максимальная длина строки
        int count_of_words = 0;
        int count_el_str;
        int k = 0; //номер последнего занятого места в массиве слов
        String[] words = new String[100];//массив из слов без повторения
        int[] counts = new int[100];//массив из количества каждого слова
        Scanner scanner = new Scanner(new File("Homework/for_10_24/test.md"));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            count_el += line.length();

            maxlength = Math.max(maxlength,line.length());

            count_of_words += count_el_str = line.split(" ").length;

            for (int i = 0;i<count_el_str; ++i){
                String wordnow = clearWord(line.split(" ")[i]);
                for(int j = 0;j < words.length;++j){
                    if(wordnow.equals(words[j])){
                        counts[j]+=1;
                        break;
                    }else if(words[j]==null){
                        words[j] = wordnow;
                        counts[j]=1;
                        k = j;
                        break;
                    }
                }
            }
        }



        System.out.println("Количество элементов = "+count_el+"\nМаксимальная длина строки = "+
                maxlength+"\nКоличество слов = "+count_of_words);
        System.out.println();

        for (int i = 0;i<k+1;++i){
            System.out.println(words[i] + "=" + counts[i]);
        }
    }


    static String clearWord(String word){
            char c = word.charAt(word.length() - 1);
            switch (c) {
                case '.':
                case ',':
                case '!':
                case ':':
                case '?':
                case ';':
                    word = word.substring(0, word.length() - 1);
            }
        return word;
    }
}
