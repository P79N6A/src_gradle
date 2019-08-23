package com.ss.android.ugc.aweme.feed.share.command;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.ca;
import com.ss.android.ugc.aweme.share.e;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class o extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3186a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f3187b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3188c;
    private AnimatedImageView n;
    private TextView o;
    private TextView p;
    private d q;
    private com.ss.android.ugc.aweme.qrcode.d.e r;
    private String s;
    private int t = -1;
    private String u;
    private e.c v;
    private boolean w;
    private final String x;

    public final int b() {
        return C0906R.layout.kr;
    }

    public final String f() {
        return this.u;
    }

    public final int g() {
        return this.t;
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3186a, false, 42284, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3186a, false, 42284, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (aVar2 != null && aVar2.f63358a != null) {
            this.s = aVar2.f63358a.getUrlList().get(0);
        }
        i();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42265, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42265, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.u)) {
            z = true;
        }
        return z;
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42283, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        this.v = null;
        bg.d(this);
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42282, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        bg.c(this);
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42272, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42272, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.q.f45941b) || !a(Uri.parse(this.q.f45941b)) || !this.j) {
            return true;
        } else {
            return false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42266, new Class[0], Void.TYPE);
            return;
        }
        this.n = (AnimatedImageView) findViewById(C0906R.id.asf);
        this.o = (TextView) findViewById(C0906R.id.d9b);
        this.p = (TextView) findViewById(C0906R.id.diw);
        this.f3880e = (ImageView) findViewById(C0906R.id.ate);
        this.f3880e.setDrawingCacheEnabled(true);
        this.n.setDrawingCacheEnabled(true);
        this.r = new com.ss.android.ugc.aweme.qrcode.d.e(new b(), this);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42267, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.n.setImageLoadFinishListener(new p(this));
            c.a((RemoteImageView) this.n, this.q.f45941b);
            TextView textView = this.p;
            if (TextUtils.isEmpty(this.q.f45942c)) {
                str = this.f3187b.getString(C0906R.string.c6e);
            } else {
                str = this.q.f45942c;
            }
            textView.setText(str);
            TextView textView2 = this.o;
            textView2.setText("@" + this.q.f45943d);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3186a, false, 42264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3186a, false, 42264, new Class[0], Void.TYPE);
        } else if (this.w) {
            this.r.b(this.q.f45940a, this.q.f45944e);
        } else {
            this.r.a(this.q.f45940a, this.q.f45944e);
        }
    }

    private boolean a(Uri uri) {
        Uri uri2 = uri;
        if (!PatchProxy.isSupport(new Object[]{uri2}, this, f3186a, false, 42275, new Class[]{Uri.class}, Boolean.TYPE)) {
            return Fresco.getImagePipeline().isInBitmapMemoryCache(uri2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, this, f3186a, false, 42275, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        AwesomeSplashEvent awesomeSplashEvent2 = awesomeSplashEvent;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent2}, this, f3186a, false, 42286, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent2}, this, f3186a, false, 42286, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        if (awesomeSplashEvent2.f39420b != 4 && isShowing()) {
            dismiss();
        }
    }

    public final IShareService.ShareStruct a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f3186a, false, 42269, new Class[]{File.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{file}, this, f3186a, false, 42269, new Class[]{File.class}, IShareService.ShareStruct.class);
        }
        this.q.j.thumbUrl = file.getPath();
        return this.q.j;
    }

    public final void a(final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3186a, false, 42276, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3186a, false, 42276, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (k()) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
        } else if (!this.f3188c && isShowing()) {
            this.f3188c = true;
            a(aVar, (e.b) new e.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46031a;

                public final void a(File file) {
                    if (PatchProxy.isSupport(new Object[]{file}, this, f46031a, false, 42294, new Class[]{File.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{file}, this, f46031a, false, 42294, new Class[]{File.class}, Void.TYPE);
                        return;
                    }
                    o.this.b(file);
                    o.this.a(aVar.d(), aVar.f());
                    o.this.f3188c = false;
                }
            });
        }
    }

    public o(@NonNull Activity activity, d dVar) {
        super(activity);
        this.f3187b = activity;
        this.q = dVar;
        this.u = dVar.g;
        this.t = dVar.h;
        boolean z = true;
        if (!AbTestManager.a().bh() && dVar.f45940a == 1) {
            z = false;
        }
        this.w = z;
        this.x = "click_qr_code";
    }

    @SuppressLint({"SetTextI18n"})
    private void a(com.douyin.baseshare.a aVar, e.b bVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{aVar, bVar}, this, f3186a, false, 42270, new Class[]{com.douyin.baseshare.a.class, e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, bVar}, this, f3186a, false, 42270, new Class[]{com.douyin.baseshare.a.class, e.b.class}, Void.TYPE);
            return;
        }
        String d2 = aVar.d();
        if ("save_local".equals(aVar.d())) {
            d2 = "normal";
        }
        ae b2 = new ae().a(this.q.j.extraParams.get("enter_from")).b(d2);
        if (this.w) {
            str = "shaped";
        } else {
            str = "general";
        }
        b2.c(str).e(this.x).e();
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aq7, null);
        TextView textView = (TextView) inflate.findViewById(C0906R.id.d9b);
        TextView textView2 = (TextView) inflate.findViewById(C0906R.id.diw);
        AnimatedImageView animatedImageView = (AnimatedImageView) inflate.findViewById(C0906R.id.ate);
        AnimatedImageView animatedImageView2 = (AnimatedImageView) inflate.findViewById(C0906R.id.asf);
        c.a((RemoteImageView) animatedImageView2, this.q.f45941b);
        if (animatedImageView2.getDrawable() != null) {
            animatedImageView2.getDrawable().setVisible(true, false);
        }
        if (TextUtils.isEmpty(this.q.f45942c)) {
            str2 = this.f3187b.getString(C0906R.string.c6e);
        } else {
            str2 = this.q.f45942c;
        }
        textView2.setText(str2);
        textView.setText("@" + this.q.f45943d);
        animatedImageView.setImageBitmap(this.f3880e.getDrawingCache());
        inflate.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(1344, Integer.MIN_VALUE));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        com.ss.android.ugc.aweme.framework.a.a.a("start save");
        com.ss.android.b.a.a.a.b(new q(bVar, a(createBitmap, "share_card_" + this.q.f45944e)));
        this.f3188c = false;
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f3186a, false, 42268, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f3186a, false, 42268, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (k()) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
        } else if (!c()) {
            String d2 = aVar.d();
            if (TextUtils.equals("save_local", d2)) {
                d2 = "normal";
            }
            r.a("share_video", (Map) d.a().a(this.q.j.extraParams).a("group_id", this.q.f45944e).a("enter_method", "click_qr_code").a("share_mode", "shaped_qr_code").a("platform", d2).f34114b);
            if (aVar.a()) {
                if (TextUtils.equals("rocket", aVar.d())) {
                    aVar.a(this.q.j);
                } else if (f.c(this.f3187b) != 0) {
                    com.ss.android.ugc.aweme.utils.permission.a.a(this.f3187b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46028a;

                        public final void b() {
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f46028a, false, 42293, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46028a, false, 42293, new Class[0], Void.TYPE);
                                return;
                            }
                            o.this.a(aVar);
                        }
                    });
                } else {
                    a(aVar);
                }
            } else if (q.a(aVar.d())) {
                ca.a(this.f3187b, this.q.j, null);
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
            }
        } else if (!this.f3188c && isShowing()) {
            this.f3188c = true;
            a(aVar, (e.b) new e.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46022a;

                public final void a(final File file) {
                    if (PatchProxy.isSupport(new Object[]{file}, this, f46022a, false, 42291, new Class[]{File.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{file}, this, f46022a, false, 42291, new Class[]{File.class}, Void.TYPE);
                    } else if (f.c(o.this.f3187b) != 0) {
                        com.ss.android.ugc.aweme.utils.permission.a.a(o.this.f3187b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f46025a;

                            public final void b() {
                            }

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f46025a, false, 42292, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f46025a, false, 42292, new Class[0], Void.TYPE);
                                    return;
                                }
                                o.this.a(aVar, file);
                                o.this.dismiss();
                            }
                        });
                    } else {
                        o.this.a(aVar, file);
                        o.this.dismiss();
                    }
                }
            });
        }
    }

    public o(@NonNull Activity activity, d dVar, int i, String str) {
        super(activity);
        this.f3187b = activity;
        this.q = dVar;
        this.t = i;
        this.u = str;
        boolean z = true;
        if (!AbTestManager.a().bh() && dVar.f45940a == 1) {
            z = false;
        }
        this.w = z;
        this.x = "normal_share";
    }
}
