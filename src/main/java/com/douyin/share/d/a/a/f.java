package com.douyin.share.d.a.a;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.b.c.a;
import com.douyin.share.a.b.c.c;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMessage;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.api.share.IWeiboShareAPI;
import com.sina.weibo.sdk.api.share.SendMessageToWeiboRequest;
import com.sina.weibo.sdk.api.share.SendMultiMessageToWeiboRequest;
import com.sina.weibo.sdk.api.share.WeiboShareSDK;
import com.sina.weibo.sdk.utils.Utility;

public class f implements a, c {

    /* renamed from: a  reason: collision with root package name */
    private final IWeiboShareAPI f23214a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f23215b;

    @NonNull
    private static WebpageObject a(d dVar) {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = Utility.generateGUID();
        webpageObject.title = dVar.d();
        webpageObject.description = dVar.e();
        webpageObject.thumbData = dVar.f();
        webpageObject.actionUrl = dVar.b();
        webpageObject.defaultText = dVar.e();
        return webpageObject;
    }

    public f(Activity activity, String str) {
        this.f23215b = activity;
        this.f23214a = WeiboShareSDK.createWeiboAPI(activity, str);
        this.f23214a.registerApp();
    }

    public final boolean a(d dVar, Handler handler) {
        if (!this.f23214a.isWeiboAppInstalled()) {
            return false;
        }
        if (this.f23214a.getWeiboAppSupportAPI() >= 10351) {
            WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
            WebpageObject a2 = a(dVar);
            TextObject textObject = new TextObject();
            textObject.text = dVar.e();
            weiboMultiMessage.mediaObject = a2;
            weiboMultiMessage.textObject = textObject;
            if (dVar.f() != null) {
                ImageObject imageObject = new ImageObject();
                if (dVar instanceof g) {
                    g gVar = (g) dVar;
                    imageObject.setImageObject(BitmapFactory.decodeByteArray(gVar.a(), 0, gVar.a().length));
                } else {
                    imageObject.setImageObject(BitmapFactory.decodeByteArray(dVar.f(), 0, dVar.f().length));
                }
                weiboMultiMessage.imageObject = imageObject;
            }
            SendMultiMessageToWeiboRequest sendMultiMessageToWeiboRequest = new SendMultiMessageToWeiboRequest();
            sendMultiMessageToWeiboRequest.transaction = String.valueOf(System.currentTimeMillis());
            sendMultiMessageToWeiboRequest.multiMessage = weiboMultiMessage;
            return this.f23214a.sendRequest(this.f23215b, sendMultiMessageToWeiboRequest);
        }
        WeiboMessage weiboMessage = new WeiboMessage();
        weiboMessage.mediaObject = a(dVar);
        SendMessageToWeiboRequest sendMessageToWeiboRequest = new SendMessageToWeiboRequest();
        sendMessageToWeiboRequest.transaction = String.valueOf(System.currentTimeMillis());
        sendMessageToWeiboRequest.message = weiboMessage;
        return this.f23214a.sendRequest(this.f23215b, sendMessageToWeiboRequest);
    }
}
