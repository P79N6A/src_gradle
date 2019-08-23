package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistanceSearch;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class as implements IDistanceSearch {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6481a = "as";

    /* renamed from: b  reason: collision with root package name */
    private Context f6482b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f6483c = s.a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public DistanceSearch.OnDistanceSearchListener f6484d;

    public void setDistanceSearchListener(DistanceSearch.OnDistanceSearchListener onDistanceSearchListener) {
        this.f6484d = onDistanceSearchListener;
    }

    public as(Context context) {
        this.f6482b = context.getApplicationContext();
    }

    public void calculateRouteDistanceAsyn(final DistanceSearch.DistanceQuery distanceQuery) {
        ai.a().a(new Runnable() {
            public void run() {
                Message obtainMessage = s.a().obtainMessage();
                obtainMessage.what = 400;
                obtainMessage.arg1 = 16;
                Bundle bundle = new Bundle();
                DistanceResult distanceResult = null;
                try {
                    DistanceResult calculateRouteDistance = as.this.calculateRouteDistance(distanceQuery);
                    try {
                        bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                        obtainMessage.obj = as.this.f6484d;
                        bundle.putParcelable("result", calculateRouteDistance);
                    } catch (AMapException e2) {
                        DistanceResult distanceResult2 = calculateRouteDistance;
                        e = e2;
                        distanceResult = distanceResult2;
                        try {
                            bundle.putInt("errorCode", e.getErrorCode());
                            obtainMessage.obj = as.this.f6484d;
                            bundle.putParcelable("result", distanceResult);
                            obtainMessage.setData(bundle);
                            as.this.f6483c.sendMessage(obtainMessage);
                        } catch (Throwable th) {
                            th = th;
                            obtainMessage.obj = as.this.f6484d;
                            bundle.putParcelable("result", distanceResult);
                            obtainMessage.setData(bundle);
                            as.this.f6483c.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        DistanceResult distanceResult3 = calculateRouteDistance;
                        th = th2;
                        distanceResult = distanceResult3;
                        obtainMessage.obj = as.this.f6484d;
                        bundle.putParcelable("result", distanceResult);
                        obtainMessage.setData(bundle);
                        as.this.f6483c.sendMessage(obtainMessage);
                        throw th;
                    }
                } catch (AMapException e3) {
                    e = e3;
                    bundle.putInt("errorCode", e.getErrorCode());
                    obtainMessage.obj = as.this.f6484d;
                    bundle.putParcelable("result", distanceResult);
                    obtainMessage.setData(bundle);
                    as.this.f6483c.sendMessage(obtainMessage);
                }
                obtainMessage.setData(bundle);
                as.this.f6483c.sendMessage(obtainMessage);
            }
        });
    }

    private boolean a(DistanceSearch.DistanceQuery distanceQuery) {
        if (distanceQuery.getDestination() == null || distanceQuery.getOrigins() == null || distanceQuery.getOrigins().size() <= 0) {
            return true;
        }
        return false;
    }

    public DistanceResult calculateRouteDistance(DistanceSearch.DistanceQuery distanceQuery) throws AMapException {
        try {
            q.a(this.f6482b);
            if (distanceQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (!a(distanceQuery)) {
                DistanceSearch.DistanceQuery clone = distanceQuery.clone();
                DistanceResult distanceResult = (DistanceResult) new k(this.f6482b, clone).c();
                if (distanceResult != null) {
                    distanceResult.setDistanceQuery(clone);
                }
                return distanceResult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, f6481a, "calculateWalkRoute");
            throw e2;
        }
    }
}
