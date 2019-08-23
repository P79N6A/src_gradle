package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import com.amap.api.mapcore2d.cy;
import com.amap.api.maps2d.MapsInitializer;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class cm {

    /* renamed from: a  reason: collision with root package name */
    public static double[] f5839a = {7453.642d, 3742.9905d, 1873.333d, 936.89026d, 468.472d, 234.239d, 117.12d, 58.56d, 29.28d, 14.64d, 7.32d, 3.66d, 1.829d, 0.915d, 0.4575d, 0.228d, 0.1144d};

    public static double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return ((d4 - d2) * (d7 - d3)) - ((d6 - d2) * (d5 - d3));
    }

    public static float a(float f2) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 45.0f) {
            return 45.0f;
        }
        return f2;
    }

    public static boolean a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d4 - d2;
        double d11 = d9 - d7;
        double d12 = d5 - d3;
        double d13 = d8 - d6;
        double d14 = (d10 * d11) - (d12 * d13);
        if (d14 != 0.0d) {
            double d15 = d3 - d7;
            double d16 = d2 - d6;
            double d17 = ((d13 * d15) - (d11 * d16)) / d14;
            double d18 = ((d15 * d10) - (d16 * d12)) / d14;
            if (d17 >= 0.0d && d17 <= 1.0d && d18 >= 0.0d && d18 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public static String a(String str, Object obj) {
        return str + "=" + String.valueOf(obj);
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String append : strArr) {
            sb.append(append);
            if (i != strArr.length - 1) {
                sb.append(",");
            }
            i++;
        }
        return sb.toString();
    }

    public static boolean a(LatLng latLng, List<LatLng> list) {
        double d2;
        LatLng latLng2 = latLng;
        List<LatLng> list2 = list;
        double d3 = latLng2.longitude;
        double d4 = latLng2.latitude;
        double d5 = latLng2.latitude;
        if (list.size() < 3) {
            return false;
        }
        boolean z = true;
        if (!list2.get(0).equals(list2.get(list.size() - 1))) {
            list2.add(list2.get(0));
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() - 1) {
            double d6 = list2.get(i).longitude;
            double d7 = list2.get(i).latitude;
            int i3 = i + 1;
            double d8 = list2.get(i3).longitude;
            int i4 = i3;
            double d9 = list2.get(i3).latitude;
            double d10 = d8;
            double d11 = d7;
            double d12 = d6;
            double d13 = d5;
            double d14 = d4;
            if (b(d3, d4, d6, d11, d10, d9)) {
                return true;
            }
            if (Math.abs(d9 - d11) >= 1.0E-9d) {
                if (b(d12, d11, d3, d14, 180.0d, d13)) {
                    if (d11 > d9) {
                        i2++;
                    }
                } else if (!b(d10, d9, d3, d14, 180.0d, d13)) {
                    d2 = d3;
                    if (a(d12, d11, d10, d9, d3, d14, 180.0d, d13)) {
                        i2++;
                    }
                    d3 = d2;
                    i = i4;
                    d5 = d13;
                    d4 = d14;
                    list2 = list;
                } else if (d9 > d11) {
                    i2++;
                }
            }
            d2 = d3;
            d3 = d2;
            i = i4;
            d5 = d13;
            d4 = d14;
            list2 = list;
        }
        if (i2 % 2 == 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r3) {
        /*
            java.lang.Class<com.amap.api.mapcore2d.cm> r0 = com.amap.api.mapcore2d.cm.class
            monitor-enter(r0)
            r1 = 0
            if (r3 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            java.lang.String r2 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            if (r3 != 0) goto L_0x0014
            monitor-exit(r0)
            return r1
        L_0x0014:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            if (r3 != 0) goto L_0x001c
            monitor-exit(r0)
            return r1
        L_0x001c:
            android.net.NetworkInfo$State r3 = r3.getState()     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            if (r3 == 0) goto L_0x002a
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            if (r3 == r2) goto L_0x002a
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTING     // Catch:{ Throwable -> 0x002f, all -> 0x002c }
            if (r3 != r2) goto L_0x002f
        L_0x002a:
            monitor-exit(r0)
            return r1
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x002f:
            r3 = 1
            monitor-exit(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cm.a(android.content.Context):boolean");
    }

    public static void a(Throwable th, String str, String str2) {
        try {
            dg a2 = dg.a();
            if (a2 != null) {
                a2.c(th, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(File file) throws IOException, Exception {
        if (file == null || !file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    if (!listFiles[i].delete()) {
                        return false;
                    }
                } else if (!a(listFiles[i])) {
                    return false;
                } else {
                    listFiles[i].delete();
                }
            }
        }
        return true;
    }

    public static cy a() {
        try {
            if (q.p != null) {
                return q.p;
            }
            return new cy.a("2dmap", "5.2.0", "AMAP_SDK_Android_2DMap_5.2.0").a(new String[]{"com.amap.api.maps2d", "com.amap.api.mapcore2d"}).a("5.2.0").a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a(Object[] objArr) {
        return Arrays.hashCode(objArr);
    }

    public static float b(float f2) {
        if (f2 > ((float) q.f6268c)) {
            return (float) q.f6268c;
        }
        if (f2 < ((float) q.f6269d)) {
            return (float) q.f6269d;
        }
        return f2;
    }

    public static Bitmap a(String str) {
        Class<BitmapDescriptorFactory> cls = BitmapDescriptorFactory.class;
        try {
            InputStream resourceAsStream = cls.getResourceAsStream("/assets/" + str);
            Bitmap decodeStream = BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            return decodeStream;
        } catch (Throwable th) {
            a(th, "Util", "fromAsset");
            return null;
        }
    }

    public static String b(Context context) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return context.getFilesDir().getPath();
        }
        if (MapsInitializer.sdcardDir == null || MapsInitializer.sdcardDir.equals("")) {
            File file = new File(Environment.getExternalStorageDirectory(), "AMap");
            if (!file.exists()) {
                file.mkdir();
            }
            return file.toString() + "/";
        }
        File file2 = new File(MapsInitializer.sdcardDir);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, "Amap");
        if (!file3.exists()) {
            file3.mkdir();
        }
        return file3.toString() + "/";
    }

    public static w a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new w((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
    }

    public static String a(int i) {
        if (i < 1000) {
            return i + "m";
        }
        return (i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + "km";
    }

    public static Bitmap a(Bitmap bitmap, float f2) {
        if (bitmap == null) {
            return null;
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * f2), (int) (((float) bitmap.getHeight()) * f2), true);
        } catch (Throwable th) {
            a(th, "Util", "zoomBitmap");
            return null;
        }
    }

    public static double a(LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double d2 = latLng3.longitude;
        double d3 = latLng3.latitude;
        double d4 = d2 * 0.01745329251994329d;
        double d5 = d3 * 0.01745329251994329d;
        double d6 = latLng4.longitude * 0.01745329251994329d;
        double d7 = latLng4.latitude * 0.01745329251994329d;
        double sin = Math.sin(d4);
        double sin2 = Math.sin(d5);
        double cos = Math.cos(d4);
        double cos2 = Math.cos(d5);
        double sin3 = Math.sin(d6);
        double sin4 = Math.sin(d7);
        double cos3 = Math.cos(d6);
        double cos4 = Math.cos(d7);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
        return Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d;
    }

    public static boolean b(double d2, double d3, double d4, double d5, double d6, double d7) {
        if (Math.abs(a(d2, d3, d4, d5, d6, d7)) >= 1.0E-9d || (d2 - d4) * (d2 - d6) > 0.0d || (d3 - d5) * (d3 - d7) > 0.0d) {
            return false;
        }
        return true;
    }
}
