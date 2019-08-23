package com.huawei.android.pushagent.utils.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class f {
    public static String a(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : a.a(str);
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            return g.a(bArr, str);
        } catch (Exception e2) {
            e.c("PushLogSC2815", "rsa encrypt data error ", e2);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        String str;
        Exception exc;
        String str2;
        StringBuilder sb;
        try {
            return c.a(bArr, 0, bArr2, 0);
        } catch (InvalidKeyException e2) {
            str = "PushLogSC2815";
            sb = new StringBuilder("InvalidKeyException:");
            str2 = e2.getMessage();
            exc = e2;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (BadPaddingException e3) {
            str = "PushLogSC2815";
            sb = new StringBuilder("BadPaddingException:");
            str2 = e3.getMessage();
            exc = e3;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (IllegalBlockSizeException e4) {
            str = "PushLogSC2815";
            sb = new StringBuilder("IllegalBlockSizeException:");
            str2 = e4.getMessage();
            exc = e4;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (NoSuchAlgorithmException e5) {
            str = "PushLogSC2815";
            sb = new StringBuilder("NoSuchAlgorithmException:");
            str2 = e5.getMessage();
            exc = e5;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (NoSuchPaddingException e6) {
            str = "PushLogSC2815";
            sb = new StringBuilder("NoSuchPaddingException:");
            str2 = e6.getMessage();
            exc = e6;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (Exception e7) {
            str = "PushLogSC2815";
            sb = new StringBuilder("Exception:");
            str2 = e7.getMessage();
            exc = e7;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        }
    }

    public static String b(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : a.b(str);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        String str;
        Exception exc;
        String str2;
        StringBuilder sb;
        try {
            return c.a(bArr, bArr2, 0);
        } catch (InvalidKeyException e2) {
            str = "PushLogSC2815";
            sb = new StringBuilder("InvalidKeyException:");
            str2 = e2.getMessage();
            exc = e2;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (BadPaddingException e3) {
            str = "PushLogSC2815";
            sb = new StringBuilder("BadPaddingException:");
            str2 = e3.getMessage();
            exc = e3;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (IllegalBlockSizeException e4) {
            str = "PushLogSC2815";
            sb = new StringBuilder("IllegalBlockSizeException:");
            str2 = e4.getMessage();
            exc = e4;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (NoSuchAlgorithmException e5) {
            str = "PushLogSC2815";
            sb = new StringBuilder("NoSuchAlgorithmException:");
            str2 = e5.getMessage();
            exc = e5;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (NoSuchPaddingException e6) {
            str = "PushLogSC2815";
            sb = new StringBuilder("NoSuchPaddingException:");
            str2 = e6.getMessage();
            exc = e6;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (Exception e7) {
            str = "PushLogSC2815";
            sb = new StringBuilder("Exception:");
            str2 = e7.getMessage();
            exc = e7;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        }
    }
}
