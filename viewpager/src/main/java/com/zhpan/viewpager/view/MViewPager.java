package com.zhpan.viewpager.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @Author zhangpan
 * @Time:2018/11/14 15:24
 * @Description:
 */
public class MViewPager extends ViewPager {
    public MViewPager(Context context) {
        this(context,null);
    }

    public MViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
