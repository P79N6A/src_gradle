package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.UiThreadUtil;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class DevLoadingViewController {
    private static final int COLOR_DARK_GREEN = Color.parseColor("#035900");
    private static boolean sEnabled = true;
    private final Context mContext;
    @Nullable
    private PopupWindow mDevLoadingPopup;
    public final TextView mDevLoadingView = ((TextView) ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(C0906R.layout.ik, null));
    private final ReactInstanceManagerDevHelper mReactInstanceManagerHelper;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_popupWindowDismiss(PopupWindow popupWindow) {
            if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                popupWindow.dismiss();
                return;
            }
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public void hide() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.hideInternal();
                }
            });
        }
    }

    public void show() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.showInternal();
                }
            });
        }
    }

    public void showForRemoteJSEnabled() {
        showMessage(this.mContext.getString(C0906R.string.r1), -1, COLOR_DARK_GREEN);
    }

    public void hideInternal() {
        if (this.mDevLoadingPopup != null && this.mDevLoadingPopup.isShowing()) {
            _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_popupWindowDismiss(this.mDevLoadingPopup);
            this.mDevLoadingPopup = null;
        }
    }

    public void showInternal() {
        int i;
        if (this.mDevLoadingPopup == null || !this.mDevLoadingPopup.isShowing()) {
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null) {
                FLog.e("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            if (Build.VERSION.SDK_INT <= 19) {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                i = rect.top;
            } else {
                i = 0;
            }
            this.mDevLoadingPopup = new PopupWindow(this.mDevLoadingView, -1, -2);
            this.mDevLoadingPopup.setTouchable(false);
            this.mDevLoadingPopup.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
        }
    }

    public static void setDevLoadingEnabled(boolean z) {
        sEnabled = z;
    }

    public void showForUrl(String str) {
        try {
            new URL(str);
            Context context = this.mContext;
            showMessage(context.getString(C0906R.string.qu, new Object[]{r0.getHost() + ":" + r0.getPort()}), -1, COLOR_DARK_GREEN);
        } catch (MalformedURLException e2) {
            FLog.e("ReactNative", "Bundle url format is invalid. \n\n" + e2.toString());
        }
    }

    public DevLoadingViewController(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper) {
        this.mContext = context;
        this.mReactInstanceManagerHelper = reactInstanceManagerDevHelper;
    }

    public void showMessage(final String str, final int i, final int i2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.mDevLoadingView.setBackgroundColor(i2);
                    DevLoadingViewController.this.mDevLoadingView.setText(str);
                    DevLoadingViewController.this.mDevLoadingView.setTextColor(i);
                    DevLoadingViewController.this.showInternal();
                }
            });
        }
    }

    public void updateProgress(@Nullable final String str, @Nullable final Integer num, @Nullable final Integer num2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    if (str != null) {
                        str = str;
                    } else {
                        str = "Loading";
                    }
                    sb.append(str);
                    if (!(num == null || num2 == null || num2.intValue() <= 0)) {
                        sb.append(String.format(Locale.getDefault(), " %.1f%% (%d/%d)", new Object[]{Float.valueOf((((float) num.intValue()) / ((float) num2.intValue())) * 100.0f), num, num2}));
                    }
                    sb.append("…");
                    DevLoadingViewController.this.mDevLoadingView.setText(sb);
                }
            });
        }
    }
}
