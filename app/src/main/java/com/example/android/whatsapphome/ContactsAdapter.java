package com.example.android.whatsapphome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsAdapter extends ArrayAdapter<Contacts> {

    public ContactsAdapter(Context context, ArrayList<Contacts> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View counterView, ViewGroup parent){
        View listitemView = counterView;
        if(listitemView==null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent, false);
        }

        Contacts currentContact = getItem(position);

        ImageView dpImageView = (ImageView)listitemView.findViewById(R.id.dp_imageView);
        dpImageView.setImageResource(currentContact.getImageResourceId());

        TextView nameTextView = (TextView)listitemView.findViewById(R.id.name_textView);
        nameTextView.setText(currentContact.getName());

        TextView msgTextView = (TextView)listitemView.findViewById(R.id.msg_textView);
        msgTextView.setText(currentContact.getMessage());

        TextView timeTextView = (TextView)listitemView.findViewById(R.id.time_textView);
        timeTextView.setText(currentContact.getTime());

        return listitemView;
    }
}
