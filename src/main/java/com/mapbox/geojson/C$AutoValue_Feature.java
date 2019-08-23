package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;

/* renamed from: com.mapbox.geojson.$AutoValue_Feature  reason: invalid class name */
public abstract class C$AutoValue_Feature extends Feature {
    private final BoundingBox bbox;
    private final Geometry geometry;
    private final String id;
    private final JsonObject properties;
    private final String type;

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Nullable
    public Geometry geometry() {
        return this.geometry;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public JsonObject properties() {
        return this.properties;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.id + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        if (this.bbox == null) {
            i = 0;
        } else {
            i = this.bbox.hashCode();
        }
        int i5 = (hashCode ^ i) * 1000003;
        if (this.id == null) {
            i2 = 0;
        } else {
            i2 = this.id.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (this.geometry == null) {
            i3 = 0;
        } else {
            i3 = this.geometry.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        if (this.properties != null) {
            i4 = this.properties.hashCode();
        }
        return i7 ^ i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (!this.type.equals(feature.type()) || (this.bbox != null ? !this.bbox.equals(feature.bbox()) : feature.bbox() != null) || (this.id != null ? !this.id.equals(feature.id()) : feature.id() != null) || (this.geometry != null ? !this.geometry.equals(feature.geometry()) : feature.geometry() != null) || (this.properties != null ? !this.properties.equals(feature.properties()) : feature.properties() != null)) {
            return false;
        }
        return true;
    }

    C$AutoValue_Feature(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry2, @Nullable JsonObject jsonObject) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.id = str2;
            this.geometry = geometry2;
            this.properties = jsonObject;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
