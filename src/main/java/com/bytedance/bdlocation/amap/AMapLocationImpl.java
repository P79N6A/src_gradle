package com.bytedance.bdlocation.amap;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.CoordinateConverter;
import com.amap.api.location.DPoint;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.StreetNumber;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.IThirdPartLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.a.i;
import com.bytedance.bdlocation.service.QPSController;
import com.bytedance.bdlocation.service.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Keep
public class AMapLocationImpl implements IThirdPartLocation {
    public BDLocationClient.Callback mCallback;
    private AMapLocationClient mClient;
    private Context mContext;
    public QPSController mController;
    public Handler mHandler;
    private AMapLocationListener mListener = new AMapLocationListener() {
        public final void onLocationChanged(final AMapLocation aMapLocation) {
            if (AMapLocationImpl.this.mHandler != null) {
                AMapLocationImpl.this.mHandler.post(new Runnable() {
                    public final void run() {
                        if (aMapLocation != null) {
                            if (!a.a().b()) {
                                AMapLocationImpl.this.stopLocation();
                            }
                            if (AMapLocationImpl.this.mOption != null && AMapLocationImpl.this.mCallback != null) {
                                if (BDLocationConfig.isDebug()) {
                                    com.ss.b.a.a.b("BDLocation", "AMap onLocationChanged: " + aMapLocation.getAddress());
                                }
                                if (aMapLocation.getErrorCode() == 0) {
                                    AMapLocationImpl.this.mController.callback(aMapLocation);
                                    AMapLocationImpl.this.callback(AMapLocationImpl.this.transform(aMapLocation), AMapLocationImpl.this.mOption, AMapLocationImpl.this.mCallback);
                                    return;
                                }
                                BDLocationException bDLocationException = new BDLocationException(aMapLocation.getErrorInfo());
                                AMapLocationImpl.this.mController.callbackError(bDLocationException);
                                AMapLocationImpl.this.mCallback.onError(bDLocationException);
                            }
                        }
                    }
                });
            }
        }
    };
    public LocationOption mOption;

