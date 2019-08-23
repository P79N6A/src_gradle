package com.ss.android.pushmanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2537a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<Integer> f2538b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2539c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2540d = g.a("/push/get_service_addrs/");

    /* renamed from: e  reason: collision with root package name */
    public static final String f2541e = g.a("/service/1/update_token/");

    /* renamed from: f  reason: collision with root package name */
    public static final String f2542f = g.a("/cloudpush/callback/meizu/");
    public static final String g = g.a("/cloudpush/callback/register_device/");
    public static final String h = g.a("/service/1/app_notice_status/");
    public static final String i = g.a("/cloudpush/update_sender/");
    public static d j;
    public static b k;

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f2537a, true, 18934, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f2537a, true, 18934, new Class[0], d.class);
        }
        if (j != null) {
            return j;
        }
        throw new IllegalArgumentException("sMessageDepend is null !!!");
    }

    public static b b() {
        if (PatchProxy.isSupport(new Object[0], null, f2537a, true, 18935, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f2537a, true, 18935, new Class[0], b.class);
        }
        if (k != null) {
            return k;
        }
        b bVar = new b();
        k = bVar;
        return bVar;
    }

    static {
        String str;
        HashSet hashSet = new HashSet();
        f2538b = hashSet;
        hashSet.add(1);
        f2538b.add(2);
        f2538b.add(3);
        f2538b.add(4);
        if (PatchProxy.isSupport(new Object[]{"/service/2/app_notify/"}, null, a.f30468a, true, 18926, new Class[]{String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{"/service/2/app_notify/"}, null, a.f30468a, true, 18926, new Class[]{String.class}, String.class);
        } else {
            str = a.f30471d + "/service/2/app_notify/";
        }
        f2539c = str;
    }

    public static String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f2537a, true, 18943, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f2537a, true, 18943, new Class[]{String.class, String.class}, String.class);
        }
        return str3 + str4;
    }
}
