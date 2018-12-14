package com.jaiky.test.faceview;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private List<View> pageViews;

    public ViewPagerAdapter(List<View> pageViews) {
        super();
        this.pageViews=pageViews;
    }

    @Override
    public int getCount() {
        return pageViews.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void destroyItem(ViewGroup arg0, int arg1, Object arg2) {
        arg0.removeView(pageViews.get(arg1));
    }

    @Override
    public Object instantiateItem(ViewGroup arg0, int arg1) {
        arg0.addView(pageViews.get(arg1));
        return pageViews.get(arg1);
    }
}
