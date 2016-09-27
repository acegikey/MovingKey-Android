package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.RelativeLayout;

import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.ArrayList;

/**
 * Created by hwi on 2016. 9. 9..
 */
public class KeyboardLayoutQWERTY extends KeyboardLayoutParent
{

    Context context;

    public ArrayList<Integer> colCountArr;
    public ArrayList<Integer> firstLeftRightMarginArr;

    public ArrayList<Integer> smallTextColCountArr;
    public ArrayList<Integer> smallTextFirstLeftRightMarginArr;


    public int rowCount;

    public int row1_topMarginPX;



    public int row1_parentKeyWidthNormalPX;

    public int row1_parentKeyHeightFirstRowPX;
    public int row1_parentKeyHeightNormalPX;

    public int shift_del_ParentkeyWidthPX;
    public int numberKeyWidthPX;
    public int spacebarKeyWidthPX;
    public int returnKeyWidthPX;


    public int smallTextHeightPX;

    public int row2_firstLeftRightMarginPX;
    public int row2_otherLeftRightMarginPX;

    public int childKeyWidthNormalPX;
    public int childKeyHeightNormalPX;

    public int parentShift_123_Delete_KeyWidthPX;
    public int parentShift_123_Delete_KeyHeightPX;

    public int childShift_123_Delete_KeyWidthNormalPX;
    public int childShift_123_Delete_KeyHeightNormalPX;

    public int screenWidth;
    public int screenHeight;


    public int keyboardHeight;

    public int shiftKeyIndexY = 2;
    public int shiftKeyIndexX = 0;

    public int delKeyIndexY = 2;
    public int delKeyIndexX = 8;

    public int specialKeyRowY = 3;

    public int specialKeyNumberX = 0;
    public int specialKeyEmoticonX = 1;
    public int specialKeyGlobalX = 2;
    public int specialKeySpacebarX = 3;
    public int specialKeyReturnX = 4;



    public KeyboardLayoutQWERTY(Context context)
    {
        super(context);
        init(context);
    }

