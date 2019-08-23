package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.sina.weibo.sdk.exception.WeiboException;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.f;
import java.lang.ref.WeakReference;

public final class j extends BasePlatformAuthorize implements WeiboAuthListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32176c;

    /* renamed from: d  reason: collision with root package name */
    private final SsoHandler f32177d;

    /* renamed from: e  reason: collision with root package name */
    private WeiboAuthListener f32178e = new a(this);

    static final class a implements WeiboAuthListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32179a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<WeiboAuthListener> f32180b;

        public final void onCancel() {
            if (PatchProxy.isSupport(new Object[0], this, f32179a, false, 20201, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32179a, false, 20201, new Class[0], Void.TYPE);
                return;
            }
            if (this.f32180b.get() != null) {
                ((WeiboAuthListener) this.f32180b.get()).onCancel();
            }
        }

        a(@NonNull WeiboAuthListener weiboAuthListener) {
            this.f32180b = new WeakReference<>(weiboAuthListener);
        }

        public final void onComplete(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f32179a, false, 20199, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f32179a, false, 20199, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            if (this.f32180b.get() != null) {
                ((WeiboAuthListener) this.f32180b.get()).onComplete(bundle);
            }
        }

        public final void onWeiboException(WeiboException weiboException) {
            if (PatchProxy.isSupport(new Object[]{weiboException}, this, f32179a, false, 20200, new Class[]{WeiboException.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{weiboException}, this, f32179a, false, 20200, new Class[]{WeiboException.class}, Void.TYPE);
                return;
            }
            if (this.f32180b.get() != null) {
                ((WeiboAuthListener) this.f32180b.get()).onWeiboException(weiboException);
            }
        }
    }

    @NonNull
    public final String c() {
        return "sina_weibo";
    }

    @NonNull
    public final String d() {
        return "";
    }

    @NonNull
    public final String e() {
        return "微博";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32176c, false, 20193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32176c, false, 20193, new Class[0], Void.TYPE);
            return;
        }
        this.f32177d.authorizeClientSso(this.f32178e);
    }

    public final void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f32176c, false, 20198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32176c, false, 20198, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void onWeiboException(WeiboException weiboException) {
        if (PatchProxy.isSupport(new Object[]{weiboException}, this, f32176c, false, 20197, new Class[]{WeiboException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{weiboException}, this, f32176c, false, 20197, new Class[]{WeiboException.class}, Void.TYPE);
            return;
        }
        a(-100000, weiboException.getMessage());
    }

    public final void onComplete(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32176c, false, 20196, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32176c, false, 20196, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(bundle);
            if (parseAccessToken == null) {
                a(-100000, "&accessToken==null");
            } else {
                a(new f.a().a(parseAccessToken.getToken()).a(parseAccessToken.getExpiresTime() / 1000).b(parseAccessToken.getUid()).d("sina_weibo").a());
            }
        } else {
            a(-100000, " bundle==null");
        }
    }

    public final boolean b(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f32176c, false, 20195, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f32176c, false, 20195, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str2.contains("not install weibo client")) {
            if (this.f32138b != 3) {
                return true;
            }
        }
        return false;
    }

    public j(@NonNull Activity activity, @NonNull b bVar, @BasePlatformAuthorize.AuthorizeType int i) {
        super(activity, bVar, i);
        this.f32177d = new SsoHandler(activity, new AuthInfo(activity, "1462309810", "http://api.snssdk.com/auth/login_success/", "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write"));
    }

    public final void a(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32176c, false, 20194, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32176c, false, 20194, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.a(i, i2, intent);
        if (i3 == 32973 && this.f32177d != null) {
            this.f32177d.authorizeCallBack(i, i2, intent2);
        }
    }
}
