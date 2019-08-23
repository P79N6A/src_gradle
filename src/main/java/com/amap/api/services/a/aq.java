package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

public class aq implements IBusStationSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6463a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public BusStationSearch.OnBusStationSearchListener f6464b;

    /* renamed from: c  reason: collision with root package name */
    private BusStationQuery f6465c;

    /* renamed from: d  reason: collision with root package name */
    private BusStationQuery f6466d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<BusStationResult> f6467e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private int f6468f;
    /* access modifiers changed from: private */
    public Handler g;

    public BusStationQuery getQuery() {
        return this.f6465c;
    }

    public void searchBusStationAsyn() {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.arg1 = 7;
                        s.b bVar = new s.b();
                        bVar.f6888b = aq.this.f6464b;
                        obtainMessage.obj = bVar;
                        BusStationResult searchBusStation = aq.this.searchBusStation();
                        obtainMessage.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        bVar.f6887a = searchBusStation;
                    } catch (AMapException e2) {
                        obtainMessage.what = e2.getErrorCode();
                    } catch (Throwable th) {
                        aq.this.g.sendMessage(obtainMessage);
                        throw th;
                    }
                    aq.this.g.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private boolean a() {
        if (this.f6465c != null && !j.a(this.f6465c.getQueryString())) {
            return true;
        }
        return false;
    }

    public BusStationResult searchBusStation() throws AMapException {
        BusStationResult busStationResult;
        try {
            q.a(this.f6463a);
            if (a()) {
                if (!this.f6465c.weakEquals(this.f6466d)) {
                    this.f6466d = this.f6465c.clone();
                    this.f6468f = 0;
                    if (this.f6467e != null) {
                        this.f6467e.clear();
                    }
                }
                if (this.f6468f == 0) {
                    busStationResult = (BusStationResult) new d(this.f6463a, this.f6465c).c();
                    this.f6468f = busStationResult.getPageCount();
                    a(busStationResult);
                } else {
                    busStationResult = b(this.f6465c.getPageNumber());
                    if (busStationResult == null) {
                        busStationResult = (BusStationResult) new d(this.f6463a, this.f6465c).c();
                        this.f6467e.set(this.f6465c.getPageNumber(), busStationResult);
                    }
                }
                return busStationResult;
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, "BusStationSearch", "searchBusStation");
            throw new AMapException(e2.getErrorMessage());
        } catch (Throwable th) {
            j.a(th, "BusStationSearch", "searchBusStation");
            return null;
        }
    }

    public void setOnBusStationSearchListener(BusStationSearch.OnBusStationSearchListener onBusStationSearchListener) {
        this.f6464b = onBusStationSearchListener;
    }

    private boolean a(int i) {
        if (i > this.f6468f || i < 0) {
            return false;
        }
        return true;
    }

    public void setQuery(BusStationQuery busStationQuery) {
        if (!busStationQuery.weakEquals(this.f6465c)) {
            this.f6465c = busStationQuery;
        }
    }

    private BusStationResult b(int i) {
        if (a(i)) {
            return this.f6467e.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    private void a(BusStationResult busStationResult) {
        this.f6467e = new ArrayList<>();
        for (int i = 0; i <= this.f6468f; i++) {
            this.f6467e.add(null);
        }
        if (this.f6468f > 0) {
            this.f6467e.set(this.f6465c.getPageNumber(), busStationResult);
        }
    }

    public aq(Context context, BusStationQuery busStationQuery) {
        this.f6463a = context.getApplicationContext();
        this.f6465c = busStationQuery;
        this.g = s.a();
    }
}
