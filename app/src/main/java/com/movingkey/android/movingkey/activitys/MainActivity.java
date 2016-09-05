package com.movingkey.android.movingkey.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.customLib.MovingKeySetting;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMenuTiltesAndSettings();

        loadSettingAndApplyToView();

    }


    void initMenuTiltesAndSettings()
    {


        /// Settings  ---> 텍스트 적용
        RelativeLayout menu01_lang = (RelativeLayout) findViewById(R.id.menu01_lang);
        RelativeLayout menu02_auto = (RelativeLayout) findViewById(R.id.menu02_auto);
        RelativeLayout menu03_memo = (RelativeLayout) findViewById(R.id.menu03_memo);


        TextView title01_lang = (TextView) menu01_lang.findViewById(R.id.title);
        TextView title02_auto = (TextView) menu02_auto.findViewById(R.id.title);
        TextView title03_memo = (TextView) menu03_memo.findViewById(R.id.title);


        title01_lang.setText("Languages and layout");
        title02_auto.setText("AutoText");
        title03_memo.setText("Memo");


        /// UI  ---> 텍스트 적용
        RelativeLayout menu01_theme = (RelativeLayout) findViewById(R.id.menu01_theme);
        RelativeLayout menu02_Prev = (RelativeLayout) findViewById(R.id.menu02_Prev);
        RelativeLayout menu03_keyboardSize = (RelativeLayout) findViewById(R.id.menu03_keyboardSize);


        TextView title01_theme = (TextView) menu01_theme.findViewById(R.id.title);
        TextView title02_Prev = (TextView) menu02_Prev.findViewById(R.id.title);
        TextView title03_keyboardSize = (TextView) menu03_keyboardSize.findViewById(R.id.title);


        title01_theme.setText("Theme design");
        title02_Prev.setText("Preview (balloon view)");
        title03_keyboardSize.setText("Keyboard size");


        /// More  ---> 텍스트 적용
        RelativeLayout menu01_capsLock = (RelativeLayout) findViewById(R.id.menu01_capsLock);
        RelativeLayout menu02_automatic_caps = (RelativeLayout) findViewById(R.id.menu02_automatic_caps);
        RelativeLayout menu03_aboutLicense = (RelativeLayout) findViewById(R.id.menu03_aboutLicense);


        TextView title01_capsLock = (TextView) menu01_capsLock.findViewById(R.id.title);
        TextView title01_capsLock_desc = (TextView) menu01_capsLock.findViewById(R.id.subtitle);

        TextView title02_automatic_caps = (TextView) menu02_automatic_caps.findViewById(R.id.title);
        TextView title03_aboutLicense = (TextView) menu03_aboutLicense.findViewById(R.id.title);
        CheckBox title03_aboutLicenseCheckBox = (CheckBox) menu03_aboutLicense.findViewById(R.id.checkbox);


        title01_capsLock.setText("Caps Lock activation tool");

        title01_capsLock_desc.setVisibility(View.VISIBLE);
        title01_capsLock_desc.setText("When double tab the shift key");

        title02_automatic_caps.setText("Automatic Caps Lock activation");
        title03_aboutLicense.setText("About license");

        title03_aboutLicenseCheckBox.setVisibility(View.GONE);




        /// 언어 및 레이아웃 셋팅 메뉴로 이동
        menu01_lang.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                moveOtherActivity(LanguageAndLayoutActivity.class);
            }
        });
    }


    void loadSettingAndApplyToView()
    {


        /// 메인 화면 진입 시 --> 최초로 설정파일에서 메모리로 올림
        final MovingKeyLib mvlib = MovingKeyLib.getSharedObj();

        if (mvlib.func01_getSharedSetting() == null)
        {
            mvlib.func02_loadMovingKeySettingFromFileAndLoadMemory(MainActivity.this);
        }

        MovingKeySetting curSetting = mvlib.func01_getSharedSetting();


        /// 사용자가 설정한 풍선뷰 미리보기 여부 -- > 적용
        RelativeLayout menu02_Prev = (RelativeLayout) findViewById(R.id.menu02_Prev);
        CheckBox checkbox = (CheckBox) menu02_Prev.findViewById(R.id.checkbox);

        checkbox.setChecked(mvlib.func04_getKeyboardBalloonViewIsShow(MainActivity.this));

        /// 사용자가 풍선뷰 미리보기 여부 변경할 경우 --> 해당 값 저장
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
            {
                mvlib.func04_setKeyboardBalloonViewIsShow(MainActivity.this,isChecked);
            }
        });



        /// 사용자가 설정한 키보드 크기  ---> 적용
        RelativeLayout menu03_keyboardSize = (RelativeLayout) findViewById(R.id.menu03_keyboardSize);
        SeekBar keyboardSizeSeekBar = (SeekBar) menu03_keyboardSize.findViewById(R.id.keyboardSizeSeekBar);
        int curKeyboardSizeInt = mvlib.func05_getCurrentKeyboardSizeIntValue(MainActivity.this);

        keyboardSizeSeekBar.setProgress(curKeyboardSizeInt);

        /// 사용자가 키보드 크기 변경할 경우 해당 값 적용
        keyboardSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b)
            {
                Log.d("HWI","키보드 사이즈 변화 확인 --> onProgressChanged --> progress : "+progress);

                mvlib.func05_setCurrentKeyboardSizeIntValue(MainActivity.this,progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });




        /// 사용자가 설정한 Caps Lock 활성 여부
        RelativeLayout menu01_capsLock = (RelativeLayout)findViewById(R.id.menu01_capsLock);
        CheckBox checkBoxForCapsLock = (CheckBox)menu01_capsLock.findViewById(R.id.checkbox);
        checkBoxForCapsLock.setChecked(mvlib.func06_getCapsLockActiveState());

        /// Caps Lock 활성 여부 저장
        checkBoxForCapsLock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCaps)
            {
                mvlib.func06_setCapsLockActiveState(MainActivity.this,isCaps);
            }
        });




        /// 사용자가 설정한 Auto Cap 활성 여부
        RelativeLayout menu02_automatic_caps = (RelativeLayout)findViewById(R.id.menu02_automatic_caps);
        CheckBox checkBoxForAutoCaps = (CheckBox)menu02_automatic_caps.findViewById(R.id.checkbox);

        checkBoxForAutoCaps.setChecked(mvlib.func07_getAutoCapActiveState());

        /// Auto Cap 활성 여부 저장
        checkBoxForAutoCaps.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCaps)
            {
                mvlib.func07_setAutoCapActiveState(MainActivity.this,isCaps);
            }
        });




    }


    void moveOtherActivity(Class<?> targetClass)
    {
        Intent intent = new Intent(MainActivity.this,targetClass);
        startActivity(intent);
    }
}
