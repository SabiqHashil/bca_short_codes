// Fetch data from an EditText and display it in a TextView

package com.example.abc;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    Button btn;
    TextView tv;
    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        tv = (Button) findViewById(R.id.textView2);
        txt1 = (EditText) findViewById(R.id.editText1);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            }
        });
    }
}
