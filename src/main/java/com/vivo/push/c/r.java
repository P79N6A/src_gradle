package com.vivo.push.c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.b.q;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.k;
import com.vivo.push.util.o;
import com.vivo.push.util.p;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InsideNotificationItem f81564a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f81565b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q f81566c;

    public final void run() {
        char c2;
        if (this.f81566c.f81532b.onNotificationMessageArrived(this.f81566c.f81705a, p.a(this.f81564a))) {
            o.d("OnNotificationArrivedTask", "this notification has Intercept");
            return;
        }
        k kVar = new k(this.f81566c.f81705a, this.f81564a, this.f81565b.f(), this.f81566c.f81532b.isAllowNet(this.f81566c.f81705a));
        boolean isShowBigPicOnMobileNet = this.f81564a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f81564a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f81564a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            o.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
            if (!isShowBigPicOnMobileNet) {
                o.a(this.f81566c.f81705a, "mobile net unshow");
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f81566c.f81705a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        c2 = 2;
                    } else if (type == 0) {
                        c2 = 1;
                    } else {
                        c2 = 3;
                    }
                } else {
                    c2 = 0;
                }
                if (c2 == 1) {
                    purePicUrl = null;
                    this.f81564a.clearCoverUrl();
                    this.f81564a.clearPurePicUrl();
                }
            } else {
                o.a(this.f81566c.f81705a, "mobile net show");
            }
        }
        kVar.execute(new String[]{this.f81564a.getIconUrl(), purePicUrl});
    }

    r(q qVar, InsideNotificationItem insideNotificationItem, q qVar2) {
        this.f81566c = qVar;
        this.f81564a = insideNotificationItem;
        this.f81565b = qVar2;
    }
}
