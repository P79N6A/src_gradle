package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class fc {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6119a = true;

    private static byte[] d(Context context) {
        return fd.a(context, de.g, 307200);
    }

    private static byte[] b(Context context) {
        byte[] c2 = c(context);
        byte[] d2 = d(context);
        byte[] bArr = new byte[(c2.length + d2.length)];
        System.arraycopy(c2, 0, bArr, 0, c2.length);
        System.arraycopy(d2, 0, bArr, c2.length, d2.length);
        return a(context, bArr);
    }

    public static void a(Context context) {
        try {
            if (e(context)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
                stringBuffer.append(" ");
                stringBuffer.append(UUID.randomUUID().toString());
                stringBuffer.append(" ");
                if (stringBuffer.length() == 53) {
                    byte[] a2 = cz.a(stringBuffer.toString());
                    byte[] b2 = b(context);
                    byte[] bArr = new byte[(a2.length + b2.length)];
                    System.arraycopy(a2, 0, bArr, 0, a2.length);
                    System.arraycopy(b2, 0, bArr, a2.length, b2.length);
                    ep.a().a(new df(cz.c(bArr), PushConstants.PUSH_TYPE_UPLOAD_LOG));
                }
            }
        } catch (Throwable th) {
            dd.a(th, "StatisticsManager", "updateStaticsData");
        }
    }

    private static byte[] c(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            cz.a(byteArrayOutputStream, "1.2.13.6");
            cz.a(byteArrayOutputStream, "Android");
            cz.a(byteArrayOutputStream, ct.q(context));
            cz.a(byteArrayOutputStream, ct.i(context));
            cz.a(byteArrayOutputStream, ct.f(context));
            cz.a(byteArrayOutputStream, Build.MANUFACTURER);
            cz.a(byteArrayOutputStream, Build.MODEL);
            cz.a(byteArrayOutputStream, Build.DEVICE);
            cz.a(byteArrayOutputStream, ct.r(context));
            cz.a(byteArrayOutputStream, cp.c(context));
            cz.a(byteArrayOutputStream, cp.d(context));
            cz.a(byteArrayOutputStream, cp.f(context));
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable unused) {
                return byteArray;
            }
        } catch (Throwable unused2) {
        }
        throw th;
        return bArr;
    }

    private static boolean e(Context context) {
        try {
            if (ct.m(context) != 1 || !f6119a || fd.a(context, de.g) < 30) {
                return false;
            }
            long b2 = fd.b(context, "c.log");
            long time = new Date().getTime();
            if (time - b2 < 3600000) {
                return false;
            }
            fd.a(context, time, "c.log");
            f6119a = false;
            return true;
        } catch (Throwable th) {
            dd.a(th, "StatisticsManager", "isUpdate");
        }
        return false;
    }

    private static byte[] a(Context context, byte[] bArr) {
        try {
            return cs.a(context, bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void a(final fb fbVar, final Context context) {
        synchronized (fc.class) {
            dg.c().submit(new Runnable() {
                public final void run() {
                    fd.a(context, de.g, 307200, fbVar.a());
                }
            });
        }
    }
}
