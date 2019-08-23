package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class c<K, V> implements a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7788a;

    /* renamed from: b  reason: collision with root package name */
    private Map<K, V> f7789b;

    /* renamed from: c  reason: collision with root package name */
    private int f7790c;

    /* renamed from: d  reason: collision with root package name */
    private int f7791d;

    public c() {
        this(8);
    }

    public final synchronized Map<K, V> a() {
        if (PatchProxy.isSupport(new Object[0], this, f7788a, false, 150, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f7788a, false, 150, new Class[0], Map.class);
        }
        return new LinkedHashMap(this.f7789b);
    }

    public final synchronized String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f7788a, false, 153, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f7788a, false, 153, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : this.f7789b.entrySet()) {
            sb.append(next.getKey());
            sb.append('=');
            sb.append(next.getValue());
            sb.append(",");
        }
        sb.append("maxMemory=");
        sb.append(this.f7790c);
        sb.append(",memorySize=");
        sb.append(this.f7791d);
        return sb.toString();
    }

    public c(int i) {
        if (i > 0) {
            try {
                this.f7789b = new d(i);
                this.f7790c = i;
            } catch (OutOfMemoryError unused) {
                this.f7789b = new d(10);
                this.f7790c = 10;
            }
        } else {
            throw new IllegalArgumentException("capacity <= 0");
        }
    }

    public final void a(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7788a, false, 148, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k}, this, f7788a, false, 148, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            if (this.f7789b.remove(k) != null) {
                this.f7791d--;
            }
        }
    }

    public final V b(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7788a, false, 146, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k}, this, f7788a, false, 146, new Class[]{Object.class}, Object.class);
        }
        synchronized (this) {
            V v = this.f7789b.get(k);
            if (v != null) {
                return v;
            }
            return null;
        }
    }

    public final void a(K k, V v) {
        String str;
        if (PatchProxy.isSupport(new Object[]{k, v}, this, f7788a, false, 147, new Class[]{Object.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k, v}, this, f7788a, false, 147, new Class[]{Object.class, Object.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            V put = this.f7789b.put(k, v);
            this.f7791d++;
            if (put != null) {
                this.f7791d--;
            }
            int i = this.f7790c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f7788a, false, 152, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f7788a, false, 152, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                while (this.f7791d > i && !this.f7789b.isEmpty()) {
                    if (this.f7791d >= 0) {
                        if (!this.f7789b.isEmpty() || this.f7791d == 0) {
                            Map.Entry next = this.f7789b.entrySet().iterator().next();
                            this.f7789b.remove(next.getKey());
                            int i2 = this.f7791d;
                            next.getValue();
                            this.f7791d = i2 - 1;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    if (PatchProxy.isSupport(new Object[0], this, f7788a, false, 151, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], this, f7788a, false, 151, new Class[0], String.class);
                    } else {
                        str = c.class.getName();
                    }
                    sb.append(str);
                    sb.append(".getValueSize() is reporting inconsistent results");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }
}
