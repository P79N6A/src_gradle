package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

public abstract class a extends FrameLayout implements e {
    protected int mColorMode;
    protected DmtTextView mTitleView;

    public abstract void onColorModeChange(int i);

    public abstract void setDividerLineBackground(@ColorInt int i);

    public abstract void showDividerLine(boolean z);

    public int getColorMode() {
        return this.mColorMode;
    }

    public DmtTextView getTitleView() {
        return this.mTitleView;
    }

    public a(@NonNull Context context) {
        super(context);
    }

    public void setColorMode(int i) {
        if (this.mColorMode != i) {
            this.mColorMode = i;
            onColorModeChange(this.mColorMode);
        }
        this.mColorMode = i;
    }

    public void setTitle(@StringRes int i) {
        if (this.mTitleView != null) {
            this.mTitleView.setText(i);
        }
    }

    public void setTitleColor(@ColorInt int i) {
        if (this.mTitleView != null) {
            this.mTitleView.setTextColor(i);
        }
    }

    public void setTitleSize(float f2) {
        if (this.mTitleView != null) {
            this.mTitleView.setTextSize(f2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.mTitleView != null) {
            this.mTitleView.setText(charSequence);
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
