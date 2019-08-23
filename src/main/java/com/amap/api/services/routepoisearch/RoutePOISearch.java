package com.amap.api.services.routepoisearch;

import android.content.Context;
import com.amap.api.services.a.ay;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRoutePOISearch;

public class RoutePOISearch {

    /* renamed from: a  reason: collision with root package name */
    private IRoutePOISearch f7284a;

    public interface OnRoutePOISearchListener {
        void onRoutePoiSearched(RoutePOISearchResult routePOISearchResult, int i);
    }

    public enum RoutePOISearchType {
        TypeGasStation,
        TypeMaintenanceStation,
        TypeATM,
        TypeToilet,
        TypeFillingStation,
        TypeServiceArea
    }

    public RoutePOISearchResult searchRoutePOI() throws AMapException {
        if (this.f7284a != null) {
            return this.f7284a.searchRoutePOI();
        }
        return null;
    }

    public void searchRoutePOIAsyn() {
        if (this.f7284a != null) {
            this.f7284a.searchRoutePOIAsyn();
        }
    }

    public void setPoiSearchListener(OnRoutePOISearchListener onRoutePOISearchListener) {
        if (this.f7284a != null) {
            this.f7284a.setRoutePOISearchListener(onRoutePOISearchListener);
        }
    }

    public void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        if (this.f7284a != null) {
            this.f7284a.setQuery(routePOISearchQuery);
        }
    }

    public RoutePOISearch(Context context, RoutePOISearchQuery routePOISearchQuery) {
        try {
            Context context2 = context;
            this.f7284a = (IRoutePOISearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.RoutePOISearchWrapper", ay.class, new Class[]{Context.class, RoutePOISearchQuery.class}, new Object[]{context, routePOISearchQuery});
        } catch (be unused) {
        }
        if (this.f7284a == null) {
            try {
                this.f7284a = new ay(context, routePOISearchQuery);
            } catch (Exception unused2) {
            }
        }
    }
}
