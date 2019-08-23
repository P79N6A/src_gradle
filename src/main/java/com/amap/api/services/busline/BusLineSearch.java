package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.services.a.ap;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;

public class BusLineSearch {

    /* renamed from: a  reason: collision with root package name */
    private IBusLineSearch f6929a;

    public interface OnBusLineSearchListener {
        void onBusLineSearched(BusLineResult busLineResult, int i);
    }

    public BusLineQuery getQuery() {
        if (this.f6929a != null) {
            return this.f6929a.getQuery();
        }
        return null;
    }

    public BusLineResult searchBusLine() throws AMapException {
        if (this.f6929a != null) {
            return this.f6929a.searchBusLine();
        }
        return null;
    }

    public void searchBusLineAsyn() {
        if (this.f6929a != null) {
            this.f6929a.searchBusLineAsyn();
        }
    }

    public void setOnBusLineSearchListener(OnBusLineSearchListener onBusLineSearchListener) {
        if (this.f6929a != null) {
            this.f6929a.setOnBusLineSearchListener(onBusLineSearchListener);
        }
    }

    public void setQuery(BusLineQuery busLineQuery) {
        if (this.f6929a != null) {
            this.f6929a.setQuery(busLineQuery);
        }
    }

    public BusLineSearch(Context context, BusLineQuery busLineQuery) {
        try {
            Context context2 = context;
            this.f6929a = (IBusLineSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.BusLineSearchWrapper", ap.class, new Class[]{Context.class, BusLineQuery.class}, new Object[]{context, busLineQuery});
        } catch (be unused) {
        }
        if (this.f6929a == null) {
            try {
                this.f6929a = new ap(context, busLineQuery);
            } catch (Exception unused2) {
            }
        }
    }
}
