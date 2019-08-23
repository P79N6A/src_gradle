package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.ap;
import java.util.List;

public abstract class i extends ap {
    private final List<String> congestion;
    private final List<Double> distance;
    private final List<Double> duration;
    private final List<ar> maxspeed;
    private final List<Double> speed;

    static final class a extends ap.a {

        /* renamed from: a  reason: collision with root package name */
        private List<Double> f26210a;

        /* renamed from: b  reason: collision with root package name */
        private List<Double> f26211b;

        /* renamed from: c  reason: collision with root package name */
        private List<Double> f26212c;

        /* renamed from: d  reason: collision with root package name */
        private List<ar> f26213d;

        /* renamed from: e  reason: collision with root package name */
        private List<String> f26214e;

        a() {
        }

        private a(ap apVar) {
            this.f26210a = apVar.distance();
            this.f26211b = apVar.duration();
            this.f26212c = apVar.speed();
            this.f26213d = apVar.maxspeed();
            this.f26214e = apVar.congestion();
        }

        /* synthetic */ a(ap apVar, byte b2) {
            this(apVar);
        }
    }

    @Nullable
    public List<String> congestion() {
        return this.congestion;
    }

    @Nullable
    public List<Double> distance() {
        return this.distance;
    }

    @Nullable
    public List<Double> duration() {
        return this.duration;
    }

    @Nullable
    public List<ar> maxspeed() {
        return this.maxspeed;
    }

    @Nullable
    public List<Double> speed() {
        return this.speed;
    }

    public ap.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public String toString() {
        return "LegAnnotation{distance=" + this.distance + ", duration=" + this.duration + ", speed=" + this.speed + ", maxspeed=" + this.maxspeed + ", congestion=" + this.congestion + "}";
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
        if (this.speed == null) {
            i3 = 0;
        } else {
            i3 = this.speed.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        if (this.maxspeed == null) {
            i4 = 0;
        } else {
            i4 = this.maxspeed.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        if (this.congestion != null) {
            i5 = this.congestion.hashCode();
        }
        return i9 ^ i5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if (this.distance != null ? this.distance.equals(apVar.distance()) : apVar.distance() == null) {
            if (this.duration != null ? this.duration.equals(apVar.duration()) : apVar.duration() == null) {
                if (this.speed != null ? this.speed.equals(apVar.speed()) : apVar.speed() == null) {
                    if (this.maxspeed != null ? this.maxspeed.equals(apVar.maxspeed()) : apVar.maxspeed() == null) {
                        if (this.congestion != null ? !this.congestion.equals(apVar.congestion()) : apVar.congestion() != null) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    i(@Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable List<ar> list4, @Nullable List<String> list5) {
        this.distance = list;
        this.duration = list2;
        this.speed = list3;
        this.maxspeed = list4;
        this.congestion = list5;
    }
}
