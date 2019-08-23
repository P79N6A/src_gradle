package com.douyin.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.g;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class m extends a {
    public final String d() {
        return "weixin";
    }

    public final boolean b() {
        return new g().a(this.f23108a);
    }

    public final String c() {
        return this.f23108a.getString(C0906R.string.dtl);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839635);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.dti);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839314);
    }

    public m(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new g().a(this.f23108a, shareStruct, "weixin");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new g().a(this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }
}
