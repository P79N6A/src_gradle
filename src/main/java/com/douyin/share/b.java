package com.douyin.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class b extends a {
    public final String d() {
        return "qq";
    }

    public final boolean b() {
        return new com.douyin.share.c.a().a(this.f23108a);
    }

    public final String c() {
        return this.f23108a.getString(C0906R.string.bu8);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839619);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.bu7);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839309);
    }

    public b(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new com.douyin.share.c.a().a(this.f23108a, shareStruct, "qq");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new com.douyin.share.c.a().a(this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }
}
