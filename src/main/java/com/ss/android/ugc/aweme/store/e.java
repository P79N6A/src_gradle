package com.ss.android.ugc.aweme.store;

import a.i;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.store.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71757a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f71758b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f71759c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Handler f71760d = new Handler(Looper.getMainLooper());

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71761a;

        /* renamed from: b  reason: collision with root package name */
        public TaskRecord f71762b;

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f71763c;

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, f71761a, false, 82133, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71761a, false, 82133, new Class[0], Void.TYPE);
                return;
            }
            i.a((Callable<TResult>) new f<TResult>(this));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object a() throws Exception {
            if (!this.f71763c) {
                TaskRecord taskRecord = this.f71762b;
                if (PatchProxy.isSupport(new Object[0], taskRecord, TaskRecord.f71737a, false, 82136, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], taskRecord, TaskRecord.f71737a, false, 82136, new Class[0], Void.TYPE);
                } else {
                    try {
                        taskRecord.a(1);
                        taskRecord.f71740d.getPreloader().a(taskRecord.f71739c);
                        taskRecord.a(4);
                    } catch (Exception unused) {
                        taskRecord.a(3);
                    }
                }
            }
            return null;
        }

        public a(TaskRecord taskRecord) {
            this.f71762b = taskRecord;
        }
    }

    private e() {
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f71757a, true, 82126, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f71757a, true, 82126, new Class[0], e.class);
        }
        if (f71758b == null) {
            synchronized (e.class) {
                if (f71758b == null) {
                    f71758b = new e();
                }
            }
        }
        return f71758b;
    }

    public final void a(TaskRecord taskRecord) {
        if (PatchProxy.isSupport(new Object[]{taskRecord}, this, f71757a, false, 82127, new Class[]{TaskRecord.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{taskRecord}, this, f71757a, false, 82127, new Class[]{TaskRecord.class}, Void.TYPE);
        } else if (taskRecord.f71739c != null && !TextUtils.isEmpty(taskRecord.f71739c.getAid()) && taskRecord.f71740d != null) {
            a aVar = new a(taskRecord);
            this.f71759c.add(aVar);
            this.f71760d.postDelayed(aVar, (long) taskRecord.f71738b);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71757a, false, 82128, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71757a, false, 82128, new Class[]{String.class}, Void.TYPE);
            return;
        }
        new StringBuilder("cancel all ").append(this.f71759c.size());
        Iterator<a> it2 = this.f71759c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!(next == null || next.f71762b == null || next.f71762b.f71739c == null || next.f71762b.f71739c.getAid() == null || !next.f71762b.f71739c.getAid().equals(str2))) {
                if (PatchProxy.isSupport(new Object[0], next, a.f71761a, false, 82134, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], next, a.f71761a, false, 82134, new Class[0], Void.TYPE);
                } else {
                    new StringBuilder("cancel task ").append(next.f71762b.f71739c.getAid());
                    next.f71763c = true;
                }
                this.f71760d.removeCallbacks(next);
                it2.remove();
            }
        }
    }

    public final int b(String str, d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f71757a, false, 82132, new Class[]{String.class, d.a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f71757a, false, 82132, new Class[]{String.class, d.a.class}, Integer.TYPE)).intValue();
        }
        a a2 = a(str, aVar);
        if (a2 != null) {
            return a2.f71762b.f71741e;
        }
        return -1;
    }

    public final a a(String str, d.a aVar) {
        String str2 = str;
        d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f71757a, false, 82129, new Class[]{String.class, d.a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f71757a, false, 82129, new Class[]{String.class, d.a.class}, a.class);
        }
        for (a next : this.f71759c) {
            if (next != null && next.f71762b != null && next.f71762b.f71739c != null && next.f71762b.f71739c.getAid() != null && next.f71762b.f71739c.getAid().equals(str2) && next.f71762b.f71740d == aVar2) {
                return next;
            }
        }
        return null;
    }
}
