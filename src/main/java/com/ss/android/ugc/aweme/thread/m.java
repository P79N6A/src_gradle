package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4245a;

    /* renamed from: b  reason: collision with root package name */
    public p f4246b;

    /* renamed from: c  reason: collision with root package name */
    public String f4247c;

    /* renamed from: d  reason: collision with root package name */
    public int f4248d;

    /* renamed from: e  reason: collision with root package name */
    public BlockingQueue<Runnable> f4249e;

    /* renamed from: f  reason: collision with root package name */
    public RejectedExecutionHandler f4250f;
    public long g;
    public ThreadFactory h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4251a;

        /* renamed from: b  reason: collision with root package name */
        public p f4252b;

        /* renamed from: c  reason: collision with root package name */
        public String f4253c;

        /* renamed from: d  reason: collision with root package name */
        public int f4254d;

        /* renamed from: e  reason: collision with root package name */
        public BlockingQueue<Runnable> f4255e;

        /* renamed from: f  reason: collision with root package name */
        public RejectedExecutionHandler f4256f;
        public long g;
        public ThreadFactory h;

        public final m a() {
            if (!PatchProxy.isSupport(new Object[0], this, f4251a, false, 86916, new Class[0], m.class)) {
                return new m(this, (byte) 0);
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f4251a, false, 86916, new Class[0], m.class);
        }

        public final a a(int i) {
            this.f4254d = i;
            return this;
        }

        public final a a(String str) {
            this.f4253c = str;
            return this;
        }

        public final a a(ThreadFactory threadFactory) {
            this.h = threadFactory;
            return this;
        }

        private a(p pVar) {
            this.f4254d = 1;
            this.f4255e = new LinkedBlockingQueue();
            this.f4256f = new ThreadPoolExecutor.AbortPolicy();
            this.g = -1;
            this.f4252b = pVar;
        }

        /* synthetic */ a(p pVar, byte b2) {
            this(pVar);
        }
    }

    private m(a aVar) {
        this.f4246b = aVar.f4252b;
        this.f4247c = aVar.f4253c;
        this.f4248d = aVar.f4254d;
        this.f4249e = aVar.f4255e;
        this.f4250f = aVar.f4256f;
        this.g = aVar.g;
        this.h = aVar.h;
    }

    public static a a(p pVar) {
        p pVar2 = pVar;
        if (!PatchProxy.isSupport(new Object[]{pVar2}, null, f4245a, true, 86915, new Class[]{p.class}, a.class)) {
            return new a(pVar2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{pVar2}, null, f4245a, true, 86915, new Class[]{p.class}, a.class);
    }

    /* synthetic */ m(a aVar, byte b2) {
        this(aVar);
    }
}
