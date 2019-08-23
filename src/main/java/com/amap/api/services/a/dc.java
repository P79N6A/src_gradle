package com.amap.api.services.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class dc extends dg {

    /* renamed from: a  reason: collision with root package name */
    protected Context f6799a;

    /* renamed from: b  reason: collision with root package name */
    protected bn f6800b;

    public abstract byte[] b();

    public abstract byte[] c();

    /* access modifiers changed from: protected */
    public String f() {
        return "2.1";
    }

    public boolean g() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public String k() {
        return String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{this.f6800b.c(), this.f6800b.a()});
    }

    public Map<String, String> d() {
        String f2 = bf.f(this.f6799a);
        String a2 = bi.a();
        Context context = this.f6799a;
        String a3 = bi.a(context, a2, "key=" + f2);
        HashMap hashMap = new HashMap();
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, a2);
        hashMap.put("key", f2);
        hashMap.put("scode", a3);
        return hashMap;
    }

    private byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bo.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                bx.a(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            bx.a(th2, "bre", "gbh");
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
                        bx.a(th, "bre", "grrd");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                bx.a(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            bx.a(th3, "bre", "grrd");
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
                    byte[] a2 = bi.a(this.f6799a, c2);
                    byteArrayOutputStream.write(a(a2));
                    byteArrayOutputStream.write(a2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        bx.a(th, "bre", "gred");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                bx.a(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            bx.a(th3, "bre", "gred");
        }
        return new byte[]{0};
        throw th;
    }

    public final byte[] h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(j());
            byteArrayOutputStream.write(o());
            byteArrayOutputStream.write(p());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                bx.a(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            bx.a(th2, "bre", "geb");
        }
        throw th;
        return null;
    }

    public byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (g()) {
                byte[] a2 = bi.a(this.f6799a, l());
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a3 = bo.a(f());
            if (a3 == null || a3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a3));
                byteArrayOutputStream.write(a3);
            }
            byte[] a4 = bo.a(k());
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
                bx.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            bx.a(th2, "bre", "gred");
        }
        return new byte[]{0};
        throw th;
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public dc(Context context, bn bnVar) {
        if (context != null) {
            this.f6799a = context.getApplicationContext();
        }
        this.f6800b = bnVar;
    }
}
