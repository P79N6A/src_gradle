package com.ss.android.ugc.aweme.tools;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class bd {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74655a;

    /* renamed from: b  reason: collision with root package name */
    private final List<bh> f74656b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Type, bg<?>> f74657c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f74658d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f74659e;

    /* renamed from: f  reason: collision with root package name */
    private final PrintWriter f74660f;

    @Nullable
    private <T extends bc> bg<T> a(@NonNull Type type) {
        bg<T> bgVar;
        if (PatchProxy.isSupport(new Object[]{type}, this, f74655a, false, 87005, new Class[]{Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{type}, this, f74655a, false, 87005, new Class[]{Type.class}, bg.class);
        }
        bg<T> bgVar2 = this.f74657c.get(type);
        if (bgVar2 != null) {
            return bgVar2;
        }
        for (bh a2 : this.f74656b) {
            bg<T> a3 = a2.a(this, type);
            if (a3 != null) {
                if (this.f74659e) {
                    bgVar = new ab<>(a3, this.f74660f);
                } else {
                    bgVar = a3;
                }
                this.f74657c.put(type, bgVar);
                return bgVar;
            }
        }
        return null;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f74655a, false, 87006, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f74655a, false, 87006, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74658d = false;
        if (this.f74659e) {
            PrintWriter printWriter = this.f74660f;
            printWriter.println("set enabled to " + false);
        }
    }

    @Nullable
    public final <T extends bc> bg<T> a(@NonNull bh bhVar, @NonNull Type type) {
        bg<T> bgVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{bhVar, type}, this, f74655a, false, 87003, new Class[]{bh.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bhVar, type}, this, f74655a, false, 87003, new Class[]{bh.class, Type.class}, bg.class);
        }
        for (bh next : this.f74656b) {
            if (z) {
                bg<T> a2 = next.a(this, type);
                if (a2 != null) {
                    if (this.f74659e) {
                        bgVar = new ab<>(a2, this.f74660f);
                    } else {
                        bgVar = a2;
                    }
                    return bgVar;
                }
            } else if (next == bhVar) {
                z = true;
            }
        }
        return null;
    }

    public final boolean a(@NonNull Object obj, @NonNull bc bcVar) {
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f74655a, false, 87004, new Class[]{Object.class, bc.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f74655a, false, 87004, new Class[]{Object.class, bc.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f74658d) {
            if (this.f74659e) {
                PrintWriter printWriter = this.f74660f;
                printWriter.println("Ignoring event " + bcVar + " from " + obj + ClassUtils.PACKAGE_SEPARATOR);
            }
            return false;
        } else {
            bg<?> a2 = a((Type) bcVar.getClass());
            if (a2 != null) {
                a2.a(obj, bcVar);
                return true;
            }
            if (this.f74659e) {
                PrintWriter printWriter2 = this.f74660f;
                printWriter2.println("Did not find a UiEventHandler corresponding to " + bcVar + ClassUtils.PACKAGE_SEPARATOR);
            }
            return false;
        }
    }

    bd(List<bh> list, boolean z, PrintWriter printWriter) {
        this.f74656b = list;
        this.f74658d = true;
        this.f74659e = z;
        this.f74660f = printWriter;
    }
}
