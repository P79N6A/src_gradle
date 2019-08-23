package com.amap.api.services.core;

import android.content.Context;
import com.amap.api.services.a.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.MessageDigest;
import java.util.Locale;

public class SearchUtils {
    public static String getVersion() {
        return "6.1.0";
    }

    public static String getPkgName(Context context) {
        try {
            return context.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            j.a(th, "SearchUtils", "getPkgName");
            return null;
        }
    }

    public static String getSHA1(Context context) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            j.a(th, "SearchUtils", "getSHA1");
            return null;
        }
    }
}
