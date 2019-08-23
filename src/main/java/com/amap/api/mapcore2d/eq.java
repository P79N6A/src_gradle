package com.amap.api.mapcore2d;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class eq extends ev {

    /* renamed from: a  reason: collision with root package name */
    protected Context f6074a;

    /* renamed from: b  reason: collision with root package name */
    protected cy f6075b;

    public abstract byte[] b();

    public abstract byte[] c();

    /* access modifiers changed from: protected */
    public String d() {
        return "2.1";
    }

    public boolean h() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return false;
    }

    public String j() {
        return String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{this.f6075b.c(), this.f6075b.a()});
    }

    public Map<String, String> f() {
        String f2 = cp.f(this.f6074a);
        String a2 = cs.a();
        Context context = this.f6074a;
        String a3 = cs.a(context, a2, "key=" + f2);
        HashMap hashMap = new HashMap();
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, a2);
        hashMap.put("key", f2);
        hashMap.put("scode", a3);
        return hashMap;
    }

    private byte[] n() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(cz.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                dd.a(th, "BinaryRequest", "getBinaryHead");
            }
            return byteArray;
        } catch (Throwable th2) {
            dd.a(th2, "BinaryRequest", "getBinaryHead");
        }
        throw th;
        return null;
    }

    private byte[] o() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] b2 = b();
            if (b2 != null) {
                if (b2.length != 0) {
                    byteArrayOutputStream.write(new byte[]{1});
                    byteArrayOutputStream.write(a(b2));
                    byteArrayOutputStream.write(b2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        dd.a(th, "BinaryRequest", "getRequestRawData");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                dd.a(th2, "BinaryRequest", "getRequestRawData");
            }
            return byteArray2;
        } catch (Throwable th3) {
            dd.a(th3, "BinaryRequest", "getRequestRawData");
        }
        return new byte[]{0};
        throw th;
    }

    private byte[] p() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] c2 = c();
            if (c2 != null) {
                if (c2.length != 0) {
                    byteArrayOutputStream.write(new byte[]{1});
                    byte[] a2 = cs.a(this.f6074a, c2);
                    byteArrayOutputStream.write(a(a2));
                    byteArrayOutputStream.write(a2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        dd.a(th, "BinaryRequest", "getRequestEncryptData");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                dd.a(th2, "BinaryRequest", "getRequestEncryptData");
            }
            return byteArray2;
        } catch (Throwable th3) {
            dd.a(th3, "BinaryRequest", "getRequestEncryptData");
        }
        return new byte[]{0};
        throw th;
    }

    public final byte[] a_() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(n());
            byteArrayOutputStream.write(i());
            byteArrayOutputStream.write(o());
            byteArrayOutputStream.write(p());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                dd.a(th, "BinaryRequest", "getEntityBytes");
            }
            return byteArray;
        } catch (Throwable th2) {
            dd.a(th2, "BinaryRequest", "getEntityBytes");
        }
        throw th;
        return null;
    }

    public byte[] i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (h()) {
                byte[] a2 = cs.a(this.f6074a, k());
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a3 = cz.a(d());
            if (a3 == null || a3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a3));
                byteArrayOutputStream.write(a3);
            }
            byte[] a4 = cz.a(j());
            if (a4 == null || a4.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a4));
                byteArrayOutputStream.write(a4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                dd.a(th, "BinaryRequest", "getRequestEncryptData");
            }
            return byteArray;
        } catch (Throwable th2) {
            dd.a(th2, "BinaryRequest", "getRequestEncryptData");
        }
        return new byte[]{0};
        throw th;
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public eq(Context context, cy cyVar) {
        if (context != null) {
            this.f6074a = context.getApplicationContext();
        }
        this.f6075b = cyVar;
    }
}
