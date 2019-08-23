package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import java.util.Map;

public abstract class a<T, V> extends dg {

    /* renamed from: a  reason: collision with root package name */
    protected T f6441a;

    /* renamed from: b  reason: collision with root package name */
    protected int f6442b = 1;

    /* renamed from: c  reason: collision with root package name */
    protected String f6443c = "";

    /* renamed from: d  reason: collision with root package name */
    protected Context f6444d;

    /* renamed from: e  reason: collision with root package name */
    protected String f6445e = "";
    private int i = 1;

    /* access modifiers changed from: protected */
    public abstract V a(String str) throws AMapException;

    public Map<String, String> d() {
        return null;
    }

    public Map<String, String> e() {
        return null;
    }

    /* access modifiers changed from: protected */
    public V f() {
        return null;
    }

    public String a() {
        return this.f6445e;
    }

    public V c() throws AMapException {
        if (this.f6441a == null) {
            return null;
        }
        try {
            return g();
        } catch (AMapException e2) {
            ah.a(b(), a(), e2);
            throw e2;
        }
    }

    public String b() {
        String i2 = i();
        if (i2 != null) {
            try {
                int indexOf = i2.indexOf(".com/");
                int indexOf2 = i2.indexOf("?");
                if (indexOf2 == -1) {
                    return i2.substring(indexOf + ".com/".length());
                }
                return i2.substring(indexOf + ".com/".length(), indexOf2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r5 = r2;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r11 = r6;
        r6 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        throw new com.amap.api.services.core.AMapException("未知错误");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        java.lang.Thread.sleep((long) (r12.i * com.meizu.cloud.pushsdk.constants.PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if ("http连接失败 - ConnectionException".equals(r6.getMessage()) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        throw new com.amap.api.services.core.AMapException(r6.a(), 1, r6.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        throw new com.amap.api.services.core.AMapException("http或socket连接失败 - ConnectionException", 1, r6.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if ("http连接失败 - ConnectionException".equals(r6.getMessage()) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        throw new com.amap.api.services.core.AMapException(r6.a(), 1, r6.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0110, code lost:
        throw new com.amap.api.services.core.AMapException("http或socket连接失败 - ConnectionException", 1, r6.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[SYNTHETIC, Splitter:B:23:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private V g() throws com.amap.api.services.core.AMapException {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
        L_0x0004:
            int r3 = r12.f6442b
            if (r1 >= r3) goto L_0x0111
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1
            com.amap.api.services.core.ServiceSettings r6 = com.amap.api.services.core.ServiceSettings.getInstance()     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            int r6 = r6.getProtocol()     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            com.amap.api.services.a.df r7 = com.amap.api.services.a.df.a(r0)     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            android.content.Context r8 = r12.f6444d     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            java.net.Proxy r8 = com.amap.api.services.a.bm.a((android.content.Context) r8)     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            r12.a((java.net.Proxy) r8)     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            byte[] r6 = r12.a(r6, r7, r12)     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            java.lang.Object r6 = r12.b(r6)     // Catch:{ be -> 0x0066, AMapException -> 0x004f, Throwable -> 0x0047 }
            android.content.Context r2 = r12.f6444d     // Catch:{ be -> 0x0042, AMapException -> 0x003e, Throwable -> 0x0047 }
            java.lang.String r9 = r12.b()     // Catch:{ be -> 0x0042, AMapException -> 0x003e, Throwable -> 0x0047 }
            r10 = 0
            long r7 = r7 - r3
            com.amap.api.services.a.ah.a(r2, r9, r7, r5)     // Catch:{ be -> 0x0042, AMapException -> 0x003e, Throwable -> 0x0047 }
            int r2 = r12.f6442b     // Catch:{ be -> 0x0042, AMapException -> 0x003e, Throwable -> 0x0047 }
            r1 = r2
            r2 = r6
            goto L_0x0004
        L_0x003e:
            r2 = move-exception
            r5 = r2
            r2 = r6
            goto L_0x0050
        L_0x0042:
            r2 = move-exception
            r11 = r6
            r6 = r2
            r2 = r11
            goto L_0x0067
        L_0x0047:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = "未知错误"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            r5 = move-exception
        L_0x0050:
            long r6 = java.lang.System.currentTimeMillis()
            android.content.Context r8 = r12.f6444d
            java.lang.String r9 = r12.b()
            long r6 = r6 - r3
            com.amap.api.services.a.ah.a(r8, r9, r6, r0)
            int r1 = r1 + 1
            int r3 = r12.f6442b
            if (r1 >= r3) goto L_0x0065
            goto L_0x0004
        L_0x0065:
            throw r5
        L_0x0066:
            r6 = move-exception
        L_0x0067:
            long r7 = java.lang.System.currentTimeMillis()
            android.content.Context r9 = r12.f6444d
            java.lang.String r10 = r12.b()
            long r7 = r7 - r3
            com.amap.api.services.a.ah.a(r9, r10, r7, r0)
            int r1 = r1 + 1
            int r3 = r12.f6442b
            if (r1 >= r3) goto L_0x00c3
            int r3 = r12.i     // Catch:{ InterruptedException -> 0x0084 }
            int r3 = r3 * 1000
            long r3 = (long) r3     // Catch:{ InterruptedException -> 0x0084 }
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0004
        L_0x0084:
            java.lang.String r0 = "http连接失败 - ConnectionException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "socket 连接异常 - SocketException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "服务器连接失败 - UnknownServiceException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a9
            goto L_0x00b7
        L_0x00a9:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r6.a()
            java.lang.String r2 = r6.c()
            r0.<init>(r1, r5, r2)
            throw r0
        L_0x00b7:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r6.c()
            java.lang.String r2 = "http或socket连接失败 - ConnectionException"
            r0.<init>(r2, r5, r1)
            throw r0
        L_0x00c3:
            r12.f()
            java.lang.String r0 = "http连接失败 - ConnectionException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "socket 连接异常 - SocketException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = r6.a()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "服务器连接失败 - UnknownServiceException"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f7
            goto L_0x0105
        L_0x00f7:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r6.a()
            java.lang.String r2 = r6.c()
            r0.<init>(r1, r5, r2)
            throw r0
        L_0x0105:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r6.c()
            java.lang.String r2 = "http或socket连接失败 - ConnectionException"
            r0.<init>(r2, r5, r1)
            throw r0
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.a.g():java.lang.Object");
    }

    private V b(byte[] bArr) throws AMapException {
        return a(bArr);
    }

    /* access modifiers changed from: protected */
    public V a(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e2) {
            j.a(e2, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        j.b(str);
        return a(str);
    }

    public a(Context context, T t) {
        a(context, t);
    }

    private void a(Context context, T t) {
        this.f6444d = context;
        this.f6441a = t;
        this.f6442b = 1;
        b(ServiceSettings.getInstance().getSoTimeOut());
        a(ServiceSettings.getInstance().getConnectionTimeOut());
    }

    /* access modifiers changed from: protected */
    public byte[] a(int i2, df dfVar, dg dgVar) throws be {
        di diVar;
        if (i2 == 1) {
            diVar = dfVar.a(dgVar, false);
        } else if (i2 == 2) {
            diVar = dfVar.a(dgVar, true);
        } else {
            diVar = null;
        }
        if (diVar == null) {
            return null;
        }
        byte[] bArr = diVar.f6817a;
        this.f6445e = diVar.f6820d;
        return bArr;
    }
}
