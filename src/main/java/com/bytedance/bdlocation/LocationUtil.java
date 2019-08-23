package com.bytedance.bdlocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.a.b;
import com.bytedance.bdlocation.netwok.a.d;
import com.bytedance.bdlocation.netwok.a.f;
import com.bytedance.bdlocation.netwok.a.g;
import com.bytedance.bdlocation.netwok.a.h;
import com.bytedance.common.utility.StringUtils;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class LocationUtil {
    private LocationUtil() {
    }

    @Nullable
    public static String getCityCodeForChina(b bVar) {
        if (bVar != null) {
            f fVar = bVar.f19230a;
            if (fVar != null) {
                h hVar = fVar.f19247c;
                if (hVar != null) {
                    return hVar.f19255d;
                }
            }
        }
        return null;
    }

    @Nullable
    public static String getCountryCode(b bVar) {
        if (bVar != null) {
            f fVar = bVar.f19230a;
            if (fVar != null) {
                h hVar = fVar.f19245a;
                if (hVar != null) {
                    return hVar.f19252a;
                }
            }
        }
        return null;
    }

    @Nullable
    public static String getCityCodeForOverSea(b bVar) {
        if (bVar != null) {
            f fVar = bVar.f19230a;
            if (fVar != null) {
                h hVar = fVar.f19247c;
                if (hVar != null) {
                    return String.valueOf(hVar.f19253b);
                }
            }
        }
        return null;
    }

    public static boolean isEmpty(Location location) {
        if (location == null) {
            return true;
        }
        if (Double.compare(location.getLatitude(), 0.0d) == 0 && Double.compare(location.getLongitude(), 0.0d) == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkGeocode(BDLocation bDLocation) {
        if (bDLocation == null || TextUtils.isEmpty(bDLocation.getCountry())) {
            return false;
        }
        if (!TextUtils.isEmpty(bDLocation.getAdministrativeArea()) || !TextUtils.isEmpty(bDLocation.getSubAdministrativeArea()) || !TextUtils.isEmpty(bDLocation.getCity())) {
            return true;
        }
        return false;
    }

    public static boolean isGoodLocation(BDLocation bDLocation) {
        if (Calendar.getInstance().getTimeInMillis() - bDLocation.getTime() < 30000 && bDLocation.getAccuracy() <= 500.0f && bDLocation.getLocationType() != 3) {
            return true;
        }
        return false;
    }

    public static BDLocation locationResultToBDLocation(@Nullable f fVar) {
        if (fVar == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation("bd_lbs", "SystemLocation");
        h hVar = fVar.f19245a;
        if (hVar != null) {
            bDLocation.setCountry(hVar.f19254c);
        }
        g gVar = fVar.f19249e;
        if (gVar != null && !Util.isEmpty(gVar.f19251a)) {
            bDLocation.setAddress(gVar.f19251a.get(0));
        }
        h[] hVarArr = fVar.f19246b;
        if (hVarArr != null && hVarArr.length > 0) {
            bDLocation.setAdministrativeArea(hVarArr[0].f19254c);
        }
        if (hVarArr != null && hVarArr.length > 1) {
            bDLocation.setSubAdministrativeArea(hVarArr[1].f19254c);
        }
        h hVar2 = fVar.f19247c;
        if (hVar2 != null) {
            bDLocation.setCity(hVar2.f19254c);
        }
        h hVar3 = fVar.f19248d;
        if (hVar3 != null) {
            bDLocation.setDistrict(hVar3.f19254c);
        }
        d dVar = fVar.f19250f;
        if (dVar != null) {
            bDLocation.setLatitude(dVar.f19237a);
            bDLocation.setLongitude(dVar.f19238b);
        }
        return bDLocation;
    }

    public static Address2 locationToAddress2(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        Address2 address2 = new Address2(Locale.getDefault());
        address2.setSpeed(bDLocation.getSpeed());
        address2.setAccuracy(bDLocation.getAccuracy());
        address2.setAltitude(bDLocation.getAltitude());
        address2.setLatitude(bDLocation.getLatitude());
        address2.setLongitude(bDLocation.getLongitude());
        address2.setAdminArea(bDLocation.getAdministrativeArea());
        address2.setSubAdminArea(bDLocation.getSubAdministrativeArea());
        address2.setCountryName(bDLocation.getCountry());
        address2.setLocality(bDLocation.getCity());
        address2.setSubLocality(bDLocation.getDistrict());
        address2.setLocality(bDLocation.getStreet());
        address2.setSubLocality(bDLocation.getStreetNum());
        address2.setAddressLine(0, bDLocation.getAddress());
        return address2;
    }

    public static BDLocation createLocation(double d2, double d3) {
        BDLocation bDLocation = new BDLocation("none", "none");
        bDLocation.setLatitude(d2);
        bDLocation.setLongitude(d3);
        return bDLocation;
    }

    private static boolean isSameProvider(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static boolean checkCacheTime(long j, long j2) {
        if (j != 0 && Calendar.getInstance().getTimeInMillis() - j < j2 + 5000) {
            return true;
        }
        return false;
    }

    public static BDLocation geocode(Context context, BDLocation bDLocation) throws IOException {
        if (!Geocoder.isPresent()) {
            return null;
        }
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return addressesToBDLocation(new Geocoder(context, locale).getFromLocation(bDLocation.getLatitude(), bDLocation.getLongitude(), 10), bDLocation);
    }

    public static BDLocation addressesToBDLocation(List<Address> list, BDLocation bDLocation) {
        if (Util.isEmpty(list)) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        Iterator<Address> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Address next = it2.next();
            if (next.hasLatitude() && next.hasLongitude()) {
                bDLocation2.setCountry(next.getCountryName());
                bDLocation2.setAdministrativeArea(next.getAdminArea());
                bDLocation2.setSubAdministrativeArea(next.getSubAdminArea());
                bDLocation2.setCity(next.getLocality());
                bDLocation2.setDistrict(next.getSubLocality());
                bDLocation2.setStreet(next.getThoroughfare());
                bDLocation2.setStreetNum(next.getSubThoroughfare());
                bDLocation2.setAddress(next.getAddressLine(0));
                bDLocation2.setPoi(next.getFeatureName());
                break;
            }
        }
        return bDLocation2;
    }

    public static int compareLocation(BDLocation bDLocation, BDLocation bDLocation2) {
        if (bDLocation == null || bDLocation2 == null) {
            return -1;
        }
        if (!StringUtils.equal(bDLocation.getCountry(), bDLocation2.getCountry())) {
            return 1;
        }
        if (!StringUtils.equal(bDLocation.getAdministrativeArea(), bDLocation2.getAdministrativeArea())) {
            return 2;
        }
        if (!StringUtils.equal(bDLocation.getSubAdministrativeArea(), bDLocation2.getSubAdministrativeArea())) {
            return 3;
        }
        if (!StringUtils.equal(bDLocation.getCity(), bDLocation2.getCity())) {
            return 4;
        }
        if (!StringUtils.equal(bDLocation.getDistrict(), bDLocation2.getDistrict())) {
            return 5;
        }
        return -1;
    }

    public static boolean isBetterLocation(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if (time > 120000) {
            z = true;
        } else {
            z = false;
        }
        if (time < -120000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (time > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        if (accuracy > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (accuracy < 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (accuracy > 200) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (z3 && !z4) {
            return true;
        }
        if (!z3 || z6 || !isSameProvider) {
            return false;
        }
        return true;
    }

    @NonNull
    public static BDLocation composeLocation(@NonNull BDLocation bDLocation, @NonNull BDLocation bDLocation2) {
        BDLocation bDLocation3 = new BDLocation(bDLocation);
        bDLocation3.setLongitude(bDLocation2.getLongitude());
        bDLocation3.setLatitude(bDLocation2.getLatitude());
        bDLocation3.setAddress(bDLocation2.getAddress());
        bDLocation3.setCity(bDLocation2.getCity());
        bDLocation3.setAdministrativeArea(bDLocation2.getAdministrativeArea());
        bDLocation3.setSubAdministrativeArea(bDLocation2.getSubAdministrativeArea());
        bDLocation3.setProvider(bDLocation2.getProvider());
        bDLocation3.setDistrict(bDLocation2.getDistrict());
        bDLocation3.setCountry(bDLocation2.getCountry());
        bDLocation3.setCityCode(bDLocation2.getCityCode());
        bDLocation3.setStreet(bDLocation2.getStreet());
        bDLocation3.setStreetNum(bDLocation2.getStreetNum());
        bDLocation3.setFloor(bDLocation2.getFloor());
        bDLocation3.setThirdPartLocation(bDLocation2.getThirdPartLocation());
        bDLocation3.setLocationSDKName(bDLocation2.getLocationSDKName());
        bDLocation3.setPoi(bDLocation2.getPoi());
        bDLocation3.setGCJ02(bDLocation2.getGCJ02());
        bDLocation3.setLocationType(bDLocation2.getLocationType());
        return bDLocation3;
    }
}
