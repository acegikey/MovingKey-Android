package com.movingkey.android.movingkey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.movingkey.android.movingkey.activitys.MainActivity;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;

public class SplashActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageButton nextBtn = (ImageButton)findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                checkKeyboard();
            }
        });



    }


    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("HWI","SplashActivity --> onResume 호출 확인");
        /// 키보드가 무빙키인지 체크 --> 아닐 경우 로직 실행
        checkKeyboard();

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("HWI","SplashActivity --->  onActivityResult 호출 확인  --> requestCode : "+requestCode);

        if(requestCode == 999)
        {
            checkKeyboard();
        }
    }





    void checkKeyboard()
    {
        HWILib hwiLib = HWILib.getSharedObj();
        MovingKeyLib mvLib = MovingKeyLib.getSharedObj();

        boolean isMovingkeyContainsInSystem = mvLib.func08_isMovingkeyContainsInSystem(SplashActivity.this);
        boolean isMovingKeySelectedKeyboard = mvLib.func09_isMovingkeySelected(SplashActivity.this);
        /// 무빙키가 시스템에 포함되어 있는 경우
        if(isMovingkeyContainsInSystem)
        {
            /// 키보드가 완전히 선택된 경우 ---> 메인화면으로 이동한다
            if(isMovingKeySelectedKeyboard)
            {
                hwiLib.func01_runOnDelay(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        /// 메인화면으로 이동
                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }, 1500);

            }
            /// 무빙키가 그룹에는 포함되어있으나 --> 마지막으로 선택된 키보드가 아닐 경우
            else
            {
                mvLib.func10_showSelectKeyboardView(SplashActivity.this);
            }
        }
        else
        {
            /// 무빙키가 아예 시스템에 포함되어있지 않은 경우 ---> 키보드 셋팅화면으로 보내버린다
            startActivityForResult(new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS), 999);

        }
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);

        Log.d("HWI","SplashActivity --->  onWindowFocusChanged 호출 확인");

    }
}
