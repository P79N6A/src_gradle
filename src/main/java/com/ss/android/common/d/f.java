package com.ss.android.common.d;

import android.location.Address;
import com.amap.api.location.AMapLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import org.json.JSONObject;

public class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String address;
    public String city;
    public String country;
    public String district;
    public boolean isGaode;
    public double latitude;
    public double longitude;
    public String province;
    public long time;

    public boolean isValid() {
        if (this.latitude == 0.0d || this.longitude == 0.0d) {
            return false;
        }
        return true;
    }

    public static f parseJSONObject(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15900, new Class[]{JSONObject.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15900, new Class[]{JSONObject.class}, f.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            try {
                f fVar = new f();
                fVar.latitude = jSONObject2.optDouble("latitude");
                fVar.longitude = jSONObject2.optDouble("longitude");
                fVar.country = jSONObject2.optString("country");
                fVar.province = jSONObject2.optString("province");
                fVar.city = jSONObject2.optString("city");
                fVar.district = jSONObject2.optString("district");
                fVar.address = jSONObject2.optString("address");
                fVar.time = jSONObject2.optLong("loc_time");
                fVar.isGaode = true;
                return fVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static f parseAMapLocation(AMapLocation aMapLocation, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aMapLocation, new Long(j2)}, null, changeQuickRedirect, true, 15899, new Class[]{AMapLocation.class, Long.TYPE}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{aMapLocation, new Long(j2)}, null, changeQuickRedirect, true, 15899, new Class[]{AMapLocation.class, Long.TYPE}, f.class);
        } else if (aMapLocation == null) {
            return null;
        } else {
            f fVar = new f();
            fVar.latitude = aMapLocation.getLatitude();
            fVar.longitude = aMapLocation.getLongitude();
            fVar.country = aMapLocation.getCountry();
            fVar.province = aMapLocation.getProvince();
            fVar.city = aMapLocation.getCity();
            fVar.district = aMapLocation.getDistrict();
            fVar.address = aMapLocation.getAddress();
            fVar.time = j2;
            fVar.isGaode = true;
            return fVar;
        }
    }

    public static f parseAddress(Address address2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{address2, new Long(j2)}, null, changeQuickRedirect, true, 15901, new Class[]{Address.class, Long.TYPE}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{address2, new Long(j2)}, null, changeQuickRedirect, true, 15901, new Class[]{Address.class, Long.TYPE}, f.class);
        } else if (address2 == null || !address2.hasLatitude() || !address2.hasLongitude()) {
            return null;
        } else {
            f fVar = new f();
            fVar.latitude = address2.getLatitude();
            fVar.longitude = address2.getLongitude();
            fVar.country = address2.getCountryName();
            fVar.province = address2.getAdminArea();
            fVar.city = address2.getLocality();
            fVar.district = address2.getSubLocality();
            fVar.address = address2.getThoroughfare();
            fVar.time = j2;
            fVar.isGaode = false;
            return fVar;
        }
    }
}
