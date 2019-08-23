package cn.com.chinatelecom.account.api.a;

import java.nio.charset.Charset;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1764a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f1765b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private static byte[] f1766c = "D@^12S".getBytes(f1765b);

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = bArr[i];
                for (byte b2 : f1766c) {
                    bArr2[i] = (byte) (b2 ^ bArr2[i]);
                }
            }
            return new String(bArr2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
