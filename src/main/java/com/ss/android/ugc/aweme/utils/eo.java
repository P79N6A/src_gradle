package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.format.DateFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class eo {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75833a;

    /* renamed from: b  reason: collision with root package name */
    private static Locale f75834b;

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f75835c = new SimpleDateFormat("yyyy-MM-dd", f75834b);

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f75836d = new SimpleDateFormat("yyyy年MM月dd日", f75834b);

    /* renamed from: e  reason: collision with root package name */
    private static final SimpleDateFormat f75837e = new SimpleDateFormat("MM-dd", f75834b);

    /* renamed from: f  reason: collision with root package name */
    private static final SimpleDateFormat f75838f = new SimpleDateFormat("MM月dd日", f75834b);
    private static final SimpleDateFormat g = new SimpleDateFormat("HH:mm", f75834b);
    private static final SimpleDateFormat h = new SimpleDateFormat("h:mm aa", f75834b);

    static {
        Locale locale;
        if (a.a()) {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        } else {
            locale = Locale.getDefault();
        }
        f75834b = locale;
    }

    private static String a(@NonNull Context context, Date date) {
        Date date2 = date;
        if (PatchProxy.isSupport(new Object[]{context, date2}, null, f75833a, true, 88623, new Class[]{Context.class, Date.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, date2}, null, f75833a, true, 88623, new Class[]{Context.class, Date.class}, String.class);
        }
        String[] stringArray = context.getApplicationContext().getResources().getStringArray(C0906R.array.o);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date2);
        int i = instance.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return stringArray[i];
    }

    public static String a(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88620, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88620, new Class[]{Context.class, Long.TYPE}, String.class);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f75835c.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis <= 60000) {
            return context2.getString(C0906R.string.b41);
        }
        if (currentTimeMillis <= 3600000) {
            return context2.getString(C0906R.string.bbu, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
        } else if (currentTimeMillis <= 86400000) {
            return context2.getString(C0906R.string.an2, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
        } else if (currentTimeMillis > 259200000) {
            return f75837e.format(instance.getTime());
        } else {
            return context2.getString(C0906R.string.a49, new Object[]{Long.valueOf(currentTimeMillis / 86400000)});
        }
    }

    public static String c(@NonNull Context context, long j) {
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88622, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88622, new Class[]{Context.class, Long.TYPE}, String.class);
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis < 60000) {
            return context2.getString(C0906R.string.b41);
        }
        if (timeInMillis < 3600000) {
            if (!DateFormat.is24HourFormat(context)) {
                return h.format(new Date(j2));
            }
            return g.format(new Date(j2));
        } else if (timeInMillis < 86400000) {
            return context2.getString(C0906R.string.dui);
        } else {
            if (timeInMillis < 604800000) {
                return a(context2, new Date(j2));
            }
            return DateFormat.getDateFormat(context).format(new Date(j2));
        }
    }

    public static String b(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88621, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88621, new Class[]{Context.class, Long.TYPE}, String.class);
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (a.a()) {
            if (timeInMillis < 60000) {
                return context2.getString(C0906R.string.b41);
            }
            if (timeInMillis < 3600000) {
                return context2.getString(C0906R.string.cjn, new Object[]{Long.valueOf(timeInMillis / 60000)});
            } else if (timeInMillis < 86400000) {
                return context2.getString(C0906R.string.cjm, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            } else if (timeInMillis < 604800000) {
                return context2.getString(C0906R.string.cjl, new Object[]{Long.valueOf(timeInMillis / 86400000)});
            } else {
                return context2.getString(C0906R.string.cjo, new Object[]{Long.valueOf(timeInMillis / 604800000)});
            }
        } else if (timeInMillis < 60000) {
            return context2.getString(C0906R.string.b41);
        } else {
            if (timeInMillis < 3600000) {
                return context2.getString(C0906R.string.bbu, new Object[]{Long.valueOf(timeInMillis / 60000)});
            }
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            long timeInMillis2 = instance.getTimeInMillis();
            if (j2 >= timeInMillis2) {
                return context2.getString(C0906R.string.an2, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            }
            instance.add(6, -1);
            long timeInMillis3 = instance.getTimeInMillis();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            if (j2 >= timeInMillis3) {
                return context2.getString(C0906R.string.dui) + g.format(instance2.getTime());
            }
            instance.add(6, -2);
            if (j2 >= instance.getTimeInMillis()) {
                return context2.getString(C0906R.string.a49, new Object[]{Long.valueOf(((timeInMillis2 - j2) / 86400000) + 1)});
            }
            Calendar instance3 = Calendar.getInstance();
            instance3.set(6, 0);
            instance3.set(11, 0);
            instance3.set(12, 0);
            instance3.set(13, 0);
            if (j2 >= instance3.getTimeInMillis()) {
                return f75837e.format(instance2.getTime());
            }
            return f75835c.format(instance2.getTime());
        }
    }

    public static String d(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88625, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, null, f75833a, true, 88625, new Class[]{Context.class, Long.TYPE}, String.class);
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 == 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context2.getString(C0906R.string.c3_, objArr);
        } else if (timeInMillis < 3600000) {
            return context2.getString(C0906R.string.bbu, new Object[]{Long.valueOf(timeInMillis / 60000)});
        } else if (timeInMillis < 86400000) {
            return context2.getString(C0906R.string.an2, new Object[]{Long.valueOf(timeInMillis / 3600000)});
        } else if (timeInMillis < 604800000) {
            return context2.getString(C0906R.string.a49, new Object[]{Long.valueOf(timeInMillis / 86400000)});
        } else if (timeInMillis < 691200000) {
            return context2.getString(C0906R.string.bk7);
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            Calendar instance2 = Calendar.getInstance();
            instance2.set(6, 0);
            instance2.set(11, 0);
            instance2.set(12, 0);
            instance2.set(13, 0);
            if (j2 >= instance2.getTimeInMillis()) {
                return f75838f.format(instance.getTime());
            }
            return f75836d.format(instance.getTime());
        }
    }
}
