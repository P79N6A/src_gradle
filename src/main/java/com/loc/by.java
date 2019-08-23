package com.loc;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.APSService;
import com.amap.api.location.LocationManagerBase;
import com.amap.api.location.UmidtokenInfo;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.loc.cj;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;
import java.util.ArrayList;
import java.util.Iterator;

public class by implements LocationManagerBase {
    boolean A = false;
    /* access modifiers changed from: private */
    public boolean B = false;
    private volatile boolean C = false;
    private ct D = null;
    private ServiceConnection E = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                by.this.j = new Messenger(iBinder);
                boolean unused = by.this.B = true;
                by.this.t = true;
            } catch (Throwable th) {
                ce.a(th, "AmapLocationManager", "onServiceConnected");
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            by.this.j = null;
            boolean unused = by.this.B = false;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    Context f25606a;

    /* renamed from: b  reason: collision with root package name */
    AMapLocationClientOption f25607b = new AMapLocationClientOption();

    /* renamed from: c  reason: collision with root package name */
    public c f25608c;

    /* renamed from: d  reason: collision with root package name */
    cs f25609d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<AMapLocationListener> f25610e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f25611f = false;
    boolean g = true;
    public boolean h = true;
    cv i;
    Messenger j = null;
    Messenger k = null;
    Intent l = null;
    int m = 0;
    boolean n = true;
    b o = null;
    boolean p = false;
    AMapLocationClientOption.AMapLocationMode q = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    Object r = new Object();
    cj s = null;
    boolean t = false;
    cp u = null;
    String v = null;
    boolean w = false;
    boolean x = false;
    a y = null;
    String z = null;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:147|148|(7:150|151|(2:153|(1:155))(1:156)|157|(2:159|(1:161)(1:162))|163|(3:167|(4:183|(1:185)|186|(2:188|(5:192|(1:194)(1:195)|196|(1:198)(1:199)|200)))|201))|202|203|(1:205)|206) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x01c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:202:0x0378 */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0380 A[Catch:{ Throwable -> 0x0386 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r13) {
            /*
                r12 = this;
                super.handleMessage(r13)     // Catch:{ Throwable -> 0x048a }
                int r0 = r13.what     // Catch:{ Throwable -> 0x048a }
                r1 = 0
                r2 = 1025(0x401, float:1.436E-42)
                r3 = 1000(0x3e8, double:4.94E-321)
                r5 = 2
                r6 = 300000(0x493e0, double:1.482197E-318)
                r8 = 0
                r9 = 1
                switch(r0) {
                    case 1002: goto L_0x0457;
                    case 1003: goto L_0x0448;
                    case 1004: goto L_0x0439;
                    case 1005: goto L_0x0409;
                    case 1006: goto L_0x0408;
                    case 1007: goto L_0x0408;
                    case 1008: goto L_0x03c7;
                    case 1009: goto L_0x039e;
                    case 1010: goto L_0x039d;
                    case 1011: goto L_0x038f;
                    case 1012: goto L_0x0013;
                    case 1013: goto L_0x0013;
                    case 1014: goto L_0x01eb;
                    case 1015: goto L_0x01d1;
                    case 1016: goto L_0x00fb;
                    case 1017: goto L_0x00e5;
                    case 1018: goto L_0x00c8;
                    case 1019: goto L_0x00c7;
                    case 1020: goto L_0x00c7;
                    case 1021: goto L_0x00c7;
                    case 1022: goto L_0x00c7;
                    case 1023: goto L_0x0085;
                    case 1024: goto L_0x0050;
                    case 1025: goto L_0x0015;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0489
            L_0x0015:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x0046 }
                if (r13 == 0) goto L_0x0045
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x0046 }
                long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0046 }
                long r3 = r13.f25706f     // Catch:{ Throwable -> 0x0046 }
                r13 = 0
                long r0 = r0 - r3
                int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r13 <= 0) goto L_0x002c
                r8 = 1
            L_0x002c:
                if (r8 == 0) goto L_0x0040
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x0046 }
                r13.a()     // Catch:{ Throwable -> 0x0046 }
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x0046 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                com.amap.api.location.AMapLocationClientOption r0 = r0.f25607b     // Catch:{ Throwable -> 0x0046 }
                r13.a((com.amap.api.location.AMapLocationClientOption) r0)     // Catch:{ Throwable -> 0x0046 }
            L_0x0040:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0046 }
                r13.a((int) r2, (java.lang.Object) null, (long) r6)     // Catch:{ Throwable -> 0x0046 }
            L_0x0045:
                return
            L_0x0046:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage ACTION_REBOOT_GPS_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                goto L_0x0489
            L_0x0050:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x007c }
                if (r13 == 0) goto L_0x007b
                android.os.Bundle r13 = r13.getData()     // Catch:{ Throwable -> 0x0073 }
                if (r13 != 0) goto L_0x005b
                return
            L_0x005b:
                java.lang.String r1 = "j"
                boolean r13 = r13.getBoolean(r1, r9)     // Catch:{ Throwable -> 0x0073 }
                android.content.Intent r1 = r0.h()     // Catch:{ Throwable -> 0x0073 }
                java.lang.String r2 = "j"
                r1.putExtra(r2, r13)     // Catch:{ Throwable -> 0x0073 }
                java.lang.String r13 = "g"
                r1.putExtra(r13, r5)     // Catch:{ Throwable -> 0x0073 }
                r0.a((android.content.Intent) r1, (boolean) r8)     // Catch:{ Throwable -> 0x0073 }
                return
            L_0x0073:
                r13 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "doDisableBackgroundLocation"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x007c }
            L_0x007b:
                return
            L_0x007c:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage ACTION_DISABLE_BACKGROUND"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0085:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x00be }
                if (r13 == 0) goto L_0x00bd
                android.os.Bundle r13 = r13.getData()     // Catch:{ Throwable -> 0x00b5 }
                if (r13 != 0) goto L_0x0090
                return
            L_0x0090:
                java.lang.String r1 = "i"
                int r1 = r13.getInt(r1, r8)     // Catch:{ Throwable -> 0x00b5 }
                java.lang.String r2 = "h"
                android.os.Parcelable r13 = r13.getParcelable(r2)     // Catch:{ Throwable -> 0x00b5 }
                android.app.Notification r13 = (android.app.Notification) r13     // Catch:{ Throwable -> 0x00b5 }
                android.content.Intent r2 = r0.h()     // Catch:{ Throwable -> 0x00b5 }
                java.lang.String r3 = "i"
                r2.putExtra(r3, r1)     // Catch:{ Throwable -> 0x00b5 }
                java.lang.String r1 = "h"
                r2.putExtra(r1, r13)     // Catch:{ Throwable -> 0x00b5 }
                java.lang.String r13 = "g"
                r2.putExtra(r13, r9)     // Catch:{ Throwable -> 0x00b5 }
                r0.a((android.content.Intent) r2, (boolean) r9)     // Catch:{ Throwable -> 0x00b5 }
                return
            L_0x00b5:
                r13 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "doEnableBackgroundLocation"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x00be }
            L_0x00bd:
                return
            L_0x00be:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage ACTION_ENABLE_BACKGROUND"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x00c7:
                return
            L_0x00c8:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x00dc }
                java.lang.Object r13 = r13.obj     // Catch:{ Throwable -> 0x00dc }
                com.amap.api.location.AMapLocationClientOption r13 = (com.amap.api.location.AMapLocationClientOption) r13     // Catch:{ Throwable -> 0x00dc }
                r0.f25607b = r13     // Catch:{ Throwable -> 0x00dc }
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x00dc }
                com.amap.api.location.AMapLocationClientOption r13 = r13.f25607b     // Catch:{ Throwable -> 0x00dc }
                if (r13 == 0) goto L_0x00db
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x00dc }
                com.loc.by.b((com.loc.by) r13)     // Catch:{ Throwable -> 0x00dc }
            L_0x00db:
                return
            L_0x00dc:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage SET_OPTION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x00e5:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x00f2 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x00f2 }
                r13.a()     // Catch:{ Throwable -> 0x00f2 }
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x00f2 }
                r13.a(1025)     // Catch:{ Throwable -> 0x00f2 }
                return
            L_0x00f2:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage STOP_GPS_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x00fb:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x01c8 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x01c8 }
                boolean r13 = r13.b()     // Catch:{ Throwable -> 0x01c8 }
                if (r13 == 0) goto L_0x010d
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x01c8 }
                r0 = 1016(0x3f8, float:1.424E-42)
                r13.a((int) r0, (java.lang.Object) null, (long) r3)     // Catch:{ Throwable -> 0x01c8 }
                return
            L_0x010d:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x01c8 }
                boolean r0 = r13.g     // Catch:{ Throwable -> 0x01a8 }
                if (r0 == 0) goto L_0x0150
                r13.g = r8     // Catch:{ Throwable -> 0x01a8 }
                com.loc.cm r0 = new com.loc.cm     // Catch:{ Throwable -> 0x01a8 }
                r0.<init>()     // Catch:{ Throwable -> 0x01a8 }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.a((com.loc.cm) r0)     // Catch:{ Throwable -> 0x01a8 }
                boolean r1 = r13.a()     // Catch:{ Throwable -> 0x01a8 }
                if (r1 == 0) goto L_0x019a
                android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x01a8 }
                r1.<init>()     // Catch:{ Throwable -> 0x01a8 }
                java.lang.String r2 = "0"
                if (r0 == 0) goto L_0x013c
                int r3 = r0.getLocationType()     // Catch:{ Throwable -> 0x01a8 }
                if (r3 == r5) goto L_0x013a
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x01a8 }
                r3 = 4
                if (r0 != r3) goto L_0x013c
            L_0x013a:
                java.lang.String r2 = "1"
            L_0x013c:
                java.lang.String r0 = "optBundle"
                com.amap.api.location.AMapLocationClientOption r3 = r13.f25607b     // Catch:{ Throwable -> 0x01a8 }
                android.os.Bundle r3 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r3)     // Catch:{ Throwable -> 0x01a8 }
                r1.putBundle(r0, r3)     // Catch:{ Throwable -> 0x01a8 }
                java.lang.String r0 = "isCacheLoc"
                r1.putString(r0, r2)     // Catch:{ Throwable -> 0x01a8 }
                r13.a((int) r8, (android.os.Bundle) r1)     // Catch:{ Throwable -> 0x01a8 }
                goto L_0x019a
            L_0x0150:
                boolean r0 = r13.t     // Catch:{ Throwable -> 0x0164 }
                if (r0 == 0) goto L_0x016e
                boolean r0 = r13.isStarted()     // Catch:{ Throwable -> 0x0164 }
                if (r0 != 0) goto L_0x016e
                boolean r0 = r13.x     // Catch:{ Throwable -> 0x0164 }
                if (r0 != 0) goto L_0x016e
                r13.x = r9     // Catch:{ Throwable -> 0x0164 }
                r13.g()     // Catch:{ Throwable -> 0x0164 }
                goto L_0x016e
            L_0x0164:
                r0 = move-exception
                r13.x = r9     // Catch:{ Throwable -> 0x01a8 }
                java.lang.String r1 = "AmapLocationManager"
                java.lang.String r2 = "doLBSLocation reStartService"
                com.loc.ce.a(r0, r1, r2)     // Catch:{ Throwable -> 0x01a8 }
            L_0x016e:
                boolean r0 = r13.a()     // Catch:{ Throwable -> 0x01a8 }
                if (r0 == 0) goto L_0x019a
                r13.x = r8     // Catch:{ Throwable -> 0x01a8 }
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Throwable -> 0x01a8 }
                r0.<init>()     // Catch:{ Throwable -> 0x01a8 }
                java.lang.String r1 = "optBundle"
                com.amap.api.location.AMapLocationClientOption r2 = r13.f25607b     // Catch:{ Throwable -> 0x01a8 }
                android.os.Bundle r2 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r2)     // Catch:{ Throwable -> 0x01a8 }
                r0.putBundle(r1, r2)     // Catch:{ Throwable -> 0x01a8 }
                java.lang.String r1 = "d"
                java.lang.String r2 = com.amap.api.location.UmidtokenInfo.getUmidtoken()     // Catch:{ Throwable -> 0x01a8 }
                r0.putString(r1, r2)     // Catch:{ Throwable -> 0x01a8 }
                com.loc.cs r1 = r13.f25609d     // Catch:{ Throwable -> 0x01a8 }
                boolean r1 = r1.b()     // Catch:{ Throwable -> 0x01a8 }
                if (r1 != 0) goto L_0x019a
                r13.a((int) r9, (android.os.Bundle) r0)     // Catch:{ Throwable -> 0x01a8 }
            L_0x019a:
                com.amap.api.location.AMapLocationClientOption r0 = r13.f25607b     // Catch:{ Throwable -> 0x01a5 }
                boolean r0 = r0.isOnceLocation()     // Catch:{ Throwable -> 0x01a5 }
                if (r0 != 0) goto L_0x01a5
                r13.f()     // Catch:{ Throwable -> 0x01a5 }
            L_0x01a5:
                return
            L_0x01a6:
                r0 = move-exception
                goto L_0x01bc
            L_0x01a8:
                r0 = move-exception
                java.lang.String r1 = "AmapLocationManager"
                java.lang.String r2 = "doLBSLocation"
                com.loc.ce.a(r0, r1, r2)     // Catch:{ all -> 0x01a6 }
                com.amap.api.location.AMapLocationClientOption r0 = r13.f25607b     // Catch:{ Throwable -> 0x01bb }
                boolean r0 = r0.isOnceLocation()     // Catch:{ Throwable -> 0x01bb }
                if (r0 != 0) goto L_0x01bb
                r13.f()     // Catch:{ Throwable -> 0x01bb }
            L_0x01bb:
                return
            L_0x01bc:
                com.amap.api.location.AMapLocationClientOption r1 = r13.f25607b     // Catch:{ Throwable -> 0x01c7 }
                boolean r1 = r1.isOnceLocation()     // Catch:{ Throwable -> 0x01c7 }
                if (r1 != 0) goto L_0x01c7
                r13.f()     // Catch:{ Throwable -> 0x01c7 }
            L_0x01c7:
                throw r0     // Catch:{ Throwable -> 0x01c8 }
            L_0x01c8:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage START_LBS_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x01d1:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x01e2 }
                com.loc.cs r13 = r13.f25609d     // Catch:{ Throwable -> 0x01e2 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x01e2 }
                com.amap.api.location.AMapLocationClientOption r0 = r0.f25607b     // Catch:{ Throwable -> 0x01e2 }
                r13.a((com.amap.api.location.AMapLocationClientOption) r0)     // Catch:{ Throwable -> 0x01e2 }
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x01e2 }
                r13.a((int) r2, (java.lang.Object) null, (long) r6)     // Catch:{ Throwable -> 0x01e2 }
                return
            L_0x01e2:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage START_GPS_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x01eb:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x048a }
                android.os.Bundle r13 = r13.getData()     // Catch:{ Throwable -> 0x0386 }
                java.lang.String r2 = "loc"
                android.os.Parcelable r2 = r13.getParcelable(r2)     // Catch:{ Throwable -> 0x0386 }
                com.amap.api.location.AMapLocation r2 = (com.amap.api.location.AMapLocation) r2     // Catch:{ Throwable -> 0x0386 }
                java.lang.String r5 = "lastLocNb"
                java.lang.String r13 = r13.getString(r5)     // Catch:{ Throwable -> 0x0386 }
                if (r2 == 0) goto L_0x0378
                com.loc.bv r5 = com.loc.cv.f25719b     // Catch:{ Throwable -> 0x0378 }
                if (r5 != 0) goto L_0x0210
                com.loc.cv r5 = r0.i     // Catch:{ Throwable -> 0x0378 }
                if (r5 == 0) goto L_0x0214
                com.loc.cv r1 = r0.i     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r1 = r1.b()     // Catch:{ Throwable -> 0x0378 }
                goto L_0x0214
            L_0x0210:
                com.loc.bv r1 = com.loc.cv.f25719b     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r1 = r1.f25597d     // Catch:{ Throwable -> 0x0378 }
            L_0x0214:
                com.amap.api.location.AMapLocation r5 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                if (r5 != 0) goto L_0x0228
                boolean r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r1)     // Catch:{ Throwable -> 0x0378 }
                if (r5 != 0) goto L_0x0222
                com.loc.cj.h = r2     // Catch:{ Throwable -> 0x0378 }
                goto L_0x0378
            L_0x0222:
                com.amap.api.location.AMapLocation r5 = r1.clone()     // Catch:{ Throwable -> 0x0378 }
                com.loc.cj.h = r5     // Catch:{ Throwable -> 0x0378 }
            L_0x0228:
                com.amap.api.location.AMapLocation r5 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                boolean r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r5)     // Catch:{ Throwable -> 0x0378 }
                if (r5 == 0) goto L_0x0378
                boolean r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r2)     // Catch:{ Throwable -> 0x0378 }
                if (r5 == 0) goto L_0x0378
                com.amap.api.location.AMapLocation r5 = r2.clone()     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r6 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                int r6 = r6.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                if (r6 == r9) goto L_0x0376
                com.amap.api.location.AMapLocation r6 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                int r6 = r6.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                r7 = 9
                if (r6 == r7) goto L_0x0376
                java.lang.String r6 = "gps"
                com.amap.api.location.AMapLocation r10 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r10 = r10.getProvider()     // Catch:{ Throwable -> 0x0378 }
                boolean r6 = r6.equalsIgnoreCase(r10)     // Catch:{ Throwable -> 0x0378 }
                if (r6 != 0) goto L_0x0376
                com.amap.api.location.AMapLocation r6 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                int r6 = r6.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                r10 = 7
                if (r6 == r10) goto L_0x0376
                int r6 = r5.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                if (r6 == r9) goto L_0x0376
                int r6 = r5.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                if (r6 == r7) goto L_0x0376
                java.lang.String r6 = "gps"
                java.lang.String r7 = r5.getProvider()     // Catch:{ Throwable -> 0x0378 }
                boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x0378 }
                if (r6 != 0) goto L_0x0376
                int r6 = r5.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                if (r6 == r10) goto L_0x0376
                long r6 = r5.getTime()     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r9 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                long r9 = r9.getTime()     // Catch:{ Throwable -> 0x0378 }
                r11 = 0
                long r6 = r6 - r9
                long r6 = java.lang.Math.abs(r6)     // Catch:{ Throwable -> 0x0378 }
                long r6 = r6 / r3
                r3 = 0
                int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r9 > 0) goto L_0x029a
                r6 = 1
            L_0x029a:
                r9 = 1800(0x708, double:8.893E-321)
                int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r11 > 0) goto L_0x0376
                com.amap.api.location.AMapLocation r9 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                float r9 = com.loc.cn.a((com.amap.api.location.AMapLocation) r9, (com.amap.api.location.AMapLocation) r5)     // Catch:{ Throwable -> 0x0378 }
                float r6 = (float) r6     // Catch:{ Throwable -> 0x0378 }
                float r6 = r9 / r6
                r7 = 1189765120(0x46ea6000, float:30000.0)
                int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r7 <= 0) goto L_0x0376
                r7 = 1148846080(0x447a0000, float:1000.0)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0376
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0378 }
                r6.<init>()     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r7 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                double r9 = r7.getLatitude()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r9)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r7 = ","
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r7 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                double r9 = r7.getLongitude()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r9)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r7 = ","
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r7 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                float r7 = r7.getAccuracy()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r7 = ","
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                com.amap.api.location.AMapLocation r7 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                int r7 = r7.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r7 = ","
                r6.append(r7)     // Catch:{ Throwable -> 0x0378 }
                long r9 = r1.getTime()     // Catch:{ Throwable -> 0x0378 }
                int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r1 == 0) goto L_0x030b
                com.amap.api.location.AMapLocation r1 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                long r9 = r1.getTime()     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = "yyyyMMdd_HH:mm:ss:SS"
                java.lang.String r1 = com.loc.cn.a((long) r9, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0378 }
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                goto L_0x0314
            L_0x030b:
                com.amap.api.location.AMapLocation r1 = com.loc.cj.h     // Catch:{ Throwable -> 0x0378 }
                long r9 = r1.getTime()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r9)     // Catch:{ Throwable -> 0x0378 }
            L_0x0314:
                java.lang.String r1 = "#"
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                double r9 = r5.getLatitude()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r9)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = ","
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                double r9 = r5.getLongitude()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r9)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = ","
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                float r1 = r5.getAccuracy()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = ","
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                int r1 = r5.getLocationType()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = ","
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                long r9 = r5.getTime()     // Catch:{ Throwable -> 0x0378 }
                int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r1 == 0) goto L_0x035f
                long r3 = r5.getTime()     // Catch:{ Throwable -> 0x0378 }
                java.lang.String r1 = "yyyyMMdd_HH:mm:ss:SS"
                java.lang.String r1 = com.loc.cn.a((long) r3, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0378 }
                r6.append(r1)     // Catch:{ Throwable -> 0x0378 }
                goto L_0x0366
            L_0x035f:
                long r3 = r5.getTime()     // Catch:{ Throwable -> 0x0378 }
                r6.append(r3)     // Catch:{ Throwable -> 0x0378 }
            L_0x0366:
                java.lang.String r1 = "bigshiftstatistics"
                java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x0378 }
                com.loc.cj.a((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0378 }
                int r1 = r6.length()     // Catch:{ Throwable -> 0x0378 }
                r6.delete(r8, r1)     // Catch:{ Throwable -> 0x0378 }
            L_0x0376:
                com.loc.cj.h = r5     // Catch:{ Throwable -> 0x0378 }
            L_0x0378:
                com.loc.cv r1 = r0.i     // Catch:{ Throwable -> 0x0386 }
                boolean r13 = r1.a(r2, r13)     // Catch:{ Throwable -> 0x0386 }
                if (r13 == 0) goto L_0x0385
                com.loc.cv r13 = r0.i     // Catch:{ Throwable -> 0x0386 }
                r13.d()     // Catch:{ Throwable -> 0x0386 }
            L_0x0385:
                return
            L_0x0386:
                r13 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "doSaveLastLocation"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x038f:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x0395 }
                r13.e()     // Catch:{ Throwable -> 0x0395 }
                return
            L_0x0395:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage DESTROY"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
            L_0x039d:
                return
            L_0x039e:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x03be }
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Throwable -> 0x03b5 }
                r0.<init>()     // Catch:{ Throwable -> 0x03b5 }
                java.lang.String r1 = "optBundle"
                com.amap.api.location.AMapLocationClientOption r2 = r13.f25607b     // Catch:{ Throwable -> 0x03b5 }
                android.os.Bundle r2 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r2)     // Catch:{ Throwable -> 0x03b5 }
                r0.putBundle(r1, r2)     // Catch:{ Throwable -> 0x03b5 }
                r1 = 3
                r13.a((int) r1, (android.os.Bundle) r0)     // Catch:{ Throwable -> 0x03b5 }
                return
            L_0x03b5:
                r13 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "stopAssistantLocationImpl"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x03be }
                return
            L_0x03be:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage STOP_SOCKET"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x03c7:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x03ff }
                android.os.Messenger r0 = r13.j     // Catch:{ Throwable -> 0x03f6 }
                if (r0 == 0) goto L_0x03e3
                r13.m = r8     // Catch:{ Throwable -> 0x03f6 }
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Throwable -> 0x03f6 }
                r0.<init>()     // Catch:{ Throwable -> 0x03f6 }
                java.lang.String r1 = "optBundle"
                com.amap.api.location.AMapLocationClientOption r2 = r13.f25607b     // Catch:{ Throwable -> 0x03f6 }
                android.os.Bundle r2 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r2)     // Catch:{ Throwable -> 0x03f6 }
                r0.putBundle(r1, r2)     // Catch:{ Throwable -> 0x03f6 }
                r13.a((int) r5, (android.os.Bundle) r0)     // Catch:{ Throwable -> 0x03f6 }
                return
            L_0x03e3:
                int r0 = r13.m     // Catch:{ Throwable -> 0x03f6 }
                int r0 = r0 + r9
                r13.m = r0     // Catch:{ Throwable -> 0x03f6 }
                int r0 = r13.m     // Catch:{ Throwable -> 0x03f6 }
                r2 = 10
                if (r0 >= r2) goto L_0x03f5
                r0 = 1008(0x3f0, float:1.413E-42)
                r2 = 50
                r13.a((int) r0, (java.lang.Object) r1, (long) r2)     // Catch:{ Throwable -> 0x03f6 }
            L_0x03f5:
                return
            L_0x03f6:
                r13 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "startAssistantLocationImpl"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x03ff }
                return
            L_0x03ff:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage START_SOCKET"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0408:
                return
            L_0x0409:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0430 }
                java.lang.Object r13 = r13.obj     // Catch:{ Throwable -> 0x0430 }
                com.amap.api.location.AMapLocationListener r13 = (com.amap.api.location.AMapLocationListener) r13     // Catch:{ Throwable -> 0x0430 }
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r1 = r0.f25610e     // Catch:{ Throwable -> 0x0430 }
                boolean r1 = r1.isEmpty()     // Catch:{ Throwable -> 0x0430 }
                if (r1 != 0) goto L_0x0424
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r1 = r0.f25610e     // Catch:{ Throwable -> 0x0430 }
                boolean r1 = r1.contains(r13)     // Catch:{ Throwable -> 0x0430 }
                if (r1 == 0) goto L_0x0424
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r1 = r0.f25610e     // Catch:{ Throwable -> 0x0430 }
                r1.remove(r13)     // Catch:{ Throwable -> 0x0430 }
            L_0x0424:
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r13 = r0.f25610e     // Catch:{ Throwable -> 0x0430 }
                boolean r13 = r13.isEmpty()     // Catch:{ Throwable -> 0x0430 }
                if (r13 == 0) goto L_0x042f
                r0.d()     // Catch:{ Throwable -> 0x0430 }
            L_0x042f:
                return
            L_0x0430:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage REMOVE_LISTENER"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0439:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x043f }
                r13.d()     // Catch:{ Throwable -> 0x043f }
                return
            L_0x043f:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage STOP_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0448:
                com.loc.by r13 = com.loc.by.this     // Catch:{ Throwable -> 0x044e }
                r13.c()     // Catch:{ Throwable -> 0x044e }
                return
            L_0x044e:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage START_LOCATION"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0457:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0480 }
                java.lang.Object r13 = r13.obj     // Catch:{ Throwable -> 0x0480 }
                com.amap.api.location.AMapLocationListener r13 = (com.amap.api.location.AMapLocationListener) r13     // Catch:{ Throwable -> 0x0480 }
                if (r13 == 0) goto L_0x0478
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r1 = r0.f25610e     // Catch:{ Throwable -> 0x0480 }
                if (r1 != 0) goto L_0x046a
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0480 }
                r1.<init>()     // Catch:{ Throwable -> 0x0480 }
                r0.f25610e = r1     // Catch:{ Throwable -> 0x0480 }
            L_0x046a:
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r1 = r0.f25610e     // Catch:{ Throwable -> 0x0480 }
                boolean r1 = r1.contains(r13)     // Catch:{ Throwable -> 0x0480 }
                if (r1 != 0) goto L_0x0477
                java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r0.f25610e     // Catch:{ Throwable -> 0x0480 }
                r0.add(r13)     // Catch:{ Throwable -> 0x0480 }
            L_0x0477:
                return
            L_0x0478:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0480 }
                java.lang.String r0 = "listener参数不能为null"
                r13.<init>(r0)     // Catch:{ Throwable -> 0x0480 }
                throw r13     // Catch:{ Throwable -> 0x0480 }
            L_0x0480:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage SET_LISTENER"
                com.loc.ce.a(r13, r0, r1)     // Catch:{ Throwable -> 0x048a }
                return
            L_0x0489:
                return
            L_0x048a:
                r13 = move-exception
                java.lang.String r0 = "AMapLocationManage$MHandlerr"
                java.lang.String r1 = "handleMessage"
                com.loc.ce.a(r13, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.by.a.handleMessage(android.os.Message):void");
        }
    }

    static class b extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        by f25617a;

        public b(String str, by byVar) {
            super(str);
            this.f25617a = byVar;
        }

        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            try {
                this.f25617a.i.a();
                this.f25617a.g();
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r0 = r9.f25618a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r10 = (com.amap.api.location.AMapLocation) r10.obj;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
            if (r0.h == false) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008a, code lost:
            if (r0.j == null) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
            r5 = new android.os.Bundle();
            r5.putBundle("optBundle", com.loc.ce.a(r0.f25607b));
            r0.a(0, r5);
            r0.h = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
            r0.a(r10, (java.lang.Throwable) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
            if (r0.n == false) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a8, code lost:
            r0.a(7, (android.os.Bundle) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
            r0.a(1025);
            r0.a(1025, (java.lang.Object) null, 300000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            com.loc.ce.a(r10, "AmapLocationManager", "resultGpsLocationSuccess");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c1, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            com.loc.ce.a(r10, "AmapLocationManager$ActionHandler", "handleMessage RESULT_GPS_LOCATIONSUCCESS");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c9, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                super.handleMessage(r10)     // Catch:{ Throwable -> 0x01bc }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x01bc }
                boolean r0 = r0.p     // Catch:{ Throwable -> 0x01bc }
                if (r0 == 0) goto L_0x0010
                boolean r0 = com.loc.ce.c()     // Catch:{ Throwable -> 0x01bc }
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                int r0 = r10.what     // Catch:{ Throwable -> 0x01bc }
                r1 = 100
                r2 = 0
                if (r0 == r1) goto L_0x013e
                r3 = 0
                r1 = 0
                switch(r0) {
                    case 1: goto L_0x00ca;
                    case 2: goto L_0x007e;
                    case 3: goto L_0x007d;
                    default: goto L_0x001d;
                }     // Catch:{ Throwable -> 0x01bc }
            L_0x001d:
                switch(r0) {
                    case 5: goto L_0x005b;
                    case 6: goto L_0x0040;
                    case 7: goto L_0x0028;
                    case 8: goto L_0x0022;
                    default: goto L_0x0020;
                }     // Catch:{ Throwable -> 0x01bc }
            L_0x0020:
                goto L_0x01bb
            L_0x0022:
                r0 = 2141(0x85d, float:3.0E-42)
                com.loc.cj.a((java.lang.String) r1, (int) r0)     // Catch:{ Throwable -> 0x01bc }
                goto L_0x007e
            L_0x0028:
                android.os.Bundle r10 = r10.getData()     // Catch:{ Throwable -> 0x0037 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0037 }
                java.lang.String r1 = "ngpsAble"
                boolean r10 = r10.getBoolean(r1)     // Catch:{ Throwable -> 0x0037 }
                r0.n = r10     // Catch:{ Throwable -> 0x0037 }
                return
            L_0x0037:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_NGPS_ABLE"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
                return
            L_0x0040:
                android.os.Bundle r10 = r10.getData()     // Catch:{ Throwable -> 0x0052 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0052 }
                com.loc.cs r0 = r0.f25609d     // Catch:{ Throwable -> 0x0052 }
                if (r0 == 0) goto L_0x0051
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0052 }
                com.loc.cs r0 = r0.f25609d     // Catch:{ Throwable -> 0x0052 }
                r0.a((android.os.Bundle) r10)     // Catch:{ Throwable -> 0x0052 }
            L_0x0051:
                return
            L_0x0052:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_GPS_GEO_SUCCESS"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
                return
            L_0x005b:
                android.os.Bundle r10 = r10.getData()     // Catch:{ Throwable -> 0x0074 }
                java.lang.String r0 = "optBundle"
                com.loc.by r1 = com.loc.by.this     // Catch:{ Throwable -> 0x0074 }
                com.amap.api.location.AMapLocationClientOption r1 = r1.f25607b     // Catch:{ Throwable -> 0x0074 }
                android.os.Bundle r1 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r1)     // Catch:{ Throwable -> 0x0074 }
                r10.putBundle(r0, r1)     // Catch:{ Throwable -> 0x0074 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0074 }
                r1 = 10
                r0.a((int) r1, (android.os.Bundle) r10)     // Catch:{ Throwable -> 0x0074 }
                return
            L_0x0074:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_GPS_LOCATIONCHANGE"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
                return
            L_0x007d:
                return
            L_0x007e:
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x00c1 }
                java.lang.Object r10 = r10.obj     // Catch:{ Throwable -> 0x00b8 }
                com.amap.api.location.AMapLocation r10 = (com.amap.api.location.AMapLocation) r10     // Catch:{ Throwable -> 0x00b8 }
                boolean r5 = r0.h     // Catch:{ Throwable -> 0x00b8 }
                if (r5 == 0) goto L_0x00a1
                android.os.Messenger r5 = r0.j     // Catch:{ Throwable -> 0x00b8 }
                if (r5 == 0) goto L_0x00a1
                android.os.Bundle r5 = new android.os.Bundle     // Catch:{ Throwable -> 0x00b8 }
                r5.<init>()     // Catch:{ Throwable -> 0x00b8 }
                java.lang.String r6 = "optBundle"
                com.amap.api.location.AMapLocationClientOption r7 = r0.f25607b     // Catch:{ Throwable -> 0x00b8 }
                android.os.Bundle r7 = com.loc.ce.a((com.amap.api.location.AMapLocationClientOption) r7)     // Catch:{ Throwable -> 0x00b8 }
                r5.putBundle(r6, r7)     // Catch:{ Throwable -> 0x00b8 }
                r0.a((int) r2, (android.os.Bundle) r5)     // Catch:{ Throwable -> 0x00b8 }
                r0.h = r2     // Catch:{ Throwable -> 0x00b8 }
            L_0x00a1:
                r0.a((com.amap.api.location.AMapLocation) r10, (java.lang.Throwable) r1, (long) r3)     // Catch:{ Throwable -> 0x00b8 }
                boolean r10 = r0.n     // Catch:{ Throwable -> 0x00b8 }
                if (r10 == 0) goto L_0x00ac
                r10 = 7
                r0.a((int) r10, (android.os.Bundle) r1)     // Catch:{ Throwable -> 0x00b8 }
            L_0x00ac:
                r10 = 1025(0x401, float:1.436E-42)
                r0.a((int) r10)     // Catch:{ Throwable -> 0x00b8 }
                r2 = 300000(0x493e0, double:1.482197E-318)
                r0.a((int) r10, (java.lang.Object) r1, (long) r2)     // Catch:{ Throwable -> 0x00b8 }
                return
            L_0x00b8:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager"
                java.lang.String r1 = "resultGpsLocationSuccess"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x00c1 }
                return
            L_0x00c1:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_GPS_LOCATIONSUCCESS"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
                return
            L_0x00ca:
                android.os.Bundle r10 = r10.getData()     // Catch:{ Throwable -> 0x0135 }
                com.loc.by r0 = com.loc.by.this     // Catch:{ Throwable -> 0x0135 }
                if (r10 == 0) goto L_0x0117
                java.lang.Class<com.amap.api.location.AMapLocation> r5 = com.amap.api.location.AMapLocation.class
                java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Throwable -> 0x0115 }
                r10.setClassLoader(r5)     // Catch:{ Throwable -> 0x0115 }
                java.lang.String r5 = "loc"
                android.os.Parcelable r5 = r10.getParcelable(r5)     // Catch:{ Throwable -> 0x0115 }
                com.amap.api.location.AMapLocation r5 = (com.amap.api.location.AMapLocation) r5     // Catch:{ Throwable -> 0x0115 }
                java.lang.String r6 = "nb"
                java.lang.String r6 = r10.getString(r6)     // Catch:{ Throwable -> 0x0115 }
                r0.z = r6     // Catch:{ Throwable -> 0x0115 }
                java.lang.String r6 = "netUseTime"
                long r6 = r10.getLong(r6, r3)     // Catch:{ Throwable -> 0x0115 }
                if (r5 == 0) goto L_0x0113
                int r10 = r5.getErrorCode()     // Catch:{ Throwable -> 0x0110 }
                if (r10 != 0) goto L_0x0113
                com.loc.cs r10 = r0.f25609d     // Catch:{ Throwable -> 0x0110 }
                if (r10 == 0) goto L_0x0113
                com.loc.cs r10 = r0.f25609d     // Catch:{ Throwable -> 0x0110 }
                r10.z = r2     // Catch:{ Throwable -> 0x0110 }
                java.lang.String r10 = r5.getAdCode()     // Catch:{ Throwable -> 0x0110 }
                boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x0110 }
                if (r10 != 0) goto L_0x0113
                com.loc.cs r10 = r0.f25609d     // Catch:{ Throwable -> 0x0110 }
                r10.D = r5     // Catch:{ Throwable -> 0x0110 }
                goto L_0x0113
            L_0x0110:
                r10 = move-exception
                r3 = r6
                goto L_0x0127
            L_0x0113:
                r3 = r6
                goto L_0x0118
            L_0x0115:
                r10 = move-exception
                goto L_0x0127
            L_0x0117:
                r5 = r1
            L_0x0118:
                com.loc.cs r10 = r0.f25609d     // Catch:{ Throwable -> 0x0115 }
                if (r10 == 0) goto L_0x0125
                com.loc.cs r10 = r0.f25609d     // Catch:{ Throwable -> 0x0115 }
                java.lang.String r2 = r0.z     // Catch:{ Throwable -> 0x0115 }
                com.amap.api.location.AMapLocation r10 = r10.a((com.amap.api.location.AMapLocation) r5, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0115 }
                goto L_0x0131
            L_0x0125:
                r10 = r5
                goto L_0x0131
            L_0x0127:
                java.lang.String r2 = "AmapLocationManager"
                java.lang.String r5 = "resultLbsLocationSuccess"
                com.loc.ce.a(r10, r2, r5)     // Catch:{ Throwable -> 0x0135 }
                r8 = r1
                r1 = r10
                r10 = r8
            L_0x0131:
                r0.a((com.amap.api.location.AMapLocation) r10, (java.lang.Throwable) r1, (long) r3)     // Catch:{ Throwable -> 0x0135 }
                return
            L_0x0135:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_LBS_LOCATIONSUCCESS"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
                return
            L_0x013e:
                com.loc.by r10 = com.loc.by.this     // Catch:{ Throwable -> 0x01b3 }
                android.content.Context r0 = r10.f25606a     // Catch:{ Throwable -> 0x01a7 }
                java.lang.String r1 = "android.permission.SYSTEM_ALERT_WINDOW"
                int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch:{ Throwable -> 0x01a7 }
                r1 = 1
                if (r0 != 0) goto L_0x014d
                r0 = 1
                goto L_0x0157
            L_0x014d:
                android.content.Context r0 = r10.f25606a     // Catch:{ Throwable -> 0x01a7 }
                boolean r0 = r0 instanceof android.app.Activity     // Catch:{ Throwable -> 0x01a7 }
                if (r0 == 0) goto L_0x0155
                r0 = 0
                goto L_0x0157
            L_0x0155:
                r0 = 0
                r1 = 0
            L_0x0157:
                if (r1 == 0) goto L_0x01a3
                android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder     // Catch:{ Throwable -> 0x01a7 }
                android.content.Context r3 = r10.f25606a     // Catch:{ Throwable -> 0x01a7 }
                r1.<init>(r3)     // Catch:{ Throwable -> 0x01a7 }
                java.lang.String r3 = com.loc.cd.f25635b     // Catch:{ Throwable -> 0x01a7 }
                r1.setMessage(r3)     // Catch:{ Throwable -> 0x01a7 }
                java.lang.String r3 = ""
                java.lang.String r4 = com.loc.cd.b()     // Catch:{ Throwable -> 0x01a7 }
                boolean r3 = r3.equals(r4)     // Catch:{ Throwable -> 0x01a7 }
                if (r3 != 0) goto L_0x0183
                java.lang.String r3 = com.loc.cd.b()     // Catch:{ Throwable -> 0x01a7 }
                if (r3 == 0) goto L_0x0183
                java.lang.String r3 = com.loc.cd.b()     // Catch:{ Throwable -> 0x01a7 }
                com.loc.by$2 r4 = new com.loc.by$2     // Catch:{ Throwable -> 0x01a7 }
                r4.<init>()     // Catch:{ Throwable -> 0x01a7 }
                r1.setPositiveButton(r3, r4)     // Catch:{ Throwable -> 0x01a7 }
            L_0x0183:
                java.lang.String r3 = com.loc.cd.f25636c     // Catch:{ Throwable -> 0x01a7 }
                com.loc.by$3 r4 = new com.loc.by$3     // Catch:{ Throwable -> 0x01a7 }
                r4.<init>()     // Catch:{ Throwable -> 0x01a7 }
                r1.setNegativeButton(r3, r4)     // Catch:{ Throwable -> 0x01a7 }
                android.app.AlertDialog r1 = r1.create()     // Catch:{ Throwable -> 0x01a7 }
                if (r0 == 0) goto L_0x019c
                android.view.Window r0 = r1.getWindow()     // Catch:{ Throwable -> 0x01a7 }
                r3 = 2003(0x7d3, float:2.807E-42)
                r0.setType(r3)     // Catch:{ Throwable -> 0x01a7 }
            L_0x019c:
                r1.setCanceledOnTouchOutside(r2)     // Catch:{ Throwable -> 0x01a7 }
                r1.show()     // Catch:{ Throwable -> 0x01a7 }
                return
            L_0x01a3:
                r10.b()     // Catch:{ Throwable -> 0x01a7 }
                return
            L_0x01a7:
                r0 = move-exception
                r10.b()     // Catch:{ Throwable -> 0x01b3 }
                java.lang.String r10 = "AmapLocationManager"
                java.lang.String r1 = "showDialog"
                com.loc.ce.a(r0, r10, r1)     // Catch:{ Throwable -> 0x01b3 }
                return
            L_0x01b3:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$ActionHandler"
                java.lang.String r1 = "handleMessage RESULT_FASTSKY"
                com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x01bc }
            L_0x01bb:
                return
            L_0x01bc:
                r10 = move-exception
                java.lang.String r0 = "AmapLocationManager$MainHandler"
                java.lang.String r1 = "handleMessage"
                com.loc.ce.a(r10, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.by.c.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:2|3)|4|5|(1:7)(1:9)|8|(2:12|13)|18|(2:21|22)|25|(2:27|28)(1:29)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
        com.loc.ce.a(r4, "AmapLocationManager", "init 1");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x006d A[Catch:{ Throwable -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x007b A[Catch:{ Throwable -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public by(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            r3.<init>()
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r3.f25607b = r0
            r0 = 0
            r3.f25609d = r0
            r1 = 0
            r3.B = r1
            r3.C = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f25610e = r2
            r3.f25611f = r1
            r2 = 1
            r3.g = r2
            r3.h = r2
            r3.j = r0
            r3.k = r0
            r3.l = r0
            r3.m = r1
            r3.n = r2
            r3.o = r0
            r3.p = r1
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r3.q = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r3.r = r2
            r3.s = r0
            r3.t = r1
            r3.u = r0
            r3.D = r0
            r3.v = r0
            com.loc.by$1 r2 = new com.loc.by$1
            r2.<init>()
            r3.E = r2
            r3.w = r1
            r3.x = r1
            r3.y = r0
            r3.z = r0
            r3.A = r1
            r3.f25606a = r4
            r3.l = r5
            boolean r4 = com.loc.ce.c()
            if (r4 == 0) goto L_0x0067
            com.loc.dh r4 = com.loc.ce.b()     // Catch:{ Throwable -> 0x0067 }
            android.content.Context r5 = r3.f25606a     // Catch:{ Throwable -> 0x0067 }
            com.loc.ck.a((android.content.Context) r5, (com.loc.dh) r4)     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ Throwable -> 0x0081 }
            if (r4 != 0) goto L_0x007b
            com.loc.by$c r4 = new com.loc.by$c     // Catch:{ Throwable -> 0x0081 }
            android.content.Context r5 = r3.f25606a     // Catch:{ Throwable -> 0x0081 }
            android.os.Looper r5 = r5.getMainLooper()     // Catch:{ Throwable -> 0x0081 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0081 }
        L_0x0078:
            r3.f25608c = r4     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0089
        L_0x007b:
            com.loc.by$c r4 = new com.loc.by$c     // Catch:{ Throwable -> 0x0081 }
            r4.<init>()     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0078
        L_0x0081:
            r4 = move-exception
            java.lang.String r5 = "AmapLocationManager"
            java.lang.String r0 = "init 1"
            com.loc.ce.a(r4, r5, r0)
        L_0x0089:
            com.loc.cv r4 = new com.loc.cv     // Catch:{ Throwable -> 0x0093 }
            android.content.Context r5 = r3.f25606a     // Catch:{ Throwable -> 0x0093 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0093 }
            r3.i = r4     // Catch:{ Throwable -> 0x0093 }
            goto L_0x009b
        L_0x0093:
            r4 = move-exception
            java.lang.String r5 = "AmapLocationManager"
            java.lang.String r0 = "init 2"
            com.loc.ce.a(r4, r5, r0)     // Catch:{ Throwable -> 0x00bc }
        L_0x009b:
            com.loc.by$b r4 = new com.loc.by$b     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r5 = "amapLocManagerThread"
            r4.<init>(r5, r3)     // Catch:{ Throwable -> 0x00bc }
            r3.o = r4     // Catch:{ Throwable -> 0x00bc }
            com.loc.by$b r4 = r3.o     // Catch:{ Throwable -> 0x00bc }
            r5 = 5
            r4.setPriority(r5)     // Catch:{ Throwable -> 0x00bc }
            com.loc.by$b r4 = r3.o     // Catch:{ Throwable -> 0x00bc }
            r4.start()     // Catch:{ Throwable -> 0x00bc }
            com.loc.by$b r4 = r3.o     // Catch:{ Throwable -> 0x00bc }
            android.os.Looper r4 = r4.getLooper()     // Catch:{ Throwable -> 0x00bc }
            com.loc.by$a r4 = r3.a((android.os.Looper) r4)     // Catch:{ Throwable -> 0x00bc }
            r3.y = r4     // Catch:{ Throwable -> 0x00bc }
            goto L_0x00c4
        L_0x00bc:
            r4 = move-exception
            java.lang.String r5 = "AmapLocationManager"
            java.lang.String r0 = "init 5"
            com.loc.ce.a(r4, r5, r0)
        L_0x00c4:
            com.loc.cs r4 = new com.loc.cs     // Catch:{ Throwable -> 0x00d0 }
            android.content.Context r5 = r3.f25606a     // Catch:{ Throwable -> 0x00d0 }
            com.loc.by$c r0 = r3.f25608c     // Catch:{ Throwable -> 0x00d0 }
            r4.<init>(r5, r0)     // Catch:{ Throwable -> 0x00d0 }
            r3.f25609d = r4     // Catch:{ Throwable -> 0x00d0 }
            goto L_0x00d8
        L_0x00d0:
            r4 = move-exception
            java.lang.String r5 = "AmapLocationManager"
            java.lang.String r0 = "init 3"
            com.loc.ce.a(r4, r5, r0)
        L_0x00d8:
            com.loc.cj r4 = r3.s
            if (r4 != 0) goto L_0x00e3
            com.loc.cj r4 = new com.loc.cj
            r4.<init>()
            r3.s = r4
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.by.<init>(android.content.Context, android.content.Intent):void");
    }

    private a a(Looper looper) {
        a aVar;
        synchronized (this.r) {
            this.y = new a(looper);
            aVar = this.y;
        }
        return aVar;
    }

    private void a(AMapLocation aMapLocation) {
        try {
            if (aMapLocation.getErrorCode() != 0) {
                aMapLocation.setLocationType(0);
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                if ((latitude == 0.0d && longitude == 0.0d) || latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) {
                    cj.a("errorLatLng", aMapLocation.toStr());
                    aMapLocation.setLocationType(0);
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("LatLng is error#0802");
                }
            }
            if ("GPS".equalsIgnoreCase(aMapLocation.getProvider()) || !this.f25609d.b()) {
                aMapLocation.setAltitude(cn.b(aMapLocation.getAltitude()));
                aMapLocation.setBearing(cn.a(aMapLocation.getBearing()));
                aMapLocation.setSpeed(cn.a(aMapLocation.getSpeed()));
                Iterator<AMapLocationListener> it2 = this.f25610e.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onLocationChanged(aMapLocation);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void a(cm cmVar, AMapLocationServer aMapLocationServer) {
        if (aMapLocationServer != null) {
            try {
                if (aMapLocationServer.getErrorCode() == 0) {
                    cmVar.b(aMapLocationServer);
                }
            } catch (Throwable th) {
                ce.a(th, "AmapLocationManager", "apsLocation:doFirstAddCache");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        synchronized (this.r) {
            if (this.y != null) {
                this.y.removeMessages(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Throwable th) {
                boolean z2 = (th instanceof IllegalStateException) && th.getMessage().contains("sending message to a Handler on a dead thread");
                if ((th instanceof RemoteException) || z2) {
                    this.j = null;
                    this.B = false;
                }
                ce.a(th, "AmapLocationManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.v)) {
            this.v = ce.a(this.f25606a);
        }
        bundle.putString("c", this.v);
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.setData(bundle);
        obtain.replyTo = this.k;
        if (this.j != null) {
            this.j.send(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Object obj, long j2) {
        synchronized (this.r) {
            if (this.y != null) {
                Message obtain = Message.obtain();
                obtain.what = i2;
                if (obj instanceof Bundle) {
                    obtain.setData((Bundle) obj);
                } else {
                    obtain.obj = obj;
                }
                this.y.sendMessageDelayed(obtain, j2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Intent intent, boolean z2) {
        if (this.f25606a != null) {
            if (Build.VERSION.SDK_INT >= 26 && z2) {
                try {
                    this.f25606a.getClass().getMethod("startForegroundService", new Class[]{Intent.class}).invoke(this.f25606a, new Object[]{intent});
                } catch (Throwable unused) {
                }
                this.A = true;
            }
            this.f25606a.startService(intent);
            this.A = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        boolean z2 = false;
        int i2 = 0;
        do {
            try {
                if (this.j != null) {
                    break;
                }
                Thread.sleep(100);
                i2++;
            } catch (Throwable th) {
                ce.a(th, "AmapLocationManager", "checkAPSManager");
            }
        } while (i2 < 50);
        if (this.j == null) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            aMapLocation.setLocationDetail("请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1001");
            bundle.putParcelable("loc", aMapLocation);
            obtain.setData(bundle);
            obtain.what = 1;
            this.f25608c.sendMessage(obtain);
        } else {
            z2 = true;
        }
        if (!z2) {
            cj.a((String) null, 2101);
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.amap.api.location.AMapLocationClientOption r0 = r6.f25607b     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x000c
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption     // Catch:{ all -> 0x005b }
            r0.<init>()     // Catch:{ all -> 0x005b }
            r6.f25607b = r0     // Catch:{ all -> 0x005b }
        L_0x000c:
            boolean r0 = r6.C     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r6)
            return
        L_0x0012:
            r0 = 1
            r6.C = r0     // Catch:{ all -> 0x005b }
            int[] r0 = com.loc.by.AnonymousClass4.f25615a     // Catch:{ all -> 0x005b }
            com.amap.api.location.AMapLocationClientOption r1 = r6.f25607b     // Catch:{ all -> 0x005b }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r1.getLocationMode()     // Catch:{ all -> 0x005b }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x005b }
            r0 = r0[r1]     // Catch:{ all -> 0x005b }
            r1 = 1015(0x3f7, float:1.422E-42)
            r2 = 1016(0x3f8, float:1.424E-42)
            r3 = 0
            r5 = 0
            switch(r0) {
                case 1: goto L_0x004f;
                case 2: goto L_0x0047;
                case 3: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ all -> 0x005b }
        L_0x002d:
            goto L_0x0059
        L_0x002e:
            r6.a((int) r1, (java.lang.Object) r5, (long) r3)     // Catch:{ all -> 0x005b }
            com.amap.api.location.AMapLocationClientOption r0 = r6.f25607b     // Catch:{ all -> 0x005b }
            boolean r0 = r0.isGpsFirst()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0043
            com.amap.api.location.AMapLocationClientOption r0 = r6.f25607b     // Catch:{ all -> 0x005b }
            boolean r0 = r0.isOnceLocation()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0043
            r3 = 30000(0x7530, double:1.4822E-319)
        L_0x0043:
            r6.a((int) r2, (java.lang.Object) r5, (long) r3)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0047:
            r6.a((int) r2)     // Catch:{ all -> 0x005b }
            r6.a((int) r1, (java.lang.Object) r5, (long) r3)     // Catch:{ all -> 0x005b }
            monitor-exit(r6)
            return
        L_0x004f:
            r0 = 1017(0x3f9, float:1.425E-42)
            r6.a((int) r0, (java.lang.Object) r5, (long) r3)     // Catch:{ all -> 0x005b }
            r6.a((int) r2, (java.lang.Object) r5, (long) r3)     // Catch:{ all -> 0x005b }
            monitor-exit(r6)
            return
        L_0x0059:
            monitor-exit(r6)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.by.c():void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        try {
            a(1025);
            if (this.f25609d != null) {
                this.f25609d.a();
            }
            a(1016);
            this.C = false;
            this.m = 0;
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "stopLocation");
        }
    }

    public void disableBackgroundLocation(boolean z2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("j", z2);
            a(1024, (Object) bundle, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "disableBackgroundLocation");
        }
    }

    public void enableBackgroundLocation(int i2, Notification notification) {
        if (!(i2 == 0 || notification == null)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("i", i2);
                bundle.putParcelable("h", notification);
                a(1023, (Object) bundle, 0);
            } catch (Throwable th) {
                ce.a(th, "AmapLocationManager", "disableBackgroundLocation");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f25607b.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            long j2 = 1000;
            if (this.f25607b.getInterval() >= 1000) {
                j2 = this.f25607b.getInterval();
            }
            a(1016, (Object) null, j2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        try {
            if (this.k == null) {
                this.k = new Messenger(this.f25608c);
            }
            this.f25606a.bindService(h(), this.E, 1);
        } catch (Throwable unused) {
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            if (this.i != null) {
                return this.i.b();
            }
            return null;
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "getLastKnownLocation");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Intent h() {
        String str;
        if (this.l == null) {
            this.l = new Intent(this.f25606a, APSService.class);
        }
        try {
            str = !TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()) ? AMapLocationClientOption.getAPIKEY() : cy.f(this.f25606a);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "startServiceImpl p2");
            str = "";
        }
        this.l.putExtra("a", str);
        this.l.putExtra("b", cy.c(this.f25606a));
        this.l.putExtra("d", UmidtokenInfo.getUmidtoken());
        this.l.putExtra("f", AMapLocationClientOption.isDownloadCoordinateConvertLibrary());
        return this.l;
    }

    public boolean isStarted() {
        return this.B;
    }

    public void onDestroy() {
        try {
            if (this.D != null) {
                this.D.a();
                this.D = null;
            }
            a(1011, (Object) null, 0);
            this.p = true;
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "onDestroy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, (Object) aMapLocationListener, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "setLocationListener");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            a(1018, (Object) aMapLocationClientOption.clone(), 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "setLocationOption");
        }
    }

    public void startAssistantLocation() {
        try {
            a(1008, (Object) null, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "startAssistantLocation");
        }
    }

    public void startLocation() {
        try {
            a(1003, (Object) null, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "startLocation");
        }
    }

    public void stopAssistantLocation() {
        try {
            if (this.D != null) {
                this.D.a();
                this.D = null;
            }
            a(1009, (Object) null, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "stopAssistantLocation");
        }
    }

    public void stopLocation() {
        try {
            a((int) CrashModule.MODULE_ID, (Object) null, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "stopLocation");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            a(1005, (Object) aMapLocationListener, 0);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "unRegisterLocationListener");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b0, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01bc, code lost:
        if (r3 == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c0, code lost:
        if (com.loc.cj.g != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c2, code lost:
        com.loc.cj.g = new org.json.JSONArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c9, code lost:
        r3 = new org.json.JSONObject();
        r3.put("lon", com.loc.cn.c(r2.getLongitude()));
        r3.put("lat", com.loc.cn.c(r2.getLatitude()));
        r3.put("type", r4);
        r3.put("timestamp", com.loc.cn.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f6, code lost:
        if (r4 != 0) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f8, code lost:
        r4 = new org.json.JSONObject();
        r4.put("accuracy", com.loc.cn.b((double) r2.getAccuracy()));
        r4.put("altitude", com.loc.cn.b(r2.getAltitude()));
        r4.put("bearing", com.loc.cn.b((double) r2.getBearing()));
        r4.put("speed", com.loc.cn.b((double) r2.getSpeed()));
        r3.put("extension", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0239, code lost:
        r3 = com.loc.cj.g.put(r3);
        com.loc.cj.g = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0247, code lost:
        if (r3.length() < com.loc.cd.n) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0249, code lost:
        com.loc.cj.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r3.f25703c.isProviderEnabled("gps") == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        r8 = "3G";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r8 = "2G";
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0269 A[Catch:{ Throwable -> 0x0292, Throwable -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0279 A[Catch:{ Throwable -> 0x0292, Throwable -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x027a A[Catch:{ Throwable -> 0x0292, Throwable -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02a2 A[Catch:{ Throwable -> 0x0292, Throwable -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0113 A[Catch:{ Throwable -> 0x0292, Throwable -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012e A[Catch:{ Throwable -> 0x0196, Throwable -> 0x025d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.amap.api.location.AMapLocation r17, java.lang.Throwable r18, long r19) {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            boolean r2 = com.loc.ce.c()     // Catch:{ Throwable -> 0x02a9 }
            if (r2 == 0) goto L_0x0025
            if (r17 != 0) goto L_0x0025
            if (r18 == 0) goto L_0x001a
            android.content.Context r0 = r1.f25606a     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r3 = "loc"
            java.lang.String r2 = r18.getMessage()     // Catch:{ Throwable -> 0x02a9 }
            com.loc.ck.a(r0, r3, r2)     // Catch:{ Throwable -> 0x02a9 }
            monitor-exit(r16)
            return
        L_0x001a:
            android.content.Context r0 = r1.f25606a     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r2 = "loc"
            java.lang.String r3 = "amaplocation is null"
            com.loc.ck.a(r0, r2, r3)     // Catch:{ Throwable -> 0x02a9 }
            monitor-exit(r16)
            return
        L_0x0025:
            if (r17 != 0) goto L_0x003a
            com.amap.api.location.AMapLocation r0 = new com.amap.api.location.AMapLocation     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r2 = ""
            r0.<init>((java.lang.String) r2)     // Catch:{ Throwable -> 0x02a9 }
            r2 = 8
            r0.setErrorCode(r2)     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r2 = "amapLocation is null#0801"
            r0.setLocationDetail(r2)     // Catch:{ Throwable -> 0x02a9 }
            r2 = r0
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            java.lang.String r0 = "GPS"
            java.lang.String r3 = r2.getProvider()     // Catch:{ Throwable -> 0x02a9 }
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ Throwable -> 0x02a9 }
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "lbs"
            r2.setProvider(r0)     // Catch:{ Throwable -> 0x02a9 }
        L_0x004d:
            com.amap.api.location.AMapLocationQualityReport r0 = new com.amap.api.location.AMapLocationQualityReport     // Catch:{ Throwable -> 0x02a9 }
            r0.<init>()     // Catch:{ Throwable -> 0x02a9 }
            com.amap.api.location.AMapLocationClientOption r3 = r1.f25607b     // Catch:{ Throwable -> 0x02a9 }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r3 = r3.getLocationMode()     // Catch:{ Throwable -> 0x02a9 }
            r0.setLocationMode(r3)     // Catch:{ Throwable -> 0x02a9 }
            com.loc.cs r3 = r1.f25609d     // Catch:{ Throwable -> 0x02a9 }
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00aa
            com.loc.cs r3 = r1.f25609d     // Catch:{ Throwable -> 0x02a9 }
            int r3 = r3.B     // Catch:{ Throwable -> 0x02a9 }
            r0.setGPSSatellites(r3)     // Catch:{ Throwable -> 0x02a9 }
            com.loc.cs r3 = r1.f25609d     // Catch:{ Throwable -> 0x02a9 }
            android.location.LocationManager r8 = r3.f25703c     // Catch:{ Throwable -> 0x02a9 }
            if (r8 != 0) goto L_0x0072
        L_0x0070:
            r3 = 1
            goto L_0x00a7
        L_0x0072:
            android.location.LocationManager r8 = r3.f25703c     // Catch:{ Throwable -> 0x02a9 }
            boolean r8 = com.loc.cs.a((android.location.LocationManager) r8)     // Catch:{ Throwable -> 0x02a9 }
            if (r8 != 0) goto L_0x007b
            goto L_0x0070
        L_0x007b:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x02a9 }
            r9 = 19
            if (r8 >= r9) goto L_0x008d
            android.location.LocationManager r8 = r3.f25703c     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r9 = "gps"
            boolean r8 = r8.isProviderEnabled(r9)     // Catch:{ Throwable -> 0x02a9 }
            if (r8 != 0) goto L_0x00a0
        L_0x008b:
            r3 = 2
            goto L_0x00a7
        L_0x008d:
            android.content.Context r8 = r3.f25702b     // Catch:{ Throwable -> 0x02a9 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Throwable -> 0x02a9 }
            java.lang.String r9 = "location_mode"
            int r8 = android.provider.Settings.Secure.getInt(r8, r9, r6)     // Catch:{ Throwable -> 0x02a9 }
            if (r8 != 0) goto L_0x009c
            goto L_0x008b
        L_0x009c:
            if (r8 != r5) goto L_0x00a0
            r3 = 3
            goto L_0x00a7
        L_0x00a0:
            boolean r3 = r3.v     // Catch:{ Throwable -> 0x02a9 }
            if (r3 != 0) goto L_0x00a6
            r3 = 4
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            r0.setGpsStatus(r3)     // Catch:{ Throwable -> 0x02a9 }
        L_0x00aa:
            android.content.Context r3 = r1.f25606a     // Catch:{ Throwable -> 0x02a9 }
            boolean r3 = com.loc.cn.g((android.content.Context) r3)     // Catch:{ Throwable -> 0x02a9 }
            r0.setWifiAble(r3)     // Catch:{ Throwable -> 0x02a9 }
            android.content.Context r3 = r1.f25606a     // Catch:{ Throwable -> 0x02a9 }
            android.net.NetworkInfo r3 = com.loc.cn.c((android.content.Context) r3)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 == 0) goto L_0x0106
            boolean r8 = r3.isConnectedOrConnecting()     // Catch:{ Throwable -> 0x02a9 }
            if (r8 != 0) goto L_0x00c2
            goto L_0x0106
        L_0x00c2:
            java.lang.String r8 = "UNKNOWN"
            int r9 = r3.getType()     // Catch:{ Throwable -> 0x02a9 }
            if (r9 != r7) goto L_0x00cd
            java.lang.String r8 = "WIFI"
            goto L_0x0108
        L_0x00cd:
            if (r9 != 0) goto L_0x0108
            java.lang.String r8 = r3.getSubtypeName()     // Catch:{ Throwable -> 0x02a9 }
            int r3 = r3.getSubtype()     // Catch:{ Throwable -> 0x02a9 }
            switch(r3) {
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00e3;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00e0;
                case 15: goto L_0x00e0;
                case 16: goto L_0x00e3;
                case 17: goto L_0x00e0;
                default: goto L_0x00da;
            }     // Catch:{ Throwable -> 0x02a9 }
        L_0x00da:
            java.lang.String r3 = "GSM"
            goto L_0x00e6
        L_0x00dd:
            java.lang.String r8 = "4G"
            goto L_0x0108
        L_0x00e0:
            java.lang.String r8 = "3G"
            goto L_0x0108
        L_0x00e3:
            java.lang.String r8 = "2G"
            goto L_0x0108
        L_0x00e6:
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 == 0) goto L_0x00ed
            goto L_0x00e3
        L_0x00ed:
            java.lang.String r3 = "TD-SCDMA"
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 != 0) goto L_0x00e0
            java.lang.String r3 = "WCDMA"
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 != 0) goto L_0x00e0
            java.lang.String r3 = "CDMA2000"
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 == 0) goto L_0x0108
            goto L_0x00e0
        L_0x0106:
            java.lang.String r8 = "DISCONNECTED"
        L_0x0108:
            r0.setNetworkType(r8)     // Catch:{ Throwable -> 0x02a9 }
            int r3 = r2.getLocationType()     // Catch:{ Throwable -> 0x02a9 }
            r8 = 0
            if (r3 == r7) goto L_0x0123
            java.lang.String r3 = "gps"
            java.lang.String r10 = r2.getProvider()     // Catch:{ Throwable -> 0x02a9 }
            boolean r3 = r3.equalsIgnoreCase(r10)     // Catch:{ Throwable -> 0x02a9 }
            if (r3 == 0) goto L_0x0120
            goto L_0x0123
        L_0x0120:
            r10 = r19
            goto L_0x0124
        L_0x0123:
            r10 = r8
        L_0x0124:
            r0.setNetUseTime(r10)     // Catch:{ Throwable -> 0x02a9 }
            r2.setLocationQualityReport(r0)     // Catch:{ Throwable -> 0x02a9 }
            boolean r0 = r1.C     // Catch:{ Throwable -> 0x025d }
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r1.z     // Catch:{ Throwable -> 0x025d }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Throwable -> 0x025d }
            r3.<init>()     // Catch:{ Throwable -> 0x025d }
            java.lang.String r10 = "loc"
            r3.putParcelable(r10, r2)     // Catch:{ Throwable -> 0x025d }
            java.lang.String r10 = "lastLocNb"
            r3.putString(r10, r0)     // Catch:{ Throwable -> 0x025d }
            r0 = 1014(0x3f6, float:1.421E-42)
            r1.a((int) r0, (java.lang.Object) r3, (long) r8)     // Catch:{ Throwable -> 0x025d }
            android.content.Context r10 = r1.f25606a     // Catch:{ Throwable -> 0x025d }
            if (r2 == 0) goto L_0x019e
            java.lang.String r0 = "GPS"
            java.lang.String r3 = r2.getProvider()     // Catch:{ Throwable -> 0x0196 }
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ Throwable -> 0x0196 }
            if (r0 != 0) goto L_0x019e
            int r0 = r2.getLocationType()     // Catch:{ Throwable -> 0x0196 }
            if (r0 != r7) goto L_0x015b
            goto L_0x019e
        L_0x015b:
            java.lang.String r0 = "domestic"
            boolean r3 = com.loc.cj.a((com.amap.api.location.AMapLocation) r2)     // Catch:{ Throwable -> 0x0196 }
            if (r3 == 0) goto L_0x0165
            java.lang.String r0 = "abroad"
        L_0x0165:
            r13 = r0
            int r0 = r2.getErrorCode()     // Catch:{ Throwable -> 0x0196 }
            if (r0 == 0) goto L_0x017f
            int r0 = r2.getErrorCode()     // Catch:{ Throwable -> 0x0196 }
            r3 = 11
            if (r0 == r3) goto L_0x017c
            switch(r0) {
                case 4: goto L_0x017c;
                case 5: goto L_0x017c;
                case 6: goto L_0x017c;
                default: goto L_0x0177;
            }     // Catch:{ Throwable -> 0x0196 }
        L_0x0177:
            java.lang.String r0 = "cache"
        L_0x0179:
            r12 = r0
            r14 = 0
            goto L_0x018d
        L_0x017c:
            java.lang.String r0 = "net"
            goto L_0x0179
        L_0x017f:
            int r0 = r2.getLocationType()     // Catch:{ Throwable -> 0x0196 }
            switch(r0) {
                case 5: goto L_0x0189;
                case 6: goto L_0x0189;
                default: goto L_0x0186;
            }     // Catch:{ Throwable -> 0x0196 }
        L_0x0186:
            java.lang.String r0 = "cache"
            goto L_0x018b
        L_0x0189:
            java.lang.String r0 = "net"
        L_0x018b:
            r12 = r0
            r14 = 1
        L_0x018d:
            java.lang.String r11 = "O016"
            r15 = 2147483647(0x7fffffff, float:NaN)
            com.loc.cj.a(r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0196 }
            goto L_0x019e
        L_0x0196:
            r0 = move-exception
            java.lang.String r3 = "ReportUtil"
            java.lang.String r8 = "reportBatting"
            com.loc.ce.a(r0, r3, r8)     // Catch:{ Throwable -> 0x025d }
        L_0x019e:
            android.content.Context r0 = r1.f25606a     // Catch:{ Throwable -> 0x025d }
            boolean r3 = com.loc.cn.a((com.amap.api.location.AMapLocation) r2)     // Catch:{ Throwable -> 0x024d }
            if (r3 != 0) goto L_0x01a8
            goto L_0x0255
        L_0x01a8:
            int r3 = r2.getLocationType()     // Catch:{ Throwable -> 0x024d }
            switch(r3) {
                case 1: goto L_0x01ba;
                case 2: goto L_0x01b7;
                case 3: goto L_0x01af;
                case 4: goto L_0x01b7;
                case 5: goto L_0x01af;
                case 6: goto L_0x01af;
                case 7: goto L_0x01af;
                case 8: goto L_0x01b5;
                case 9: goto L_0x01b2;
                default: goto L_0x01af;
            }     // Catch:{ Throwable -> 0x024d }
        L_0x01af:
            r3 = 0
        L_0x01b0:
            r4 = 0
            goto L_0x01bc
        L_0x01b2:
            r3 = 1
            r4 = 2
            goto L_0x01bc
        L_0x01b5:
            r3 = 1
            goto L_0x01bc
        L_0x01b7:
            r3 = 1
            r4 = 1
            goto L_0x01bc
        L_0x01ba:
            r3 = 1
            goto L_0x01b0
        L_0x01bc:
            if (r3 == 0) goto L_0x0255
            org.json.JSONArray r3 = com.loc.cj.g     // Catch:{ Throwable -> 0x024d }
            if (r3 != 0) goto L_0x01c9
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Throwable -> 0x024d }
            r3.<init>()     // Catch:{ Throwable -> 0x024d }
            com.loc.cj.g = r3     // Catch:{ Throwable -> 0x024d }
        L_0x01c9:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x024d }
            r3.<init>()     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "lon"
            double r8 = r2.getLongitude()     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.c((double) r8)     // Catch:{ Throwable -> 0x024d }
            r3.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "lat"
            double r8 = r2.getLatitude()     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.c((double) r8)     // Catch:{ Throwable -> 0x024d }
            r3.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "type"
            r3.put(r5, r4)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "timestamp"
            long r8 = com.loc.cn.a()     // Catch:{ Throwable -> 0x024d }
            r3.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            if (r4 != 0) goto L_0x0239
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x024d }
            r4.<init>()     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "accuracy"
            float r8 = r2.getAccuracy()     // Catch:{ Throwable -> 0x024d }
            double r8 = (double) r8     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.b((double) r8)     // Catch:{ Throwable -> 0x024d }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "altitude"
            double r8 = r2.getAltitude()     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.b((double) r8)     // Catch:{ Throwable -> 0x024d }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "bearing"
            float r8 = r2.getBearing()     // Catch:{ Throwable -> 0x024d }
            double r8 = (double) r8     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.b((double) r8)     // Catch:{ Throwable -> 0x024d }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "speed"
            float r8 = r2.getSpeed()     // Catch:{ Throwable -> 0x024d }
            double r8 = (double) r8     // Catch:{ Throwable -> 0x024d }
            double r8 = com.loc.cn.b((double) r8)     // Catch:{ Throwable -> 0x024d }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x024d }
            java.lang.String r5 = "extension"
            r3.put(r5, r4)     // Catch:{ Throwable -> 0x024d }
        L_0x0239:
            org.json.JSONArray r4 = com.loc.cj.g     // Catch:{ Throwable -> 0x024d }
            org.json.JSONArray r3 = r4.put(r3)     // Catch:{ Throwable -> 0x024d }
            com.loc.cj.g = r3     // Catch:{ Throwable -> 0x024d }
            int r3 = r3.length()     // Catch:{ Throwable -> 0x024d }
            int r4 = com.loc.cd.n     // Catch:{ Throwable -> 0x024d }
            if (r3 < r4) goto L_0x0255
            com.loc.cj.e(r0)     // Catch:{ Throwable -> 0x024d }
            goto L_0x0255
        L_0x024d:
            r0 = move-exception
            java.lang.String r3 = "ReportUtil"
            java.lang.String r4 = "recordOfflineLocLog"
            com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x025d }
        L_0x0255:
            com.amap.api.location.AMapLocation r0 = r2.clone()     // Catch:{ Throwable -> 0x025d }
            r1.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x025d }
            goto L_0x0265
        L_0x025d:
            r0 = move-exception
            java.lang.String r2 = "AmapLocationManager"
            java.lang.String r3 = "handlerLocation part2"
            com.loc.ce.a(r0, r2, r3)     // Catch:{ Throwable -> 0x02a9 }
        L_0x0265:
            boolean r0 = r1.p     // Catch:{ Throwable -> 0x02a9 }
            if (r0 == 0) goto L_0x0271
            boolean r0 = com.loc.ce.c()     // Catch:{ Throwable -> 0x02a9 }
            if (r0 != 0) goto L_0x0271
            monitor-exit(r16)
            return
        L_0x0271:
            android.content.Context r0 = r1.f25606a     // Catch:{ Throwable -> 0x02a9 }
            boolean r2 = com.loc.ck.a(r0)     // Catch:{ Throwable -> 0x0292 }
            if (r2 != 0) goto L_0x027a
            goto L_0x029a
        L_0x027a:
            boolean r2 = com.loc.ck.f25668b     // Catch:{ Throwable -> 0x0292 }
            if (r2 == 0) goto L_0x027f
            goto L_0x029a
        L_0x027f:
            java.lang.String r2 = "loc"
            java.lang.String r3 = "endMark"
            int r2 = com.loc.cl.b((android.content.Context) r0, (java.lang.String) r2, (java.lang.String) r3, (int) r6)     // Catch:{ Throwable -> 0x0292 }
            java.lang.String r3 = "loc"
            java.lang.String r4 = "endMark"
            int r2 = r2 + r7
            com.loc.cl.a((android.content.Context) r0, (java.lang.String) r3, (java.lang.String) r4, (int) r2)     // Catch:{ Throwable -> 0x0292 }
            com.loc.ck.f25668b = r7     // Catch:{ Throwable -> 0x0292 }
            goto L_0x029a
        L_0x0292:
            r0 = move-exception
            java.lang.String r2 = "RollBackDynamic"
            java.lang.String r3 = "AddEndMark"
            com.loc.ce.a(r0, r2, r3)     // Catch:{ Throwable -> 0x02a9 }
        L_0x029a:
            com.amap.api.location.AMapLocationClientOption r0 = r1.f25607b     // Catch:{ Throwable -> 0x02a9 }
            boolean r0 = r0.isOnceLocation()     // Catch:{ Throwable -> 0x02a9 }
            if (r0 == 0) goto L_0x02a5
            r16.d()     // Catch:{ Throwable -> 0x02a9 }
        L_0x02a5:
            monitor-exit(r16)
            return
        L_0x02a7:
            r0 = move-exception
            goto L_0x02b3
        L_0x02a9:
            r0 = move-exception
            java.lang.String r2 = "AmapLocationManager"
            java.lang.String r3 = "handlerLocation part3"
            com.loc.ce.a(r0, r2, r3)     // Catch:{ all -> 0x02a7 }
            monitor-exit(r16)
            return
        L_0x02b3:
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.by.a(com.amap.api.location.AMapLocation, java.lang.Throwable, long):void");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.autonavi.minimap", cd.f25639f));
            intent.setFlags(268435456);
            intent.setData(Uri.parse(cd.f25637d));
            this.f25606a.startActivity(intent);
        } catch (Throwable th) {
            ce.a(th, "AmapLocationManager", "callAMap part2");
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        a(12, (Bundle) null);
        this.g = true;
        this.h = true;
        this.B = false;
        this.t = false;
        d();
        if (this.s != null) {
            cj cjVar = this.s;
            Context context = this.f25606a;
            try {
                long b2 = cn.b() - cjVar.f25662c;
                if (cjVar.f25661b != -1) {
                    cjVar.f25660a.append(cjVar.f25661b, Long.valueOf(b2 + cjVar.f25660a.get(cjVar.f25661b, 0L).longValue()));
                }
                long b3 = cn.b() - cjVar.f25665f;
                if (cjVar.f25664e != -1) {
                    cjVar.f25660a.append(cjVar.f25664e, Long.valueOf(b3 + cjVar.f25660a.get(cjVar.f25664e, 0L).longValue()));
                }
                for (int i2 = 0; i2 < cjVar.f25663d.length; i2++) {
                    long longValue = cjVar.f25660a.get(i2, 0L).longValue();
                    if (longValue > 0 && longValue > cl.b(context, "pref", cjVar.f25663d[i2], 0)) {
                        cl.a(context, "pref", cjVar.f25663d[i2], longValue);
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "saveLocationTypeAndMode");
            }
        }
        cj.a(this.f25606a);
        if (this.u != null) {
            this.u.k.sendEmptyMessage(11);
        } else if (this.E != null) {
            this.f25606a.unbindService(this.E);
        }
        try {
            if (this.A) {
                this.f25606a.stopService(h());
            }
        } catch (Throwable unused) {
        }
        this.A = false;
        if (this.f25610e != null) {
            this.f25610e.clear();
            this.f25610e = null;
        }
        this.E = null;
        synchronized (this.r) {
            if (this.y != null) {
                this.y.removeCallbacksAndMessages(null);
            }
            this.y = null;
        }
        if (this.o != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    ch.a((Object) this.o, HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused2) {
                }
            }
            this.o.quit();
        }
        this.o = null;
        if (this.f25608c != null) {
            this.f25608c.removeCallbacksAndMessages(null);
        }
        if (this.i != null) {
            this.i.c();
            this.i = null;
        }
    }

    private AMapLocationServer b(cm cmVar) {
        if (this.f25607b.isLocationCacheEnable()) {
            try {
                if (cmVar.f25676c.i) {
                    return cm.a(15, "networkLocation has been mocked!#1502");
                }
                if (TextUtils.isEmpty(cmVar.x)) {
                    return cm.a(cmVar.B, cmVar.p.toString());
                }
                AMapLocationServer a2 = cmVar.f25678e.a(cmVar.f25674a, cmVar.x, cmVar.y, true);
                if (cn.a(a2)) {
                    cmVar.a(a2);
                }
                return a2;
            } catch (Throwable th) {
                ce.a(th, "AmapLocationManager", "doFirstCacheLoc");
            }
        }
        return null;
    }

    public void startAssistantLocation(WebView webView) {
        if (this.D == null) {
            this.D = new ct(this.f25606a, webView);
        }
        ct ctVar = this.D;
        if (ctVar.f25712d != null && ctVar.f25710b != null && Build.VERSION.SDK_INT >= 17 && !ctVar.g) {
            try {
                ctVar.f25712d.getSettings().setJavaScriptEnabled(true);
                ctVar.f25712d.addJavascriptInterface(ctVar, "AMapAndroidLoc");
                if (!TextUtils.isEmpty(ctVar.f25712d.getUrl())) {
                    ctVar.f25712d.reload();
                }
                if (ctVar.f25711c == null) {
                    ctVar.f25711c = new AMapLocationClient(ctVar.f25710b);
                    ctVar.f25711c.setLocationListener(ctVar.h);
                }
                ctVar.g = true;
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ void b(by byVar) {
        cj cjVar;
        Context context;
        int i2;
        int i3;
        cs csVar = byVar.f25609d;
        AMapLocationClientOption aMapLocationClientOption = byVar.f25607b;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        csVar.f25704d = aMapLocationClientOption;
        if (!(csVar.f25704d.getLocationMode() == AMapLocationClientOption.AMapLocationMode.Device_Sensors || csVar.f25701a == null)) {
            csVar.f25701a.removeMessages(8);
        }
        if (csVar.u != csVar.f25704d.getGeoLanguage()) {
            synchronized (csVar.r) {
                csVar.D = null;
            }
        }
        csVar.u = csVar.f25704d.getGeoLanguage();
        if (byVar.C && !byVar.f25607b.getLocationMode().equals(byVar.q)) {
            byVar.d();
            byVar.c();
        }
        byVar.q = byVar.f25607b.getLocationMode();
        if (byVar.s != null) {
            if (byVar.f25607b.isOnceLocation()) {
                cjVar = byVar.s;
                context = byVar.f25606a;
                i2 = 0;
            } else {
                cjVar = byVar.s;
                context = byVar.f25606a;
                i2 = 1;
            }
            cjVar.a(context, i2);
            cj cjVar2 = byVar.s;
            Context context2 = byVar.f25606a;
            try {
                switch (cj.AnonymousClass1.f25666a[byVar.f25607b.getLocationMode().ordinal()]) {
                    case 1:
                        i3 = 4;
                        break;
                    case 2:
                        i3 = 5;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    default:
                        i3 = -1;
                        break;
                }
                if (cjVar2.f25664e != i3) {
                    if (!(cjVar2.f25664e == -1 || cjVar2.f25664e == i3)) {
                        cjVar2.f25660a.append(cjVar2.f25664e, Long.valueOf((cn.b() - cjVar2.f25665f) + cjVar2.f25660a.get(cjVar2.f25664e, 0L).longValue()));
                    }
                    cjVar2.f25665f = cn.b() - cl.b(context2, "pref", cjVar2.f25663d[i3], 0);
                    cjVar2.f25664e = i3;
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "setLocationMode");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[Catch:{ Throwable -> 0x00a8, Throwable -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b8 A[Catch:{ Throwable -> 0x00da }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.autonavi.aps.amapapi.model.AMapLocationServer a(com.loc.cm r13) {
        /*
            r12 = this;
            r0 = 0
            com.loc.ci r1 = new com.loc.ci     // Catch:{ Throwable -> 0x0106 }
            r1.<init>()     // Catch:{ Throwable -> 0x0106 }
            r2 = 0
            long r3 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0106 }
            r1.f25657a = r3     // Catch:{ Throwable -> 0x0106 }
            java.lang.String r3 = com.amap.api.location.AMapLocationClientOption.getAPIKEY()     // Catch:{ Throwable -> 0x001d }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x001d }
            if (r4 != 0) goto L_0x0025
            android.content.Context r4 = r12.f25606a     // Catch:{ Throwable -> 0x001d }
            com.loc.cz.a((android.content.Context) r4, (java.lang.String) r3)     // Catch:{ Throwable -> 0x001d }
            goto L_0x0025
        L_0x001d:
            r3 = move-exception
            java.lang.String r4 = "AmapLocationManager"
            java.lang.String r5 = "apsLocation setAuthKey"
            com.loc.ce.a(r3, r4, r5)     // Catch:{ Throwable -> 0x0106 }
        L_0x0025:
            java.lang.String r3 = com.amap.api.location.UmidtokenInfo.getUmidtoken()     // Catch:{ Throwable -> 0x0033 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0033 }
            if (r4 != 0) goto L_0x003b
            com.loc.dc.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x0033 }
            goto L_0x003b
        L_0x0033:
            r3 = move-exception
            java.lang.String r4 = "AmapLocationManager"
            java.lang.String r5 = "apsLocation setUmidToken"
            com.loc.ce.a(r3, r4, r5)     // Catch:{ Throwable -> 0x0106 }
        L_0x003b:
            android.content.Context r3 = r12.f25606a     // Catch:{ Throwable -> 0x0049 }
            r13.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0049 }
            com.amap.api.location.AMapLocationClientOption r3 = r12.f25607b     // Catch:{ Throwable -> 0x0049 }
            r13.a((com.amap.api.location.AMapLocationClientOption) r3)     // Catch:{ Throwable -> 0x0049 }
            r13.g()     // Catch:{ Throwable -> 0x0049 }
            goto L_0x0051
        L_0x0049:
            r3 = move-exception
            java.lang.String r4 = "AmapLocationManager"
            java.lang.String r5 = "initApsBase"
            com.loc.ce.a(r3, r4, r5)     // Catch:{ Throwable -> 0x0106 }
        L_0x0051:
            r3 = 0
            boolean r5 = com.loc.cd.F     // Catch:{ Throwable -> 0x0106 }
            com.autonavi.aps.amapapi.model.AMapLocationServer r6 = r12.b((com.loc.cm) r13)     // Catch:{ Throwable -> 0x0106 }
            r7 = 1
            if (r6 != 0) goto L_0x007f
            r2 = r5 ^ 1
            com.autonavi.aps.amapapi.model.AMapLocationServer r2 = r13.a((boolean) r2)     // Catch:{ Throwable -> 0x0073 }
            if (r2 == 0) goto L_0x006c
            long r8 = r2.k()     // Catch:{ Throwable -> 0x006a }
            r3 = r8
            goto L_0x006c
        L_0x006a:
            r6 = move-exception
            goto L_0x0077
        L_0x006c:
            if (r5 != 0) goto L_0x0071
            a((com.loc.cm) r13, (com.autonavi.aps.amapapi.model.AMapLocationServer) r2)     // Catch:{ Throwable -> 0x006a }
        L_0x0071:
            r6 = 1
            goto L_0x0081
        L_0x0073:
            r2 = move-exception
            r11 = r6
            r6 = r2
            r2 = r11
        L_0x0077:
            java.lang.String r8 = "AmapLocationManager"
            java.lang.String r9 = "apsLocation:doFirstNetLocate"
            com.loc.ce.a(r6, r8, r9)     // Catch:{ Throwable -> 0x0102 }
            goto L_0x0071
        L_0x007f:
            r2 = r6
            r6 = 0
        L_0x0081:
            long r8 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0102 }
            r1.f25658b = r8     // Catch:{ Throwable -> 0x0102 }
            r1.f25659c = r2     // Catch:{ Throwable -> 0x0102 }
            if (r2 == 0) goto L_0x008f
            java.lang.String r0 = r2.l()     // Catch:{ Throwable -> 0x0102 }
        L_0x008f:
            com.amap.api.location.AMapLocationClientOption r8 = r12.f25607b     // Catch:{ Throwable -> 0x00a8 }
            boolean r8 = r8.isLocationCacheEnable()     // Catch:{ Throwable -> 0x00a8 }
            if (r8 == 0) goto L_0x00b0
            com.loc.cv r8 = r12.i     // Catch:{ Throwable -> 0x00a8 }
            if (r8 == 0) goto L_0x00b0
            com.loc.cv r8 = r12.i     // Catch:{ Throwable -> 0x00a8 }
            com.amap.api.location.AMapLocationClientOption r9 = r12.f25607b     // Catch:{ Throwable -> 0x00a8 }
            long r9 = r9.getLastLocationLifeCycle()     // Catch:{ Throwable -> 0x00a8 }
            com.amap.api.location.AMapLocation r0 = r8.a(r2, r0, r9)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00b1
        L_0x00a8:
            r0 = move-exception
            java.lang.String r8 = "AmapLocationManager"
            java.lang.String r9 = "fixLastLocation"
            com.loc.ce.a(r0, r8, r9)     // Catch:{ Throwable -> 0x0102 }
        L_0x00b0:
            r0 = r2
        L_0x00b1:
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ Throwable -> 0x00da }
            r8.<init>()     // Catch:{ Throwable -> 0x00da }
            if (r2 == 0) goto L_0x00cb
            java.lang.String r9 = "loc"
            r8.putParcelable(r9, r0)     // Catch:{ Throwable -> 0x00da }
            java.lang.String r0 = "nb"
            java.lang.String r9 = r2.l()     // Catch:{ Throwable -> 0x00da }
            r8.putString(r0, r9)     // Catch:{ Throwable -> 0x00da }
            java.lang.String r0 = "netUseTime"
            r8.putLong(r0, r3)     // Catch:{ Throwable -> 0x00da }
        L_0x00cb:
            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Throwable -> 0x00da }
            r0.setData(r8)     // Catch:{ Throwable -> 0x00da }
            r0.what = r7     // Catch:{ Throwable -> 0x00da }
            com.loc.by$c r3 = r12.f25608c     // Catch:{ Throwable -> 0x00da }
            r3.sendMessage(r0)     // Catch:{ Throwable -> 0x00da }
            goto L_0x00e2
        L_0x00da:
            r0 = move-exception
            java.lang.String r3 = "AmapLocationManager"
            java.lang.String r4 = "apsLocation:callback"
            com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x0102 }
        L_0x00e2:
            android.content.Context r0 = r12.f25606a     // Catch:{ Throwable -> 0x0102 }
            com.loc.cj.a((android.content.Context) r0, (com.loc.ci) r1)     // Catch:{ Throwable -> 0x0102 }
            if (r6 == 0) goto L_0x00fe
            if (r5 == 0) goto L_0x00fe
            r13.c()     // Catch:{ Throwable -> 0x00f6 }
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.a((boolean) r7)     // Catch:{ Throwable -> 0x00f6 }
            a((com.loc.cm) r13, (com.autonavi.aps.amapapi.model.AMapLocationServer) r0)     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            r0 = move-exception
            java.lang.String r1 = "AmapLocationManager"
            java.lang.String r3 = "apsLocation:doFirstNetLocate 2"
            com.loc.ce.a(r0, r1, r3)     // Catch:{ Throwable -> 0x0102 }
        L_0x00fe:
            r13.f()     // Catch:{ Throwable -> 0x0111 }
            goto L_0x0111
        L_0x0102:
            r0 = move-exception
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            goto L_0x0112
        L_0x0106:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0109:
            java.lang.String r1 = "AmapLocationManager"
            java.lang.String r3 = "apsLocation"
            com.loc.ce.a(r0, r1, r3)     // Catch:{ all -> 0x0104 }
            goto L_0x00fe
        L_0x0111:
            return r2
        L_0x0112:
            r13.f()     // Catch:{ Throwable -> 0x0115 }
        L_0x0115:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.by.a(com.loc.cm):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }
}
