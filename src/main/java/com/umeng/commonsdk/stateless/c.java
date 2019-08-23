package com.umeng.commonsdk.stateless;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f80899a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private final int f80900b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final int f80901c;

    /* renamed from: d  reason: collision with root package name */
    private String f80902d = "1.0";

    /* renamed from: e  reason: collision with root package name */
    private String f80903e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f80904f;
    private byte[] g;
    private byte[] h;
    private int i;
    private int j;
    private int k;
    private byte[] l;
    private byte[] m;
    private boolean n;

    private byte[] c() {
        return a(this.f80899a, (int) (System.currentTimeMillis() / 1000));
    }

    private byte[] d() {
        return f.b((f.c(this.f80904f) + this.i + this.j + this.k + f.c(this.g)).getBytes());
    }

    public void a() {
        if (this.f80904f == null) {
            this.f80904f = c();
        }
        if (this.n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f80904f, 1, bArr, 0, 16);
                this.l = f.a(this.l, bArr);
            } catch (Exception unused) {
            }
        }
        this.g = a(this.f80904f, this.j);
        this.h = d();
    }

    public byte[] b() {
        b bVar = new b();
        bVar.a(this.f80902d);
        bVar.b(this.f80903e);
        bVar.c(f.c(this.f80904f));
        bVar.a(this.i);
        bVar.b(this.j);
        bVar.c(this.k);
        bVar.a(this.l);
        bVar.d(this.n ? 1 : 0);
        bVar.d(f.c(this.g));
        bVar.e(f.c(this.h));
        try {
            return new s().a(bVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(boolean z) {
        this.n = z;
    }

    private byte[] a(byte[] bArr, int i2) {
        byte[] b2 = f.b(this.m);
        byte[] b3 = f.b(this.l);
        int length = b2.length;
        byte[] bArr2 = new byte[(length * 2)];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr2[i4] = b3[i3];
            bArr2[i4 + 1] = b2[i3];
        }
        for (int i5 = 0; i5 < 2; i5++) {
            bArr2[i5] = bArr[i5];
            bArr2[(bArr2.length - i5) - 1] = bArr[(bArr.length - i5) - 1];
        }
        byte[] bArr3 = {(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) (i2 >>> 24)};
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr3[i6 % 4]);
        }
        return bArr2;
    }

    private c(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.f80903e = str;
        this.k = bArr.length;
        this.l = f.a(bArr);
        this.j = (int) (System.currentTimeMillis() / 1000);
        this.m = bArr2;
    }

    public static c b(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            c cVar = new c(bArr, str, (deviceId + mac).getBytes());
            cVar.a(true);
            cVar.a();
            return cVar;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static c a(Context context, String str, byte[] bArr) {
        boolean z;
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder("[stateless] build envelope, raw is  ");
            if (bArr == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append("m app key is ");
            sb.append(str);
            sb.append("device id is ");
            sb.append(deviceId);
            sb.append(", mac is ");
            sb.append(mac);
            objArr[0] = sb.toString();
            ULog.i("walle", objArr);
            c cVar = new c(bArr, str, (deviceId + mac).getBytes());
            cVar.a();
            return cVar;
        } catch (Exception e2) {
            ULog.i("walle", "[stateless] build envelope, e is " + e2.getMessage());
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }
}
