package com.douyin.share.services;

import android.app.Activity;
import android.text.TextUtils;
import com.douyin.baseshare.a;
import com.douyin.share.b;
import com.douyin.share.c;
import com.douyin.share.d;
import com.douyin.share.e;
import com.douyin.share.f;
import com.douyin.share.h;
import com.douyin.share.j;
import com.douyin.share.k;
import com.douyin.share.l;
import com.douyin.share.m;
import com.douyin.share.n;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public class ShareService implements IShareService {
    public a getShareChannel(Activity activity, String str) {
        h.a();
        if (TextUtils.equals(str, "weixin")) {
            return new m(activity);
        }
        if (TextUtils.equals(str, "weixin_moments")) {
            return new l(activity);
        }
        if (TextUtils.equals(str, "toutiao")) {
            return new k(activity);
        }
        if (TextUtils.equals(str, "rocket")) {
            return new d(activity);
        }
        if (TextUtils.equals(str, "rocket_space")) {
            return new e(activity);
        }
        if (TextUtils.equals(str, "qq")) {
            return new b(activity);
        }
        if (TextUtils.equals(str, "qzone")) {
            return new c(activity);
        }
        if (TextUtils.equals(str, "weibo")) {
            return new n(activity);
        }
        if (TextUtils.equals(str, "more")) {
            return new j(activity);
        }
        if (TextUtils.equals(str, "chat_merge")) {
            return new com.douyin.share.a(activity);
        }
        if (TextUtils.equals(str, "save_local")) {
            return new f(activity);
        }
        return null;
    }

    public IShareService.ShareResult share(Activity activity, IShareService.ShareStruct shareStruct, String str) {
        return com.douyin.share.d.a.a.d.a(activity, shareStruct, str);
    }
}
