package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.loc.w;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class ac {
    static PublicKey a() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byteArrayInputStream = new ByteArrayInputStream(dd.b("MIIDRzCCAi+gAwIBAgIEeuDbsDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJjbjELMAkGA1UECBMCYmoxCzAJBgNVBAcTAmJqMQ0wCwYDVQQKEwRvcGVuMQ4wDAYDVQQLEwVnYW9kZTELMAkGA1UEAxMCUWkwIBcNMTYwODAxMDE0ODMwWhgPMjA3MTA1MDUwMTQ4MzBaMFMxCzAJBgNVBAYTAmNuMQswCQYDVQQIEwJiajELMAkGA1UEBxMCYmoxDTALBgNVBAoTBG9wZW4xDjAMBgNVBAsTBWdhb2RlMQswCQYDVQQDEwJRaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKpL13mZm4q6AFP5csQE7130Lwq8m+HICy3rBARd9vbw5Cb1wFF96KdhC5P/aASlrPb+6MSyP1nE97p3ygKJWsgxExyvVuOvh1KUqOFuK15oY7JKTk6L4eLCbkBJZV2DLffpW0HGiRpmFG8LJR0sjNOoubSd5R/6XoBwyRglsyVHprjrK2qDRvT3Edgtfvxp4HnUzMsDD3CJRtgsaDw6ECyF7fhYKEz9I6OEEVsPlpbgzRmhSeFDL77/k1mhPve1ZyKGlPcxvSSdLSAlV0hzr5NKlujHll7BbouwDnr6l/0O44AzZ0V/ieft1iBkSLirnlm56uI/8jdh8ANrD1fW4ZUCAwEAAaMhMB8wHQYDVR0OBBYEFBzudtI5UKRvHGDV+VQRzItIj3PqMA0GCSqGSIb3DQEBCwUAA4IBAQBS2EGndgvIBnf7Ce4IhDbm7F5h4L+6TYGmT9acnQbEFY8oUoFblMDgg+cETT44jU/elwbJJVmKhj/WRQl+AdSALBAgDvxq1AcjlGg+c8H3pa2BWlrxNJP9MFLIEI5bA8m5og/Epjut50uemZ9ggoNmJeW0N/a6D8euhYJKOYngUQqDu6cwLj1Ec0ptwrNRbvRXXgzjfJMPE/ii4K/b8JZ+QN2d/bl7QEvKWBSzVueZifV659qAbMh6C9TCVstWWfV53Z3Vyt+duDNU5ed7aWao42Ppw4VHslrJW0V6BXDUhhzgXx28UWY78W7LmYGCtC8PfDId2+k4tPoTNPM6HHP5"));
            try {
                PublicKey publicKey = ((X509Certificate) instance.generateCertificate(byteArrayInputStream)).getPublicKey();
                try {
                    a((Closeable) byteArrayInputStream);
                } catch (Throwable th) {
                    a.b(th);
                }
                return publicKey;
            } catch (Throwable th2) {
                th = th2;
                try {
                    f.a(th, "DyLoader", "init");
                    try {
                        a((Closeable) byteArrayInputStream);
                    } catch (Throwable th3) {
                        a.b(th3);
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        a((Closeable) byteArrayInputStream);
                    } catch (Throwable th5) {
                        a.b(th5);
                    }
                    throw th;
                }
            }
        } catch (Throwable th6) {
            byteArrayInputStream = null;
            th = th6;
            a((Closeable) byteArrayInputStream);
            throw th;
        }
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    static void a(List<aa> list) {
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                aa aaVar = list.get(i);
                aa aaVar2 = list.get(i3);
                if (b(aaVar2.f25396e, aaVar.f25396e) > 0) {
                    list.set(i, aaVar2);
                    list.set(i3, aaVar);
                }
            }
            i = i2;
        }
    }

    private static boolean a(final Context context, n nVar, aa aaVar, s sVar, final dh dhVar) {
        String str = sVar.f25883d;
        String str2 = sVar.f25884e;
        final String str3 = sVar.f25885f;
        if ("errorstatus".equals(aaVar.f25397f)) {
            try {
                if (!new File(w.b(context, dhVar.a(), dhVar.f25797a)).exists()) {
                    if (!TextUtils.isEmpty(w.a(context, nVar, dhVar))) {
                        ab.b().a().submit(new Runnable() {
                            public final void run() {
                                try {
                                    w.a(context, dhVar);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        final String a2 = w.a(context, sVar.f25882c);
        if (!new File(a2).exists()) {
            return false;
        }
        List<aa> b2 = nVar.b(aa.a(w.a(context, str, str2), str, str2, str3), aa.class);
        if (b2 != null && b2.size() > 0) {
            return true;
        }
        w.a(context, str, dhVar.f25797a);
        try {
            ExecutorService a3 = ab.b().a();
            final Context context2 = context;
            final n nVar2 = nVar;
            final dh dhVar2 = dhVar;
            AnonymousClass1 r2 = new Runnable() {
                public final void run() {
                    try {
                        w.a(context2, nVar2, dhVar2, a2, str3);
                        w.a(context2, dhVar2);
                    } catch (Throwable th) {
                        f.a(th, "dDownLoad", "processDownloadedFile()");
                    }
                }
            };
            a3.submit(r2);
        } catch (Throwable unused2) {
        }
        return true;
    }

    static boolean a(Context context, s sVar, dh dhVar) {
        n nVar = new n(context, y.b());
        if (a(nVar, sVar)) {
            return true;
        }
        aa a2 = w.a.a(nVar, sVar.f25882c);
        if (a2 != null) {
            return a(context, nVar, a2, sVar, dhVar);
        }
        return false;
    }

    static boolean a(Context context, boolean z) {
        if (!z) {
            return dc.q(context) == 1;
        }
    }

    static boolean a(dh dhVar, s sVar) {
        return dhVar != null && dhVar.a().equals(sVar.f25883d) && dhVar.f25797a.equals(sVar.f25884e);
    }

    private static boolean a(n nVar, s sVar) {
        try {
            List a2 = w.a.a(nVar, sVar.f25883d, "used");
            if (a2 != null && a2.size() > 0 && b(((aa) a2.get(0)).f25396e, sVar.f25885f) > 0) {
                return true;
            }
        } catch (Throwable th) {
            f.a(th, "dDownLoad", "isUsed");
        }
        return false;
    }

    static boolean a(n nVar, String str, String str2, dh dhVar) {
        aa a2 = w.a.a(nVar, str);
        return a2 != null && dhVar.f25797a.equals(a2.f25395d) && a(str2, a2.f25393b);
    }

    static boolean a(s sVar) {
        return Build.VERSION.SDK_INT >= sVar.h && Build.VERSION.SDK_INT <= sVar.g;
    }

    static boolean a(String str, String str2) {
        String a2 = de.a(str);
        return a2 != null && a2.equalsIgnoreCase(str2);
    }

    private static int b(String str, String str2) {
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int min = Math.min(split.length, split2.length);
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                i = split[i2].length() - split2[i2].length();
                if (i != 0) {
                    break;
                }
                i = split[i2].compareTo(split2[i2]);
                if (i != 0) {
                    break;
                }
            }
            return i != 0 ? i : split.length - split2.length;
        } catch (Exception e2) {
            f.a((Throwable) e2, "Utils", "compareVersion");
            return -1;
        }
    }
}
