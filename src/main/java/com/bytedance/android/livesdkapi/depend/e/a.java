package com.bytedance.android.livesdkapi.depend.e;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18633a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f18634b = "a";

    /* renamed from: c  reason: collision with root package name */
    private ArrayBlockingQueue<Runnable> f18635c;

    /* renamed from: d  reason: collision with root package name */
    private c f18636d;

    /* renamed from: e  reason: collision with root package name */
    private b f18637e;

    /* renamed from: com.bytedance.android.livesdkapi.depend.e.a$a  reason: collision with other inner class name */
    public static class C0133a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18638a;

        /* renamed from: b  reason: collision with root package name */
        int f18639b;

        /* renamed from: c  reason: collision with root package name */
        c f18640c;

        /* renamed from: d  reason: collision with root package name */
        String f18641d;
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18642a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18643b;

        /* renamed from: c  reason: collision with root package name */
        private ArrayBlockingQueue<Runnable> f18644c;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f18642a, false, 14946, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18642a, false, 14946, new Class[0], Void.TYPE);
                return;
            }
            while (!this.f18643b) {
                try {
                    this.f18644c.take().run();
                } catch (InterruptedException unused) {
                }
            }
        }

        private b(ArrayBlockingQueue<Runnable> arrayBlockingQueue) {
            this.f18644c = arrayBlockingQueue;
        }

        /* synthetic */ b(ArrayBlockingQueue arrayBlockingQueue, byte b2) {
            this(arrayBlockingQueue);
        }
    }

    public interface c {
    }

    static class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18645a;

        /* renamed from: b  reason: collision with root package name */
        private String f18646b;

        /* renamed from: c  reason: collision with root package name */
        private AtomicInteger f18647c;

        private d(String str) {
            this.f18647c = new AtomicInteger();
            this.f18646b = str;
        }

        public final Thread newThread(@NonNull Runnable runnable) {
            if (PatchProxy.isSupport(new Object[]{runnable}, this, f18645a, false, 14947, new Class[]{Runnable.class}, Thread.class)) {
                return (Thread) PatchProxy.accessDispatch(new Object[]{runnable}, this, f18645a, false, 14947, new Class[]{Runnable.class}, Thread.class);
            }
            int incrementAndGet = this.f18647c.incrementAndGet();
            Thread thread = new Thread(runnable, this.f18646b + "-" + incrementAndGet);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }

        /* synthetic */ d(String str, byte b2) {
            this(str);
        }
    }

    public void execute(@NonNull Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f18633a, false, 14944, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f18633a, false, 14944, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        this.f18635c.offer(runnable2);
    }

    private a(int i, ThreadFactory threadFactory, c cVar) {
        this.f18635c = new ArrayBlockingQueue<>(i);
        this.f18637e = new b(this.f18635c, (byte) 0);
        threadFactory.newThread(this.f18637e).start();
        this.f18636d = cVar;
    }

    /* synthetic */ a(int i, ThreadFactory threadFactory, c cVar, byte b2) {
        this(i, threadFactory, cVar);
    }
}
