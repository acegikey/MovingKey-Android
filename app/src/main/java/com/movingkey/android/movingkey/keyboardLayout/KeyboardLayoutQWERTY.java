package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;

import java.util.ArrayList;

/**
 * Created by hwi on 2016. 9. 9..
 */
public class KeyboardLayoutQWERTY extends KeyboardLayoutParent
{

    Context context;

    public ArrayList<Integer> colCountArr;
    public int rowCount;

    public int row1_colCount;
    public int row2_colCount;
    public int row3_colCount;
    public int row4_colCount;
    public int row5_colCount;

    public int row1_topMarginPX;
    public int row1_firstLeftRightMarginPX;
    public int row1_otherLeftRightMarginPX;

    public int row1_parentKeyWidthFirstAndLastPX;
    public int row1_parentKeyWidthNormalPX;

    public int row1_parentKeyHeightFirstRowPX;
    public int row1_parentKeyHeightNormalPX;

    public int childKeyWidthNormalPX;
    public int childKeyHeightNormalPX;

    public int parentShift_123_Delete_KeyWidthPX;
    public int parentShift_123_Delete_KeyHeightPX;

    public int childShift_123_Delete_KeyWidthNormalPX;
    public int childShift_123_Delete_KeyHeightNormalPX;

    public int screenWidth;
    public int screenHeight;


    public int keyboardHeight;

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



        int layoutWidth = HWILib.getSharedObj().func03_getScreenSizeWidth(context);
        keyboardHeight = (int)(HWILib.getSharedObj().func03_getScreenSizeHeight(context) * (224.0/640.0));



        RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(layoutWidth,keyboardHeight);

        layoutParam.leftMargin = 0;
        layoutParam.topMargin = HWILib.getSharedObj().func03_getScreenSizeHeight(context) - keyboardHeight - HWILib.getSharedObj().func05_getStatusBarHeight(context);

        this.setLayoutParams(layoutParam);


        initKeybaordWithLangAndLayout(MovingKeyLib.getSharedObj().func01_getSharedSetting().setting04_selectedSetGroup.get(0));
    }

    @Override
    public void initKeybaordWithLangAndLayout(LangAndLayout langAndLayout)
    {
        super.initKeybaordWithLangAndLayout(langAndLayout);


        this.colCountArr = new ArrayList<>();
        this.colCountArr.add(10);
        this.colCountArr.add(9);
        this.colCountArr.add(9);
        this.colCountArr.add(5);

        rowCount = this.colCountArr.size();



        row1_topMarginPX = (int)(17.0 * keyboardHeight / 224.0);

        row1_firstLeftRightMarginPX = (int)(8.0 * screenWidth / 360.0);
        row1_otherLeftRightMarginPX = 0;

        row1_parentKeyWidthNormalPX = (int)((((360.0 - 16.0)/10.0) * screenWidth / 360.0) );
        row1_parentKeyWidthFirstAndLastPX = row1_parentKeyWidthNormalPX + (int)(screenWidth * 8.0 / 360.0 );


        row1_parentKeyHeightFirstRowPX = (int)(((17.0 + 17.0/2.0 + 38.0) *  keyboardHeight / 224.0));
        row1_parentKeyHeightNormalPX = (int)( ((17.0 + 38.0) * keyboardHeight / 224.0)  );


        for(int i=0; i < rowCount; i++)
        {
            int columnCount = this.colCountArr.get(i);
            int makedMarginTop = 0;
            int makedMarginLeft = 0;

            for( int j = 0; j < columnCount; j++)
            {
                int makedWidth = 0;
                int makedHeight = 0;

                /// 일반적인 경우 우선 적용
                makedWidth = row1_parentKeyWidthNormalPX;
                makedHeight = row1_parentKeyHeightNormalPX;
                makedMarginLeft = row1_firstLeftRightMarginPX + (row1_otherLeftRightMarginPX + row1_parentKeyWidthNormalPX) * j;

                /// 첫번째 행일 경우 상단 마진 0
                if(i == 0)
                {
                    makedMarginTop = 0;
                }
                else
                {
                    makedMarginTop =  row1_parentKeyHeightFirstRowPX +  row1_parentKeyHeightNormalPX * (i-1);
                }



                if(i==0 && j==0)
                {
                    makedWidth = row1_parentKeyWidthFirstAndLastPX;
                    makedHeight = row1_parentKeyHeightFirstRowPX;
                    makedMarginLeft = 0;
                    makedMarginTop = 0;
                }
                else if(i == 0 && j == (columnCount-1))
                {
                    makedWidth = row1_parentKeyWidthFirstAndLastPX;
                    makedHeight = row1_parentKeyHeightFirstRowPX;
                }
                else if(i==0)
                {
                    makedHeight = row1_parentKeyHeightFirstRowPX;

                }



                RelativeLayout oneParentLayout = new RelativeLayout(this.context);


                RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(makedWidth,makedHeight);
                layoutParam.leftMargin = makedMarginLeft;
                layoutParam.topMargin = makedMarginTop;

                oneParentLayout.setLayoutParams(layoutParam);
                oneParentLayout.setBackgroundColor(HWILib.getSharedObj().func04_getRandomColor());

                Log.d("HWI"," i : "+i+" j : "+j+"  makedWidth : "+makedWidth+"  makedHeight : "+makedHeight+" layoutParam.leftMargin : "+layoutParam.leftMargin+"  layoutParam.topMargin : "+layoutParam.topMargin);

                addView(oneParentLayout);
            }

        }


    }
}
