package com.google.android.gms.internal;

import android.content.Context;

public final class zzbgx {
    private static Context zzaKh;
    private static Boolean zzaKi;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0051 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0051=Splitter:B:24:0x0051, B:19:0x003e=Splitter:B:19:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean zzaN(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.zzbgx> r0 = com.google.android.gms.internal.zzbgx.class
            monitor-enter(r0)
            android.content.Context r1 = r5.getApplicationContext()     // Catch:{ all -> 0x005e }
            android.content.Context r2 = zzaKh     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r2 = zzaKi     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x001b
            android.content.Context r2 = zzaKh     // Catch:{ all -> 0x005e }
            if (r2 != r1) goto L_0x001b
            java.lang.Boolean r5 = zzaKi     // Catch:{ all -> 0x005e }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)
            return r5
        L_0x001b:
            r2 = 0
            zzaKi = r2     // Catch:{ all -> 0x005e }
            boolean r2 = com.google.android.gms.common.util.zzq.isAtLeastO()     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0043
            java.lang.Class<android.content.pm.PackageManager> r5 = android.content.pm.PackageManager.class
            java.lang.String r2 = "isInstantApp"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r2, r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            java.lang.Object r5 = r5.invoke(r2, r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            zzaKi = r5     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003e }
            goto L_0x0054
        L_0x003e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005e }
        L_0x0040:
            zzaKi = r5     // Catch:{ all -> 0x005e }
            goto L_0x0054
        L_0x0043:
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r5.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0051 }
            zzaKi = r5     // Catch:{ ClassNotFoundException -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005e }
            goto L_0x0040
        L_0x0054:
            zzaKh = r1     // Catch:{ all -> 0x005e }
            java.lang.Boolean r5 = zzaKi     // Catch:{ all -> 0x005e }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)
            return r5
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbgx.zzaN(android.content.Context):boolean");
    }
}
