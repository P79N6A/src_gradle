package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.aj;

public abstract class d extends aj {
    private final String code;
    private final String message;

    static final class a extends aj.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26193a;

        /* renamed from: b  reason: collision with root package name */
        private String f26194b;

        a() {
        }

        private a(aj ajVar) {
            this.f26193a = ajVar.code();
            this.f26194b = ajVar.message();
        }

        /* synthetic */ a(aj ajVar, byte b2) {
            this(ajVar);
        }
    }

    @Nullable
    public String code() {
        return this.code;
    }

    @Nullable
    public String message() {
        return this.message;
    }

    public aj.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.code == null) {
            i = 0;
        } else {
            i = this.code.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (this.message != null) {
            i2 = this.message.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "DirectionsError{code=" + this.code + ", message=" + this.message + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if (this.code != null ? this.code.equals(ajVar.code()) : ajVar.code() == null) {
            if (this.message != null ? !this.message.equals(ajVar.message()) : ajVar.message() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    d(@Nullable String str, @Nullable String str2) {
        this.code = str;
        this.message = str2;
    }
}