    public KeyboardLayoutQWERTY(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public KeyboardLayoutQWERTY(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public  void init(Context context)
    {
        this.context = context;
        screenWidth = HWILib.getSharedObj().func03_getScreenSizeWidth(context);
        screenHeight = HWILib.getSharedObj().func03_getScreenSizeHeight(context);

        Log.d("HWI","스크린 사이즈 확인 --> 가로 사이즈 : "+screenWidth+" 세로 사이즈 : "+screenHeight);

        // 제플린 사이즈 = 360x640
        // 갤럭시 알파 = 720x1280

        int layoutWidth = HWILib.getSharedObj().func03_getScreenSizeWidth(context);
        keyboardHeight = (int)((screenHeight * 224.0) /640.0);

        Log.d("HWI","키보드 높이 -->  keyboardHeight : "+keyboardHeight);

        RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(layoutWidth,keyboardHeight);

        layoutParam.leftMargin = 0;
        layoutParam.topMargin = screenHeight - keyboardHeight - HWILib.getSharedObj().func05_getStatusBarHeight(context);

        this.setLayoutParams(layoutParam);


        initKeybaordWithLangAndLayout(MovingKeyLib.getSharedObj().func01_getSharedSetting().setting04_selectedSetGroup.get(0));
    }

    @Override
    public void initKeybaordWithLangAndLayout(LangAndLayout langAndLayout)
    {
        super.initKeybaordWithLangAndLayout(langAndLayout);

        Language selectedLang = MovingKeyLib.getSharedObj().func17_getLangStringArrFromLangAndLayout(langAndLayout);



        this.setBackgroundColor(0xffc4d2df);



        /// 행 별 컬럼 카운트 삽임 --> 일반쿼티의 경우 10,9,9,5 개이다.
        this.colCountArr = new ArrayList<>();
        this.colCountArr.add(10);
        this.colCountArr.add(9);
        this.colCountArr.add(9);
        this.colCountArr.add(5);

        this.firstLeftRightMarginArr = new ArrayList<>();
        this.firstLeftRightMarginArr.add(8);
        this.firstLeftRightMarginArr.add(26);
        this.firstLeftRightMarginArr.add(8);
        this.firstLeftRightMarginArr.add(8);




        this.smallTextColCountArr = new ArrayList<>();
        this.smallTextColCountArr.add(10);
        this.smallTextColCountArr.add(10);
        this.smallTextColCountArr.add(9);
        this.smallTextColCountArr.add(9);
        this.smallTextColCountArr.add(3);

        this.smallTextFirstLeftRightMarginArr = new ArrayList<>();
        this.smallTextFirstLeftRightMarginArr.add(8);
        this.smallTextFirstLeftRightMarginArr.add(8);
        this.smallTextFirstLeftRightMarginArr.add(26);
        this.smallTextFirstLeftRightMarginArr.add(8);
        this.smallTextFirstLeftRightMarginArr.add(48);


        /// 행 수
        rowCount = this.colCountArr.size();

        /// 첫번째 행의 상단 마진
        row1_topMarginPX = (int)(17.0 * keyboardHeight / 224.0);



        row1_parentKeyWidthNormalPX = (int)(Math.round((((360.0 - 16.0)/10.0) * screenWidth / 360.0) ));



        row1_parentKeyHeightFirstRowPX = (int)(((17.0 + 17.0/2.0 + 38.0) *  keyboardHeight / 224.0));
        row1_parentKeyHeightNormalPX = (int)( ((17.0 + 38.0) * keyboardHeight / 224.0)  );
        shift_del_ParentkeyWidthPX = (int)( Math.round(((40.0 + 7.0) * screenWidth / 360.0))  );
        numberKeyWidthPX = (int)(Math.round(   (40.0 + 13.0/2)*screenWidth / 360.0 ));
        spacebarKeyWidthPX = (int)(Math.round( (133.0 + 13.0) * screenWidth / 360.0 ));
        returnKeyWidthPX = (int)(Math.round( (68.0 + 13.0) * screenWidth / 360.0 ));

        childKeyHeightNormalPX = (int)( ((38.0) * keyboardHeight / 224.0)  );


        /// 일반키 배치
        int indexOfString = 0;
        for(int y=0; y < rowCount; y++)
        {

            int columnCount = this.colCountArr.get(y);
            int makedMarginParentTop = 0;
            int makedMarginChildTop = 0;

            int makedParentMarginLeft = 0;
            int makedChildMarginLeft = 0;

            for( int x = 0; x < columnCount; x++)
            {

                ParentKey oneParentLayout = new ParentKey(this.context);
                oneParentLayout.layoutType = langAndLayout.layout;

                ChildKey oneChildKey = new ChildKey(this.context);
                oneChildKey.layoutType = langAndLayout.layout;




                int makedParentWidth = 0;
                int makedChildWidth = 0;
                int makedParentHeight = 0;
                int makedChildHeight = 0;


                int leftMarginOfFirstCol = (int)(this.firstLeftRightMarginArr.get(y) * screenWidth / 360.0);


                /// 일반적인 경우 우선 적용
                makedParentWidth = row1_parentKeyWidthNormalPX;
                makedParentHeight = row1_parentKeyHeightNormalPX;


                makedChildHeight = (int)(38.0 * keyboardHeight / 224.0 );

                makedParentMarginLeft = leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x;


                makedMarginChildTop = (int)(17.0 * keyboardHeight / 224.0 ) + (int)(  (17.0 + 38.0) * keyboardHeight / 224.0 )  * y;

                if(y == 0)
                {
                    /// 첫번째 행일 경우 상단 마진 0
                    makedMarginParentTop = 0;
                    makedParentHeight = row1_parentKeyHeightFirstRowPX;

                }
                else
                {
                    makedMarginParentTop =  row1_parentKeyHeightFirstRowPX +  row1_parentKeyHeightNormalPX * (y-1);
                }

                /// 쉬프트키 인덱스일 경우 쉬프트키 크기 적용
                if( (y == shiftKeyIndexY && x == shiftKeyIndexX))
                {
                    makedParentWidth = shift_del_ParentkeyWidthPX;
                }
                /// 딜리트키 인덱스일 경우 딜리트키 크기 적용 및 왼쪽 여백 추가
                else if(delKeyIndexX == x && delKeyIndexY == y)
                {
                    makedParentWidth = shift_del_ParentkeyWidthPX;
                    makedParentMarginLeft += (int)(Math.round((40.0 - 28.0) * screenWidth / 360.0));

                }
                /// 쉬프트키 인덱스 옆쪽 열일 경우 왼쪽 여백 추가 필요
                else if(y == shiftKeyIndexY)
                {
                    makedParentMarginLeft += (int)(Math.round((40.0 - 28.0) * screenWidth / 360.0));
                }


                if(y == specialKeyRowY)
                {

                    if(x== specialKeyNumberX)
                    {
                        makedParentWidth = numberKeyWidthPX;
                    }
                    else if(x== specialKeyEmoticonX)
                    {
                        makedParentWidth = row1_parentKeyWidthNormalPX;
                        makedParentMarginLeft = (int)(Math.round( (61.0 - 13.0/2.0) * screenWidth / 360.0 ));

                    }
                    else if(x== specialKeyGlobalX)
                    {
                        makedParentWidth = row1_parentKeyWidthNormalPX;
                        makedParentMarginLeft = (int)(Math.round( (96.0 - 13.0/2.0) * screenWidth / 360.0 ));
                    }
                    else if(x== specialKeySpacebarX)
                    {
                        makedParentWidth = spacebarKeyWidthPX;
                        makedParentMarginLeft = (int)(Math.round( (137.0 - (13.0/2.0)) * screenWidth / 360.0 ));
                    }
                    else if(x== specialKeyReturnX)
                    {
                        makedParentWidth = returnKeyWidthPX;
                        makedParentMarginLeft = (int)(Math.round( (284.0 - (13.0/2.0) ) * screenWidth / 360.0 ));
                    }
                }


                makedChildWidth = makedParentWidth;

                if(indexOfString < selectedLang.hwi01_qwerty01_normalKey.size())
                {
                    String keyString = selectedLang.hwi01_qwerty01_normalKey.get(indexOfString);
                    indexOfString++;

                    oneParentLayout.matrixX = x;
                    oneParentLayout.matrixY = y;

                    oneChildKey.matrixX = x;
                    oneChildKey.matrixY = y;




                    RelativeLayout.LayoutParams layoutParamParent = new RelativeLayout.LayoutParams(makedParentWidth,makedParentHeight);
                    layoutParamParent.leftMargin = makedParentMarginLeft;
                    layoutParamParent.topMargin = makedMarginParentTop;

                    makedChildMarginLeft = makedParentMarginLeft;


                    RelativeLayout.LayoutParams layoutParamChild = new RelativeLayout.LayoutParams(makedChildWidth,makedChildHeight);
                    layoutParamChild.leftMargin = makedChildMarginLeft;
                    layoutParamChild.topMargin = makedMarginChildTop;


                    oneParentLayout.setLayoutParams(layoutParamParent);
                    oneParentLayout.keyString = keyString;

                    oneChildKey.setLayoutParams(layoutParamChild);
                    oneChildKey.keyString = keyString;
                    oneChildKey.setTextView();

                    Log.d("HWI","랜덤 색상확인");
//                    oneChildKey.setBackgroundColor(HWILib.getSharedObj().func04_getRandomColor());
//                    oneParentLayout.setBackgroundColor(HWILib.getSharedObj().func04_getRandomColor());

                    Log.d("HWI","일반키 패런트 출력");
                    Log.d("HWI"," y : "+y+" x : "+x+"  makedParentWidth : "+makedParentWidth+"  makedParentHeight : "+makedParentHeight+" layoutParam.leftMargin : "+layoutParamParent.leftMargin+"  layoutParam.topMargin : "+layoutParamParent.topMargin+" keyString : "+keyString);

                    /// 패런트 뷰 추가
                    addView(oneParentLayout);
                    addView(oneChildKey);
                }
                else
                {
                    Log.e("HWI","예외상황 발생 디버그 필요 001");
                }



            }

        }












        /// 스몰텍스트 평균 세로크기는 동일하다
        smallTextHeightPX = (int)(Math.round(17.0 * this.keyboardHeight / 224.0));


        /// 스몰텍스트 뷰 배치
        int indexOfSmallText = 0;
        for(int y=0; y < this.smallTextColCountArr.size(); y++)
        {
            int smallTextColCount = this.smallTextColCountArr.get(y);
            int leftMarginOfFirstCol = (int)(this.smallTextFirstLeftRightMarginArr.get(y) * screenWidth / 360.0);
            int makedWidth = row1_parentKeyWidthNormalPX;

            int makedMarginTop = 0;
            int makedMarginLeft = 0;

            for(int x=0; x < smallTextColCount; x++)
            {
                SmallTextV oneSmallTextV = new SmallTextV(context);

                /// 디버깅을 위해 랜덤컬러 입힘
//                oneSmallTextV.setBackgroundColor(HWILib.getSharedObj().func04_getRandomColor());

                String smallTextString = selectedLang.hwi01_qwerty03_smallText.get(indexOfSmallText );

                oneSmallTextV.setTextSize(TypedValue.COMPLEX_UNIT_PX, (float)((float)(smallTextHeightPX) * 4.0 / 5.0) );
                oneSmallTextV.setGravity(Gravity.CENTER);
                oneSmallTextV.setTextColor(0xff4188c7);
                oneSmallTextV.setText(smallTextString);
                oneSmallTextV.keyString = smallTextString;

                makedMarginLeft = leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x;
                int makedSmallTextHeight = smallTextHeightPX;

                makedMarginTop = (int)(  Math.round(  ((17 + 38) * this.keyboardHeight / 224.0) * y )  );


                if (y==0)
                {
                    /// 첫번째 행일 경우
                    makedMarginTop = 0;
                }
                else if(y == (smallTextColCountArr.size() - 2))
                {
                    /// 특수키들 위에 있는 스몰텍스트일 경우
                    makedMarginLeft = (leftMarginOfFirstCol +  shift_del_ParentkeyWidthPX +( row1_parentKeyWidthNormalPX) * (x-1));
                    if(x == 0)
                    {
                        /// 첫번째 열 일 경우
                        makedWidth =  shift_del_ParentkeyWidthPX;
                        makedMarginLeft = leftMarginOfFirstCol;
                    }
                    else if(x == ( smallTextColCount - 1) )
                    {
                        /// 마지막 열 일 경우
                        makedWidth =  shift_del_ParentkeyWidthPX;
                    }
                    else
                    {
                        /// 그 외에 다른 열들일 경우
                        makedWidth = row1_parentKeyWidthNormalPX;

                    }
                }

                else if(y == (smallTextColCountArr.size() - 1))
                {

                    /// 마지막 행일 경우
                    makedSmallTextHeight = childKeyHeightNormalPX;

                    makedMarginTop = (this.smallTextColCountArr.size() - 2) * childKeyHeightNormalPX + (this.smallTextColCountArr.size() -1) * smallTextHeightPX;
                    makedWidth =  (int)(Math.round( 13.0 * screenWidth / 360.0 ));
                    if(x == 0)
                    {
                        /// 첫번째 열 일 경우 --> 언어1

                        makedMarginLeft = (int)(Math.round( 48.0 * screenWidth / 360.0 ));
                    }
                    else if(x == 1 )
                    {
                        /// 두번째 열 일 경우 --> 언어2
                        makedMarginLeft = (int)(Math.round( 124.0 * screenWidth / 360.0 ));
                    }
                    else
                    {
                        /// 세번째 열 일 경우 --> 언어2
                        makedMarginLeft = (int)(Math.round( 270.0 * screenWidth / 360.0 ));
                    }

                }
                else
                {
                    /// 나머지 행들의 경우
                    makedMarginTop = (int)(  Math.round(  ((17 + 38) * this.keyboardHeight / 224.0) * y )  );
                }

                RelativeLayout.LayoutParams smallTextLayoutParam = new RelativeLayout.LayoutParams(makedWidth,makedSmallTextHeight);
                smallTextLayoutParam.leftMargin = makedMarginLeft;
                smallTextLayoutParam.topMargin = makedMarginTop;

                Log.d("HWI","스몰텍스트 출력");
                Log.d("HWI"," x : "+x+"  y : "+y+"  makedMarginLeft : "+makedMarginLeft+"  makedMarginTop : "+makedMarginTop+" makedWidth : "+makedWidth+"  smallTextString : "+smallTextString);

                oneSmallTextV.setLayoutParams(smallTextLayoutParam);

                /// 스몰텍스트 뷰 추가
                addView(oneSmallTextV);
                indexOfSmallText++;
            }


        }


    }
}
