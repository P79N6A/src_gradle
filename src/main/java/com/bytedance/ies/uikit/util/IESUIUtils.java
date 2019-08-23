package com.bytedance.ies.uikit.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.common.util.HoneyCombMR2V13Compat;
import com.bytedance.common.util.JellyBeanV16Compat;
import com.bytedance.common.utility.ICustomToast;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.toast.IDurationToast;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class IESUIUtils {

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
    }

    public static final String getDisplayCountChinese(long j) {
        return getDisplayCount(j, "万");
    }

    public static final int getNavigationBarHeight(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(3);
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (!deviceHasKey || identifier > 0) {
            try {
                i = context.getResources().getDimensionPixelSize(identifier);
            } catch (Throwable unused) {
                return 0;
            }
        } else {
            i = 0;
        }
        return i;
    }

    public static boolean isChildWidthCountLTParentWidth(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        int width = viewGroup.getWidth();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            i += viewGroup.getChildAt(i2).getWidth();
        }
        if (i > width) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[SYNTHETIC, Splitter:B:22:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMaterialNotification(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L_0x0047
            if (r6 != 0) goto L_0x000a
            goto L_0x0047
        L_0x000a:
            r0 = 0
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = 2131624823(0x7f0e0377, float:1.8876837E38)
            int r2 = r2.getColor(r3)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = {16842904, 16842901} // fill-array     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r4 = 2131493146(0x7f0c011a, float:1.8609764E38)
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4, r3)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            int r0 = r6.getColor(r1, r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0036 }
            if (r2 != r0) goto L_0x0030
            if (r6 == 0) goto L_0x002e
            r6.recycle()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            r6 = 1
            return r6
        L_0x0030:
            if (r6 == 0) goto L_0x0046
        L_0x0032:
            r6.recycle()     // Catch:{ Throwable -> 0x0046 }
            goto L_0x0046
        L_0x0036:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x003c
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.recycle()     // Catch:{ Throwable -> 0x0041 }
        L_0x0041:
            throw r6
        L_0x0042:
            r6 = r0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0032
        L_0x0046:
            return r1
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.util.IESUIUtils.isMaterialNotification(android.content.Context):boolean");
    }

    public static void setViewBackground(View view, Drawable drawable) {
        JellyBeanV16Compat.setViewBackground(view, drawable);
    }

    public static void displayToast(Context context, int i) {
        if (context != null) {
            displayToast(context, context.getString(i));
        }
    }

    public static boolean isRecycleViewCanScroll(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        if (recyclerView == null || adapter == null) {
            return false;
        }
        if (adapter.getItemCount() > recyclerView.getChildCount() || isChildWidthCountLTParentWidth(recyclerView)) {
            return true;
        }
        return false;
    }

    public static void displayToast(Context context, String str) {
        if (context != null && !StringUtils.isEmpty(str)) {
            if (context instanceof ICustomToast) {
                ((ICustomToast) context).showCustomToast(str);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
                }
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
    }

    public static final String getDisplayCount(long j, String str) {
        if (j <= 10000) {
            return String.valueOf(j);
        }
        double d2 = (double) j;
        Double.isNaN(d2);
        String format = String.format("%.1f", new Object[]{Double.valueOf((d2 * 1.0d) / 10000.0d)});
        if ('0' == format.charAt(format.length() - 1)) {
            return format.substring(0, format.length() - 2) + str;
        }
        return format + str;
    }

    public static void displayToast(Context context, int i, long j) {
        if (context != null) {
            displayToast(context, context.getString(i), j);
        }
    }

    public static void displayToast(Context context, String str, long j) {
        if (context != null && !StringUtils.isEmpty(str)) {
            if (context instanceof IDurationToast) {
                ((IDurationToast) context).showCustomToast(str, j);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
                }
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
    }

    public static float viewInScreenRate(Context context, View view, int i, Point point, int[] iArr) {
        int i2;
        if (view == null) {
            return 0.0f;
        }
        HoneyCombMR2V13Compat.getDisplaySize(context, point);
        int i3 = point.y;
        view.getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.height;
        } else {
            i2 = view.getMeasuredHeight();
        }
        int i4 = iArr[1] - i;
        int i5 = i4 + i2;
        if (i5 <= i3) {
            i3 = i5;
        }
        if (i4 > 0) {
            i3 -= i4;
        }
        return ((float) i3) / ((float) i2);
    }
}
