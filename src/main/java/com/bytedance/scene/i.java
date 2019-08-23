package com.bytedance.scene;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22137a = new a() {
        public final i a() {
            return new i(null, i.a(), (byte) 0);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f22138f = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    final String f22139b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, i> f22140c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Object, Object> f22141d;

    /* renamed from: e  reason: collision with root package name */
    private final i f22142e;

    public interface a {
        i a();
    }

    public interface b {
        void a();
    }

    public static String a() {
        return "Scene #" + f22138f.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f22142e != null) {
            i iVar = this.f22142e;
            iVar.f22140c.remove(this.f22139b);
        }
        for (Object next : this.f22141d.values()) {
            if (next instanceof b) {
                ((b) next).a();
            }
        }
        this.f22141d.clear();
        this.f22140c.clear();
    }

    @Nullable
    public final <T> T a(@NonNull Object obj) {
        i iVar = this;
        while (true) {
            T t = iVar.f22141d.get(obj);
            if (t != null) {
                return t;
            }
            if (iVar.f22142e == null) {
                return null;
            }
            iVar = iVar.f22142e;
        }
    }

    public final void a(@NonNull Object obj, @NonNull Object obj2) {
        this.f22141d.put(obj, obj2);
    }

    i(i iVar, String str) {
        this.f22140c = new HashMap();
        this.f22141d = new HashMap();
        this.f22142e = iVar;
        this.f22139b = str;
    }

    /* synthetic */ i(i iVar, String str, byte b2) {
        this(null, str);
    }
}
