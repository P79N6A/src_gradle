package com.bytedance.common.utility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.d.e;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class UIUtils {
    public static final boolean API_ET_20;
    private static int DPI = -1;
    private static String sScreenResolution = "";
    public static EllipsisMeasureResult sTempEllipsisResult = new EllipsisMeasureResult();
    private static ToastHook sToastHook;

    public static class EllipsisMeasureResult {
        public String ellipsisStr;
        public int length;
    }

    public interface ToastHook {
        boolean showToast(Context context, int i, CharSequence charSequence, long j, int i2);
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }

        @Insert
        @TargetClass
        static void com_ss_android_ugc_aweme_lancet_ResourceLancet_displayToast(Context context, int i) {
            if (context != null) {
                String str = null;
                if (o.a().f63996f != null) {
                    str = (String) AwemeSettings.GlobalTips.buildGlobalTipsMap(o.a().f63996f).get(i);
                }
                if (TextUtils.isEmpty(str)) {
                    str = context.getString(i);
                }
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    a.c(context, str).a();
                } else {
                    e.a.a().a(context, str).a();
                }
            }
        }
    }

    public static void displayToast(Context context, int i) {
        _lancet.com_ss_android_ugc_aweme_lancet_ResourceLancet_displayToast(context, i);
    }

    public static int floatToIntBig(float f2) {
        return (int) (f2 + 0.999f);
    }

    public static int setColorAlpha(int i, int i2) {
        if (i2 > 255) {
            i2 = 255;
        } else if (i2 < 0) {
            i2 = 0;
        }
        return (i & 16777215) | (i2 * 16777216);
    }

    private static boolean visibilityValid(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static boolean isInUIThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        API_ET_20 = z;
    }

    public static void assertInUIThread() {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Logger.alertErrorInfo("not in UI thread");
        }
    }

    public static void setToastHook(ToastHook toastHook) {
        sToastHook = toastHook;
    }

    public static boolean clearAnimation(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    public static final boolean isViewVisible(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static void detachFromParent(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e2) {
                    Logger.throwException(e2);
                }
            }
        }
    }

    public static int getDiggBuryWidth(Context context) {
        return ((context.getResources().getDisplayMetrics().widthPixels * 1375) / 10000) + ((int) dip2Px(context, 20.0f));
    }

    public static int getDpi(Context context) {
        if (DPI == -1 && context != null) {
            DPI = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return DPI;
    }

    public static int getIndexInParent(View view) {
        if (view == null || view.getParent() == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return ((ViewGroup) parent).indexOfChild(view);
        }
        return -1;
    }

    public static final int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static final int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final int getStatusBarHeight(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    public static String getScreenResolution(Context context) {
        if (StringUtils.isEmpty(sScreenResolution) && context != null) {
            int screenWidth = getScreenWidth(context);
            int screenHeight = getScreenHeight(context);
            if (screenWidth > 0 && screenHeight > 0) {
                sScreenResolution = screenWidth + "*" + screenHeight;
            }
        }
        return sScreenResolution;
    }

    public static final String getDisplayCount(int i) {
        if (i <= 10000) {
            return String.valueOf(i);
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        String format = String.format("%.1f", new Object[]{Double.valueOf((d2 * 1.0d) / 10000.0d)});
        if ('0' == format.charAt(format.length() - 1)) {
            return format.substring(0, format.length() - 2) + "万";
        }
        return format + "万";
    }

    public static void displayToast$___twin___(Context context, int i) {
        displayToast(context, context.getString(i));
    }

    public static float dip2Px(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int px2dip(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setText(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    public static float sp2px(Context context, float f2) {
        return TypedValue.applyDimension(2, f2, context.getResources().getDisplayMetrics());
    }

    public static void displayToast(Context context, String str) {
        displayToast(context, 0, str);
    }

    public static final int getRatioOfScreen(Context context, float f2) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return (int) (((float) displayMetrics.widthPixels) * f2);
    }

    @SuppressLint({"NewApi"})
    public static void setTextViewMaxLines(TextView textView, int i) {
        if (textView != null && i > 0) {
            if (Build.VERSION.SDK_INT < 16 || textView.getMaxLines() != i) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                textView.setSingleLine(z);
                textView.setMaxLines(i);
            }
        }
    }

    public static void setTopMargin(View view, float f2) {
        if (view != null) {
            updateLayoutMargin(view, -3, (int) TypedValue.applyDimension(1, f2, view.getContext().getResources().getDisplayMetrics()), -3, -3);
        }
    }

    public static void setTxtAndAdjustVisible(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence)) {
                setViewVisibility(textView, 8);
                return;
            }
            setViewVisibility(textView, 0);
            textView.setText(charSequence);
        }
    }

    public static void setViewBackgroundWithPadding(View view, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundResource(i);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    @SuppressLint({"NewApi"})
    public static void setViewMinHeight(View view, int i) {
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16 || view.getMinimumHeight() != i) {
                view.setMinimumHeight(i);
            }
        }
    }

    public static final void setViewVisibility(View view, int i) {
        if (view != null && view.getVisibility() != i && visibilityValid(i)) {
            view.setVisibility(i);
        }
    }

    public static void requestOrienation(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(z ^ true ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    public static void setViewBackgroundWithPadding(View view, Drawable drawable) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundDrawable(drawable);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static int[] getLocationInAncestor(View view, View view2) {
        boolean z;
        if (view == null || view2 == null) {
            Logger.alertErrorInfo("invalid params: child:" + view + ",ancestor:" + view2);
            return null;
        }
        int[] iArr = new int[2];
        float[] fArr = {0.0f, 0.0f};
        fArr[0] = fArr[0] + ((float) view.getLeft());
        fArr[1] = fArr[1] + ((float) view.getTop());
        ViewParent parent = view.getParent();
        while (true) {
            if (!(parent instanceof View)) {
                z = false;
                break;
            }
            View view3 = (View) parent;
            if (parent == view2) {
                z = true;
                break;
            }
            fArr[0] = fArr[0] - ((float) view3.getScrollX());
            fArr[1] = fArr[1] - ((float) view3.getScrollY());
            fArr[0] = fArr[0] + ((float) view3.getLeft());
            fArr[1] = fArr[1] + ((float) view3.getTop());
            parent = view3.getParent();
        }
        if (!z) {
            Logger.alertErrorInfo("ancestorView:" + view2 + " is not the ancestor of child : " + view);
            return null;
        }
        iArr[0] = (int) (fArr[0] + 0.5f);
        iArr[1] = (int) (fArr[1] + 0.5f);
        return iArr;
    }

    public static void displayToastWithIcon(Context context, int i, String str) {
        displayToast(context, i, str);
    }

    public static void displayToast(Context context, int i, int i2) {
        displayToast(context, context.getString(i), i2);
    }

    public static void displayToastWithIcon(Context context, int i, int i2) {
        displayToast(context, i, context.getString(i2));
    }

    public static void displayToast(Context context, int i, String str) {
        displayToastInternal(context, i, str, 0, 17);
    }

    public static void displayLongTimeToast(Context context, int i, int i2) {
        if (context != null) {
            String string = context.getString(i2);
            if (!StringUtils.isEmpty(string)) {
                displayToastInternal(context, i, string, 1, 17);
            }
        }
    }

    public static void setClickListener(boolean z, View view, View.OnClickListener onClickListener) {
        if (view != null) {
            if (z) {
                view.setOnClickListener(onClickListener);
                view.setClickable(true);
                return;
            }
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    public static void setLayoutParams(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (i != Integer.MIN_VALUE) {
                layoutParams.width = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                layoutParams.height = i2;
            }
        }
    }

    public static void updateLayout(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != i || layoutParams.height != i2)) {
                if (i != -3) {
                    layoutParams.width = i;
                }
                if (i2 != -3) {
                    layoutParams.height = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void displayToast(Context context, String str, int i) {
        displayToastInternal(context, 0, str, 0, i);
    }

    public static void setViewBackgroundWithPadding(View view, Resources resources, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundColor(resources.getColor(i));
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static void getLocationInUpView(View view, View view2, int[] iArr, boolean z) {
        if (view != null && view2 != null && iArr != null && iArr.length >= 2) {
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            view2.getLocationInWindow(iArr);
            int i3 = iArr[0] - i;
            int i4 = iArr[1] - i2;
            if (z) {
                i3 += view2.getWidth() / 2;
                i4 += view2.getHeight() / 2;
            }
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public static void expandClickRegion(View view, int i, int i2, int i3, int i4) {
        final View view2 = view;
        final int i5 = i2;
        final int i6 = i4;
        final int i7 = i;
        final int i8 = i3;
        AnonymousClass2 r0 = new Runnable() {
            public final void run() {
                Rect rect = new Rect();
                view2.getHitRect(rect);
                rect.top += i5;
                rect.bottom += i6;
                rect.left += i7;
                rect.right += i8;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view2);
                if (View.class.isInstance(view2.getParent())) {
                    ((View) view2.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        };
        view.post(r0);
    }

    public static void updateLayoutMargin(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                updateMargin(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
            }
        }
    }

    public static void displayToastInternal(Context context, int i, String str, int i2, int i3) {
        if (context != null && !StringUtils.isEmpty(str)) {
            if (!isInUIThread()) {
                Handler handler = new Handler(Looper.getMainLooper());
                final Context context2 = context;
                final int i4 = i;
                final String str2 = str;
                final int i5 = i2;
                final int i6 = i3;
                AnonymousClass1 r2 = new Runnable() {
                    public final void run() {
                        UIUtils.displayToastInternal(context2, i4, str2, i5, i6);
                    }
                };
                handler.post(r2);
                return;
            }
            if (sToastHook != null) {
                if (sToastHook.showToast(context, i, str, (long) i2, i3)) {
                    return;
                }
            }
            if (!(context instanceof ICustomToast)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i2);
                    if (makeText != null) {
                        makeText.setGravity(i3, 0, 0);
                        _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
                    }
                } catch (Exception e2) {
                    Logger.throwException(e2);
                }
            } else if (i2 == 1) {
                ((ICustomToast) context).showCustomLongToast(i, str);
            } else {
                ICustomToast iCustomToast = (ICustomToast) context;
                if (i2 == 0) {
                    i2 = 2000;
                }
                iCustomToast.showCustomToast(i, str, i2, i3);
            }
        }
    }

    public static void ellipseSingleLineStr(String str, int i, Paint paint, int i2, EllipsisMeasureResult ellipsisMeasureResult) {
        if (i <= i2 || StringUtils.isEmpty(str)) {
            ellipsisMeasureResult.ellipsisStr = "";
            ellipsisMeasureResult.length = 0;
            return;
        }
        int floatToIntBig = floatToIntBig(paint.measureText(str));
        if (floatToIntBig <= i) {
            ellipsisMeasureResult.ellipsisStr = str;
            ellipsisMeasureResult.length = floatToIntBig;
            return;
        }
        StringBuilder sb = new StringBuilder();
        int breakText = paint.breakText(str, 0, str.length(), true, (float) (i - i2), null);
        if (breakText <= 0) {
            ellipsisMeasureResult.ellipsisStr = "";
            ellipsisMeasureResult.length = 0;
            return;
        }
        sb.append(str.substring(0, breakText));
        sb.append(8230);
        ellipsisMeasureResult.ellipsisStr = sb.toString();
        ellipsisMeasureResult.length = i;
    }

    private static void updateMargin(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null && (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4)) {
            if (i != -3) {
                marginLayoutParams.leftMargin = i;
            }
            if (i2 != -3) {
                marginLayoutParams.topMargin = i2;
            }
            if (i3 != -3) {
                marginLayoutParams.rightMargin = i3;
            }
            if (i4 != -3) {
                marginLayoutParams.bottomMargin = i4;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
