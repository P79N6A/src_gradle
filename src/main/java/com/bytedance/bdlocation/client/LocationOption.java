package com.bytedance.bdlocation.client;

import android.support.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LocationOption {
    int geocodeMode = 2;
    long interval;
    long locationTimeOutMs;
    LocationTrace mTrace;
    long maxCacheTime = 30000;
    int mode = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeocodeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationMode {
    }

    public int geocodeMode() {
        return this.geocodeMode;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getLocationTimeOutMs() {
        return this.locationTimeOutMs;
    }

    public long getMaxCacheTime() {
        return this.maxCacheTime;
    }

    public int getMode() {
        return this.mode;
    }

    public LocationTrace getTrace() {
        return this.mTrace;
    }

    public LocationOption() {
    }

    public int hashCode() {
        return (((((((((int) (this.locationTimeOutMs ^ (this.locationTimeOutMs >>> 32))) * 31) + ((int) (this.interval ^ (this.interval >>> 32)))) * 31) + this.mode) * 31) + this.geocodeMode) * 31) + ((int) (this.maxCacheTime ^ (this.maxCacheTime >>> 32)));
    }

    public String toString() {
        return "LocationOption{locationTimeOutMs=" + this.locationTimeOutMs + ", interval=" + this.interval + ", mode=" + this.mode + ", geocodeMode=" + this.geocodeMode + ", maxCacheTime=" + this.maxCacheTime + ", mTrace=" + this.mTrace + '}';
    }

    public void setGeocodeMode(int i) {
        this.geocodeMode = i;
    }

    public void setInterval(long j) {
        this.interval = j;
    }

    public void setLocationTimeOutMs(long j) {
        this.locationTimeOutMs = j;
    }

    public void setMaxCacheTime(long j) {
        this.maxCacheTime = j;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    @VisibleForTesting(otherwise = 4)
    public void setTrace(LocationTrace locationTrace) {
        this.mTrace = locationTrace;
    }

    public LocationOption(LocationOption locationOption) {
        this.locationTimeOutMs = locationOption.locationTimeOutMs;
        this.interval = locationOption.interval;
        this.mode = locationOption.mode;
        this.maxCacheTime = locationOption.maxCacheTime;
        this.mTrace = locationOption.mTrace;
        this.geocodeMode = locationOption.geocodeMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationOption)) {
            return false;
        }
        LocationOption locationOption = (LocationOption) obj;
        if (this.locationTimeOutMs == locationOption.locationTimeOutMs && this.interval == locationOption.interval && this.mode == locationOption.mode && this.geocodeMode == locationOption.geocodeMode) {
            return true;
        }
        return false;
    }
}
