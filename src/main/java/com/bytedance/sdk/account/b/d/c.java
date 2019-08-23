package com.bytedance.sdk.account.b.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class c {
    public static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static List<String> a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return null;
            }
            for (Signature byteArray : signatureArr) {
                arrayList.add(b.a(byteArray.toByteArray()));
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
