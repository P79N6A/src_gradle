package com.bytedance.apm.k;

import android.util.Base64;
import com.taobao.android.dexposed.ClassUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d {
    public static String a(byte[] bArr) {
        byte[] bArr2;
        try {
            byte[] decode = Base64.decode(bArr, 0);
            byte[] bArr3 = new byte[0];
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec("yuNttCSojTyxZods".getBytes(), "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
                instance.init(2, secretKeySpec);
                bArr2 = instance.doFinal(decode);
            } catch (Exception e2) {
                com.bytedance.apm.d.a().a(e2, "DecodeUtils: decodeData");
                bArr2 = bArr3;
            }
            String str = new String(bArr2);
            int indexOf = str.indexOf(ClassUtils.INNER_CLASS_SEPARATOR);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            return str;
        } catch (Exception e3) {
            com.bytedance.apm.d.a().a(e3, "DecodeUtils: decodeData");
            return "";
        }
    }
}
