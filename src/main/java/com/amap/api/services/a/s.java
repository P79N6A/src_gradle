package com.amap.api.services.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.amap.api.services.share.ShareSearch;
import com.amap.api.services.traffic.TrafficSearch;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import java.util.ArrayList;
import java.util.List;

public class s extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static s f6884a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public BusLineResult f6885a;

        /* renamed from: b  reason: collision with root package name */
        public BusLineSearch.OnBusLineSearchListener f6886b;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public BusStationResult f6887a;

        /* renamed from: b  reason: collision with root package name */
        public BusStationSearch.OnBusStationSearchListener f6888b;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public CloudItemDetail f6889a;

        /* renamed from: b  reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f6890b;
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public CloudResult f6891a;

        /* renamed from: b  reason: collision with root package name */
        public CloudSearch.OnCloudSearchListener f6892b;
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public GeocodeResult f6893a;

        /* renamed from: b  reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f6894b;
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public List<NearbySearch.NearbyListener> f6895a;

        /* renamed from: b  reason: collision with root package name */
        public NearbySearchResult f6896b;
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public PoiItem f6897a;

        /* renamed from: b  reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f6898b;
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public PoiResult f6899a;

        /* renamed from: b  reason: collision with root package name */
        public PoiSearch.OnPoiSearchListener f6900b;
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RegeocodeResult f6901a;

        /* renamed from: b  reason: collision with root package name */
        public GeocodeSearch.OnGeocodeSearchListener f6902b;
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RoutePOISearchResult f6903a;

        /* renamed from: b  reason: collision with root package name */
        public RoutePOISearch.OnRoutePOISearchListener f6904b;
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public LocalWeatherForecastResult f6905a;

        /* renamed from: b  reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f6906b;
    }

    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public LocalWeatherLiveResult f6907a;

        /* renamed from: b  reason: collision with root package name */
        public WeatherSearch.OnWeatherSearchListener f6908b;
    }

    s() {
    }

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            if (f6884a == null) {
                if (Looper.myLooper() != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        f6884a = new s();
                    }
                }
                f6884a = new s(Looper.getMainLooper());
            }
            sVar = f6884a;
        }
        return sVar;
    }

    s(Looper looper) {
        super(looper);
    }

    private void e(Message message) {
        b bVar = (b) message.obj;
        if (bVar != null) {
            BusStationSearch.OnBusStationSearchListener onBusStationSearchListener = bVar.f6888b;
            if (onBusStationSearchListener != null) {
                BusStationResult busStationResult = null;
                if (message.what == 1000) {
                    busStationResult = bVar.f6887a;
                }
                onBusStationSearchListener.onBusStationSearched(busStationResult, message.what);
            }
        }
    }

    private void g(Message message) {
        Inputtips.InputtipsListener inputtipsListener = (Inputtips.InputtipsListener) message.obj;
        if (inputtipsListener != null) {
            ArrayList arrayList = null;
            if (message.what == 1000) {
                arrayList = message.getData().getParcelableArrayList("result");
            }
            inputtipsListener.onGetInputtips(arrayList, message.what);
        }
    }

    private void i(Message message) {
        DistrictSearch.OnDistrictSearchListener onDistrictSearchListener = (DistrictSearch.OnDistrictSearchListener) message.obj;
        if (onDistrictSearchListener != null) {
            onDistrictSearchListener.onDistrictSearched((DistrictResult) message.getData().getParcelable("result"));
        }
    }

    private void j(Message message) {
        a aVar = (a) message.obj;
        if (aVar != null) {
            BusLineSearch.OnBusLineSearchListener onBusLineSearchListener = aVar.f6886b;
            if (onBusLineSearchListener != null) {
                BusLineResult busLineResult = null;
                if (message.what == 1000) {
                    busLineResult = aVar.f6885a;
                }
                onBusLineSearchListener.onBusLineSearched(busLineResult, message.what);
            }
        }
    }

    private void o(Message message) {
        j jVar = (j) message.obj;
        if (jVar != null) {
            RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener = jVar.f6904b;
            if (onRoutePOISearchListener != null) {
                Bundle data = message.getData();
                if (data != null) {
                    onRoutePOISearchListener.onRoutePoiSearched(jVar.f6903a, data.getInt("errorCode"));
                }
            }
        }
    }

    private void b(Message message) {
        List<NearbySearch.NearbyListener> list = (List) message.obj;
        if (list != null && list.size() != 0) {
            for (NearbySearch.NearbyListener onNearbyInfoUploaded : list) {
                onNearbyInfoUploaded.onNearbyInfoUploaded(message.what);
            }
        }
    }

    private void c(Message message) {
        f fVar = (f) message.obj;
        if (fVar != null) {
            List<NearbySearch.NearbyListener> list = fVar.f6895a;
            if (list != null && list.size() != 0) {
                NearbySearchResult nearbySearchResult = null;
                if (message.what == 1000) {
                    nearbySearchResult = fVar.f6896b;
                }
                for (NearbySearch.NearbyListener onNearbyInfoSearched : list) {
                    onNearbyInfoSearched.onNearbyInfoSearched(nearbySearchResult, message.what);
                }
            }
        }
    }

    private void d(Message message) {
        List<NearbySearch.NearbyListener> list = (List) message.obj;
        if (list != null && list.size() != 0) {
            for (NearbySearch.NearbyListener onUserInfoCleared : list) {
                onUserInfoCleared.onUserInfoCleared(message.what);
            }
        }
    }

    private void h(Message message) {
        if (message.what == 201) {
            i iVar = (i) message.obj;
            if (iVar != null) {
                GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener = iVar.f6902b;
                if (onGeocodeSearchListener != null) {
                    onGeocodeSearchListener.onRegeocodeSearched(iVar.f6901a, message.arg2);
                    return;
                }
                return;
            }
            return;
        }
        if (message.what == 200) {
            e eVar = (e) message.obj;
            if (eVar != null) {
                GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener2 = eVar.f6894b;
                if (onGeocodeSearchListener2 != null) {
                    onGeocodeSearchListener2.onGeocodeSearched(eVar.f6893a, message.arg2);
                }
            }
        }
    }

    private void l(Message message) {
        RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener = (RouteSearch.OnTruckRouteSearchListener) message.obj;
        if (onTruckRouteSearchListener != null && message.what == 104) {
            Bundle data = message.getData();
            if (data != null) {
                onTruckRouteSearchListener.onTruckRouteSearched((TruckRouteRestult) message.getData().getParcelable("result"), data.getInt("errorCode"));
            }
        }
    }

    private void m(Message message) {
        if (message.what == 700) {
            d dVar = (d) message.obj;
            if (dVar != null) {
                dVar.f6892b.onCloudSearched(dVar.f6891a, message.arg2);
                return;
            }
            return;
        }
        if (message.what == 701) {
            c cVar = (c) message.obj;
            if (cVar != null) {
                cVar.f6890b.onCloudItemDetailSearched(cVar.f6889a, message.arg2);
            }
        }
    }

    private void q(Message message) {
        DistanceSearch.OnDistanceSearchListener onDistanceSearchListener = (DistanceSearch.OnDistanceSearchListener) message.obj;
        if (onDistanceSearchListener != null && message.what == 400) {
            Bundle data = message.getData();
            if (data != null) {
                onDistanceSearchListener.onDistanceSearched((DistanceResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
            }
        }
    }

    private void a(Message message) {
        int i2 = message.arg2;
        ShareSearch.OnShareSearchListener onShareSearchListener = (ShareSearch.OnShareSearchListener) message.obj;
        String string = message.getData().getString("shareurlkey");
        if (onShareSearchListener != null) {
            switch (message.what) {
                case 1100:
                    onShareSearchListener.onPoiShareUrlSearched(string, i2);
                    return;
                case 1101:
                    onShareSearchListener.onLocationShareUrlSearched(string, i2);
                    return;
                case 1102:
                    onShareSearchListener.onNaviShareUrlSearched(string, i2);
                    break;
                case 1103:
                    onShareSearchListener.onBusRouteShareUrlSearched(string, i2);
                    return;
                case 1104:
                    onShareSearchListener.onDrivingRouteShareUrlSearched(string, i2);
                    return;
                case 1105:
                    onShareSearchListener.onWalkRouteShareUrlSearched(string, i2);
                    return;
            }
        }
    }

    private void f(Message message) {
        if (message.what == 600) {
            h hVar = (h) message.obj;
            if (hVar != null) {
                PoiSearch.OnPoiSearchListener onPoiSearchListener = hVar.f6900b;
                if (onPoiSearchListener != null) {
                    Bundle data = message.getData();
                    if (data != null) {
                        onPoiSearchListener.onPoiSearched(hVar.f6899a, data.getInt("errorCode"));
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (message.what == 602) {
            g gVar = (g) message.obj;
            if (gVar != null) {
                PoiSearch.OnPoiSearchListener onPoiSearchListener2 = gVar.f6898b;
                Bundle data2 = message.getData();
                if (data2 != null) {
                    onPoiSearchListener2.onPoiItemSearched(gVar.f6897a, data2.getInt("errorCode"));
                }
            }
        }
    }

    private void n(Message message) {
        if (message.what == 1301) {
            l lVar = (l) message.obj;
            if (lVar != null) {
                WeatherSearch.OnWeatherSearchListener onWeatherSearchListener = lVar.f6908b;
                if (onWeatherSearchListener != null) {
                    Bundle data = message.getData();
                    if (data != null) {
                        onWeatherSearchListener.onWeatherLiveSearched(lVar.f6907a, data.getInt("errorCode"));
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (message.what == 1302) {
            k kVar = (k) message.obj;
            if (kVar != null) {
                WeatherSearch.OnWeatherSearchListener onWeatherSearchListener2 = kVar.f6906b;
                if (onWeatherSearchListener2 != null) {
                    Bundle data2 = message.getData();
                    if (data2 != null) {
                        onWeatherSearchListener2.onWeatherForecastSearched(kVar.f6905a, data2.getInt("errorCode"));
                    }
                }
            }
        }
    }

    private void p(Message message) {
        TrafficSearch.OnTrafficSearchListener onTrafficSearchListener = (TrafficSearch.OnTrafficSearchListener) message.obj;
        if (onTrafficSearchListener != null) {
            if (message.what == 300) {
                Bundle data = message.getData();
                if (data != null) {
                    onTrafficSearchListener.onRoadTrafficSearched((TrafficStatusResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
                }
            } else if (message.what == 301) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    onTrafficSearchListener.onRoadTrafficSearched((TrafficStatusResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                }
            } else {
                if (message.what == 302) {
                    message.getData();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r3) {
        /*
            r2 = this;
            int r0 = r3.arg1     // Catch:{ Throwable -> 0x004b }
            switch(r0) {
                case 1: goto L_0x0046;
                case 2: goto L_0x0042;
                case 3: goto L_0x003e;
                case 4: goto L_0x003a;
                case 5: goto L_0x0036;
                case 6: goto L_0x0032;
                case 7: goto L_0x002e;
                case 8: goto L_0x002a;
                case 9: goto L_0x0026;
                case 10: goto L_0x0022;
                case 11: goto L_0x001e;
                case 12: goto L_0x001a;
                case 13: goto L_0x0016;
                case 14: goto L_0x0012;
                case 15: goto L_0x000e;
                case 16: goto L_0x000a;
                case 17: goto L_0x0006;
                default: goto L_0x0005;
            }     // Catch:{ Throwable -> 0x004b }
        L_0x0005:
            goto L_0x004a
        L_0x0006:
            r2.l(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x000a:
            r2.q(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x004a
        L_0x000e:
            r2.p(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0012:
            r2.o(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0016:
            r2.n(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x001a:
            r2.m(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x001e:
            r2.a(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0022:
            r2.b(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0026:
            r2.c(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x002a:
            r2.d(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x002e:
            r2.e(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0032:
            r2.f(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0036:
            r2.g(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x003a:
            r2.i(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x003e:
            r2.j(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0042:
            r2.h(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x0046:
            r2.k(r3)     // Catch:{ Throwable -> 0x004b }
            goto L_0x0053
        L_0x004a:
            return
        L_0x004b:
            r3 = move-exception
            java.lang.String r0 = "MessageHandler"
            java.lang.String r1 = "handleMessage"
            com.amap.api.services.a.j.a(r3, r0, r1)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.s.handleMessage(android.os.Message):void");
    }

    private void k(Message message) {
        RouteSearch.OnRouteSearchListener onRouteSearchListener = (RouteSearch.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener != null) {
            if (message.what == 100) {
                Bundle data = message.getData();
                if (data != null) {
                    onRouteSearchListener.onBusRouteSearched((BusRouteResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
                }
            } else if (message.what == 101) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    onRouteSearchListener.onDriveRouteSearched((DriveRouteResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                }
            } else if (message.what == 102) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    onRouteSearchListener.onWalkRouteSearched((WalkRouteResult) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                }
            } else if (message.what == 103) {
                Bundle data4 = message.getData();
                if (data4 != null) {
                    onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                }
            } else {
                if (message.what == 104) {
                    Bundle data5 = message.getData();
                    if (data5 != null) {
                        onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data5.getInt("errorCode"));
                    }
                }
            }
        }
    }
}
