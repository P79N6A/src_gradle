package com.mapbox.api.matrix.v1.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.an;
import com.mapbox.api.matrix.v1.a.c;
import java.util.List;

public abstract class a extends c {
    private final String code;
    private final List<an> destinations;
    private final List<Double[]> durations;
    private final List<an> sources;

    /* renamed from: com.mapbox.api.matrix.v1.a.a$a  reason: collision with other inner class name */
    static final class C0301a extends c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26356a;

        /* renamed from: b  reason: collision with root package name */
        private List<an> f26357b;

        /* renamed from: c  reason: collision with root package name */
        private List<an> f26358c;

        /* renamed from: d  reason: collision with root package name */
        private List<Double[]> f26359d;

        C0301a() {
        }

        private C0301a(c cVar) {
            this.f26356a = cVar.code();
            this.f26357b = cVar.destinations();
            this.f26358c = cVar.sources();
            this.f26359d = cVar.durations();
        }

        /* synthetic */ C0301a(c cVar, byte b2) {
            this(cVar);
        }
    }

    @NonNull
    public String code() {
        return this.code;
    }

    @Nullable
    public List<an> destinations() {
        return this.destinations;
    }

    @Nullable
    public List<Double[]> durations() {
        return this.durations;
    }

    @Nullable
    public List<an> sources() {
        return this.sources;
    }

    public c.a toBuilder() {
        return new C0301a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.code.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        if (this.destinations == null) {
            i = 0;
        } else {
            i = this.destinations.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        if (this.sources == null) {
            i2 = 0;
        } else {
            i2 = this.sources.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.durations != null) {
            i3 = this.durations.hashCode();
        }
        return i5 ^ i3;
    }

    public String toString() {
        return "MatrixResponse{code=" + this.code + ", destinations=" + this.destinations + ", sources=" + this.sources + ", durations=" + this.durations + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.code.equals(cVar.code()) || (this.destinations != null ? !this.destinations.equals(cVar.destinations()) : cVar.destinations() != null) || (this.sources != null ? !this.sources.equals(cVar.sources()) : cVar.sources() != null) || (this.durations != null ? !this.durations.equals(cVar.durations()) : cVar.durations() != null)) {
            return false;
        }
        return true;
    }

    a(String str, @Nullable List<an> list, @Nullable List<an> list2, @Nullable List<Double[]> list3) {
        if (str != null) {
            this.code = str;
            this.destinations = list;
            this.sources = list2;
            this.durations = list3;
            return;
        }
        throw new NullPointerException("Null code");
    }
}
