package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;


    WordManager() {
      wordCRUD = new WordCRUD(s);
    }

    public int selectMenu()
    {
        System.out.print("*** 영단어마스터 *** ******************** \n" +
                "1. 모든단어보기\n" +
                "2. 수준별단어보기\n" +
                "3. 단어검색\n" +
                "4. 단어추가\n" +
                "5. 단어수정\n" +
                "6. 단어삭제\n" +
                "7. 파일저장\n" +
                "0. 나가기\n" +
                "******************** \n"
                + "=> 원하는메뉴는? ");
        return s.nextInt();
    }

    public void start() {
        //System.out.println("WordManager!!!");
        wordCRUD.loadFile();
        while(true)
        {
            int menu = selectMenu();
            if(menu == 0) break;
            if(menu == 4) wordCRUD.addItem();
            else if(menu == 1) wordCRUD.listAll();
            else if(menu == 2) wordCRUD.searchLevel();
            else if(menu == 5) wordCRUD.updateItem();
            else if(menu == 6) wordCRUD.deleteItem();
            else if(menu == 7) wordCRUD.saveFile();
            else if(menu == 3) wordCRUD.searchWord();
        }
        System.out.println("프로그램 종료! 다음에 만나요~ ");
    }
}
