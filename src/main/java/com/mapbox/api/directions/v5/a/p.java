package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.a.aw;

public abstract class p extends aw {
    private final String announcement;
    private final Double distanceAlongGeometry;
    private final String ssmlAnnouncement;

    static final class a extends aw.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f26248a;

        /* renamed from: b  reason: collision with root package name */
        private String f26249b;

        /* renamed from: c  reason: collision with root package name */
        private String f26250c;

        a() {
        }

        private a(aw awVar) {
            this.f26248a = awVar.distanceAlongGeometry();
            this.f26249b = awVar.announcement();
            this.f26250c = awVar.ssmlAnnouncement();
        }

        /* synthetic */ a(aw awVar, byte b2) {
            this(awVar);
        }
    }

    @Nullable
    public String announcement() {
        return this.announcement;
    }

    @Nullable
    public Double distanceAlongGeometry() {
        return this.distanceAlongGeometry;
    }

    @Nullable
    public String ssmlAnnouncement() {
        return this.ssmlAnnouncement;
    }

    public aw.a toBuilder() {
        return new a(this, (byte) 0);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.distanceAlongGeometry == null) {
            i = 0;
        } else {
            i = this.distanceAlongGeometry.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        if (this.announcement == null) {
            i2 = 0;
        } else {
            i2 = this.announcement.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.ssmlAnnouncement != null) {
            i3 = this.ssmlAnnouncement.hashCode();
        }
        return i5 ^ i3;
    }

    public String toString() {
        return "VoiceInstructions{distanceAlongGeometry=" + this.distanceAlongGeometry + ", announcement=" + this.announcement + ", ssmlAnnouncement=" + this.ssmlAnnouncement + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        if (this.distanceAlongGeometry != null ? this.distanceAlongGeometry.equals(awVar.distanceAlongGeometry()) : awVar.distanceAlongGeometry() == null) {
            if (this.announcement != null ? this.announcement.equals(awVar.announcement()) : awVar.announcement() == null) {
                if (this.ssmlAnnouncement != null ? !this.ssmlAnnouncement.equals(awVar.ssmlAnnouncement()) : awVar.ssmlAnnouncement() != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    p(@Nullable Double d2, @Nullable String str, @Nullable String str2) {
        this.distanceAlongGeometry = d2;
        this.announcement = str;
        this.ssmlAnnouncement = str2;
    }
}
