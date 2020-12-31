package com.example.android.whatsapphome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); //hide the title bar

//        //show the activity in full screen
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        contacts.add(new Contacts("Deep Dhar", "Yes Bro, I know that feel!", "29/12/20", R.drawable.deep2));
        contacts.add(new Contacts("Alok Kumar Sah", "Haa re loveday", "2:18 AM", R.drawable.alokx));
        contacts.add(new Contacts("Aditya Singh", "Yes, my name is ludo", "1:05 AM", R.drawable.aditya));
        contacts.add(new Contacts("Agniva Sengupta", "I will come with my camera soon", "09:35 AM", R.drawable.agniva));
        contacts.add(new Contacts("Anusca Ghosh", "Good Morning ludo", "6:45 PM", R.drawable.anoushka));
        contacts.add(new Contacts("Anurag Das", "Onn naki vai?", "9:27 PM", R.drawable.anurag));
        contacts.add(new Contacts("Nivedita Prasad", "I'm a linux user kid!", "3:40 PM", R.drawable.nivi));
        contacts.add(new Contacts("Akshat Kumar Gupta", "Khaini ka stock khatam ho gya hai vro", "6:06 PM", R.drawable.akshat));
        contacts.add(new Contacts("Harsh Gupta", "Ha vro, sikha dunga 3D art", "25/12/20", R.drawable.harsh));
        contacts.add(new Contacts("Harshvarvardhan", "Jai Bholenath!", "6:45 AM", R.drawable.harshvardhan));
        contacts.add(new Contacts("Nilashish", "ab to aadat si hai mujhko..", "3:02 AM", R.drawable.nilashish));
        contacts.add(new Contacts("Kundan Gupta", "I love you Priya...", "2:36 PM", R.drawable.aabhash));
        contacts.add(new Contacts("Pawan Kumar Gupta", "I lob anusca uwu...", "5:08 PM", R.drawable.pawan));
        contacts.add(new Contacts("Karan Sharma", "20rs bhej na bhai paytm me", "4:20 PM", R.drawable.karan));
        contacts.add(new Contacts("Pawan Kumar Shah", "hello frands, I am Mr. Fresher", "11:08 AM", R.drawable.pawan2));
        contacts.add(new Contacts("Divyangana Ganguly", "send notes please", "6:37 PM", R.drawable.divya));
        contacts.add(new Contacts("Jamil", "maal laya?", "8:50 PM", R.drawable.jamil));
        contacts.add(new Contacts("Aabhash", "haa re loveday, gyan chodunga mai", "30/12/20", R.drawable.aabhash));
        contacts.add(new Contacts("Aniket Deb", "banega mere jaisa playboi?", "2:52 AM", R.drawable.aniket));

        ContactsAdapter adapter = new ContactsAdapter(this, contacts);
        ListView listView = (ListView)findViewById(R.id.whatsapp_listView);
        listView.setAdapter(adapter);
    }
}