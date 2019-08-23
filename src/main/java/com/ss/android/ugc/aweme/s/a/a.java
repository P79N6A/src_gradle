package com.ss.android.ugc.aweme.s.a;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/location/model/AVLocationBundle;", "Ljava/io/Serializable;", "latitude", "", "longitude", "locateTime", "", "(DDJ)V", "isValid", "", "()Z", "getLatitude", "()D", "getLocateTime", "()J", "getLongitude", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final double latitude;
    private final long locateTime;
    private final double longitude;

    public final double getLatitude() {
        return this.latitude;
    }

    public final long getLocateTime() {
        return this.locateTime;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean isValid() {
        if (this.latitude == 0.0d || this.longitude == 0.0d) {
            return false;
        }
        return true;
    }

    public a(double d2, double d3, long j) {
        this.latitude = d2;
        this.longitude = d3;
        this.locateTime = j;
    }
}
