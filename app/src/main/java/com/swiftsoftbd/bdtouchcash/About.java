package com.swiftsoftbd.bdtouchcash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class About extends Activity {

    ImageButton fb;
    ImageButton play;


    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_about);

        //getActionBar().setDisplayHomeAsUpEnabled(true);
        this.fb = ((ImageButton)findViewById(R.id.fb));
        this.fb.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/swifttechsoft"));
                About.this.startActivity(localIntent);
            }
        });
        this.play = ((ImageButton)findViewById(R.id.play));
        this.play.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=SwiftTechSoft"));
                About.this.startActivity(localIntent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }




}
