package com.unicom.xiaowo.login.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.unicom.xiaowo.login.a.a;
import com.unicom.xiaowo.login.a.b;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f81465a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    boolean z = false;
                    if (activeNetworkInfo.getType() != 1) {
                        return activeNetworkInfo.getType() == 0 ? 0 : -1;
                    }
                    if (context.getPackageManager().checkPermission("android.permission.CHANGE_NETWORK_STATE", context.getPackageName()) == 0) {
                        z = true;
                    }
                    "CHANGE_NETWORK_STATE=".concat(String.valueOf(z));
                    return (!z || !a(connectivityManager)) ? 2 : 1;
                }
            }
            return -1;
        } catch (Exception e2) {
            new StringBuilder("getOnlineType error:").append(e2.getMessage());
        }
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            str2 = a.a(a(b(context, str)), h.b().substring(0, 16));
        } catch (Exception e2) {
            com.google.a.a.a.a.a.a.b(e2);
            str2 = "";
        }
        "aesSign:".concat(String.valueOf(str2));
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r4) {
        /*
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            byte[] r4 = r4.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            r0.update(r4)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            byte[] r4 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r1)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            r1 = 0
        L_0x0019:
            int r2 = r4.length     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            if (r1 >= r2) goto L_0x0035
            byte r2 = r4[r1]     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            if (r2 >= 0) goto L_0x0022
            int r2 = r2 + 256
        L_0x0022:
            r3 = 16
            if (r2 >= r3) goto L_0x002b
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
        L_0x002b:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            r0.append(r2)     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0035:
            java.lang.String r4 = r0.toString()     // Catch:{ NoSuchAlgorithmException -> 0x003a }
            return r4
        L_0x003a:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.d.i.a(java.lang.String):java.lang.String");
    }

    public static String a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            boolean z = true;
            for (Map.Entry entry : d(new JSONObject(str).toString()).entrySet()) {
                stringBuffer.append(z ? "" : str2);
                stringBuffer.append((String) entry.getKey());
                stringBuffer.append("=");
                stringBuffer.append(entry.getValue() != null ? entry.getValue() : "");
                z = false;
            }
        } catch (Exception unused) {
        }
        new StringBuilder("sign&:").append(stringBuffer.toString());
        return stringBuffer.toString();
    }

    private static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            int length = digest.length;
            char[] cArr = new char[(length << 1)];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                cArr[i2] = f81465a[(digest[i] & 240) >> 4];
                cArr[i2 + 1] = f81465a[digest[i] & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int b(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (UnknownHostException unused) {
            return -1;
        }
    }

    private static byte[] b(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (packageInfo.packageName.equals(str)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String c(String str) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(b.a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCbRkBR4leALApkWRp2ng8zJ2WgI7YEqtMwW9Q1tmRzDLPNhH0ugACfbiStBG4ybdYNHzRlxvOwQ7R0MeN56qEPsv6qieg/HiRXBnQ2hQ2hypo9JHqHx8BX54ESZ+BIf0imjGTcxtHvbzYA04ckmH5Enl2Pkd+R/RZuMK589C7KwQIDAQAB")));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePublic);
            return URLEncoder.encode(b.a(instance.doFinal(str.getBytes())), "UTF-8");
        } catch (Exception e2) {
            e2.getMessage();
            return "";
        }
    }

    private static TreeMap d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            TreeMap treeMap = new TreeMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                treeMap.put(next, jSONObject.getString(next));
            }
            return treeMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
