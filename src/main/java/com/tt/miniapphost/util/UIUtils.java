package com.tt.miniapphost.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class UIUtils {
    private static int mDeviceHeight = -1;
    private static int mDeviceWidth = -1;

    private static boolean visibilityValid(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static String toColorString(@ColorInt int i) {
        return toColorString(i, false);
    }

    public static int toDarkenColor(@ColorInt int i) {
        return toDarkenColor(i, 0.8f);
    }

    public static int getBottomStatusHeight(Context context) {
        return getScreenHeightWithNavBar(context) - getScreenHeight(context);
    }

    public static boolean isScreenOriatationPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isViewVisible(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static void setOnTouchBackground(View view) {
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                view.setAlpha(0.6f);
                                break;
                            case 1:
                                break;
                        }
                    }
                    view.setAlpha(1.0f);
                    return false;
                }
            });
        }
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

    @ColorInt
    public static int parseColor(@NonNull String str) throws IllegalColorException {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            throw new IllegalColorException("illegal color " + str);
        }
    }

    public static void removeParentView(View view) {
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } catch (Exception e2) {
                AppBrandLogger.d("UIUtils", e2);
            }
        }
    }

    public static void detachFromParent(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(6, "UIUtils", e2.getStackTrace());
                }
            }
        }
    }

    public static int getDeviceHeight(Context context) {
        if (mDeviceHeight < 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                mDeviceWidth = point.x;
                mDeviceHeight = point.y;
            }
        }
        return mDeviceHeight;
    }

    public static int getDeviceWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            mDeviceWidth = point.x;
            mDeviceHeight = point.y;
        }
        return mDeviceWidth;
    }

    public static Drawable getMaterialLoadingDrawable(Context context) {
        Drawable drawable;
        if (context == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16974522, new int[]{16843067});
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable.mutate();
        }
        return null;
    }

    public static int getScreenHeightWithNavBar(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getScreenWidthWithNavBar(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.widthPixels;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getBottom(View view, View view2) {
        return getPositionInternal(4, view, view2);
    }

    public static int getLeft(View view, View view2) {
        return getPositionInternal(1, view, view2);
    }

    public static int getRight(View view, View view2) {
        return getPositionInternal(3, view, view2);
    }

    public static int getTop(View view, View view2) {
        return getPositionInternal(2, view, view2);
    }

    public static ColorStateList toColorStateList(@ColorInt int i, @ColorInt int i2) {
        return toColorStateList(i, i2, i2, i);
    }

    public static float dip2Px(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int px2dip(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int sp2px(Context context, float f2) {
        return (int) TypedValue.applyDimension(2, f2, context.getResources().getDisplayMetrics());
    }

    public static final void setViewVisibility(View view, int i) {
        if (view != null && view.getVisibility() != i && visibilityValid(i)) {
            view.setVisibility(i);
        }
    }

    public static int toDarkenColor(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f2;
        return Color.HSVToColor(fArr);
    }

    @ColorInt
    public static int parseColor(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Color.parseColor(str);
            } catch (Exception e2) {
                AppBrandLogger.eWithThrowable("UIUtils", "illegal color " + str, e2);
            }
        }
        return Color.parseColor(str2);
    }

    @TargetApi(21)
    public static Drawable getMaterialLoadingDrawable(Context context, View view) {
        Drawable drawable;
        if (context == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16974522, new int[]{16843067});
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable.mutate();
        }
        return null;
    }

    public static String toColorString(@ColorInt int i, boolean z) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = PushConstants.PUSH_TYPE_NOTIFY + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = PushConstants.PUSH_TYPE_NOTIFY + hexString3;
        }
        if (hexString4.length() == 1) {
            hexString4 = PushConstants.PUSH_TYPE_NOTIFY + hexString4;
        }
        if (z) {
            return hexString + hexString2 + hexString3 + hexString4;
        }
        return hexString2 + hexString3 + hexString4;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getPositionInternal(int r3, android.view.View r4, android.view.View r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0040
            if (r5 != 0) goto L_0x0006
            goto L_0x0040
        L_0x0006:
            r1 = 0
            switch(r3) {
                case 3: goto L_0x0012;
                case 4: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            r2 = 0
            goto L_0x0017
        L_0x000c:
            int r2 = r5.getHeight()
            int r2 = r2 + r0
            goto L_0x0017
        L_0x0012:
            int r2 = r5.getWidth()
            int r2 = r2 + r0
        L_0x0017:
            if (r1 == r4) goto L_0x003e
            switch(r3) {
                case 1: goto L_0x0028;
                case 2: goto L_0x001d;
                case 3: goto L_0x0028;
                case 4: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0032
        L_0x001d:
            int r1 = r5.getScrollY()
            int r2 = r2 - r1
            int r1 = r5.getTop()
            int r2 = r2 + r1
            goto L_0x0032
        L_0x0028:
            int r1 = r5.getScrollX()
            int r2 = r2 - r1
            int r1 = r5.getLeft()
            int r2 = r2 + r1
        L_0x0032:
            android.view.ViewParent r1 = r5.getParent()
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L_0x003f
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            goto L_0x0017
        L_0x003e:
            r0 = r2
        L_0x003f:
            return r0
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.UIUtils.getPositionInternal(int, android.view.View, android.view.View):int");
    }

    public static ColorStateList toColorStateList(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        int[] iArr = {i2, i3, i, i3, i4, i};
        return new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[]{16842910, 16842908}, new int[]{16842910}, new int[]{16842908}, new int[]{16842909}, new int[0]}, iArr);
    }

    public static void updateLayoutMargin(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                updateMargin(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
            }
        }
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
