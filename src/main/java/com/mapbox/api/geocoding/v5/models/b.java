package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.geocoding.v5.models.h;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import java.util.Arrays;
import java.util.List;

public abstract class b extends h {
    private final String address;
    private final BoundingBox bbox;
    private final List<g> context;
    private final Geometry geometry;
    private final String id;
    private final String language;
    private final String matchingPlaceName;
    private final String matchingText;
    private final String placeName;
    private final List<String> placeType;
    private final JsonObject properties;
    private final double[] rawCenter;
    private final Double relevance;
    private final String text;
    private final String type;

    static final class a extends h.a {

        /* renamed from: a  reason: collision with root package name */
        String f26304a;

        /* renamed from: b  reason: collision with root package name */
        private BoundingBox f26305b;

        /* renamed from: c  reason: collision with root package name */
        private String f26306c;

        /* renamed from: d  reason: collision with root package name */
        private Geometry f26307d;

        /* renamed from: e  reason: collision with root package name */
        private JsonObject f26308e;

        /* renamed from: f  reason: collision with root package name */
        private String f26309f;
        private String g;
        private List<String> h;
        private String i;
        private double[] j;
        private List<g> k;
        private Double l;
        private String m;
        private String n;
        private String o;

        a() {
        }

        public final h a() {
            String str = "";
            if (this.f26304a == null) {
                str = str + " type";
            }
            if (str.isEmpty()) {
                e eVar = new e(this.f26304a, this.f26305b, this.f26306c, this.f26307d, this.f26308e, this.f26309f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                return eVar;
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public final h.a a(@Nullable JsonObject jsonObject) {
            this.f26308e = jsonObject;
            return this;
        }

        private a(h hVar) {
            this.f26304a = hVar.type();
            this.f26305b = hVar.bbox();
            this.f26306c = hVar.id();
            this.f26307d = hVar.geometry();
            this.f26308e = hVar.properties();
            this.f26309f = hVar.text();
            this.g = hVar.placeName();
            this.h = hVar.placeType();
            this.i = hVar.address();
            this.j = hVar.a();
            this.k = hVar.context();
            this.l = hVar.relevance();
            this.m = hVar.matchingText();
            this.n = hVar.matchingPlaceName();
            this.o = hVar.language();
        }

        /* synthetic */ a(h hVar, byte b2) {
            this(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("center")
    public final double[] a() {
        return this.rawCenter;
    }

    @Nullable
    public String address() {
        return this.address;
    }

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Nullable
    public List<g> context() {
        return this.context;
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
    public String language() {
        return this.language;
    }

    @Nullable
    @SerializedName("matching_place_name")
    public String matchingPlaceName() {
        return this.matchingPlaceName;
    }

    @Nullable
    @SerializedName("matching_text")
    public String matchingText() {
        return this.matchingText;
    }

    @Nullable
    @SerializedName("place_name")
    public String placeName() {
        return this.placeName;
    }

    @Nullable
    @SerializedName("place_type")
    public List<String> placeType() {
        return this.placeType;
    }

    @Nullable
    public JsonObject properties() {
        return this.properties;
    }

    @Nullable
    public Double relevance() {
        return this.relevance;
    }

    @Nullable
    public String text() {
        return this.text;
    }

    @SerializedName("type")
    @NonNull
    public String type() {
        return this.type;
    }

    public h.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        int i13 = 0;
        if (this.bbox == null) {
            i = 0;
        } else {
            i = this.bbox.hashCode();
        }
        int i14 = (hashCode ^ i) * 1000003;
        if (this.id == null) {
            i2 = 0;
        } else {
            i2 = this.id.hashCode();
        }
        int i15 = (i14 ^ i2) * 1000003;
        if (this.geometry == null) {
            i3 = 0;
        } else {
            i3 = this.geometry.hashCode();
        }
        int i16 = (i15 ^ i3) * 1000003;
        if (this.properties == null) {
            i4 = 0;
        } else {
            i4 = this.properties.hashCode();
        }
        int i17 = (i16 ^ i4) * 1000003;
        if (this.text == null) {
            i5 = 0;
        } else {
            i5 = this.text.hashCode();
        }
        int i18 = (i17 ^ i5) * 1000003;
        if (this.placeName == null) {
            i6 = 0;
        } else {
            i6 = this.placeName.hashCode();
        }
        int i19 = (i18 ^ i6) * 1000003;
        if (this.placeType == null) {
            i7 = 0;
        } else {
            i7 = this.placeType.hashCode();
        }
        int i20 = (i19 ^ i7) * 1000003;
        if (this.address == null) {
            i8 = 0;
        } else {
            i8 = this.address.hashCode();
        }
        int hashCode2 = (((i20 ^ i8) * 1000003) ^ Arrays.hashCode(this.rawCenter)) * 1000003;
        if (this.context == null) {
            i9 = 0;
        } else {
            i9 = this.context.hashCode();
        }
        int i21 = (hashCode2 ^ i9) * 1000003;
        if (this.relevance == null) {
            i10 = 0;
        } else {
            i10 = this.relevance.hashCode();
        }
        int i22 = (i21 ^ i10) * 1000003;
        if (this.matchingText == null) {
            i11 = 0;
        } else {
            i11 = this.matchingText.hashCode();
        }
        int i23 = (i22 ^ i11) * 1000003;
        if (this.matchingPlaceName == null) {
            i12 = 0;
        } else {
            i12 = this.matchingPlaceName.hashCode();
        }
        int i24 = (i23 ^ i12) * 1000003;
        if (this.language != null) {
            i13 = this.language.hashCode();
        }
        return i24 ^ i13;
    }

    public String toString() {
        return "CarmenFeature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.id + ", geometry=" + this.geometry + ", properties=" + this.properties + ", text=" + this.text + ", placeName=" + this.placeName + ", placeType=" + this.placeType + ", address=" + this.address + ", rawCenter=" + Arrays.toString(this.rawCenter) + ", context=" + this.context + ", relevance=" + this.relevance + ", matchingText=" + this.matchingText + ", matchingPlaceName=" + this.matchingPlaceName + ", language=" + this.language + "}";
    }

    public boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.type.equals(hVar.type()) && (this.bbox != null ? this.bbox.equals(hVar.bbox()) : hVar.bbox() == null) && (this.id != null ? this.id.equals(hVar.id()) : hVar.id() == null) && (this.geometry != null ? this.geometry.equals(hVar.geometry()) : hVar.geometry() == null) && (this.properties != null ? this.properties.equals(hVar.properties()) : hVar.properties() == null) && (this.text != null ? this.text.equals(hVar.text()) : hVar.text() == null) && (this.placeName != null ? this.placeName.equals(hVar.placeName()) : hVar.placeName() == null) && (this.placeType != null ? this.placeType.equals(hVar.placeType()) : hVar.placeType() == null) && (this.address != null ? this.address.equals(hVar.address()) : hVar.address() == null)) {
            double[] dArr2 = this.rawCenter;
            if (hVar instanceof b) {
                dArr = ((b) hVar).rawCenter;
            } else {
                dArr = hVar.a();
            }
            if (!Arrays.equals(dArr2, dArr) || (this.context != null ? !this.context.equals(hVar.context()) : hVar.context() != null) || (this.relevance != null ? !this.relevance.equals(hVar.relevance()) : hVar.relevance() != null) || (this.matchingText != null ? !this.matchingText.equals(hVar.matchingText()) : hVar.matchingText() != null) || (this.matchingPlaceName != null ? !this.matchingPlaceName.equals(hVar.matchingPlaceName()) : hVar.matchingPlaceName() != null) || (this.language != null ? !this.language.equals(hVar.language()) : hVar.language() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    b(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry2, @Nullable JsonObject jsonObject, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable double[] dArr, @Nullable List<g> list2, @Nullable Double d2, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.id = str2;
            this.geometry = geometry2;
            this.properties = jsonObject;
            this.text = str3;
            this.placeName = str4;
            this.placeType = list;
            this.address = str5;
            this.rawCenter = dArr;
            this.context = list2;
            this.relevance = d2;
            this.matchingText = str6;
            this.matchingPlaceName = str7;
            this.language = str8;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
