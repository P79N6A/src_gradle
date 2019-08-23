package com.ss.android.i.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29208a = "c";

    /* renamed from: b  reason: collision with root package name */
    private Context f29209b;

    /* renamed from: c  reason: collision with root package name */
    private String f29210c;

    /* renamed from: d  reason: collision with root package name */
    private String f29211d;

    /* renamed from: e  reason: collision with root package name */
    private String f29212e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29213f;

    private boolean b(String str) {
        boolean z = false;
        if (this.f29209b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String c2 = c(str);
        if (!TextUtils.isEmpty(c2)) {
            try {
                if (this.f29209b.getPackageManager().getPackageInfo(c2, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    private int d(String str) {
        if (this.f29209b == null || TextUtils.isEmpty(str) || !b(str)) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = this.f29209b.getPackageManager().getApplicationInfo(c(str), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getInt("TTPLATFORM_SDK_VERSION", 1);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1772520566) {
            if (hashCode != -1035863501) {
                if (hashCode == 93227207 && str.equals("aweme")) {
                    c2 = 2;
                }
            } else if (str.equals("live_stream")) {
                c2 = 1;
            }
        } else if (str.equals("news_article")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                return "com.ss.android.article.news";
            case 1:
                return "com.ss.android.ugc.live";
            case 2:
                return "com.ss.android.ugc.aweme";
            default:
                return null;
        }
    }

    public final boolean a(String str) {
        if (this.f29213f) {
            throw new IllegalStateException("handleIntent fail, TTApiImpl has been detached");
        } else if (this.f29209b == null || TextUtils.isEmpty(str) || !b(str)) {
            return false;
        } else {
            String c2 = c(str);
            if (TextUtils.isEmpty(c2)) {
                return false;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(c2, c2 + ".ttplatformapi.TtAuthorizeActivity"));
            ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.f29209b.getPackageManager(), 65536);
            int d2 = d(str);
            if (resolveActivityInfo == null || !resolveActivityInfo.exported || d2 <= 0 || d2 <= 1) {
                return false;
            }
            return true;
        }
    }

    c(Context context) {
        if (context != null) {
            this.f29209b = context;
            try {
                ApplicationInfo applicationInfo = this.f29209b.getPackageManager().getApplicationInfo(this.f29209b.getPackageName(), SearchJediMixFeedAdapter.f42517f);
                if (applicationInfo != null) {
                    this.f29210c = applicationInfo.metaData.getString("TTOPEN_SDK_CLIENT_KEY");
                    this.f29211d = applicationInfo.metaData.getString("TTOPEN_SDK_DOUYIN_CLIENT_KEY");
                    this.f29212e = applicationInfo.metaData.getString("TTOPEN_SDK_NEWSARTICLE_CLIENT_KEY");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (TextUtils.isEmpty(this.f29210c) && TextUtils.isEmpty(this.f29211d) && TextUtils.isEmpty(this.f29212e)) {
                throw new IllegalArgumentException(f29208a + " clientKey is null");
            }
            return;
        }
        throw new IllegalArgumentException(f29208a + " context is null");
    }
}
