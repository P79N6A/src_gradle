package com.ss.ttm.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Hashtable;
import java.util.regex.Pattern;

public class AVResolver {
    public static int HOST_MAX_CACHE_TIME = 600000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public String mError;
    private HostInfo mHostInfo;
    private String mHostName;
    public String[] mIPStr;
    public boolean mRet;
    private Thread mThread;

    static class HostInfo {
        public String ip;
        public long time;

        HostInfo() {
        }
    }

    static class ParserHost implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        String mHostName;
        AVResolver mResolver;

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 90537(0x161a9, float:1.2687E-40)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 90537(0x161a9, float:1.2687E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                r1 = 0
                java.lang.String r2 = r9.mHostName     // Catch:{ Throwable -> 0x0034 }
                java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ Throwable -> 0x0034 }
                java.lang.String r3 = r2.getHostAddress()     // Catch:{ Throwable -> 0x0032 }
                r1 = r3
                goto L_0x003e
            L_0x0032:
                r3 = move-exception
                goto L_0x0036
            L_0x0034:
                r3 = move-exception
                r2 = r1
            L_0x0036:
                com.ss.ttm.net.AVResolver r4 = r9.mResolver
                java.lang.String r3 = r3.getMessage()
                r4.mError = r3
            L_0x003e:
                com.ss.ttm.net.AVResolver r3 = r9.mResolver
                r4 = 1
                r3.mRet = r4
                if (r2 == 0) goto L_0x006d
                if (r1 != 0) goto L_0x0048
                goto L_0x006d
            L_0x0048:
                com.ss.ttm.net.AVResolver r2 = r9.mResolver
                java.lang.String[] r3 = new java.lang.String[r4]
                r2.mIPStr = r3
                com.ss.ttm.net.AVResolver r2 = r9.mResolver
                java.lang.String[] r2 = r2.mIPStr
                r2[r0] = r1
                com.ss.ttm.net.AVResolver$HostInfo r0 = new com.ss.ttm.net.AVResolver$HostInfo
                r0.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                r0.time = r2
                r0.ip = r1
                java.lang.String r1 = r9.mHostName
                com.ss.ttm.net.AVResolver.putHostInfo(r1, r0)
                long r1 = java.lang.System.currentTimeMillis()
                r0.time = r1
                return
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.net.AVResolver.ParserHost.run():void");
        }

        public ParserHost(AVResolver aVResolver, String str) {
            this.mResolver = aVResolver;
            this.mHostName = str;
        }
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        if (this.mIPStr == null || this.mIPStr[0] == null) {
            return -1;
        }
        return 1;
    }

    public void freeAddress() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90534, new Class[0], Void.TYPE);
            return;
        }
        if (this.mThread != null) {
            try {
                this.mThread.interrupt();
            } catch (Exception unused) {
            }
        }
    }

    public String getAddress() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90533, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90533, new Class[0], String.class);
        } else if (this.mRet && this.mIPStr != null && this.mIPStr[0] != null) {
            return this.mIPStr[0];
        } else {
            return "parser host name: " + this.mHostName + " error.err msg:" + this.mError;
        }
    }

    public static final boolean isIP(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90536, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90536, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find();
        } else {
            if (str2.charAt(0) == '[' && str2.charAt(str.length() - 1) == ']') {
                return true;
            }
            return false;
        }
    }

    public void getAddressInfo(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90532, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90532, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mHostName = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.mRet = true;
        } else if (isIP(this.mHostName)) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = this.mHostName;
            this.mRet = true;
        } else {
            this.mHostInfo = mCacheHosts.get(str);
            if (this.mHostInfo != null) {
                if (this.mHostInfo.ip == null || System.currentTimeMillis() - this.mHostInfo.time >= ((long) HOST_MAX_CACHE_TIME)) {
                    mCacheHosts.remove(str);
                    this.mHostInfo = null;
                } else {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.ip;
                    this.mRet = true;
                    return;
                }
            }
            try {
                this.mThread = new Thread(new ParserHost(this, this.mHostName));
                this.mThread.start();
            } catch (Exception e2) {
                this.mRet = true;
                this.mError = e2.getMessage();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void putHostInfo(java.lang.String r20, com.ss.ttm.net.AVResolver.HostInfo r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.ttm.net.AVResolver> r2 = com.ss.ttm.net.AVResolver.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a1 }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x00a1 }
            r12 = 1
            r4[r12] = r1     // Catch:{ all -> 0x00a1 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect     // Catch:{ all -> 0x00a1 }
            r7 = 1
            r8 = 90535(0x161a7, float:1.26867E-40)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r11] = r10     // Catch:{ all -> 0x00a1 }
            java.lang.Class<com.ss.ttm.net.AVResolver$HostInfo> r10 = com.ss.ttm.net.AVResolver.HostInfo.class
            r9[r12] = r10     // Catch:{ all -> 0x00a1 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a1 }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x004a
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a1 }
            r13[r11] = r0     // Catch:{ all -> 0x00a1 }
            r13[r12] = r1     // Catch:{ all -> 0x00a1 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect     // Catch:{ all -> 0x00a1 }
            r16 = 1
            r17 = 90535(0x161a7, float:1.26867E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1     // Catch:{ all -> 0x00a1 }
            java.lang.Class<com.ss.ttm.net.AVResolver$HostInfo> r1 = com.ss.ttm.net.AVResolver.HostInfo.class
            r0[r12] = r1     // Catch:{ all -> 0x00a1 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a1 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)
            return
        L_0x004a:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a1 }
            java.util.Hashtable<java.lang.String, com.ss.ttm.net.AVResolver$HostInfo> r5 = mCacheHosts     // Catch:{ all -> 0x00a1 }
            int r5 = r5.size()     // Catch:{ all -> 0x00a1 }
            r6 = 128(0x80, float:1.794E-43)
            r7 = 0
            if (r5 <= r6) goto L_0x0090
            java.util.Hashtable<java.lang.String, com.ss.ttm.net.AVResolver$HostInfo> r5 = mCacheHosts     // Catch:{ all -> 0x00a1 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00a1 }
            r8 = r3
            r3 = r7
        L_0x0065:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x00a1 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00a1 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00a1 }
            com.ss.ttm.net.AVResolver$HostInfo r4 = (com.ss.ttm.net.AVResolver.HostInfo) r4     // Catch:{ all -> 0x00a1 }
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00a1 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00a1 }
            java.lang.Object r6 = r6.getKey()     // Catch:{ all -> 0x00a1 }
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0065
            long r10 = r4.time     // Catch:{ all -> 0x00a1 }
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0065
            long r8 = r4.time     // Catch:{ all -> 0x00a1 }
            r3 = r4
            goto L_0x0065
        L_0x0090:
            r3 = r7
        L_0x0091:
            if (r3 == 0) goto L_0x009a
            if (r7 == 0) goto L_0x009a
            java.util.Hashtable<java.lang.String, com.ss.ttm.net.AVResolver$HostInfo> r3 = mCacheHosts     // Catch:{ all -> 0x00a1 }
            r3.remove(r7)     // Catch:{ all -> 0x00a1 }
        L_0x009a:
            java.util.Hashtable<java.lang.String, com.ss.ttm.net.AVResolver$HostInfo> r3 = mCacheHosts     // Catch:{ all -> 0x00a1 }
            r3.put(r0, r1)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.net.AVResolver.putHostInfo(java.lang.String, com.ss.ttm.net.AVResolver$HostInfo):void");
    }
}
