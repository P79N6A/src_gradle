package com.ss.android.ugc.aweme.hotsearch;

import a.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.hotsearch.a.e;
import com.ss.android.ugc.aweme.hotsearch.d.f;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseSingleRankingListFragment;
import com.ss.android.ugc.aweme.hotsearch.share.HotSearchRankingShareDialog;
import com.ss.android.ugc.aweme.hotsearch.view.d;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListVideoItemViewHolder;
import com.ss.android.ugc.aweme.share.ck;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public abstract class RankingListIndependenceActivity extends AmeSSActivity implements IShareService.IActionHandler, IShareService.OnShareCallback, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49635a;

    /* renamed from: b  reason: collision with root package name */
    public HotSearchRankingShareDialog f49636b;

    /* renamed from: c  reason: collision with root package name */
    LruCache<Integer, Bitmap> f49637c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f49638d;

    /* renamed from: e  reason: collision with root package name */
    Bitmap f49639e;

    /* renamed from: f  reason: collision with root package name */
    int f49640f;
    int g;
    Bitmap h;
    private BaseSingleRankingListFragment i;
    private String j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PageType {
    }

    public abstract int a();

    public abstract BaseSingleRankingListFragment a(String str);

    @Constants.AwemeType
    public abstract int c();

    public boolean checkStatus(String str) {
        return true;
    }

    public abstract String g();

    public void onShareComplete(IShareService.ShareResult shareResult) {
    }

    public final Bitmap d() {
        return this.h;
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f49635a, false, 49562, new Class[0], Integer.TYPE)) {
            return this.f49639e.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49562, new Class[0], Integer.TYPE)).intValue();
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49635a, false, 49563, new Class[0], String.class)) {
            return this.i.k();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49563, new Class[0], String.class);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f49635a, false, 49564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49564, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            h.a().a((Activity) this, "aweme://main");
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f49635a, false, 49552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49552, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49635a, false, 49558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49558, new Class[0], Void.TYPE);
            return;
        }
        new ck();
        if (this.i != null) {
            ShareInfo f2 = this.i.f();
            if (f2 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(2);
                HotSearchRankingShareDialog hotSearchRankingShareDialog = new HotSearchRankingShareDialog(this, f2, a(), countDownLatch, this);
                this.f49636b = hotSearchRankingShareDialog;
                this.f49636b.setActionHandler(this);
                this.f49636b.setShareCallback(this);
                IShareService.ShareStruct a2 = i.a((Context) this, f2, "");
                int a3 = a();
                if (PatchProxy.isSupport(new Object[]{countDownLatch, Integer.valueOf(a3)}, this, f49635a, false, 49557, new Class[]{CountDownLatch.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{countDownLatch, Integer.valueOf(a3)}, this, f49635a, false, 49557, new Class[]{CountDownLatch.class, Integer.TYPE}, Void.TYPE);
                } else {
                    this.h = this.f49637c.get(0);
                    if (TextUtils.equals(this.j, this.i.k())) {
                        countDownLatch.countDown();
                    } else {
                        this.j = this.i.k();
                        ArrayList arrayList = new ArrayList();
                        if (this.i != null) {
                            RecyclerView h2 = this.i.h();
                            LruCache lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
                            a.i.a((Callable<TResult>) new g<TResult>(this, h2, arrayList, a3)).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(arrayList, lruCache), a.i.f1052b).c(new i(this, h2, lruCache, countDownLatch), a.i.f1051a);
                        }
                    }
                }
                a2.awemeType = c();
                if (a2.extraParams == null) {
                    a2.extraParams = new HashMap<>();
                }
                a2.extraParams.put("update_time", this.i.g());
                this.f49636b.updateShareStruct(a2);
                this.f49636b.setOnShowListener(new j(this));
                if (!this.f49636b.isShowing()) {
                    try {
                        this.f49636b.show();
                    } catch (Exception e2) {
                        a.a((Throwable) new Exception(e2.getMessage() + getClass().getSimpleName()));
                    }
                }
            }
        }
    }

    public void onNewIntent(Intent intent) {
        String str;
        if (PatchProxy.isSupport(new Object[]{intent}, this, f49635a, false, 49554, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f49635a, false, 49554, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent != null) {
            str = intent.getStringExtra("edition_uid");
        } else {
            str = null;
        }
        if (this.i != null) {
            this.i.n();
            this.i.a(str);
            this.i.l();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49635a, false, 49553, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49635a, false, 49553, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bj);
        if (PatchProxy.isSupport(new Object[0], this, f49635a, false, 49555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49555, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            String str = null;
            if (getIntent() != null) {
                str = getIntent().getStringExtra("edition_uid");
            }
            this.i = a(str);
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(C0906R.id.aic, this.i);
            beginTransaction.commitAllowingStateLoss();
        }
        this.f49637c = new LruCache<>(1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r9.equals("weixin_moments") != false) goto L_0x00a7;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f49635a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 49561(0xc199, float:6.945E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f49635a
            r3 = 0
            r4 = 49561(0xc199, float:6.945E-41)
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
            java.lang.String r13 = r14.g()
            r0 = -1
            int r1 = r16.hashCode()
            switch(r1) {
                case -1322993519: goto L_0x009c;
                case -929929834: goto L_0x0093;
                case -791575966: goto L_0x0089;
                case 3616: goto L_0x007f;
                case 3059573: goto L_0x0075;
                case 3357525: goto L_0x006b;
                case 108102557: goto L_0x0061;
                case 113011944: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x00a6
        L_0x0057:
            java.lang.String r1 = "weibo"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 3
            goto L_0x00a7
        L_0x0061:
            java.lang.String r1 = "qzone"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 5
            goto L_0x00a7
        L_0x006b:
            java.lang.String r1 = "more"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 6
            goto L_0x00a7
        L_0x0075:
            java.lang.String r1 = "copy"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 7
            goto L_0x00a7
        L_0x007f:
            java.lang.String r1 = "qq"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 4
            goto L_0x00a7
        L_0x0089:
            java.lang.String r1 = "weixin"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 1
            goto L_0x00a7
        L_0x0093:
            java.lang.String r1 = "weixin_moments"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x009c:
            java.lang.String r1 = "chat_merge"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00a6
            r10 = 0
            goto L_0x00a7
        L_0x00a6:
            r10 = -1
        L_0x00a7:
            switch(r10) {
                case 0: goto L_0x0141;
                case 1: goto L_0x013e;
                case 2: goto L_0x013b;
                case 3: goto L_0x0138;
                case 4: goto L_0x0135;
                case 5: goto L_0x0132;
                case 6: goto L_0x012f;
                case 7: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            return r11
        L_0x00ab:
            java.lang.String r10 = "copy_link"
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f49635a
            r3 = 0
            r4 = 49559(0xc197, float:6.9447E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00de
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f49635a
            r3 = 0
            r4 = 49559(0xc197, float:6.9447E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0155
        L_0x00de:
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r14.getSystemService(r0)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            if (r8 == 0) goto L_0x0155
            java.lang.String r1 = r8.description
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0155
            java.lang.String r1 = r8.url
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0155
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.description
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = ""
            goto L_0x010a
        L_0x0108:
            java.lang.String r2 = r8.description
        L_0x010a:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r8.url
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r1)
            if (r0 == 0) goto L_0x0124
            r0.setPrimaryClip(r1)
        L_0x0124:
            r0 = 2131559505(0x7f0d0451, float:1.8744356E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r14, (int) r0)
            r0.a()
            goto L_0x0155
        L_0x012f:
            java.lang.String r10 = "more"
            goto L_0x0155
        L_0x0132:
            java.lang.String r10 = "qzone"
            goto L_0x0155
        L_0x0135:
            java.lang.String r10 = "qq"
            goto L_0x0155
        L_0x0138:
            java.lang.String r10 = "weibo"
            goto L_0x0155
        L_0x013b:
            java.lang.String r10 = "WEIXIN_MOMENTS"
            goto L_0x0155
        L_0x013e:
            java.lang.String r10 = "weixin"
            goto L_0x0155
        L_0x0141:
            java.lang.String r10 = "chat_merge"
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "share_struct"
            r0.putSerializable(r1, r15)
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.b.a()
            r2 = 0
            r1.enterChooseContact(r14, r0, r2)
        L_0x0155:
            boolean r0 = com.ss.android.ugc.aweme.share.cg.b(r16)
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = "shaped_qr_code"
            goto L_0x0160
        L_0x015e:
            java.lang.String r0 = "normal_share"
        L_0x0160:
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.RankingListIndependenceActivity.onAction(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer a(RecyclerView recyclerView, List list, int i2) throws Exception {
        Runnable runnable;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[0], this, f49635a, false, 49556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49635a, false, 49556, new Class[0], Void.TYPE);
        } else if (this.f49638d == null || this.f49639e == null) {
            BaseSingleRankingListFragment baseSingleRankingListFragment = this.i;
            if (PatchProxy.isSupport(new Object[0], baseSingleRankingListFragment, BaseSingleRankingListFragment.h, false, 49650, new Class[0], Bitmap.class)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[0], baseSingleRankingListFragment, BaseSingleRankingListFragment.h, false, 49650, new Class[0], Bitmap.class);
            } else {
                d dVar = baseSingleRankingListFragment.j;
                if (PatchProxy.isSupport(new Object[0], dVar, d.f49875a, false, 49847, new Class[0], Bitmap.class)) {
                    bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[0], dVar, d.f49875a, false, 49847, new Class[0], Bitmap.class);
                } else {
                    dVar.f49880f.setDrawingCacheEnabled(true);
                    bitmap = dVar.f49880f.getDrawingCache();
                }
            }
            View findViewById = getWindow().getDecorView().findViewById(C0906R.id.by7);
            if (findViewById != null) {
                int width = findViewById.getWidth();
                int height = findViewById.getHeight();
                if (((Integer) x.a().D().c()).intValue() == 0) {
                    bitmap2 = BitmapFactory.decodeResource(getResources(), 2130840431).copy(Bitmap.Config.RGB_565, true);
                } else {
                    bitmap2 = BitmapFactory.decodeResource(getResources(), 2130840432).copy(Bitmap.Config.RGB_565, true);
                }
                int height2 = (bitmap.getHeight() * width) / bitmap.getWidth();
                this.f49638d = f.a(bitmap, height2, width);
                int height3 = (bitmap2.getHeight() * width) / bitmap2.getWidth();
                this.f49639e = f.a(bitmap2, height3, width);
                int i4 = height2 + height;
                WindowManager windowManager = getWindowManager();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                this.f49640f = displayMetrics.heightPixels;
                this.g = (this.f49640f - i4) - height3;
            }
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        CountDownLatch countDownLatch = new CountDownLatch(itemCount - 2);
        int i5 = 0;
        int i6 = 0;
        while (i5 < itemCount) {
            RecyclerView.ViewHolder createViewHolder = adapter.createViewHolder(recyclerView, adapter.getItemViewType(i5));
            boolean z = createViewHolder instanceof com.ss.android.ugc.aweme.hotsearch.viewholder.a;
            if (z) {
                ((com.ss.android.ugc.aweme.hotsearch.viewholder.a) createViewHolder).c_(true);
            }
            list.add(createViewHolder);
            if ((i3 == 1 || i3 == 3) && (createViewHolder instanceof RankingListVideoItemViewHolder)) {
                ((RankingListVideoItemViewHolder) createViewHolder).f49935c = countDownLatch;
            }
            adapter.onBindViewHolder(createViewHolder, i5);
            createViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            createViewHolder.itemView.layout(0, 0, createViewHolder.itemView.getMeasuredWidth(), createViewHolder.itemView.getMeasuredHeight());
            i6 += createViewHolder.itemView.getMeasuredHeight();
            if (i3 == 1 || i3 == 3) {
                createViewHolder.itemView.setDrawingCacheEnabled(true);
                View view = createViewHolder.itemView;
                view.getClass();
                if (PatchProxy.isSupport(new Object[]{view}, null, k.f49785a, true, 49569, new Class[]{View.class}, Runnable.class)) {
                    Object[] objArr = {view};
                    Object[] objArr2 = objArr;
                    runnable = (Runnable) PatchProxy.accessDispatch(objArr2, null, k.f49785a, true, 49569, new Class[]{View.class}, Runnable.class);
                } else {
                    runnable = new k(view);
                }
                runOnUiThread(runnable);
            }
            if (i6 > this.g) {
                break;
            }
            if (z) {
                ((com.ss.android.ugc.aweme.hotsearch.viewholder.a) createViewHolder).c_(false);
            }
            i5++;
        }
        int i7 = i5 + 1;
        if (i3 == 1 || i3 == 3) {
            if (i7 < itemCount) {
                for (int i8 = i7; i8 < itemCount - 1; i8++) {
                    countDownLatch.countDown();
                }
            }
            try {
                countDownLatch.await();
                Thread.sleep(200);
            } catch (InterruptedException unused) {
            }
        }
        return Integer.valueOf(i7);
    }
}
