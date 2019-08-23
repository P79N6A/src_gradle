package com.cmic.sso.sdk.d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.cmic.sso.sdk.b.b.a;
import com.cmic.sso.sdk.b.b.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public class u {
    public static int l(Context context) {
        int b2;
        synchronized (u.class) {
            b2 = n.b(context, "maxFailedLogTimes", 0);
        }
        return b2;
    }

    public static boolean b(Context context) {
        boolean equals;
        synchronized (u.class) {
            try {
                equals = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_IPV4_LIST", PushConstants.PUSH_TYPE_NOTIFY));
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return equals;
    }

    public static boolean c(Context context) {
        boolean equals;
        synchronized (u.class) {
            try {
                equals = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_IPV6_LIST", PushConstants.PUSH_TYPE_THROUGH_MESSAGE));
            } catch (Exception unused) {
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return equals;
    }

    public static boolean j(Context context) {
        boolean contains;
        synchronized (u.class) {
            try {
                contains = n.b(context, "CLOSE_FRIEND_WAPKS", "").contains("CT");
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return contains;
    }

    public static boolean k(Context context) {
        boolean equals;
        synchronized (u.class) {
            try {
                equals = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_LOGS_VERSION", PushConstants.PUSH_TYPE_NOTIFY));
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return equals;
    }

    public static int m(Context context) {
        int b2;
        synchronized (u.class) {
            b2 = n.b(context, "pauseTime", 0) * 60 * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return b2;
    }

    public static boolean d(Context context) {
        boolean z;
        synchronized (u.class) {
            z = false;
            try {
                if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_M001_SDKVERSION_LIST", PushConstants.PUSH_TYPE_NOTIFY)) || PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_M001_APPID_LIST", PushConstants.PUSH_TYPE_NOTIFY))) {
                    z = true;
                }
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static String g(Context context) {
        String str;
        synchronized (u.class) {
            try {
                if (TextUtils.isEmpty(n.b(context, "logHost", ""))) {
                    str = "https://log1.cmpassport.com:9443/log/logReport";
                } else {
                    str = "https://" + r3 + "/log/logReport";
                }
            } catch (Exception unused) {
                return "https://log1.cmpassport.com:9443/log/logReport";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static boolean h(Context context) {
        boolean equals;
        synchronized (u.class) {
            try {
                equals = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "CLOSE_CERT_VERIFY", PushConstants.PUSH_TYPE_THROUGH_MESSAGE));
            } catch (Exception e2) {
                f.a("UmcConfigUtil", "isCloseCert:" + e2.toString());
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return equals;
    }

    public static boolean i(Context context) {
        boolean contains;
        synchronized (u.class) {
            try {
                contains = n.b(context, "CLOSE_FRIEND_WAPKS", "").contains("CU");
            } catch (Exception e2) {
                f.a("UmcConfigUtil", "isCloseCUCCWork:" + e2.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7) {
        /*
            java.lang.Class<com.cmic.sso.sdk.d.u> r0 = com.cmic.sso.sdk.d.u.class
            monitor-enter(r0)
            java.lang.String r1 = com.cmic.sso.sdk.d.t.b()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "getConfigDate"
            java.lang.String r3 = ""
            java.lang.String r2 = com.cmic.sso.sdk.d.n.b((android.content.Context) r7, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x002c }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x002c }
            r2 = 1
            if (r1 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x0018:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "client_valid"
            r5 = 0
            long r5 = com.cmic.sso.sdk.d.n.b((android.content.Context) r7, (java.lang.String) r1, (long) r5)     // Catch:{ all -> 0x002c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x002c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.d.u.a(android.content.Context):boolean");
    }

    public static String e(Context context) {
        String str;
        synchronized (u.class) {
            try {
                if (TextUtils.isEmpty(n.b(context, "httpHost", (String) null))) {
                    str = "http://www.cmpassport.com/unisdk/";
                } else {
                    str = "http://" + r4 + "/unisdk/";
                }
            } catch (Exception e2) {
                f.a("UmcConfigUtil", "http:" + e2.toString());
                return "http://www.cmpassport.com/unisdk/";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String f(Context context) {
        String str;
        synchronized (u.class) {
            try {
                if (TextUtils.isEmpty(n.b(context, "httpsHost", (String) null))) {
                    str = "https://onekey1.cmpassport.com/unisdk/";
                } else {
                    str = "https://" + r4 + "/unisdk/";
                }
            } catch (Exception e2) {
                f.a("UmcConfigUtil", "https:" + e2.toString());
                return "https://onekey1.cmpassport.com/unisdk/";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String a(Context context, String str) {
        String b2;
        synchronized (u.class) {
            try {
                b2 = n.b(context, str, "");
            } catch (Exception unused) {
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    public static void a(final Context context, Bundle bundle) {
        a.a().a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(n.b(context, "isGetCert", PushConstants.PUSH_TYPE_THROUGH_MESSAGE)), bundle, (b) new b() {
            public final void a(String str, String str2, JSONObject jSONObject) {
                try {
                    if (jSONObject.has("resultcode") && "103000".equals(jSONObject.getString("resultcode"))) {
                        f.a("UmcConfigUtil", "uniConfig resultCode" + jSONObject.getString("resultcode"));
                        n.a(context, "isGetCert", PushConstants.PUSH_TYPE_NOTIFY);
                        u.b(context, jSONObject);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static void b(Context context, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            synchronized (u.class) {
                n.a(context, "getConfigDate", t.b());
                if (jSONObject.has("client_valid")) {
                    n.a(context, "client_valid", System.currentTimeMillis() + (((long) Integer.valueOf(jSONObject.getString("client_valid")).intValue()) * 60 * 60 * 1000));
                }
                if (jSONObject.has("Configlist")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Configlist");
                    String str7 = null;
                    if (jSONObject2.has("CHANGE_HOST")) {
                        String string = jSONObject2.getString("CHANGE_HOST");
                        if (string.contains("M005")) {
                            String[] split = string.split("&");
                            int length = split.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    str5 = null;
                                    break;
                                }
                                str5 = split[i];
                                if (str5.contains("M005")) {
                                    break;
                                }
                                i++;
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                if (str5.contains(",")) {
                                    str6 = str5.substring(str5.indexOf("=") + 1, str5.indexOf(","));
                                    str2 = str5.substring(str5.lastIndexOf("=") + 1, str5.length());
                                } else {
                                    if (!str5.contains("https")) {
                                        if (!str5.contains("HTTPS")) {
                                            if (str5.contains("http") || str5.contains("HTTP")) {
                                                str6 = str5.substring(str5.lastIndexOf("=") + 1, str5.length());
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str2 = str5.substring(str5.lastIndexOf("=") + 1, str5.length());
                                    str6 = null;
                                }
                                f.a("UmcConfigUtil", "HTTP:" + str6 + "||||||||HTTPS:" + str2);
                                n.a(context, "httpHost", str6);
                                n.a(context, "httpsHost", str2);
                            }
                            str6 = null;
                            str2 = null;
                            f.a("UmcConfigUtil", "HTTP:" + str6 + "||||||||HTTPS:" + str2);
                            n.a(context, "httpHost", str6);
                            n.a(context, "httpsHost", str2);
                        } else {
                            str2 = null;
                        }
                        if (string.contains("M007")) {
                            String[] split2 = string.split("&");
                            int length2 = split2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    str = null;
                                    break;
                                }
                                str = split2[i2];
                                if (str.contains("M007")) {
                                    break;
                                }
                                i2++;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                str = str.substring(str.lastIndexOf("=") + 1, str.length());
                            }
                            f.a("UmcConfigUtil", "HTTPS:" + str);
                            n.a(context, "logHost", str);
                        } else {
                            str = null;
                        }
                    } else {
                        n.a(context, "httpHost", "");
                        n.a(context, "httpsHost", "");
                        n.a(context, "logHost", "");
                        str2 = null;
                        str = null;
                    }
                    if (jSONObject2.has("HOST_CERT_INFO")) {
                        String string2 = jSONObject2.getString("HOST_CERT_INFO");
                        String[] split3 = string2.split("&");
                        if (TextUtils.isEmpty(str) || !str.contains(":")) {
                            str3 = str;
                        } else {
                            str3 = str.substring(0, str.indexOf(":"));
                            f.a("UmcConfigUtil", "logHostWithoutHost:" + str3);
                        }
                        if (!TextUtils.isEmpty(str) && string2.contains(str3)) {
                            int length3 = split3.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length3) {
                                    break;
                                }
                                String str8 = split3[i3];
                                if (!TextUtils.isEmpty(str) && str8.contains(str3)) {
                                    str7 = str8;
                                    break;
                                }
                                i3++;
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                str7 = str7.substring(str7.indexOf(":"), str7.indexOf(","));
                            }
                            f.a("UmcConfigUtil", "log CERT:");
                            n.a(context, "https://" + str + "/log/logReport", str7);
                        }
                        if (string2.contains("log1.cmpassport.com")) {
                            int length4 = split3.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length4) {
                                    break;
                                }
                                String str9 = split3[i4];
                                if (str9.contains("log1.cmpassport.com")) {
                                    str7 = str9;
                                    break;
                                }
                                i4++;
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                str7 = str7.substring(str7.indexOf(":"), str7.indexOf(","));
                            }
                            f.a("UmcConfigUtil", "log1 CERT:");
                            n.a(context, "https://log1.cmpassport.com:9443/log/logReport", str7);
                        }
                        if (TextUtils.isEmpty(str2) || !str2.contains(":")) {
                            str4 = str2;
                        } else {
                            str4 = str2.substring(0, str2.indexOf(":"));
                            f.a("UmcConfigUtil", "httpsHostWithoutPort:" + str4);
                        }
                        if (!TextUtils.isEmpty(str2) && string2.contains(str4)) {
                            int length5 = split3.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length5) {
                                    break;
                                }
                                String str10 = split3[i5];
                                if (!TextUtils.isEmpty(str2) && str10.contains(str4)) {
                                    str7 = str10;
                                    break;
                                }
                                i5++;
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                str7 = str7.substring(str7.indexOf(":"), str7.indexOf(","));
                            }
                            f.a("UmcConfigUtil", "httpsHost CERT:");
                            n.a(context, "https://" + str2 + "/unisdk/", str7);
                        }
                        if (string2.contains("onekey1.cmpassport.com")) {
                            int length6 = split3.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length6) {
                                    break;
                                }
                                String str11 = split3[i6];
                                if (str11.contains("onekey1.cmpassport.com")) {
                                    str7 = str11;
                                    break;
                                }
                                i6++;
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                str7 = str7.substring(str7.indexOf(":"), str7.indexOf(","));
                            }
                            f.a("UmcConfigUtil", "omekey1 CERT:");
                            n.a(context, "https://onekey1.cmpassport.com/unisdk/", str7);
                        }
                    }
                    if (jSONObject2.has("CLOSE_CERT_VERIFY")) {
                        n.a(context, "CLOSE_CERT_VERIFY", jSONObject2.getString("CLOSE_CERT_VERIFY"));
                    } else {
                        n.a(context, "CLOSE_CERT_VERIFY", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (jSONObject2.has("CLOSE_FRIEND_WAPKS")) {
                        n.a(context, "CLOSE_FRIEND_WAPKS", jSONObject2.getString("CLOSE_FRIEND_WAPKS"));
                    } else {
                        n.a(context, "CLOSE_FRIEND_WAPKS", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (jSONObject2.has("CLOSE_LOGS_VERSION")) {
                        n.a(context, "CLOSE_LOGS_VERSION", jSONObject2.getString("CLOSE_LOGS_VERSION"));
                    } else {
                        n.a(context, "CLOSE_LOGS_VERSION", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (jSONObject2.has("LOGS_CONTROL")) {
                        String[] split4 = jSONObject2.getString("LOGS_CONTROL").replace("h", "").split("&");
                        if (split4.length > 0) {
                            n.a(context, "maxFailedLogTimes", Integer.parseInt(split4[0]));
                        }
                        if (1 < split4.length) {
                            n.a(context, "pauseTime", Integer.parseInt(split4[1]));
                        }
                    } else {
                        n.a(context, "maxFailedLogTimes", 0);
                        n.a(context, "pauseTime", 0);
                    }
                    if (jSONObject2.has("CLOSE_IPV4_LIST")) {
                        n.a(context, "CLOSE_IPV4_LIST", jSONObject2.getString("CLOSE_IPV4_LIST"));
                    } else {
                        n.a(context, "CLOSE_IPV4_LIST", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (jSONObject2.has("CLOSE_IPV6_LIST")) {
                        n.a(context, "CLOSE_IPV6_LIST", jSONObject2.getString("CLOSE_IPV6_LIST"));
                    } else {
                        n.a(context, "CLOSE_IPV6_LIST", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                    if (jSONObject2.has("CLOSE_M001_SDKVERSION_LIST")) {
                        n.a(context, "CLOSE_M001_SDKVERSION_LIST", jSONObject2.getString("CLOSE_M001_SDKVERSION_LIST"));
                    } else {
                        n.a(context, "CLOSE_M001_SDKVERSION_LIST", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (jSONObject2.has("CLOSE_M001_APPID_LIST")) {
                        n.a(context, "CLOSE_M001_APPID_LIST", jSONObject2.getString("CLOSE_M001_APPID_LIST"));
                    } else {
                        n.a(context, "CLOSE_M001_APPID_LIST", PushConstants.PUSH_TYPE_NOTIFY);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
