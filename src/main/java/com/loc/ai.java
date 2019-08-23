package com.loc;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class ai extends al {

    /* renamed from: a  reason: collision with root package name */
    protected Context f25458a;

    /* renamed from: b  reason: collision with root package name */
    protected dh f25459b;

    public ai(Context context, dh dhVar) {
        if (context != null) {
            this.f25458a = context.getApplicationContext();
        }
        this.f25459b = dhVar;
    }

    protected static byte[] a(byte[] bArr) {
        int length = bArr.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    private static byte[] k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(di.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                f.a(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            f.a(th2, "bre", "gbh");
        }
        throw th;
        return null;
    }

    private byte[] l() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (e()) {
                bArr = da.a(this.f25458a, j());
                byteArrayOutputStream.write(a(bArr));
            } else {
                bArr = new byte[]{0, 0};
            }
            byteArrayOutputStream.write(bArr);
            byte[] a2 = di.a(g());
            if (a2 == null || a2.length <= 0) {
                a2 = new byte[]{0, 0};
            } else {
                byteArrayOutputStream.write(a(a2));
            }
            byteArrayOutputStream.write(a2);
            byte[] a3 = di.a(f());
            if (a3 == null || a3.length <= 0) {
                a3 = new byte[]{0, 0};
            } else {
                byteArrayOutputStream.write(a(a3));
            }
            byteArrayOutputStream.write(a3);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                f.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            f.a(th2, "bre", "gred");
        }
        return new byte[]{0};
        throw th;
    }

    private byte[] m() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] h = h();
            if (h != null) {
                if (h.length != 0) {
                    byteArrayOutputStream.write(new byte[]{1});
                    byteArrayOutputStream.write(a(h));
                    byteArrayOutputStream.write(h);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        f.a(th, "bre", "grrd");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                f.a(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            f.a(th3, "bre", "grrd");
        }
        return new byte[]{0};
        throw th;
    }

    private byte[] n() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] i = i();
            if (i != null) {
                if (i.length != 0) {
                    byteArrayOutputStream.write(new byte[]{1});
                    byte[] a2 = dd.a(i);
                    byteArrayOutputStream.write(a(a2));
                    byteArrayOutputStream.write(a2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        f.a(th, "bre", "gred");
                    }
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                f.a(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            f.a(th3, "bre", "gred");
        }
        return new byte[]{0};
        throw th;
    }

    public Map<String, String> b() {
        String f2 = cy.f(this.f25458a);
        String a2 = da.a();
        String a3 = da.a(this.f25458a, a2, "key=".concat(String.valueOf(f2)));
        HashMap hashMap = new HashMap();
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, a2);
        hashMap.put("key", f2);
        hashMap.put("scode", a3);
        return hashMap;
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(k());
            byteArrayOutputStream.write(l());
            byteArrayOutputStream.write(m());
            byteArrayOutputStream.write(n());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                f.a(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            f.a(th2, "bre", "geb");
        }
        throw th;
        return null;
    }

    public boolean e() {
        return true;
    }

    public String f() {
        return String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{this.f25459b.b(), this.f25459b.a()});
    }

    /* access modifiers changed from: protected */
    public String g() {
        return "2.1";
    }

    public abstract byte[] h();

    public abstract byte[] i();

    /* access modifiers changed from: protected */
    public boolean j() {
        return false;
    }
}
