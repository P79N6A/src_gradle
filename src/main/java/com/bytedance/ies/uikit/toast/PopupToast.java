package com.bytedance.ies.uikit.toast;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class PopupToast {
    boolean mDestroyed;
    final Handler mHandler;
    private boolean mHideSystemUI;
    final Runnable mHideToastTask;
    ImageView mIcon;
    boolean mPaused;
    Dialog mPopup;
    TextView mText;
    View mView;

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

    public void onResume() {
        this.mPaused = false;
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isHideSystemUI() {
        return this.mHideSystemUI;
    }

    public void showToast(String str, int i, int i2) {
        showToast(null, 0, 0, str, i, i2);
    }

    public void hidePopupToast() {
        if (!this.mDestroyed) {
            try {
                if (this.mPopup.isShowing()) {
                    _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.mPopup);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onDestroy() {
        if (!this.mDestroyed && !this.mPaused) {
            this.mHandler.removeCallbacks(this.mHideToastTask);
            hidePopupToast();
            this.mDestroyed = true;
        }
    }

    public void onPause() {
        if (!this.mDestroyed && !this.mPaused) {
            this.mHandler.removeCallbacks(this.mHideToastTask);
            hidePopupToast();
            this.mPaused = true;
        }
    }

    @TargetApi(11)
    private void hideSystemUI() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.mPopup.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.mPopup.getWindow().setFlags(1024, 1024);
        }
    }

    public void hideSystemUI(boolean z) {
        this.mHideSystemUI = z;
    }

    public PopupToast(Context context) {
        this(context, -1, -2, 17);
    }

    public void showLongToast(String str) {
        showToast(null, 0, 0, str, 3500, 17);
    }

    public void showToast(String str) {
        showToast(null, 0, 0, str, 2000, 48);
    }

    public void showLongToast(int i, String str) {
        showToast(null, i, 0, str, 3500, 17);
    }

    public void showToast(int i, String str) {
        showToast(null, i, 0, str, 2000, 17);
    }

    public void showLongToast(String str, int i) {
        showToast(null, 0, 0, str, 3500, i);
    }

    public void showToast(String str, int i) {
        showToast(null, 0, 0, str, 2000, i);
    }

    public void showToast(int i, String str, int i2) {
        showToast(null, i, 0, str, i2, 17);
    }

    public void showToast(View view, int i, int i2) {
        showToast(view, i, i2, null, 1500, 17);
    }

    public void showToast(View view, int i, String str) {
        showToast(view, i, 0, str, 1500, 17);
    }

    public void showToast(int i, String str, int i2, int i3) {
        showToast(null, i, 0, str, i2, i3);
    }

    public PopupToast(Context context, int i, int i2, int i3) {
        this.mHandler = new Handler();
        this.mHideToastTask = new Runnable() {
            public void run() {
                PopupToast.this.hidePopupToast();
            }
        };
        LayoutInflater from = LayoutInflater.from(context);
        this.mPopup = new Dialog(context, C0906R.style.te);
        try {
            View inflate = from.inflate(C0906R.layout.abq, null);
            this.mView = inflate;
            this.mIcon = (ImageView) inflate.findViewById(C0906R.id.aq8);
            this.mText = (TextView) inflate.findViewById(C0906R.id.text);
            this.mPopup.setContentView(this.mView);
            this.mPopup.getWindow().addFlags(8);
            this.mPopup.getWindow().addFlags(32);
            this.mPopup.getWindow().addFlags(16);
            this.mPopup.getWindow().setLayout(i, i2);
            this.mPopup.getWindow().setGravity(i3);
        } catch (Throwable unused) {
        }
    }

    private void showToast(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.mDestroyed && i3 > 0) {
            boolean z = false;
            boolean z2 = true;
            if (i > 0) {
                this.mIcon.setImageResource(i);
                this.mIcon.setVisibility(0);
                z = true;
            } else {
                this.mIcon.setVisibility(8);
            }
            if (i2 > 0) {
                this.mText.setText(i2);
            } else if (!StringUtils.isEmpty(str)) {
                this.mText.setText(str);
            } else {
                z2 = z;
            }
            if (z2) {
                this.mHandler.removeCallbacks(this.mHideToastTask);
                hidePopupToast();
                try {
                    this.mPopup.getWindow().setGravity(i4);
                    if (this.mHideSystemUI) {
                        hideSystemUI();
                    }
                    this.mPopup.show();
                    this.mHandler.postDelayed(this.mHideToastTask, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
