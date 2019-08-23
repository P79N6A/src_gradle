package com.douyin.share.a.c;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.douyin.share.a.b.b.d;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.rocket.android.opensdk.message.RocketMediaContent;
import com.rocket.android.opensdk.message.RocketShareMessage;
import com.rocket.android.opensdk.message.RocketWebPageContent;

public final class f extends d {

    /* renamed from: a  reason: collision with root package name */
    IRocketAPI f23147a = RocketAPIFactory.createRocketAPI(this.f23148c, this.f23149d, true);

    /* renamed from: c  reason: collision with root package name */
    private Context f23148c;

    /* renamed from: d  reason: collision with root package name */
    private String f23149d;

    /* renamed from: e  reason: collision with root package name */
    private String f23150e;

    public final boolean a(d dVar, Handler handler) {
        boolean z;
        if (dVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19 && this.f23147a != null && this.f23147a.isRocketInstalled() && this.f23147a.isRocketSupportAPI()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(this.f23148c, "rs9760739781918870", true);
        RocketMediaContent rocketMediaContent = new RocketMediaContent();
        rocketMediaContent.mMediaObject = new RocketWebPageContent(dVar.b());
        rocketMediaContent.mTitle = dVar.d();
        rocketMediaContent.mContent = dVar.e();
        rocketMediaContent.mThumbUrl = dVar.g();
        rocketMediaContent.mSource = "抖音短视频";
        RocketShareMessage.Req req = new RocketShareMessage.Req();
        req.mMediaContent = rocketMediaContent;
        req.mScene = 1;
        createRocketAPI.sendReq(req);
        return true;
    }

    public f(Context context, String str, String str2) {
        super(context);
        this.f23149d = str;
        this.f23150e = str2;
        this.f23148c = context;
    }
}
