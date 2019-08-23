package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.loc.by;
import com.loc.ce;
import com.loc.ck;
import com.loc.cl;
import com.loc.dh;
import com.loc.di;
import com.loc.t;

public class AMapLocationClient {

    /* renamed from: a  reason: collision with root package name */
    Context f5552a;

    /* renamed from: b  reason: collision with root package name */
    LocationManagerBase f5553b;

    public AMapLocationClient(Context context) {
        if (context != null) {
            try {
                this.f5552a = context.getApplicationContext();
                this.f5553b = a(this.f5552a, null);
            } catch (Throwable th) {
                ce.a(th, "AMapLocationClient", "AMapLocationClient 1");
            }
        } else {
            throw new IllegalArgumentException("Context参数不能为null");
        }
    }

    public AMapLocationClient(Context context, Intent intent) {
        if (context != null) {
            try {
                this.f5552a = context.getApplicationContext();
                this.f5553b = a(this.f5552a, intent);
            } catch (Throwable th) {
                ce.a(th, "AMapLocationClient", "AMapLocationClient 2");
            }
        } else {
            throw new IllegalArgumentException("Context参数不能为null");
        }
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f5554a = str;
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "setApiKey");
        }
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            if (this.f5553b != null) {
                this.f5553b.disableBackgroundLocation(z);
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "disableBackgroundLocation");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            if (this.f5553b != null) {
                this.f5553b.enableBackgroundLocation(i, notification);
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "enableBackgroundLocation");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            if (this.f5553b != null) {
                return this.f5553b.getLastKnownLocation();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "getLastKnownLocation");
        }
        return null;
    }

    public String getVersion() {
        return "4.2.0";
    }

    public boolean isStarted() {
        try {
            if (this.f5553b != null) {
                return this.f5553b.isStarted();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "isStarted");
        }
        return false;
    }

    public void onDestroy() {
        try {
            if (this.f5553b != null) {
                this.f5553b.onDestroy();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "onDestroy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener != null) {
            try {
                if (this.f5553b != null) {
                    this.f5553b.setLocationListener(aMapLocationListener);
                }
            } catch (Throwable th) {
                ce.a(th, "AMapLocationClient", "setLocationListener");
            }
        } else {
            throw new IllegalArgumentException("listener参数不能为null");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption != null) {
            try {
                if (this.f5553b != null) {
                    this.f5553b.setLocationOption(aMapLocationClientOption);
                }
            } catch (Throwable th) {
                ce.a(th, "AMapLocationClient", "setLocationOption");
            }
        } else {
            throw new IllegalArgumentException("LocationManagerOption参数不能为null");
        }
    }

    public void startAssistantLocation() {
        try {
            if (this.f5553b != null) {
                this.f5553b.startAssistantLocation();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "startAssistantLocation");
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            if (this.f5553b != null) {
                this.f5553b.startAssistantLocation(webView);
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "startAssistantLocation1");
        }
    }

    public void startLocation() {
        try {
            if (this.f5553b != null) {
                this.f5553b.startLocation();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "startLocation");
        }
    }

    public void stopAssistantLocation() {
        try {
            if (this.f5553b != null) {
                this.f5553b.stopAssistantLocation();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "stopAssistantLocation");
        }
    }

    public void stopLocation() {
        try {
            if (this.f5553b != null) {
                this.f5553b.stopLocation();
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "stopLocation");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (this.f5553b != null) {
                this.f5553b.unRegisterLocationListener(aMapLocationListener);
            }
        } catch (Throwable th) {
            ce.a(th, "AMapLocationClient", "unRegisterLocationListener");
        }
    }

    private static LocationManagerBase a(Context context, Intent intent) {
        LocationManagerBase locationManagerBase;
        dh b2;
        boolean b3;
        try {
            b2 = ce.b();
            ck.a(context, b2);
            b3 = ck.b(context);
            if (ck.a(context)) {
                if (!ck.f25667a) {
                    cl.a(context, "loc", "startMark", cl.b(context, "loc", "startMark", 0) + 1);
                    ck.f25667a = true;
                }
            }
        } catch (Throwable unused) {
            locationManagerBase = new by(context, intent);
        }
        if (b3) {
            locationManagerBase = (LocationManagerBase) t.a(context, b2, di.c("IY29tLmFtYXAuYXBpLmxvY2F0aW9uLkxvY2F0aW9uTWFuYWdlcldyYXBwZXI="), by.class, new Class[]{Context.class, Intent.class}, new Object[]{context, intent});
        } else {
            locationManagerBase = new by(context, intent);
        }
        if (locationManagerBase == null) {
            return new by(context, intent);
        }
        return locationManagerBase;
    }
}
