package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_GeometryCollection  reason: invalid class name */
public abstract class C$AutoValue_GeometryCollection extends GeometryCollection {
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @NonNull
    public List<Geometry> geometries() {
        return this.geometries;
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
        return ((hashCode ^ i) * 1000003) ^ this.geometries.hashCode();
    }

    public String toString() {
        return "GeometryCollection{type=" + this.type + ", bbox=" + this.bbox + ", geometries=" + this.geometries + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeometryCollection)) {
            return false;
        }
        GeometryCollection geometryCollection = (GeometryCollection) obj;
        if (!this.type.equals(geometryCollection.type()) || (this.bbox != null ? !this.bbox.equals(geometryCollection.bbox()) : geometryCollection.bbox() != null) || !this.geometries.equals(geometryCollection.geometries())) {
            return false;
        }
        return true;
    }

    C$AutoValue_GeometryCollection(String str, @Nullable BoundingBox boundingBox, List<Geometry> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.geometries = list;
                return;
            }
            throw new NullPointerException("Null geometries");
        }
        throw new NullPointerException("Null type");
    }
}
