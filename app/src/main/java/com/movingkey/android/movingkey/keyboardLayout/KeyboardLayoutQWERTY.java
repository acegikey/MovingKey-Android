package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
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


        /// 일반키 배치
        int indexOfString = 0;
        for(int y=0; y < rowCount; y++)
        {

            int columnCount = this.colCountArr.get(y);
            int makedMarginTop = 0;
            int makedMarginLeft = 0;

            for( int x = 0; x < columnCount; x++)
            {

                ParentKey oneParentLayout = new ParentKey(this.context);
                oneParentLayout.layoutType = langAndLayout.layout;


                int makedWidth = 0;
                int makedHeight = 0;

                int leftMarginOfFirstCol = (int)(this.firstLeftRightMarginArr.get(y) * screenWidth / 360.0);


                /// 일반적인 경우 우선 적용
                makedWidth = row1_parentKeyWidthNormalPX;
                makedHeight = row1_parentKeyHeightNormalPX;
                makedMarginLeft = leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x;

                /// 첫번째 행일 경우 상단 마진 0
                if(y == 0)
                {
                    makedMarginTop = 0;
                    makedHeight = row1_parentKeyHeightFirstRowPX;
                }
                else
                {
                    makedMarginTop =  row1_parentKeyHeightFirstRowPX +  row1_parentKeyHeightNormalPX * (y-1);
                }

                /// 쉬프트키 인덱스일 경우 쉬프트키 크기 적용
                if( (y == shiftKeyIndexY && x == shiftKeyIndexX))
                {
                    makedWidth = shift_del_ParentkeyWidthPX;
                }
                /// 딜리트키 인덱스일 경우 딜리트키 크기 적용 및 왼쪽 여백 추가
                else if(delKeyIndexX == x && delKeyIndexY == y)
                {
                    makedWidth = shift_del_ParentkeyWidthPX;
                    makedMarginLeft += (int)(Math.round((40.0 - 28.0) * screenWidth / 360.0));
                }
                /// 쉬프트키 인덱스 옆쪽 열일 경우 왼쪽 여백 추가 필요
                else if(y == shiftKeyIndexY)
                {
                    makedMarginLeft += (int)(Math.round((40.0 - 28.0) * screenWidth / 360.0));
                }


                if(y == specialKeyRowY)
                {
                    if(x== specialKeyNumberX)
                    {
                        makedWidth = numberKeyWidthPX;
                    }
                    else if(x== specialKeyEmoticonX)
                    {
                        makedWidth = row1_parentKeyWidthNormalPX;
                        makedMarginLeft = (int)(Math.round( (61.0 - 13.0/2.0) * screenWidth / 360.0 ));

                    }
                    else if(x== specialKeyGlobalX)
                    {
                        makedWidth = row1_parentKeyWidthNormalPX;
                        makedMarginLeft = (int)(Math.round( (96.0 - 13.0/2.0) * screenWidth / 360.0 ));
                    }
                    else if(x== specialKeySpacebarX)
                    {
                        makedWidth = spacebarKeyWidthPX;
                        makedMarginLeft = (int)(Math.round( (137.0 - 13.0) * screenWidth / 360.0 ));
                    }
                    else if(x== specialKeyReturnX)
                    {
                        makedWidth = returnKeyWidthPX;
                        makedMarginLeft = (int)(Math.round( (284.0 - 13.0 ) * screenWidth / 360.0 ));
                    }
                }




                if(indexOfString < selectedLang.hwi01_qwerty01_normalKey.size())
                {
                    String keyString = selectedLang.hwi01_qwerty01_normalKey.get(indexOfString);
                    indexOfString++;

                    oneParentLayout.matrixX = x;
                    oneParentLayout.matrixY = y;

                    RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(makedWidth,makedHeight);
                    layoutParam.leftMargin = makedMarginLeft;
                    layoutParam.topMargin = makedMarginTop;

                    oneParentLayout.setLayoutParams(layoutParam);
                    oneParentLayout.keyString = keyString;




                    oneParentLayout.setBackgroundColor(HWILib.getSharedObj().func04_getRandomColor());

                    Log.d("HWI"," y : "+y+" x : "+x+"  makedWidth : "+makedWidth+"  makedHeight : "+makedHeight+" layoutParam.leftMargin : "+layoutParam.leftMargin+"  layoutParam.topMargin : "+layoutParam.topMargin+" keyString : "+keyString);

                    /// 패런트 뷰 추가
                    addView(oneParentLayout);
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
                oneSmallTextV.setBackgroundColor(0xff00ff00);


                makedMarginLeft = leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x;
                if (y==0)
                {
                    makedMarginTop = 0;
                }
                else if(y == (smallTextColCountArr.size() - 1))
                {
                    if(x == 0)
                    {
                        makedWidth =  shift_del_ParentkeyWidthPX;
                    }
                    else if(x == ( smallTextColCount - 1) )
                    {
                        makedWidth =  shift_del_ParentkeyWidthPX;
                        makedMarginLeft = (leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x) + (shift_del_ParentkeyWidthPX - row1_parentKeyWidthNormalPX);
                    }
                    else
                    {
                        makedMarginLeft = (leftMarginOfFirstCol + ( row1_parentKeyWidthNormalPX) * x) + (shift_del_ParentkeyWidthPX - row1_parentKeyWidthNormalPX);
                    }

                }
                else
                {
                    makedMarginTop = (int)(  Math.round(  ((17 + 38) * this.keyboardHeight / 224.0) * y )  );
                }

                RelativeLayout.LayoutParams smallTextLayoutParam = new RelativeLayout.LayoutParams(makedWidth,smallTextHeightPX);
                smallTextLayoutParam.leftMargin = makedMarginLeft;
                smallTextLayoutParam.topMargin = makedMarginTop;

                oneSmallTextV.setLayoutParams(smallTextLayoutParam);

                /// 스몰텍스트 뷰 추가
                addView(oneSmallTextV);

            }


        }


    }
}
