package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
@ReflectionSupport
public abstract class p<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f24890a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f24891b = new a((byte) 0);

    static final class a implements Runnable {
        public final void run() {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(@NullableDecl T t, @NullableDecl Throwable th);

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public abstract T b() throws Exception;

    /* access modifiers changed from: package-private */
    public abstract String c();

    p() {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void run() {
        /*
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            boolean r2 = r5.compareAndSet(r1, r0)
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            boolean r2 = r5.a()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x004f
            java.lang.Object r3 = r5.b()     // Catch:{ Throwable -> 0x0034, all -> 0x0019 }
            goto L_0x0050
        L_0x0019:
            r3 = move-exception
            java.lang.Runnable r4 = f24890a
            boolean r0 = r5.compareAndSet(r0, r4)
            if (r0 != 0) goto L_0x002e
        L_0x0022:
            java.lang.Object r0 = r5.get()
            java.lang.Runnable r4 = f24891b
            if (r0 != r4) goto L_0x002e
            java.lang.Thread.yield()
            goto L_0x0022
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r5.a(r1, r1)
        L_0x0033:
            throw r3
        L_0x0034:
            r3 = move-exception
            java.lang.Runnable r4 = f24890a
            boolean r0 = r5.compareAndSet(r0, r4)
            if (r0 != 0) goto L_0x0049
        L_0x003d:
            java.lang.Object r0 = r5.get()
            java.lang.Runnable r4 = f24891b
            if (r0 != r4) goto L_0x0049
            java.lang.Thread.yield()
            goto L_0x003d
        L_0x0049:
            if (r2 == 0) goto L_0x006a
            r5.a(r1, r3)
            return
        L_0x004f:
            r3 = r1
        L_0x0050:
            java.lang.Runnable r4 = f24890a
            boolean r0 = r5.compareAndSet(r0, r4)
            if (r0 != 0) goto L_0x0064
        L_0x0058:
            java.lang.Object r0 = r5.get()
            java.lang.Runnable r4 = f24891b
            if (r0 != r4) goto L_0x0064
            java.lang.Thread.yield()
            goto L_0x0058
        L_0x0064:
            if (r2 == 0) goto L_0x006a
            r5.a(r3, r1)
            return
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.p.run():void");
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f24890a) {
            str = "running=[DONE]";
        } else if (runnable == f24891b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + c();
    }
}
