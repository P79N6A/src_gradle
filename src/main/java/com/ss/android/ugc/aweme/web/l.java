package com.ss.android.ugc.aweme.web;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.g.a;
import com.ss.android.sdk.c.g;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76861a;

    /* renamed from: b  reason: collision with root package name */
    private static l f76862b = new l();

    /* renamed from: c  reason: collision with root package name */
    private String f76863c;

    private l() {
    }

    public static l c() {
        return f76862b;
    }

    private String i() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89906, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89906, new Class[0], String.class);
        } else if (a.c()) {
            return "f9e6186803d872f739d3d1707d9a652e";
        } else {
            if (a.b()) {
                return "365b20e8f6c343df1eff65214a0e3e74";
            }
            return "2373bbcf94c1b893dad48961d0a2d086";
        }
    }

    private String j() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89907, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89907, new Class[0], String.class);
        } else if (a.c()) {
            return "4776c874d6caa9b5e7c3ed2234893fd9";
        } else {
            if (a.b()) {
                return "95bcaef5f85b57bef49180849da0ab20";
            }
            return "2d15e0aa4fe4a5c91eb47210a6ddf467";
        }
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89898, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89898, new Class[0], String.class);
        }
        File file = new File(d(), f());
        b.a(file);
        return file.getPath();
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89900, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89900, new Class[0], String.class);
        }
        File file = new File(GlobalContext.getContext().getFilesDir(), "offline");
        b.a(file);
        return file.getPath();
    }

    public final String e() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89902, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89902, new Class[0], String.class);
        } else if (a.c()) {
            return "gecko-sg.tiktokv.com";
        } else {
            if (a.b()) {
                return "gecko-va.musical.ly";
            }
            return "gecko.snssdk.com";
        }
    }

    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89905, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89905, new Class[0], String.class);
        } else if (h()) {
            return "ab3036fdba402306795f6bf85fdbf776";
        } else {
            return "a738646d5d1ed9ab8340e93ac28e131e";
        }
    }

    private static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f76861a, true, 89903, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76861a, true, 89903, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean z = com.ss.android.ugc.aweme.framework.core.a.b().f3306d;
        boolean equals = TextUtils.equals(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "local_test");
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getGeckoLocalTestUseOnline().c()).booleanValue();
        if (z || (equals && !booleanValue)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89904, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89904, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.f76863c)) {
            if (h()) {
                str = c().j();
            } else {
                str = c().i();
            }
            this.f76863c = str;
        }
        return this.f76863c;
    }

    public final List<Pattern> b() {
        if (PatchProxy.isSupport(new Object[0], this, f76861a, false, 89901, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f76861a, false, 89901, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        List<String> b2 = com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "aweme_gecko_offline_host_prefix", String.class);
        if (!CollectionUtils.isEmpty(b2)) {
            for (String compile : b2) {
                arrayList.add(Pattern.compile(compile));
            }
            return arrayList;
        }
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("aweme.snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("ic.snssdk.com/game_channel"));
        arrayList.add(Pattern.compile("s3.pstatp.com/bytecom/game_channel_fe/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s16.tiktokcdn.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("s0.ipstatp.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("www.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("m.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("snssdk.com/feoffline/"));
        arrayList.add(Pattern.compile("pstatp.com/toutiao/feoffline/"));
        arrayList.add(Pattern.compile("test-aweme.snssdk.com/falcon/fe_activity/"));
        return arrayList;
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76861a, false, 89899, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f76861a, false, 89899, new Class[]{String.class}, String.class);
        }
        File file = new File(d(), str2);
        b.a(file);
        return file.getPath();
    }
}
