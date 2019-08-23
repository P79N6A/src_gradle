package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.List;

public class ax implements IPoiSearch {
    private static HashMap<Integer, PoiResult> i;

    /* renamed from: a  reason: collision with root package name */
    private PoiSearch.SearchBound f6518a;

    /* renamed from: b  reason: collision with root package name */
    private PoiSearch.Query f6519b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6520c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public PoiSearch.OnPoiSearchListener f6521d;

    /* renamed from: e  reason: collision with root package name */
    private String f6522e = "zh-CN";

    /* renamed from: f  reason: collision with root package name */
    private PoiSearch.Query f6523f;
    private PoiSearch.SearchBound g;
    private int h;
    /* access modifiers changed from: private */
    public Handler j;

    public PoiSearch.SearchBound getBound() {
        return this.f6518a;
    }

    public String getLanguage() {
        return this.f6522e;
    }

    public PoiSearch.Query getQuery() {
        return this.f6519b;
    }

    public void searchPOIAsyn() {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    PoiResult poiResult;
                    AMapException e2;
                    s.h hVar;
                    Message obtainMessage = ax.this.j.obtainMessage();
                    obtainMessage.arg1 = 6;
                    obtainMessage.what = 600;
                    Bundle bundle = new Bundle();
                    try {
                        poiResult = ax.this.searchPOI();
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            hVar = new s.h();
                        } catch (AMapException e3) {
                            e2 = e3;
                            try {
                                bundle.putInt("errorCode", e2.getErrorCode());
                                hVar = new s.h();
                                hVar.f6900b = ax.this.f6521d;
                                hVar.f6899a = poiResult;
                                obtainMessage.obj = hVar;
                                obtainMessage.setData(bundle);
                                ax.this.j.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                s.h hVar2 = new s.h();
                                hVar2.f6900b = ax.this.f6521d;
                                hVar2.f6899a = poiResult;
                                obtainMessage.obj = hVar2;
                                obtainMessage.setData(bundle);
                                ax.this.j.sendMessage(obtainMessage);
                                throw th;
                            }
                        }
                    } catch (AMapException e4) {
                        AMapException aMapException = e4;
                        poiResult = null;
                        e2 = aMapException;
                        bundle.putInt("errorCode", e2.getErrorCode());
                        hVar = new s.h();
                        hVar.f6900b = ax.this.f6521d;
                        hVar.f6899a = poiResult;
                        obtainMessage.obj = hVar;
                        obtainMessage.setData(bundle);
                        ax.this.j.sendMessage(obtainMessage);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        poiResult = null;
                        th = th3;
                        s.h hVar22 = new s.h();
                        hVar22.f6900b = ax.this.f6521d;
                        hVar22.f6899a = poiResult;
                        obtainMessage.obj = hVar22;
                        obtainMessage.setData(bundle);
                        ax.this.j.sendMessage(obtainMessage);
                        throw th;
                    }
                    hVar.f6900b = ax.this.f6521d;
                    hVar.f6899a = poiResult;
                    obtainMessage.obj = hVar;
                    obtainMessage.setData(bundle);
                    ax.this.j.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private boolean b() {
        PoiSearch.SearchBound bound = getBound();
        if (bound != null && bound.getShape().equals("Bound")) {
            return true;
        }
        return false;
    }

    private boolean a() {
        if (this.f6519b == null) {
            return false;
        }
        if (!j.a(this.f6519b.getQueryString()) || !j.a(this.f6519b.getCategory())) {
            return true;
        }
        return false;
    }

    private boolean c() {
        PoiSearch.SearchBound bound = getBound();
        if (bound != null) {
            if (bound.getShape().equals("Bound")) {
                if (bound.getCenter() == null) {
                    return false;
                }
            } else if (bound.getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = bound.getPolyGonList();
                if (polyGonList == null || polyGonList.size() == 0) {
                    return false;
                }
                for (int i2 = 0; i2 < polyGonList.size(); i2++) {
                    if (polyGonList.get(i2) == null) {
                        return false;
                    }
                }
            } else if (bound.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = bound.getLowerLeft();
                LatLonPoint upperRight = bound.getUpperRight();
                if (lowerLeft == null || upperRight == null || lowerLeft.getLatitude() >= upperRight.getLatitude() || lowerLeft.getLongitude() >= upperRight.getLongitude()) {
                    return false;
                }
            }
        }
        return true;
    }

