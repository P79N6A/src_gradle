package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class ay implements IRoutePOISearch {

    /* renamed from: a  reason: collision with root package name */
    private RoutePOISearchQuery f6527a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6528b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public RoutePOISearch.OnRoutePOISearchListener f6529c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f6530d = s.a();

    public RoutePOISearchQuery getQuery() {
        return this.f6527a;
    }

    public void searchRoutePOIAsyn() {
        ai.a().a(new Runnable() {
            public void run() {
                RoutePOISearchResult routePOISearchResult;
                AMapException e2;
                s.j jVar;
                Message obtainMessage = ay.this.f6530d.obtainMessage();
                obtainMessage.arg1 = 14;
                Bundle bundle = new Bundle();
                try {
                    routePOISearchResult = ay.this.searchRoutePOI();
                    try {
                        bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                        jVar = new s.j();
                    } catch (AMapException e3) {
                        e2 = e3;
                        try {
                            bundle.putInt("errorCode", e2.getErrorCode());
                            jVar = new s.j();
                            jVar.f6904b = ay.this.f6529c;
                            jVar.f6903a = routePOISearchResult;
                            obtainMessage.obj = jVar;
                            obtainMessage.setData(bundle);
                            ay.this.f6530d.sendMessage(obtainMessage);
                        } catch (Throwable th) {
                            th = th;
                            s.j jVar2 = new s.j();
                            jVar2.f6904b = ay.this.f6529c;
                            jVar2.f6903a = routePOISearchResult;
                            obtainMessage.obj = jVar2;
                            obtainMessage.setData(bundle);
                            ay.this.f6530d.sendMessage(obtainMessage);
                            throw th;
                        }
                    }
                } catch (AMapException e4) {
                    AMapException aMapException = e4;
                    routePOISearchResult = null;
                    e2 = aMapException;
                    bundle.putInt("errorCode", e2.getErrorCode());
                    jVar = new s.j();
                    jVar.f6904b = ay.this.f6529c;
                    jVar.f6903a = routePOISearchResult;
                    obtainMessage.obj = jVar;
                    obtainMessage.setData(bundle);
                    ay.this.f6530d.sendMessage(obtainMessage);
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    routePOISearchResult = null;
                    th = th3;
                    s.j jVar22 = new s.j();
                    jVar22.f6904b = ay.this.f6529c;
                    jVar22.f6903a = routePOISearchResult;
                    obtainMessage.obj = jVar22;
                    obtainMessage.setData(bundle);
                    ay.this.f6530d.sendMessage(obtainMessage);
                    throw th;
                }
                jVar.f6904b = ay.this.f6529c;
                jVar.f6903a = routePOISearchResult;
                obtainMessage.obj = jVar;
                obtainMessage.setData(bundle);
                ay.this.f6530d.sendMessage(obtainMessage);
            }
        });
    }

    private boolean a() {
        if (this.f6527a == null || this.f6527a.getSearchType() == null) {
            return false;
        }
        if (this.f6527a.getFrom() == null && this.f6527a.getTo() == null && this.f6527a.getPolylines() == null) {
            return false;
        }
        return true;
    }

    public RoutePOISearchResult searchRoutePOI() throws AMapException {
        try {
            q.a(this.f6528b);
            if (a()) {
                return (RoutePOISearchResult) new af(this.f6528b, this.f6527a.clone()).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, "RoutePOISearchCore", "searchRoutePOI");
            throw e2;
        }
    }

    public void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        this.f6527a = routePOISearchQuery;
    }

    public void setRoutePOISearchListener(RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener) {
        this.f6529c = onRoutePOISearchListener;
    }

    public ay(Context context, RoutePOISearchQuery routePOISearchQuery) {
        this.f6528b = context;
        this.f6527a = routePOISearchQuery;
    }
}
