package com.huawei.android.pushselfshow.richpush.html;

import android.app.Activity;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f25343a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25344b;

    h(HtmlViewer htmlViewer, Activity activity) {
        this.f25344b = htmlViewer;
        this.f25343a = activity;
    }

    public void run() {
        if (this.f25344b.b(this.f25343a) < 1000) {
            this.f25344b.f25262f.b();
        } else {
            this.f25344b.f25258b.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }
}
