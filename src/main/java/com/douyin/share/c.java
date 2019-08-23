package com.douyin.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.douyin.baseshare.a;
import com.douyin.share.c.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.io.File;

public final class c extends a {
    public final String d() {
        return "qzone";
    }

    public final boolean b() {
        return new b().a(this.f23108a);
    }

    public final String c() {
        return this.f23108a.getString(C0906R.string.bu8);
    }

    public final Drawable e() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839612);
    }

    public final String f() {
        return this.f23108a.getResources().getString(C0906R.string.buy);
    }

    public final Drawable g() {
        return com.ss.android.ugc.bytex.a.a.a.a(this.f23108a.getResources(), 2130839310);
    }

    public c(Activity activity) {
        super(activity);
    }

    public final IShareService.ShareResult a(IShareService.ShareStruct shareStruct) {
        return new b().a(this.f23108a, shareStruct, "qzone");
    }

    public final void b(IShareService.ShareStruct shareStruct) {
        b bVar = new b();
        Activity activity = this.f23108a;
        Uri parse = Uri.parse(shareStruct.thumbUrl);
        String str = shareStruct.shareText;
        String str2 = shareStruct.url;
        com.douyin.share.profile.share.a.c cVar = new com.douyin.share.profile.share.a.c(activity, new File(activity.getExternalCacheDir(), "tmpimages").getPath(), com.douyin.share.a.c.b.a());
        b.AnonymousClass1 r0 = new com.douyin.share.a.b.b.a(str2, activity, str, parse) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f23183a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f23184b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f23185c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Uri f23186d;

            public final long j() {
                return 0;
            }

            public final long k() {
                return 0;
            }

            public final long l() {
                return 0;
            }

            public final String b() {
                return this.f23183a;
            }

            public final String d() {
                return this.f23185c;
            }

            public final String e() {
                return this.f23185c;
            }

            public final String i() {
                return this.f23185c;
            }

            public final String a() {
                return h();
            }

            public final String g() {
                return this.f23186d.getPath();
            }

            public final String h() {
                return this.f23186d.getPath();
            }

            public final String c() {
                return this.f23184b.getString(C0906R.string.ak);
            }

            public final byte[] f() {
                return com.douyin.share.profile.share.a.a(BitmapFactory.decodeFile(this.f23186d.getPath()));
            }

            {
                this.f23183a = r2;
                this.f23184b = r3;
                this.f23185c = r4;
                this.f23186d = r5;
            }
        };
        cVar.a(r0);
    }
}
