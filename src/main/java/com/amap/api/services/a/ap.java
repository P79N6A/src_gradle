package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

public class ap implements IBusLineSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6456a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public BusLineSearch.OnBusLineSearchListener f6457b;

    /* renamed from: c  reason: collision with root package name */
    private BusLineQuery f6458c;

    /* renamed from: d  reason: collision with root package name */
    private BusLineQuery f6459d;

    /* renamed from: e  reason: collision with root package name */
    private int f6460e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<BusLineResult> f6461f = new ArrayList<>();
    /* access modifiers changed from: private */
    public Handler g = null;

    public BusLineQuery getQuery() {
        return this.f6458c;
    }

    public void searchBusLineAsyn() {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.arg1 = 3;
                        obtainMessage.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        s.a aVar = new s.a();
                        obtainMessage.obj = aVar;
                        aVar.f6886b = ap.this.f6457b;
                        aVar.f6885a = ap.this.searchBusLine();
                    } catch (AMapException e2) {
                        obtainMessage.what = e2.getErrorCode();
                    } catch (Throwable th) {
                        ap.this.g.sendMessage(obtainMessage);
                        throw th;
                    }
                    ap.this.g.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private boolean a() {
        if (this.f6458c != null && !j.a(this.f6458c.getQueryString())) {
            return true;
        }
        return false;
    }

    public BusLineResult searchBusLine() throws AMapException {
        try {
            q.a(this.f6456a);
            if (this.f6459d == null || !a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!this.f6458c.weakEquals(this.f6459d)) {
                this.f6459d = this.f6458c.clone();
                this.f6460e = 0;
                if (this.f6461f != null) {
                    this.f6461f.clear();
                }
            }
            if (this.f6460e == 0) {
                BusLineResult busLineResult = (BusLineResult) new d(this.f6456a, this.f6458c.clone()).c();
                a(busLineResult);
                return busLineResult;
            }
            BusLineResult b2 = b(this.f6458c.getPageNumber());
            if (b2 != null) {
                return b2;
            }
            BusLineResult busLineResult2 = (BusLineResult) new d(this.f6456a, this.f6458c).c();
            this.f6461f.set(this.f6458c.getPageNumber(), busLineResult2);
            return busLineResult2;
        } catch (AMapException e2) {
            j.a(e2, "BusLineSearch", "searchBusLine");
            throw new AMapException(e2.getErrorMessage());
        }
    }

    public void setOnBusLineSearchListener(BusLineSearch.OnBusLineSearchListener onBusLineSearchListener) {
        this.f6457b = onBusLineSearchListener;
    }

    private boolean a(int i) {
        if (i >= this.f6460e || i < 0) {
            return false;
        }
        return true;
    }

    private BusLineResult b(int i) {
        if (a(i)) {
            return this.f6461f.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    public void setQuery(BusLineQuery busLineQuery) {
        if (!this.f6458c.weakEquals(busLineQuery)) {
            this.f6458c = busLineQuery;
            this.f6459d = busLineQuery.clone();
        }
    }

    private void a(BusLineResult busLineResult) {
        this.f6461f = new ArrayList<>();
        for (int i = 0; i < this.f6460e; i++) {
            this.f6461f.add(null);
        }
        if (this.f6460e >= 0 && a(this.f6458c.getPageNumber())) {
            this.f6461f.set(this.f6458c.getPageNumber(), busLineResult);
        }
    }

    public ap(Context context, BusLineQuery busLineQuery) {
        this.f6456a = context.getApplicationContext();
        this.f6458c = busLineQuery;
        if (busLineQuery != null) {
            this.f6459d = busLineQuery.clone();
        }
        this.g = s.a();
    }
}
