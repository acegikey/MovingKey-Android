package com.movingkey.android.movingkey.services;

import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.MVInputManager;
import com.movingkey.android.movingkey.keyboardLayout.KeyboardContainerLayout;



/*
안드로이드 소스 구조 인수인계 자료

        1. MovingKeySetting --> JSON 구조 파일로 저장되는 사용자 설정 값.
        2. LangAndLayout --> 저장되는 설정 값
        3. Const --> 상수값 모음
        4. MovingKeyLib --> 키보드 공통 사용 라이브러리
        5. InputMethodServiceMovingKey --> 키보드를 만들 때 생기는 최초 진입점. KeyboardContainerLayout 를 불러와서 표현한다.
        6. KeyboardContainerLayout --> 설정에 맞는 레이아웃을 찾아서 뷰에 셋팅한다.

*/


public class InputMethodServiceMovingKey extends InputMethodService
{


    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.d("HWI","onCreate 호출 확인 --> 키보드 나올 때 01");


    }

    @Override
    public void onInitializeInterface()
    {
        super.onInitializeInterface();

        Log.d("HWI","onInitializeInterface 호출 확인 --> 키보드 나올 때 02");

    }

    @Override
    public boolean onShowInputRequested(int flags, boolean configChange)
    {
        Log.d("HWI","onShowInputRequested 호출 확인 --> 키보드 나올 때 03 --> flags : "+flags+" configChange : "+configChange);
        return true;
    }

    @Override
    public boolean onEvaluateInputViewShown()
    {

        Log.d("HWI","onEvaluateInputViewShown 호출 확인 --> 키보드 나올 때 04");
        return super.onEvaluateInputViewShown();
    }


    @Override
    public View onCreateInputView()
    {
        Log.d("HWI","onCreateInputView 호출 확인 --> 키보드 나올 때 05 ---> 정석은 여기서 키보드 뷰를 리턴한다");

        /// 인풋커넥션 삽입 --> 키보드 사용시 필요함
        MVInputManager.getSharedObj().ipc = getCurrentInputConnection();


        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        KeyboardContainerLayout keyboardContainer = (KeyboardContainerLayout)inflater.inflate(R.layout.keyboard_container_layout,null);



        return keyboardContainer;

/// 보일러 플레이팅 소스 백업
//        return super.onCreateInputView();

    }


    @Override
    public void onStartInputView(EditorInfo info, boolean restarting)
    {
        super.onStartInputView(info, restarting);

        Log.d("HWI","onStartInputView 호출 확인 --> 키보드 나올 때 06");

    }


}
