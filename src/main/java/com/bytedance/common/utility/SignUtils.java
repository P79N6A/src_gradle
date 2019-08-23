package com.bytedance.common.utility;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Method;

public class SignUtils {
    public static byte[] getApkSignature(String str) {
        try {
            Signature[] apkSignaturesCompatible = getApkSignaturesCompatible(str);
            if (apkSignaturesCompatible == null) {
                return null;
            }
            return apkSignaturesCompatible[0].toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Signature[] getAppSignatures(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Signature[] getApkSignaturesCompatible(String str) {
        Object obj;
        Object obj2;
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            Class[] clsArr = {String.class};
            Object[] objArr = {str};
            if (Build.VERSION.SDK_INT > 19) {
                obj = cls.newInstance();
            } else {
                obj = cls.getConstructor(clsArr).newInstance(objArr);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setToDefaults();
            if (Build.VERSION.SDK_INT > 19) {
                Method declaredMethod = cls.getDeclaredMethod("parsePackage", new Class[]{File.class, Integer.TYPE});
                declaredMethod.setAccessible(true);
                obj2 = declaredMethod.invoke(obj, new Object[]{new File(str), 64});
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("parsePackage", new Class[]{File.class, String.class, DisplayMetrics.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                obj2 = declaredMethod2.invoke(obj, new Object[]{new File(str), str, displayMetrics, 64});
            }
            cls.getDeclaredMethod("collectCertificates", new Class[]{obj2.getClass(), Integer.TYPE}).invoke(obj, new Object[]{obj2, 64});
            return (Signature[]) obj2.getClass().getDeclaredField("mSignatures").get(obj2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Signature[] getApkSignatures(Context context, String str) {
        Signature[] signatureArr;
        try {
            signatureArr = context.getPackageManager().getPackageArchiveInfo(str, 64).signatures;
        } catch (Exception unused) {
            signatureArr = null;
        }
        if (signatureArr == null) {
            return getApkSignaturesCompatible(str);
        }
        return signatureArr;
    }

    public static boolean checkSignature(Context context, String str) {
        Signature[] apkSignatures = getApkSignatures(context, str);
        if (apkSignatures == null) {
            return true;
        }
        Signature[] appSignatures = getAppSignatures(context);
        if (appSignatures == null) {
            return true;
        }
        for (Signature signature : appSignatures) {
            for (Signature equals : apkSignatures) {
                if (signature.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }
}
