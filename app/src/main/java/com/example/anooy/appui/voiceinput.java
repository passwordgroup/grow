package com.example.anooy.appui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anooy on 15-11-22.
 */
public class voiceinput extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voiceinput);

        Button button = (Button)findViewById(R.id.finsh);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(voiceinput.this,Log.class);
                startActivity(intent);
            }
        });

    }
}
