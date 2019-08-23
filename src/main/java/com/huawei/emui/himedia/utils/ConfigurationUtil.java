package com.huawei.emui.himedia.utils;

public class ConfigurationUtil {
    public static boolean isQcomEmuiLite() {
        return ((Boolean) getSystemProperty("ro.build.hw_emui_ultra_lite", Boolean.FALSE, Boolean.class)).booleanValue();
    }

    public static boolean isSupportedSupperNight() {
        return ((Boolean) getSystemProperty("ro.hwcamera.suppernight", Boolean.TRUE, Boolean.class)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.Object getSystemProperty(java.lang.String r6, java.lang.Object r7, java.lang.Class r8) {
        /*
            java.lang.Class<com.huawei.emui.himedia.utils.ConfigurationUtil> r0 = com.huawei.emui.himedia.utils.ConfigurationUtil.class
            monitor-enter(r0)
            com.huawei.emui.himedia.reflect.ReflectClass r1 = new com.huawei.emui.himedia.reflect.ReflectClass     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "android.os.SystemProperties"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0039 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0039 }
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r4 = 1
            r5 = 2
            if (r8 != r2) goto L_0x0022
            java.lang.String r8 = "getBoolean"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0039 }
            r2[r3] = r6     // Catch:{ all -> 0x0039 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0039 }
            r2[r4] = r7     // Catch:{ all -> 0x0039 }
            java.lang.Object r6 = r1.invokeS(r8, r2)     // Catch:{ all -> 0x0039 }
            goto L_0x0034
        L_0x0022:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r8 != r2) goto L_0x0036
            java.lang.String r8 = "getInt"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0039 }
            r2[r3] = r6     // Catch:{ all -> 0x0039 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0039 }
            r2[r4] = r7     // Catch:{ all -> 0x0039 }
            java.lang.Object r6 = r1.invokeS(r8, r2)     // Catch:{ all -> 0x0039 }
        L_0x0034:
            monitor-exit(r0)
            return r6
        L_0x0036:
            r6 = 0
            monitor-exit(r0)
            return r6
        L_0x0039:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.emui.himedia.utils.ConfigurationUtil.getSystemProperty(java.lang.String, java.lang.Object, java.lang.Class):java.lang.Object");
    }
}
