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

public class c extends d {

    /* renamed from: a  reason: collision with root package name */
    IRocketAPI f23142a = RocketAPIFactory.createRocketAPI(this.f23143c, this.f23144d, true);

    /* renamed from: c  reason: collision with root package name */
    private Context f23143c;

    /* renamed from: d  reason: collision with root package name */
    private String f23144d;

    /* renamed from: e  reason: collision with root package name */
    private String f23145e;

    public final boolean a() {
        if (Build.VERSION.SDK_INT > 19 && this.f23142a != null && this.f23142a.isRocketInstalled() && this.f23142a.isRocketSupportAPI()) {
            return true;
        }
        return false;
    }

    public final boolean a(d dVar, Handler handler) {
        if (dVar == null || !a()) {
            return false;
        }
        RocketMediaContent rocketMediaContent = new RocketMediaContent();
        rocketMediaContent.mMediaObject = new RocketWebPageContent(dVar.b());
        rocketMediaContent.mTitle = dVar.d();
        rocketMediaContent.mContent = dVar.i();
        rocketMediaContent.mThumbUrl = dVar.g();
        rocketMediaContent.mSource = "抖音短视频";
        RocketShareMessage.Req req = new RocketShareMessage.Req();
        req.mMediaContent = rocketMediaContent;
        req.mScene = 0;
        this.f23142a.sendReq(req);
        return true;
    }

    public c(Context context, String str, String str2) {
        super(context);
        this.f23144d = str;
        this.f23145e = str2;
        this.f23143c = context;
    }
}
