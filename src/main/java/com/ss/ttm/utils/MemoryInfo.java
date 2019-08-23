package com.ss.ttm.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class MemoryInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static long[] mRomMemroy;
    private static long mTotalMemorySize;

    public static long[] getRomMemroy() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91155, new Class[0], long[].class)) {
            return (long[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91155, new Class[0], long[].class);
        }
        if (mRomMemroy == null) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mRomMemroy = new long[]{getTotalInternalMemorySize(), ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())};
        }
        return mRomMemroy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r2 != null) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getTolalMemory() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Long.TYPE
            r2 = 0
            r4 = 1
            r5 = 91158(0x16416, float:1.2774E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 91158(0x16416, float:1.2774E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x002c:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            r0 = 8
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            r1 = r0
        L_0x0042:
            r2.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x0046:
            r0 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r2 = r1
        L_0x0051:
            if (r2 == 0) goto L_0x0054
            goto L_0x0042
        L_0x0054:
            r0 = 58
            int r0 = r1.indexOf(r0)
            r2 = 107(0x6b, float:1.5E-43)
            int r2 = r1.indexOf(r2)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.MemoryInfo.getTolalMemory():long");
    }

    public static long getTotalInternalMemorySize() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91156, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91156, new Class[0], Long.TYPE)).longValue();
        }
        if (mTotalMemorySize == 0) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mTotalMemorySize = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return mTotalMemorySize;
    }

    public static long getAvailMemory(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91157, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91157, new Class[]{Context.class}, Long.TYPE)).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }
}
