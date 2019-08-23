package com.mapbox.api.matching.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.matching.v5.models.k;
import java.util.List;

public abstract class c extends k {
    private final String code;
    private final List<j> matchings;
    private final String message;
    private final List<l> tracepoints;

    static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26332a;

        /* renamed from: b  reason: collision with root package name */
        private String f26333b;

        /* renamed from: c  reason: collision with root package name */
        private List<j> f26334c;

        /* renamed from: d  reason: collision with root package name */
        private List<l> f26335d;

        a() {
        }

        private a(k kVar) {
            this.f26332a = kVar.code();
            this.f26333b = kVar.message();
            this.f26334c = kVar.matchings();
            this.f26335d = kVar.tracepoints();
        }

        /* synthetic */ a(k kVar, byte b2) {
            this(kVar);
        }
    }

    @NonNull
    public String code() {
        return this.code;
    }

    @Nullable
    public List<j> matchings() {
        return this.matchings;
    }

    @Nullable
    public String message() {
        return this.message;
    }

    @Nullable
    public List<l> tracepoints() {
        return this.tracepoints;
    }

    public k.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.code.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        if (this.message == null) {
            i = 0;
        } else {
            i = this.message.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        if (this.matchings == null) {
            i2 = 0;
        } else {
            i2 = this.matchings.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.tracepoints != null) {
            i3 = this.tracepoints.hashCode();
        }
        return i5 ^ i3;
    }

    public String toString() {
        return "MapMatchingResponse{code=" + this.code + ", message=" + this.message + ", matchings=" + this.matchings + ", tracepoints=" + this.tracepoints + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.code.equals(kVar.code()) || (this.message != null ? !this.message.equals(kVar.message()) : kVar.message() != null) || (this.matchings != null ? !this.matchings.equals(kVar.matchings()) : kVar.matchings() != null) || (this.tracepoints != null ? !this.tracepoints.equals(kVar.tracepoints()) : kVar.tracepoints() != null)) {
            return false;
        }
        return true;
    }

    c(String str, @Nullable String str2, @Nullable List<j> list, @Nullable List<l> list2) {
        if (str != null) {
            this.code = str;
            this.message = str2;
            this.matchings = list;
            this.tracepoints = list2;
            return;
        }
        throw new NullPointerException("Null code");
    }
}
