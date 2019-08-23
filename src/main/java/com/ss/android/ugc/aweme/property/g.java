package com.ss.android.ugc.aweme.property;

import android.content.SharedPreferences;
import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.e.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63290a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f63291b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayMap<String, Object> f63292c = new ArrayMap<>();

    public interface a {
        Object defValue();

        String key();

        boolean supportPersist();

        b type();
    }

    public enum b {
        Boolean,
        Integer,
        Long,
        Float,
        String;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final synchronized boolean a(a aVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63290a, false, 70247, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63290a, false, 70247, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar.type() != b.Boolean) {
            z = false;
        }
        f.a(z);
        Boolean bool = (Boolean) this.f63292c.get(aVar.key());
        if (bool == null) {
            if (aVar.supportPersist()) {
                bool = Boolean.valueOf(this.f63291b.getBoolean(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
            } else {
                bool = (Boolean) aVar.defValue();
            }
            this.f63292c.put(aVar.key(), bool);
        }
        return bool.booleanValue();
    }

    public g(SharedPreferences sharedPreferences) {
        this.f63291b = sharedPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String e(com.ss.android.ugc.aweme.property.g.a r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007a }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x007a }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007a }
            r4 = 0
            r5 = 70255(0x1126f, float:9.8448E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007a }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x007a }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0037
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007a }
            r1[r9] = r11     // Catch:{ all -> 0x007a }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007a }
            r4 = 0
            r5 = 70255(0x1126f, float:9.8448E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007a }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x007a }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x007a }
            monitor-exit(r10)
            return r0
        L_0x0037:
            com.ss.android.ugc.aweme.property.g$b r1 = r11.type()     // Catch:{ all -> 0x007a }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.String     // Catch:{ all -> 0x007a }
            if (r1 != r2) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r8 = 0
        L_0x0041:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r8)     // Catch:{ all -> 0x007a }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r10.f63292c     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r11.key()     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x007a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x0078
            boolean r1 = r11.supportPersist()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0069
            android.content.SharedPreferences r1 = r10.f63291b     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r11.key()     // Catch:{ all -> 0x007a }
            java.lang.Object r3 = r11.defValue()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x007a }
            goto L_0x006f
        L_0x0069:
            java.lang.Object r1 = r11.defValue()     // Catch:{ all -> 0x007a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007a }
        L_0x006f:
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r2 = r10.f63292c     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r11.key()     // Catch:{ all -> 0x007a }
            r2.put(r0, r1)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r10)
            return r1
        L_0x007a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.e(com.ss.android.ugc.aweme.property.g$a):java.lang.String");
    }

    public final synchronized boolean f(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63290a, false, 70260, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63290a, false, 70260, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        return this.f63291b.contains(aVar.key());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g(com.ss.android.ugc.aweme.property.g.a r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0056 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0056 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x0056 }
            r4 = 0
            r5 = 70261(0x11275, float:9.8457E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0056 }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x0056 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0056 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0056 }
            r1[r9] = r11     // Catch:{ all -> 0x0056 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x0056 }
            r4 = 0
            r5 = 70261(0x11275, float:9.8457E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0056 }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x0056 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0056 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0056 }
            monitor-exit(r10)
            return
        L_0x0034:
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r10.f63292c     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r11.key()     // Catch:{ all -> 0x0056 }
            r1.remove(r2)     // Catch:{ all -> 0x0056 }
            boolean r1 = r11.supportPersist()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0054
            android.content.SharedPreferences r1 = r10.f63291b     // Catch:{ all -> 0x0056 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = r11.key()     // Catch:{ all -> 0x0056 }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0056 }
            r0.apply()     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r10)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.g(com.ss.android.ugc.aweme.property.g$a):void");
    }

    public final synchronized int b(a aVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63290a, false, 70249, new Class[]{a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63290a, false, 70249, new Class[]{a.class}, Integer.TYPE)).intValue();
        }
        if (aVar.type() != b.Integer) {
            z = false;
        }
        f.a(z);
        Integer num = (Integer) this.f63292c.get(aVar.key());
        if (num == null) {
            if (aVar.supportPersist()) {
                num = Integer.valueOf(this.f63291b.getInt(aVar.key(), ((Integer) aVar.defValue()).intValue()));
            } else {
                num = (Integer) aVar.defValue();
            }
            this.f63292c.put(aVar.key(), num);
        }
        return num.intValue();
    }

    public final synchronized long c(a aVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63290a, false, 70251, new Class[]{a.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63290a, false, 70251, new Class[]{a.class}, Long.TYPE)).longValue();
        }
        if (aVar.type() != b.Long) {
            z = false;
        }
        f.a(z);
        Long l = (Long) this.f63292c.get(aVar.key());
        if (l == null) {
            if (aVar.supportPersist()) {
                l = Long.valueOf(this.f63291b.getLong(aVar.key(), ((Long) aVar.defValue()).longValue()));
            } else {
                l = (Long) aVar.defValue();
            }
            this.f63292c.put(aVar.key(), l);
        }
        return l.longValue();
    }

    public final synchronized float d(a aVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63290a, false, 70253, new Class[]{a.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63290a, false, 70253, new Class[]{a.class}, Float.TYPE)).floatValue();
        }
        if (aVar.type() != b.Float) {
            z = false;
        }
        f.a(z);
        Float f2 = (Float) this.f63292c.get(aVar.key());
        if (f2 == null) {
            if (aVar.supportPersist()) {
                f2 = Float.valueOf(this.f63291b.getFloat(aVar.key(), ((Float) aVar.defValue()).floatValue()));
            } else {
                f2 = (Float) aVar.defValue();
            }
            this.f63292c.put(aVar.key(), f2);
        }
        return f2.floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.property.g.a r12, float r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x007b }
            java.lang.Float r2 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x007b }
            r10 = 1
            r1[r10] = r2     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 70254(0x1126e, float:9.8447E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x007b }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x007b }
            r6[r10] = r2     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0049
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r1[r9] = r12     // Catch:{ all -> 0x007b }
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x007b }
            r1[r10] = r0     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 70254(0x1126e, float:9.8447E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x007b }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x007b }
            r6[r10] = r0     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            monitor-exit(r11)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.property.g$b r1 = r12.type()     // Catch:{ all -> 0x007b }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.Float     // Catch:{ all -> 0x007b }
            if (r1 != r2) goto L_0x0052
            r9 = 1
        L_0x0052:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r9)     // Catch:{ all -> 0x007b }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r11.f63292c     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r12.key()     // Catch:{ all -> 0x007b }
            java.lang.Float r3 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x007b }
            r1.put(r2, r3)     // Catch:{ all -> 0x007b }
            boolean r1 = r12.supportPersist()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0079
            android.content.SharedPreferences r1 = r11.f63291b     // Catch:{ all -> 0x007b }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = r12.key()     // Catch:{ all -> 0x007b }
            android.content.SharedPreferences$Editor r0 = r1.putFloat(r0, r13)     // Catch:{ all -> 0x007b }
            r0.apply()     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r11)
            return
        L_0x007b:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.a(com.ss.android.ugc.aweme.property.g$a, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.property.g.a r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x007b }
            r10 = 1
            r1[r10] = r2     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 70250(0x1126a, float:9.8441E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x007b }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x007b }
            r6[r10] = r2     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0049
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r1[r9] = r12     // Catch:{ all -> 0x007b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x007b }
            r1[r10] = r0     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 70250(0x1126a, float:9.8441E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x007b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x007b }
            r6[r10] = r0     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            monitor-exit(r11)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.property.g$b r1 = r12.type()     // Catch:{ all -> 0x007b }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.Integer     // Catch:{ all -> 0x007b }
            if (r1 != r2) goto L_0x0052
            r9 = 1
        L_0x0052:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r9)     // Catch:{ all -> 0x007b }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r11.f63292c     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r12.key()     // Catch:{ all -> 0x007b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x007b }
            r1.put(r2, r3)     // Catch:{ all -> 0x007b }
            boolean r1 = r12.supportPersist()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0079
            android.content.SharedPreferences r1 = r11.f63291b     // Catch:{ all -> 0x007b }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = r12.key()     // Catch:{ all -> 0x007b }
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r13)     // Catch:{ all -> 0x007b }
            r0.apply()     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r11)
            return
        L_0x007b:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.a(com.ss.android.ugc.aweme.property.g$a, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.property.g.a r15, long r16) {
        /*
            r14 = this;
            r8 = r14
            r9 = r16
            monitor-enter(r14)
            r11 = 2
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0080 }
            r12 = 0
            r1[r12] = r15     // Catch:{ all -> 0x0080 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0080 }
            r2.<init>(r9)     // Catch:{ all -> 0x0080 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x0080 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x0080 }
            r4 = 0
            r5 = 70252(0x1126c, float:9.8444E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0080 }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r12] = r2     // Catch:{ all -> 0x0080 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0080 }
            r6[r13] = r2     // Catch:{ all -> 0x0080 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0080 }
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0080 }
            r1[r12] = r15     // Catch:{ all -> 0x0080 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x0080 }
            r0.<init>(r9)     // Catch:{ all -> 0x0080 }
            r1[r13] = r0     // Catch:{ all -> 0x0080 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x0080 }
            r4 = 0
            r5 = 70252(0x1126c, float:9.8444E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0080 }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r12] = r0     // Catch:{ all -> 0x0080 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0080 }
            r6[r13] = r0     // Catch:{ all -> 0x0080 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0080 }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            monitor-exit(r14)
            return
        L_0x004e:
            com.ss.android.ugc.aweme.property.g$b r1 = r15.type()     // Catch:{ all -> 0x0080 }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.Long     // Catch:{ all -> 0x0080 }
            if (r1 != r2) goto L_0x0057
            r12 = 1
        L_0x0057:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r12)     // Catch:{ all -> 0x0080 }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r8.f63292c     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r15.key()     // Catch:{ all -> 0x0080 }
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0080 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0080 }
            boolean r1 = r15.supportPersist()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x007e
            android.content.SharedPreferences r1 = r8.f63291b     // Catch:{ all -> 0x0080 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r15.key()     // Catch:{ all -> 0x0080 }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r9)     // Catch:{ all -> 0x0080 }
            r0.apply()     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r14)
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.a(com.ss.android.ugc.aweme.property.g$a, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.property.g.a r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x006f }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x006f }
            r10 = 1
            r1[r10] = r13     // Catch:{ all -> 0x006f }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x006f }
            r4 = 0
            r5 = 70256(0x11270, float:9.845E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x006f }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x006f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x006f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006f }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0041
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x006f }
            r1[r9] = r12     // Catch:{ all -> 0x006f }
            r1[r10] = r13     // Catch:{ all -> 0x006f }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x006f }
            r4 = 0
            r5 = 70256(0x11270, float:9.845E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x006f }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x006f }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x006f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006f }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006f }
            monitor-exit(r11)
            return
        L_0x0041:
            com.ss.android.ugc.aweme.property.g$b r1 = r12.type()     // Catch:{ all -> 0x006f }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.String     // Catch:{ all -> 0x006f }
            if (r1 != r2) goto L_0x004a
            r9 = 1
        L_0x004a:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r9)     // Catch:{ all -> 0x006f }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r11.f63292c     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r12.key()     // Catch:{ all -> 0x006f }
            r1.put(r2, r13)     // Catch:{ all -> 0x006f }
            boolean r1 = r12.supportPersist()     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006d
            android.content.SharedPreferences r1 = r11.f63291b     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r12.key()     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r13)     // Catch:{ all -> 0x006f }
            r0.apply()     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r11)
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.a(com.ss.android.ugc.aweme.property.g$a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.property.g.a r12, boolean r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007e }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x007e }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r13)     // Catch:{ all -> 0x007e }
            r10 = 1
            r1[r10] = r2     // Catch:{ all -> 0x007e }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007e }
            r4 = 0
            r5 = 70248(0x11268, float:9.8438E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007e }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r2 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r2     // Catch:{ all -> 0x007e }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007e }
            r6[r10] = r2     // Catch:{ all -> 0x007e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007e }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0049
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007e }
            r1[r9] = r12     // Catch:{ all -> 0x007e }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r13)     // Catch:{ all -> 0x007e }
            r1[r10] = r0     // Catch:{ all -> 0x007e }
            com.meituan.robust.ChangeQuickRedirect r3 = f63290a     // Catch:{ all -> 0x007e }
            r4 = 0
            r5 = 70248(0x11268, float:9.8438E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007e }
            java.lang.Class<com.ss.android.ugc.aweme.property.g$a> r0 = com.ss.android.ugc.aweme.property.g.a.class
            r6[r9] = r0     // Catch:{ all -> 0x007e }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007e }
            r6[r10] = r0     // Catch:{ all -> 0x007e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007e }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r11)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.property.g$b r1 = r12.type()     // Catch:{ all -> 0x007e }
            com.ss.android.ugc.aweme.property.g$b r2 = com.ss.android.ugc.aweme.property.g.b.Boolean     // Catch:{ all -> 0x007e }
            if (r1 != r2) goto L_0x0052
            r9 = 1
        L_0x0052:
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r9)     // Catch:{ all -> 0x007e }
            android.support.v4.util.ArrayMap<java.lang.String, java.lang.Object> r1 = r11.f63292c     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r12.key()     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0060
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007e }
            goto L_0x0062
        L_0x0060:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x007e }
        L_0x0062:
            r1.put(r2, r3)     // Catch:{ all -> 0x007e }
            boolean r1 = r12.supportPersist()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x007c
            android.content.SharedPreferences r1 = r11.f63291b     // Catch:{ all -> 0x007e }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r12.key()     // Catch:{ all -> 0x007e }
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r13)     // Catch:{ all -> 0x007e }
            r0.apply()     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r11)
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.g.a(com.ss.android.ugc.aweme.property.g$a, boolean):void");
    }
}
