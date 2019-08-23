package com.ss.android.ugc.aweme.freeflowcard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Calendar;
import java.util.Date;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48547a;

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f48547a, true, 46009, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f48547a, true, 46009, new Class[0], Integer.TYPE)).intValue();
        }
        return Calendar.getInstance().getMaximum(5);
    }

    public static long[] b() {
        if (PatchProxy.isSupport(new Object[0], null, f48547a, true, 46010, new Class[0], long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[0], null, f48547a, true, 46010, new Class[0], long[].class);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(2, -1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    public static long c() {
        if (PatchProxy.isSupport(new Object[0], null, f48547a, true, 46015, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f48547a, true, 46015, new Class[0], Long.TYPE)).longValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(2, 1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance.getTimeInMillis();
    }

    public static long[] a(int i) {
        if (PatchProxy.isSupport(new Object[]{25}, null, f48547a, true, 46013, new Class[]{Integer.TYPE}, long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[]{25}, null, f48547a, true, 46013, new Class[]{Integer.TYPE}, long[].class);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, 25);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.add(2, 1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    public static long[] b(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f48547a, true, 46014, new Class[]{Integer.TYPE}, long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f48547a, true, 46014, new Class[]{Integer.TYPE}, long[].class);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, i2);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.set(5, i2);
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    public static long[] a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f48547a, true, 46012, new Class[]{Integer.TYPE, Integer.TYPE}, long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f48547a, true, 46012, new Class[]{Integer.TYPE, Integer.TYPE}, long[].class);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, i);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.set(5, i2);
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }
}
