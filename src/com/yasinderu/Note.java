package com.yasinderu;

import java.util.Scanner;

public class Note {
    private String title;
    private String noteBody;

    Scanner in = new Scanner(System.in);

    public Note() {
        setTitle();
        setNoteBody();
    }

    private void setTitle() {
        System.out.print("Note Title : ");
        this.title = in.nextLine();
    }

    private void setNoteBody() {
        System.out.println("Note Body :");
        this.noteBody = in.nextLine();
    }

    public void noteDetail() {
        System.out.print("Title : " + title);
        System.out.println("\n Body : \n" + noteBody);
    }
}