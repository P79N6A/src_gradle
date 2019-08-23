package com.tencent.bugly.proguard;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ae implements ag {

    /* renamed from: a  reason: collision with root package name */
    private String f79404a;

    public final void a(String str) {
        if (str != null) {
            for (int length = str.length(); length < 16; length++) {
                str = str + PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.f79404a = str.substring(0, 16);
        }
    }

    public final byte[] a(byte[] bArr) throws Exception {
        if (this.f79404a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(b2 + " ");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f79404a.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f79404a.getBytes()));
        byte[] doFinal = instance.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b3 : doFinal) {
            stringBuffer2.append(b3 + " ");
        }
        return doFinal;
    }

    public final byte[] b(byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (this.f79404a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(b2 + " ");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f79404a.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f79404a.getBytes()));
        byte[] doFinal = instance.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b3 : doFinal) {
            stringBuffer2.append(b3 + " ");
        }
        return doFinal;
    }
}
