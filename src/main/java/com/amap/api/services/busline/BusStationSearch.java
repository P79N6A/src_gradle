package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.services.a.aq;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;

public class BusStationSearch {

    /* renamed from: a  reason: collision with root package name */
    private IBusStationSearch f6945a;

    public interface OnBusStationSearchListener {
        void onBusStationSearched(BusStationResult busStationResult, int i);
    }

    public BusStationQuery getQuery() {
        if (this.f6945a != null) {
            return this.f6945a.getQuery();
        }
        return null;
    }

    public BusStationResult searchBusStation() throws AMapException {
        if (this.f6945a != null) {
            return this.f6945a.searchBusStation();
        }
        return null;
    }

    public void searchBusStationAsyn() {
        if (this.f6945a != null) {
            this.f6945a.searchBusStationAsyn();
        }
    }

    public void setOnBusStationSearchListener(OnBusStationSearchListener onBusStationSearchListener) {
        if (this.f6945a != null) {
            this.f6945a.setOnBusStationSearchListener(onBusStationSearchListener);
        }
    }

    public void setQuery(BusStationQuery busStationQuery) {
        if (this.f6945a != null) {
            this.f6945a.setQuery(busStationQuery);
        }
    }

    public BusStationSearch(Context context, BusStationQuery busStationQuery) {
        try {
            Context context2 = context;
            this.f6945a = (IBusStationSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.BusStationSearchWrapper", aq.class, new Class[]{Context.class, BusStationQuery.class}, new Object[]{context, busStationQuery});
        } catch (be unused) {
        }
        if (this.f6945a == null) {
            try {
                this.f6945a = new aq(context, busStationQuery);
            } catch (Exception unused2) {
            }
        }
    }
}
