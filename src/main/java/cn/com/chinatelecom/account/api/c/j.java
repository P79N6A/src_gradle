package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f1809a = {"android.permission.READ_PHONE_STATE"};

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (a(context, f1809a)) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private static boolean a(Context context, String[] strArr) {
        if (!(context == null || strArr == null || strArr.length <= 0)) {
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strArr.length; i++) {
                if (-1 == packageManager.checkPermission(strArr[i], context.getPackageName())) {
                    arrayList.add(strArr[i]);
                }
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
