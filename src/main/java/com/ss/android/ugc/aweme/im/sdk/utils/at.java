package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.aw;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52497a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f52498b = new SimpleDateFormat("MM-dd", Locale.US);

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f52499c = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f52500d = new SimpleDateFormat("HH:mm", Locale.US);

    private static String a(Date date) {
        Date date2 = date;
        if (PatchProxy.isSupport(new Object[]{date2}, null, f52497a, true, 53701, new Class[]{Date.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{date2}, null, f52497a, true, 53701, new Class[]{Date.class}, String.class);
        }
        String[] stringArray = GlobalContext.getContext().getResources().getStringArray(C0906R.array.o);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date2);
        int i = instance.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return stringArray[i];
    }

    public static String a(Context context, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2)}, null, f52497a, true, 53699, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, new Long(j2)}, null, f52497a, true, 53699, new Class[]{Context.class, Long.TYPE}, String.class);
        } else if (j2 == 0) {
            return "";
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            if (instance.get(1) < Calendar.getInstance().get(1)) {
                return f52498b.format(instance.getTime());
            }
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (currentTimeMillis <= 300000) {
                return context.getResources().getString(C0906R.string.aus);
            }
            if (aw.a(j)) {
                return f52500d.format(instance.getTime());
            }
            if (aw.b(j)) {
                return context.getResources().getString(C0906R.string.b0r);
            }
            if (currentTimeMillis <= 259200000) {
                return a(new Date(j2));
            }
            return f52498b.format(instance.getTime());
        }
    }

    public static String b(Context context, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2)}, null, f52497a, true, 53700, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, new Long(j2)}, null, f52497a, true, 53700, new Class[]{Context.class, Long.TYPE}, String.class);
        } else if (j2 == 0) {
            return "";
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            if (instance.get(1) < Calendar.getInstance().get(1)) {
                return f52498b.format(instance.getTime());
            }
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (currentTimeMillis <= 300000) {
                return context.getResources().getString(C0906R.string.aus);
            }
            if (aw.a(j)) {
                return f52500d.format(instance.getTime());
            }
            if (aw.b(j)) {
                return context.getResources().getString(C0906R.string.b0r) + " " + f52500d.format(instance.getTime());
            } else if (currentTimeMillis > 259200000) {
                return f52499c.format(instance.getTime());
            } else {
                return a(new Date(j2)) + " " + f52500d.format(instance.getTime());
            }
        }
    }
}
