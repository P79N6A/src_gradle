package com.ss.android.ugc.aweme.share;

import a.g;
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
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.share.command.LiveShareCommandDialog;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class z extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65323a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f65324b;

    /* renamed from: c  reason: collision with root package name */
    public LiveShareCommandDialog.a f65325c;
    boolean n;
    private final bt o;
    private int p = -1;
    private String q;
    private e r;
    private AnimatedImageView s;
    private TextView t;
    private TextView u;
    private ae v;
    private final String w;

    interface a {
        void a(File file);
    }

    public final String f() {
        return this.q;
    }

    public final int g() {
        return this.p;
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f65323a, false, 73012, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f65323a, false, 73012, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (this.j && !this.n && isShowing()) {
            this.n = true;
            a(aVar, (a) new aa(this, aVar));
        }
    }

    public final int b() {
        if (this.o.f64823a == 5) {
            return C0906R.layout.jh;
        }
        return C0906R.layout.k4;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65323a, false, 73007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65323a, false, 73007, new Class[0], Void.TYPE);
            return;
        }
        this.r.b(this.o.f64823a, this.o.f64824b);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65323a, false, 73009, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65323a, false, 73009, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.q)) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f65323a, false, 73010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65323a, false, 73010, new Class[0], Void.TYPE);
            return;
        }
        this.r = new e(new b(), this);
        this.s = (AnimatedImageView) findViewById(C0906R.id.asf);
        this.t = (TextView) findViewById(C0906R.id.d9b);
        this.u = (TextView) findViewById(C0906R.id.diw);
        this.u.setTextColor(getContext().getResources().getColor(C0906R.color.i3));
        this.f3880e = (ImageView) findViewById(C0906R.id.ate);
        this.v = new ae(this.f65324b, this.o);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f65323a, false, 73015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65323a, false, 73015, new Class[0], Void.TYPE);
            return;
        }
        this.t.setText(this.o.f64825c);
        this.u.setText(this.o.f64826d);
        ae aeVar = this.v;
        bt btVar = this.o;
        if (PatchProxy.isSupport(new Object[]{btVar}, aeVar, ae.f64612a, false, 73024, new Class[]{bt.class}, Void.TYPE)) {
            ae aeVar2 = aeVar;
            PatchProxy.accessDispatch(new Object[]{btVar}, aeVar2, ae.f64612a, false, 73024, new Class[]{bt.class}, Void.TYPE);
            return;
        }
        aeVar.f64617f = btVar;
        aeVar.f64615d.setText(aeVar.f64617f.f64825c);
        aeVar.f64614c.setText(aeVar.f64617f.f64826d);
        aeVar.f64616e.setImageLoadFinishListener(new af(aeVar));
        aeVar.f64616e.setDrawingCacheEnabled(true);
        aeVar.f64613b.setDrawingCacheEnabled(true);
    }

    public final IShareService.ShareStruct a(File file) {
        String str;
        if (PatchProxy.isSupport(new Object[]{file}, this, f65323a, false, 73011, new Class[]{File.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{file}, this, f65323a, false, 73011, new Class[]{File.class}, IShareService.ShareStruct.class);
        }
        Activity activity = this.f65324b;
        bt btVar = this.o;
        String path = file.getPath();
        if (PatchProxy.isSupport(new Object[]{activity, btVar, path}, null, i.f46055a, true, 42114, new Class[]{Context.class, bt.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{activity, btVar, path}, null, i.f46055a, true, 42114, new Class[]{Context.class, bt.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = btVar.f64824b;
        if (activity != null) {
            shareStruct.appName = activity.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = "";
        shareStruct.description = "";
        shareStruct.setThumbPath(path);
        if (TextUtils.isEmpty(shareStruct.getThumbPath())) {
            str = "";
        } else {
            str = shareStruct.getThumbPath();
        }
        shareStruct.thumbUrl = str;
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", btVar.f64826d);
        shareStruct.extraParams = hashMap;
        return shareStruct;
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f65323a, false, 73008, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f65323a, false, 73008, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
        ae aeVar = this.v;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, aeVar, ae.f64612a, false, 73026, new Class[]{Bitmap.class}, Void.TYPE)) {
            ae aeVar2 = aeVar;
            PatchProxy.accessDispatch(new Object[]{bitmap2}, aeVar2, ae.f64612a, false, 73026, new Class[]{Bitmap.class}, Void.TYPE);
        } else {
            if (aeVar.f64613b != null) {
                aeVar.f64613b.setImageBitmap(bitmap2);
            }
            aeVar.h = System.currentTimeMillis();
        }
        i();
    }

    public z(Activity activity, bt btVar) {
        super(activity);
        this.o = btVar;
        this.f65324b = activity;
        this.w = "click_qr_code";
    }

    private void a(com.douyin.baseshare.a aVar, a aVar2) {
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f65323a, false, 73013, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f65323a, false, 73013, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE);
            return;
        }
        Bitmap a2 = this.v.a();
        if (a2 == null) {
            this.n = false;
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
            ExceptionMonitor.ensureNotReachHere("build bitmap is null");
            aVar2.a(null);
            return;
        }
        a.i.a((Callable<TResult>) new ab<TResult>(this, aVar, a2)).a((g<TResult, TContinuationResult>) new ac<TResult,TContinuationResult>(aVar2), a.i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public File a(com.douyin.baseshare.a aVar, Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{aVar, bitmap}, this, f65323a, false, 73014, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{aVar, bitmap}, this, f65323a, false, 73014, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class);
        }
        String d2 = aVar.d();
        if ("save_local".equals(aVar.d())) {
            d2 = "normal";
        }
        new ae().a(this.o.f64827e).b(d2).c("shaped").e(this.w).e();
        return a(bitmap, "share_card_" + this.o.f64823a + "_" + this.o.f64824b);
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f65323a, false, 73016, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f65323a, false, 73016, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
            return;
        }
        if (!c()) {
            int i = this.o.f64823a;
            if (i == 5) {
                str = "";
            } else if (i == 7) {
                str = "share_poi";
            } else if (i != 17) {
                if (i != 23) {
                    switch (i) {
                        case 2:
                            break;
                        case 3:
                            str = "share_music";
                            break;
                        default:
                            str = "";
                            break;
                    }
                }
                str = "share_tag";
            } else {
                str = "share_prop";
            }
            String d2 = aVar.d();
            if (TextUtils.equals("save_local", d2)) {
                d2 = "normal";
            }
            if (!TextUtils.isEmpty(str)) {
                r.a(str, (Map) new d().a(this.o.f64828f).a("enter_from", this.o.f64827e).a("enter_method", this.w).a("platform", d2).a("share_mode", "shaped_qr_code").f34114b);
            }
            if (aVar.a()) {
                if (this.g != null) {
                    IShareService.ShareResult shareResult = new IShareService.ShareResult();
                    shareResult.success = true;
                    shareResult.identifier = this.o.f64824b;
                    shareResult.type = d2;
                    shareResult.eventType = "click_qr";
                    this.g.onShareComplete(shareResult);
                }
                if (f.c(this.f65324b) != 0) {
                    com.ss.android.ugc.aweme.utils.permission.a.a(this.f65324b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f65330a;

                        public final void b() {
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f65330a, false, 73022, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f65330a, false, 73022, new Class[0], Void.TYPE);
                                return;
                            }
                            z.this.a(aVar);
                        }
                    });
                } else {
                    a(aVar);
                }
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
            }
        } else if (!this.n && isShowing()) {
            this.n = true;
            a(aVar, (a) new ad(this, aVar));
        } else {
            return;
        }
        if (this.f65325c != null) {
            this.f65325c.a(aVar.d(), "qr_code");
        }
    }

    public z(@NonNull Activity activity, bt btVar, int i, String str) {
        super(activity);
        this.f65324b = activity;
        this.o = btVar;
        this.p = 7;
        this.q = str;
        this.w = "normal_share";
    }
}
