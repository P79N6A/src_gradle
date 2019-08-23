package com.ss.android.ugc.aweme.im.sdk.resources;

import a.g;
import a.i;
import android.os.Build;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52260a;

    /* renamed from: f  reason: collision with root package name */
    private static b f52261f;

    /* renamed from: b  reason: collision with root package name */
    public LinkedHashMap<e, List<a>> f52262b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f52263c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f52264d;

    /* renamed from: e  reason: collision with root package name */
    public List<d> f52265e = new ArrayList();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52260a, false, 53070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52260a, false, 53070, new Class[0], Void.TYPE);
            return;
        }
        c.b().a();
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f52260a, false, 53078, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52260a, false, 53078, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f52262b == null || this.f52262b.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private b() {
        c b2 = c.b();
        if (PatchProxy.isSupport(new Object[]{this}, b2, c.f52276a, false, 53087, new Class[]{d.class}, Void.TYPE)) {
            c cVar = b2;
            PatchProxy.accessDispatch(new Object[]{this}, cVar, c.f52276a, false, 53087, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!b2.f52278b.contains(this)) {
            b2.f52278b.add(this);
        }
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f52260a, true, 53069, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f52260a, true, 53069, new Class[0], b.class);
        }
        if (f52261f == null) {
            synchronized (b.class) {
                if (f52261f == null) {
                    f52261f = new b();
                }
            }
        }
        return f52261f;
    }

    public final void c() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f52260a, false, 53075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52260a, false, 53075, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52263c != null) {
            this.f52263c.clear();
        }
        if (this.f52264d != null) {
            this.f52264d.clear();
        }
        if (PatchProxy.isSupport(new Object[0], this, f52260a, false, 53077, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52260a, false, 53077, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f52262b == null) {
            i = 0;
        } else {
            int i3 = 0;
            for (List<a> size : this.f52262b.values()) {
                i3 += size.size();
            }
            i = i3;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f52263c = new ArrayMap(i);
            this.f52264d = new ArrayMap(i);
        } else {
            this.f52263c = new HashMap(i);
            this.f52264d = new HashMap(i);
        }
        for (List<a> next : this.f52262b.values()) {
            if (next != null) {
                for (a aVar : next) {
                    String enDisplayName = aVar.getEnDisplayName();
                    if (TextUtils.isEmpty(enDisplayName)) {
                        enDisplayName = aVar.getDisplayName();
                    }
                    String str = this.f52263c.get(enDisplayName);
                    if (TextUtils.isEmpty(str)) {
                        this.f52263c.put(enDisplayName, String.valueOf(i2));
                    } else {
                        Map<String, String> map = this.f52263c;
                        map.put(enDisplayName, str + "," + i2);
                    }
                    String displayName = aVar.getDisplayName();
                    String str2 = this.f52264d.get(displayName);
                    if (TextUtils.isEmpty(str2)) {
                        this.f52264d.put(displayName, String.valueOf(i2));
                    } else {
                        Map<String, String> map2 = this.f52264d;
                        map2.put(displayName, str2 + "," + i2);
                    }
                    i2++;
                }
            }
        }
    }

    private a a(int i) {
        int i2 = i;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52260a, false, 53076, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52260a, false, 53076, new Class[]{Integer.TYPE}, a.class);
        }
        for (List next : this.f52262b.values()) {
            if (next.size() + i3 > i2) {
                return (a) next.get(i2 - i3);
            }
            i3 += next.size();
        }
        return null;
    }

    @MainThread
    public final void a(LinkedHashMap<e, List<a>> linkedHashMap) {
        if (PatchProxy.isSupport(new Object[]{linkedHashMap}, this, f52260a, false, 53081, new Class[]{LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkedHashMap}, this, f52260a, false, 53081, new Class[]{LinkedHashMap.class}, Void.TYPE);
            return;
        }
        if (linkedHashMap != null) {
            this.f52262b = linkedHashMap;
        }
        i.a((Callable<TResult>) new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52268a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f52268a, false, 53084, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f52268a, false, 53084, new Class[0], Void.class);
                }
                b.this.c();
                return null;
            }
        }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<Void, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52266a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52266a, false, 53083, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52266a, false, 53083, new Class[]{i.class}, Void.class);
                }
                for (d a2 : b.this.f52265e) {
                    a2.a(b.this.f52262b);
                }
                return null;
            }
        }, i.f1052b);
    }

    public List<a> a(Map<String, String> map, String str) {
        if (PatchProxy.isSupport(new Object[]{map, str}, this, f52260a, false, 53080, new Class[]{Map.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{map, str}, this, f52260a, false, 53080, new Class[]{Map.class, String.class}, List.class);
        } else if (map == null) {
            return null;
        } else {
            String str2 = map.get(str);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            String[] split = str2.split(",");
            ArrayList arrayList = new ArrayList();
            for (String parseInt : split) {
                a a2 = a(Integer.parseInt(parseInt));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }
    }

    @MainThread
    public final void a(final e eVar, final List<a> list) {
        if (PatchProxy.isSupport(new Object[]{eVar, list}, this, f52260a, false, 53082, new Class[]{e.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, list}, this, f52260a, false, 53082, new Class[]{e.class, List.class}, Void.TYPE);
        } else if (list == null || list.size() <= 0) {
            for (d a2 : this.f52265e) {
                a2.a(eVar, list);
            }
        } else {
            this.f52262b.put(eVar, list);
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52274a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f52274a, false, 53086, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f52274a, false, 53086, new Class[0], Void.class);
                    }
                    b.this.c();
                    return null;
                }
            }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<Void, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52270a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f52270a, false, 53085, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52270a, false, 53085, new Class[]{i.class}, Void.class);
                    }
                    for (d a2 : b.this.f52265e) {
                        a2.a(eVar, list);
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }
}
