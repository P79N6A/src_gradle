package com.ttnet.org.chromium.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.UserManager;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.bytex.a.a.a;
import java.io.File;

@TargetApi(21)
public class ApiCompatibilityUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static class FinishAndRemoveTaskWithRetry implements Runnable {
        private final Activity mActivity;
        private int mTryCount;

        public void run() {
            this.mActivity.finishAndRemoveTask();
            this.mTryCount++;
            if (!this.mActivity.isFinishing()) {
                if (((long) this.mTryCount) < 3) {
                    ThreadUtils.postOnUiThreadDelayed(this, 500);
                    return;
                }
                this.mActivity.finish();
            }
        }

        FinishAndRemoveTaskWithRetry(Activity activity) {
            this.mActivity = activity;
        }
    }

    public static int compareBoolean(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareLong(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private ApiCompatibilityUtils() {
    }

    public static int getActivityNewDocumentFlag() {
        return Build.VERSION.SDK_INT >= 21 ? 524288 : 524288;
    }

    public static boolean isElevationSupported() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean isPrintingSupported() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }

    public static void finishAfterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static String getCreatorPackage(PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 17) {
            return pendingIntent.getCreatorPackage();
        }
        return pendingIntent.getTargetPackage();
    }

    public static int getLayoutDirection(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 17) {
            return configuration.getLayoutDirection();
        }
        return 0;
    }

    public static String getLocale(InputMethodSubtype inputMethodSubtype) {
        if (Build.VERSION.SDK_INT >= 24) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }

    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int getPaddingEnd(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int getPaddingStart(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static void setWindowIndeterminateProgress(Window window) {
        if (Build.VERSION.SDK_INT < 21) {
            window.setFeatureInt(5, -2);
        }
    }

    public static void finishAndRemoveTask(Activity activity) {
        if (Build.VERSION.SDK_INT > 21) {
            activity.finishAndRemoveTask();
        } else if (Build.VERSION.SDK_INT == 21) {
            new FinishAndRemoveTaskWithRetry(activity).run();
        } else {
            activity.finish();
        }
    }

    public static long getAvailableBlocks(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getAvailableBlocksLong();
        }
        return (long) statFs.getAvailableBlocks();
    }

    public static long getBlockCount(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getBlockCountLong();
        }
        return (long) statFs.getBlockCount();
    }

    public static long getBlockSize(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getBlockSizeLong();
        }
        return (long) statFs.getBlockSize();
    }

    public static boolean isInteractive(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (Build.VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static boolean isLayoutRtl(View view) {
        if (Build.VERSION.SDK_INT < 17 || view.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static boolean shouldSkipFirstUseHints(ContentResolver contentResolver) {
        if (Build.VERSION.SDK_INT < 21 || Settings.Secure.getInt(contentResolver, "skip_first_use_hints", 0) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isDemoUser(Context context) {
        if (!BuildInfo.isGreaterThanN()) {
            return false;
        }
        try {
            return ((Boolean) UserManager.class.getMethod("isDemoUser", new Class[0]).invoke((UserManager) context.getSystemService(AllStoryActivity.f73306b), new Object[0])).booleanValue();
        } catch (Exception | RuntimeException unused) {
            return false;
        }
    }

    @TargetApi(17)
    public static boolean isDeviceProvisioned(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && context != null && context.getContentResolver() != null && Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 0) {
            return false;
        }
        return true;
    }

    public static Uri getUriForImageCaptureFile(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 18) {
            return ContentUriUtils.getContentUriFromFile(context, file);
        }
        return Uri.fromFile(file);
    }

    public static void setContentViewForNotificationBuilder(Notification.Builder builder, RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setCustomContentView(remoteViews);
        } else {
            builder.setContent(remoteViews);
        }
    }

    @TargetApi(21)
    public static boolean setElevation(View view, float f2) {
        if (!isElevationSupported()) {
            return false;
        }
        view.setElevation(f2);
        return true;
    }

    public static void setLabelFor(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLabelFor(i);
        }
    }

    public static void setLayoutDirection(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    public static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    public static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static void setTextAlignment(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setTextAlignment(i);
        }
    }

    public static void setTextDirection(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setTextDirection(i);
        }
    }

    public static int getColor(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, null);
        }
        return resources.getColorStateList(i);
    }

    public static Drawable getDrawable(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, null);
        }
        return a.a(resources, i);
    }

    public static Drawable getUserBadgedIcon(Context context, int i) {
        Drawable drawable = getDrawable(context.getResources(), i);
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedIcon(drawable, Process.myUserHandle());
        }
        return drawable;
    }

    public static Notification notificationWithBigContentView(Notification.Builder builder, RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            return builder.setCustomBigContentView(remoteViews).build();
        }
        Notification build = builder.build();
        build.bigContentView = remoteViews;
        return build;
    }

    public static void setStatusBarColor(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (i == -16777216 && window.getNavigationBarColor() == -16777216) {
                window.clearFlags(Integer.MIN_VALUE);
            } else {
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i);
        }
    }

    public static void setTextAppearance(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, null);
        }
        return resources.getDrawableForDensity(i, i2);
    }

    public static int checkPermission(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static void setTaskDescription(Activity activity, String str, Bitmap bitmap, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setTaskDescription(new ActivityManager.TaskDescription(str, bitmap, i));
        }
    }

    public static Drawable getUserBadgedDrawableForDensity(Context context, Drawable drawable, Rect rect, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedDrawableForDensity(drawable, Process.myUserHandle(), rect, i);
        }
        return drawable;
    }

    public static void setPaddingRelative(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        if (Build.VERSION.SDK_INT == 17) {
            boolean isLayoutRtl = isLayoutRtl(textView);
            if (isLayoutRtl) {
                drawable5 = drawable3;
            } else {
                drawable5 = drawable;
            }
            if (!isLayoutRtl) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else if (Build.VERSION.SDK_INT > 17) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
        int i5;
        if (Build.VERSION.SDK_INT == 17) {
            boolean isLayoutRtl = isLayoutRtl(textView);
            if (isLayoutRtl) {
                i5 = i3;
            } else {
                i5 = i;
            }
            if (!isLayoutRtl) {
                i = i3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(i5, i2, i, i4);
        } else if (Build.VERSION.SDK_INT > 17) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        if (Build.VERSION.SDK_INT == 17) {
            boolean isLayoutRtl = isLayoutRtl(textView);
            if (isLayoutRtl) {
                drawable5 = drawable3;
            } else {
                drawable5 = drawable;
            }
            if (!isLayoutRtl) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        } else if (Build.VERSION.SDK_INT > 17) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
