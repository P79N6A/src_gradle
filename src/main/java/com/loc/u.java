package com.loc;

import android.content.Context;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

public abstract class u extends ClassLoader {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f25888a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, Class<?>> f25889b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected DexFile f25890c = null;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f25891d = true;

    /* renamed from: e  reason: collision with root package name */
    protected dh f25892e;

    /* renamed from: f  reason: collision with root package name */
    protected String f25893f;
    protected volatile boolean g = false;
    protected volatile boolean h = false;

    public u(Context context, dh dhVar) {
        super(context.getClassLoader());
        this.f25888a = context;
        this.f25892e = dhVar;
    }

    public final boolean a() {
        return this.f25890c != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002b, code lost:
        com.loc.f.a(r0, "BaseLoader", "releaseDexFile()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r3.f25889b     // Catch:{ Throwable -> 0x002a }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x002a }
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r3.f25889b     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            dalvik.system.DexFile r0 = r3.f25890c     // Catch:{ Throwable -> 0x002a }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.h     // Catch:{ Throwable -> 0x002a }
            if (r0 == 0) goto L_0x001e
            dalvik.system.DexFile r0 = r3.f25890c     // Catch:{ Throwable -> 0x002a }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x002a }
            dalvik.system.DexFile r1 = r3.f25890c     // Catch:{ all -> 0x001b }
            r1.wait()     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            goto L_0x001e
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Throwable -> 0x002a }
            throw r1     // Catch:{ Throwable -> 0x002a }
        L_0x001e:
            r0 = 1
            r3.g = r0     // Catch:{ Throwable -> 0x002a }
            dalvik.system.DexFile r0 = r3.f25890c     // Catch:{ Throwable -> 0x002a }
            r0.close()     // Catch:{ Throwable -> 0x002a }
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Throwable -> 0x002a }
            throw r1     // Catch:{ Throwable -> 0x002a }
        L_0x002a:
            r0 = move-exception
            java.lang.String r1 = "BaseLoader"
            java.lang.String r2 = "releaseDexFile()"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.u.b():void");
    }
}
