package com.ss.android.ugc.playerkit.videoview.c;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.videoview.b.b;
import com.ss.android.ugc.playerkit.videoview.b.c;
import com.ss.android.ugc.playerkit.videoview.b.e;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f77758c = new a();

    /* renamed from: a  reason: collision with root package name */
    public c f77759a;

    /* renamed from: b  reason: collision with root package name */
    public b f77760b;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.playerkit.videoview.b.a f77761d = new e();

    public static a a() {
        return f77758c;
    }

    private a() {
    }

    public final com.ss.android.ugc.aweme.player.sdk.api.c a(String str) {
        com.ss.android.ugc.playerkit.videoview.b.a aVar = this.f77761d;
        c(str);
        return aVar.a();
    }

    public final com.ss.android.ugc.playerkit.videoview.d.c b(String str) {
        return this.f77759a.a(c(str));
    }

    public com.ss.android.ugc.playerkit.session.b c(String str) {
        com.ss.android.ugc.playerkit.session.b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session b2 = com.ss.android.ugc.playerkit.session.a.a().b(str);
        if (b2 != null) {
            if (b2.state == null) {
                synchronized (this) {
                    if (b2.state == null) {
                        com.ss.android.ugc.playerkit.session.b bVar2 = new com.ss.android.ugc.playerkit.session.b();
                        b2.state = bVar2;
                        bVar = bVar2;
                    }
                }
            } else {
                bVar = b2.state;
            }
        }
        return bVar;
    }

    public final void a(String str, int i, int i2) {
        com.ss.android.ugc.playerkit.session.b c2 = c(str);
        if (c2 != null) {
            c2.f77732b = i;
            c2.f77733c = i2;
        }
    }
}
