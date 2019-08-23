package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.mapbox.android.telemetry.bm;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

public final class bl {

    /* renamed from: a  reason: collision with root package name */
    final String f26073a;

    /* renamed from: b  reason: collision with root package name */
    final ag f26074b;

    /* renamed from: c  reason: collision with root package name */
    public final e f26075c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26076d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<o, bk> f26077e = new HashMap<o, bk>() {
        {
            put(o.CHINA, new bk() {
                public final bj a(bd bdVar) {
                    return bl.this.a(o.CHINA, bl.this.f26075c);
                }
            });
            put(o.STAGING, new bk() {
                public final bj a(bd bdVar) {
                    bl blVar = bl.this;
                    e eVar = bl.this.f26075c;
                    o oVar = bdVar.f26056a;
                    String str = bdVar.f26057b;
                    String str2 = bdVar.f26058c;
                    bm.a a2 = new bm.a().a(oVar);
                    HttpUrl a3 = bm.a(str);
                    if (a3 != null) {
                        a2.f26089c = a3;
                    }
                    bj bjVar = new bj(str2, blVar.f26073a, a2.a(), blVar.f26074b, eVar);
                    return bjVar;
                }
            });
            put(o.COM, new bk() {
                public final bj a(bd bdVar) {
                    return bl.this.a(o.COM, bl.this.f26075c);
                }
            });
        }
    };

    /* access modifiers changed from: package-private */
    public final bj a(Context context) {
        new p();
        q a2 = p.a();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                bd a3 = a2.a(applicationInfo.metaData);
                return this.f26077e.get(a3.f26056a).a(a3);
            }
        } catch (Exception e2) {
            String.format("Failed when retrieving app meta-data: %s", new Object[]{e2.getMessage()});
        }
        return a(o.COM, this.f26075c);
    }

    public final bj a(o oVar, e eVar) {
        bj bjVar = new bj(this.f26076d, this.f26073a, new bm.a().a(oVar).a(), this.f26074b, eVar);
        return bjVar;
    }

    bl(String str, String str2, ag agVar, e eVar) {
        this.f26076d = str;
        this.f26073a = str2;
        this.f26074b = agVar;
        this.f26075c = eVar;
    }
}
