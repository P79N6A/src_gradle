package com.ss.android.ugc.aweme.qrcode.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63398a;

    /* renamed from: b  reason: collision with root package name */
    a f63399b;

    /* renamed from: c  reason: collision with root package name */
    k f63400c;

    public interface a {
        void d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63398a, false, 70440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63398a, false, 70440, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63399b != null) {
            this.f63399b.d();
        }
    }

    public d(a aVar) {
        this.f63399b = aVar;
    }

    public final void a(Context context, String str, boolean z, int i) {
        boolean z2;
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, (byte) 1, Integer.valueOf(i)}, this, f63398a, false, 70441, new Class[]{Context.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 1, Integer.valueOf(i)}, this, f63398a, false, 70441, new Class[]{Context.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            if (com.ss.android.ugc.aweme.g.a.a()) {
                if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, null, g.f39783a, true, 32371, new Class[]{Context.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, null, g.f39783a, true, 32371, new Class[]{Context.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (com.ss.android.ugc.aweme.g.a.a() && i == 1 && !TextUtils.isEmpty(str)) {
                    Aweme aweme = new Aweme();
                    aweme.setAid("333333");
                    User user = new User();
                    user.setUid("555555");
                    aweme.setAuthor(user);
                    aweme.setAd(true);
                    AwemeRawAd awemeRawAd = new AwemeRawAd();
                    awemeRawAd.setAdId(111111L);
                    awemeRawAd.setCreativeId(222222L);
                    awemeRawAd.setGroupId(333333L);
                    awemeRawAd.setWebUrl(str2);
                    awemeRawAd.setWebTitle("广告落地页预览");
                    awemeRawAd.setLogExtra("{\"ad_price\":\"W4TIUQABX3hbhMhRAAFfePDQH8YqAQbTcEzyvg\",\"convert_id\":0,\"orit\":40001,\"req_id\":\"20180828115808010015077103721B7D\",\"rit\":40001}");
                    aweme.setAwemeRawAd(awemeRawAd);
                    g.c(context2, aweme);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            bundle.putBoolean("show_not_official_content_warning", false);
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("bundle_user_webview_title", true);
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "qr_code");
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            context2.startActivity(intent);
        }
    }
}
