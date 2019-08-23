package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import java.util.ArrayList;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    private String mAnimationType;
    @Nullable
    private Dialog mDialog;
    private boolean mHardwareAccelerated;
    private DialogRootViewGroup mHostView;
    @Nullable
    public OnRequestCloseListener mOnRequestCloseListener;
    @Nullable
    private DialogInterface.OnShowListener mOnShowListener;
    private boolean mPropertyRequiresNewDialog;
    private boolean mTransparent;

    static class DialogRootViewGroup extends ReactViewGroup implements RootView {
        private final JSTouchDispatcher mJSTouchDispatcher = new JSTouchDispatcher(this);

        public void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public ReactContext getReactContext() {
            return (ReactContext) getContext();
        }

        private EventDispatcher getEventDispatcher() {
            return ((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public DialogRootViewGroup(Context context) {
            super(context);
        }

        public void handleException(Throwable th) {
            getReactContext().handleException(new RuntimeException(th));
        }

        public void onChildStartedNativeGesture(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, getEventDispatcher());
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            return super.onInterceptTouchEvent(motionEvent);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                final int id = getChildAt(0).getId();
                ReactContext reactContext = getReactContext();
                final int i5 = i;
                final int i6 = i2;
                AnonymousClass1 r0 = new GuardedRunnable(reactContext) {
                    public void runGuarded() {
                        ((UIManagerModule) DialogRootViewGroup.this.getReactContext().getNativeModule(UIManagerModule.class)).updateNodeSize(id, i5, i6);
                    }
                };
                reactContext.runOnLayoutThread(r0);
            }
        }
    }

    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dialog.dismiss();
                return;
            }
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void onHostPause() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @VisibleForTesting
    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public void onHostDestroy() {
        onDropInstance();
    }

    public void onHostResume() {
        showOrUpdate();
    }

    public int getChildCount() {
        return this.mHostView.getChildCount();
    }

    @Nullable
    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    public void onDropInstance() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        dismiss();
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.mHostView);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private void dismiss() {
        if (this.mDialog != null) {
            Activity currentActivity = getCurrentActivity();
            if (this.mDialog.isShowing() && (currentActivity == null || !currentActivity.isFinishing())) {
                _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.mDialog);
            }
            this.mDialog = null;
            ((ViewGroup) this.mHostView.getParent()).removeViewAt(0);
        }
    }

    private void updateProperties() {
        com.facebook.infer.annotation.a.a(this.mDialog, "mDialog must exist when we call updateProperties");
        if (this.mTransparent) {
            this.mDialog.getWindow().clearFlags(2);
            return;
        }
        this.mDialog.getWindow().setDimAmount(0.5f);
        this.mDialog.getWindow().setFlags(2, 2);
    }

    /* access modifiers changed from: protected */
    public void showOrUpdate() {
        Context context;
        if (this.mDialog != null) {
            if (this.mPropertyRequiresNewDialog) {
                dismiss();
            } else {
                updateProperties();
                return;
            }
        }
        this.mPropertyRequiresNewDialog = false;
        int i = C0906R.style.lc;
        if (this.mAnimationType.equals("fade")) {
            i = C0906R.style.ld;
        } else if (this.mAnimationType.equals("slide")) {
            i = C0906R.style.le;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            context = getContext();
        } else {
            context = currentActivity;
        }
        this.mDialog = new Dialog(context, i);
        this.mDialog.setContentView(getContentView());
        updateProperties();
        this.mDialog.setOnShowListener(this.mOnShowListener);
        this.mDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1) {
                    if (i == 4) {
                        com.facebook.infer.annotation.a.a(ReactModalHostView.this.mOnRequestCloseListener, "setOnRequestCloseListener must be called by the manager");
                        ReactModalHostView.this.mOnRequestCloseListener.onRequestClose(dialogInterface);
                        return true;
                    }
                    Activity currentActivity = ((ReactContext) ReactModalHostView.this.getContext()).getCurrentActivity();
                    if (currentActivity != null) {
                        return currentActivity.onKeyUp(i, keyEvent);
                    }
                }
                return false;
            }
        });
        this.mDialog.getWindow().setSoftInputMode(16);
        if (this.mHardwareAccelerated) {
            this.mDialog.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || !currentActivity.isFinishing()) {
            this.mDialog.show();
        }
    }

    /* access modifiers changed from: protected */
    public void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.mOnRequestCloseListener = onRequestCloseListener;
    }

    /* access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    /* access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.mTransparent = z;
    }

    public View getChildAt(int i) {
        return this.mHostView.getChildAt(i);
    }

    public void removeView(View view) {
        this.mHostView.removeView(view);
    }

    /* access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.mAnimationType = str;
        this.mPropertyRequiresNewDialog = true;
    }

    /* access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.mHardwareAccelerated = z;
        this.mPropertyRequiresNewDialog = true;
    }

    public void removeViewAt(int i) {
        this.mHostView.removeView(getChildAt(i));
    }

    public ReactModalHostView(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.mHostView = new DialogRootViewGroup(context);
    }

    public void addView(View view, int i) {
        this.mHostView.addView(view, i);
    }
}
