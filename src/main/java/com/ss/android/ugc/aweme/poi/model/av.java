package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.PoiFilterListResponse;

public final class av<TTaskResult> implements g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59898a;

    /* renamed from: b  reason: collision with root package name */
    Handler f59899b;

    /* renamed from: c  reason: collision with root package name */
    String f59900c;

    public final Object then(i<TTaskResult> iVar) throws Exception {
        PoiFilterListResponse poiFilterListResponse;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f59898a, false, 65172, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f59898a, false, 65172, new Class[]{i.class}, Object.class);
        } else if (this.f59899b == null) {
            return null;
        } else {
            Message obtainMessage = this.f59899b.obtainMessage();
            if (iVar.c()) {
                obtainMessage.obj = null;
            } else {
                if (iVar.d()) {
                    PoiFilterListResponse poiFilterListResponse2 = new PoiFilterListResponse();
                    poiFilterListResponse2.requestKey = this.f59900c;
                    poiFilterListResponse2.exception = iVar.f();
                    poiFilterListResponse = poiFilterListResponse2;
                } else {
                    Object e2 = iVar.e();
                    boolean z = e2 instanceof PoiFilterListResponse;
                    poiFilterListResponse = e2;
                    if (z) {
                        ((PoiFilterListResponse) e2).requestKey = this.f59900c;
                        poiFilterListResponse = e2;
                    }
                }
                obtainMessage.obj = poiFilterListResponse;
            }
            this.f59899b.sendMessage(obtainMessage);
            return null;
        }
    }

    public av(Handler handler, String str) {
        this.f59899b = handler;
        this.f59900c = str;
    }
}
