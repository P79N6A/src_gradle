package com.mapbox.geojson;

import android.support.annotation.NonNull;

/* renamed from: com.mapbox.geojson.$AutoValue_BoundingBox  reason: invalid class name */
public abstract class C$AutoValue_BoundingBox extends BoundingBox {
    private final Point northeast;
    private final Point southwest;

    @NonNull
    public Point northeast() {
        return this.northeast;
    }

    @NonNull
    public Point southwest() {
        return this.southwest;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        if (!this.southwest.equals(boundingBox.southwest()) || !this.northeast.equals(boundingBox.northeast())) {
            return false;
        }
        return true;
    }

    C$AutoValue_BoundingBox(Point point, Point point2) {
        if (point != null) {
            this.southwest = point;
            if (point2 != null) {
                this.northeast = point2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }
}
