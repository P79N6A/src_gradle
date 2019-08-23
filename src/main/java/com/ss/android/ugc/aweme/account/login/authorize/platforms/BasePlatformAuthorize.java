package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity;
import com.ss.android.ugc.aweme.account.login.authorize.a.d;
import com.ss.android.ugc.aweme.main.h.b;
import com.ss.android.ugc.aweme.w;

public abstract class BasePlatformAuthorize {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32137a;
    @AuthorizeType

    /* renamed from: b  reason: collision with root package name */
    public final int f32138b;

    /* renamed from: c  reason: collision with root package name */
    private final b f32139c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f32140d;

    public @interface AuthorizeType {
    }

    public void a(int i, int i2, Intent intent) {
    }

    public abstract void b();

    public abstract boolean b(int i, String str);

    @NonNull
    public abstract String c();

    @NonNull
    public abstract String d();

    @NonNull
    public abstract String e();

    public void f() {
    }

    public void g() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32137a, false, 20162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32137a, false, 20162, new Class[0], Void.TYPE);
            return;
        }
        this.f32139c.d();
    }

    public final void a(@NonNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f32137a, false, 20160, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f32137a, false, 20160, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.f32139c.a(fVar2);
    }

    public final void a(int i, String str) {
        boolean z;
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3}, this, f32137a, false, 20161, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3}, this, f32137a, false, 20161, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (b(i, str)) {
            Activity activity = this.f32140d;
            String c2 = c();
            if (this.f32138b == 3) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{activity, c2, Byte.valueOf(z ? (byte) 1 : 0)}, null, d.f32126a, true, 20206, new Class[]{Activity.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, c2, Byte.valueOf(z)}, null, d.f32126a, true, 20206, new Class[]{Activity.class, String.class, Boolean.TYPE}, Void.TYPE);
            } else if (activity != null && !TextUtils.isEmpty(c2)) {
                if (PatchProxy.isSupport(new Object[]{c2}, null, d.f32126a, true, 20207, new Class[]{String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{c2}, null, d.f32126a, true, 20207, new Class[]{String.class}, String.class);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://aweme.snssdk.com");
                    sb.append("/2/auth/login/v2/?platform=");
                    sb.append(Uri.encode(c2));
                    ((b) w.a(b.class)).a(sb);
                    str2 = sb.toString();
                }
                Intent intent = new Intent(activity, WapAuthActivity.class);
                intent.setData(Uri.parse(str2));
                intent.putExtra("KEY_EXTRA_IS_AUTH_ONLY", z);
                activity.startActivityForResult(intent, 32972);
            }
        } else {
            this.f32139c.a(i, str3);
        }
    }

    BasePlatformAuthorize(@NonNull Activity activity, @NonNull b bVar, @AuthorizeType int i) {
        this.f32140d = activity;
        this.f32139c = bVar;
        this.f32138b = i;
    }
}
