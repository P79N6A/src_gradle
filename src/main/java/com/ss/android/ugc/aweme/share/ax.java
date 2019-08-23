package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.share.command.d;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import com.tt.option.share.OnShareEventListener;
import java.io.File;
import java.util.concurrent.Callable;

public final class ax extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64683a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f64684b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64685c;
    private d n;
    private int o = -1;
    private String p;
    private e q;
    private TextView r;
    private TextView s;
    private bc t;

    interface a {
        void a(File file);
    }

    public final int b() {
        return C0906R.layout.k4;
    }

    public final String f() {
        return this.p;
    }

    public final int g() {
        return this.o;
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64683a, false, 73083, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64683a, false, 73083, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
            return;
        }
        a(aVar, (a) new ay(this, aVar));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64683a, false, 73079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64683a, false, 73079, new Class[0], Void.TYPE);
            return;
        }
        this.q.b(this.n.f45940a, this.n.f45945f);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64683a, false, 73080, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64683a, false, 73080, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.p)) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64683a, false, 73086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64683a, false, 73086, new Class[0], Void.TYPE);
            return;
        }
        this.r = (TextView) findViewById(C0906R.id.d9b);
        this.s = (TextView) findViewById(C0906R.id.diw);
        this.f3880e = (ImageView) findViewById(C0906R.id.ate);
        this.t = new bc(this.f64684b);
        this.q = new e(new b(), this);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f64683a, false, 73089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64683a, false, 73089, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        if (TextUtils.equals(this.p, "fancyCodeShare")) {
            this.i.setText(this.f64684b.getString(C0906R.string.c1m));
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f64683a, false, 73087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64683a, false, 73087, new Class[0], Void.TYPE);
            return;
        }
        this.r.setText(this.n.f45943d);
        this.s.setText(this.n.f45942c);
        bc bcVar = this.t;
        d dVar = this.n;
        if (PatchProxy.isSupport(new Object[]{dVar}, bcVar, bc.f64744a, false, 73097, new Class[]{d.class}, Void.TYPE)) {
            bc bcVar2 = bcVar;
            PatchProxy.accessDispatch(new Object[]{dVar}, bcVar2, bc.f64744a, false, 73097, new Class[]{d.class}, Void.TYPE);
            return;
        }
        bcVar.g = dVar;
        bcVar.f64748e.setText(dVar.f45943d);
        bcVar.f64747d.setText(dVar.f45942c);
        bcVar.f64746c.setVisibility(8);
        bcVar.f64749f.setImageLoadFinishListener(new bd(bcVar));
        bcVar.f64749f.setDrawingCacheEnabled(true);
        bcVar.f64745b.setDrawingCacheEnabled(true);
    }

    public final IShareService.ShareStruct a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64683a, false, 73082, new Class[]{File.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{file}, this, f64683a, false, 73082, new Class[]{File.class}, IShareService.ShareStruct.class);
        }
        this.n.j.thumbUrl = file.getPath();
        return this.n.j;
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f64683a, false, 73081, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f64683a, false, 73081, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
        if (this.t != null) {
            bc bcVar = this.t;
            if (PatchProxy.isSupport(new Object[]{bitmap2}, bcVar, bc.f64744a, false, 73098, new Class[]{Bitmap.class}, Void.TYPE)) {
                bc bcVar2 = bcVar;
                PatchProxy.accessDispatch(new Object[]{bitmap2}, bcVar2, bc.f64744a, false, 73098, new Class[]{Bitmap.class}, Void.TYPE);
            } else {
                if (bcVar.f64745b != null) {
                    bcVar.f64745b.setImageBitmap(bitmap2);
                }
                bcVar.i = System.currentTimeMillis();
            }
        }
        i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(com.douyin.baseshare.a aVar, File file) {
        if (file == null) {
            this.f64685c = false;
            return;
        }
        b(file);
        a(aVar.d(), aVar.f(), this.m);
    }

    private void a(com.douyin.baseshare.a aVar, a aVar2) {
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f64683a, false, 73084, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f64683a, false, 73084, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE);
        } else if (!this.f64685c && isShowing()) {
            this.f64685c = true;
            if (!this.j) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
                this.f64685c = false;
                return;
            }
            Bitmap a2 = this.t.a();
            if (a2 == null) {
                this.f64685c = false;
                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
                ExceptionMonitor.ensureNotReachHere("build bitmap is null");
                aVar2.a(null);
                return;
            }
            i.a((Callable<TResult>) new az<TResult>(this, aVar, a2)).a((g<TResult, TContinuationResult>) new ba<TResult,TContinuationResult>(this, aVar2), i.f1052b);
        }
    }

    /* access modifiers changed from: package-private */
    public File a(com.douyin.baseshare.a aVar, Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{aVar, bitmap}, this, f64683a, false, 73085, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{aVar, bitmap}, this, f64683a, false, 73085, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class);
        }
        String d2 = aVar.d();
        if ("save_local".equals(aVar.d())) {
            d2 = "normal";
        }
        new ae().a("miniapp").b(d2).c("general").e();
        return a(bitmap, "share_card_" + this.n.f45944e);
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f64683a, false, 73088, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f64683a, false, 73088, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (!this.f64685c && isShowing()) {
            if (c()) {
                a(aVar, (a) new bb(this, aVar));
            } else if (!aVar.a()) {
                this.f64685c = false;
                if (q.a(aVar.d())) {
                    ca.a(this.f64684b, this.n.j, null);
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
                }
            } else if (TextUtils.equals("rocket", aVar.d())) {
                aVar.a(this.n.j);
            } else if (f.c(this.f64684b) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f64684b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64690a;

                    public final void b() {
                        ax.this.f64685c = false;
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64690a, false, 73095, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64690a, false, 73095, new Class[0], Void.TYPE);
                            return;
                        }
                        ax.this.a(aVar);
                    }
                });
            } else {
                a(aVar);
            }
        }
    }

    public ax(Activity activity, d dVar, OnShareEventListener onShareEventListener) {
        super(activity);
        this.f64684b = activity;
        this.n = dVar;
        this.p = dVar.g;
        this.o = dVar.h;
        this.m = onShareEventListener;
    }
}
