package com.douyin.share.a.c;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.douyin.share.a.b.b.a;
import com.douyin.share.a.b.b.d;
import com.douyin.share.h;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;

public class p extends t {
    public final WXMediaMessage a(a aVar) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = aVar.d();
        wXMediaMessage.description = aVar.e();
        wXMediaMessage.thumbData = aVar.f();
        if (TextUtils.isEmpty(aVar.a()) || BitmapUtils.getBitmapFromSD(aVar.a()) == null) {
            return null;
        }
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.imagePath = aVar.a();
        wXMediaMessage.mediaObject = wXImageObject;
        return wXMediaMessage;
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

    public p(Context context, String str) {
        super(context, str, 1);
    }

    public final boolean a(d dVar, Handler handler) {
        if (h.a().f23231a) {
            return n.a(this.f23161a, dVar);
        }
        return super.a(dVar, handler);
    }
}
