package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.geocoding.v5.models.g;

public abstract class a extends g {
    private final String category;
    private final String id;
    private final String maki;
    private final String shortCode;
    private final String text;
    private final String wikidata;

    /* renamed from: com.mapbox.api.geocoding.v5.models.a$a  reason: collision with other inner class name */
    static final class C0299a extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26298a;

        /* renamed from: b  reason: collision with root package name */
        private String f26299b;

        /* renamed from: c  reason: collision with root package name */
        private String f26300c;

        /* renamed from: d  reason: collision with root package name */
        private String f26301d;

        /* renamed from: e  reason: collision with root package name */
        private String f26302e;

        /* renamed from: f  reason: collision with root package name */
        private String f26303f;

        C0299a() {
        }

        private C0299a(g gVar) {
            this.f26298a = gVar.id();
            this.f26299b = gVar.text();
            this.f26300c = gVar.shortCode();
            this.f26301d = gVar.wikidata();
            this.f26302e = gVar.category();
            this.f26303f = gVar.maki();
        }

        /* synthetic */ C0299a(g gVar, byte b2) {
            this(gVar);
        }
    }

    @Nullable
    public String category() {
        return this.category;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public String maki() {
        return this.maki;
    }

    @Nullable
    @SerializedName("short_code")
    public String shortCode() {
        return this.shortCode;
    }

    @Nullable
    public String text() {
        return this.text;
    }

    @Nullable
    public String wikidata() {
        return this.wikidata;
    }

    public g.a toBuilder() {
        return new C0299a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.id == null) {
            i = 0;
        } else {
            i = this.id.hashCode();
        }
        int i7 = (i ^ 1000003) * 1000003;
        if (this.text == null) {
            i2 = 0;
        } else {
            i2 = this.text.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (this.shortCode == null) {
            i3 = 0;
        } else {
            i3 = this.shortCode.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        if (this.wikidata == null) {
            i4 = 0;
        } else {
            i4 = this.wikidata.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        if (this.category == null) {
            i5 = 0;
        } else {
            i5 = this.category.hashCode();
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (this.maki != null) {
            i6 = this.maki.hashCode();
        }
        return i11 ^ i6;
    }

    public String toString() {
        return "CarmenContext{id=" + this.id + ", text=" + this.text + ", shortCode=" + this.shortCode + ", wikidata=" + this.wikidata + ", category=" + this.category + ", maki=" + this.maki + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.id != null ? this.id.equals(gVar.id()) : gVar.id() == null) {
            if (this.text != null ? this.text.equals(gVar.text()) : gVar.text() == null) {
                if (this.shortCode != null ? this.shortCode.equals(gVar.shortCode()) : gVar.shortCode() == null) {
                    if (this.wikidata != null ? this.wikidata.equals(gVar.wikidata()) : gVar.wikidata() == null) {
                        if (this.category != null ? this.category.equals(gVar.category()) : gVar.category() == null) {
                            if (this.maki != null ? !this.maki.equals(gVar.maki()) : gVar.maki() != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.id = str;
        this.text = str2;
        this.shortCode = str3;
        this.wikidata = str4;
        this.category = str5;
        this.maki = str6;
    }
}
