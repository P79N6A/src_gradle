package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f24240a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static c f24241b = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static ReferenceQueue f24242c = new ReferenceQueue();

    /* renamed from: d  reason: collision with root package name */
    private static Thread f24243d;

    /* renamed from: com.facebook.jni.a$a  reason: collision with other inner class name */
    public static abstract class C0269a extends PhantomReference<Object> {

        /* renamed from: a  reason: collision with root package name */
        public C0269a f24244a;

        /* renamed from: b  reason: collision with root package name */
        public C0269a f24245b;

        /* access modifiers changed from: package-private */
        public abstract void a();

        private C0269a() {
            super(null, a.f24242c);
        }

        /* synthetic */ C0269a(byte b2) {
            this();
        }

        C0269a(Object obj) {
            super(obj, a.f24242c);
            a.f24241b.a(this);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        C0269a f24246a = new d((byte) 0);

        public b() {
            this.f24246a.f24244a = new d((byte) 0);
            this.f24246a.f24244a.f24245b = this.f24246a;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        AtomicReference<C0269a> f24247a;

        private c() {
            this.f24247a = new AtomicReference<>();
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final void a(C0269a aVar) {
            C0269a aVar2;
            do {
                aVar2 = this.f24247a.get();
                aVar.f24244a = aVar2;
            } while (!this.f24247a.compareAndSet(aVar2, aVar));
        }
    }

    static class d extends C0269a {
        private d() {
            super((byte) 0);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        AnonymousClass1 r0 = new Thread("HybridData DestructorThread") {
            /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(3:3|(1:5)|8)(1:7)|6) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0034, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r5 = this;
                L_0x0000:
                    java.lang.ref.ReferenceQueue r0 = com.facebook.jni.a.f24242c     // Catch:{ InterruptedException -> 0x0000 }
                    java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r0 = (com.facebook.jni.a.C0269a) r0     // Catch:{ InterruptedException -> 0x0000 }
                    r0.a()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r1 = r0.f24245b     // Catch:{ InterruptedException -> 0x0000 }
                    if (r1 != 0) goto L_0x0034
                    com.facebook.jni.a$c r1 = com.facebook.jni.a.f24241b     // Catch:{ InterruptedException -> 0x0000 }
                    java.util.concurrent.atomic.AtomicReference<com.facebook.jni.a$a> r1 = r1.f24247a     // Catch:{ InterruptedException -> 0x0000 }
                    r2 = 0
                    java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r1 = (com.facebook.jni.a.C0269a) r1     // Catch:{ InterruptedException -> 0x0000 }
                L_0x001a:
                    if (r1 == 0) goto L_0x0034
                    com.facebook.jni.a$a r2 = r1.f24244a     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$b r3 = com.facebook.jni.a.f24240a     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r4 = r3.f24246a     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r4 = r4.f24244a     // Catch:{ InterruptedException -> 0x0000 }
                    r1.f24244a = r4     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r4 = r3.f24246a     // Catch:{ InterruptedException -> 0x0000 }
                    r4.f24244a = r1     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r4 = r1.f24244a     // Catch:{ InterruptedException -> 0x0000 }
                    r4.f24245b = r1     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r3 = r3.f24246a     // Catch:{ InterruptedException -> 0x0000 }
                    r1.f24245b = r3     // Catch:{ InterruptedException -> 0x0000 }
                    r1 = r2
                    goto L_0x001a
                L_0x0034:
                    com.facebook.jni.a$a r1 = r0.f24244a     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r2 = r0.f24245b     // Catch:{ InterruptedException -> 0x0000 }
                    r1.f24245b = r2     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r1 = r0.f24245b     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r0 = r0.f24244a     // Catch:{ InterruptedException -> 0x0000 }
                    r1.f24244a = r0     // Catch:{ InterruptedException -> 0x0000 }
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.jni.a.AnonymousClass1.run():void");
            }
        };
        f24243d = r0;
        r0.start();
    }
}
