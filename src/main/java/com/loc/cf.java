package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.CoordUtil;
import com.amap.api.location.DPoint;
import java.io.File;
import java.math.BigDecimal;

public final class cf {

    /* renamed from: a  reason: collision with root package name */
    static double f25650a = 3.141592653589793d;

    private static double a(double d2) {
        return Math.sin(d2 * 3000.0d * (f25650a / 180.0d)) * 2.0E-5d;
    }

    private static double a(double d2, double d3) {
        return (Math.cos(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.sin(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    public static DPoint a(Context context, DPoint dPoint) {
        if (context == null) {
            return null;
        }
        String a2 = db.a(context, "libwgs2gcj.so");
        if (!TextUtils.isEmpty(a2) && new File(a2).exists() && !CoordUtil.isLoadedSo()) {
            try {
                System.load(a2);
                CoordUtil.setLoadedSo(true);
            } catch (Throwable th) {
                ce.a(th, "OffsetUtil", "offset");
            }
        }
        return a(dPoint, CoordUtil.isLoadedSo());
    }

    public static DPoint a(DPoint dPoint) {
        if (dPoint != null) {
            double d2 = 0.006401062d;
            double d3 = 0.0060424805d;
            DPoint dPoint2 = null;
            int i = 0;
            while (i < 2) {
                try {
                    double longitude = dPoint.getLongitude();
                    double latitude = dPoint.getLatitude();
                    dPoint2 = new DPoint();
                    double d4 = longitude - d2;
                    double d5 = latitude - d3;
                    DPoint dPoint3 = new DPoint();
                    double d6 = (d4 * d4) + (d5 * d5);
                    dPoint3.setLongitude(c((Math.cos(b(d4) + Math.atan2(d5, d4)) * (a(d5) + Math.sqrt(d6))) + 0.0065d));
                    dPoint3.setLatitude(c((Math.sin(b(d4) + Math.atan2(d5, d4)) * (a(d5) + Math.sqrt(d6))) + 0.006d));
                    dPoint2.setLongitude(c((longitude + d4) - dPoint3.getLongitude()));
                    dPoint2.setLatitude(c((latitude + d5) - dPoint3.getLatitude()));
                    d2 = dPoint.getLongitude() - dPoint2.getLongitude();
                    d3 = dPoint.getLatitude() - dPoint2.getLatitude();
                    i++;
                } catch (Throwable th) {
                    ce.a(th, "OffsetUtil", "b2G");
                }
            }
            return dPoint2;
        }
        return dPoint;
    }

    private static DPoint a(DPoint dPoint, boolean z) {
        double longitude;
        double latitude;
        try {
            if (!ce.a(dPoint.getLatitude(), dPoint.getLongitude())) {
                return dPoint;
            }
            double[] dArr = new double[2];
            if (z) {
                try {
                    if (CoordUtil.convertToGcj(new double[]{dPoint.getLongitude(), dPoint.getLatitude()}, dArr) != 0) {
                        longitude = dPoint.getLongitude();
                        latitude = dPoint.getLatitude();
                    }
                } catch (Throwable th) {
                    ce.a(th, "OffsetUtil", "cover part1");
                    longitude = dPoint.getLongitude();
                    latitude = dPoint.getLatitude();
                }
                return new DPoint(dArr[1], dArr[0]);
            }
            longitude = dPoint.getLongitude();
            latitude = dPoint.getLatitude();
            dArr = co.a(longitude, latitude);
            return new DPoint(dArr[1], dArr[0]);
        } catch (Throwable th2) {
            ce.a(th2, "OffsetUtil", "cover part2");
            return dPoint;
        }
    }

    private static double b(double d2) {
        return Math.cos(d2 * 3000.0d * (f25650a / 180.0d)) * 3.0E-6d;
    }

    private static double b(double d2, double d3) {
        return (Math.sin(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.cos(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    public static DPoint b(Context context, DPoint dPoint) {
        try {
            double longitude = (double) (((long) (dPoint.getLongitude() * 100000.0d)) % 36000000);
            double latitude = (double) (((long) (dPoint.getLatitude() * 100000.0d)) % 36000000);
            double d2 = -a(longitude, latitude);
            Double.isNaN(longitude);
            int i = (int) (d2 + longitude);
            double d3 = -b(longitude, latitude);
            Double.isNaN(latitude);
            double d4 = (double) i;
            double d5 = (double) ((int) (d3 + latitude));
            double d6 = -a(d4, d5);
            Double.isNaN(longitude);
            double d7 = d6 + longitude;
            int i2 = -1;
            double d8 = (double) (longitude > 0.0d ? 1 : -1);
            Double.isNaN(d8);
            double d9 = (double) ((int) (d7 + d8));
            double d10 = -b(d9, d5);
            Double.isNaN(latitude);
            double d11 = d10 + latitude;
            if (latitude > 0.0d) {
                i2 = 1;
            }
            double d12 = (double) i2;
            Double.isNaN(d12);
            Double.isNaN(d9);
            double d13 = d9 / 100000.0d;
            double d14 = (double) ((int) (d11 + d12));
            Double.isNaN(d14);
            DPoint dPoint2 = new DPoint(d14 / 100000.0d, d13);
            Context context2 = context;
            return a(context, dPoint2);
        } catch (Throwable th) {
            ce.a(th, "OffsetUtil", "marbar2G");
            return dPoint;
        }
    }

    private static double c(double d2) {
        return new BigDecimal(d2).setScale(8, 4).doubleValue();
    }
}
