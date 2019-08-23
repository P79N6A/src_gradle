package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.mapbox.api.matching.v5.models.i;

public abstract class a extends i {
    private final String code;
    private final String message;

    /* renamed from: com.mapbox.api.matching.v5.models.a$a  reason: collision with other inner class name */
    static final class C0300a extends i.a {
        C0300a() {
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
        return "MapMatchingError{code=" + this.code + ", message=" + this.message + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.code != null ? this.code.equals(iVar.code()) : iVar.code() == null) {
            if (this.message != null ? !this.message.equals(iVar.message()) : iVar.message() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    a(@Nullable String str, @Nullable String str2) {
        this.code = str;
        this.message = str2;
    }
}
