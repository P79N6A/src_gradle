package com.loc;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cs {
    static AMapLocation m;
    static long n;
    static Object o = new Object();
    static long t = 0;
    static boolean w = false;
    static boolean x = false;
    LocationListener A = new LocationListener() {
        public final void onProviderDisabled(String str) {
            try {
                if ("gps".equalsIgnoreCase(str)) {
                    cs.this.f25706f = 0;
                    cs.this.B = 0;
                }
            } catch (Throwable unused) {
            }
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                try {
                    cs.this.f25706f = 0;
                    cs.this.B = 0;
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(29:9|(3:13|(3:15|16|(1:18)(3:19|(1:21)(1:22)|23))|28)|29|(1:31)(1:32)|33|(1:(22:44|45|(2:47|(2:49|(2:51|52)(2:53|54)))(1:55)|56|57|58|(1:62)|63|64|65|66|(1:68)(2:69|(1:71)(1:72))|73|74|(1:76)(2:77|(1:79)(6:80|(1:84)|85|(1:89)|90|(1:92)(2:93|(1:95)(3:96|(2:106|(1:110))|111))))|112|239|123|124|(6:126|(1:128)|129|287|134|135)|143|144)(1:43))|35|45|(0)(0)|56|57|58|60|62|63|64|65|66|(0)(0)|73|74|(0)(0)|112|239|123|124|(0)|143|144) */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a1, code lost:
            r14 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
            com.loc.ce.a(r14, "GpsLocation", "onLocationChangedLast");
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x013b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0152 */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x023a A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x025f A[Catch:{ Throwable -> 0x02a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2 A[Catch:{ Throwable -> 0x006c, Throwable -> 0x02b2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f7 A[Catch:{ Throwable -> 0x006c, Throwable -> 0x02b2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0142 A[Catch:{ Throwable -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0146 A[Catch:{ Throwable -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x015a A[Catch:{ Throwable -> 0x006c, Throwable -> 0x02b2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x015c A[Catch:{ Throwable -> 0x006c, Throwable -> 0x02b2 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLocationChanged(android.location.Location r14) {
            /*
                r13 = this;
                com.loc.cs r0 = com.loc.cs.this
                android.os.Handler r0 = r0.f25701a
                if (r0 == 0) goto L_0x000f
                com.loc.cs r0 = com.loc.cs.this
                android.os.Handler r0 = r0.f25701a
                r1 = 8
                r0.removeMessages(r1)
            L_0x000f:
                if (r14 != 0) goto L_0x0012
                return
            L_0x0012:
                com.amap.api.location.AMapLocation r0 = new com.amap.api.location.AMapLocation     // Catch:{ Throwable -> 0x02b2 }
                r0.<init>((android.location.Location) r14)     // Catch:{ Throwable -> 0x02b2 }
                boolean r1 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02b2 }
                if (r1 != 0) goto L_0x001e
                return
            L_0x001e:
                r1 = 1
                r0.setLocationType(r1)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                boolean r2 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                if (r2 != 0) goto L_0x0078
                boolean r2 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02b2 }
                if (r2 == 0) goto L_0x0078
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                android.content.Context r3 = r2.f25702b     // Catch:{ Throwable -> 0x02b2 }
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                long r6 = r2.f25705e     // Catch:{ Throwable -> 0x02b2 }
                r2 = 0
                long r4 = r4 - r6
                double r6 = r0.getLatitude()     // Catch:{ Throwable -> 0x02b2 }
                double r8 = r0.getLongitude()     // Catch:{ Throwable -> 0x02b2 }
                boolean r2 = com.loc.ce.a((double) r6, (double) r8)     // Catch:{ Throwable -> 0x02b2 }
                if (r3 == 0) goto L_0x0074
                boolean r6 = com.loc.cd.d()     // Catch:{ Throwable -> 0x006c }
                if (r6 != 0) goto L_0x0051
                goto L_0x0074
            L_0x0051:
                java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x006c }
                int r7 = r4.intValue()     // Catch:{ Throwable -> 0x006c }
                java.lang.String r4 = "domestic"
                if (r2 != 0) goto L_0x0061
                java.lang.String r2 = "abroad"
                r5 = r2
                goto L_0x0062
            L_0x0061:
                r5 = r4
            L_0x0062:
                java.lang.String r4 = "O015"
                r6 = 0
                r8 = 2147483647(0x7fffffff, float:NaN)
                com.loc.cj.a(r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x006c }
                goto L_0x0074
            L_0x006c:
                r2 = move-exception
                java.lang.String r3 = "ReportUtil"
                java.lang.String r4 = "reportGPSLocUseTime"
                com.loc.ce.a(r2, r3, r4)     // Catch:{ Throwable -> 0x02b2 }
            L_0x0074:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                r2.g = r1     // Catch:{ Throwable -> 0x02b2 }
            L_0x0078:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                int r2 = r2.B     // Catch:{ Throwable -> 0x02b2 }
                android.os.Bundle r3 = r14.getExtras()     // Catch:{ Throwable -> 0x02b2 }
                r4 = 0
                if (r3 == 0) goto L_0x008a
                java.lang.String r5 = "satellites"
                int r3 = r3.getInt(r5)     // Catch:{ Throwable -> 0x02b2 }
                goto L_0x008b
            L_0x008a:
                r3 = 0
            L_0x008b:
                r5 = 0
                r7 = 0
                if (r3 > 0) goto L_0x0092
            L_0x0090:
                r2 = 1
                goto L_0x00ae
            L_0x0092:
                if (r2 != 0) goto L_0x00ad
                double r2 = r14.getAltitude()     // Catch:{ Throwable -> 0x02b2 }
                int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r8 != 0) goto L_0x00ad
                float r2 = r14.getBearing()     // Catch:{ Throwable -> 0x02b2 }
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 != 0) goto L_0x00ad
                float r2 = r14.getSpeed()     // Catch:{ Throwable -> 0x02b2 }
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 != 0) goto L_0x00ad
                goto L_0x0090
            L_0x00ad:
                r2 = 0
            L_0x00ae:
                r3 = 3
                r8 = 0
                if (r2 == 0) goto L_0x00f7
                r0.setMock(r1)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                com.amap.api.location.AMapLocationClientOption r2 = r2.f25704d     // Catch:{ Throwable -> 0x02b2 }
                boolean r2 = r2.isMockEnable()     // Catch:{ Throwable -> 0x02b2 }
                if (r2 != 0) goto L_0x00fb
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                int r14 = r14.z     // Catch:{ Throwable -> 0x02b2 }
                if (r14 <= r3) goto L_0x00ef
                r14 = 2152(0x868, float:3.016E-42)
                com.loc.cj.a((java.lang.String) r8, (int) r14)     // Catch:{ Throwable -> 0x02b2 }
                r14 = 15
                r0.setErrorCode(r14)     // Catch:{ Throwable -> 0x02b2 }
                java.lang.String r14 = "GpsLocation has been mocked!#1501"
                r0.setLocationDetail(r14)     // Catch:{ Throwable -> 0x02b2 }
                r0.setLatitude(r5)     // Catch:{ Throwable -> 0x02b2 }
                r0.setLongitude(r5)     // Catch:{ Throwable -> 0x02b2 }
                r0.setAltitude(r5)     // Catch:{ Throwable -> 0x02b2 }
                r0.setSpeed(r7)     // Catch:{ Throwable -> 0x02b2 }
                r0.setAccuracy(r7)     // Catch:{ Throwable -> 0x02b2 }
                r0.setBearing(r7)     // Catch:{ Throwable -> 0x02b2 }
                r0.setExtras(r8)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                r14.b(r0)     // Catch:{ Throwable -> 0x02b2 }
                return
            L_0x00ef:
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                int r0 = r14.z     // Catch:{ Throwable -> 0x02b2 }
                int r0 = r0 + r1
                r14.z = r0     // Catch:{ Throwable -> 0x02b2 }
                return
            L_0x00f7:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                r2.z = r4     // Catch:{ Throwable -> 0x02b2 }
            L_0x00fb:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                int r2 = r2.B     // Catch:{ Throwable -> 0x02b2 }
                r0.setSatellites(r2)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                double r5 = r0.getLatitude()     // Catch:{ Throwable -> 0x013b }
                double r9 = r0.getLongitude()     // Catch:{ Throwable -> 0x013b }
                boolean r5 = com.loc.ce.a((double) r5, (double) r9)     // Catch:{ Throwable -> 0x013b }
                if (r5 == 0) goto L_0x013b
                com.amap.api.location.AMapLocationClientOption r5 = r2.f25704d     // Catch:{ Throwable -> 0x013b }
                boolean r5 = r5.isOffset()     // Catch:{ Throwable -> 0x013b }
                if (r5 == 0) goto L_0x013b
                android.content.Context r2 = r2.f25702b     // Catch:{ Throwable -> 0x013b }
                com.amap.api.location.DPoint r5 = new com.amap.api.location.DPoint     // Catch:{ Throwable -> 0x013b }
                double r9 = r0.getLatitude()     // Catch:{ Throwable -> 0x013b }
                double r11 = r0.getLongitude()     // Catch:{ Throwable -> 0x013b }
                r5.<init>(r9, r11)     // Catch:{ Throwable -> 0x013b }
                com.amap.api.location.DPoint r2 = com.loc.cf.a((android.content.Context) r2, (com.amap.api.location.DPoint) r5)     // Catch:{ Throwable -> 0x013b }
                double r5 = r2.getLatitude()     // Catch:{ Throwable -> 0x013b }
                r0.setLatitude(r5)     // Catch:{ Throwable -> 0x013b }
                double r5 = r2.getLongitude()     // Catch:{ Throwable -> 0x013b }
                r0.setLongitude(r5)     // Catch:{ Throwable -> 0x013b }
            L_0x013b:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                int r5 = r2.B     // Catch:{ Throwable -> 0x0152 }
                r6 = 4
                if (r5 < r6) goto L_0x0146
                r0.setGpsAccuracyStatus(r1)     // Catch:{ Throwable -> 0x0152 }
                goto L_0x0152
            L_0x0146:
                int r2 = r2.B     // Catch:{ Throwable -> 0x0152 }
                if (r2 != 0) goto L_0x014f
                r2 = -1
                r0.setGpsAccuracyStatus(r2)     // Catch:{ Throwable -> 0x0152 }
                goto L_0x0152
            L_0x014f:
                r0.setGpsAccuracyStatus(r4)     // Catch:{ Throwable -> 0x0152 }
            L_0x0152:
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                boolean r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02b2 }
                if (r5 != 0) goto L_0x015c
                goto L_0x022b
            L_0x015c:
                int r5 = r2.h     // Catch:{ Throwable -> 0x02b2 }
                if (r5 >= r3) goto L_0x0162
                goto L_0x022b
            L_0x0162:
                float r3 = r0.getAccuracy()     // Catch:{ Throwable -> 0x02b2 }
                r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
                int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0175
                float r3 = r0.getAccuracy()     // Catch:{ Throwable -> 0x02b2 }
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L_0x0178
            L_0x0175:
                r0.setAccuracy(r7)     // Catch:{ Throwable -> 0x02b2 }
            L_0x0178:
                float r3 = r0.getSpeed()     // Catch:{ Throwable -> 0x02b2 }
                int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0188
                float r3 = r0.getSpeed()     // Catch:{ Throwable -> 0x02b2 }
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L_0x018b
            L_0x0188:
                r0.setSpeed(r7)     // Catch:{ Throwable -> 0x02b2 }
            L_0x018b:
                com.loc.bm r2 = r2.i     // Catch:{ Throwable -> 0x02b2 }
                boolean r3 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02b2 }
                if (r3 != 0) goto L_0x0195
                goto L_0x022b
            L_0x0195:
                long r5 = com.loc.cn.b()     // Catch:{ Throwable -> 0x02b2 }
                long r9 = r2.h     // Catch:{ Throwable -> 0x02b2 }
                r3 = 0
                long r5 = r5 - r9
                long r9 = com.loc.cn.b()     // Catch:{ Throwable -> 0x02b2 }
                r2.h = r9     // Catch:{ Throwable -> 0x02b2 }
                r9 = 5000(0x1388, double:2.4703E-320)
                int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x01ab
                goto L_0x022b
            L_0x01ab:
                com.amap.api.location.AMapLocation r3 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                if (r3 == 0) goto L_0x0229
                com.amap.api.location.AMapLocation r3 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                int r3 = r3.getLocationType()     // Catch:{ Throwable -> 0x02b2 }
                if (r1 == r3) goto L_0x01c5
                java.lang.String r1 = "gps"
                com.amap.api.location.AMapLocation r3 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                java.lang.String r3 = r3.getProvider()     // Catch:{ Throwable -> 0x02b2 }
                boolean r1 = r1.equalsIgnoreCase(r3)     // Catch:{ Throwable -> 0x02b2 }
                if (r1 == 0) goto L_0x0229
            L_0x01c5:
                com.amap.api.location.AMapLocation r1 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                double r5 = r1.getAltitude()     // Catch:{ Throwable -> 0x02b2 }
                double r9 = r0.getAltitude()     // Catch:{ Throwable -> 0x02b2 }
                int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r1 != 0) goto L_0x01e1
                com.amap.api.location.AMapLocation r1 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                double r5 = r1.getLongitude()     // Catch:{ Throwable -> 0x02b2 }
                double r9 = r0.getLongitude()     // Catch:{ Throwable -> 0x02b2 }
                int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r1 == 0) goto L_0x0229
            L_0x01e1:
                long r5 = r0.getTime()     // Catch:{ Throwable -> 0x02b2 }
                com.amap.api.location.AMapLocation r1 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                long r9 = r1.getTime()     // Catch:{ Throwable -> 0x02b2 }
                r1 = 0
                long r5 = r5 - r9
                long r5 = java.lang.Math.abs(r5)     // Catch:{ Throwable -> 0x02b2 }
                r9 = 30000(0x7530, double:1.4822E-319)
                int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0229
                com.amap.api.location.AMapLocation r1 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                float r1 = r1.getSpeed()     // Catch:{ Throwable -> 0x02b2 }
                float r3 = r0.getSpeed()     // Catch:{ Throwable -> 0x02b2 }
                float r1 = r1 + r3
                float r3 = (float) r5     // Catch:{ Throwable -> 0x02b2 }
                float r1 = r1 * r3
                r3 = 1157234688(0x44fa0000, float:2000.0)
                float r1 = r1 / r3
                com.amap.api.location.AMapLocation r3 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                float r3 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0, (com.amap.api.location.AMapLocation) r3)     // Catch:{ Throwable -> 0x02b2 }
                r5 = 1073741824(0x40000000, float:2.0)
                com.amap.api.location.AMapLocation r6 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                float r6 = r6.getAccuracy()     // Catch:{ Throwable -> 0x02b2 }
                float r7 = r0.getAccuracy()     // Catch:{ Throwable -> 0x02b2 }
                float r6 = r6 + r7
                float r6 = r6 * r5
                float r1 = r1 + r6
                r5 = 1161527296(0x453b8000, float:3000.0)
                float r1 = r1 + r5
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x0229
                com.amap.api.location.AMapLocation r0 = r2.g     // Catch:{ Throwable -> 0x02b2 }
                goto L_0x022b
            L_0x0229:
                r2.g = r0     // Catch:{ Throwable -> 0x02b2 }
            L_0x022b:
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs.b(r1, r0)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                r1.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                java.lang.Object r1 = r1.r     // Catch:{ Throwable -> 0x02b2 }
                monitor-enter(r1)     // Catch:{ Throwable -> 0x02b2 }
                com.loc.cs r2 = com.loc.cs.this     // Catch:{ all -> 0x02af }
                com.loc.cs r3 = com.loc.cs.this     // Catch:{ all -> 0x02af }
                com.amap.api.location.AMapLocation r3 = r3.D     // Catch:{ all -> 0x02af }
                if (r3 == 0) goto L_0x0258
                com.amap.api.location.AMapLocationClientOption r5 = r2.f25704d     // Catch:{ all -> 0x02af }
                boolean r5 = r5.isNeedAddress()     // Catch:{ all -> 0x02af }
                if (r5 == 0) goto L_0x0258
                float r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0, (com.amap.api.location.AMapLocation) r3)     // Catch:{ all -> 0x02af }
                int r2 = r2.j     // Catch:{ all -> 0x02af }
                float r2 = (float) r2     // Catch:{ all -> 0x02af }
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 >= 0) goto L_0x0258
                com.loc.ce.a((com.amap.api.location.AMapLocation) r0, (com.amap.api.location.AMapLocation) r3)     // Catch:{ all -> 0x02af }
            L_0x0258:
                monitor-exit(r1)     // Catch:{ all -> 0x02af }
                boolean r1 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02a1 }
                if (r1 == 0) goto L_0x02a9
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                com.amap.api.location.AMapLocation r1 = r1.l     // Catch:{ Throwable -> 0x02a1 }
                if (r1 == 0) goto L_0x0283
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                long r2 = r14.getTime()     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                com.amap.api.location.AMapLocation r14 = r14.l     // Catch:{ Throwable -> 0x02a1 }
                long r5 = r14.getTime()     // Catch:{ Throwable -> 0x02a1 }
                r14 = 0
                long r2 = r2 - r5
                r1.p = r2     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                com.amap.api.location.AMapLocation r1 = r1.l     // Catch:{ Throwable -> 0x02a1 }
                float r1 = com.loc.cn.a((com.amap.api.location.AMapLocation) r1, (com.amap.api.location.AMapLocation) r0)     // Catch:{ Throwable -> 0x02a1 }
                r14.q = r1     // Catch:{ Throwable -> 0x02a1 }
            L_0x0283:
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                java.lang.Object r14 = r14.s     // Catch:{ Throwable -> 0x02a1 }
                monitor-enter(r14)     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r1 = com.loc.cs.this     // Catch:{ all -> 0x029e }
                com.amap.api.location.AMapLocation r2 = r0.clone()     // Catch:{ all -> 0x029e }
                r1.l = r2     // Catch:{ all -> 0x029e }
                monitor-exit(r14)     // Catch:{ all -> 0x029e }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                r14.E = r8     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                r14.F = r4     // Catch:{ Throwable -> 0x02a1 }
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02a1 }
                r14.G = r4     // Catch:{ Throwable -> 0x02a1 }
                goto L_0x02a9
            L_0x029e:
                r1 = move-exception
                monitor-exit(r14)     // Catch:{ Throwable -> 0x02a1 }
                throw r1     // Catch:{ Throwable -> 0x02a1 }
            L_0x02a1:
                r14 = move-exception
                java.lang.String r1 = "GpsLocation"
                java.lang.String r2 = "onLocationChangedLast"
                com.loc.ce.a(r14, r1, r2)     // Catch:{ Throwable -> 0x02b2 }
            L_0x02a9:
                com.loc.cs r14 = com.loc.cs.this     // Catch:{ Throwable -> 0x02b2 }
                r14.b(r0)     // Catch:{ Throwable -> 0x02b2 }
                return
            L_0x02af:
                r14 = move-exception
                monitor-exit(r1)     // Catch:{ Throwable -> 0x02b2 }
                throw r14     // Catch:{ Throwable -> 0x02b2 }
            L_0x02b2:
                r14 = move-exception
                java.lang.String r0 = "GpsLocation"
                java.lang.String r1 = "onLocationChanged"
                com.loc.ce.a(r14, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.cs.AnonymousClass1.onLocationChanged(android.location.Location):void");
        }
    };
    public int B = 0;
    GpsStatus C = null;
    public AMapLocation D = null;
    String E = null;
    boolean F = false;
    int G = 0;
    private GpsStatus.Listener H = new GpsStatus.Listener() {
        public final void onGpsStatusChanged(int i) {
            try {
                if (cs.this.f25703c != null) {
                    cs.this.C = cs.this.f25703c.getGpsStatus(cs.this.C);
                    int i2 = 0;
                    switch (i) {
                        case 2:
                            cs.this.B = 0;
                            break;
                        case 3:
                            return;
                        case 4:
                            if (cs.this.C != null) {
                                Iterable<GpsSatellite> satellites = cs.this.C.getSatellites();
                                if (satellites != null) {
                                    Iterator<GpsSatellite> it2 = satellites.iterator();
                                    int maxSatellites = cs.this.C.getMaxSatellites();
                                    while (it2.hasNext() && i2 < maxSatellites) {
                                        if (it2.next().usedInFix()) {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            cs.this.B = i2;
                            break;
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "GpsLocation", "onGpsStatusChanged");
            }
        }
    };
    private boolean I = false;

    /* renamed from: a  reason: collision with root package name */
    Handler f25701a;

    /* renamed from: b  reason: collision with root package name */
    Context f25702b;

    /* renamed from: c  reason: collision with root package name */
    LocationManager f25703c;

    /* renamed from: d  reason: collision with root package name */
    AMapLocationClientOption f25704d;

    /* renamed from: e  reason: collision with root package name */
    long f25705e;

    /* renamed from: f  reason: collision with root package name */
    long f25706f;
    boolean g;
    int h;
    bm i;
    int j = 240;
    int k = 80;
    AMapLocation l;
    long p;
    float q;
    Object r = new Object();
    Object s = new Object();
    AMapLocationClientOption.GeoLanguage u = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean v = true;
    long y = 0;
    int z = 0;

    public cs(Context context, Handler handler) {
        this.f25702b = context;
        this.f25701a = handler;
        try {
            this.f25703c = (LocationManager) this.f25702b.getSystemService("location");
        } catch (Throwable th) {
            ce.a(th, "GpsLocation", "<init>");
        }
        this.i = new bm();
    }

    private void a(int i2, int i3, String str, long j2) {
        try {
            if (this.f25701a != null && this.f25704d.getLocationMode() == AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                Message obtain = Message.obtain();
                AMapLocation aMapLocation = new AMapLocation("");
                aMapLocation.setProvider("gps");
                aMapLocation.setErrorCode(i3);
                aMapLocation.setLocationDetail(str);
                aMapLocation.setLocationType(1);
                obtain.obj = aMapLocation;
                obtain.what = i2;
                this.f25701a.sendMessageDelayed(obtain, j2);
            }
        } catch (Throwable unused) {
        }
    }

    static boolean a(LocationManager locationManager) {
        try {
            if (w) {
                return x;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                x = false;
            } else {
                x = allProviders.contains("gps");
            }
            w = true;
            return x;
        } catch (Throwable unused) {
            return x;
        }
    }

    private boolean a(String str) {
        try {
            ArrayList<String> d2 = cn.d(str);
            ArrayList<String> d3 = cn.d(this.E);
            if (d2.size() < 8 || d3.size() < 8) {
                return false;
            }
            return cn.a(this.E, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void b(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() == 15 && !AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.f25704d.getLocationMode())) {
            return;
        }
        if (!this.f25704d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) || this.f25704d.getDeviceModeDistanceFilter() <= 0.0f) {
            if (cn.b() - this.y >= this.f25704d.getInterval() - 200) {
                this.y = cn.b();
                c(aMapLocation);
            }
            return;
        }
        c(aMapLocation);
    }

    static /* synthetic */ void b(cs csVar, AMapLocation aMapLocation) {
        if (cn.a(aMapLocation)) {
            csVar.f25706f = cn.b();
            synchronized (o) {
                n = cn.b();
                m = aMapLocation.clone();
            }
            csVar.h++;
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (this.f25701a != null) {
            Message obtain = Message.obtain();
            obtain.obj = aMapLocation;
            obtain.what = 2;
            this.f25701a.sendMessage(obtain);
        }
    }

    private static boolean c() {
        try {
            return ((Boolean) ch.a(di.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), di.c("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        if (this.l == null) {
            return aMapLocation;
        }
        if ((!this.f25704d.isMockEnable() && this.l.isMock()) || !cn.a(this.l)) {
            return aMapLocation;
        }
        AMapLocation d2 = d();
        if (d2 != null && cn.a(d2)) {
            return d2;
        }
        float speed = this.l.getSpeed();
        if (speed == 0.0f && this.p > 0 && this.p < 8 && this.q > 0.0f) {
            speed = this.q / ((float) this.p);
        }
        long j2 = 30000;
        if (aMapLocation != null && cn.a(aMapLocation)) {
            if (aMapLocation.getAccuracy() < 200.0f) {
                this.G++;
                if (this.E == null && this.G >= 2) {
                    this.F = true;
                }
                j2 = speed > 5.0f ? 10000 : ea.f66827f;
            } else {
                if (!TextUtils.isEmpty(this.E)) {
                    this.F = false;
                    this.G = 0;
                }
                if (speed > 5.0f) {
                    j2 = 20000;
                }
            }
        }
        if (cn.b() - this.f25706f < j2) {
            if (this.E == null && this.G >= 2) {
                this.E = str;
            }
            return this.l.clone();
        } else if (this.F && a(str)) {
            return this.l.clone();
        } else {
            this.E = null;
            this.G = 0;
            synchronized (this.s) {
                this.l = null;
            }
            this.p = 0;
            this.q = 0.0f;
            return aMapLocation;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|(1:6)|7|8|(1:10)|11|12|(1:14)|15|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Throwable -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001f A[Catch:{ Throwable -> 0x0026 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            android.location.LocationManager r0 = r4.f25703c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.location.LocationListener r0 = r4.A     // Catch:{ Throwable -> 0x0010 }
            if (r0 == 0) goto L_0x0010
            android.location.LocationManager r0 = r4.f25703c     // Catch:{ Throwable -> 0x0010 }
            android.location.LocationListener r1 = r4.A     // Catch:{ Throwable -> 0x0010 }
            r0.removeUpdates(r1)     // Catch:{ Throwable -> 0x0010 }
        L_0x0010:
            android.location.GpsStatus$Listener r0 = r4.H     // Catch:{ Throwable -> 0x001b }
            if (r0 == 0) goto L_0x001b
            android.location.LocationManager r0 = r4.f25703c     // Catch:{ Throwable -> 0x001b }
            android.location.GpsStatus$Listener r1 = r4.H     // Catch:{ Throwable -> 0x001b }
            r0.removeGpsStatusListener(r1)     // Catch:{ Throwable -> 0x001b }
        L_0x001b:
            android.os.Handler r0 = r4.f25701a     // Catch:{ Throwable -> 0x0026 }
            if (r0 == 0) goto L_0x0026
            android.os.Handler r0 = r4.f25701a     // Catch:{ Throwable -> 0x0026 }
            r1 = 8
            r0.removeMessages(r1)     // Catch:{ Throwable -> 0x0026 }
        L_0x0026:
            r0 = 0
            r4.B = r0
            r1 = 0
            r4.f25705e = r1
            r4.y = r1
            r4.f25706f = r1
            r4.h = r0
            r4.z = r0
            com.loc.bm r3 = r4.i
            r3.a()
            r3 = 0
            r4.l = r3
            r4.p = r1
            r1 = 0
            r4.q = r1
            r4.E = r3
            r4.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cs.a():void");
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.j = bundle.getInt("I_MAX_GEO_DIS");
                this.k = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    synchronized (this.r) {
                        this.D = aMapLocation;
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AMapLocation aMapLocation) {
        Handler handler;
        if (cn.a(aMapLocation) && this.f25701a != null && this.f25704d.isNeedAddress()) {
            long b2 = cn.b();
            if (this.f25704d.getInterval() <= 8000 || b2 - this.y > this.f25704d.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = 5;
                synchronized (this.r) {
                    if (this.D == null) {
                        handler = this.f25701a;
                    } else if (cn.a(aMapLocation, this.D) > ((float) this.k)) {
                        handler = this.f25701a;
                    }
                    handler.sendMessage(obtain);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r8.v = false;
        com.loc.cj.a((java.lang.String) null, 2121);
        a(2, 12, r0.getMessage() + "#1201", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0099 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0100 A[ExcHandler: SecurityException (r0v0 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:10:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.amap.api.location.AMapLocationClientOption r9) {
        /*
            r8 = this;
            r8.f25704d = r9
            com.amap.api.location.AMapLocationClientOption r9 = r8.f25704d
            if (r9 != 0) goto L_0x000d
            com.amap.api.location.AMapLocationClientOption r9 = new com.amap.api.location.AMapLocationClientOption
            r9.<init>()
            r8.f25704d = r9
        L_0x000d:
            android.content.Context r9 = r8.f25702b     // Catch:{ Throwable -> 0x001b }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "lagt"
            long r2 = t     // Catch:{ Throwable -> 0x001b }
            long r0 = com.loc.cl.b((android.content.Context) r9, (java.lang.String) r0, (java.lang.String) r1, (long) r2)     // Catch:{ Throwable -> 0x001b }
            t = r0     // Catch:{ Throwable -> 0x001b }
        L_0x001b:
            android.location.LocationManager r9 = r8.f25703c
            if (r9 != 0) goto L_0x0020
            return
        L_0x0020:
            r9 = 0
            long r0 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            long r2 = n     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0052
            com.amap.api.location.AMapLocation r0 = m     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            boolean r0 = com.loc.cn.a((com.amap.api.location.AMapLocation) r0)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 == 0) goto L_0x0052
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            boolean r0 = r0.isMockEnable()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 != 0) goto L_0x0047
            com.amap.api.location.AMapLocation r0 = m     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            boolean r0 = r0.isMock()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 != 0) goto L_0x0052
        L_0x0047:
            long r0 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r8.f25706f = r0     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            com.amap.api.location.AMapLocation r0 = m     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r8.b(r0)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
        L_0x0052:
            r0 = 1
            r8.v = r0     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 != 0) goto L_0x0061
            android.content.Context r0 = r8.f25702b     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            android.os.Looper r0 = r0.getMainLooper()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
        L_0x0061:
            r7 = r0
            long r0 = com.loc.cn.b()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r8.f25705e = r0     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            android.location.LocationManager r0 = r8.f25703c     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            boolean r0 = a((android.location.LocationManager) r0)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 == 0) goto L_0x00ea
            long r0 = com.loc.cn.a()     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            long r2 = t     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 259200000(0xf731400, double:1.280618154E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0099
            android.location.LocationManager r0 = r8.f25703c     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            java.lang.String r1 = "gps"
            java.lang.String r2 = "force_xtra_injection"
            r0.sendExtraCommand(r1, r2, r9)     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            long r0 = com.loc.cn.a()     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            t = r0     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            android.content.Context r0 = r8.f25702b     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            java.lang.String r1 = "pref"
            java.lang.String r2 = "lagt"
            long r3 = t     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
            com.loc.cl.a((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2, (long) r3)     // Catch:{ Throwable -> 0x0099, SecurityException -> 0x0100 }
        L_0x0099:
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            boolean r0 = r0.equals(r1)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            if (r0 == 0) goto L_0x00c8
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            float r0 = r0.getDeviceModeDistanceFilter()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            android.location.LocationManager r1 = r8.f25703c     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            java.lang.String r2 = "gps"
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            long r3 = r0.getInterval()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            float r5 = r0.getDeviceModeDistanceFilter()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            android.location.LocationListener r6 = r8.A     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
        L_0x00c4:
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            goto L_0x00d2
        L_0x00c8:
            android.location.LocationManager r1 = r8.f25703c     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            java.lang.String r2 = "gps"
            r3 = 900(0x384, double:4.447E-321)
            r5 = 0
            android.location.LocationListener r6 = r8.A     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            goto L_0x00c4
        L_0x00d2:
            android.location.LocationManager r0 = r8.f25703c     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            android.location.GpsStatus$Listener r1 = r8.H     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r0.addGpsStatusListener(r1)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r3 = 8
            r4 = 14
            java.lang.String r5 = "no enough satellites#1401"
            com.amap.api.location.AMapLocationClientOption r0 = r8.f25704d     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            long r6 = r0.getHttpTimeOut()     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            r2 = r8
            r2.a(r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            return
        L_0x00ea:
            r2 = 8
            r3 = 14
            java.lang.String r4 = "no gps provider#1402"
            r5 = 0
            r1 = r8
            r1.a(r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x0100, Throwable -> 0x00f7 }
            return
        L_0x00f7:
            r9 = move-exception
            java.lang.String r0 = "GpsLocation"
            java.lang.String r1 = "requestLocationUpdates part2"
            com.loc.ce.a(r9, r0, r1)
            return
        L_0x0100:
            r0 = move-exception
            r1 = 0
            r8.v = r1
            r1 = 2121(0x849, float:2.972E-42)
            com.loc.cj.a((java.lang.String) r9, (int) r1)
            r3 = 2
            r4 = 12
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = "#1201"
            r9.append(r0)
            java.lang.String r5 = r9.toString()
            r6 = 0
            r2 = r8
            r2.a(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cs.a(com.amap.api.location.AMapLocationClientOption):void");
    }

    public final boolean b() {
        return cn.b() - this.f25706f <= 2800;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:15|16|17|18|21|22|23|24|25|26|29|30|31|32|33|34|(3:36|b9|41)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[Catch:{ Throwable -> 0x00dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.amap.api.location.AMapLocation d() {
        /*
            r15 = this;
            r0 = 0
            com.amap.api.location.AMapLocation r1 = r15.l     // Catch:{ Throwable -> 0x00dd }
            boolean r1 = com.loc.cn.a((com.amap.api.location.AMapLocation) r1)     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = com.loc.cd.B     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x000f
            return r0
        L_0x000f:
            boolean r1 = c()     // Catch:{ Throwable -> 0x00dd }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = "KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="
            java.lang.String r1 = com.loc.di.c((java.lang.String) r1)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r2 = "UZ2V0TmF2aUxvY2F0aW9u"
            java.lang.String r2 = com.loc.di.c((java.lang.String) r2)     // Catch:{ Throwable -> 0x00dd }
            java.lang.Object r1 = com.loc.ch.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.Object[]) r0, (java.lang.Class<?>[]) r0)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x00dd }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00dd }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "time"
            long r3 = r2.optLong(r1)     // Catch:{ Throwable -> 0x00dd }
            boolean r1 = r15.I     // Catch:{ Throwable -> 0x00dd }
            if (r1 != 0) goto L_0x0040
            r1 = 1
            r15.I = r1     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "useNaviLoc"
            java.lang.String r5 = "use NaviLoc"
            com.loc.cj.a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ Throwable -> 0x00dd }
        L_0x0040:
            long r5 = com.loc.cn.a()     // Catch:{ Throwable -> 0x00dd }
            r1 = 0
            long r5 = r5 - r3
            r7 = 5500(0x157c, double:2.7174E-320)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x00dd
            java.lang.String r1 = "lat"
            r5 = 0
            double r7 = r2.optDouble(r1, r5)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r1 = "lng"
            double r9 = r2.optDouble(r1, r5)     // Catch:{ Throwable -> 0x00dd }
            r1 = 0
            java.lang.String r11 = "accuracy"
            java.lang.String r12 = "0"
            java.lang.String r11 = r2.optString(r11, r12)     // Catch:{ NumberFormatException -> 0x0068 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            r11 = 0
        L_0x0069:
            java.lang.String r12 = "altitude"
            double r5 = r2.optDouble(r12, r5)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r12 = "bearing"
            java.lang.String r13 = "0"
            java.lang.String r12 = r2.optString(r12, r13)     // Catch:{ NumberFormatException -> 0x007c }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r12 = 0
        L_0x007d:
            java.lang.String r13 = "speed"
            java.lang.String r14 = "0"
            java.lang.String r2 = r2.optString(r13, r14)     // Catch:{ NumberFormatException -> 0x008a }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x008a }
            r1 = r2
        L_0x008a:
            com.amap.api.location.AMapLocation r2 = new com.amap.api.location.AMapLocation     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r13 = "lbs"
            r2.<init>((java.lang.String) r13)     // Catch:{ Throwable -> 0x00dd }
            r13 = 9
            r2.setLocationType(r13)     // Catch:{ Throwable -> 0x00dd }
            r2.setLatitude(r7)     // Catch:{ Throwable -> 0x00dd }
            r2.setLongitude(r9)     // Catch:{ Throwable -> 0x00dd }
            r2.setAccuracy(r11)     // Catch:{ Throwable -> 0x00dd }
            r2.setAltitude(r5)     // Catch:{ Throwable -> 0x00dd }
            r2.setBearing(r12)     // Catch:{ Throwable -> 0x00dd }
            r2.setSpeed(r1)     // Catch:{ Throwable -> 0x00dd }
            r2.setTime(r3)     // Catch:{ Throwable -> 0x00dd }
            com.amap.api.location.AMapLocation r5 = r15.l     // Catch:{ Throwable -> 0x00dd }
            float r5 = com.loc.cn.a((com.amap.api.location.AMapLocation) r2, (com.amap.api.location.AMapLocation) r5)     // Catch:{ Throwable -> 0x00dd }
            r6 = 1133903872(0x43960000, float:300.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00dd
            java.lang.Object r5 = r15.s     // Catch:{ Throwable -> 0x00dd }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x00dd }
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch:{ all -> 0x00da }
            r6.setLongitude(r9)     // Catch:{ all -> 0x00da }
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch:{ all -> 0x00da }
            r6.setLatitude(r7)     // Catch:{ all -> 0x00da }
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch:{ all -> 0x00da }
            r6.setAccuracy(r11)     // Catch:{ all -> 0x00da }
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch:{ all -> 0x00da }
            r6.setBearing(r12)     // Catch:{ all -> 0x00da }
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch:{ all -> 0x00da }
            r6.setSpeed(r1)     // Catch:{ all -> 0x00da }
            com.amap.api.location.AMapLocation r1 = r15.l     // Catch:{ all -> 0x00da }
            r1.setTime(r3)     // Catch:{ all -> 0x00da }
            monitor-exit(r5)     // Catch:{ all -> 0x00da }
            return r2
        L_0x00da:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ Throwable -> 0x00dd }
            throw r1     // Catch:{ Throwable -> 0x00dd }
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cs.d():com.amap.api.location.AMapLocation");
    }
}
