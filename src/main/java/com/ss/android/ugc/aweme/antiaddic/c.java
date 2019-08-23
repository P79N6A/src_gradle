package com.ss.android.ugc.aweme.antiaddic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.Calendar;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33371a;
    private static c h;

    /* renamed from: b  reason: collision with root package name */
    public int f33372b = 22;

    /* renamed from: c  reason: collision with root package name */
    public int f33373c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f33374d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f33375e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f33376f;
    public String g;

    public final long c() {
        return (long) (this.f33375e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public final int d() {
        boolean z = this.f33376f;
        this.f33376f = false;
        return z ? 1 : 0;
    }

    private c() {
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f33371a, true, 21685, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f33371a, true, 21685, new Class[0], c.class);
        }
        if (h == null) {
            synchronized (c.class) {
                if (h == null) {
                    h = new c();
                }
            }
        }
        return h;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f33371a, true, 21688, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f33371a, true, 21688, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71778, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71778, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return false;
        }
        return d2.testAntiAddiction;
    }

    public final boolean a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f33371a, false, 21689, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f33371a, false, 21689, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        int i = instance.get(11);
        if (i >= this.f33372b || i < 5) {
            return true;
        }
        return false;
    }

    public final long b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f33371a, false, 21691, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f33371a, false, 21691, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        } else if (a(j)) {
            return (long) (this.f33374d * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        } else {
            return (long) (this.f33373c * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }
}
