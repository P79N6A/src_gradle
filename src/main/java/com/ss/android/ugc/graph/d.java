package com.ss.android.ugc.graph;

import com.ss.android.ugc.graph.e;
import java.lang.reflect.Method;
import java.util.Map;

public final class d implements e.c {

    /* renamed from: a  reason: collision with root package name */
    private Map<Class, Method> f4327a;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(java.lang.Object r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f4327a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000f
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f4327a     // Catch:{ all -> 0x003b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r5)
            return
        L_0x000f:
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch:{ Exception -> 0x0039 }
            if (r6 == 0) goto L_0x0037
            int r0 = r6.length     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0037
        L_0x001d:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r2 = 0
        L_0x0025:
            if (r2 >= r1) goto L_0x0033
            r3 = r6[r2]     // Catch:{ Exception -> 0x0039 }
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ Exception -> 0x0039 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0039 }
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0033:
            r5.f4327a = r0     // Catch:{ Exception -> 0x0039 }
            monitor-exit(r5)
            return
        L_0x0037:
            monitor-exit(r5)
            return
        L_0x0039:
            monitor-exit(r5)
            return
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.graph.d.a(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T load(java.lang.Object r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r5.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x000b
            return r4
        L_0x000b:
            com.ss.android.ugc.graph.c$a r0 = com.ss.android.ugc.graph.c.a.INSTANCE
            com.ss.android.ugc.graph.c r0 = r0.getDelegateProxy()
            r1 = 0
            if (r4 == 0) goto L_0x002f
            if (r5 != 0) goto L_0x0017
            goto L_0x002f
        L_0x0017:
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = com.ss.android.ugc.graph.a.generateComponentDelegateName(r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.graph.e$c> r0 = r0.f77674a
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.graph.e$c r0 = (com.ss.android.ugc.graph.e.c) r0
            if (r0 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            java.lang.Object r0 = r0.load(r4, r5)
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            return r0
        L_0x0033:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f4327a
            if (r0 == 0) goto L_0x003f
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f4327a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0042
        L_0x003f:
            r3.a(r4)
        L_0x0042:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f4327a
            if (r0 == 0) goto L_0x0063
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f4327a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004f
            goto L_0x0063
        L_0x004f:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f4327a     // Catch:{ Throwable -> 0x0062 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Throwable -> 0x0062 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ Throwable -> 0x0062 }
            if (r5 != 0) goto L_0x005a
            return r1
        L_0x005a:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0062 }
            java.lang.Object r4 = r5.invoke(r4, r0)     // Catch:{ Throwable -> 0x0062 }
            return r4
        L_0x0062:
            return r1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.graph.d.load(java.lang.Object, java.lang.Class):java.lang.Object");
    }
}
