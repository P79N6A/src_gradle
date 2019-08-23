package com.amap.api.maps2d;

import com.amap.api.mapcore2d.cg;
import com.amap.api.mapcore2d.ci;
import com.amap.api.mapcore2d.cj;
import com.amap.api.mapcore2d.cl;
import com.amap.api.maps2d.model.LatLng;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public class CoordinateConverter {

    /* renamed from: a  reason: collision with root package name */
    private CoordType f6315a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f6316b;

    /* renamed from: com.amap.api.maps2d.CoordinateConverter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6317a = new int[CoordType.values().length];

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
                com.amap.api.maps2d.CoordinateConverter$CoordType[] r0 = com.amap.api.maps2d.CoordinateConverter.CoordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6317a = r0
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.BAIDU     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.MAPBAR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.MAPABC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.SOSOMAP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.ALIYUN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.GOOGLE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f6317a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.amap.api.maps2d.CoordinateConverter$CoordType r1 = com.amap.api.maps2d.CoordinateConverter.CoordType.GPS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.maps2d.CoordinateConverter.AnonymousClass1.<clinit>():void");
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

    public LatLng convert() {
        LatLng latLng;
        LatLng latLng2 = null;
        if (this.f6315a == null || this.f6316b == null) {
            return null;
        }
        try {
            switch (AnonymousClass1.f6317a[this.f6315a.ordinal()]) {
                case 1:
                    latLng = cg.a(this.f6316b);
                    break;
                case 2:
                    latLng = ci.a(this.f6316b);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    latLng = this.f6316b;
                    break;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    latLng2 = cj.a(this.f6316b);
                    break;
            }
            latLng = latLng2;
        } catch (Throwable unused) {
            latLng = this.f6316b;
        }
        return latLng;
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.f6316b = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.f6315a = coordType;
        return this;
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return cl.a(d2, d3);
    }
}
