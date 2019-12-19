package com.pecpecker.pecapp.util;

import android.net.Uri;

import com.pecpecker.pecapp.models.User;

import com.pecpecker.pecapp.R;



public class Users {

    public User[] USERS = {
            Daniel,Karen, Lawyer, Loveth, Chuks, Thewills, Matthew, Mary, Pec,Ify,
    };
    /*
            Men
     */
    public static final User Daniel = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.daniel).toString(),
            "Daniel", "Male", "Female", "Searching");
    public static final User Karen = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.karen).toString(),
            "Karen", "Male", "Female", "Searching");
    public static final User Lawyer = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.lawyer).toString(),
            "Lawyer", "Male", "Female", "Searching");
    public static final User Chuks = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.chuks).toString(),
            "Chuks", "Male", "Female", "Searching");
    public static final User Matthew = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.mattew).toString(),
            "Matthew", "Male", "Female", "Searching");
    public static final User Ify = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.ify).toString(),
            "Ify", "Male", "Female", "Searching");
    /*
            Females
     */
    public static final User Mary = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.mary).toString(),
            "Mary", "Female", "Male", "Searching");
    public static final User Pec = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.pec).toString(),
            "Pec", "Female", "Female", "Searching");
    public static final User Loveth = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.lov_eth).toString(),
            "Loveth", "Female", "Female", "Not Searching");
    public static final User Thewills = new User(Uri.parse("android.resource://com.pecpecker.pecapp/" + R.drawable.thewills).toString(),
            "Thewills", "Female", "Male", "Not Searching");
}




















