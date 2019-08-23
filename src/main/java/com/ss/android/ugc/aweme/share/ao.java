package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;
import java.util.concurrent.Callable;

public final class ao extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64654a;

    /* renamed from: b  reason: collision with root package name */
    String f64655b;

    /* renamed from: c  reason: collision with root package name */
    boolean f64656c;
    private String n;
    private String o;
    private CommerceUser p;
    private TextView q;
    private e r;
    private at s;

    interface a {
        void a(File file);
    }

    public final IShareService.ShareStruct a(File file) {
        return null;
    }

    public final int b() {
        return C0906R.layout.j6;
    }

    public final int g() {
        return 7;
    }

    public final String f() {
        return this.o;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64654a, false, 73056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64654a, false, 73056, new Class[0], Void.TYPE);
            return;
        }
        this.r.b(21, this.f64655b);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64654a, false, 73057, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64654a, false, 73057, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.o)) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64654a, false, 73059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64654a, false, 73059, new Class[0], Void.TYPE);
            return;
        }
        this.r = new e(new b(), this);
        this.s = new at(this.f3881f, this.p);
        this.q = (TextView) findViewById(C0906R.id.df7);
        this.f3880e = (ImageView) findViewById(C0906R.id.asf);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f64654a, false, 73060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64654a, false, 73060, new Class[0], Void.TYPE);
            return;
        }
        this.q.setText(this.p.getNickname());
        at atVar = this.s;
        if (PatchProxy.isSupport(new Object[0], atVar, at.f64676a, false, 73074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], atVar, at.f64676a, false, 73074, new Class[0], Void.TYPE);
            return;
        }
        atVar.f64677b.setText(atVar.f64679d.getNickname());
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f64654a, false, 73058, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f64654a, false, 73058, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
        this.s.a(bitmap2);
        i();
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64654a, false, 73062, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64654a, false, 73062, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (this.j && !this.f64656c && isShowing()) {
            this.f64656c = true;
            a(aVar, (a) new aq(this, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(final com.douyin.baseshare.a aVar, final File file) {
        this.f64656c = false;
        if (file != null && file.exists()) {
            if (f.c(this.f3881f) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f3881f, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64657a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64657a, false, 73069, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64657a, false, 73069, new Class[0], Void.TYPE);
                            return;
                        }
                        ao.this.a(aVar, file);
                        ao.this.dismiss();
                    }
                });
                return;
            }
            a(aVar, file);
            dismiss();
        }
    }

    private void a(com.douyin.baseshare.a aVar, a aVar2) {
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f64654a, false, 73063, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f64654a, false, 73063, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE);
            return;
        }
        Bitmap a2 = this.s.a();
        if (a2 == null) {
            this.f64656c = false;
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
            ExceptionMonitor.ensureNotReachHere("build bitmap is null");
            aVar2.a(null);
            return;
        }
        i.a((Callable<TResult>) new ar<TResult>(this, aVar, a2)).a((g<TResult, TContinuationResult>) new as<TResult,TContinuationResult>(aVar2), i.f1052b);
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f64654a, false, 73061, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f64654a, false, 73061, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (!c()) {
            String d2 = aVar.d();
            if (TextUtils.equals("save_local", d2)) {
                d2 = "normal";
            }
            com.ss.android.ugc.aweme.commerce.service.logs.ao aoVar = new com.ss.android.ugc.aweme.commerce.service.logs.ao();
            aoVar.f38082f = this.n;
            aoVar.g = d2;
            aoVar.b();
            if (!aVar.a()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
            } else if (f.c(this.f3881f) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f3881f, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64661a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64661a, false, 73070, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64661a, false, 73070, new Class[0], Void.TYPE);
                            return;
                        }
                        ao.this.a(aVar);
                    }
                });
            } else {
                a(aVar);
            }
        } else if (!this.f64656c && isShowing()) {
            this.f64656c = true;
            a(aVar, (a) new ap(this, aVar));
        }
    }

    public ao(@NonNull Activity activity, String str, CommerceUser commerceUser) {
        super(activity);
        this.n = commerceUser.getUid();
        this.o = str;
        this.p = commerceUser;
        this.f64655b = commerceUser.getUid();
    }
}
