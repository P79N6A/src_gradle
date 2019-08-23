package com.douyin.share.a.c;

import android.content.Context;
import com.douyin.share.a.b.b.a;
import com.douyin.share.a.b.b.d;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;

public class r extends t {
    /* access modifiers changed from: protected */
    public final WXMediaMessage a(a aVar) {
        return super.a(aVar);
    }

    /* access modifiers changed from: protected */
    public final WXMediaMessage a(d dVar) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = dVar.d();
        wXMediaMessage.description = dVar.e();
        wXMediaMessage.thumbData = dVar.f();
        wXMediaMessage.mediaObject = new WXWebpageObject(dVar.b());
        return wXMediaMessage;
    }

    public r(Context context, String str) {
        super(context, str, 0);
    }
}
