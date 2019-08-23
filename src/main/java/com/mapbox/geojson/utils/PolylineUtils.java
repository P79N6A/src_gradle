package com.mapbox.geojson.utils;

import android.support.annotation.NonNull;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

public final class PolylineUtils {
    private PolylineUtils() {
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d2) {
        return simplify(list, d2, false);
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (longitude * longitude) + (latitude * latitude);
    }

    private static void encode(long j, StringBuilder sb) {
        long j2;
        if (j < 0) {
            j2 = (j << 1) ^ -1;
        } else {
            j2 = j << 1;
        }
        while (j2 >= 32) {
            sb.append(Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        sb.append(Character.toChars((int) (j2 + 63)));
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, boolean z) {
        return simplify(list, 1.0d, z);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d2) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d2, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d2) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i = 1; i < size; i++) {
            point2 = list.get(i);
            if (getSqDist(point2, point) > d2) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @NonNull
    public static List<Point> decode(@NonNull String str, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int length = str.length();
        double pow = Math.pow(10.0d, (double) i);
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i2 = i6 + 1;
                int charAt = (str.charAt(i6) - '?') - 1;
                i9 += charAt << i10;
                i10 += 5;
                if (charAt < 31) {
                    break;
                }
                i6 = i2;
            }
            if ((i9 & 1) != 0) {
                i3 = (i9 >> 1) ^ -1;
            } else {
                i3 = i9 >> 1;
            }
            int i11 = i3 + i7;
            int i12 = 1;
            int i13 = 0;
            while (true) {
                i4 = i2 + 1;
                int charAt2 = (str.charAt(i2) - '?') - 1;
                i12 += charAt2 << i13;
                i13 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i2 = i4;
            }
            if ((i12 & 1) != 0) {
                i5 = (i12 >> 1) ^ -1;
            } else {
                i5 = i12 >> 1;
            }
            i8 += i5;
            double d2 = (double) i8;
            Double.isNaN(d2);
            double d3 = (double) i11;
            Double.isNaN(d3);
            arrayList.add(Point.fromLngLat(d2 / pow, d3 / pow));
            i7 = i11;
            i6 = i4;
        }
        return arrayList;
    }

    @NonNull
    public static String encode(@NonNull List<Point> list, int i) {
        StringBuilder sb = new StringBuilder();
        double pow = Math.pow(10.0d, (double) i);
        long j = 0;
        long j2 = 0;
        for (Point next : list) {
            long round = Math.round(next.latitude() * pow);
            long round2 = Math.round(next.longitude() * pow);
            encode(round - j, sb);
            encode(round2 - j2, sb);
            j = round;
            j2 = round2;
        }
        return sb.toString();
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d2, boolean z) {
        if (list.size() <= 2) {
            return list;
        }
        double d3 = d2 * d2;
        if (!z) {
            list = simplifyRadialDist(list, d3);
        }
        return simplifyDouglasPeucker(list, d3);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (!(longitude2 == 0.0d && latitude2 == 0.0d)) {
            double longitude3 = (((point.longitude() - longitude) * longitude2) + ((point.latitude() - latitude) * latitude2)) / ((longitude2 * longitude2) + (latitude2 * latitude2));
            if (longitude3 > 1.0d) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (longitude3 > 0.0d) {
                longitude += longitude2 * longitude3;
                latitude += latitude2 * longitude3;
            }
        }
        double longitude4 = point.longitude() - longitude;
        double latitude3 = point.latitude() - latitude;
        return (longitude4 * longitude4) + (latitude3 * latitude3);
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i, int i2, double d2, List<Point> list2) {
        List<Point> list3 = list;
        int i3 = i2;
        ArrayList arrayList = new ArrayList();
        double d3 = d2;
        int i4 = 0;
        for (int i5 = i + 1; i5 < i3; i5++) {
            double sqSegDist = getSqSegDist(list.get(i5), list.get(i), list.get(i2));
            if (sqSegDist > d3) {
                i4 = i5;
                d3 = sqSegDist;
            }
        }
        if (d3 > d2) {
            if (i4 - i > 1) {
                arrayList.addAll(simplifyDpStep(list, i, i4, d2, list2));
            }
            arrayList.add(list.get(i4));
            if (i3 - i4 > 1) {
                arrayList.addAll(simplifyDpStep(list, i4, i2, d2, list2));
            }
        }
        return arrayList;
    }
}
