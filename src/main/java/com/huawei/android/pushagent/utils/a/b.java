package com.huawei.android.pushagent.utils.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f25163a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a() {
        int i;
        String str;
        String str2;
        Class[] clsArr = {String.class, Integer.TYPE};
        Object[] objArr = {"ro.build.hw_emui_api_level", 0};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            i = ((Integer) cls.getDeclaredMethod("getInt", clsArr).invoke(cls, objArr)).intValue();
            try {
                e.a("PushLogSC2815", "getEmuiLevel:" + i);
            } catch (ClassNotFoundException unused) {
            } catch (ExceptionInInitializerError unused2) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, ExceptionInInitializerError";
                e.d(str2, str);
                return i;
            } catch (LinkageError unused3) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, LinkageError";
                e.d(str2, str);
                return i;
            } catch (NoSuchMethodException unused4) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, NoSuchMethodException";
                e.d(str2, str);
                return i;
            } catch (NullPointerException unused5) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, NullPointerException";
                e.d(str2, str);
                return i;
            } catch (IllegalAccessException unused6) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, IllegalAccessException";
                e.d(str2, str);
                return i;
            } catch (IllegalArgumentException unused7) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, IllegalArgumentException";
                e.d(str2, str);
                return i;
            } catch (InvocationTargetException unused8) {
                str2 = "PushLogSC2815";
                str = " getEmuiLevel wrong, InvocationTargetException";
                e.d(str2, str);
                return i;
            }
        } catch (ClassNotFoundException unused9) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, ClassNotFoundException";
            e.d(str2, str);
            return i;
        } catch (ExceptionInInitializerError unused10) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, ExceptionInInitializerError";
            e.d(str2, str);
            return i;
        } catch (LinkageError unused11) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, LinkageError";
            e.d(str2, str);
            return i;
        } catch (NoSuchMethodException unused12) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, NoSuchMethodException";
            e.d(str2, str);
            return i;
        } catch (NullPointerException unused13) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, NullPointerException";
            e.d(str2, str);
            return i;
        } catch (IllegalAccessException unused14) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, IllegalAccessException";
            e.d(str2, str);
            return i;
        } catch (IllegalArgumentException unused15) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, IllegalArgumentException";
            e.d(str2, str);
            return i;
        } catch (InvocationTargetException unused16) {
            i = 0;
            str2 = "PushLogSC2815";
            str = " getEmuiLevel wrong, InvocationTargetException";
            e.d(str2, str);
            return i;
        }
        return i;
    }

    public static int a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return -1;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            if (allNetworkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
                return allNetworkInfo[i].getType();
            }
        }
        return -1;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr[i2] = f25163a[(b2 & 240) >> 4];
            cArr[i2 + 1] = f25163a[b2 & 15];
        }
        return new String(cArr);
    }

    public static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            e.a("PushLogSC2815", "jsonString is null");
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            e.c("PushLogSC2815", "cast jsonString to jsonObject error", e2);
            return null;
        }
    }

    public static JSONArray b(String str) {
        if (TextUtils.isEmpty(str)) {
            e.a("PushLogSC2815", "jsonString is null");
            return null;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException e2) {
            e.c("PushLogSC2815", "cast jsonString to jsonArray error", e2);
            return null;
        }
    }

    public static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder("0x");
                int i2 = i * 2;
                sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return bArr;
    }
}
