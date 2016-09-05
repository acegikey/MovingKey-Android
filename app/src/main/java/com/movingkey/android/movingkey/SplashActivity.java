package com.movingkey.android.movingkey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.movingkey.android.movingkey.activitys.MainActivity;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;

public class SplashActivity extends AppCompatActivity
{

    ImageView check01EnableMovingkey;
    ImageView check02PickMovingkey;


    public boolean preventDuplicageFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        View.OnClickListener clickListenerForSetting = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                checkKeyboard(true);
            }
        };

        Button btn01_enableMovingKey = (Button)findViewById(R.id.btn01_enableMovingKey);
        btn01_enableMovingKey.setOnClickListener(clickListenerForSetting);

        Button btn02_pickMovingKey = (Button)findViewById(R.id.btn02_pickMovingKey);
        btn02_pickMovingKey.setOnClickListener(clickListenerForSetting);



        check01EnableMovingkey = (ImageView)findViewById(R.id.check01EnableMovingkey);
        check02PickMovingkey = (ImageView)findViewById(R.id.check02PickMovingkey);

    }


    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("HWI","SplashActivity --> onResume 호출 확인");
        /// 키보드가 무빙키인지 체크 --> 아닐 경우 로직 실행
        checkKeyboard(false);

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("HWI","SplashActivity --->  onActivityResult 호출 확인  --> requestCode : "+requestCode);

        if(requestCode == 999)
        {
            checkKeyboard(false);
        }
    }





    /// 키보드 상태를 체크해서 현 상황을 표시하는 메소드
    void checkKeyboard(boolean wantAction)
    {
        HWILib hwiLib = HWILib.getSharedObj();
        MovingKeyLib mvLib = MovingKeyLib.getSharedObj();

        boolean isMovingkeyContainsInSystem = mvLib.func08_isMovingkeyContainsInSystem(SplashActivity.this);
        boolean isMovingKeySelectedKeyboard = mvLib.func09_isMovingkeySelected(SplashActivity.this);

        check01EnableMovingkey.setVisibility(View.GONE);
        check02PickMovingkey.setVisibility(View.GONE);

        /// 무빙키가 시스템에 포함되어 있는 경우
        if(isMovingkeyContainsInSystem)
        {
            check01EnableMovingkey.setVisibility(View.VISIBLE);

            /// 키보드가 완전히 선택된 경우 ---> 메인화면으로 이동한다
            if(isMovingKeySelectedKeyboard)
            {
                check02PickMovingkey.setVisibility(View.VISIBLE);



                    if(!preventDuplicageFlag)
                    {
                        preventDuplicageFlag = true;
                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);

                        HWILib.getSharedObj().func01_runOnDelay(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                SplashActivity.this.finish();
                            }
                        },1000);
                    }




            }
            /// 무빙키가 그룹에는 포함되어있으나 --> 마지막으로 선택된 키보드가 아닐 경우
            else
            {
                if(wantAction)
                {
                    mvLib.func10_showSelectKeyboardView(SplashActivity.this);
                }

            }
        }
        else
        {
            if(wantAction)
            {
                /// 무빙키가 아예 시스템에 포함되어있지 않은 경우 ---> 키보드 셋팅화면으로 보내버린다
                startActivityForResult(new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS), 999);
            }

        }
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);
        checkKeyboard(false);
        Log.d("HWI","SplashActivity --->  onWindowFocusChanged 호출 확인");

    }



}
