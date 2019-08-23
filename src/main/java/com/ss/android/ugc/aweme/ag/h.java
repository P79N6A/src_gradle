package com.ss.android.ugc.aweme.ag;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2586a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Set<a> f2587b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public static b f2588c = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2589e = "com.ss.android.ugc.aweme.ag.h";

    /* renamed from: f  reason: collision with root package name */
    private static Application f2590f;
    private static final LinkedHashMap<String, d> g = new LinkedHashMap<>();
    private static boolean h = false;
    private static h i;

    /* renamed from: d  reason: collision with root package name */
    public f f2591d = new f();

    public interface a {
        void a();
    }

    public interface b {
        String a(String str);
    }

    private boolean a(d dVar, String str) {
        if (!PatchProxy.isSupport(new Object[]{dVar, str}, this, f2586a, false, 70963, new Class[]{d.class, String.class}, Boolean.TYPE)) {
            return dVar != null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar, str}, this, f2586a, false, 70963, new Class[]{d.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str) {
        if (!PatchProxy.isSupport(new Object[]{activity, str}, this, f2586a, false, 70957, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return i.a(this, activity, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str}, this, f2586a, false, 70957, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str, View view) {
        if (!PatchProxy.isSupport(new Object[]{activity, str, view}, this, f2586a, false, 70961, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return i.a(this, activity, str, view);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str, view}, this, f2586a, false, 70961, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f2586a, false, 70953, new Class[]{String.class}, Boolean.TYPE)) {
            return i.a(this, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2586a, false, 70953, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(String str, HashMap hashMap) {
        if (!PatchProxy.isSupport(new Object[]{str, hashMap}, this, f2586a, false, 70955, new Class[]{String.class, HashMap.class}, Boolean.TYPE)) {
            return i.a(this, str, hashMap);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, hashMap}, this, f2586a, false, 70955, new Class[]{String.class, HashMap.class}, Boolean.TYPE)).booleanValue();
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f2586a, true, 70947, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f2586a, true, 70947, new Class[0], h.class);
        }
        if (i != null) {
            return i;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    private static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f2586a, true, 70949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f2586a, true, 70949, new Class[0], Void.TYPE);
        } else if (!h) {
            synchronized (g) {
                for (a a2 : f2587b) {
                    a2.a();
                }
                h = true;
            }
        }
    }

    private h(Application application) {
        f2590f = application;
    }

    public static void a(Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, null, f2586a, true, 70946, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, null, f2586a, true, 70946, new Class[]{Application.class}, Void.TYPE);
        } else if (i == null) {
            synchronized (h.class) {
                if (i == null) {
                    i = new h(application2);
                }
            }
        }
    }

    public final boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2586a, false, 70954, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f2586a, false, 70954, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        b();
        if (f2588c != null) {
            str2 = f2588c.a(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        d dVar = null;
        Iterator<String> it2 = g.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (k.a(next, str2)) {
                dVar = g.get(next);
                break;
            }
        }
        d dVar2 = dVar;
        if (!a(dVar2, str2)) {
            return false;
        }
        com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
        return dVar2.a(str2);
    }

    public static void a(String str, Class<? extends Activity> cls) {
        String str2 = str;
        Class<? extends Activity> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str2, cls2}, null, f2586a, true, 70952, new Class[]{String.class, Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cls2}, null, f2586a, true, 70952, new Class[]{String.class, Class.class}, Void.TYPE);
            return;
        }
        a aVar = new a(f2590f, str2, cls2);
        if (g.get(str2) == null) {
            g.put(str2, aVar);
        }
    }

    public final boolean b(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f2586a, false, 70958, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f2586a, false, 70958, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        b();
        if (f2588c != null) {
            str2 = f2588c.a(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        d dVar = null;
        Iterator<String> it2 = g.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (k.a(next, str2)) {
                dVar = g.get(next);
                break;
            }
        }
        d dVar2 = dVar;
        if (!a(dVar2, str2)) {
            return false;
        }
        com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
        return dVar2.a(activity2, str2);
    }

    public final void a(String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, dVar2}, this, f2586a, false, 70950, new Class[]{String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, dVar2}, this, f2586a, false, 70950, new Class[]{String.class, d.class}, Void.TYPE);
            return;
        }
        g.put(str2, dVar2);
    }

    public final boolean b(String str, HashMap<String, String> hashMap) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, hashMap}, this, f2586a, false, 70956, new Class[]{String.class, HashMap.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, hashMap}, this, f2586a, false, 70956, new Class[]{String.class, HashMap.class}, Boolean.TYPE)).booleanValue();
        }
        b();
        if (f2588c != null) {
            str2 = f2588c.a(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        d dVar = null;
        Iterator<String> it2 = g.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (k.a(next, str2)) {
                dVar = g.get(next);
                break;
            }
        }
        d dVar2 = dVar;
        if (!a(dVar2, str2)) {
            return false;
        }
        if (hashMap != null) {
            j a2 = j.a(str2);
            for (Map.Entry next2 : hashMap.entrySet()) {
                a2.a((String) next2.getKey(), (String) next2.getValue());
            }
            str2 = a2.a();
        }
        com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
        return dVar2.a(str2);
    }

    public final boolean b(Activity activity, String str, View view) {
        Activity activity2 = activity;
        String str2 = str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, view2}, this, f2586a, false, 70962, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, view2}, this, f2586a, false, 70962, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        b();
        if (f2588c != null) {
            str2 = f2588c.a(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        d dVar = null;
        Iterator<String> it2 = g.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (k.a(next, str2)) {
                dVar = g.get(next);
                break;
            }
        }
        d dVar2 = dVar;
        if (!a(dVar2, str2)) {
            return false;
        }
        com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
        return dVar2.a(activity2, str2, view2);
    }

    public final boolean a(Activity activity, String str, int i2) {
        b bVar;
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, Integer.valueOf(i2)}, this, f2586a, false, 70960, new Class[]{Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, Integer.valueOf(i2)}, this, f2586a, false, 70960, new Class[]{Activity.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        b();
        if (f2588c != null) {
            str2 = f2588c.a(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        d dVar = null;
        Iterator<String> it2 = g.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (k.a(next, str2)) {
                dVar = g.get(next);
                break;
            }
        }
        d dVar2 = dVar;
        if (!a(dVar2, str2)) {
            return false;
        }
        if (dVar2 instanceof a) {
            a aVar = (a) dVar2;
            b.a aVar2 = new b.a();
            aVar2.f33233b = 1;
            if (PatchProxy.isSupport(new Object[0], aVar2, b.a.f33232a, false, 70920, new Class[0], b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[0], aVar2, b.a.f33232a, false, 70920, new Class[0], b.class);
            } else {
                bVar = new b();
                bVar.f33231e = aVar2.f33233b;
                bVar.f33227a = aVar2.f33234c;
                bVar.f33228b = aVar2.f33235d;
                bVar.f33229c = aVar2.f33236e;
                bVar.f33230d = aVar2.f33237f;
            }
            bVar.f33229c = i2;
            aVar.f33224c = bVar;
            com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
            return aVar.a(activity2, str2);
        }
        com.ss.android.e.b.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e).a(str2);
        return dVar2.a(activity2, str2);
    }
}
