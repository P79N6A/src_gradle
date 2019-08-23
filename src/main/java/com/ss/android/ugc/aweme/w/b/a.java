package com.ss.android.ugc.aweme.w.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a<M> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76548a;

    /* renamed from: b  reason: collision with root package name */
    public M f76549b;

    /* renamed from: c  reason: collision with root package name */
    public C0799a f76550c;

    /* renamed from: d  reason: collision with root package name */
    public int f76551d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f76552e;

    /* renamed from: com.ss.android.ugc.aweme.w.b.a$a  reason: collision with other inner class name */
    public enum C0799a {
        SUCCESS,
        ERROR,
        LOADING,
        PROGRESS;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static <M> a<M> a(C0799a aVar, M m) {
        C0799a aVar2 = aVar;
        M m2 = m;
        if (PatchProxy.isSupport(new Object[]{aVar2, m2}, null, f76548a, true, 60651, new Class[]{C0799a.class, Object.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar2, m2}, null, f76548a, true, 60651, new Class[]{C0799a.class, Object.class}, a.class);
        }
        a<M> aVar3 = new a<>();
        aVar3.f76550c = aVar2;
        aVar3.f76549b = m2;
        return aVar3;
    }

    public static <T extends Throwable, M> a<M> a(C0799a aVar, T t) {
        C0799a aVar2 = aVar;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{aVar2, t2}, null, f76548a, true, 60653, new Class[]{C0799a.class, Throwable.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar2, t2}, null, f76548a, true, 60653, new Class[]{C0799a.class, Throwable.class}, a.class);
        }
        a<M> aVar3 = new a<>();
        aVar3.f76550c = aVar2;
        aVar3.f76552e = t2;
        return aVar3;
    }

    public static <M> a<M> a(C0799a aVar, M m, int i) {
        C0799a aVar2 = aVar;
        M m2 = m;
        if (PatchProxy.isSupport(new Object[]{aVar2, m2, Integer.valueOf(i)}, null, f76548a, true, 60652, new Class[]{C0799a.class, Object.class, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar2, m2, Integer.valueOf(i)}, null, f76548a, true, 60652, new Class[]{C0799a.class, Object.class, Integer.TYPE}, a.class);
        }
        a<M> aVar3 = new a<>();
        aVar3.f76550c = aVar2;
        aVar3.f76549b = m2;
        aVar3.f76551d = i;
        return aVar3;
    }
}
