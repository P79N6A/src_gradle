package com.tencent.bugly.crashreport.common.info;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppInfo {

    /* renamed from: a  reason: collision with root package name */
    private static ActivityManager f79270a;

    static {
        "@buglyAllChannel@".split(",");
        "@buglyAllChannelPriority@".split(",");
    }

    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th) {
            x.a(th);
            return "fail";
        }
    }

    public static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a(context), 0);
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static String c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (!(packageManager == null || applicationInfo == null)) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                if (applicationLabel != null) {
                    return applicationLabel.toString();
                }
            }
        } catch (Throwable th) {
            x.a(th);
        }
        return null;
    }

    public static List<String> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("BUGLY_DISABLE");
            if (str != null) {
                if (str.length() != 0) {
                    String[] split = str.split(",");
                    for (int i = 0; i < split.length; i++) {
                        split[i] = split[i].trim();
                    }
                    return Arrays.asList(split);
                }
            }
            return null;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static String e(Context context) {
        String a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a2, 64);
            if (packageInfo == null) {
                return null;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return null;
            }
            return a(packageInfo.signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (context == null) {
            return false;
        }
        if (f79270a == null) {
            f79270a = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            f79270a.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory) {
                return false;
            }
            x.c("Memory is low.", new Object[0]);
            return true;
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[SYNTHETIC, Splitter:B:24:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[SYNTHETIC, Splitter:B:29:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(int r7) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Throwable -> 0x0042 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r3 = "/proc/"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0042 }
            r2.append(r7)     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r3 = "/cmdline"
            r2.append(r3)     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0042 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0042 }
            r0 = 512(0x200, float:7.175E-43)
            char[] r2 = new char[r0]     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            r1.read(r2)     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            r3 = 0
            r4 = 0
        L_0x0022:
            if (r4 >= r0) goto L_0x002b
            char r5 = r2[r4]     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            if (r5 == 0) goto L_0x002b
            int r4 = r4 + 1
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = new java.lang.String     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            java.lang.String r0 = r0.substring(r3, r4)     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            r1.close()     // Catch:{ Throwable -> 0x0037 }
        L_0x0037:
            return r0
        L_0x0038:
            r7 = move-exception
            r0 = r1
            goto L_0x0050
        L_0x003b:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0043
        L_0x0040:
            r7 = move-exception
            goto L_0x0050
        L_0x0042:
            r1 = move-exception
        L_0x0043:
            com.tencent.bugly.proguard.x.a(r1)     // Catch:{ all -> 0x0040 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            return r7
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.AppInfo.a(int):java.lang.String");
    }

    public static Map<String, String> d(Context context) {
        HashMap hashMap = null;
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo.metaData != null) {
                HashMap hashMap2 = new HashMap();
                Object obj = applicationInfo.metaData.get("BUGLY_DISABLE");
                if (obj != null) {
                    hashMap2.put("BUGLY_DISABLE", obj.toString());
                }
                Object obj2 = applicationInfo.metaData.get("BUGLY_APPID");
                if (obj2 != null) {
                    hashMap2.put("BUGLY_APPID", obj2.toString());
                }
                Object obj3 = applicationInfo.metaData.get("BUGLY_APP_CHANNEL");
                if (obj3 != null) {
                    hashMap2.put("BUGLY_APP_CHANNEL", obj3.toString());
                }
                Object obj4 = applicationInfo.metaData.get("BUGLY_APP_VERSION");
                if (obj4 != null) {
                    hashMap2.put("BUGLY_APP_VERSION", obj4.toString());
                }
                Object obj5 = applicationInfo.metaData.get("BUGLY_ENABLE_DEBUG");
                if (obj5 != null) {
                    hashMap2.put("BUGLY_ENABLE_DEBUG", obj5.toString());
                }
                Object obj6 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
                if (obj6 != null) {
                    hashMap2.put("com.tencent.rdm.uuid", obj6.toString());
                }
                hashMap = hashMap2;
            }
            return hashMap;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length > 0) {
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                if (instance == null) {
                    return null;
                }
                X509Certificate x509Certificate = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(bArr));
                if (x509Certificate == null) {
                    return null;
                }
                sb.append("Issuer|");
                Principal issuerDN = x509Certificate.getIssuerDN();
                if (issuerDN != null) {
                    sb.append(issuerDN.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("SerialNumber|");
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                if (issuerDN != null) {
                    sb.append(serialNumber.toString(16));
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("NotBefore|");
                Date notBefore = x509Certificate.getNotBefore();
                if (issuerDN != null) {
                    sb.append(notBefore.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("NotAfter|");
                Date notAfter = x509Certificate.getNotAfter();
                if (issuerDN != null) {
                    sb.append(notAfter.toString());
                } else {
                    sb.append("unknown");
                }
                sb.append("\n");
                sb.append("SHA1|");
                String a2 = z.a(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
                if (a2 == null || a2.length() <= 0) {
                    sb.append("unknown");
                } else {
                    sb.append(a2.toString());
                }
                sb.append("\n");
                sb.append("MD5|");
                String a3 = z.a(MessageDigest.getInstance("MD5").digest(x509Certificate.getEncoded()));
                if (a3 == null || a3.length() <= 0) {
                    sb.append("unknown");
                } else {
                    sb.append(a3.toString());
                }
            } catch (CertificateException e2) {
                x.a(e2);
            } catch (Throwable th) {
                x.a(th);
            }
        }
        if (sb.length() == 0) {
            return "unknown";
        }
        return sb.toString();
    }

    public static boolean a(Context context, String str) {
        if (context == null || str == null || str.trim().length() <= 0) {
            return false;
        }
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String equals : strArr) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            x.a(th);
        }
        return false;
    }
}
