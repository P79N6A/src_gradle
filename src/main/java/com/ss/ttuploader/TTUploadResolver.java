package com.ss.ttuploader;

import java.util.Hashtable;
import java.util.regex.Pattern;

public class TTUploadResolver {
    public static int HOST_MAX_CACHE_TIME = 60000;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static volatile int mIsUseTTnetDNS;
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
        String mHostName;
        TTUploadResolver mResolver;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[SYNTHETIC, Splitter:B:12:0x0021] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                int r0 = com.ss.ttuploader.TTUploadResolver.mIsUseTTnetDNS
                r1 = 1
                r2 = 0
                r3 = 0
                if (r0 != r1) goto L_0x001e
                java.lang.String r0 = r5.mHostName     // Catch:{ Throwable -> 0x001e }
                java.util.List r0 = com.bytedance.ttnet.TTNetInit.dnsLookup(r0)     // Catch:{ Throwable -> 0x001e }
                if (r0 == 0) goto L_0x001e
                java.lang.Object r4 = r0.get(r2)     // Catch:{ Throwable -> 0x001e }
                if (r4 == 0) goto L_0x001e
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x001e }
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Throwable -> 0x001e }
                r3 = r0
                r0 = 1
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                if (r0 != 0) goto L_0x0031
                java.lang.String r0 = r5.mHostName     // Catch:{ UnknownHostException -> 0x0028 }
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x0028 }
                goto L_0x0032
            L_0x0028:
                r0 = move-exception
                com.ss.ttuploader.TTUploadResolver r4 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                r4.mError = r0
            L_0x0031:
                r0 = r3
            L_0x0032:
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                r3.mRet = r1
                if (r0 == 0) goto L_0x0060
                java.lang.String r0 = r0.getHostAddress()
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                java.lang.String[] r1 = new java.lang.String[r1]
                r3.mIPStr = r1
                com.ss.ttuploader.TTUploadResolver r1 = r5.mResolver
                java.lang.String[] r1 = r1.mIPStr
                r1[r2] = r0
                com.ss.ttuploader.TTUploadResolver$HostInfo r1 = new com.ss.ttuploader.TTUploadResolver$HostInfo
                r1.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
                r1.ip = r0
                java.lang.String r0 = r5.mHostName
                com.ss.ttuploader.TTUploadResolver.putHostInfo(r0, r1)
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadResolver.ParserHost.run():void");
        }

        public ParserHost(TTUploadResolver tTUploadResolver, String str) {
            this.mResolver = tTUploadResolver;
            this.mHostName = str;
        }
    }

    public void freeAddress() {
        if (this.mThread != null) {
            try {
                this.mThread.interrupt();
            } catch (Exception unused) {
            }
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

    public String getAddress() {
        if (this.mRet && this.mIPStr != null && this.mIPStr[0] != null) {
            return this.mIPStr[0];
        }
        return "parser host name: " + this.mHostName + " error.err msg:" + this.mError;
    }

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            return true;
        }
        return false;
    }

    public void getAddressInfo(String str) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void putHostInfo(java.lang.String r10, com.ss.ttuploader.TTUploadResolver.HostInfo r11) {
        /*
            java.lang.Class<com.ss.ttuploader.TTUploadResolver> r0 = com.ss.ttuploader.TTUploadResolver.class
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005a }
            java.util.Hashtable<java.lang.String, com.ss.ttuploader.TTUploadResolver$HostInfo> r3 = mCacheHosts     // Catch:{ all -> 0x005a }
            int r3 = r3.size()     // Catch:{ all -> 0x005a }
            r4 = 128(0x80, float:1.794E-43)
            r5 = 0
            if (r3 <= r4) goto L_0x0049
            java.util.Hashtable<java.lang.String, com.ss.ttuploader.TTUploadResolver$HostInfo> r3 = mCacheHosts     // Catch:{ all -> 0x005a }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x005a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x005a }
            r6 = r1
            r1 = r5
        L_0x001e:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x005a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x005a }
            com.ss.ttuploader.TTUploadResolver$HostInfo r2 = (com.ss.ttuploader.TTUploadResolver.HostInfo) r2     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x005a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r4.getKey()     // Catch:{ all -> 0x005a }
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x001e
            long r8 = r2.time     // Catch:{ all -> 0x005a }
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x001e
            long r6 = r2.time     // Catch:{ all -> 0x005a }
            r1 = r2
            goto L_0x001e
        L_0x0049:
            r1 = r5
        L_0x004a:
            if (r1 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0053
            java.util.Hashtable<java.lang.String, com.ss.ttuploader.TTUploadResolver$HostInfo> r1 = mCacheHosts     // Catch:{ all -> 0x005a }
            r1.remove(r5)     // Catch:{ all -> 0x005a }
        L_0x0053:
            java.util.Hashtable<java.lang.String, com.ss.ttuploader.TTUploadResolver$HostInfo> r1 = mCacheHosts     // Catch:{ all -> 0x005a }
            r1.put(r10, r11)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)
            return
        L_0x005a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadResolver.putHostInfo(java.lang.String, com.ss.ttuploader.TTUploadResolver$HostInfo):void");
    }
}
