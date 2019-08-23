package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_MultiPoint  reason: invalid class name */
public abstract class C$AutoValue_MultiPoint extends MultiPoint {
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @NonNull
    public List<Point> coordinates() {
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
        return "MultiPoint{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiPoint)) {
            return false;
        }
        MultiPoint multiPoint = (MultiPoint) obj;
        if (!this.type.equals(multiPoint.type()) || (this.bbox != null ? !this.bbox.equals(multiPoint.bbox()) : multiPoint.bbox() != null) || !this.coordinates.equals(multiPoint.coordinates())) {
            return false;
        }
        return true;
    }

    C$AutoValue_MultiPoint(String str, @Nullable BoundingBox boundingBox, List<Point> list) {
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
