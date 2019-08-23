package com.ss.ttvideoengine.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TTHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAppPath;

    public static String base64Decode(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91577, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91577, new Class[]{String.class}, String.class);
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                str3 = new String(Base64.decode(str2, 0), "utf-8");
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static final String decodeUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 91579, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 91579, new Class[]{String.class}, String.class);
        }
        String str2 = "";
        String str3 = str;
        while (!str2.equals(str3)) {
            try {
                str2 = str3;
                str3 = URLDecoder.decode(str3, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return str3;
    }

    public static final String encodeUrl(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91578, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91578, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            try {
                return URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static final String getAppFilesPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 91580, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 91580, new Class[]{Context.class}, String.class);
        } else if (mAppPath != null) {
            return mAppPath;
        } else {
            if (context == null) {
                return null;
            }
            try {
                mAppPath = context.getApplicationContext().getFilesDir().getAbsolutePath();
                return mAppPath;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
