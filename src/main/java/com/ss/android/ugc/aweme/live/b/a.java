package com.ss.android.ugc.aweme.live.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53333a;

    private static UrlModel a(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, null, f53333a, true, 55952, new Class[]{ImageModel.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{imageModel}, null, f53333a, true, 55952, new Class[]{ImageModel.class}, UrlModel.class);
        } else if (imageModel == null) {
            return null;
        } else {
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(imageModel.getUri());
            urlModel.setUrlList(imageModel.getUrls());
            urlModel.setUrlKey(imageModel.getUri());
            urlModel.setWidth(imageModel.getWidth());
            urlModel.setHeight(imageModel.getHeight());
            return urlModel;
        }
    }

    public static IShareService.ShareStruct a(Context context, b bVar) {
        UrlModel urlModel;
        String str;
        String str2;
        Context context2 = context;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, null, f53333a, true, 55951, new Class[]{Context.class, b.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, bVar2}, null, f53333a, true, 55951, new Class[]{Context.class, b.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = String.valueOf(bVar2.f18669d);
        shareStruct.thumb4Share = a(bVar2.j);
        if (bVar2.m == null) {
            urlModel = a(bVar2.l);
        } else {
            urlModel = a(bVar2.m);
        }
        shareStruct.videoCover = urlModel;
        shareStruct.authorName = bVar2.n;
        shareStruct.authorId = String.valueOf(bVar2.i);
        shareStruct.appName = context2.getString(C0906R.string.ak);
        shareStruct.url = bVar2.o;
        shareStruct.title = bVar2.p;
        shareStruct.description = bVar2.q;
        if (TextUtils.isEmpty(bVar2.r)) {
            str = c.a(a(bVar2.k));
        } else {
            str = bVar2.r;
        }
        shareStruct.thumbUrl = str;
        shareStruct.setThumbPath(null);
        shareStruct.uid4Share = String.valueOf(bVar2.f18670e);
        shareStruct.groupId = bVar2.f18669d;
        shareStruct.itemId = bVar2.f18669d;
        shareStruct.adId = 0;
        shareStruct.shareText = shareStruct.description;
        shareStruct.liveId = String.valueOf(bVar2.f18670e);
        shareStruct.itemType = "live";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_title", bVar2.p);
        hashMap.put("request_id", bVar2.u);
        if (bVar2.t) {
            str2 = "host";
        } else {
            str2 = "aud";
        }
        hashMap.put("user_type", str2);
        hashMap.put("previous_page", "live");
        shareStruct.extraParams = hashMap;
        return shareStruct;
    }
}
