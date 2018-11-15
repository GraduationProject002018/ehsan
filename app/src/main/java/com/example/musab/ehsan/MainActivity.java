package com.example.musab.ehsan;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        t = (TextView) findViewById(R.id.login_button);
        Typeface customFontBold = Typeface.createFromAsset(getAssets(), "fonts/DroidKufi-Bold.tff");
        t.setTypeface(customFontBold);

        t = (TextView) findViewById(R.id.register_button);
        t.setTypeface(customFontBold);

        t = (TextView) findViewById(R.id.username);
        Typeface customFontThin = Typeface.createFromAsset(getAssets(), "fonts/DroidKufi-Regular.tff");
        t.setTypeface(customFontThin);

        t = (TextView) findViewById(R.id.pass);
        t.setTypeface(customFontThin);


    }

}
