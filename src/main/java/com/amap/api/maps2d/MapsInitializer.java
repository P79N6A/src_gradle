package com.amap.api.maps2d;

import android.content.Context;
import android.os.RemoteException;
import com.amap.api.mapcore2d.ar;
import com.amap.api.mapcore2d.cr;
import com.amap.api.mapcore2d.q;

public final class MapsInitializer {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6323a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6324b = false;
    public static String sdcardDir = "";

    public static String getVersion() {
        return "5.2.0";
    }

    public static boolean getNetworkEnable() {
        return f6323a;
    }

    public static boolean getUpdateDataActiveEnable() {
        return f6324b;
    }

    public static void setApiKey(String str) {
        cr.a(str);
    }

    public static void setNetworkEnable(boolean z) {
        f6323a = z;
    }

    public static void setUpdateDataActiveEnable(boolean z) {
        f6324b = z;
    }

    public static void loadWorldGridMap(boolean z) {
        q.i = z ^ true ? 1 : 0;
    }

    public static void initialize(Context context) throws RemoteException {
        if (context != null) {
            ar.f5624a = context.getApplicationContext();
        }
    }

    public static void replaceURL(String str, String str2) {
        if (str != null && !str.equals("")) {
            q.h = str;
            q.g = str2 + "DIY";
            if (str.contains("openstreetmap")) {
                q.f6268c = 19;
            }
        }
    }
}
