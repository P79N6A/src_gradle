package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.ITrafficSearch;
import com.amap.api.services.traffic.CircleTrafficQuery;
import com.amap.api.services.traffic.RoadTrafficQuery;
import com.amap.api.services.traffic.TrafficSearch;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public class bb implements ITrafficSearch {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6564a = "bb";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public TrafficSearch.OnTrafficSearchListener f6565b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6566c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f6567d = s.a();

    public void setTrafficSearchListener(TrafficSearch.OnTrafficSearchListener onTrafficSearchListener) {
        this.f6565b = onTrafficSearchListener;
    }

    public bb(Context context) {
        this.f6566c = context.getApplicationContext();
    }

    public void loadTrafficByCircleAsyn(final CircleTrafficQuery circleTrafficQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = 301;
                    obtainMessage.arg1 = 15;
                    Bundle bundle = new Bundle();
                    TrafficStatusResult trafficStatusResult = null;
                    try {
                        TrafficStatusResult loadTrafficByCircle = bb.this.loadTrafficByCircle(circleTrafficQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = bb.this.f6565b;
                            bundle.putParcelable("result", loadTrafficByCircle);
                        } catch (AMapException e2) {
                            TrafficStatusResult trafficStatusResult2 = loadTrafficByCircle;
                            e = e2;
                            trafficStatusResult = trafficStatusResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = bb.this.f6565b;
                                bundle.putParcelable("result", trafficStatusResult);
                                obtainMessage.setData(bundle);
                                bb.this.f6567d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = bb.this.f6565b;
                                bundle.putParcelable("result", trafficStatusResult);
                                obtainMessage.setData(bundle);
                                bb.this.f6567d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TrafficStatusResult trafficStatusResult3 = loadTrafficByCircle;
                            th = th2;
                            trafficStatusResult = trafficStatusResult3;
                            obtainMessage.obj = bb.this.f6565b;
                            bundle.putParcelable("result", trafficStatusResult);
                            obtainMessage.setData(bundle);
                            bb.this.f6567d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = bb.this.f6565b;
                        bundle.putParcelable("result", trafficStatusResult);
                        obtainMessage.setData(bundle);
                        bb.this.f6567d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    bb.this.f6567d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, f6564a, "loadTrafficByCircleAsyn");
        }
    }

    public void loadTrafficByRoadAsyn(final RoadTrafficQuery roadTrafficQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = c.f69428f;
                    obtainMessage.arg1 = 15;
                    Bundle bundle = new Bundle();
                    TrafficStatusResult trafficStatusResult = null;
                    try {
                        TrafficStatusResult loadTrafficByRoad = bb.this.loadTrafficByRoad(roadTrafficQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = bb.this.f6565b;
                            bundle.putParcelable("result", loadTrafficByRoad);
                        } catch (AMapException e2) {
                            TrafficStatusResult trafficStatusResult2 = loadTrafficByRoad;
                            e = e2;
                            trafficStatusResult = trafficStatusResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = bb.this.f6565b;
                                bundle.putParcelable("result", trafficStatusResult);
                                obtainMessage.setData(bundle);
                                bb.this.f6567d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = bb.this.f6565b;
                                bundle.putParcelable("result", trafficStatusResult);
                                obtainMessage.setData(bundle);
                                bb.this.f6567d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TrafficStatusResult trafficStatusResult3 = loadTrafficByRoad;
                            th = th2;
                            trafficStatusResult = trafficStatusResult3;
                            obtainMessage.obj = bb.this.f6565b;
                            bundle.putParcelable("result", trafficStatusResult);
                            obtainMessage.setData(bundle);
                            bb.this.f6567d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = bb.this.f6565b;
                        bundle.putParcelable("result", trafficStatusResult);
                        obtainMessage.setData(bundle);
                        bb.this.f6567d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    bb.this.f6567d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, f6564a, "loadTrafficByRoadAsyn");
        }
    }

    public TrafficStatusResult loadTrafficByCircle(CircleTrafficQuery circleTrafficQuery) throws AMapException {
        try {
            q.a(this.f6566c);
            if (circleTrafficQuery != null) {
                return (TrafficStatusResult) new e(this.f6566c, circleTrafficQuery.clone()).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, f6564a, "loadTrafficByCircle");
            throw e2;
        }
    }

    public TrafficStatusResult loadTrafficByRoad(RoadTrafficQuery roadTrafficQuery) throws AMapException {
        try {
            q.a(this.f6566c);
            if (roadTrafficQuery != null) {
                return (TrafficStatusResult) new ae(this.f6566c, roadTrafficQuery.clone()).c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e2) {
            j.a(e2, f6564a, "loadTrafficByRoad");
            throw e2;
        }
    }
}
