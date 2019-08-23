package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_FeatureCollection  reason: invalid class name */
public abstract class C$AutoValue_FeatureCollection extends FeatureCollection {
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Nullable
    public List<Feature> features() {
        return this.features;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        int i2 = 0;
        if (this.bbox == null) {
            i = 0;
        } else {
            i = this.bbox.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (this.features != null) {
            i2 = this.features.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "FeatureCollection{type=" + this.type + ", bbox=" + this.bbox + ", features=" + this.features + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureCollection)) {
            return false;
        }
        FeatureCollection featureCollection = (FeatureCollection) obj;
        if (!this.type.equals(featureCollection.type()) || (this.bbox != null ? !this.bbox.equals(featureCollection.bbox()) : featureCollection.bbox() != null) || (this.features != null ? !this.features.equals(featureCollection.features()) : featureCollection.features() != null)) {
            return false;
        }
        return true;
    }

    C$AutoValue_FeatureCollection(String str, @Nullable BoundingBox boundingBox, @Nullable List<Feature> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.features = list;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
