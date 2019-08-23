package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import java.util.ArrayList;

public class ViewPagerShower extends LinearLayout {
    private ArrayList<ImageView> mAl = new ArrayList<>();
    private final LinearLayout.LayoutParams mLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    private Drawable mNormalDrawable;
    private int mNow = -1;
    private Drawable mSelectedDrawable;

    public ViewPagerShower(Context context) {
        super(context);
    }

    public void onPageSelect(int i) {
        if (this.mAl != null && !this.mAl.isEmpty()) {
            if (this.mNow >= 0 && this.mNow < this.mAl.size()) {
                if (this.mNormalDrawable != null) {
                    this.mAl.get(this.mNow).setImageDrawable(this.mNormalDrawable);
                } else {
                    this.mAl.get(this.mNow).setImageResource(2130838578);
                }
            }
            if (i >= 0 && i < this.mAl.size()) {
                if (this.mSelectedDrawable != null) {
                    this.mAl.get(i).setImageDrawable(this.mSelectedDrawable);
                } else {
                    this.mAl.get(i).setImageResource(2130838577);
                }
                this.mNow = i;
            }
        }
    }

    public void initDrawable(Drawable drawable, Drawable drawable2) {
        this.mNormalDrawable = drawable;
        this.mSelectedDrawable = drawable2;
    }

    public ViewPagerShower(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void initViews(int i, int i2) {
        removeAllViews();
        this.mAl.clear();
        for (int i3 = 0; i3 < i; i3++) {
            ImageView imageView = new ImageView(getContext());
            if (this.mNormalDrawable != null) {
                imageView.setImageDrawable(this.mNormalDrawable);
            } else {
                imageView.setImageResource(2130838578);
            }
            if (i3 < i - 1) {
                this.mLayoutParams.setMargins(0, 0, (int) UIUtils.dip2Px(getContext(), 10.0f), 0);
                addView(imageView, this.mLayoutParams);
            } else {
                addView(imageView);
            }
            this.mAl.add(imageView);
        }
        onPageSelect(i2);
    }
}
