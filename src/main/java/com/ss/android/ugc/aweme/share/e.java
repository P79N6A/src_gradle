package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.utils.bl;
import com.tt.option.share.OnShareEventListener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public abstract class e extends Dialog implements com.ss.android.ugc.aweme.qrcode.d.a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f3876d;

    /* renamed from: a  reason: collision with root package name */
    private c f3877a;

    /* renamed from: b  reason: collision with root package name */
    private View f3878b;

    /* renamed from: c  reason: collision with root package name */
    private View f3879c;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f3880e;

    /* renamed from: f  reason: collision with root package name */
    protected Activity f3881f;
    protected IShareService.OnShareCallback g;
    protected HorizontalScrollView h;
    protected TextView i;
    public boolean j;
    protected String k;
    public CloseableReference<CloseableImage> l;
    protected OnShareEventListener m;
    private View n;
    private View o;
    private ViewGroup p;
    private DmtStatusView q;

    protected static class a extends BaseDataSubscriber<CloseableReference<CloseableImage>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65013a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<c> f65014b;

        public a(c cVar) {
            this.f65014b = new WeakReference<>(cVar);
        }

        public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f65013a, false, 72950, new Class[]{DataSource.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f65013a, false, 72950, new Class[]{DataSource.class}, Void.TYPE);
                return;
            }
            if (this.f65014b != null) {
                this.f65014b.get();
            }
        }

        public void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f65013a, false, 72949, new Class[]{DataSource.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f65013a, false, 72949, new Class[]{DataSource.class}, Void.TYPE);
                return;
            }
            if (dataSource.isFinished() && this.f65014b != null) {
                c cVar = (c) this.f65014b.get();
                if (cVar != null) {
                    cVar.a(dataSource);
                }
            }
        }
    }

    public interface b {
        void a(File file);
    }

    public interface c {
        void a(DataSource<CloseableReference<CloseableImage>> dataSource);
    }

    public abstract IShareService.ShareStruct a(File file);

    public abstract void a();

    public void a(Bitmap bitmap) {
    }

    public abstract void a(View view, com.douyin.baseshare.a aVar);

    public void a(Exception exc) {
    }

    public abstract int b();

    public abstract boolean c();

    public abstract void d();

    public abstract void e();

    public abstract String f();

    public abstract int g();

    public final void a(String str, String str2, OnShareEventListener onShareEventListener) {
        String str3 = str;
        OnShareEventListener onShareEventListener2 = onShareEventListener;
        if (PatchProxy.isSupport(new Object[]{str3, str2, onShareEventListener2}, this, f3876d, false, 72932, new Class[]{String.class, String.class, OnShareEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2, onShareEventListener2}, this, f3876d, false, 72932, new Class[]{String.class, String.class, OnShareEventListener.class}, Void.TYPE);
            return;
        }
        dismiss();
        if (str.equals("save_local")) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this.f3881f, (int) C0906R.string.et, 0).a();
            return;
        }
        new AlertDialog.Builder(this.f3881f, C0906R.style.kx).setTitle(C0906R.string.et).setNegativeButton(C0906R.string.pm, new m(this, onShareEventListener2)).setPositiveButton(this.f3881f.getString(C0906R.string.c66, new Object[]{str2}), new n(this, str, onShareEventListener2)).show();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72927, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.setVisibility(8);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72936, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, p.f65225a, true, 72951, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, p.f65225a, true, 72951, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        this.f3877a = null;
        i();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72934, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72926, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.d();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72935, new Class[0], Void.TYPE);
            return;
        }
        View childAt = this.p.getChildAt(0);
        if (isShowing() && !c()) {
            childAt.getLayoutParams();
            childAt.animate().translationY((float) ((((this.p.getMeasuredHeight() - childAt.getMeasuredHeight()) / 2) - ((int) UIUtils.dip2Px(this.f3881f, 12.0f))) - ((int) UIUtils.dip2Px(this.f3881f, 182.0f)))).setDuration(200).start();
            this.f3879c.animate().translationY(0.0f).setDuration(200).start();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3876d
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 72924(0x11cdc, float:1.02188E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3876d
            r5 = 0
            r6 = 72924(0x11cdc, float:1.02188E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r1 = r9.f()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x010b
            java.lang.String r1 = r9.f()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 7
            r5 = 1
            switch(r3) {
                case -1134307907: goto L_0x0084;
                case -929929834: goto L_0x007a;
                case -925677868: goto L_0x0070;
                case -791575966: goto L_0x0066;
                case 3616: goto L_0x005c;
                case 108102557: goto L_0x0052;
                case 113011944: goto L_0x0048;
                case 169159643: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x008e
        L_0x003e:
            java.lang.String r3 = "rocket_space"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 4
            goto L_0x008f
        L_0x0048:
            java.lang.String r3 = "weibo"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 5
            goto L_0x008f
        L_0x0052:
            java.lang.String r3 = "qzone"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 7
            goto L_0x008f
        L_0x005c:
            java.lang.String r3 = "qq"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 6
            goto L_0x008f
        L_0x0066:
            java.lang.String r3 = "weixin"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 0
            goto L_0x008f
        L_0x0070:
            java.lang.String r3 = "rocket"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 3
            goto L_0x008f
        L_0x007a:
            java.lang.String r3 = "weixin_moments"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 1
            goto L_0x008f
        L_0x0084:
            java.lang.String r3 = "toutiao"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 2
            goto L_0x008f
        L_0x008e:
            r1 = -1
        L_0x008f:
            switch(r1) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a4;
                case 6: goto L_0x009c;
                case 7: goto L_0x0094;
                default: goto L_0x0092;
            }
        L_0x0092:
            r1 = 0
            goto L_0x00d3
        L_0x0094:
            com.douyin.share.c r1 = new com.douyin.share.c
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x009c:
            com.douyin.share.b r1 = new com.douyin.share.b
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00a4:
            com.douyin.share.n r1 = new com.douyin.share.n
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00ac:
            com.douyin.share.e r1 = new com.douyin.share.e
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00b4:
            com.douyin.share.d r1 = new com.douyin.share.d
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00bc:
            com.douyin.share.k r1 = new com.douyin.share.k
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00c4:
            com.douyin.share.l r1 = new com.douyin.share.l
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
            goto L_0x00d3
        L_0x00cc:
            com.douyin.share.m r1 = new com.douyin.share.m
            android.app.Activity r2 = r9.f3881f
            r1.<init>(r2)
        L_0x00d3:
            if (r1 == 0) goto L_0x0173
            int r2 = r9.g()
            if (r2 != r4) goto L_0x00ea
            android.widget.TextView r2 = r9.i
            android.app.Activity r3 = r9.f3881f
            r4 = 2131562194(0x7f0d0ed2, float:1.874981E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            goto L_0x0100
        L_0x00ea:
            android.widget.TextView r2 = r9.i
            android.app.Activity r3 = r9.f3881f
            r4 = 2131562429(0x7f0d0fbd, float:1.8750287E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.f()
            r5[r0] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
        L_0x0100:
            android.widget.TextView r2 = r9.i
            com.ss.android.ugc.aweme.share.f r3 = new com.ss.android.ugc.aweme.share.f
            r3.<init>(r9, r1)
            r2.setOnClickListener(r3)
            goto L_0x0173
        L_0x010b:
            android.widget.HorizontalScrollView r1 = r9.h
            int r1 = r1.getChildCount()
            if (r1 != 0) goto L_0x0173
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r2 = r9.getContext()
            r1.<init>(r2)
            r1.setOrientation(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService> r3 = com.ss.android.ugc.aweme.framework.services.IShareService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.framework.services.IShareService r2 = (com.ss.android.ugc.aweme.framework.services.IShareService) r2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r4 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.share.ShareOrderService r3 = (com.ss.android.ugc.aweme.share.ShareOrderService) r3
            java.lang.String[] r4 = r3.getShareCardImgeList()
            java.lang.String[] r3 = r3.getShareCardImgeList()
            int r3 = r3.length
            com.douyin.baseshare.a[] r3 = new com.douyin.baseshare.a[r3]
            r5 = 0
        L_0x0143:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0153
            android.app.Activity r6 = r9.f3881f
            r7 = r4[r5]
            com.douyin.baseshare.a r6 = r2.getShareChannel(r6, r7)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L_0x0143
        L_0x0153:
            com.douyin.baseshare.a[] r2 = com.ss.android.ugc.aweme.share.cg.a((com.douyin.baseshare.a[]) r3)
            int r3 = r2.length
            r4 = 0
        L_0x0159:
            if (r4 >= r3) goto L_0x016e
            r5 = r2[r4]
            android.app.Activity r6 = r9.f3881f
            com.ss.android.ugc.aweme.share.g r7 = new com.ss.android.ugc.aweme.share.g
            r7.<init>(r9, r5)
            com.ss.android.ugc.aweme.share.seconditem.j r5 = com.ss.android.ugc.aweme.share.cg.a((android.app.Activity) r6, (com.douyin.baseshare.a) r5, (android.view.View.OnClickListener) r7)
            r1.addView(r5)
            int r4 = r4 + 1
            goto L_0x0159
        L_0x016e:
            android.widget.HorizontalScrollView r2 = r9.h
            r2.addView(r1)
        L_0x0173:
            android.view.ViewGroup r1 = r9.p
            android.view.View r0 = r1.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r1 = 17
            r0.gravity = r1
            android.view.View r0 = r9.f3879c
            android.app.Activity r1 = r9.f3881f
            r2 = 1127743488(0x43380000, float:184.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            r0.setTranslationY(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.e.h():void");
    }

    public final e a(IShareService.OnShareCallback onShareCallback) {
        this.g = onShareCallback;
        return this;
    }

    public e(@NonNull Activity activity) {
        super(activity, C0906R.style.rc);
        this.f3881f = activity;
    }

    public final void b(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f3876d, false, 72929, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f3876d, false, 72929, new Class[]{File.class}, Void.TYPE);
            return;
        }
        String path = new File(com.ss.android.ugc.aweme.am.a.a(this.f3881f), file.getName()).getPath();
        com.ss.android.ugc.aweme.video.b.c(file.getPath(), path);
        Activity activity = this.f3881f;
        activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + path)));
        this.k = path;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3876d, false, 72922, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3876d, false, 72922, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(b());
        int screenHeight = UIUtils.getScreenHeight(getContext()) - UIUtils.getStatusBarHeight(this.f3881f);
        if (screenHeight <= 0) {
            screenHeight = -1;
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, screenHeight);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3876d, false, 72925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3876d, false, 72925, new Class[0], Void.TYPE);
        } else {
            this.f3878b = findViewById(C0906R.id.ts);
            this.h = (HorizontalScrollView) findViewById(C0906R.id.cpf);
            this.i = (TextView) findViewById(C0906R.id.cqm);
            this.f3879c = findViewById(C0906R.id.cq3);
            this.f3878b.setOnClickListener(new h(this));
            this.o = findViewById(C0906R.id.cq0);
            this.n = findViewById(C0906R.id.cqj);
            this.p = (ViewGroup) findViewById(C0906R.id.cpi);
            this.p.getChildAt(0).setOnClickListener(i.f65024b);
            this.f3879c.setOnClickListener(j.f65210b);
            findViewById(C0906R.id.q2).setOnClickListener(new k(this));
            findViewById(C0906R.id.cqi).setOnClickListener(new l(this));
            this.q = (DmtStatusView) findViewById(C0906R.id.cvd);
            if (c()) {
                this.f3879c.setVisibility(8);
                this.n.setVisibility(0);
                this.o.setVisibility(0);
                findViewById(C0906R.id.b8v).setBackgroundResource(C0906R.color.a7l);
            } else {
                this.n.setVisibility(8);
                this.o.setVisibility(8);
                this.i.setVisibility(8);
                this.f3878b.setVisibility(8);
            }
            if (this.q != null) {
                this.q.setBuilder(DmtStatusView.a.a(getContext()));
            }
        }
        d();
        h();
        a();
        e();
        setOnDismissListener(new DialogInterface.OnDismissListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65009a;

            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f65009a, false, 72946, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f65009a, false, 72946, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                if (e.this.l != null) {
                    CloseableReference.closeSafely(e.this.l);
                }
            }
        });
    }

    public void a(com.ss.android.ugc.aweme.qrcode.c.a aVar) {
        String str;
        com.ss.android.ugc.aweme.qrcode.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3876d, false, 72928, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3876d, false, 72928, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE);
            return;
        }
        this.f3877a = new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65011a;

            public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f65011a, false, 72947, new Class[]{DataSource.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f65011a, false, 72947, new Class[]{DataSource.class}, Void.TYPE);
                    return;
                }
                e.this.l = (CloseableReference) dataSource.getResult();
                com.ss.android.b.a.a.a.b(new o(this, dataSource));
            }
        };
        UrlModel urlModel = aVar2.f63358a;
        a aVar3 = new a(this.f3877a);
        if (PatchProxy.isSupport(new Object[]{urlModel, aVar3}, null, f3876d, true, 72933, new Class[]{UrlModel.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel, aVar3}, null, f3876d, true, 72933, new Class[]{UrlModel.class, a.class}, Void.TYPE);
        } else if (urlModel != null) {
            Iterator<String> it2 = urlModel.getUrlList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    break;
                }
                str = it2.next();
                if (!StringUtils.isEmpty(str)) {
                    break;
                }
            }
            Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setProgressiveRenderingEnabled(true).build(), null).subscribe(aVar3, CallerThreadExecutor.getInstance());
        }
        this.f3880e.setDrawingCacheEnabled(true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) com.ss.android.ugc.aweme.app.k.a(), (int) com.ss.android.ugc.aweme.C0906R.string.but, 1).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
        com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0095 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(android.graphics.Bitmap r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f3876d
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r6 = 0
            r7 = 72930(0x11ce2, float:1.02197E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f3876d
            r15 = 0
            r16 = 72930(0x11ce2, float:1.02197E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.io.File> r18 = java.io.File.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.io.File r0 = (java.io.File) r0
            return r0
        L_0x004a:
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r4.<init>()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.io.File r5 = com.ss.android.ugc.aweme.video.b.d()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r4.append(r5)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.lang.String r5 = "/share/"
            r4.append(r5)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r4.append(r1)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.lang.String r1 = ".png"
            r4.append(r1)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            java.io.File r1 = r3.getParentFile()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            if (r1 != 0) goto L_0x0082
            java.io.File r1 = r3.getParentFile()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r1.mkdir()     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
        L_0x0082:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0095 }
            r5 = 100
            r0.compress(r4, r5, r1)     // Catch:{ Exception -> 0x0095 }
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r1)
            return r3
        L_0x0092:
            r0 = move-exception
            goto L_0x00a9
        L_0x0094:
            r1 = r2
        L_0x0095:
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ all -> 0x00a7 }
            r3 = 2131561962(0x7f0d0dea, float:1.874934E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r3, (int) r11)     // Catch:{ all -> 0x00a7 }
            r0.a()     // Catch:{ all -> 0x00a7 }
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r1)
            return r2
        L_0x00a7:
            r0 = move-exception
            r2 = r1
        L_0x00a9:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.e.a(android.graphics.Bitmap, java.lang.String):java.io.File");
    }

    public final void a(com.douyin.baseshare.a aVar, File file) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{aVar, file}, this, f3876d, false, 72923, new Class[]{com.douyin.baseshare.a.class, File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, file}, this, f3876d, false, 72923, new Class[]{com.douyin.baseshare.a.class, File.class}, Void.TYPE);
            return;
        }
        if (this.f3881f.getExternalCacheDir() == null) {
            i2 = 0;
        }
        n.a("image_share_sdcard_visibility", i2, (JSONObject) null);
        if (aVar.a()) {
            switch (g()) {
                case 6:
                    aVar.b(a(file));
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    b(file);
                    a(aVar.d(), aVar.f(), this.m);
                    return;
                case 8:
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bl.a(this.f3881f, file));
                    cg.a(this.f3881f, aVar.d(), arrayList, "", "");
                    return;
                default:
                    return;
            }
        } else {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this.f3881f, aVar.c(), 0).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, OnShareEventListener onShareEventListener) {
        cg.a(f.a().a(str), (Context) this.f3881f);
        if (onShareEventListener != null) {
            onShareEventListener.onSuccess(null);
        }
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f3876d, false, 72931, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f3876d, false, 72931, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str3, str4, null);
    }
}
