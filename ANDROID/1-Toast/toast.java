// Hello World Program (Write a program to Toast Hello World)

package com.andoubleos.myprogram;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Hello World",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}