package com.douyin.share.c;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.douyin.share.a.a;
import com.douyin.share.a.c.p;
import com.ss.android.ugc.aweme.C0906R;

public final class f extends a {
    public final String a() {
        return null;
    }

    public final boolean a(Context context) {
        return new p(context.getApplicationContext(), "wx76fdd06dde311af3").a();
    }

    public final void a(final Context context, final Uri uri) {
        new p(context.getApplicationContext(), "wx76fdd06dde311af3").b(new com.douyin.share.a.b.b.a() {
            public final String b() {
                return null;
            }

            public final String d() {
                return "";
            }

            public final String e() {
                return null;
            }

            public final String i() {
                return null;
            }

            public final long j() {
                return 0;
            }

            public final long k() {
                return 0;
            }

            public final long l() {
                return 0;
            }

            public final String a() {
                return h();
            }

            public final String g() {
                return uri.getPath();
            }

            public final String h() {
                return uri.getPath();
            }

            public final String c() {
                return context.getString(C0906R.string.ak);
            }

            public final byte[] f() {
                return com.douyin.share.profile.share.a.a(BitmapFactory.decodeFile(uri.getPath()));
            }
        });
    }
}
