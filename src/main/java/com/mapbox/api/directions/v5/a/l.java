package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.as;
import java.util.List;

public abstract class l extends as {
    private final ap annotation;
    private final Double distance;
    private final Double duration;
    private final List<aq> steps;
    private final String summary;

    static final class a extends as.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26225a;

        /* renamed from: b  reason: collision with root package name */
        private Double f26226b;

        /* renamed from: c  reason: collision with root package name */
        private String f26227c;

        /* renamed from: d  reason: collision with root package name */
        private List<aq> f26228d;

        /* renamed from: e  reason: collision with root package name */
        private ap f26229e;

        a() {
        }

        private a(as asVar) {
            this.f26225a = asVar.distance();
            this.f26226b = asVar.duration();
            this.f26227c = asVar.summary();
            this.f26228d = asVar.steps();
            this.f26229e = asVar.annotation();
        }

        /* synthetic */ a(as asVar, byte b2) {
            this(asVar);
        }
    }

    @Nullable
    public ap annotation() {
        return this.annotation;
    }

    @Nullable
    public Double distance() {
        return this.distance;
    }

    @Nullable
    public Double duration() {
        return this.duration;
    }

    @Nullable
    public List<aq> steps() {
        return this.steps;
    }

    @Nullable
    public String summary() {
        return this.summary;
    }

    public as.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "RouteLeg{distance=" + this.distance + ", duration=" + this.duration + ", summary=" + this.summary + ", steps=" + this.steps + ", annotation=" + this.annotation + "}";
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.distance == null) {
            i = 0;
        } else {
            i = this.distance.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        if (this.duration == null) {
            i2 = 0;
        } else {
            i2 = this.duration.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        if (this.summary == null) {
            i3 = 0;
        } else {
            i3 = this.summary.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        if (this.steps == null) {
            i4 = 0;
        } else {
            i4 = this.steps.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        if (this.annotation != null) {
            i5 = this.annotation.hashCode();
        }
        return i9 ^ i5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        if (this.distance != null ? this.distance.equals(asVar.distance()) : asVar.distance() == null) {
            if (this.duration != null ? this.duration.equals(asVar.duration()) : asVar.duration() == null) {
                if (this.summary != null ? this.summary.equals(asVar.summary()) : asVar.summary() == null) {
                    if (this.steps != null ? this.steps.equals(asVar.steps()) : asVar.steps() == null) {
                        if (this.annotation != null ? !this.annotation.equals(asVar.annotation()) : asVar.annotation() != null) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    l(@Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable List<aq> list, @Nullable ap apVar) {
        this.distance = d2;
        this.duration = d3;
        this.summary = str;
        this.steps = list;
        this.annotation = apVar;
    }
}