    public PoiResult searchPOI() throws AMapException {
        try {
            q.a(this.f6520c);
            if (!b()) {
                if (!a()) {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                }
            }
            if (!c()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (this.f6519b != null) {
                if ((!this.f6519b.queryEquals(this.f6523f) && this.f6518a == null) || (!this.f6519b.queryEquals(this.f6523f) && !this.f6518a.equals(this.g))) {
                    this.h = 0;
                    this.f6523f = this.f6519b.clone();
                    if (this.f6518a != null) {
                        this.g = this.f6518a.clone();
                    }
                    if (i != null) {
                        i.clear();
                    }
                }
                PoiSearch.SearchBound searchBound = null;
                if (this.f6518a != null) {
                    searchBound = this.f6518a.clone();
                }
                if (this.h == 0) {
                    PoiResult poiResult = (PoiResult) new y(this.f6520c, new ab(this.f6519b.clone(), searchBound)).c();
                    a(poiResult);
                    return poiResult;
                }
                PoiResult a2 = a(this.f6519b.getPageNum());
                if (a2 != null) {
                    return a2;
                }
                PoiResult poiResult2 = (PoiResult) new y(this.f6520c, new ab(this.f6519b.clone(), searchBound)).c();
                i.put(Integer.valueOf(this.f6519b.getPageNum()), poiResult2);
                return poiResult2;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "PoiSearch", "searchPOI");
            throw new AMapException(e2.getErrorMessage());
        }
    }

    public void setBound(PoiSearch.SearchBound searchBound) {
        this.f6518a = searchBound;
    }

    public void setOnPoiSearchListener(PoiSearch.OnPoiSearchListener onPoiSearchListener) {
        this.f6521d = onPoiSearchListener;
    }

    public void setQuery(PoiSearch.Query query) {
        this.f6519b = query;
    }

    private boolean b(int i2) {
        if (i2 > this.h || i2 < 0) {
            return false;
        }
        return true;
    }

    public void searchPOIIdAsyn(final String str) {
        ai.a().a(new Runnable() {
            public void run() {
                Message obtainMessage = s.a().obtainMessage();
                obtainMessage.arg1 = 6;
                obtainMessage.what = 602;
                Bundle bundle = new Bundle();
                PoiItem poiItem = null;
                try {
                    PoiItem searchPOIId = ax.this.searchPOIId(str);
                    try {
                        bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                        s.g gVar = new s.g();
                        gVar.f6898b = ax.this.f6521d;
                        gVar.f6897a = searchPOIId;
                        obtainMessage.obj = gVar;
                    } catch (AMapException e2) {
                        PoiItem poiItem2 = searchPOIId;
                        e = e2;
                        poiItem = poiItem2;
                        try {
                            j.a(e, "PoiSearch", "searchPOIIdAsyn");
                            bundle.putInt("errorCode", e.getErrorCode());
                            s.g gVar2 = new s.g();
                            gVar2.f6898b = ax.this.f6521d;
                            gVar2.f6897a = poiItem;
                            obtainMessage.obj = gVar2;
                            obtainMessage.setData(bundle);
                            ax.this.j.sendMessage(obtainMessage);
                        } catch (Throwable th) {
                            th = th;
                            s.g gVar3 = new s.g();
                            gVar3.f6898b = ax.this.f6521d;
                            gVar3.f6897a = poiItem;
                            obtainMessage.obj = gVar3;
                            obtainMessage.setData(bundle);
                            ax.this.j.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        PoiItem poiItem3 = searchPOIId;
                        th = th2;
                        poiItem = poiItem3;
                        s.g gVar32 = new s.g();
                        gVar32.f6898b = ax.this.f6521d;
                        gVar32.f6897a = poiItem;
                        obtainMessage.obj = gVar32;
                        obtainMessage.setData(bundle);
                        ax.this.j.sendMessage(obtainMessage);
                        throw th;
                    }
                } catch (AMapException e3) {
                    e = e3;
                    j.a(e, "PoiSearch", "searchPOIIdAsyn");
                    bundle.putInt("errorCode", e.getErrorCode());
                    s.g gVar22 = new s.g();
                    gVar22.f6898b = ax.this.f6521d;
                    gVar22.f6897a = poiItem;
                    obtainMessage.obj = gVar22;
                    obtainMessage.setData(bundle);
                    ax.this.j.sendMessage(obtainMessage);
                }
                obtainMessage.setData(bundle);
                ax.this.j.sendMessage(obtainMessage);
            }
        });
    }

    /* access modifiers changed from: protected */
    public PoiResult a(int i2) {
        if (b(i2)) {
            return i.get(Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("page out of range");
    }

    public PoiItem searchPOIId(String str) throws AMapException {
        q.a(this.f6520c);
        return (PoiItem) new x(this.f6520c, str).c();
    }

    public void setLanguage(String str) {
        if ("en".equals(str)) {
            this.f6522e = "en";
        } else {
            this.f6522e = "zh-CN";
        }
    }

    private void a(PoiResult poiResult) {
        i = new HashMap<>();
        if (this.f6519b != null && poiResult != null && this.h > 0 && this.h > this.f6519b.getPageNum()) {
            i.put(Integer.valueOf(this.f6519b.getPageNum()), poiResult);
        }
    }

    public ax(Context context, PoiSearch.Query query) {
        this.f6520c = context.getApplicationContext();
        setQuery(query);
        this.j = s.a();
    }
}
