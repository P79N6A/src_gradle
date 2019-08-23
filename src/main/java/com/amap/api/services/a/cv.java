package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.a.cq;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

public class cv {
    static PublicKey a() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byteArrayInputStream = new ByteArrayInputStream(bk.b("MIIDRzCCAi+gAwIBAgIEeuDbsDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJjbjELMAkGA1UECBMCYmoxCzAJBgNVBAcTAmJqMQ0wCwYDVQQKEwRvcGVuMQ4wDAYDVQQLEwVnYW9kZTELMAkGA1UEAxMCUWkwIBcNMTYwODAxMDE0ODMwWhgPMjA3MTA1MDUwMTQ4MzBaMFMxCzAJBgNVBAYTAmNuMQswCQYDVQQIEwJiajELMAkGA1UEBxMCYmoxDTALBgNVBAoTBG9wZW4xDjAMBgNVBAsTBWdhb2RlMQswCQYDVQQDEwJRaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKpL13mZm4q6AFP5csQE7130Lwq8m+HICy3rBARd9vbw5Cb1wFF96KdhC5P/aASlrPb+6MSyP1nE97p3ygKJWsgxExyvVuOvh1KUqOFuK15oY7JKTk6L4eLCbkBJZV2DLffpW0HGiRpmFG8LJR0sjNOoubSd5R/6XoBwyRglsyVHprjrK2qDRvT3Edgtfvxp4HnUzMsDD3CJRtgsaDw6ECyF7fhYKEz9I6OEEVsPlpbgzRmhSeFDL77/k1mhPve1ZyKGlPcxvSSdLSAlV0hzr5NKlujHll7BbouwDnr6l/0O44AzZ0V/ieft1iBkSLirnlm56uI/8jdh8ANrD1fW4ZUCAwEAAaMhMB8wHQYDVR0OBBYEFBzudtI5UKRvHGDV+VQRzItIj3PqMA0GCSqGSIb3DQEBCwUAA4IBAQBS2EGndgvIBnf7Ce4IhDbm7F5h4L+6TYGmT9acnQbEFY8oUoFblMDgg+cETT44jU/elwbJJVmKhj/WRQl+AdSALBAgDvxq1AcjlGg+c8H3pa2BWlrxNJP9MFLIEI5bA8m5og/Epjut50uemZ9ggoNmJeW0N/a6D8euhYJKOYngUQqDu6cwLj1Ec0ptwrNRbvRXXgzjfJMPE/ii4K/b8JZ+QN2d/bl7QEvKWBSzVueZifV659qAbMh6C9TCVstWWfV53Z3Vyt+duDNU5ed7aWao42Ppw4VHslrJW0V6BXDUhhzgXx28UWY78W7LmYGCtC8PfDId2+k4tPoTNPM6HHP5"));
            try {
                PublicKey publicKey = ((X509Certificate) instance.generateCertificate(byteArrayInputStream)).getPublicKey();
                try {
                    a((Closeable) byteArrayInputStream);
                } catch (Throwable unused) {
                }
                return publicKey;
            } catch (Throwable th) {
                th = th;
                try {
                    a(th, "DyLoader", "init");
                    try {
                        a((Closeable) byteArrayInputStream);
                    } catch (Throwable unused2) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        a((Closeable) byteArrayInputStream);
                    } catch (Throwable unused3) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            byteArrayInputStream = null;
            th = th3;
            a((Closeable) byteArrayInputStream);
            throw th;
        }
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    static void a(List<cu> list) {
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                cu cuVar = list.get(i);
                cu cuVar2 = list.get(i3);
                if (a(cuVar2.e(), cuVar.e()) > 0) {
                    list.set(i, cuVar2);
                    list.set(i3, cuVar);
                }
            }
            i = i2;
        }
    }

    static boolean b(String str, String str2) {
        String a2 = bl.a(str);
        if (a2 == null || !a2.equalsIgnoreCase(str2)) {
            return false;
        }
        return true;
    }

    public static int a(String str, String str2) {
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
            if (i == 0) {
                i = split.length - split2.length;
            }
            return i;
        } catch (Exception e2) {
            bx.a((Throwable) e2, "Utils", "compareVersion");
            return -1;
        }
    }

    static void a(Throwable th, String str, String str2) {
        bx.a(th, str, str2);
    }

    static boolean a(Context context, ce ceVar, String str, bn bnVar) {
        return a(ceVar, str, cq.a(context, str), bnVar);
    }

    static boolean a(ce ceVar, String str, String str2, bn bnVar) {
        cu a2 = cq.a.a(ceVar, str);
        if (a2 == null || !bnVar.b().equals(a2.d()) || !b(str2, a2.b())) {
            return false;
        }
        return true;
    }
}
