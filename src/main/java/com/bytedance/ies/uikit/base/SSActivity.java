package com.bytedance.ies.uikit.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.ICustomToast;
import com.bytedance.ies.uikit.toast.CustomToast;
import com.bytedance.ies.uikit.toast.IDurationToast;
import com.bytedance.ies.uikit.toast.IToastType;
import com.bytedance.ies.uikit.toast.ToastAnimation;
import com.ss.android.ugc.aweme.C0906R;

public class SSActivity extends AbsActivity implements ICustomToast, IDurationToast, IToastType {
    private static WindowFocusChangeListener mWindowFocusLisenter;
    protected int mActivityAnimType;
    private CustomToast mCustomToast;
    private boolean mHideCustomToastStatusBar;

    public interface WindowFocusChangeListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    public void hideCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = true;
    }

    public void overridePendingTransition(int i, int i2) {
    }

    public void showCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = false;
    }

    public int showToastType() {
        return 1;
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException unused) {
            finish();
        }
    }

    public void dismissCustomToast() {
        if (this.mCustomToast != null) {
            this.mCustomToast.dismiss();
        }
    }

    public void finish() {
        super.finish();
        ActivityTransUtils.finishActivityAnim(this, this.mActivityAnimType);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCustomToast != null) {
            this.mCustomToast.onDestroyed();
            this.mCustomToast = null;
        }
    }

    public void onPause() {
        super.onPause();
        if (this.mCustomToast != null) {
            this.mCustomToast.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.mCustomToast != null) {
            this.mCustomToast.onResume();
        }
    }

    public int titleToastMargin() {
        return getResources().getDimensionPixelSize(C0906R.dimen.m6);
    }

    private void ensureCustomToast() {
        if (this.mCustomToast == null) {
            if (showToastType() == 0) {
                this.mCustomToast = new CustomToast(this);
                this.mCustomToast.setGravity(48).setMarginTop(titleToastMargin());
                return;
            }
            this.mCustomToast = new CustomToast((Context) this, (int) C0906R.layout.hx);
            this.mCustomToast.setGravity(17).setShowAndHideAnimatorSet(ToastAnimation.showAlpha(this.mCustomToast.getContentView()), ToastAnimation.hideAlpha(this.mCustomToast.getContentView()));
        }
    }

    public static void setWindowFocusLisenter(WindowFocusChangeListener windowFocusChangeListener) {
        mWindowFocusLisenter = windowFocusChangeListener;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHideCustomToastStatusBar = false;
        ActivityTransUtils.startActivityAnim(this, this.mActivityAnimType);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (mWindowFocusLisenter != null) {
            mWindowFocusLisenter.onWindowFocusChanged(this, z);
        }
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.showToast(str);
        }
    }

    public void superOverridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.showToast(str, i);
        }
    }

    public void showCustomToast(int i, String str) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.showToast(str, i);
        }
    }

    public void showCustomToast(String str, long j) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.setDuration(j).showToast(str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mCustomToast != null) {
            this.mCustomToast.onResume();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void showCustomToast(String str, int i, int i2) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.setGravity(i2).setDuration((long) i).showToast(str);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            ensureCustomToast();
            this.mCustomToast.setDuration((long) i2).setGravity(i3).showToast(str, i);
        }
    }
}
