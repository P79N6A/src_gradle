package com.ss.android.ugc.aweme.web;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.BitmapUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.share.m;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.share.ca;
import com.ss.android.ugc.aweme.share.e;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class QRCodeWebViewDialog extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76599a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f76600b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f76601c;
    public String n;
    public String o;
    private TextView p;
    private com.ss.android.ugc.aweme.qrcode.d.e q;
    private String r;
    @QRCodeWebViewShareDialogType
    private int s;
    private String t;
    private String u;

    @interface QRCodeWebViewShareDialogType {
    }

    public final void a(Exception exc) {
    }

    public final int b() {
        return C0906R.layout.asn;
    }

    public final String f() {
        return this.t;
    }

    public final int g() {
        return this.s;
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f76599a, false, 89877, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76599a, false, 89877, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.t)) {
            z = true;
        }
        return z;
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f76599a, false, 89883, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76599a, false, 89883, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.r) || TextUtils.isEmpty(this.u) || !Fresco.getImagePipeline().isInBitmapMemoryCache(Uri.parse(this.u)) || !Fresco.getImagePipeline().isInBitmapMemoryCache(Uri.parse(this.r))) {
            return true;
        } else {
            return false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f76599a, false, 89878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76599a, false, 89878, new Class[0], Void.TYPE);
            return;
        }
        this.f76600b = (AnimatedImageView) findViewById(C0906R.id.cpu);
        this.f76600b.setDrawingCacheEnabled(true);
        this.p = (TextView) findViewById(C0906R.id.cpl);
        this.f3880e = (AnimatedImageView) findViewById(C0906R.id.cqg);
        this.f3880e.setDrawingCacheEnabled(true);
        this.q = new com.ss.android.ugc.aweme.qrcode.d.e(new b(), this);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f76599a, false, 89880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76599a, false, 89880, new Class[0], Void.TYPE);
            return;
        }
        this.p.setText(this.o);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.u);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.u);
        urlModel.setUrlList(arrayList);
        this.f76600b.setImageLoadFinishListener(new AnimatedImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76602a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f76602a, false, 89890, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76602a, false, 89890, new Class[0], Void.TYPE);
                    return;
                }
                QRCodeWebViewDialog.this.i();
            }
        });
        ((GenericDraweeHierarchy) this.f76600b.getHierarchy()).setActualImageScaleType(m.f46060b);
        this.f76600b.a(urlModel);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76599a, false, 89876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76599a, false, 89876, new Class[0], Void.TYPE);
            return;
        }
        this.q.a(11, Base64.encodeToString(this.n.getBytes(), 2));
    }

    public final IShareService.ShareStruct a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f76599a, false, 89881, new Class[]{File.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{file}, this, f76599a, false, 89881, new Class[]{File.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.setThumbPath("file://" + this.k);
        shareStruct.thumbUrl = shareStruct.getThumbPath();
        return shareStruct;
    }

    public final void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f76599a, false, 89879, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f76599a, false, 89879, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76599a, false, 89885, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76599a, false, 89885, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            super.a(aVar);
            this.r = aVar2.f63358a.getUrlList().get(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(com.douyin.baseshare.a aVar, i iVar) throws Exception {
        if (((Boolean) iVar.e()).booleanValue()) {
            if (this.s == 1) {
                a(aVar.d(), aVar.f());
            } else {
                dismiss();
                aVar.b(a((File) null));
            }
        }
        return null;
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f76599a, false, 89882, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f76599a, false, 89882, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
            return;
        }
        if (c()) {
            if (aVar.a()) {
                final g gVar = new g(this, aVar);
                if (f.c(this.f76601c) != 0) {
                    com.ss.android.ugc.aweme.utils.permission.a.a(this.f76601c, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76604a;

                        public final void b() {
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f76604a, false, 89891, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76604a, false, 89891, new Class[0], Void.TYPE);
                                return;
                            }
                            QRCodeWebViewDialog.this.a(aVar, gVar);
                        }
                    });
                } else {
                    a(aVar, (g<Boolean, Void>) gVar);
                }
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
            }
        } else if (aVar.a()) {
            final h hVar = new h(this, aVar);
            if (TextUtils.equals("rocket", aVar.d())) {
                aVar.a(a((File) null));
            } else if (f.c(this.f76601c) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f76601c, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76608a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f76608a, false, 89892, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f76608a, false, 89892, new Class[0], Void.TYPE);
                            return;
                        }
                        QRCodeWebViewDialog.this.a(aVar, hVar);
                    }
                });
            } else {
                a(aVar, (g<Boolean, Void>) hVar);
            }
        } else if (q.a(aVar.d())) {
            ca.a(this.f76601c, a((File) null), null);
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
        }
    }

    public final void a(com.douyin.baseshare.a aVar, g<Boolean, Void> gVar) {
        g<Boolean, Void> gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{aVar, gVar2}, this, f76599a, false, 89884, new Class[]{com.douyin.baseshare.a.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, gVar2}, this, f76599a, false, 89884, new Class[]{com.douyin.baseshare.a.class, g.class}, Void.TYPE);
        } else if (k()) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
        } else {
            String d2 = aVar.d();
            if ("save_local".equals(aVar.d())) {
                d2 = "normal";
            }
            new ae().a(com.ss.android.ugc.aweme.app.f.f34167a).b(d2).c("general").e();
            i.a((Callable<TResult>) new Callable<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76612a;

                public final /* synthetic */ Object call() throws Exception {
                    String str;
                    Bitmap bitmap;
                    if (PatchProxy.isSupport(new Object[0], this, f76612a, false, 89893, new Class[0], Boolean.class)) {
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f76612a, false, 89893, new Class[0], Boolean.class);
                    }
                    if (TextUtils.isEmpty(QRCodeWebViewDialog.this.n)) {
                        str = String.valueOf(System.currentTimeMillis());
                    } else {
                        str = com.toutiao.proxyserver.f.a.a(QRCodeWebViewDialog.this.n);
                    }
                    String str2 = "share_card_" + str + ".png";
                    String str3 = QRCodeWebViewDialog.this.f76601c.getCacheDir() + "/share/";
                    File file = new File(str3, str2);
                    boolean z = true;
                    if (!file.exists()) {
                        View inflate = LayoutInflater.from(QRCodeWebViewDialog.this.getContext()).inflate(C0906R.layout.aso, null, false);
                        ((ImageView) inflate.findViewById(C0906R.id.cpu)).setImageDrawable(((GenericDraweeHierarchy) QRCodeWebViewDialog.this.f76600b.getHierarchy()).getTopLevelDrawable());
                        ((ImageView) inflate.findViewById(C0906R.id.cqg)).setImageBitmap(QRCodeWebViewDialog.this.f3880e.getDrawingCache());
                        ((TextView) inflate.findViewById(C0906R.id.cpl)).setText(QRCodeWebViewDialog.this.o);
                        QRCodeWebViewDialog qRCodeWebViewDialog = QRCodeWebViewDialog.this;
                        if (PatchProxy.isSupport(new Object[]{inflate, Integer.valueOf(BuildConfig.VERSION_CODE), 1335}, qRCodeWebViewDialog, QRCodeWebViewDialog.f76599a, false, 89886, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{inflate, Integer.valueOf(BuildConfig.VERSION_CODE), 1335}, qRCodeWebViewDialog, QRCodeWebViewDialog.f76599a, false, 89886, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            inflate.layout(0, 0, BuildConfig.VERSION_CODE, 1335);
                            inflate.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(1335, 1073741824));
                            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
                        }
                        QRCodeWebViewDialog qRCodeWebViewDialog2 = QRCodeWebViewDialog.this;
                        if (PatchProxy.isSupport(new Object[]{inflate}, qRCodeWebViewDialog2, QRCodeWebViewDialog.f76599a, false, 89887, new Class[]{View.class}, Bitmap.class)) {
                            bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{inflate}, qRCodeWebViewDialog2, QRCodeWebViewDialog.f76599a, false, 89887, new Class[]{View.class}, Bitmap.class);
                        } else {
                            int width = inflate.getWidth();
                            int height = inflate.getHeight();
                            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            canvas.drawColor(-1);
                            inflate.layout(0, 0, width, height);
                            inflate.draw(canvas);
                            bitmap = createBitmap;
                        }
                        z = BitmapUtils.saveBitmapToSD(bitmap, str3, str2);
                    }
                    if (z) {
                        QRCodeWebViewDialog.this.b(file);
                    }
                    return Boolean.valueOf(z);
                }
            }).a(gVar2, i.f1052b);
        }
    }

    public QRCodeWebViewDialog(Activity activity, @QRCodeWebViewShareDialogType int i, String str, String str2, String str3, @Nullable String str4) {
        super(activity);
        this.s = i;
        this.u = str2;
        this.t = str4;
        this.o = str3;
        this.n = str;
        this.f76601c = activity;
        if (this.s == 0) {
            this.t = null;
        }
    }
}
