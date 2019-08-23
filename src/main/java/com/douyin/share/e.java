package com.douyin.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.d;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class e extends a {
    public final String d() {
        return "rocket_space";
    }

    public final boolean b() {
        return new d().a(this.f23108a);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839626);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.c0o);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839311);
    }

    public final String c() {
        String string = this.f23108a.getString(C0906R.string.c0p);
        com.ss.android.b.a.a.a.a(new Runnable("rocket_not_installed", null) {
            public final void run() {
                try {
                    q.a("rocket_not_installed", null);
                } catch (Exception unused) {
                }
            }
        });
        IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(this.f23108a, "rs9760739781918870", true);
        if (!createRocketAPI.isRocketInstalled()) {
            return this.f23108a.getString(C0906R.string.c0i);
        }
        if (!createRocketAPI.isRocketSupportAPI()) {
            return this.f23108a.getString(C0906R.string.c0h);
        }
        return string;
    }

    public e(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new d().a(this.f23108a, shareStruct, "rocket_space");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new d().a((Context) this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }
}
