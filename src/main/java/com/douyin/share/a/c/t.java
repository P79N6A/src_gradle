package com.douyin.share.a.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.StringUtils;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.b.c.a;
import com.douyin.share.a.b.c.c;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.ByteArrayOutputStream;

public abstract class t implements a, c {

    /* renamed from: a  reason: collision with root package name */
    protected Context f23161a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23162b;

    /* renamed from: c  reason: collision with root package name */
    private final IWXAPI f23163c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23164d;

    /* access modifiers changed from: protected */
    public abstract WXMediaMessage a(d dVar);

    public final boolean a() {
        return this.f23163c.isWXAppInstalled();
    }

    /* access modifiers changed from: protected */
    public final void a(WXMediaMessage wXMediaMessage) {
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.scene = this.f23164d;
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        this.f23163c.sendReq(req);
    }

    public final boolean b(com.douyin.share.a.b.b.a aVar) {
        if (!a()) {
            return false;
        }
        WXMediaMessage a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        a(a2);
        return true;
    }

    /* access modifiers changed from: protected */
    public WXMediaMessage a(com.douyin.share.a.b.b.a aVar) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = aVar.d();
        wXMediaMessage.description = aVar.e();
        wXMediaMessage.thumbData = aVar.f();
        if (TextUtils.isEmpty(aVar.a())) {
            return null;
        }
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(aVar.a());
        if (bitmapFromSD == null) {
            return null;
        }
        if (((long) bitmapFromSD.getByteCount()) < 10485760) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapFromSD.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused) {
            }
            wXMediaMessage.mediaObject = new WXImageObject(byteArray);
            bitmapFromSD.recycle();
        } else {
            WXImageObject wXImageObject = new WXImageObject();
            wXImageObject.imagePath = aVar.a();
            wXMediaMessage.mediaObject = wXImageObject;
        }
        return wXMediaMessage;
    }

    public boolean a(d dVar, Handler handler) {
        if (!a()) {
            return false;
        }
        WXMediaMessage a2 = a(dVar);
        if (a2 == null) {
            return false;
        }
        a(a2);
        return true;
    }

    public t(Context context, String str, int i) {
        if (context == null) {
            throw new IllegalArgumentException("appContext is null");
        } else if (!StringUtils.isEmpty(str)) {
            this.f23161a = context;
            this.f23162b = str;
            this.f23163c = WXAPIFactory.createWXAPI(context, this.f23162b, true);
            this.f23163c.registerApp(str);
            this.f23164d = i;
        } else {
            throw new IllegalArgumentException("wxappId is empty");
        }
    }
}
