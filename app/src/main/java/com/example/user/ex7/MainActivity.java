package com.example.user.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    public final int registerCode=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onToggleClicked(View v) {
        Intent myIntent = new Intent(MainActivity.this, RegisterActivity.class);
        MainActivity.this.startActivityForResult(myIntent,registerCode);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode ==registerCode && resultCode == RESULT_OK ){
            String lName = data.getStringExtra("lName");
            String fName = data.getStringExtra("fName");
            String gender = data.getStringExtra("gender");
            RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.rl);
            TextView intro = (TextView)findViewById(R.id.introd) ;
            Bundle dict = data.getExtras();
            if(dict.get("gender").equals("male"))
            {

            }
            else{
                intro.setText("welcome back Miss." +fName+", "+lName);
            }
            Button button = (Button)findViewById(R.id.reg) ;
            button.setText("again...");
        }
    }
}
