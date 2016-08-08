package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMenuTiltesAndSettings();
    }




    void initMenuTiltesAndSettings()
    {


        /// Settings  ---> 텍스트 적용
        RelativeLayout menu01_lang = (RelativeLayout)findViewById(R.id.menu01_lang);
        RelativeLayout menu02_auto = (RelativeLayout)findViewById(R.id.menu02_auto);
        RelativeLayout menu03_memo = (RelativeLayout)findViewById(R.id.menu03_memo);


        TextView title01_lang =  (TextView)menu01_lang.findViewById(R.id.title);
        TextView title02_auto =  (TextView)menu02_auto.findViewById(R.id.title);
        TextView title03_memo =  (TextView)menu03_memo.findViewById(R.id.title);



        title01_lang.setText("Languages and layout");
        title02_auto.setText("AutoText");
        title03_memo.setText("Memo");






        /// UI  ---> 텍스트 적용
        RelativeLayout menu01_theme = (RelativeLayout)findViewById(R.id.menu01_theme);
        RelativeLayout menu02_Prev = (RelativeLayout)findViewById(R.id.menu02_Prev);
        RelativeLayout menu03_keyboardSize = (RelativeLayout)findViewById(R.id.menu03_keyboardSize);


        TextView title01_theme =  (TextView)menu01_lang.findViewById(R.id.title);
        TextView title02_Prev =  (TextView)menu02_auto.findViewById(R.id.title);
        TextView title03_keyboardSize =  (TextView)menu03_memo.findViewById(R.id.title);



        title01_theme.setText("Theme design");
        title02_Prev.setText("Preview (balloon view)");
        title03_keyboardSize.setText("Keyboard size");









        /// More  ---> 텍스트 적용
        RelativeLayout menu01_capsLock = (RelativeLayout)findViewById(R.id.menu01_capsLock);
        RelativeLayout menu02_automatic_caps = (RelativeLayout)findViewById(R.id.menu02_automatic_caps);
        RelativeLayout menu03_aboutLicense = (RelativeLayout)findViewById(R.id.menu03_aboutLicense);


        TextView title01_capsLock =  (TextView)menu01_capsLock.findViewById(R.id.title);
        TextView title01_capsLock_desc =  (TextView)menu01_capsLock.findViewById(R.id.subtitle);

        TextView title02_automatic_caps =  (TextView)menu02_automatic_caps.findViewById(R.id.title);
        TextView title03_aboutLicense =  (TextView)menu03_aboutLicense.findViewById(R.id.title);
        CheckBox title03_aboutLicenseCheckBox =  (CheckBox) menu03_aboutLicense.findViewById(R.id.checkbox);



        title01_capsLock.setText("Caps Lock activation tool");

        title01_capsLock_desc.setVisibility(View.VISIBLE);
        title01_capsLock_desc.setText("When double tab the shift key");

        title02_automatic_caps.setText("Automatic Caps Lock activation");
        title03_aboutLicense.setText("About license");

        title03_aboutLicenseCheckBox.setVisibility(View.GONE);
    }
}
