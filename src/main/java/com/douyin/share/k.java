package com.douyin.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class k extends a {
    public final String d() {
        return "toutiao";
    }

    public final boolean b() {
        return new e().a(this.f23108a);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839631);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.co8);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839313);
    }

    public final String c() {
        String string = this.f23108a.getString(C0906R.string.cod);
        com.ss.android.b.a.a.a.a(new Runnable("toutiao_not_installed", null) {
            public final void run() {
                try {
                    q.a("toutiao_not_installed", null);
                } catch (Exception unused) {
                }
            }
        });
        if (!com.bytedance.wttsharesdk.a.a(com.ss.android.ugc.aweme.framework.e.a.a().getApplicationContext())) {
            return this.f23108a.getString(C0906R.string.coa);
        }
        if (!com.bytedance.wttsharesdk.a.c(com.ss.android.ugc.aweme.framework.e.a.a().getApplicationContext())) {
            return this.f23108a.getString(C0906R.string.co_);
        }
        return string;
    }

    public k(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new e().a(this.f23108a, shareStruct, "toutiao");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new e().a(this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }
}
