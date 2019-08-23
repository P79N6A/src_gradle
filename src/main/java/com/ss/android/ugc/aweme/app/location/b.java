package com.ss.android.ugc.aweme.app.location;

import android.content.Context;
import android.location.Address;
import android.support.annotation.Nullable;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.utils.permission.f;

public final class b implements BDLocationClient.Callback, af.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34200a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34201b;

    /* renamed from: c  reason: collision with root package name */
    private BDLocation f34202c;

    /* renamed from: d  reason: collision with root package name */
    private BDLocationClient f34203d;

    /* renamed from: e  reason: collision with root package name */
    private af f34204e;

    /* renamed from: f  reason: collision with root package name */
    private int f34205f;

    public final void a(boolean z) {
    }

    public final Address f() {
        return null;
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void onError(BDLocationException bDLocationException) {
    }

    private PoiSetting a() {
        if (PatchProxy.isSupport(new Object[0], this, f34200a, false, 23554, new Class[0], PoiSetting.class)) {
            return (PoiSetting) PatchProxy.accessDispatch(new Object[0], this, f34200a, false, 23554, new Class[0], PoiSetting.class);
        }
        try {
            return g.b().aq();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f34200a, false, 23556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34200a, false, 23556, new Class[0], Void.TYPE);
            return;
        }
        b(false);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f34200a, false, 23558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34200a, false, 23558, new Class[0], Void.TYPE);
            return;
        }
        b(true);
    }

    public final a g() {
        if (PatchProxy.isSupport(new Object[0], this, f34200a, false, 23557, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f34200a, false, 23557, new Class[0], a.class);
        } else if (af.b(this.f34201b) || this.f34202c == null) {
            return null;
        } else {
            a aVar = new a();
            aVar.isGaode = true;
            aVar.latitude = this.f34202c.getLatitude();
            aVar.longitude = this.f34202c.getLongitude();
            aVar.country = this.f34202c.getCountry();
            aVar.province = this.f34202c.getAdministrativeArea();
            aVar.city = this.f34202c.getCity();
            aVar.district = this.f34202c.getDistrict();
            aVar.address = this.f34202c.getAddress();
            aVar.time = this.f34202c.getLocationMs();
            return aVar;
        }
    }

    public final void onLocationChanged(@Nullable BDLocation bDLocation) {
        if (PatchProxy.isSupport(new Object[]{bDLocation}, this, f34200a, false, 23559, new Class[]{BDLocation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bDLocation}, this, f34200a, false, 23559, new Class[]{BDLocation.class}, Void.TYPE);
            return;
        }
        if (bDLocation != null && !bDLocation.isEmpty()) {
            this.f34202c = bDLocation;
            this.f34204e.c();
        }
    }

    private void b(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34200a, false, 23560, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34200a, false, 23560, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f34203d != null) {
            if (!f.a() || !af.b(this.f34201b)) {
                if (z) {
                    this.f34203d.setMaxCacheTime(0);
                } else if (!c.a()) {
                    if (this.f34205f == 0) {
                        try {
                            i = g.b().aq().getLocationUpdateInterval().intValue();
                        } catch (com.bytedance.ies.a unused) {
                            i = 0;
                        }
                        if (i <= 0) {
                            i = 7200;
                        }
                        this.f34205f = i;
                    }
                    this.f34203d.setMaxCacheTime((long) (this.f34205f * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                } else {
                    this.f34203d.setMaxCacheTime(600000);
                }
                this.f34203d.getLocation(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[SYNTHETIC, Splitter:B:22:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r11, com.ss.android.ugc.aweme.app.af r12) {
        /*
            r10 = this;
            r10.<init>()
            r10.f34204e = r12
            r10.f34201b = r11
            com.ss.android.ugc.aweme.app.af r0 = r10.f34204e
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.app.k r7 = com.ss.android.ugc.aweme.app.k.a()
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f34200a
            r3 = 0
            r4 = 23555(0x5c03, float:3.3008E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0044
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f34200a
            r3 = 0
            r4 = 23555(0x5c03, float:3.3008E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00db
        L_0x0044:
            com.bytedance.bdlocation.client.BDLocationConfig.init(r7)
            java.lang.String r0 = "aweme.snssdk.com"
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "https://aweme.snssdk.com"
            com.bytedance.bdlocation.client.BDLocationConfig.setBaseUrl(r0)
        L_0x0054:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting r0 = r10.a()
            if (r0 == 0) goto L_0x0063
            java.lang.Boolean r1 = r0.getReportGps()
            boolean r1 = r1.booleanValue()
            goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            com.bytedance.bdlocation.client.BDLocationConfig.setIsUploadGPS(r1)
            com.ss.android.ugc.aweme.app.location.b$1 r2 = new com.ss.android.ugc.aweme.app.location.b$1
            r2.<init>()
            com.bytedance.bdlocation.client.BDLocationConfig.setNetworkApi(r2)
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r2 = r0.getReportBssMax()     // Catch:{ a -> 0x007a }
            int r2 = r2.intValue()     // Catch:{ a -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            if (r2 <= 0) goto L_0x0084
            com.bytedance.bdlocation.client.BDLocationConfig.setUploadBaseSite(r8)
            com.bytedance.bdlocation.client.BDLocationConfig.setBssNum(r2)
            goto L_0x0087
        L_0x0084:
            com.bytedance.bdlocation.client.BDLocationConfig.setUploadBaseSite(r9)
        L_0x0087:
            if (r0 == 0) goto L_0x0092
            java.lang.Integer r3 = r0.getReportWifiMax()     // Catch:{ a -> 0x0092 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0092 }
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 <= 0) goto L_0x009c
            com.bytedance.bdlocation.client.BDLocationConfig.setUploadWIFI(r8)
            com.bytedance.bdlocation.client.BDLocationConfig.setWifiNum(r3)
            goto L_0x009f
        L_0x009c:
            com.bytedance.bdlocation.client.BDLocationConfig.setUploadWIFI(r9)
        L_0x009f:
            if (r0 == 0) goto L_0x00aa
            java.lang.Boolean r4 = r0.getReportAtStart()
            boolean r4 = r4.booleanValue()
            goto L_0x00ab
        L_0x00aa:
            r4 = 1
        L_0x00ab:
            com.bytedance.bdlocation.client.BDLocationConfig.setReportAtStart(r4)
            if (r1 != 0) goto L_0x00b8
            if (r2 != 0) goto L_0x00b8
            if (r3 != 0) goto L_0x00b8
            com.bytedance.bdlocation.client.BDLocationConfig.setUpload(r9)
            goto L_0x00bb
        L_0x00b8:
            com.bytedance.bdlocation.client.BDLocationConfig.setUpload(r8)
        L_0x00bb:
            com.bytedance.bdlocation.client.BDLocationConfig.setChineseChannel(r8)
            java.util.Locale r1 = java.util.Locale.CHINA
            com.bytedance.bdlocation.client.BDLocationConfig.setLocale(r1)
            if (r0 == 0) goto L_0x00ce
            java.lang.Integer r0 = r0.getReportIntervalSeconds()
            int r0 = r0.intValue()
            goto L_0x00d0
        L_0x00ce:
            r0 = 600(0x258, float:8.41E-43)
        L_0x00d0:
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.bytedance.bdlocation.client.BDLocationConfig.setUploadInterval(r0)
            com.bytedance.bdlocation.client.BDLocationConfig.setDebug(r9)
        L_0x00db:
            com.bytedance.bdlocation.client.BDLocationClient r0 = new com.bytedance.bdlocation.client.BDLocationClient
            java.lang.String r1 = "LocationCompatV2"
            r0.<init>(r1)
            r10.f34203d = r0
            com.bytedance.bdlocation.client.BDLocationClient r0 = r10.f34203d
            r1 = 2
            com.bytedance.bdlocation.client.BDLocationClient r0 = r0.setLocationMode(r1)
            r1 = 30000(0x7530, double:1.4822E-319)
            com.bytedance.bdlocation.client.BDLocationClient r0 = r0.setLocationTimeOut(r1)
            r1 = 600000(0x927c0, double:2.964394E-318)
            r0.setMaxCacheTime(r1)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.location.b.<init>(android.content.Context, com.ss.android.ugc.aweme.app.af):void");
    }
}
