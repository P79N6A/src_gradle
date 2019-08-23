package com.bytedance.ies.uikit.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.ref.WeakReference;

public abstract class WindowBuilder implements DialogInterface, View.OnKeyListener, View.OnTouchListener, WeakHandler.IHandler {
    public WeakReference<View> mAttachView;
    private boolean mBackDisable;
    private boolean mBlockDismiss;
    private boolean mCancelable;
    private WeakReference<Context> mContextRef;
    private boolean mCreated;
    private WeakHandler mHandler;
    private final boolean mNoToken;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private DialogInterface.OnKeyListener mOnKeyListener;
    private DialogInterface.OnShowListener mOnShowListener;
    public Runnable mPendingShowRunnable;
    protected ViewGroup mRootView;
    public IBinder mToken;
    protected WindowBase mWindowBase;

    public abstract ViewGroup getRootView();

    public abstract WindowBase getWindowBase();

    public boolean onBackPressed() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
    }

    public void onDismissEvent(int i) {
    }

    public void requestBlockDismiss() {
        this.mBlockDismiss = true;
    }

    public void dismiss() {
        close();
    }

    public WindowBuilder() {
        this((View) null);
    }

    public void close() {
        close(-1);
    }

    public boolean isShowing() {
        return this.mWindowBase.isShowing();
    }

    /* access modifiers changed from: protected */
    public void onShow() {
        this.mHandler.sendEmptyMessage(69);
    }

    public void show() {
        show(0, 0);
    }

    public void cancel() {
        this.mHandler.sendEmptyMessage(68);
        close();
    }

    public Context getContext() {
        if (this.mContextRef != null) {
            return (Context) this.mContextRef.get();
        }
        return null;
    }

    public WindowManager getWindowManager() {
        if (this.mWindowBase != null) {
            return this.mWindowBase.getWindowManager();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onPreShow() {
        if (!this.mCreated) {
            dispatchOnCreate(null);
        }
    }

    private void initBuilder() {
        this.mWindowBase = getWindowBase();
        if (this.mWindowBase != null) {
            this.mRootView = getRootView();
            if (this.mRootView != null) {
                this.mRootView.setFocusableInTouchMode(true);
                this.mRootView.setOnKeyListener(this);
                this.mRootView.setOnTouchListener(this);
                return;
            }
            throw new NullPointerException("getRootView() can't return null");
        }
        throw new NullPointerException("getWindowBase() can't return null");
    }

    public void setBackDisable(boolean z) {
        this.mBackDisable = z;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        this.mCancelable = z;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.mOnKeyListener = onKeyListener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public View findViewById(int i) {
        return this.mRootView.findViewById(i);
    }

    public WindowBuilder(Activity activity) {
        this(activity.getWindow().getDecorView());
    }

    public static void closeSelf(WindowBuilder windowBuilder) {
        if (windowBuilder != null && windowBuilder.isShowing()) {
            windowBuilder.close();
        }
    }

    public void dispatchDismissEvent(int i) {
        this.mHandler.sendEmptyMessage(67);
        onDismissEvent(i);
    }

    /* access modifiers changed from: protected */
    public void dispatchOnCreate(Bundle bundle) {
        if (!this.mCreated) {
            onCreate(bundle);
            this.mCreated = true;
        }
    }

    public void update(WindowManager.LayoutParams layoutParams) {
        this.mWindowBase.update(layoutParams);
    }

    public void close(int i) {
        dispatchDismissEvent(i);
        if (!this.mBlockDismiss) {
            this.mWindowBase.remove();
        } else {
            this.mBlockDismiss = false;
        }
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case 67:
                if (this.mOnDismissListener != null) {
                    this.mOnDismissListener.onDismiss(this);
                    return;
                }
                break;
            case 68:
                if (this.mOnCancelListener != null) {
                    this.mOnCancelListener.onCancel(this);
                    return;
                }
                break;
            case 69:
                if (this.mOnShowListener != null) {
                    this.mOnShowListener.onShow(this);
                    break;
                }
                break;
        }
    }

    public WindowBuilder(View view) {
        boolean z;
        IBinder iBinder;
        this.mHandler = new WeakHandler(this);
        if (view == null) {
            z = true;
        } else {
            z = false;
        }
        this.mNoToken = z;
        if (this.mNoToken) {
            iBinder = null;
        } else {
            iBinder = view.getWindowToken();
        }
        this.mToken = iBinder;
        if (this.mToken == null && !this.mNoToken) {
            this.mAttachView = new WeakReference<>(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    View view = (View) WindowBuilder.this.mAttachView.get();
                    if (view != null) {
                        WindowBuilder.this.mAttachView.clear();
                        WindowBuilder.this.mAttachView = null;
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        if (WindowBuilder.this.mToken == null) {
                            WindowBuilder.this.mToken = view.getWindowToken();
                        }
                        if (WindowBuilder.this.mToken != null && WindowBuilder.this.mPendingShowRunnable != null) {
                            if (!WindowBuilder.this.isShowing()) {
                                WindowBuilder.this.mPendingShowRunnable.run();
                            }
                            WindowBuilder.this.mPendingShowRunnable = null;
                        }
                    }
                }
            });
        }
        if (view != null) {
            this.mContextRef = new WeakReference<>(view.getContext());
        }
        initBuilder();
    }

    public void update(int i, int i2) {
        this.mWindowBase.update(i, i2);
    }

    public void setFlags(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.mWindowBase.getLayoutParams();
        layoutParams.flags = (i & i2) | (layoutParams.flags & (i2 ^ -1));
    }

    public void startAnimation(int i, Animation animation) {
        this.mRootView.findViewById(i).startAnimation(animation);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mCancelable) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0 && (x < 0 || x >= this.mRootView.getWidth() || y < 0 || y >= this.mRootView.getHeight())) {
            close(-3);
            return true;
        } else if (motionEvent.getAction() != 4) {
            return false;
        } else {
            close(-3);
            return true;
        }
    }

    public void show(final int i, final int i2) {
        if (this.mNoToken || this.mToken != null) {
            onPreShow();
            this.mWindowBase.show(this.mRootView, i, i2, this.mToken);
            onShow();
            return;
        }
        this.mPendingShowRunnable = new Runnable() {
            public void run() {
                WindowBuilder.this.onPreShow();
                WindowBuilder.this.mWindowBase.show(WindowBuilder.this.mRootView, i, i2, WindowBuilder.this.mToken);
                WindowBuilder.this.onShow();
            }
        };
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.mBackDisable) {
            return false;
        }
        if (this.mOnKeyListener != null && this.mOnKeyListener.onKey(this, i, keyEvent)) {
            return true;
        }
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!onBackPressed()) {
            close(-2);
        }
        return true;
    }
}
