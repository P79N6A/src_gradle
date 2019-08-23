package com.huawei.android.pushselfshow.richpush.favorites;

import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FavoritesActivity f25249a;

    b(FavoritesActivity favoritesActivity) {
        this.f25249a = favoritesActivity;
    }

    public void run() {
        e.a("PushSelfShowLog", "onCreate mThread run");
        this.f25249a.h.b();
        this.f25249a.f25229a.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }
}
