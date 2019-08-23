package com.gyf.barlibrary;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;

public class FitsKeyboard implements ViewTreeObserver.OnGlobalLayoutListener {
    private final int mActionBarHeight;
    private Activity mActivity;
    private View mChildView;
    private View mContentView;
    private View mDecorView = this.mWindow.getDecorView();
    private ImmersionBar mImmersionBar;
    private boolean mIsAddListener;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private final int mStatusBarHeight;
    private int mTempKeyboardHeight;
    private Window mWindow;

    /* access modifiers changed from: package-private */
    public void cancel() {
        if (Build.VERSION.SDK_INT >= 19 && this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.mIsAddListener = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void disable() {
        if (Build.VERSION.SDK_INT >= 19 && this.mIsAddListener) {
            if (this.mChildView != null) {
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
                return;
            }
            this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
        }
    }

    public void onGlobalLayout() {
        int i;
        if (this.mImmersionBar != null && this.mImmersionBar.getBarParams() != null && this.mImmersionBar.getBarParams().keyboardEnable) {
            int navigationBarHeight = ImmersionBar.getNavigationBarHeight(this.mActivity);
            Rect rect = new Rect();
            this.mDecorView.getWindowVisibleDisplayFrame(rect);
            int height = this.mContentView.getHeight() - rect.bottom;
            if (height != this.mTempKeyboardHeight) {
                this.mTempKeyboardHeight = height;
                boolean z = true;
                if (ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(16908290))) {
                    height -= navigationBarHeight;
                    if (height <= navigationBarHeight) {
                        z = false;
                    }
                } else if (this.mChildView != null) {
                    if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                        height += this.mActionBarHeight + this.mStatusBarHeight;
                    }
                    if (this.mImmersionBar.getBarParams().fits) {
                        height += this.mStatusBarHeight;
                    }
                    if (height > navigationBarHeight) {
                        i = this.mPaddingBottom + height;
                    } else {
                        i = 0;
                        z = false;
                    }
                    this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i);
                } else {
                    int paddingBottom = this.mImmersionBar.getPaddingBottom();
                    height -= navigationBarHeight;
                    if (height > navigationBarHeight) {
                        paddingBottom = height + navigationBarHeight;
                    } else {
                        z = false;
                    }
                    this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
                }
                if (height < 0) {
                    height = 0;
                }
                if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                    this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, height);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void enable(int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mWindow.setSoftInputMode(i);
            if (!this.mIsAddListener) {
                this.mDecorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.mIsAddListener = true;
            }
        }
    }

    FitsKeyboard(ImmersionBar immersionBar, Activity activity, Window window) {
        this.mImmersionBar = immersionBar;
        this.mActivity = activity;
        this.mWindow = window;
        FrameLayout frameLayout = (FrameLayout) this.mDecorView.findViewById(16908290);
        this.mChildView = frameLayout.getChildAt(0);
        if (this.mChildView != null) {
            if (this.mChildView instanceof DrawerLayout) {
                this.mChildView = ((DrawerLayout) this.mChildView).getChildAt(0);
            }
            if (this.mChildView != null) {
                this.mPaddingLeft = this.mChildView.getPaddingLeft();
                this.mPaddingTop = this.mChildView.getPaddingTop();
                this.mPaddingRight = this.mChildView.getPaddingRight();
                this.mPaddingBottom = this.mChildView.getPaddingBottom();
            }
        }
        this.mContentView = this.mChildView != null ? this.mChildView : frameLayout;
        BarConfig barConfig = new BarConfig(this.mActivity);
        this.mStatusBarHeight = barConfig.getStatusBarHeight();
        this.mActionBarHeight = barConfig.getActionBarHeight();
    }
}
