package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.Const;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.MVInputManager;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;

/**
 * Created by iankim on 2016. 9. 26..
 */
public class ChildKey extends RelativeLayout implements View.OnTouchListener
{
    Context context;
    TextView keyTextV;

    int firstLeftMargin;
    int firstTopMargin;

    int moveDistanceLimit;


    Const.DirectionType directionType;


    int matrixX;
    int matrixY;

    String keyString;
    String layoutType;

    Const.KeyType keyType;


    public ChildKey(Context context)
    {
        super(context);
        init(context);
    }

    public ChildKey(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public ChildKey(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    public void init(Context context)
    {
        this.context = context;
        keyTextV = new TextView(context);
        addView(keyTextV);

        setOnTouchListener(this);

    }


    public void setTextView(final String keyString)
    {
        this.keyString = keyString;

        this.post(new Runnable()
        {
            @Override
            public void run()
            {
                RelativeLayout.LayoutParams layoutparamForTV = new RelativeLayout.LayoutParams(ChildKey.this.getWidth(),ChildKey.this.getHeight());

                Log.d("HWI","크기 확인 --> layoutparamForTV.width : "+layoutparamForTV.width+",  layoutparamForTV.height : "+layoutparamForTV.height);

                ChildKey.this.keyTextV.setLayoutParams(layoutparamForTV);
                ChildKey.this.keyTextV.setText(keyString);
                ChildKey.this.keyTextV.setGravity(Gravity.CENTER);
                ChildKey.this.keyTextV.setTextColor(0xff4188c7);
                ChildKey.this.keyTextV.setTextSize(TypedValue.COMPLEX_UNIT_PX,(int)(Math.round(ChildKey.this.getHeight() * 2.0 / 5.0)));
                ChildKey.this.keyTextV.setClickable(false);
                ChildKey.this.setBackgroundResource(R.drawable.rectangle_2);

                ChildKey.this.firstLeftMargin = ((LayoutParams)(ChildKey.this.getLayoutParams())).leftMargin;
                ChildKey.this.firstTopMargin = ((LayoutParams)(ChildKey.this.getLayoutParams())).topMargin;



                float currentKeyboardTotalHeight = MovingKeyLib.getSharedObj().func18_getKeyboardHeight();
                float calculatedKeyboardTotalHeight = (int)((HWILib.getSharedObj().func03_getScreenSizeHeight(context) * currentKeyboardTotalHeight) /640.0);



                moveDistanceLimit = (int)(Math.round(  (calculatedKeyboardTotalHeight * 17.0)/224.0 ));



            }
        });

    }



    int firstEnterTouchX;
    int firstEnterTouchY;
    Const.PositionType selectedPosition;
    @Override
    public boolean onTouch(View view, MotionEvent event)
    {
        int eventX = (int)(event.getRawX());
        int eventY = (int)(event.getRawY());


        // get masked (not specific to a pointer) action

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)(ChildKey.this.getLayoutParams());

        int makedLeftMargin = 0;
        int makedTopMargin = 0;

        int changeX = 0;
        int changeY = 0;




        switch (event.getAction())
        {

            case MotionEvent.ACTION_DOWN:
            {
                firstEnterTouchX = eventX;
                firstEnterTouchY = eventY;

                makedLeftMargin = ChildKey.this.firstLeftMargin + changeX;
                makedTopMargin= ChildKey.this.firstTopMargin+ changeY;


                break;
            }
            case MotionEvent.ACTION_MOVE:
            {
                changeX = eventX - firstEnterTouchX;
                changeY = eventY - firstEnterTouchY;


                makedLeftMargin = ChildKey.this.firstLeftMargin + changeX;
                makedTopMargin= ChildKey.this.firstTopMargin+ changeY;

                Log.d("HWI","변화량 조사 --> changeX : "+changeX+"  changeY : "+changeY+"  moveDistanceLimit : "+moveDistanceLimit);

                /// 범위 이상 이동하지 못하도록 제어
                if(changeX > 0 && changeX > moveDistanceLimit)
                {
                    makedLeftMargin = ChildKey.this.firstLeftMargin + moveDistanceLimit;
                }

                if(changeX < 0 && changeX < moveDistanceLimit * -1)
                {
                    makedLeftMargin = ChildKey.this.firstLeftMargin - moveDistanceLimit;
                }

                if(changeY > 0 && changeY > moveDistanceLimit)
                {
                    makedTopMargin = ChildKey.this.firstTopMargin + moveDistanceLimit;
                }

                if(changeY < 0 && changeY < moveDistanceLimit * -1)
                {
                    makedTopMargin = ChildKey.this.firstTopMargin - moveDistanceLimit;
                }



                switch (ChildKey.this.directionType)
                {
                    case UP_DOWN:
                        makedLeftMargin =  firstLeftMargin;
                        break;
                    case LEFTUP_RIGHTUP_DOWN:

                        /// 역삼각형 로직 적용
                        if(changeY < 0)
                        {
                            /// 키가 위로 올라갈 때는 자유롭게 이동

                        }
                        else
                        {
                            /// 키가 내려갈 때는 가로이동 제한
                            makedLeftMargin =  firstLeftMargin;
                        }

                        break;
                    case LEFT_RIGHT:
                        makedTopMargin = firstTopMargin;
                        break;
                    case ALL:
                        break;
                }



                Log.d("HWI","makedLeftMargin : "+makedLeftMargin+"  makedTopMargin : "+makedTopMargin);




                // 이동에 따른 상태값 할당
                if(changeX >=  moveDistanceLimit * 0.8)
                {
                    /// 키가 오른쪽으로 이동했음

                    if(changeY >=  moveDistanceLimit * 0.8)
                    {
                        /// 키가 아래로 이동했음
                        selectedPosition = Const.PositionType.RIGHT_DOWN;
                    }
                    else if(changeY <=  moveDistanceLimit * 0.8 * -1)
                    {
                        /// 키가 위로 이동했음
                        selectedPosition = Const.PositionType.RIGHT_UP;
                    }
                    else
                    {
                        selectedPosition = Const.PositionType.RIGHT;
                    }
                }
                else if(changeX <=  moveDistanceLimit * 0.8 * -1)
                {
                    /// 키가 왼쪽으로 이동했음

                    if(changeY >=  moveDistanceLimit * 0.8)
                    {
                        /// 키가 아래로 이동했음
                        selectedPosition = Const.PositionType.LEFT_DOWN;
                    }
                    else if(changeY <=  moveDistanceLimit * 0.8 * -1)
                    {
                        /// 키가 위로 이동했음
                        selectedPosition = Const.PositionType.LEFT_UP;
                    }
                    else
                    {
                        selectedPosition = Const.PositionType.LEFT;
                    }
                }
                else
                {
                    /// 키가 센터임

                    if(changeY >= moveDistanceLimit * 0.8)
                    {
                        /// 키가 아래로 이동
                        selectedPosition = Const.PositionType.DOWN;
                    }
                    else if(changeY <= moveDistanceLimit * 0.8 * -1)
                    {
                        /// 키가 위로 이동
                        selectedPosition = Const.PositionType.UP;
                    }
                    else
                    {
                        selectedPosition = Const.PositionType.CENTER;
                    }

                }





                break;
            }
            case MotionEvent.ACTION_UP:
            {
                makedLeftMargin = ChildKey.this.firstLeftMargin;
                makedTopMargin = ChildKey.this.firstTopMargin;

                /// 이동 조건에 따른 입력 출력
                Log.d("HWI","TEST --> selectedPosition : "+selectedPosition);
                if(  selectedPosition == null || selectedPosition == Const.PositionType.CENTER)
                {
                    if(keyType == Const.KeyType.NORMAL)
                    {
                        MVInputManager.getSharedObj().addNormalText(keyString);
                    }
                    if(keyType == Const.KeyType.DEL)
                    {
                        MVInputManager.getSharedObj().delete();
                    }


                }



                break;
            }
            case MotionEvent.ACTION_POINTER_UP:
            {
                break;
            }
            case MotionEvent.ACTION_CANCEL:
            {

                break;
            }

        }


        /// 움직임 제약조건 체크 필요






        params.leftMargin = makedLeftMargin;
        params.topMargin = makedTopMargin;

        ChildKey.this.setLayoutParams(params);




        return true;
    }
}
