package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.al;
import java.util.List;

public abstract class e extends al {
    private final String code;
    private final String message;
    private final List<am> routes;
    private final String uuid;
    private final List<an> waypoints;

    static final class a extends al.a {

        /* renamed from: a  reason: collision with root package name */
        private String f26195a;

        /* renamed from: b  reason: collision with root package name */
        private String f26196b;

        /* renamed from: c  reason: collision with root package name */
        private List<an> f26197c;

        /* renamed from: d  reason: collision with root package name */
        private List<am> f26198d;

        /* renamed from: e  reason: collision with root package name */
        private String f26199e;

        a() {
        }

        public final al a() {
            String str = "";
            if (this.f26195a == null) {
                str = str + " code";
            }
            if (this.f26198d == null) {
                str = str + " routes";
            }
            if (str.isEmpty()) {
                u uVar = new u(this.f26195a, this.f26196b, this.f26197c, this.f26198d, this.f26199e);
                return uVar;
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public final al.a a(List<am> list) {
            if (list != null) {
                this.f26198d = list;
                return this;
            }
            throw new NullPointerException("Null routes");
        }

        private a(al alVar) {
            this.f26195a = alVar.code();
            this.f26196b = alVar.message();
            this.f26197c = alVar.waypoints();
            this.f26198d = alVar.routes();
            this.f26199e = alVar.uuid();
        }

        /* synthetic */ a(al alVar, byte b2) {
            this(alVar);
        }
    }

    @NonNull
    public String code() {
        return this.code;
    }

    @Nullable
    public String message() {
        return this.message;
    }

    @NonNull
    public List<am> routes() {
        return this.routes;
    }

    @Nullable
    public String uuid() {
        return this.uuid;
    }

    @Nullable
    public List<an> waypoints() {
        return this.waypoints;
    }

    public al.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "DirectionsResponse{code=" + this.code + ", message=" + this.message + ", waypoints=" + this.waypoints + ", routes=" + this.routes + ", uuid=" + this.uuid + "}";
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
        if (this.waypoints == null) {
            i2 = 0;
        } else {
            i2 = this.waypoints.hashCode();
        }
        int hashCode2 = (((i4 ^ i2) * 1000003) ^ this.routes.hashCode()) * 1000003;
        if (this.uuid != null) {
            i3 = this.uuid.hashCode();
        }
        return hashCode2 ^ i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (!this.code.equals(alVar.code()) || (this.message != null ? !this.message.equals(alVar.message()) : alVar.message() != null) || (this.waypoints != null ? !this.waypoints.equals(alVar.waypoints()) : alVar.waypoints() != null) || !this.routes.equals(alVar.routes()) || (this.uuid != null ? !this.uuid.equals(alVar.uuid()) : alVar.uuid() != null)) {
            return false;
        }
        return true;
    }

    e(String str, @Nullable String str2, @Nullable List<an> list, List<am> list2, @Nullable String str3) {
        if (str != null) {
            this.code = str;
            this.message = str2;
            this.waypoints = list;
            if (list2 != null) {
                this.routes = list2;
                this.uuid = str3;
                return;
            }
            throw new NullPointerException("Null routes");
        }
        throw new NullPointerException("Null code");
    }
}
