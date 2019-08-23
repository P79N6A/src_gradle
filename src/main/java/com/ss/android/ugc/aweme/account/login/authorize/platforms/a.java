package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.call.d;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.feiliao.oauth.sdk.flipchat.open.api.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.f;
import com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity;
import org.jetbrains.annotations.Nullable;

public final class a extends BasePlatformAuthorize {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32141c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f32142d;

    /* renamed from: e  reason: collision with root package name */
    private RocketEntryActivity.a f32143e = new RocketEntryActivity.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32145a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f32145a, false, 20167, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32145a, false, 20167, new Class[0], Void.TYPE);
                return;
            }
            a.this.a();
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f32145a, false, 20165, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f32145a, false, 20165, new Class[]{String.class}, Void.TYPE);
                return;
            }
            a.this.a(new f.a().c(str).d(a.this.c()).a());
        }

        public final void a(int i, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f32145a, false, 20166, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f32145a, false, 20166, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            a.this.a(i, str2);
        }
    };

    public final boolean b(int i, String str) {
        return false;
    }

    @NonNull
    public final String c() {
        return "flipchat";
    }

    @NonNull
    public final String d() {
        return "480";
    }

    @NonNull
    public final String e() {
        return "飞聊";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32141c, false, 20163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32141c, false, 20163, new Class[0], Void.TYPE);
            return;
        }
        FlipChat.INSTANCE.requestAuthBind(this.f32142d, new c<d>() {
            public final void a(int i, @Nullable String str) {
            }

            public final /* bridge */ /* synthetic */ void a(int i, @Nullable String str, Object obj) {
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
            }
        });
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f32141c, false, 20164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32141c, false, 20164, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        RocketEntryActivity.f63669b = null;
    }

    public a(@NonNull Activity activity, @NonNull b bVar, int i) {
        super(activity, bVar, i);
        this.f32142d = activity;
        RocketEntryActivity.f63669b = this.f32143e;
    }
}
