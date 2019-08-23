package com.douyin.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.douyin.baseshare.a;
import com.douyin.share.c.c;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.Map;

public final class d extends a {
    public final String d() {
        return "rocket";
    }

    public final boolean b() {
        return new c().a(this.f23108a);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839626);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.c0g);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839311);
    }

    public final String c() {
        String string = this.f23108a.getString(C0906R.string.c0p);
        a("rocket_not_installed", null);
        IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(this.f23108a, "rs9760739781918870", true);
        if (!createRocketAPI.isRocketInstalled()) {
            return this.f23108a.getString(C0906R.string.c0i);
        }
        if (!createRocketAPI.isRocketSupportAPI()) {
            return this.f23108a.getString(C0906R.string.c0h);
        }
        return string;
    }

    public d(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        a("flipchat_share_invoke_flipchat", null);
        return new c().a(this.f23108a, shareStruct, "rocket");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        new c().a((Context) this.f23108a, Uri.parse(shareStruct.thumbUrl));
    }

    private static void a(final String str, @Nullable Map<String, String> map) {
        com.ss.android.b.a.a.a.a(new Runnable(null) {
            public final void run() {
                try {
                    q.a(str, null);
                } catch (Exception unused) {
                }
            }
        });
    }
}
