package com.bytedance.ies.uikit.dialog;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;

public abstract class WindowBase {
    protected Context mContext;
    private long mLastShowTime;
    private WindowManager.LayoutParams mLayoutParams = initLayoutParams();
    private boolean mShow;
    private View mView;
    private WindowManager mWindowManager = ((WindowManager) this.mContext.getSystemService("window"));

    /* access modifiers changed from: protected */
    public abstract WindowManager.LayoutParams initLayoutParams();

    public WindowManager.LayoutParams getLayoutParams() {
        return this.mLayoutParams;
    }

    public WindowManager getWindowManager() {
        return this.mWindowManager;
    }

    /* access modifiers changed from: package-private */
    public boolean isShowing() {
        return this.mShow;
    }

    private boolean checkInterval() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastShowTime < 20) {
            return true;
        }
        this.mLastShowTime = currentTimeMillis;
        return false;
    }

    public void remove() {
        if (this.mShow && !checkInterval() && this.mWindowManager != null && this.mView != null) {
            try {
                this.mWindowManager.removeViewImmediate(this.mView);
                this.mShow = false;
            } catch (Exception unused) {
            }
        }
    }

    public WindowBase(Context context) {
        this.mContext = context;
        if (this.mLayoutParams == null) {
            throw new NullPointerException("initLayoutParams() can't return null");
        }
    }

    public void update(WindowManager.LayoutParams layoutParams) {
        if (!(!this.mShow || this.mWindowManager == null || this.mView == null)) {
            try {
                this.mLayoutParams = layoutParams;
                this.mWindowManager.updateViewLayout(this.mView, this.mLayoutParams);
            } catch (Exception unused) {
            }
        }
    }

    public void show(View view, IBinder iBinder) {
        show(view, 0, 0, iBinder);
    }

    public void update(int i, int i2) {
        if (!(!this.mShow || this.mWindowManager == null || this.mView == null)) {
            try {
                this.mLayoutParams.x = i;
                this.mLayoutParams.y = i2;
                this.mWindowManager.updateViewLayout(this.mView, this.mLayoutParams);
            } catch (Exception unused) {
            }
        }
    }

    public void show(View view, int i, int i2, IBinder iBinder) {
        if (!this.mShow && !checkInterval()) {
            this.mView = view;
            if (!(this.mWindowManager == null || this.mView == null)) {
                if (iBinder != null) {
                    try {
                        this.mLayoutParams.token = iBinder;
                    } catch (Exception unused) {
                    }
                }
                this.mLayoutParams.x = i;
                this.mLayoutParams.y = i2;
                this.mWindowManager.addView(this.mView, this.mLayoutParams);
                this.mShow = true;
            }
        }
    }
}
