package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import javax.annotation.Nullable;

public class DebugOverlayController {
    @Nullable
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean permissionCheck(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return hasPermission(context, "android.permission.SYSTEM_ALERT_WINDOW");
        }
        if (!Settings.canDrawOverlays(context)) {
            return false;
        }
        return true;
    }

    public static void requestPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            FLog.w("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    public void setFpsDebugViewVisible(boolean z) {
        if (!z || this.mFPSDebugViewContainer != null) {
            if (!z && this.mFPSDebugViewContainer != null) {
                this.mFPSDebugViewContainer.removeAllViews();
                this.mWindowManager.removeView(this.mFPSDebugViewContainer);
                this.mFPSDebugViewContainer = null;
            }
        } else if (!permissionCheck(this.mReactContext)) {
            FLog.d("ReactNative", "Wait for overlay permission to be set");
        } else {
            this.mFPSDebugViewContainer = new FpsView(this.mReactContext);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3);
            this.mWindowManager.addView(this.mFPSDebugViewContainer, layoutParams);
        }
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    private static boolean hasPermission(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String equals : packageInfo.requestedPermissions) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            FLog.e("ReactNative", "Error while retrieving package info", (Throwable) e2);
        }
        return false;
    }
}
