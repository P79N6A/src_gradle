package com.douyin.share.b.a;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import com.douyin.share.a.b.c.a;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.WeiboMessage;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.api.share.BaseResponse;
import com.sina.weibo.sdk.api.share.IWeiboHandler;
import com.sina.weibo.sdk.api.share.IWeiboShareAPI;
import com.sina.weibo.sdk.api.share.SendMessageToWeiboRequest;
import com.sina.weibo.sdk.api.share.SendMultiMessageToWeiboRequest;
import com.sina.weibo.sdk.api.share.WeiboShareSDK;

public final class d implements a, IWeiboHandler.Response {

    /* renamed from: a  reason: collision with root package name */
    public final IWeiboShareAPI f23178a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f23179b;

    public final void onResponse(BaseResponse baseResponse) {
    }

    @NonNull
    private static ImageObject b(com.douyin.share.a.b.b.a aVar) {
        ImageObject imageObject = new ImageObject();
        byte[] f2 = aVar.f();
        imageObject.setImageObject(BitmapFactory.decodeByteArray(f2, 0, f2.length));
        return imageObject;
    }

    public final boolean a(com.douyin.share.a.b.b.a aVar) {
        if (this.f23178a.getWeiboAppSupportAPI() >= 10351) {
            WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
            if (aVar.f() != null) {
                ImageObject b2 = b(aVar);
                weiboMultiMessage.imageObject = b2;
                weiboMultiMessage.mediaObject = b2;
            }
            SendMultiMessageToWeiboRequest sendMultiMessageToWeiboRequest = new SendMultiMessageToWeiboRequest();
            sendMultiMessageToWeiboRequest.transaction = String.valueOf(System.currentTimeMillis());
            sendMultiMessageToWeiboRequest.multiMessage = weiboMultiMessage;
            return this.f23178a.sendRequest(this.f23179b, sendMultiMessageToWeiboRequest);
        }
        WeiboMessage weiboMessage = new WeiboMessage();
        if (aVar.f() != null) {
            weiboMessage.mediaObject = b(aVar);
        }
        SendMessageToWeiboRequest sendMessageToWeiboRequest = new SendMessageToWeiboRequest();
        sendMessageToWeiboRequest.transaction = String.valueOf(System.currentTimeMillis());
        sendMessageToWeiboRequest.message = weiboMessage;
        return this.f23178a.sendRequest(this.f23179b, sendMessageToWeiboRequest);
    }

    public d(Activity activity, String str) {
        this.f23179b = activity;
        this.f23178a = WeiboShareSDK.createWeiboAPI(activity, str);
        this.f23178a.registerApp();
    }
}
