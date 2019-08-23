package com.douyin.share.profile.share.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.douyin.share.a.b.b.a;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.c.t;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

public final class e extends t {
    public final WXMediaMessage a(d dVar) {
        return null;
    }

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

    public e(Context context, String str) {
        super(context, str, 0);
    }
}
