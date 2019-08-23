package com.bytedance.bdlocation.client;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.netwok.a.b;
import com.bytedance.bdlocation.netwok.a.i;
import com.bytedance.bdlocation.service.SystemBaseLocationImpl;
import com.bytedance.bdlocation.service.a;
import java.util.List;

public class BDLocationClient {
    private boolean isStart;
    private int mId;
    private LocationOption mOption;
    private String mTag;

    public interface Callback {
        void onError(@Nullable BDLocationException bDLocationException);

        void onLocationChanged(@Nullable BDLocation bDLocation);
    }

    public interface LocationNotification {
        void onLocationChanged(BDLocation bDLocation, BDLocation bDLocation2);
    }

    @VisibleForTesting(otherwise = 2)
    public int getId() {
        return this.mId;
    }

    @VisibleForTesting(otherwise = 2)
    public boolean getIsStart() {
        return this.isStart;
    }

    @VisibleForTesting(otherwise = 2)
    public LocationOption getOption() {
        return this.mOption;
    }

    @Nullable
    public BDLocation getCache() {
        return a.a().f19267a.a();
    }

    @VisibleForTesting(otherwise = 2)
    public Long getInterval() {
        return Long.valueOf(this.mOption.getInterval());
    }

    @AnyThread
    public void stopLocation() {
        synchronized (this) {
            a.a().a(this.mId);
            this.isStart = false;
        }
    }

    @Nullable
    public BDLocation getLocation() throws BDLocationException {
        if (this.mOption.getInterval() != 0) {
            this.mOption.setInterval(0);
        }
        return a.a().a(new LocationOption(this.mOption));
    }

    public BDLocationClient reset() {
        this.mOption = new LocationOption();
        this.mOption.setMaxCacheTime(600000);
        this.mOption.setLocationTimeOutMs(30000);
        this.mOption.setTrace(new LocationTrace(this.mTag));
        return this;
    }

    public BDLocationClient setGeocodeMode(int i) {
        this.mOption.geocodeMode = i;
        return this;
    }

    public BDLocationClient setLocationInterval(long j) {
        this.mOption.interval = j;
        return this;
    }

    public BDLocationClient setLocationMode(int i) {
        this.mOption.mode = i;
        return this;
    }

    public BDLocationClient setLocationTimeOut(long j) {
        this.mOption.locationTimeOutMs = j;
        return this;
    }

    public BDLocationClient setMaxCacheTime(long j) {
        this.mOption.maxCacheTime = j;
        return this;
    }

    public BDLocationClient(@NonNull String str) {
        this.mTag = str;
        reset();
    }

    @Nullable
    @WorkerThread
    public BDPoint convertGCJ02(@NonNull BDPoint bDPoint) {
        return a.a().a(bDPoint);
    }

    @Nullable
    @WorkerThread
    public b getBdLBSResult(boolean z) {
        b bVar;
        if (z) {
            bVar = a.a().f19267a.f19224c;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        try {
            return SystemBaseLocationImpl.getAndUploadLocation(getLocation(), BDLocationConfig.getContext());
        } catch (BDLocationException | Exception unused) {
            return bVar;
        }
    }

    public void getLocation(@NonNull Callback callback) {
        if (this.mOption.getInterval() != 0) {
            this.mOption.setInterval(0);
        }
        a.a().a(callback, new LocationOption(this.mOption));
    }

    @AnyThread
    public void startLocation(@Nullable Callback callback) {
        synchronized (this) {
            if (!this.isStart) {
                this.isStart = true;
                if (this.mOption.getInterval() < 1000) {
                    this.mOption.setInterval(1000);
                }
                this.mId = a.a().a(callback, new LocationOption(this.mOption));
            }
        }
    }

    @Nullable
    @WorkerThread
    public List<i> getPoi(@NonNull BDPoint bDPoint, String str) {
        return a.a().a(bDPoint, str);
    }

    @Nullable
    @WorkerThread
    public BDLocation geocode(@NonNull BDPoint bDPoint, String str) {
        BDLocation bDLocation;
        a a2 = a.a();
        if (a2.f19268b != null) {
            bDLocation = a2.f19268b.geocode(bDPoint, str);
        } else {
            bDLocation = null;
        }
        if (!LocationUtil.checkGeocode(bDLocation)) {
            return a2.f19269c.geocode(bDPoint, str);
        }
        return bDLocation;
    }
}
