package com.mapbox.turf;

import android.support.annotation.NonNull;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a {
    private static double[] a(@NonNull Point point) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        return a((List<Point>) arrayList);
    }

    private static double[] a(@NonNull LineString lineString) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lineString.coordinates());
        return a((List<Point>) arrayList);
    }

    private static double[] a(@NonNull MultiLineString multiLineString) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < multiLineString.coordinates().size(); i++) {
            arrayList.addAll((Collection) multiLineString.coordinates().get(i));
        }
        return a((List<Point>) arrayList);
    }

    private static double[] a(@NonNull MultiPoint multiPoint) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(multiPoint.coordinates());
        return a((List<Point>) arrayList);
    }

    public static double[] a(Geometry geometry) {
        if (geometry instanceof Point) {
            return a((Point) geometry);
        }
        if (geometry instanceof MultiPoint) {
            return a((MultiPoint) geometry);
        }
        if (geometry instanceof LineString) {
            return a((LineString) geometry);
        }
        if (geometry instanceof MultiLineString) {
            return a((MultiLineString) geometry);
        }
        if (geometry instanceof Polygon) {
            return a((Polygon) geometry);
        }
        if (geometry instanceof MultiPolygon) {
            return a((MultiPolygon) geometry);
        }
        if (geometry instanceof GeometryCollection) {
            ArrayList arrayList = new ArrayList();
            for (Geometry a2 : ((GeometryCollection) geometry).geometries()) {
                double[] a3 = a(a2);
                arrayList.add(Point.fromLngLat(a3[0], a3[1]));
                arrayList.add(Point.fromLngLat(a3[2], a3[1]));
                arrayList.add(Point.fromLngLat(a3[2], a3[3]));
                arrayList.add(Point.fromLngLat(a3[0], a3[3]));
            }
            return a(MultiPoint.fromLngLats((List<Point>) arrayList));
        }
        throw new RuntimeException("Unknown geometry class: " + geometry.getClass());
    }

    private static double[] a(MultiPolygon multiPolygon) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < multiPolygon.coordinates().size(); i++) {
            for (int i2 = 0; i2 < ((List) multiPolygon.coordinates().get(i)).size(); i2++) {
                for (int i3 = 0; i3 < ((List) ((List) multiPolygon.coordinates().get(i)).get(i2)).size() - 0; i3++) {
                    arrayList.add((Point) ((List) ((List) multiPolygon.coordinates().get(i)).get(i2)).get(i3));
                }
            }
        }
        return a((List<Point>) arrayList);
    }

    private static double[] a(@NonNull Polygon polygon) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < polygon.coordinates().size(); i++) {
            for (int i2 = 0; i2 < ((List) polygon.coordinates().get(i)).size() - 0; i2++) {
                arrayList.add((Point) ((List) polygon.coordinates().get(i)).get(i2));
            }
        }
        return a((List<Point>) arrayList);
    }

    private static double[] a(List<Point> list) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (Point next : list) {
            if (dArr[0] > next.longitude()) {
                dArr[0] = next.longitude();
            }
            if (dArr[1] > next.latitude()) {
                dArr[1] = next.latitude();
            }
            if (dArr[2] < next.longitude()) {
                dArr[2] = next.longitude();
            }
            if (dArr[3] < next.latitude()) {
                dArr[3] = next.latitude();
            }
        }
        return dArr;
    }
}
