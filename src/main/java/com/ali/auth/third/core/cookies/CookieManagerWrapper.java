package com.ali.auth.third.core.cookies;

public class CookieManagerWrapper {
    public static final CookieManagerWrapper INSTANCE = new CookieManagerWrapper();

    /* renamed from: a  reason: collision with root package name */
    private static final String f4910a = "CookieManagerWrapper";

    /* renamed from: b  reason: collision with root package name */
    private String[] f4911b;

    private CookieManagerWrapper() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clearCookies() {
        /*
            r11 = this;
            com.ali.auth.third.core.WebViewProxy r0 = com.ali.auth.third.core.cookies.a.a()
            r0.removeSessionCookie()
            java.lang.String[] r0 = r11.f4911b
            if (r0 != 0) goto L_0x0036
            android.content.Context r0 = com.ali.auth.third.core.context.KernelContext.getApplicationContext()
            java.lang.String r1 = "cookies"
            java.lang.String r0 = com.ali.auth.third.core.util.FileUtils.readFileData(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0036
            java.lang.String r1 = f4910a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "get cookie from storage:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.ali.auth.third.core.trace.SDKLogger.d(r1, r2)
            java.lang.String r1 = "\u0005"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            r11.f4911b = r0
        L_0x0036:
            java.lang.String[] r0 = r11.f4911b
            if (r0 == 0) goto L_0x0105
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = r11.f4911b
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0044:
            if (r4 >= r2) goto L_0x007f
            r5 = r1[r4]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x007c
            com.ali.auth.third.core.cookies.c r5 = com.ali.auth.third.core.cookies.LoginCookieUtils.parseCookie(r5)     // Catch:{ Throwable -> 0x007c }
            java.lang.String r6 = "munb"
            java.lang.String r7 = r5.f4921c     // Catch:{ Throwable -> 0x007c }
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x007c }
            if (r6 == 0) goto L_0x005d
            goto L_0x007c
        L_0x005d:
            java.lang.String r6 = com.ali.auth.third.core.cookies.LoginCookieUtils.getHttpDomin(r5)     // Catch:{ Throwable -> 0x007c }
            com.ali.auth.third.core.cookies.LoginCookieUtils.expiresCookies(r5)     // Catch:{ Throwable -> 0x007c }
            com.ali.auth.third.core.WebViewProxy r7 = com.ali.auth.third.core.cookies.a.a()     // Catch:{ Throwable -> 0x007c }
            java.lang.String r8 = r5.toString()     // Catch:{ Throwable -> 0x007c }
            r7.setCookie(r6, r8)     // Catch:{ Throwable -> 0x007c }
            java.lang.String r6 = r5.f4919a     // Catch:{ Throwable -> 0x007c }
            java.lang.String r7 = ".taobao.com"
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch:{ Throwable -> 0x007c }
            if (r6 == 0) goto L_0x007c
            r0.add(r5)     // Catch:{ Throwable -> 0x007c }
        L_0x007c:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x007f:
            r1 = 0
            com.ali.auth.third.core.service.impl.CredentialManager r2 = com.ali.auth.third.core.service.impl.CredentialManager.INSTANCE     // Catch:{ Exception -> 0x00a9 }
            com.ali.auth.third.core.model.InternalSession r2 = r2.getInternalSession()     // Catch:{ Exception -> 0x00a9 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.otherInfo     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x00a9
            com.ali.auth.third.core.service.impl.CredentialManager r2 = com.ali.auth.third.core.service.impl.CredentialManager.INSTANCE     // Catch:{ Exception -> 0x00a9 }
            com.ali.auth.third.core.model.InternalSession r2 = r2.getInternalSession()     // Catch:{ Exception -> 0x00a9 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.otherInfo     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r4 = "ssoDomainList"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x00a9
            boolean r4 = r2 instanceof java.util.ArrayList     // Catch:{ Exception -> 0x00a9 }
            if (r4 == 0) goto L_0x00a9
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x00a9 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00aa
        L_0x00a9:
            r2 = r1
        L_0x00aa:
            if (r2 == 0) goto L_0x00f1
            int r4 = r2.length
            if (r4 <= 0) goto L_0x00f1
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x00f1
            java.util.Iterator r0 = r0.iterator()
        L_0x00b9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f1
            java.lang.Object r4 = r0.next()
            com.ali.auth.third.core.cookies.c r4 = (com.ali.auth.third.core.cookies.c) r4
            java.lang.String r5 = r4.f4919a
            int r6 = r2.length
            r7 = 0
        L_0x00c9:
            if (r7 >= r6) goto L_0x00ee
            r8 = r2[r7]
            java.lang.String r9 = "munb"
            java.lang.String r10 = r4.f4921c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00eb
            r4.f4919a = r8
            java.lang.String r8 = com.ali.auth.third.core.cookies.LoginCookieUtils.getHttpDomin(r4)
            com.ali.auth.third.core.cookies.LoginCookieUtils.expiresCookies(r4)
            com.ali.auth.third.core.WebViewProxy r9 = com.ali.auth.third.core.cookies.a.a()
            java.lang.String r10 = r4.toString()
            r9.setCookie(r8, r10)
        L_0x00eb:
            int r7 = r7 + 1
            goto L_0x00c9
        L_0x00ee:
            r4.f4919a = r5
            goto L_0x00b9
        L_0x00f1:
            java.lang.String r0 = f4910a
            java.lang.String r2 = "injectCookie cookies is null"
            com.ali.auth.third.core.trace.SDKLogger.d(r0, r2)
            r11.f4911b = r1
            android.content.Context r0 = com.ali.auth.third.core.context.KernelContext.getApplicationContext()
            java.lang.String r1 = "cookies"
            java.lang.String r2 = ""
            com.ali.auth.third.core.util.FileUtils.writeFileData(r0, r1, r2)
        L_0x0105:
            com.ali.auth.third.core.WebViewProxy r0 = com.ali.auth.third.core.cookies.a.a()
            r0.removeExpiredCookie()
            com.ali.auth.third.core.WebViewProxy r0 = com.ali.auth.third.core.cookies.a.a()
            r0.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.cookies.CookieManagerWrapper.clearCookies():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void injectCookie(java.lang.String[] r13, java.lang.String[] r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.f4911b = r13     // Catch:{ all -> 0x00cc }
            android.content.Context r0 = com.ali.auth.third.core.context.KernelContext.context     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00ca
            if (r13 == 0) goto L_0x00c7
            java.lang.String r0 = f4910a     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "injectCookie cookies != null"
            com.ali.auth.third.core.trace.SDKLogger.d(r0, r1)     // Catch:{ all -> 0x00cc }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
            r0.<init>()     // Catch:{ all -> 0x00cc }
            int r1 = r13.length     // Catch:{ all -> 0x00cc }
            r2 = 0
            r3 = 0
        L_0x0018:
            if (r3 >= r1) goto L_0x0058
            r4 = r13[r3]     // Catch:{ all -> 0x00cc }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00cc }
            if (r5 != 0) goto L_0x0055
            com.ali.auth.third.core.cookies.c r4 = com.ali.auth.third.core.cookies.LoginCookieUtils.parseCookie(r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r5 = com.ali.auth.third.core.cookies.LoginCookieUtils.getHttpDomin(r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r6 = r4.toString()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r7 = f4910a     // Catch:{ Throwable -> 0x0055 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r9 = "add cookie: "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0055 }
            r8.append(r6)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0055 }
            com.ali.auth.third.core.trace.SDKLogger.d(r7, r8)     // Catch:{ Throwable -> 0x0055 }
            com.ali.auth.third.core.WebViewProxy r7 = com.ali.auth.third.core.cookies.a.a()     // Catch:{ Throwable -> 0x0055 }
            r7.setCookie(r5, r6)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r5 = r4.f4919a     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r6 = ".taobao.com"
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch:{ Throwable -> 0x0055 }
            if (r5 == 0) goto L_0x0055
            r0.add(r4)     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0058:
            if (r14 == 0) goto L_0x00ad
            int r1 = r14.length     // Catch:{ all -> 0x00cc }
            if (r1 <= 0) goto L_0x00ad
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00ad
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00cc }
        L_0x0067:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00cc }
            com.ali.auth.third.core.cookies.c r1 = (com.ali.auth.third.core.cookies.c) r1     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r1.f4919a     // Catch:{ all -> 0x00cc }
            int r4 = r14.length     // Catch:{ all -> 0x00cc }
            r5 = 0
        L_0x0077:
            if (r5 >= r4) goto L_0x00aa
            r6 = r14[r5]     // Catch:{ all -> 0x00cc }
            r1.f4919a = r6     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = com.ali.auth.third.core.cookies.LoginCookieUtils.getHttpDomin(r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x00cc }
            java.lang.String r9 = f4910a     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            java.lang.String r11 = "add cookies to domain:"
            r10.<init>(r11)     // Catch:{ all -> 0x00cc }
            r10.append(r6)     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = ", cookie = "
            r10.append(r6)     // Catch:{ all -> 0x00cc }
            r10.append(r8)     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x00cc }
            com.ali.auth.third.core.trace.SDKLogger.d(r9, r6)     // Catch:{ all -> 0x00cc }
            com.ali.auth.third.core.WebViewProxy r6 = com.ali.auth.third.core.cookies.a.a()     // Catch:{ all -> 0x00cc }
            r6.setCookie(r7, r8)     // Catch:{ all -> 0x00cc }
            int r5 = r5 + 1
            goto L_0x0077
        L_0x00aa:
            r1.f4919a = r3     // Catch:{ all -> 0x00cc }
            goto L_0x0067
        L_0x00ad:
            com.ali.auth.third.core.WebViewProxy r14 = com.ali.auth.third.core.cookies.a.a()     // Catch:{ all -> 0x00cc }
            r14.flush()     // Catch:{ all -> 0x00cc }
            java.lang.String[] r14 = r12.f4911b     // Catch:{ all -> 0x00cc }
            if (r14 == 0) goto L_0x00c5
            android.content.Context r14 = com.ali.auth.third.core.context.KernelContext.context     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "cookies"
            java.lang.String r1 = "\u0005"
            java.lang.String r13 = android.text.TextUtils.join(r1, r13)     // Catch:{ all -> 0x00cc }
            com.ali.auth.third.core.util.FileUtils.writeFileData(r14, r0, r13)     // Catch:{ all -> 0x00cc }
        L_0x00c5:
            monitor-exit(r12)
            return
        L_0x00c7:
            r12.clearCookies()     // Catch:{ all -> 0x00cc }
        L_0x00ca:
            monitor-exit(r12)
            return
        L_0x00cc:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.cookies.CookieManagerWrapper.injectCookie(java.lang.String[], java.lang.String[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(3:4|5|(1:7))|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void refreshCookie() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String[] r0 = r4.f4911b     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0030
            android.content.Context r0 = com.ali.auth.third.core.context.KernelContext.getApplicationContext()     // Catch:{ Throwable -> 0x0030 }
            java.lang.String r1 = "cookies"
            java.lang.String r0 = com.ali.auth.third.core.util.FileUtils.readFileData(r0, r1)     // Catch:{ Throwable -> 0x0030 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0030 }
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = f4910a     // Catch:{ Throwable -> 0x0030 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0030 }
            java.lang.String r3 = "get cookie from storage:"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0030 }
            r2.append(r0)     // Catch:{ Throwable -> 0x0030 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0030 }
            com.ali.auth.third.core.trace.SDKLogger.d(r1, r2)     // Catch:{ Throwable -> 0x0030 }
            java.lang.String r1 = "\u0005"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)     // Catch:{ Throwable -> 0x0030 }
            r4.f4911b = r0     // Catch:{ Throwable -> 0x0030 }
        L_0x0030:
            java.lang.String[] r0 = r4.f4911b     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            java.lang.String[] r0 = r4.f4911b     // Catch:{ all -> 0x003c }
            r1 = 0
            r4.injectCookie(r0, r1)     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r4)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.cookies.CookieManagerWrapper.refreshCookie():void");
    }
}
