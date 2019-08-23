package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

public abstract class AbsPagerAdapter extends PagerAdapter {
    protected final Context mContext;
    protected final LayoutInflater mInflater;
    protected final LinkedList<View> mScrapViews = new LinkedList<>();

    /* access modifiers changed from: protected */
    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void unbindView(View view) {
    }

    public AbsPagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
        this.mContext = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.mScrapViews.isEmpty()) {
            view = this.mScrapViews.removeFirst();
        } else {
            view = null;
        }
        View view2 = getView(i, view, viewGroup);
        viewGroup.addView(view2);
        return view2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.mScrapViews.add(view);
            unbindView(view);
        }
    }
}
