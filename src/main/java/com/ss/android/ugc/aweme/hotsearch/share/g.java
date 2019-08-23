package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.cg;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class g extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49828a;

    /* renamed from: b  reason: collision with root package name */
    AnimatedImageView f49829b;

    /* renamed from: c  reason: collision with root package name */
    Activity f49830c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f49831d;

    /* renamed from: e  reason: collision with root package name */
    ShareInfo f49832e;

    /* renamed from: f  reason: collision with root package name */
    CountDownLatch f49833f;
    String g;
    private ImageView h;
    private ImageView i;
    private DmtButton j;
    private DmtButton k;
    private String l;
    private com.ss.android.ugc.aweme.qrcode.c.a m;
    private List<String> n;
    private int o;
    private int p;

    interface a {
        void a(File file);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ff, code lost:
        if (r1 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01fa A[SYNTHETIC, Splitter:B:49:0x01fa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.io.File a(android.graphics.Bitmap r20) throws java.lang.Exception {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            com.ss.android.experiencekit.b r1 = com.ss.android.experiencekit.b.b()
            com.ss.android.experiencekit.c.c r2 = com.ss.android.experiencekit.c.a.l
            com.ss.android.experiencekit.c.d r3 = com.ss.android.experiencekit.c.d.BEGIN
            r1.a(r2, r3)
            r9 = 0
            java.util.concurrent.CountDownLatch r1 = r8.f49833f     // Catch:{ InterruptedException -> 0x0022, all -> 0x001e }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.CountDownLatch r1 = r8.f49833f     // Catch:{ InterruptedException -> 0x0022, all -> 0x001e }
            r2 = 500(0x1f4, double:2.47E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0022, all -> 0x001e }
            r1.await(r2, r4)     // Catch:{ InterruptedException -> 0x0022, all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            r8.f49833f = r9
            throw r0
        L_0x0022:
            r8.f49833f = r9
            r10 = 0
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49779(0xc273, float:6.9755E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r11 = 1
            if (r1 == 0) goto L_0x0054
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49779(0xc273, float:6.9755E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r19
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00c3
        L_0x0054:
            java.util.List<java.lang.String> r1 = r8.n
            if (r1 == 0) goto L_0x00c2
            java.util.List<java.lang.String> r1 = r8.n
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0061
            goto L_0x00c2
        L_0x0061:
            java.util.List<java.lang.String> r1 = r8.n
            java.util.Iterator r12 = r1.iterator()
        L_0x0067:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0067
            android.net.Uri r13 = android.net.Uri.parse(r1)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49780(0xc274, float:6.9757E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00b6
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49780(0xc274, float:6.9757E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r19
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00be
        L_0x00b6:
            com.facebook.imagepipeline.core.ImagePipeline r1 = com.facebook.drawee.backends.pipeline.Fresco.getImagePipeline()
            boolean r1 = r1.isInBitmapMemoryCache((android.net.Uri) r13)
        L_0x00be:
            if (r1 == 0) goto L_0x0067
            r1 = 0
            goto L_0x00c3
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()
            r1 = 2131561961(0x7f0d0de9, float:1.8749337E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1, (int) r11)
            r0.a()
            boolean r0 = r19.isShowing()
            if (r0 == 0) goto L_0x00dc
            r19.dismiss()
        L_0x00dc:
            return r9
        L_0x00dd:
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r0)
            int r13 = r20.getWidth()
            int r14 = r20.getHeight()
            int r15 = r8.o
            r7 = 4
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r10] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r16 = 2
            r1[r16] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r17 = 3
            r1[r17] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49778(0xc272, float:6.9754E-41)
            java.lang.Class[] r6 = new java.lang.Class[r7]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r16] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r17] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r2 = r19
            r9 = 4
            r7 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0162
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1[r16] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r17] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49778(0xc272, float:6.9754E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r16] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r17] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0196
        L_0x0162:
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r1.setAntiAlias(r11)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r2)
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            int r2 = com.ss.android.ugc.aweme.base.utils.u.a((double) r2)
            int r2 = r15 - r2
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r3 = r8.f49829b
            android.graphics.Bitmap r3 = r3.getDrawingCache()
            android.graphics.Bitmap r3 = com.ss.android.ugc.aweme.hotsearch.d.f.a(r3, r2, r2)
            r4 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r4 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r13 = r13 - r4
            int r13 = r13 - r2
            float r2 = (float) r13
            int r14 = r14 - r15
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            int r4 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r14 = r14 + r4
            float r4 = (float) r14
            r12.drawBitmap(r3, r2, r4, r1)
        L_0x0196:
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r1 = com.ss.android.ugc.aweme.am.a.a(r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            com.ss.android.ugc.aweme.video.b.a((java.io.File) r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMdd_HHmmssSS"
            java.util.Locale r5 = java.util.Locale.US
            r3.<init>(r4, r5)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r3 = r3.format(r4)
            r2.append(r3)
            java.lang.String r3 = ".png"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = java.io.File.separator
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01fe, all -> 0x01f6 }
            r1.<init>(r9)     // Catch:{ FileNotFoundException -> 0x01fe, all -> 0x01f6 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x01ff, all -> 0x01f4 }
            r3 = 100
            r0.compress(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x01ff, all -> 0x01f4 }
        L_0x01ee:
            r1.close()     // Catch:{ IOException -> 0x01f2 }
            goto L_0x0202
        L_0x01f2:
            goto L_0x0202
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f8
        L_0x01f6:
            r0 = move-exception
            r1 = 0
        L_0x01f8:
            if (r1 == 0) goto L_0x01fd
            r1.close()     // Catch:{ IOException -> 0x01fd }
        L_0x01fd:
            throw r0
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            if (r1 == 0) goto L_0x0202
            goto L_0x01ee
        L_0x0202:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49777(0xc271, float:6.9752E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0234
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f49828a
            r4 = 0
            r5 = 49777(0xc271, float:6.9752E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0256
        L_0x0234:
            android.app.Activity r0 = r8.f49830c
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "file://"
            r3.<init>(r4)
            java.lang.String r4 = r9.getAbsolutePath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.<init>(r2, r3)
            r0.sendBroadcast(r1)
        L_0x0256:
            com.ss.android.experiencekit.b r0 = com.ss.android.experiencekit.b.b()
            com.ss.android.experiencekit.c.c r1 = com.ss.android.experiencekit.c.a.l
            com.ss.android.experiencekit.c.d r2 = com.ss.android.experiencekit.c.d.END
            r0.a(r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.share.g.a(android.graphics.Bitmap):java.io.File");
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49828a, false, 49770, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49828a, false, 49770, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.k9);
        setCanceledOnTouchOutside(false);
        setOnDismissListener(new h(this));
        if (PatchProxy.isSupport(new Object[0], this, f49828a, false, 49771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49828a, false, 49771, new Class[0], Void.TYPE);
        } else {
            this.h = (ImageView) findViewById(C0906R.id.cpu);
            this.j = (DmtButton) findViewById(C0906R.id.cpb);
            this.k = (DmtButton) findViewById(C0906R.id.cqm);
            this.f49829b = (AnimatedImageView) findViewById(C0906R.id.c9u);
            this.h.setImageBitmap(this.f49831d);
            this.i = (ImageView) findViewById(C0906R.id.f4427me);
            switch (this.p) {
                case 0:
                case 1:
                case 3:
                    if (((Integer) x.a().D().c()).intValue() == 0) {
                        this.i.setImageResource(2130840431);
                    } else {
                        this.i.setImageResource(2130840432);
                    }
                    this.g = "hot_search_board";
                    break;
                case 2:
                    this.g = "hot_search_music";
                    if (((Integer) x.a().D().c()).intValue() != 0) {
                        if (!AbTestManager.a().ay()) {
                            this.i.setImageResource(2130840432);
                            break;
                        } else {
                            this.i.setImageResource(2130838027);
                            break;
                        }
                    } else if (!AbTestManager.a().ay()) {
                        this.i.setImageResource(2130840431);
                        break;
                    } else {
                        this.i.setImageResource(2130838028);
                        break;
                    }
                case 4:
                    this.g = "star_board";
                    if (((Integer) x.a().D().c()).intValue() != 0) {
                        this.i.setImageResource(2130838029);
                        break;
                    } else {
                        this.i.setImageResource(2130838030);
                        break;
                    }
            }
            this.j.setOnClickListener(new i(this));
            if (PatchProxy.isSupport(new Object[0], this, f49828a, false, 49772, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49828a, false, 49772, new Class[0], Void.TYPE);
            } else {
                this.f49833f = new CountDownLatch(1);
                this.f49829b.setImageLoadFinishListener(new k(this));
                this.f49829b.a(this.m.f63358a);
                this.n = this.m.f63358a.getUrlList();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f49828a, false, 49773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49828a, false, 49773, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.l)) {
            com.douyin.baseshare.a a2 = cg.a(this.f49830c, this.l);
            if (a2 != null) {
                this.k.setText(this.f49830c.getString(C0906R.string.c7f, new Object[]{a2.f()}));
                this.k.setOnClickListener(new l(this, a2));
            }
        }
    }

    public g(@NonNull Activity activity, Bitmap bitmap, ShareInfo shareInfo, com.ss.android.ugc.aweme.qrcode.c.a aVar, int i2, String str, int i3) {
        super(activity, C0906R.style.su);
        this.f49830c = activity;
        this.l = str;
        this.f49831d = bitmap;
        this.f49832e = shareInfo;
        this.m = aVar;
        this.o = i2;
        this.p = i3;
    }
}
