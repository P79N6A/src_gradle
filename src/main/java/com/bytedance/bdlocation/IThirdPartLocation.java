package com.bytedance.bdlocation;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.a.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;

public interface IThirdPartLocation {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PointMode {
    }

    @Nullable
    BDPoint convertGCJ02(@NonNull BDPoint bDPoint);

    @Nullable
    BDLocation geocode(@NonNull BDPoint bDPoint, String str);

    String getLocationName();

    @Nullable
    List<i> getPoiSync(@NonNull BDPoint bDPoint, String str);

    void setLocale(Locale locale);

    void startLocation(@NonNull BDLocationClient.Callback callback, @NonNull LocationOption locationOption, @NonNull Looper looper);

    void stopLocation();
}
