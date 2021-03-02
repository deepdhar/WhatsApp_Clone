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

        contacts.add(new Contacts("Deep Dhar", "Hello, how're you?", "29/12/20", R.drawable.deep2));
        contacts.add(new Contacts("Alok Kumar Sah", "please find the attachment", "2:18 AM", R.drawable.alokx));
        contacts.add(new Contacts("Aditya Singh", "Hi, I'm new here!", "1:05 AM", R.drawable.aditya));
        contacts.add(new Contacts("Agniva Sengupta", "I will come with my camera soon", "09:35 AM", R.drawable.agniva));
        contacts.add(new Contacts("Anusca Ghosh", "Good Morning sir", "6:45 PM", R.drawable.anoushka));
        contacts.add(new Contacts("Anurag Das", "Hello, how're you?", "9:27 PM", R.drawable.anurag));
        contacts.add(new Contacts("Nivedita Prasad", "I'm a linux user kid!", "3:40 PM", R.drawable.nivi));
        contacts.add(new Contacts("Akshat Kumar Gupta", "please find the attachment", "6:06 PM", R.drawable.akshat));
        contacts.add(new Contacts("Harsh Gupta", "Hi, I'm new here!", "25/12/20", R.drawable.harsh));
        contacts.add(new Contacts("Harshvarvardhan", "May god bless you.", "6:45 AM", R.drawable.harshvardhan));
        contacts.add(new Contacts("Nilashish Mohanti", "Hello, how're you?", "3:02 AM", R.drawable.nilashish));
        contacts.add(new Contacts("Kundan Gupta", "hello, I a Fresher", "2:36 PM", R.drawable.aabhash));
        contacts.add(new Contacts("Pawan Kumar Gupta", "Hi, I'm new here!", "5:08 PM", R.drawable.pawan));
        contacts.add(new Contacts("Karan Sharma", "please find the attachment", "4:20 PM", R.drawable.karan));
        contacts.add(new Contacts("Pawan Kumar Shah", "hello, I a Fresher", "11:08 AM", R.drawable.pawan2));
        contacts.add(new Contacts("Divyangana Ganguly", "Hello, how're you?", "6:37 PM", R.drawable.divya));
        contacts.add(new Contacts("Jamil Akhter", "Good Morning sir", "8:50 PM", R.drawable.jamil));
        contacts.add(new Contacts("Aabhash Jain", "please find the attachment", "30/12/20", R.drawable.aabhash));
        contacts.add(new Contacts("Aniket Deb", "Hello, how're you?", "2:52 AM", R.drawable.aniket));

        ContactsAdapter adapter = new ContactsAdapter(this, contacts);
        ListView listView = (ListView)findViewById(R.id.whatsapp_listView);
        listView.setAdapter(adapter);
    }
}
