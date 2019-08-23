package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.hotsearch.a.e;
import com.ss.android.ugc.aweme.hotsearch.d.f;
import com.ss.android.ugc.aweme.hotsearch.share.HotSearchRankingShareDialog;
import com.ss.android.ugc.aweme.share.ck;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public abstract class a implements IShareService.IActionHandler, IShareService.OnShareCallback, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44520a;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f44521b;

    /* renamed from: c  reason: collision with root package name */
    protected Bitmap f44522c;

    /* renamed from: d  reason: collision with root package name */
    public C0555a f44523d;

    /* renamed from: e  reason: collision with root package name */
    private ShareInfo f44524e;

    /* renamed from: f  reason: collision with root package name */
    private String f44525f;
    private String g;
    private int h;
    private HotSearchRankingShareDialog i;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a$a  reason: collision with other inner class name */
    public interface C0555a {
        void a(Bitmap bitmap);
    }

    public abstract Bitmap c();

    public boolean checkStatus(String str) {
        return true;
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
    }

    public final Bitmap d() {
        return this.f44522c;
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.g;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f44520a, false, 39729, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44520a, false, 39729, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.f44522c = c();
        if (this.f44523d != null) {
            this.f44523d.a(this.f44522c);
        }
        if (this.f44522c == null) {
            return false;
        }
        b();
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44520a, false, 39730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44520a, false, 39730, new Class[0], Void.TYPE);
            return;
        }
        new ck();
        if (this.f44524e != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HotSearchRankingShareDialog hotSearchRankingShareDialog = new HotSearchRankingShareDialog(this.f44521b, this.f44524e, 4, countDownLatch, this);
            this.i = hotSearchRankingShareDialog;
            this.i.setActionHandler(this);
            this.i.setShareCallback(this);
            IShareService.ShareStruct a2 = i.a((Context) this.f44521b, this.f44524e, "");
            a.i.a((Callable<TResult>) new b<TResult>(this, countDownLatch));
            a2.awemeType = 2401;
            if (a2.extraParams == null) {
                a2.extraParams = new HashMap<>();
            }
            a2.extraParams.put("update_time", this.f44525f);
            this.i.updateShareStruct(a2);
            this.i.setOnShowListener(new c(this));
            if (!this.i.isShowing()) {
                try {
                    this.i.show();
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(e2.getMessage() + getClass().getSimpleName()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(CountDownLatch countDownLatch) throws Exception {
        Bitmap bitmap;
        if (PatchProxy.isSupport(new Object[0], this, f44520a, false, 39731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44520a, false, 39731, new Class[0], Void.TYPE);
        } else {
            Canvas canvas = new Canvas(this.f44522c);
            if (((Integer) x.a().D().c()).intValue() == 0) {
                bitmap = BitmapFactory.decodeResource(this.f44521b.getResources(), 2130838030).copy(Bitmap.Config.RGB_565, true);
            } else {
                bitmap = BitmapFactory.decodeResource(this.f44521b.getResources(), 2130838029).copy(Bitmap.Config.RGB_565, true);
            }
            this.h = (bitmap.getHeight() * this.f44522c.getWidth()) / bitmap.getWidth();
            canvas.drawBitmap(f.a(bitmap, this.h, this.f44522c.getWidth()), 0.0f, (float) (this.f44522c.getHeight() - this.h), null);
        }
        countDownLatch.countDown();
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r9.equals("weixin_moments") != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onAction(com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r15, java.lang.String r16) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44520a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 39733(0x9b35, float:5.5678E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44520a
            r3 = 0
            r4 = 39733(0x9b35, float:5.5678E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            java.lang.String r13 = "star"
            r0 = -1
            int r1 = r16.hashCode()
            switch(r1) {
                case -1322993519: goto L_0x009a;
                case -929929834: goto L_0x0091;
                case -791575966: goto L_0x0087;
                case 3616: goto L_0x007d;
                case 3059573: goto L_0x0073;
                case 3357525: goto L_0x0069;
                case 108102557: goto L_0x005f;
                case 113011944: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00a4
        L_0x0055:
            java.lang.String r1 = "weibo"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 3
            goto L_0x00a5
        L_0x005f:
            java.lang.String r1 = "qzone"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 5
            goto L_0x00a5
        L_0x0069:
            java.lang.String r1 = "more"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 6
            goto L_0x00a5
        L_0x0073:
            java.lang.String r1 = "copy"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 7
            goto L_0x00a5
        L_0x007d:
            java.lang.String r1 = "qq"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 4
            goto L_0x00a5
        L_0x0087:
            java.lang.String r1 = "weixin"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 1
            goto L_0x00a5
        L_0x0091:
            java.lang.String r1 = "weixin_moments"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x009a:
            java.lang.String r1 = "chat_merge"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a4
            r10 = 0
            goto L_0x00a5
        L_0x00a4:
            r10 = -1
        L_0x00a5:
            switch(r10) {
                case 0: goto L_0x0147;
                case 1: goto L_0x0144;
                case 2: goto L_0x0141;
                case 3: goto L_0x013e;
                case 4: goto L_0x013b;
                case 5: goto L_0x0138;
                case 6: goto L_0x0135;
                case 7: goto L_0x00a9;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            return r11
        L_0x00a9:
            java.lang.String r10 = "copy_link"
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f44520a
            r3 = 0
            r4 = 39734(0x9b36, float:5.5679E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f44520a
            r3 = 0
            r4 = 39734(0x9b36, float:5.5679E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0161
        L_0x00dc:
            android.app.Activity r0 = r7.f44521b
            if (r0 == 0) goto L_0x0161
            android.app.Activity r0 = r7.f44521b
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            if (r8 == 0) goto L_0x0161
            java.lang.String r1 = r8.description
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0161
            java.lang.String r1 = r8.url
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0161
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.description
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = ""
            goto L_0x010e
        L_0x010c:
            java.lang.String r2 = r8.description
        L_0x010e:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r8.url
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r1)
            if (r0 == 0) goto L_0x0128
            r0.setPrimaryClip(r1)
        L_0x0128:
            android.app.Activity r0 = r7.f44521b
            r1 = 2131559505(0x7f0d0451, float:1.8744356E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0161
        L_0x0135:
            java.lang.String r10 = "more"
            goto L_0x0161
        L_0x0138:
            java.lang.String r10 = "qzone"
            goto L_0x0161
        L_0x013b:
            java.lang.String r10 = "qq"
            goto L_0x0161
        L_0x013e:
            java.lang.String r10 = "weibo"
            goto L_0x0161
        L_0x0141:
            java.lang.String r10 = "WEIXIN_MOMENTS"
            goto L_0x0161
        L_0x0144:
            java.lang.String r10 = "weixin"
            goto L_0x0161
        L_0x0147:
            java.lang.String r10 = "chat_merge"
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "share_struct"
            r0.putSerializable(r1, r15)
            android.app.Activity r1 = r7.f44521b
            if (r1 == 0) goto L_0x0161
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.b.a()
            android.app.Activity r2 = r7.f44521b
            r3 = 0
            r1.enterChooseContact(r2, r0, r3)
        L_0x0161:
            boolean r0 = com.ss.android.ugc.aweme.share.cg.b(r16)
            if (r0 == 0) goto L_0x016a
            java.lang.String r0 = "shaped_qr_code"
            goto L_0x016c
        L_0x016a:
            java.lang.String r0 = "normal_share"
        L_0x016c:
            java.lang.String r1 = "hot_search_share"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "hot_search_type"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r13)
            java.lang.String r3 = "platform"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r10)
            java.lang.String r3 = "share_mode"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "normal_share"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.a.onAction(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String):boolean");
    }

    public a(Activity activity, ShareInfo shareInfo, String str, String str2) {
        this.f44524e = shareInfo;
        this.f44521b = activity;
        this.f44525f = str;
        this.g = str2;
    }
}
