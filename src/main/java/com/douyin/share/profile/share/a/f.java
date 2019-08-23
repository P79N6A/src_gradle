package com.douyin.share.profile.share.a;

import android.content.Context;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.c.t;
import com.douyin.share.profile.share.b.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;

public final class f extends t {
    public final WXMediaMessage a(d dVar) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = dVar.d();
        wXMediaMessage.description = dVar.e();
        wXMediaMessage.thumbData = dVar.f();
        wXMediaMessage.mediaObject = new WXWebpageObject(dVar.b());
        return wXMediaMessage;
    }

    public final boolean a(a aVar) {
        if (!a()) {
            return false;
        }
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = aVar.f23253a.url;
        wXMiniProgramObject.userName = "wx89138bd778592716";
        wXMiniProgramObject.path = "pages/detail/detail?aweme_id=123";
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXMiniProgramObject);
        wXMediaMessage.title = aVar.d();
        wXMediaMessage.description = aVar.e();
        wXMediaMessage.thumbData = aVar.f();
        a(wXMediaMessage);
        return true;
    }

    public f(Context context, String str) {
        super(context, str, 0);
    }
}
