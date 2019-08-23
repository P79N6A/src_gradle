package com.amap.api.services.geocoder;

import android.content.Context;
import com.amap.api.services.a.au;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IGeocodeSearch;
import java.util.List;

public final class GeocodeSearch {

    /* renamed from: a  reason: collision with root package name */
    private IGeocodeSearch f7034a;

    public interface OnGeocodeSearchListener {
        void onGeocodeSearched(GeocodeResult geocodeResult, int i);

        void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i);
    }

    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        if (this.f7034a != null) {
            return this.f7034a.getFromLocation(regeocodeQuery);
        }
        return null;
    }

    public final void getFromLocationAsyn(RegeocodeQuery regeocodeQuery) {
        if (this.f7034a != null) {
            this.f7034a.getFromLocationAsyn(regeocodeQuery);
        }
    }

    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        if (this.f7034a != null) {
            return this.f7034a.getFromLocationName(geocodeQuery);
        }
        return null;
    }

    public final void getFromLocationNameAsyn(GeocodeQuery geocodeQuery) {
        if (this.f7034a != null) {
            this.f7034a.getFromLocationNameAsyn(geocodeQuery);
        }
    }

    public final void setOnGeocodeSearchListener(OnGeocodeSearchListener onGeocodeSearchListener) {
        if (this.f7034a != null) {
            this.f7034a.setOnGeocodeSearchListener(onGeocodeSearchListener);
        }
    }

    public GeocodeSearch(Context context) {
        try {
            Context context2 = context;
            this.f7034a = (IGeocodeSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.GeocodeSearchWrapper", au.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7034a == null) {
            try {
                this.f7034a = new au(context);
            } catch (Exception unused2) {
            }
        }
    }
}
