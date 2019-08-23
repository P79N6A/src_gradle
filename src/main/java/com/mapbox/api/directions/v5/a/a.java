package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.ag;
import java.util.List;

public abstract class a extends ag {
    private final String abbreviation;
    private final Integer abbreviationPriority;
    private final Boolean active;
    private final List<String> directions;
    private final String imageBaseUrl;
    private final String text;
    private final String type;

    /* renamed from: com.mapbox.api.directions.v5.a.a$a  reason: collision with other inner class name */
    static final class C0298a extends ag.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26150a;

        /* renamed from: b  reason: collision with root package name */
        private String f26151b;

        /* renamed from: c  reason: collision with root package name */
        private String f26152c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f26153d;

        /* renamed from: e  reason: collision with root package name */
        private String f26154e;

        /* renamed from: f  reason: collision with root package name */
        private List<String> f26155f;
        private Boolean g;

        C0298a() {
        }

        private C0298a(ag agVar) {
            this.f26150a = agVar.text();
            this.f26151b = agVar.type();
            this.f26152c = agVar.abbreviation();
            this.f26153d = agVar.abbreviationPriority();
            this.f26154e = agVar.imageBaseUrl();
            this.f26155f = agVar.directions();
            this.g = agVar.active();
        }

        /* synthetic */ C0298a(ag agVar, byte b2) {
            this(agVar);
        }
    }

    @Nullable
    @SerializedName("abbr")
    public String abbreviation() {
        return this.abbreviation;
    }

    @Nullable
    @SerializedName("abbr_priority")
    public Integer abbreviationPriority() {
        return this.abbreviationPriority;
    }

    @Nullable
    public Boolean active() {
        return this.active;
    }

    @Nullable
    public List<String> directions() {
        return this.directions;
    }

    @Nullable
    @SerializedName("imageBaseURL")
    public String imageBaseUrl() {
        return this.imageBaseUrl;
    }

    public String text() {
        return this.text;
    }

    public String type() {
        return this.type;
    }

    public ag.a toBuilder() {
        return new C0298a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.text.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003;
        int i5 = 0;
        if (this.abbreviation == null) {
            i = 0;
        } else {
            i = this.abbreviation.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        if (this.abbreviationPriority == null) {
            i2 = 0;
        } else {
            i2 = this.abbreviationPriority.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        if (this.imageBaseUrl == null) {
            i3 = 0;
        } else {
            i3 = this.imageBaseUrl.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        if (this.directions == null) {
            i4 = 0;
        } else {
            i4 = this.directions.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        if (this.active != null) {
            i5 = this.active.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "BannerComponents{text=" + this.text + ", type=" + this.type + ", abbreviation=" + this.abbreviation + ", abbreviationPriority=" + this.abbreviationPriority + ", imageBaseUrl=" + this.imageBaseUrl + ", directions=" + this.directions + ", active=" + this.active + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (!this.text.equals(agVar.text()) || !this.type.equals(agVar.type()) || (this.abbreviation != null ? !this.abbreviation.equals(agVar.abbreviation()) : agVar.abbreviation() != null) || (this.abbreviationPriority != null ? !this.abbreviationPriority.equals(agVar.abbreviationPriority()) : agVar.abbreviationPriority() != null) || (this.imageBaseUrl != null ? !this.imageBaseUrl.equals(agVar.imageBaseUrl()) : agVar.imageBaseUrl() != null) || (this.directions != null ? !this.directions.equals(agVar.directions()) : agVar.directions() != null) || (this.active != null ? !this.active.equals(agVar.active()) : agVar.active() != null)) {
            return false;
        }
        return true;
    }

    a(String str, String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable List<String> list, @Nullable Boolean bool) {
        if (str != null) {
            this.text = str;
            if (str2 != null) {
                this.type = str2;
                this.abbreviation = str3;
                this.abbreviationPriority = num;
                this.imageBaseUrl = str4;
                this.directions = list;
                this.active = bool;
                return;
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null text");
    }
}
