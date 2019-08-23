package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.interfaces.IGeocodeSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class au implements IGeocodeSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6494a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public GeocodeSearch.OnGeocodeSearchListener f6495b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f6496c = s.a();

    public final void setOnGeocodeSearchListener(GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener) {
        this.f6495b = onGeocodeSearchListener;
    }

    public au(Context context) {
        this.f6494a = context.getApplicationContext();
    }

    private boolean a(RegeocodeQuery regeocodeQuery) {
        if (regeocodeQuery == null || regeocodeQuery.getPoint() == null || regeocodeQuery.getLatLonType() == null) {
            return false;
        }
        return true;
    }

    public final void getFromLocationAsyn(final RegeocodeQuery regeocodeQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.arg1 = 2;
                        obtainMessage.what = 201;
                        s.i iVar = new s.i();
                        iVar.f6902b = au.this.f6495b;
                        obtainMessage.obj = iVar;
                        iVar.f6901a = new RegeocodeResult(regeocodeQuery, au.this.getFromLocation(regeocodeQuery));
                        obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    } catch (AMapException e2) {
                        obtainMessage.arg2 = e2.getErrorCode();
                    } catch (Throwable th) {
                        au.this.f6496c.sendMessage(obtainMessage);
                        throw th;
                    }
                    au.this.f6496c.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "GeocodeSearch", "getFromLocationAsyn_threadcreate");
        }
    }

    public final void getFromLocationNameAsyn(final GeocodeQuery geocodeQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.what = 200;
                        obtainMessage.arg1 = 2;
                        obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        s.e eVar = new s.e();
                        eVar.f6894b = au.this.f6495b;
                        obtainMessage.obj = eVar;
                        eVar.f6893a = new GeocodeResult(geocodeQuery, au.this.getFromLocationName(geocodeQuery));
                    } catch (AMapException e2) {
                        obtainMessage.arg2 = e2.getErrorCode();
                    } catch (Throwable th) {
                        au.this.f6496c.sendMessage(obtainMessage);
                        throw th;
                    }
                    au.this.f6496c.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "GeocodeSearch", "getFromLocationNameAsynThrowable");
        }
    }

    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        try {
            q.a(this.f6494a);
            if (a(regeocodeQuery)) {
                return (RegeocodeAddress) new ac(this.f6494a, regeocodeQuery).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, "GeocodeSearch", "getFromLocationAsyn");
            throw e2;
        }
    }

    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        try {
            q.a(this.f6494a);
            if (geocodeQuery != null) {
                return (List) new n(this.f6494a, geocodeQuery).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, "GeocodeSearch", "getFromLocationName");
            throw e2;
        }
    }
}