    private int transAMapTypeToBDType(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 4) {
            return 5;
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 3;
        }
        return (i == 8 || i == 9) ? 5 : 0;
    }

    public String getLocationName() {
        return "AMapLocation";
    }

    public void stopLocation() {
        this.mClient.stopLocation();
        this.mClient.unRegisterLocationListener(this.mListener);
        this.mCallback = null;
        this.mOption = null;
        this.mHandler = null;
        if (BDLocationConfig.isDebug()) {
            com.ss.b.a.a.b("BDLocation", "AMap stopLocation");
        }
    }

    public void setLocale(Locale locale) {
        String str;
        if ("zh".equals(locale.getLanguage())) {
            str = "zh-CN";
        } else {
            str = "en";
        }
        ServiceSettings.getInstance().setLanguage(str);
    }

    @Nullable
    public BDPoint convertGCJ02(@NonNull BDPoint bDPoint) {
        try {
            DPoint dPoint = new DPoint(bDPoint.getLatitude(), bDPoint.getLongitude());
            CoordinateConverter coordinateConverter = new CoordinateConverter(this.mContext);
            coordinateConverter.from(CoordinateConverter.CoordType.GPS);
            coordinateConverter.coord(dPoint);
            DPoint convert = coordinateConverter.convert();
            BDPoint bDPoint2 = new BDPoint(convert.getLatitude(), convert.getLongitude(), bDPoint.getProvider());
            return bDPoint2;
        } catch (Exception e2) {
            com.ss.b.a.a.b("BDLocation", (Throwable) e2);
            return null;
        }
    }

    @Nullable
    private List<i> transAddressToPoi(@Nullable RegeocodeAddress regeocodeAddress) {
        if (regeocodeAddress == null) {
            return null;
        }
        List<PoiItem> pois = regeocodeAddress.getPois();
        if (Util.isEmpty(pois)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PoiItem next : pois) {
            i iVar = new i();
            iVar.f19259d = next.getSnippet();
            iVar.f19258c = next.getBusinessArea();
            iVar.f19257b = next.getDirection();
            iVar.f19261f = String.valueOf(next.getDistance());
            iVar.f19256a = next.getPoiId();
            iVar.f19260e = next.getTitle();
            iVar.h = next.getTypeDes();
            iVar.g = next.getTel();
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public BDLocation transform(AMapLocation aMapLocation) {
        BDLocation bDLocation = new BDLocation((Location) aMapLocation, "AMapLocation");
        bDLocation.setAddress(aMapLocation.getAddress());
        bDLocation.setCountry(aMapLocation.getCountry());
        bDLocation.setAdministrativeArea(aMapLocation.getProvince());
        bDLocation.setCity(aMapLocation.getCity());
        bDLocation.setDistrict(aMapLocation.getDistrict());
        bDLocation.setCityCode(aMapLocation.getCityCode());
        bDLocation.setStreet(aMapLocation.getStreet());
        bDLocation.setStreetNum(aMapLocation.getStreetNum());
        bDLocation.setFloor(aMapLocation.getFloor());
        bDLocation.setLocationMs(aMapLocation.getTime());
        bDLocation.setPoi(aMapLocation.getPoiName());
        bDLocation.setLocationType(transAMapTypeToBDType(aMapLocation.getLocationType()));
        if (CoordinateConverter.isAMapDataAvailable(aMapLocation.getLatitude(), aMapLocation.getLongitude())) {
            BDPoint bDPoint = new BDPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation.getProvider());
            bDLocation.setGCJ02(bDPoint);
        }
        return bDLocation;
    }

    @Keep
    public AMapLocationImpl(Context context, QPSController qPSController) {
        this.mClient = new AMapLocationClient(context.getApplicationContext());
        this.mContext = context;
        this.mController = qPSController;
    }

    @Nullable
    private BDLocation transAddressToBDLocation(@Nullable RegeocodeAddress regeocodeAddress, BDPoint bDPoint) {
        if (regeocodeAddress == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation(bDPoint.getProvider(), "AMapLocation");
        bDLocation.setLongitude(bDPoint.getLongitude());
        bDLocation.setLatitude(bDPoint.getLatitude());
        bDLocation.setAddress(regeocodeAddress.getFormatAddress());
        bDLocation.setCity(regeocodeAddress.getCity());
        bDLocation.setProvider(regeocodeAddress.getProvince());
        bDLocation.setDistrict(regeocodeAddress.getDistrict());
        bDLocation.setCountry(regeocodeAddress.getCountry());
        bDLocation.setCityCode(regeocodeAddress.getCityCode());
        StreetNumber streetNumber = regeocodeAddress.getStreetNumber();
        if (streetNumber != null) {
            bDLocation.setStreet(streetNumber.getStreet());
            bDLocation.setStreetNum(streetNumber.getNumber());
        }
        return bDLocation;
    }

    @Nullable
    public BDLocation geocode(@NonNull BDPoint bDPoint, String str) {
        RegeocodeAddress regeocodeAddress;
        GeocodeSearch geocodeSearch = new GeocodeSearch(this.mContext);
        try {
            if ("gcj".equals(str)) {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "autonavi"));
            } else if ("wgs".equals(str)) {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "gps"));
            } else {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "gps"));
            }
            return transAddressToBDLocation(regeocodeAddress, bDPoint);
        } catch (AMapException e2) {
            com.ss.b.a.a.b("BDLocation", (Throwable) e2);
            return null;
        }
    }

    @Nullable
    public List<i> getPoiSync(@NonNull BDPoint bDPoint, String str) {
        RegeocodeAddress regeocodeAddress;
        GeocodeSearch geocodeSearch = new GeocodeSearch(this.mContext);
        try {
            if ("gcj".equals(str)) {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "autonavi"));
            } else if ("wgs".equals(str)) {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "gps"));
            } else {
                regeocodeAddress = geocodeSearch.getFromLocation(new RegeocodeQuery(new LatLonPoint(bDPoint.getLatitude(), bDPoint.getLongitude()), 1000.0f, "gps"));
            }
            return transAddressToPoi(regeocodeAddress);
        } catch (AMapException e2) {
            com.ss.b.a.a.b("BDLocation", (Throwable) e2);
            return null;
        }
    }

    public void callback(@Nullable BDLocation bDLocation, LocationOption locationOption, BDLocationClient.Callback callback) {
        if (locationOption.geocodeMode() == 2 || locationOption.geocodeMode() == 0) {
            callback.onLocationChanged(bDLocation);
            return;
        }
        try {
            if (!LocationUtil.isEmpty(bDLocation)) {
                a a2 = a.a();
                BDPoint bDPoint = new BDPoint(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider());
                BDLocation a3 = a2.a(bDPoint, "wgs", locationOption.geocodeMode());
                if (a3 != null) {
                    callback.onLocationChanged(LocationUtil.composeLocation(bDLocation, a3));
                } else {
                    callback.onLocationChanged(bDLocation);
                }
                return;
            }
            callback.onError(new BDLocationException("LBS Service fail!"));
        } catch (Exception e2) {
            com.ss.b.a.a.b("AMapLocation", (Throwable) e2);
            callback.onError(new BDLocationException((Throwable) e2));
        }
    }

    public void startLocation(@NonNull BDLocationClient.Callback callback, @NonNull LocationOption locationOption, @NonNull Looper looper) {
        boolean z;
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setHttpTimeOut(locationOption.getLocationTimeOutMs());
        this.mHandler = new Handler(looper);
        this.mOption = locationOption;
        this.mCallback = callback;
        if (locationOption.getInterval() == 0) {
            aMapLocationClientOption.setInterval(1000);
        } else {
            aMapLocationClientOption.setInterval(locationOption.getInterval());
        }
        boolean z2 = true;
        if (locationOption.getMode() == 0) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        } else if (locationOption.getMode() == 1) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Device_Sensors);
        } else {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        }
        if (locationOption.geocodeMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        aMapLocationClientOption.setNeedAddress(z);
        if (locationOption.getMaxCacheTime() == 0) {
            z2 = false;
        }
        aMapLocationClientOption.setLocationCacheEnable(z2);
        this.mClient.setLocationOption(aMapLocationClientOption);
        this.mClient.setLocationListener(this.mListener);
        this.mClient.startLocation();
        if (BDLocationConfig.isDebug()) {
            com.ss.b.a.a.b("BDLocation", "AMap startLocation");
        }
    }
}
