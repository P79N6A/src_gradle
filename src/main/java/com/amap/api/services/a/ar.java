package com.amap.api.services.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.List;

public class ar implements ICloudSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public CloudSearch.OnCloudSearchListener f6471b;

    /* renamed from: c  reason: collision with root package name */
    private CloudSearch.Query f6472c;

    /* renamed from: d  reason: collision with root package name */
    private int f6473d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, CloudResult> f6474e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Handler f6475f = s.a();

    public void setOnCloudSearchListener(CloudSearch.OnCloudSearchListener onCloudSearchListener) {
        this.f6471b = onCloudSearchListener;
    }

    public ar(Context context) {
        this.f6470a = context.getApplicationContext();
    }

    private boolean b(int i) {
        if (i > this.f6473d || i <= 0) {
            return false;
        }
        return true;
    }

    public void searchCloudAsyn(final CloudSearch.Query query) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.arg1 = 12;
                        obtainMessage.what = 700;
                        s.d dVar = new s.d();
                        dVar.f6892b = ar.this.f6471b;
                        obtainMessage.obj = dVar;
                        dVar.f6891a = ar.this.a(query);
                        obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    } catch (AMapException e2) {
                        obtainMessage.arg2 = e2.getErrorCode();
                    } catch (Throwable th) {
                        ar.this.f6475f.sendMessage(obtainMessage);
                        throw th;
                    }
                    ar.this.f6475f.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public CloudResult a(int i) {
        if (b(i)) {
            return this.f6474e.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    /* access modifiers changed from: private */
    public CloudResult a(CloudSearch.Query query) throws AMapException {
        CloudResult cloudResult;
        CloudResult cloudResult2 = null;
        try {
            if (b(query)) {
                if (!query.queryEquals(this.f6472c)) {
                    this.f6473d = 0;
                    this.f6472c = query.clone();
                    if (this.f6474e != null) {
                        this.f6474e.clear();
                    }
                }
                if (this.f6473d == 0) {
                    CloudResult cloudResult3 = (CloudResult) new h(this.f6470a, query).c();
                    a(cloudResult3, query);
                    return cloudResult3;
                }
                cloudResult = a(query.getPageNum());
                if (cloudResult != null) {
                    return cloudResult;
                }
                CloudResult cloudResult4 = (CloudResult) new h(this.f6470a, query).c();
                this.f6474e.put(Integer.valueOf(query.getPageNum()), cloudResult4);
                return cloudResult4;
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (Throwable th) {
            th = th;
            cloudResult = cloudResult2;
        }
        j.a(th, "CloudSearch", "searchCloud");
        if (!(th instanceof AMapException)) {
            return cloudResult;
        }
        throw ((AMapException) th);
    }

    private boolean b(CloudSearch.Query query) {
        if (query == null || j.a(query.getTableID()) || query.getBound() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Bound") && query.getBound().getCenter() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Rectangle")) {
            LatLonPoint lowerLeft = query.getBound().getLowerLeft();
            LatLonPoint upperRight = query.getBound().getUpperRight();
            if (lowerLeft == null || upperRight == null || lowerLeft.getLatitude() >= upperRight.getLatitude() || lowerLeft.getLongitude() >= upperRight.getLongitude()) {
                return false;
            }
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Polygon")) {
            List polyGonList = query.getBound().getPolyGonList();
            for (int i = 0; i < polyGonList.size(); i++) {
                if (polyGonList.get(i) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void searchCloudDetailAsyn(final String str, final String str2) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    try {
                        obtainMessage.arg1 = 12;
                        obtainMessage.what = 701;
                        s.c cVar = new s.c();
                        cVar.f6890b = ar.this.f6471b;
                        obtainMessage.obj = cVar;
                        cVar.f6889a = ar.this.a(str, str2);
                        obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    } catch (AMapException e2) {
                        obtainMessage.arg2 = e2.getErrorCode();
                    } catch (Throwable th) {
                        ar.this.f6475f.sendMessage(obtainMessage);
                        throw th;
                    }
                    ar.this.f6475f.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void a(CloudResult cloudResult, CloudSearch.Query query) {
        this.f6474e = new HashMap<>();
        if (this.f6473d > 0) {
            this.f6474e.put(Integer.valueOf(query.getPageNum()), cloudResult);
        }
    }

    /* access modifiers changed from: private */
    public CloudItemDetail a(String str, String str2) throws AMapException {
        if (str == null || str.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } else if (str2 == null || str2.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } else {
            try {
                return (CloudItemDetail) new g(this.f6470a, new aa(str, str2)).c();
            } catch (Throwable th) {
                j.a(th, "CloudSearch", "searchCloudDetail");
                if (!(th instanceof AMapException)) {
                    return null;
                }
                throw ((AMapException) th);
            }
        }
    }
}
