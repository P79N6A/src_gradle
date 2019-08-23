package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_Polygon  reason: invalid class name */
public abstract class C$AutoValue_Polygon extends Polygon {
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @NonNull
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        if (this.bbox == null) {
            i = 0;
        } else {
            i = this.bbox.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.coordinates.hashCode();
    }

    public String toString() {
        return "Polygon{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Polygon)) {
            return false;
        }
        Polygon polygon = (Polygon) obj;
        if (!this.type.equals(polygon.type()) || (this.bbox != null ? !this.bbox.equals(polygon.bbox()) : polygon.bbox() != null) || !this.coordinates.equals(polygon.coordinates())) {
            return false;
        }
        return true;
    }

    C$AutoValue_Polygon(String str, @Nullable BoundingBox boundingBox, List<List<Point>> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.coordinates = list;
                return;
            }
            throw new NullPointerException("Null coordinates");
        }
        throw new NullPointerException("Null type");
    }
}
