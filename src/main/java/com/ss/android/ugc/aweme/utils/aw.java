package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Calendar;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75545a;

    private static em a() {
        if (PatchProxy.isSupport(new Object[0], null, f75545a, true, 88161, new Class[0], em.class)) {
            return (em) PatchProxy.accessDispatch(new Object[0], null, f75545a, true, 88161, new Class[0], em.class);
        }
        Calendar instance = Calendar.getInstance();
        instance.add(5, -1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, -1);
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        em emVar = new em();
        emVar.f75826a = time;
        emVar.f75827b = time2;
        return emVar;
    }

    private static em b() {
        if (PatchProxy.isSupport(new Object[0], null, f75545a, true, 88162, new Class[0], em.class)) {
            return (em) PatchProxy.accessDispatch(new Object[0], null, f75545a, true, 88162, new Class[0], em.class);
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        em emVar = new em();
        emVar.f75826a = time;
        emVar.f75827b = time2;
        return emVar;
    }

    public static boolean a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75545a, true, 88156, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75545a, true, 88156, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        em b2 = b();
        if (j2 <= b2.f75826a || j2 >= b2.f75827b) {
            return false;
        }
        return true;
    }

    public static boolean b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75545a, true, 88157, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75545a, true, 88157, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        em a2 = a();
        if (j2 <= a2.f75826a || j2 >= a2.f75827b) {
            return false;
        }
        return true;
    }
}
