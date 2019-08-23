package com.douyin.share.c;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.douyin.share.a.a;
import com.douyin.share.profile.share.a.e;
import com.ss.android.ugc.aweme.C0906R;

public final class g extends a {
    public final String a() {
        return "com.tencent.mm";
    }

    @NonNull
    private static e b(Context context) {
        return new e(context.getApplicationContext(), "wx76fdd06dde311af3");
    }

    public final boolean a(Context context) {
        return b(context).a();
    }

    public final void a(final Context context, final Uri uri) {
        b(context).b(new com.douyin.share.a.b.b.a() {
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
