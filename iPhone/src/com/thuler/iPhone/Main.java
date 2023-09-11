package com.thuler.iPhone;

import com.thuler.iPhone.models.IPhone;
import com.thuler.iPhone.models.User;

public class Main {
    public static void main(String[] args) {

        User henry = new User("Henry", "henry@email.com", 19);
        IPhone iPhone = new IPhone(henry);

        //Showing iPhone User
        System.out.println(iPhone.getUser());

        //Breaking a line
        System.out.println();

        //Listening a song
        iPhone.selectSong();
        iPhone.playSong();
        iPhone.pauseSong();

        //Breaking a line
        System.out.println();

        //Navigating on Web
        iPhone.newTab();
        iPhone.showPage();
        iPhone.refreshPage();

        System.out.println();

        //Calling
        iPhone.call();
        iPhone.voiceMail();
        iPhone.answer();

    }
}
