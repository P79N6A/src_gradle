package com.douyin.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.h;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class n extends a {
    public final String d() {
        return "weibo";
    }

    public final boolean b() {
        return new h().a(this.f23108a);
    }

    public final String c() {
        return this.f23108a.getString(C0906R.string.dt_);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839628);
    }

    public final String f() {
        return this.f23108a.getString(C0906R.string.dt7);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839312);
    }

    public n(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new h().a(this.f23108a, shareStruct, "weibo");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new h().a(this.f23108a, Uri.parse(shareStruct.thumbUrl), shareStruct.shareText, shareStruct.url);
    }
}
