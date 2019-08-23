package com.huawei.android.pushagent.utils.a.a;

import com.huawei.android.pushagent.utils.a.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class h {
    public static String a(String str) {
        String str2;
        String str3;
        Exception exc;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("UTF-8"));
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer(40);
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toHexString(b3));
            }
            e.a("PushLogSC2815", "getSHA256str:" + stringBuffer.toString());
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            str3 = "PushLogSC2815";
            str2 = e2.toString();
            exc = e2;
            e.c(str3, str2, exc);
            return str;
        } catch (NullPointerException e3) {
            str3 = "PushLogSC2815";
            str2 = e3.toString();
            exc = e3;
            e.c(str3, str2, exc);
            return str;
        } catch (Exception e4) {
            str3 = "PushLogSC2815";
            str2 = e4.toString();
            exc = e4;
            e.c(str3, str2, exc);
            return str;
        }
    }
}
