package com.ss.android.pushmanager.app;

import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30492a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30493b;

    /* renamed from: c  reason: collision with root package name */
    private final TreeMap<a, a> f30494c = new TreeMap<>(new Comparator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30495a;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f30495a, false, 18994, new Class[]{a.class, a.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f30495a, false, 18994, new Class[]{a.class, a.class}, Integer.TYPE)).intValue();
            } else if (aVar == null) {
                return 1;
            } else {
                if (aVar2 != null) {
                    if (aVar.equals(aVar2)) {
                        return 0;
                    }
                    if (aVar.f30499c > aVar2.f30499c) {
                        return 1;
                    }
                }
                return -1;
            }
        }
    });

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30497a;

        /* renamed from: b  reason: collision with root package name */
        public Long f30498b;

        /* renamed from: c  reason: collision with root package name */
        public long f30499c;

        public int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, f30497a, false, 18996, new Class[0], Integer.TYPE)) {
                return this.f30498b.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30497a, false, 18996, new Class[0], Integer.TYPE)).intValue();
        }

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f30497a, false, 18997, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30497a, false, 18997, new Class[0], String.class);
            }
            return String.valueOf(this.f30498b) + "|" + String.valueOf(this.f30499c);
        }

        public a() {
        }

        public boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f30497a, false, 18995, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f30497a, false, 18995, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if ((obj2 instanceof a) && obj2 != null) {
                return this.f30498b.equals(((a) obj2).f30498b);
            } else {
                return super.equals(obj);
            }
        }
    }

    public final synchronized String a() {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f30492a, false, 18992, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30492a, false, 18992, new Class[0], String.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            Set<Map.Entry<a, a>> entrySet = this.f30494c.entrySet();
            for (Map.Entry<a, a> value : entrySet) {
                a aVar = (a) value.getValue();
                if (aVar != null) {
                    if (i != entrySet.size() - 1) {
                        sb.append(aVar.toString());
                        sb.append("@");
                    } else {
                        sb.append(aVar.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
            try {
                Logger.debug();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return str;
    }

    public b(int i) {
        this.f30493b = i;
    }

    public final synchronized a b(a aVar) {
        a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f30492a, false, 18990, new Class[]{a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f30492a, false, 18990, new Class[]{a.class}, a.class);
        } else if (aVar == null) {
            return null;
        } else {
            try {
                aVar2 = this.f30494c.get(aVar);
                try {
                    Logger.debug();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                aVar2 = null;
            }
        }
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r19) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            monitor-enter(r18)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00b9 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30492a     // Catch:{ all -> 0x00b9 }
            r4 = 0
            r5 = 18993(0x4a31, float:2.6615E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b9 }
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00b9 }
            r1[r10] = r0     // Catch:{ all -> 0x00b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30492a     // Catch:{ all -> 0x00b9 }
            r4 = 0
            r5 = 18993(0x4a31, float:2.6615E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b9 }
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r18)
            return
        L_0x0038:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r19)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0040
            monitor-exit(r18)
            return
        L_0x0040:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00b9 }
            java.util.TreeMap<com.ss.android.pushmanager.app.b$a, com.ss.android.pushmanager.app.b$a> r1 = r8.f30494c     // Catch:{ Exception -> 0x00b7 }
            r1.clear()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r1 = "@"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.length     // Catch:{ Exception -> 0x00b7 }
            r2 = 0
        L_0x0052:
            if (r2 >= r1) goto L_0x00b5
            r3 = r0[r2]     // Catch:{ Exception -> 0x00b7 }
            com.ss.android.pushmanager.app.b$a r4 = new com.ss.android.pushmanager.app.b$a     // Catch:{ Exception -> 0x00b7 }
            r4.<init>()     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00b7 }
            r11[r10] = r3     // Catch:{ Exception -> 0x00b7 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.app.b.a.f30497a     // Catch:{ Exception -> 0x00b7 }
            r14 = 0
            r15 = 18998(0x4a36, float:2.6622E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6     // Catch:{ Exception -> 0x00b7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00b7 }
            r12 = r4
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b7 }
            if (r5 == 0) goto L_0x008d
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00b7 }
            r11[r10] = r3     // Catch:{ Exception -> 0x00b7 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.app.b.a.f30497a     // Catch:{ Exception -> 0x00b7 }
            r14 = 0
            r15 = 18998(0x4a36, float:2.6622E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r10] = r5     // Catch:{ Exception -> 0x00b7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00b7 }
            r12 = r4
            r16 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00af
        L_0x008d:
            if (r3 == 0) goto L_0x00af
            java.lang.String r5 = "\\|"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x00b7 }
            if (r3 == 0) goto L_0x00af
            int r5 = r3.length     // Catch:{ Exception -> 0x00b7 }
            r6 = 2
            if (r5 != r6) goto L_0x00af
            r5 = r3[r10]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00b7 }
            r4.f30498b = r5     // Catch:{ Exception -> 0x00b7 }
            r3 = r3[r9]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00b7 }
            long r5 = r3.longValue()     // Catch:{ Exception -> 0x00b7 }
            r4.f30499c = r5     // Catch:{ Exception -> 0x00b7 }
        L_0x00af:
            r8.c(r4)     // Catch:{ Exception -> 0x00b7 }
            int r2 = r2 + 1
            goto L_0x0052
        L_0x00b5:
            monitor-exit(r18)
            return
        L_0x00b7:
            monitor-exit(r18)
            return
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.app.b.a(java.lang.String):void");
    }

    public final synchronized void c(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f30492a, false, 18991, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f30492a, false, 18991, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            try {
                Logger.debug();
                if (Logger.debug()) {
                    a();
                }
                if (this.f30494c.size() >= this.f30493b && !a(aVar)) {
                    Logger.debug();
                    this.f30494c.remove(this.f30494c.firstKey());
                }
                if (a(aVar)) {
                    Logger.debug();
                    this.f30494c.remove(aVar);
                }
                this.f30494c.put(aVar, aVar);
                if (Logger.debug()) {
                    a();
                }
                Logger.debug();
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized boolean a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f30492a, false, 18989, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f30492a, false, 18989, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar == null) {
            return false;
        } else {
            boolean containsKey = this.f30494c.containsKey(aVar);
            Logger.debug();
            return containsKey;
        }
    }
}
