package com.douyin.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class l extends a {
    public final String d() {
        return "weixin_moments";
    }

    public final boolean b() {
        return new f().a(this.f23108a);
    }

    public final String c() {
        return this.f23108a.getString(C0906R.string.dtl);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839616);
    }

    public final String f() {
        return this.f23108a.getString(C0906R.string.dtk);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839315);
    }

    public l(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new f().a(this.f23108a, shareStruct, "weixin_moments");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new f().a(this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }
}
