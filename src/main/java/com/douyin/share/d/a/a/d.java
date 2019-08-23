package com.douyin.share.d.a.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.douyin.share.a.b.b.c;
import com.douyin.share.a.c.h;
import com.douyin.share.b.a.a;
import com.douyin.share.d.a.a.b;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class d {
    private static h a(String str) {
        if (TextUtils.equals("qq", str)) {
            return b.a.g;
        }
        if (TextUtils.equals("qzone", str)) {
            return b.a.h;
        }
        if (TextUtils.equals("weixin", str)) {
            return b.a.f23201a;
        }
        if (TextUtils.equals("weixin_moments", str)) {
            return b.a.f23202b;
        }
        if (TextUtils.equals("rocket", str)) {
            return b.a.f23204d;
        }
        if (TextUtils.equals("rocket_space", str)) {
            return b.a.f23205e;
        }
        if (TextUtils.equals("toutiao", str)) {
            return b.a.f23203c;
        }
        if (TextUtils.equals("weibo", str)) {
            return b.a.i;
        }
        if (TextUtils.equals("weixin_mini_program", str)) {
            return b.a.f23206f;
        }
        return null;
    }

    public static IShareService.ShareResult a(Activity activity, IShareService.ShareStruct shareStruct, String str) {
        e eVar;
        IShareService.ShareResult shareResult = new IShareService.ShareResult();
        if (shareStruct == null) {
            return shareResult;
        }
        shareResult.type = str;
        shareResult.identifier = shareStruct.identifier;
        h a2 = a(str);
        if (a2 == null) {
            shareResult.success = false;
            return shareResult;
        }
        a aVar = new a();
        if (TextUtils.equals(str, "weixin") && !TextUtils.isEmpty(shareStruct.wxAppId)) {
            aVar.f23166b = shareStruct.wxAppId;
        }
        c cVar = new c(aVar.a(activity));
        Context applicationContext = activity.getApplicationContext();
        if (TextUtils.equals(str, "weixin_mini_program")) {
            com.douyin.share.profile.share.b.a aVar2 = new com.douyin.share.profile.share.b.a(applicationContext, shareStruct);
            aVar2.f23213e = str;
            shareResult.success = cVar.a().a(aVar2);
            return shareResult;
        }
        if (TextUtils.equals(str, "rocket")) {
            eVar = new e(applicationContext, shareStruct);
        } else if (TextUtils.equals(str, "rocket_space")) {
            eVar = new e(applicationContext, shareStruct);
        } else if (TextUtils.equals(str, "toutiao")) {
            shareResult.success = cVar.b().a(new c(applicationContext, activity, shareStruct));
            return shareResult;
        } else if (TextUtils.equals(str, "weibo")) {
            eVar = new i(applicationContext, shareStruct);
        } else {
            eVar = new e(applicationContext, shareStruct);
        }
        eVar.f23213e = str;
        shareResult.success = cVar.a(a2).a(eVar, null);
        return shareResult;
    }
}
