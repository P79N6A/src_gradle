package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.react.views.common.ViewHelper;
import javax.annotation.Nullable;

public class ReactViewBackgroundManager {
    @Nullable
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private View mView;

    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(this.mView.getContext());
            Drawable background = this.mView.getBackground();
            ViewHelper.setBackground(this.mView, null);
            if (background == null) {
                ViewHelper.setBackground(this.mView, this.mReactBackgroundDrawable);
            } else {
                ViewHelper.setBackground(this.mView, new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
        }
        return this.mReactBackgroundDrawable;
    }

    public ReactViewBackgroundManager(View view) {
        this.mView = view;
    }

    public void setBorderRadius(float f2) {
        getOrCreateReactViewBackground().setRadius(f2);
    }

    public void setBorderStyle(@Nullable String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public void setBorderWidth(int i, float f2) {
        getOrCreateReactViewBackground().setBorderWidth(i, f2);
    }

    public void setBorderRadius(float f2, int i) {
        getOrCreateReactViewBackground().setRadius(f2, i);
    }

    public void setBorderColor(int i, float f2, float f3) {
        getOrCreateReactViewBackground().setBorderColor(i, f2, f3);
    }
}
