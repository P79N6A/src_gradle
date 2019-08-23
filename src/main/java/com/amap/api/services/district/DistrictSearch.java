package com.amap.api.services.district;

import android.content.Context;
import com.amap.api.services.a.at;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistrictSearch;

public class DistrictSearch {

    /* renamed from: a  reason: collision with root package name */
    private IDistrictSearch f7010a;

    public interface OnDistrictSearchListener {
        void onDistrictSearched(DistrictResult districtResult);
    }

    public DistrictSearchQuery getQuery() {
        if (this.f7010a != null) {
            return this.f7010a.getQuery();
        }
        return null;
    }

    public DistrictResult searchDistrict() throws AMapException {
        if (this.f7010a != null) {
            return this.f7010a.searchDistrict();
        }
        return null;
    }

    public void searchDistrictAnsy() {
        if (this.f7010a != null) {
            this.f7010a.searchDistrictAnsy();
        }
    }

    public void searchDistrictAsyn() {
        if (this.f7010a != null) {
            this.f7010a.searchDistrictAsyn();
        }
    }

    public void setOnDistrictSearchListener(OnDistrictSearchListener onDistrictSearchListener) {
        if (this.f7010a != null) {
            this.f7010a.setOnDistrictSearchListener(onDistrictSearchListener);
        }
    }

    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        if (this.f7010a != null) {
            this.f7010a.setQuery(districtSearchQuery);
        }
    }

    public DistrictSearch(Context context) {
        try {
            Context context2 = context;
            this.f7010a = (IDistrictSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.DistrictSearchWrapper", at.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7010a == null) {
            try {
                this.f7010a = new at(context);
            } catch (Exception unused2) {
            }
        }
    }
}
