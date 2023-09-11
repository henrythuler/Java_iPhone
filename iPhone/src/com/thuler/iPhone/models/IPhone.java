package com.thuler.iPhone.models;

import com.thuler.iPhone.contracts.Phone;
import com.thuler.iPhone.contracts.WebBrowser;
import com.thuler.iPhone.contracts.IPod;

public class IPhone implements IPod, Phone,WebBrowser  {
    private User user;

    public IPhone(User user){ this.user = user; }

    //Get and Set - User
    public User getUser(){ return this.user; }

    public void setUser(User user){ this.user = user; }

    //iPod Interface Methods Implementations
    public void playSong(){
        System.out.println("Playing song on iPhone!");
    }

    public void pauseSong(){
        System.out.println("Song paused...");
    }

    public void selectSong(){
        System.out.println("Song selected!");
    }

    //Phone Interface Methods Implementations
    public void call(){
        System.out.println("Calling through iPhone!");
    }

    public void answer(){
        System.out.println("Answering the call...");
    }

    public void voiceMail(){
        System.out.println("Voice mail activated!");
    }

    //WebBrowser Interface Methods Implementation
    public void showPage(){
        System.out.println("Showing web page on iPhone!");
    }

    public void newTab(){
        System.out.println("Opening new tab...");
    }

    public void refreshPage(){
        System.out.println("Refreshing page...");
    }

}
