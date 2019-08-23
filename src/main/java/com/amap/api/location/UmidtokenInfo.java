package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.loc.ce;
import com.loc.dc;

public class UmidtokenInfo {

    /* renamed from: a  reason: collision with root package name */
    static Handler f5584a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    static String f5585b = null;

    /* renamed from: c  reason: collision with root package name */
    static boolean f5586c = true;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static AMapLocationClient f5587d;

    /* renamed from: e  reason: collision with root package name */
    private static long f5588e = 30000;

    static class a implements AMapLocationListener {
        a() {
        }

        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.f5587d != null) {
                    UmidtokenInfo.f5584a.removeCallbacksAndMessages(null);
                    UmidtokenInfo.f5587d.onDestroy();
                }
            } catch (Throwable th) {
                ce.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    public static String getUmidtoken() {
        return f5585b;
    }

    public static void setLocAble(boolean z) {
        f5586c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        synchronized (UmidtokenInfo.class) {
            try {
                f5585b = str;
                dc.a(str);
                if (f5587d == null && f5586c) {
                    a aVar = new a();
                    f5587d = new AMapLocationClient(context);
                    AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                    aMapLocationClientOption.setOnceLocation(true);
                    aMapLocationClientOption.setNeedAddress(false);
                    f5587d.setLocationOption(aMapLocationClientOption);
                    f5587d.setLocationListener(aVar);
                    f5587d.startLocation();
                    f5584a.postDelayed(new Runnable() {
                        public final void run() {
                            try {
                                if (UmidtokenInfo.f5587d != null) {
                                    UmidtokenInfo.f5587d.onDestroy();
                                }
                            } catch (Throwable th) {
                                ce.a(th, "UmidListener", "postDelayed");
                            }
                        }
                    }, 30000);
                }
            } catch (Throwable th) {
                ce.a(th, "UmidListener", "setUmidtoken");
            }
        }
    }
}
