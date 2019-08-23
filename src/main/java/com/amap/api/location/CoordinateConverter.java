package com.amap.api.location;

import android.content.Context;
import com.loc.ce;
import com.loc.cf;
import com.loc.cn;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public class CoordinateConverter {

    /* renamed from: a  reason: collision with root package name */
    DPoint f5576a;

    /* renamed from: b  reason: collision with root package name */
    private Context f5577b;

    /* renamed from: c  reason: collision with root package name */
    private CoordType f5578c;

    /* renamed from: d  reason: collision with root package name */
    private DPoint f5579d;

    /* renamed from: com.amap.api.location.CoordinateConverter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5580a = new int[CoordType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.amap.api.location.CoordinateConverter$CoordType[] r0 = com.amap.api.location.CoordinateConverter.CoordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5580a = r0
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.BAIDU     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.MAPBAR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.MAPABC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.SOSOMAP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.ALIYUN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.GOOGLE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f5580a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.GPS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.location.CoordinateConverter.AnonymousClass1.<clinit>():void");
        }
    }

    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS
    }

    public CoordinateConverter(Context context) {
        this.f5577b = context;
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return ce.a(d2, d3);
    }

    public synchronized DPoint convert() throws Exception {
        DPoint a2;
        if (this.f5578c == null) {
            throw new IllegalArgumentException("转换坐标类型不能为空");
        } else if (this.f5579d == null) {
            throw new IllegalArgumentException("转换坐标源不能为空");
        } else if (this.f5579d.getLongitude() > 180.0d || this.f5579d.getLongitude() < -180.0d) {
            throw new IllegalArgumentException("请传入合理经度");
        } else if (this.f5579d.getLatitude() > 90.0d || this.f5579d.getLatitude() < -90.0d) {
            throw new IllegalArgumentException("请传入合理纬度");
        } else if (!ce.a(this.f5579d.getLatitude(), this.f5579d.getLongitude())) {
            return this.f5579d;
        } else {
            switch (AnonymousClass1.f5580a[this.f5578c.ordinal()]) {
                case 1:
                    a2 = cf.a(this.f5579d);
                    break;
                case 2:
                    a2 = cf.b(this.f5577b, this.f5579d);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    a2 = this.f5579d;
                    break;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    a2 = cf.a(this.f5577b, this.f5579d);
                    break;
            }
            this.f5576a = a2;
            return this.f5576a;
        }
    }

    public synchronized CoordinateConverter coord(DPoint dPoint) throws Exception {
        if (dPoint == null) {
            throw new IllegalArgumentException("传入经纬度对象为空");
        } else if (dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
            throw new IllegalArgumentException("请传入合理经度");
        } else if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d) {
            throw new IllegalArgumentException("请传入合理纬度");
        } else {
            this.f5579d = dPoint;
        }
        return this;
    }

    public synchronized CoordinateConverter from(CoordType coordType) {
        this.f5578c = coordType;
        return this;
    }

    public static float calculateLineDistance(DPoint dPoint, DPoint dPoint2) {
        try {
            return cn.a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), dPoint2.getLatitude(), dPoint2.getLongitude()});
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
