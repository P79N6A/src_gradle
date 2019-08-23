package com.bytedance.android.live.uikit.d;

import android.content.Context;
import android.widget.Toast;
import com.bytedance.android.live.uikit.toast.c;
import com.bytedance.common.utility.ICustomToast;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8496a;

    public static void a(Context context, String str, long j) {
        Context context2 = context;
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, str2, new Long(j2)}, null, f8496a, true, 2459, new Class[]{Context.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, new Long(j2)}, null, f8496a, true, 2459, new Class[]{Context.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (context2 != null && !StringUtils.isEmpty(str) && !(context2 instanceof c)) {
            try {
                Toast makeText = Toast.makeText(context2, str2, 0);
                if (makeText != null) {
                    b.a(makeText);
                }
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
    }

    public static final String a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8496a, true, 2466, new Class[]{Long.TYPE}, String.class)) {
            return a(j2, "万");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8496a, true, 2466, new Class[]{Long.TYPE}, String.class);
    }

    public static final String a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, null, f8496a, true, 2467, new Class[]{Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, null, f8496a, true, 2467, new Class[]{Long.TYPE, String.class}, String.class);
        } else if (j2 <= 10000) {
            return String.valueOf(j);
        } else {
            double d2 = (double) j2;
            Double.isNaN(d2);
            String format = String.format("%.1f", new Object[]{Double.valueOf((d2 * 1.0d) / 10000.0d)});
            if ('0' == format.charAt(format.length() - 1)) {
                return format.substring(0, format.length() - 2) + str2;
            }
            return format + str2;
        }
    }

    public static void a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f8496a, true, 2458, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f8496a, true, 2458, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null) {
            a(context2, context.getString(i));
        }
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f8496a, true, 2455, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f8496a, true, 2455, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context2 != null && !StringUtils.isEmpty(str)) {
            if (context2 instanceof ICustomToast) {
                ((ICustomToast) context2).showCustomToast(str2);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context2, str2, 0);
                if (makeText != null) {
                    b.a(makeText);
                }
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
    }

    public static void a(Context context, int i, long j) {
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), new Long(j2)}, null, f8496a, true, 2460, new Class[]{Context.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), new Long(j2)}, null, f8496a, true, 2460, new Class[]{Context.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (context2 != null) {
            a(context2, context.getString(i), j2);
        }
    }
}
