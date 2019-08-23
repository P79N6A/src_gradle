package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.ao;
import java.util.List;

public abstract class h extends ao {
    private final List<String> indications;
    private final Boolean valid;

    static final class a extends ao.a {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f26208a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f26209b;

        a() {
        }

        private a(ao aoVar) {
            this.f26208a = aoVar.valid();
            this.f26209b = aoVar.indications();
        }

        /* synthetic */ a(ao aoVar, byte b2) {
            this(aoVar);
        }
    }

    @Nullable
    public List<String> indications() {
        return this.indications;
    }

    @Nullable
    public Boolean valid() {
        return this.valid;
    }

    public ao.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.valid == null) {
            i = 0;
        } else {
            i = this.valid.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (this.indications != null) {
            i2 = this.indications.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "IntersectionLanes{valid=" + this.valid + ", indications=" + this.indications + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (this.valid != null ? this.valid.equals(aoVar.valid()) : aoVar.valid() == null) {
            if (this.indications != null ? !this.indications.equals(aoVar.indications()) : aoVar.indications() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    h(@Nullable Boolean bool, @Nullable List<String> list) {
        this.valid = bool;
        this.indications = list;
    }
}
