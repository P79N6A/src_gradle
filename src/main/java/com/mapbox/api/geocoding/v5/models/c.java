package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import com.mapbox.api.geocoding.v5.models.i;
import java.util.List;

public abstract class c extends i {
    private final String attribution;
    private final List<h> features;
    private final List<String> query;
    private final String type;

    static final class a extends i.a {

        /* renamed from: a  reason: collision with root package name */
        String f26310a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f26311b;

        /* renamed from: c  reason: collision with root package name */
        private List<h> f26312c;

        /* renamed from: d  reason: collision with root package name */
        private String f26313d;

        a() {
        }

        private a(i iVar) {
            this.f26310a = iVar.type();
            this.f26311b = iVar.query();
            this.f26312c = iVar.features();
            this.f26313d = iVar.attribution();
        }

        /* synthetic */ a(i iVar, byte b2) {
            this(iVar);
        }
    }

    @NonNull
    public String attribution() {
        return this.attribution;
    }

    @NonNull
    public List<h> features() {
        return this.features;
    }

    @NonNull
    public List<String> query() {
        return this.query;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    public i.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        return ((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.query.hashCode()) * 1000003) ^ this.features.hashCode()) * 1000003) ^ this.attribution.hashCode();
    }

    public String toString() {
        return "GeocodingResponse{type=" + this.type + ", query=" + this.query + ", features=" + this.features + ", attribution=" + this.attribution + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.type.equals(iVar.type()) || !this.query.equals(iVar.query()) || !this.features.equals(iVar.features()) || !this.attribution.equals(iVar.attribution())) {
            return false;
        }
        return true;
    }

    c(String str, List<String> list, List<h> list2, String str2) {
        if (str != null) {
            this.type = str;
            if (list != null) {
                this.query = list;
                if (list2 != null) {
                    this.features = list2;
                    if (str2 != null) {
                        this.attribution = str2;
                        return;
                    }
                    throw new NullPointerException("Null attribution");
                }
                throw new NullPointerException("Null features");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null type");
    }
}
