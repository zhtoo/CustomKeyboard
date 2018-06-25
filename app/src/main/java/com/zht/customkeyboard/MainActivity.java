package com.zht.customkeyboard;

import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit;
    private CustomKeyboardManager customKeyboardManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.demo_edit);

        customKeyboardManager = new CustomKeyboardManager(this);
        customKeyboardManager.attachToEdit(edit,new Keyboard(this, R.xml.custom_number));



    }
}
