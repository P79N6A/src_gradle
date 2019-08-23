package com.ss.android.ugc.aweme.hotsearch;

import a.g;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.helper.d;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.hotsearch.a.e;
import com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter;
import com.ss.android.ugc.aweme.hotsearch.d.f;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseRankingListFragment;
import com.ss.android.ugc.aweme.hotsearch.share.HotSearchRankingShareDialog;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListVideoItemViewHolder;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.greenrobot.eventbus.Subscribe;

@AddPageTrace
public class RankingListActivity extends AmeSSActivity implements IShareService.IActionHandler, IShareService.OnShareCallback, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3354a;
    private static final int[] k = {C0906R.string.cn_, C0906R.string.cn9, C0906R.string.cn5, C0906R.string.cn7};

    /* renamed from: b  reason: collision with root package name */
    public HotSearchRankingShareDialog f3355b;

    /* renamed from: c  reason: collision with root package name */
    LruCache<Integer, Bitmap> f3356c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f3357d;

    /* renamed from: e  reason: collision with root package name */
    Bitmap f3358e;

    /* renamed from: f  reason: collision with root package name */
    int f3359f;
    int g;
    Bitmap h;
    public HotSearchRankingPagerAdapter i;
    public b.a j;
    private int l;
    private boolean m = true;
    @BindView(2131494639)
    AwemeViewPagerNavigator mAwemeViewPagerNavigator;
    @BindView(2131494764)
    RemoteImageView mImageHeader;
    @BindView(2131494765)
    View mImageHeaderAd;
    @BindView(2131494766)
    ViewGroup mImageHeaderContainer;
    @BindView(2131496920)
    AppBarLayout mScrollLayout;
    @BindView(2131497604)
    NormalTitleBar mTitleBar;
    @BindView(2131498538)
    ViewPager mViewPager;

    public boolean checkStatus(String str) {
        return true;
    }

    public final String f() {
        return "";
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3354a, false, 49535, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3354a, false, 49535, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final Bitmap d() {
        return this.h;
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f3354a, false, 49533, new Class[0], Integer.TYPE)) {
            return this.f3358e.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49533, new Class[0], Integer.TYPE)).intValue();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49526, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        c.b(this, 0);
        if (isTaskRoot() && this.m) {
            h.a().a((Activity) this, "aweme://main");
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49525, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f3355b != null && this.f3355b.isShowing()) {
            this.f3355b.dismiss();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49524, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49523, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    private void c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49516, new Class[0], Void.TYPE);
            return;
        }
        int d2 = this.i.d(this.l);
        if (this.i.c(d2) != this.l && this.l >= 0 && this.l < k.length) {
            a.c((Context) this, k[this.l]).a();
        }
        if (d2 >= 0) {
            i2 = d2;
        }
        this.mViewPager.setCurrentItem(i2);
        if (this.i.getItem(i2) != null) {
            ((BaseRankingListFragment) this.i.getItem(i2)).f49756e = true;
        }
    }

    private boolean a() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49515, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49515, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Intent intent = getIntent();
        if (intent == null) {
            this.l = 0;
        }
        String stringExtra = intent.getStringExtra("music_id");
        String stringExtra2 = intent.getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            try {
                this.l = Integer.parseInt(intent.getStringExtra("type"));
                if (this.l == 2) {
                    if (AbTestManager.a().ay()) {
                        if (PatchProxy.isSupport(new Object[0], null, d.f42331a, true, 36318, new Class[0], Boolean.TYPE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, d.f42331a, true, 36318, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (d.f42332b == null) {
                                d.f42332b = (Boolean) SharePrefCache.inst().getIsHotSearchMusicalBillboardEnable().c();
                            }
                            z3 = d.f42332b.booleanValue();
                        }
                        if (z3) {
                            RankingListMusicActivity.a(this, intent.getStringExtra("edition_uid"));
                        } else {
                            a.c((Context) this, (int) C0906R.string.cn6).a();
                        }
                        return true;
                    }
                } else if (this.l == 4) {
                    if (AbTestManager.a().ay()) {
                        if (PatchProxy.isSupport(new Object[0], null, d.f42331a, true, 36321, new Class[0], Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, d.f42331a, true, 36321, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (d.f42334d == null) {
                                d.f42334d = (Boolean) x.a().W().c();
                            }
                            z2 = d.f42334d.booleanValue();
                        }
                        if (z2) {
                            h a2 = h.a();
                            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.discover.hitrank.c.f42384a, true, 36394, new Class[0], String.class)) {
                                str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.discover.hitrank.c.f42384a, true, 36394, new Class[0], String.class);
                            } else {
                                str = com.ss.android.ugc.aweme.discover.hitrank.c.a(null, null, null, 7);
                            }
                            a2.a(str);
                        } else {
                            a.c((Context) this, (int) C0906R.string.cn8).a();
                        }
                        return true;
                    }
                    this.l = 0;
                    return false;
                } else if (this.l == 1) {
                    if (PatchProxy.isSupport(new Object[0], null, d.f42331a, true, 36319, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, d.f42331a, true, 36319, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        if (d.f42333c == null) {
                            d.f42333c = (Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().c();
                        }
                        z = d.f42333c.booleanValue();
                    }
                    if (z) {
                        RankingListVideoActivity.a(this, intent.getStringExtra("edition_uid"));
                    } else {
                        a.c((Context) this, (int) C0906R.string.cn9).a();
                    }
                    return true;
                }
            } catch (NumberFormatException unused) {
                this.l = 0;
            }
        } else if (AbTestManager.a().ay()) {
            RankingListMusicActivity.a(this, null);
            return true;
        } else {
            this.l = 2;
        }
        return false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49529, new Class[0], Void.TYPE);
            return;
        }
        ck ckVar = new ck();
        BaseRankingListFragment baseRankingListFragment = (BaseRankingListFragment) this.i.a(this.mViewPager.getCurrentItem());
        if (baseRankingListFragment != null) {
            ShareInfo f2 = baseRankingListFragment.f();
            if (f2 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(2);
                int currentItem = this.mViewPager.getCurrentItem();
                int c2 = this.i.c(currentItem);
                HotSearchRankingShareDialog hotSearchRankingShareDialog = r1;
                HotSearchRankingShareDialog hotSearchRankingShareDialog2 = new HotSearchRankingShareDialog(this, f2, ckVar, c2, true, countDownLatch, this);
                this.f3355b = hotSearchRankingShareDialog;
                this.f3355b.setActionHandler(this);
                this.f3355b.setShareCallback(this);
                IShareService.ShareStruct a2 = i.a((Context) this, f2, "");
                if (PatchProxy.isSupport(new Object[]{countDownLatch, Integer.valueOf(currentItem), Integer.valueOf(c2)}, this, f3354a, false, 49528, new Class[]{CountDownLatch.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{countDownLatch, Integer.valueOf(currentItem), Integer.valueOf(c2)}, this, f3354a, false, 49528, new Class[]{CountDownLatch.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    this.h = this.f3356c.get(Integer.valueOf(currentItem));
                    if (this.h != null) {
                        countDownLatch.countDown();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        BaseRankingListFragment baseRankingListFragment2 = (BaseRankingListFragment) this.i.a(this.mViewPager.getCurrentItem());
                        if (baseRankingListFragment2 != null) {
                            RecyclerView h2 = baseRankingListFragment2.h();
                            LruCache lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
                            a.i a3 = a.i.a((Callable<TResult>) new b<TResult>(this, h2, arrayList, c2)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(arrayList, lruCache), a.i.f1052b);
                            d dVar = new d(this, h2, lruCache, currentItem, countDownLatch);
                            a3.c(dVar, a.i.f1051a);
                        }
                    }
                }
                switch (c2) {
                    case 0:
                        a2.awemeType = 1801;
                        break;
                    case 1:
                        a2.awemeType = 1802;
                        break;
                    case 2:
                        a2.awemeType = 1803;
                        break;
                    case 3:
                        a2.awemeType = PushConstants.DOWN_LOAD_LARGE_ICON_SUCCESS;
                        break;
                }
                if (a2.extraParams == null) {
                    a2.extraParams = new HashMap<>();
                }
                a2.extraParams.put("update_time", baseRankingListFragment.g());
                this.f3355b.updateShareStruct(a2);
                this.j = b.a(this.f3355b, this, a2, true, false, this.f3355b);
                if (this.j != null) {
                    this.f3355b.r = this.j;
                }
                this.f3355b.setOnShowListener(new e(this));
                this.f3355b.setOnKeyListener(new DialogInterface.OnKeyListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49631a;

                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f49631a, false, 49550, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f49631a, false, 49550, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (i != 4 || RankingListActivity.this.j == null) {
                            return false;
                        } else {
                            return RankingListActivity.this.j.b();
                        }
                    }
                });
                if (!this.f3355b.isShowing()) {
                    try {
                        this.f3355b.show();
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(e2.getMessage() + getClass().getSimpleName()));
                    }
                }
            }
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f3354a, true, 49507, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f3354a, true, 49507, new Class[]{Context.class}, Void.TYPE);
        } else if (context2 != null) {
            Intent intent = new Intent();
            intent.setClass(context2, RankingListActivity.class);
            context2.startActivity(intent);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3354a, false, 49534, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3354a, false, 49534, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("ranking", gVar.itemType)) {
            dv.a(this, this.mScrollLayout, gVar);
        }
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f3354a, false, 49517, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f3354a, false, 49517, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        if (!a()) {
            c();
        }
    }

    public final void a(int i2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3354a, false, 49522, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3354a, false, 49522, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < this.mAwemeViewPagerNavigator.getTabCount(); i3++) {
            View a2 = this.mAwemeViewPagerNavigator.a(i3);
            if (a2 instanceof com.ss.android.ugc.aweme.hotsearch.a.c) {
                TextView title = ((com.ss.android.ugc.aweme.hotsearch.a.c) a2).getTitle();
                if (title != null) {
                    TextPaint paint = title.getPaint();
                    if (i3 == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    paint.setFakeBoldText(z);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v70, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 49512(0xc168, float:6.9381E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49512(0xc168, float:6.9381E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.hotsearch.RankingListActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r18)
            boolean r0 = r17.a()
            if (r0 == 0) goto L_0x0053
            r7.m = r9
            r17.finish()
            java.lang.String r0 = "com.ss.android.ugc.aweme.hotsearch.RankingListActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x0053:
            r17.requestDisableOptimizeViewHierarchy()
            r0 = 2131689570(0x7f0f0062, float:1.900816E38)
            r7.setContentView((int) r0)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r1 = "enter_animation"
            int r0 = r0.getIntExtra(r1, r9)
            if (r0 != r8) goto L_0x006d
            r0 = 4
            com.ss.android.ugc.aweme.base.activity.c.a(r7, r0)
            goto L_0x0070
        L_0x006d:
            com.ss.android.ugc.aweme.base.activity.c.a(r7, r9)
        L_0x0070:
            butterknife.ButterKnife.bind((android.app.Activity) r17)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49513(0xc169, float:6.9382E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49513(0xc169, float:6.9382E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x037c
        L_0x009a:
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r0 = r7.mTitleBar
            com.ss.android.ugc.aweme.hotsearch.RankingListActivity$1 r1 = new com.ss.android.ugc.aweme.hotsearch.RankingListActivity$1
            r1.<init>()
            r0.setOnTitleBarClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49518(0xc16e, float:6.939E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ce
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49518(0xc16e, float:6.939E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x0191
        L_0x00ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.ss.android.ugc.aweme.hotsearch.fragment.RankingListWordFragment> r1 = com.ss.android.ugc.aweme.hotsearch.fragment.RankingListWordFragment.class
            r2 = 2131561981(0x7f0d0dfd, float:1.8749378E38)
            java.lang.String r2 = r7.getString(r2)
            com.ss.android.ugc.aweme.discover.base.h r1 = com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter.a(r1, r2, r9)
            r0.add(r1)
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.hotsearch.d.a.f49720a
            r13 = 1
            r14 = 49803(0xc28b, float:6.9789E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0110
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.hotsearch.d.a.f49720a
            r13 = 1
            r14 = 49803(0xc28b, float:6.9789E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0122
        L_0x0110:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getIsHotSearchPositiveEnergyBillboardEnable()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
        L_0x0122:
            if (r1 == 0) goto L_0x0135
            java.lang.Class<com.ss.android.ugc.aweme.hotsearch.fragment.RankingListVideoFragment> r1 = com.ss.android.ugc.aweme.hotsearch.fragment.RankingListVideoFragment.class
            r2 = 2131561979(0x7f0d0dfb, float:1.8749374E38)
            java.lang.String r2 = r7.getString(r2)
            r3 = 3
            com.ss.android.ugc.aweme.discover.base.h r1 = com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter.a(r1, r2, r3)
            r0.add(r1)
        L_0x0135:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.hotsearch.d.a.f49720a
            r13 = 1
            r14 = 49804(0xc28c, float:6.979E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0162
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.hotsearch.d.a.f49720a
            r13 = 1
            r14 = 49804(0xc28c, float:6.979E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r15 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0174
        L_0x0162:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getIsHotSearchMusicalBillboardEnable()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
        L_0x0174:
            if (r1 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.ay()
            if (r1 != 0) goto L_0x0191
            java.lang.Class<com.ss.android.ugc.aweme.hotsearch.fragment.RankingListMusicFragment> r1 = com.ss.android.ugc.aweme.hotsearch.fragment.RankingListMusicFragment.class
            r2 = 2131561978(0x7f0d0dfa, float:1.8749372E38)
            java.lang.String r2 = r7.getString(r2)
            r3 = 2
            com.ss.android.ugc.aweme.discover.base.h r1 = com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter.a(r1, r2, r3)
            r0.add(r1)
        L_0x0191:
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r1 = new com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter
            android.support.v4.app.FragmentManager r2 = r17.getSupportFragmentManager()
            r1.<init>(r2, r0)
            r7.i = r1
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r1 = r7.i
            int r1 = r1.getCount()
            int r1 = r1 - r8
            r0.setOffscreenPageLimit(r1)
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r1 = r7.i
            r0.setAdapter(r1)
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.hotsearch.RankingListActivity$2 r1 = new com.ss.android.ugc.aweme.hotsearch.RankingListActivity$2
            r1.<init>()
            r0.addOnPageChangeListener(r1)
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r0 = r7.mAwemeViewPagerNavigator
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131624880(0x7f0e03b0, float:1.8876952E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r0 = r7.mAwemeViewPagerNavigator
            android.support.v4.view.ViewPager r1 = r7.mViewPager
            com.ss.android.ugc.aweme.hotsearch.a.b r2 = new com.ss.android.ugc.aweme.hotsearch.a.b
            r2.<init>()
            com.ss.android.ugc.aweme.hotsearch.RankingListActivity$3 r3 = new com.ss.android.ugc.aweme.hotsearch.RankingListActivity$3
            r3.<init>()
            r0.a((android.support.v4.view.ViewPager) r1, (com.ss.android.ugc.aweme.views.l) r2, (com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a) r3)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49514(0xc16a, float:6.9384E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0200
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49514(0xc16a, float:6.9384E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x022b
        L_0x0200:
            int r0 = com.bytedance.common.utility.UIUtils.getScreenWidth(r17)
            float r0 = (float) r0
            r1 = 1055100473(0x3ee38e39, float:0.44444445)
            float r0 = r0 * r1
            android.content.Context r1 = com.ss.android.ugc.aweme.app.k.g()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131427990(0x7f0b0296, float:1.8477612E38)
            int r1 = r1.getDimensionPixelSize(r2)
            float r1 = (float) r1
            float r0 = r0 + r1
            int r0 = (int) r0
            android.support.design.widget.AppBarLayout r1 = r7.mScrollLayout
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$LayoutParams r1 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r1
            r1.height = r0
            android.support.design.widget.AppBarLayout r0 = r7.mScrollLayout
            r0.setLayoutParams(r1)
        L_0x022b:
            android.support.design.widget.AppBarLayout r0 = r7.mScrollLayout
            com.ss.android.ugc.aweme.hotsearch.RankingListActivity$4 r1 = new com.ss.android.ugc.aweme.hotsearch.RankingListActivity$4
            r1.<init>()
            r0.addOnOffsetChangedListener((android.support.design.widget.AppBarLayout.OnOffsetChangedListener) r1)
            r17.c()
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r0 = r7.mTitleBar
            r0.showDividerLine(r9)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49520(0xc170, float:6.9392E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0263
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49520(0xc170, float:6.9392E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0296
        L_0x0263:
            boolean r0 = com.ss.android.ugc.aweme.hotsearch.d.a.a()
            if (r0 == 0) goto L_0x0296
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r0 = r7.i
            if (r0 == 0) goto L_0x0296
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getIsShowHotSearchVideoTip()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0296
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r0 = r7.mAwemeViewPagerNavigator
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r1 = r7.i
            int r1 = r1.d(r8)
            android.view.View r0 = r0.a(r1)
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.hotsearch.a.c
            if (r1 == 0) goto L_0x0296
            com.ss.android.ugc.aweme.hotsearch.a.c r0 = (com.ss.android.ugc.aweme.hotsearch.a.c) r0
            r0.setTitleTipVisibility(r9)
        L_0x0296:
            android.util.LruCache r0 = new android.util.LruCache
            com.ss.android.ugc.aweme.hotsearch.adapter.HotSearchRankingPagerAdapter r1 = r7.i
            int r1 = r1.getCount()
            r0.<init>(r1)
            r7.f3356c = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49521(0xc171, float:6.9394E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ca
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49521(0xc171, float:6.9394E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x037c
        L_0x02ca:
            com.ss.android.ugc.aweme.commercialize.model.f r0 = com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.a()
            if (r0 == 0) goto L_0x0375
            com.ss.android.ugc.aweme.commercialize.model.f$b r1 = r0.f39381b
            if (r1 == 0) goto L_0x0375
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r1 = r1.bv()
            if (r1 != 0) goto L_0x02e0
            goto L_0x0375
        L_0x02e0:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.mImageHeader
            com.ss.android.ugc.aweme.commercialize.model.f$b r2 = r0.f39381b
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.f39385a
            com.ss.android.ugc.aweme.hotsearch.RankingListActivity$5 r3 = new com.ss.android.ugc.aweme.hotsearch.RankingListActivity$5
            r3.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.e.b(r1, r2, r3)
            android.view.View r1 = r7.mImageHeaderAd
            r1.setVisibility(r9)
            android.view.View r1 = r7.mImageHeaderAd
            com.ss.android.ugc.aweme.hotsearch.a r2 = new com.ss.android.ugc.aweme.hotsearch.a
            r2.<init>(r7, r0)
            r1.setOnClickListener(r2)
            int r0 = com.bytedance.ies.dmt.ui.e.a.f20353a
            if (r0 != 0) goto L_0x0337
            java.lang.String r0 = "window"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L_0x031f
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r1)
            int r0 = r1.x
            com.bytedance.ies.dmt.ui.e.a.f20353a = r0
            int r0 = r1.y
            com.bytedance.ies.dmt.ui.e.a.f20354b = r0
        L_0x031f:
            int r0 = com.bytedance.ies.dmt.ui.e.a.f20353a
            if (r0 == 0) goto L_0x0327
            int r0 = com.bytedance.ies.dmt.ui.e.a.f20354b
            if (r0 != 0) goto L_0x0337
        L_0x0327:
            android.content.res.Resources r0 = r17.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            com.bytedance.ies.dmt.ui.e.a.f20353a = r1
            int r0 = r0.heightPixels
            com.bytedance.ies.dmt.ui.e.a.f20354b = r0
        L_0x0337:
            int r0 = com.bytedance.ies.dmt.ui.e.a.f20353a
            float r1 = (float) r0
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r7.mImageHeader
            float r2 = r2.getAspectRatio()
            float r1 = r1 / r2
            int r1 = (int) r1
            android.view.View r2 = r7.mImageHeaderAd
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r0 * 192
            int r3 = r3 / 720
            r2.width = r3
            int r3 = r1 * 64
            int r3 = r3 / 320
            r2.height = r3
            int r1 = r1 * 70
            int r1 = r1 / 320
            r2.topMargin = r1
            int r0 = r0 * 144
            int r0 = r0 / 720
            r2.rightMargin = r0
            android.view.View r0 = r7.mImageHeaderAd
            r0.setLayoutParams(r2)
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x037c
            android.view.View r0 = r7.mImageHeaderAd
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.setBackgroundColor(r1)
            goto L_0x037c
        L_0x0375:
            android.view.View r0 = r7.mImageHeaderAd
            r1 = 8
            r0.setVisibility(r1)
        L_0x037c:
            java.lang.String r0 = "com.ss.android.ugc.aweme.hotsearch.RankingListActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.RankingListActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r9.equals("weixin_moments") != false) goto L_0x00bc;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 49532(0xc17c, float:6.9409E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49532(0xc17c, float:6.9409E-41)
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
            java.lang.String r0 = ""
            int r1 = r8.awemeType
            r2 = 2301(0x8fd, float:3.224E-42)
            if (r1 == r2) goto L_0x0060
            switch(r1) {
                case 1801: goto L_0x005d;
                case 1802: goto L_0x005a;
                case 1803: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r13 = r0
            goto L_0x0063
        L_0x0057:
            java.lang.String r0 = "music"
            goto L_0x0055
        L_0x005a:
            java.lang.String r0 = "video"
            goto L_0x0055
        L_0x005d:
            java.lang.String r0 = "general"
            goto L_0x0055
        L_0x0060:
            java.lang.String r0 = "politic"
            goto L_0x0055
        L_0x0063:
            r0 = -1
            int r1 = r16.hashCode()
            switch(r1) {
                case -1322993519: goto L_0x00b1;
                case -929929834: goto L_0x00a8;
                case -791575966: goto L_0x009e;
                case 3616: goto L_0x0094;
                case 3059573: goto L_0x008a;
                case 3357525: goto L_0x0080;
                case 108102557: goto L_0x0076;
                case 113011944: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x00bb
        L_0x006c:
            java.lang.String r1 = "weibo"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 3
            goto L_0x00bc
        L_0x0076:
            java.lang.String r1 = "qzone"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 5
            goto L_0x00bc
        L_0x0080:
            java.lang.String r1 = "more"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 6
            goto L_0x00bc
        L_0x008a:
            java.lang.String r1 = "copy"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 7
            goto L_0x00bc
        L_0x0094:
            java.lang.String r1 = "qq"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 4
            goto L_0x00bc
        L_0x009e:
            java.lang.String r1 = "weixin"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 1
            goto L_0x00bc
        L_0x00a8:
            java.lang.String r1 = "weixin_moments"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00b1:
            java.lang.String r1 = "chat_merge"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00bb
            r10 = 0
            goto L_0x00bc
        L_0x00bb:
            r10 = -1
        L_0x00bc:
            switch(r10) {
                case 0: goto L_0x0156;
                case 1: goto L_0x0153;
                case 2: goto L_0x0150;
                case 3: goto L_0x014d;
                case 4: goto L_0x014a;
                case 5: goto L_0x0147;
                case 6: goto L_0x0144;
                case 7: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            return r11
        L_0x00c0:
            java.lang.String r10 = "copy_link"
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49530(0xc17a, float:6.9406E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3354a
            r3 = 0
            r4 = 49530(0xc17a, float:6.9406E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x016a
        L_0x00f3:
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r14.getSystemService(r0)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            if (r8 == 0) goto L_0x016a
            java.lang.String r1 = r8.description
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x016a
            java.lang.String r1 = r8.url
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x016a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.description
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = ""
            goto L_0x011f
        L_0x011d:
            java.lang.String r2 = r8.description
        L_0x011f:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r8.url
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r1)
            if (r0 == 0) goto L_0x0139
            r0.setPrimaryClip(r1)
        L_0x0139:
            r0 = 2131559505(0x7f0d0451, float:1.8744356E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r14, (int) r0)
            r0.a()
            goto L_0x016a
        L_0x0144:
            java.lang.String r10 = "more"
            goto L_0x016a
        L_0x0147:
            java.lang.String r10 = "qzone"
            goto L_0x016a
        L_0x014a:
            java.lang.String r10 = "qq"
            goto L_0x016a
        L_0x014d:
            java.lang.String r10 = "weibo"
            goto L_0x016a
        L_0x0150:
            java.lang.String r10 = "WEIXIN_MOMENTS"
            goto L_0x016a
        L_0x0153:
            java.lang.String r10 = "weixin"
            goto L_0x016a
        L_0x0156:
            java.lang.String r10 = "chat_merge"
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "share_struct"
            r0.putSerializable(r1, r15)
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.b.a()
            r2 = 0
            r1.enterChooseContact(r14, r0, r2)
        L_0x016a:
            boolean r0 = com.ss.android.ugc.aweme.share.cg.b(r16)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "shaped_qr_code"
            goto L_0x0175
        L_0x0173:
            java.lang.String r0 = "normal_share"
        L_0x0175:
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.RankingListActivity.onAction(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String):boolean");
    }

    public final void a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f3354a, false, 49519, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f3354a, false, 49519, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.hotsearch.d.a.a() && this.i != null && this.i.c(i2) == 1 && (view instanceof com.ss.android.ugc.aweme.hotsearch.a.c)) {
            ((com.ss.android.ugc.aweme.hotsearch.a.c) view).setTitleTipVisibility(8);
            SharePrefCache.inst().getIsShowHotSearchVideoTip().a(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer a(RecyclerView recyclerView, List list, int i2) throws Exception {
        boolean z;
        int i3;
        int i4;
        Runnable runnable;
        Bitmap bitmap;
        int i5 = i2;
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.l, com.ss.android.experiencekit.c.d.BEGIN);
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[0], this, f3354a, false, 49527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3354a, false, 49527, new Class[0], Void.TYPE);
        } else if (this.f3357d == null || this.f3358e == null) {
            this.mImageHeader.destroyDrawingCache();
            this.mImageHeader.setDrawingCacheEnabled(true);
            this.mImageHeader.buildDrawingCache();
            Bitmap drawingCache = this.mImageHeader.getDrawingCache();
            if (drawingCache != null) {
                View findViewById = getWindow().getDecorView().findViewById(C0906R.id.ap3);
                if (findViewById != null) {
                    int width = findViewById.getWidth();
                    int height = findViewById.getHeight();
                    if (((Integer) x.a().D().c()).intValue() == 0) {
                        bitmap = BitmapFactory.decodeResource(getResources(), 2130840431).copy(Bitmap.Config.RGB_565, true);
                    } else {
                        bitmap = BitmapFactory.decodeResource(getResources(), 2130840432).copy(Bitmap.Config.RGB_565, true);
                    }
                    int height2 = (drawingCache.getHeight() * width) / drawingCache.getWidth();
                    this.f3357d = f.a(drawingCache, height2, width);
                    int height3 = (bitmap.getHeight() * width) / bitmap.getWidth();
                    this.f3358e = f.a(bitmap, height3, width);
                    int i6 = height2 + height;
                    WindowManager windowManager = getWindowManager();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    this.f3359f = displayMetrics.heightPixels;
                    this.g = (this.f3359f - i6) - height3;
                }
            }
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            CountDownLatch countDownLatch = new CountDownLatch(itemCount - 2);
            int i7 = 0;
            int i8 = 0;
            while (i7 < itemCount) {
                RecyclerView.ViewHolder createViewHolder = adapter.createViewHolder(recyclerView, adapter.getItemViewType(i7));
                boolean z3 = createViewHolder instanceof com.ss.android.ugc.aweme.hotsearch.viewholder.a;
                if (z3) {
                    ((com.ss.android.ugc.aweme.hotsearch.viewholder.a) createViewHolder).c_(z2);
                }
                list.add(createViewHolder);
                if ((i5 == z2 || i5 == 3) && (createViewHolder instanceof RankingListVideoItemViewHolder)) {
                    ((RankingListVideoItemViewHolder) createViewHolder).f49935c = countDownLatch;
                }
                adapter.onBindViewHolder(createViewHolder, i7);
                ViewGroup.LayoutParams layoutParams = createViewHolder.itemView.getLayoutParams();
                if (layoutParams.height == -2 || layoutParams.height == -1) {
                    z = true;
                } else {
                    z = false;
                }
                View view = createViewHolder.itemView;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                if (z) {
                    i4 = 0;
                    i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    i4 = 0;
                    i3 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                view.measure(makeMeasureSpec, i3);
                createViewHolder.itemView.layout(i4, i4, createViewHolder.itemView.getMeasuredWidth(), createViewHolder.itemView.getMeasuredHeight());
                i8 += createViewHolder.itemView.getMeasuredHeight();
                if (i5 == 1 || i5 == 3) {
                    createViewHolder.itemView.setDrawingCacheEnabled(true);
                    View view2 = createViewHolder.itemView;
                    view2.getClass();
                    if (PatchProxy.isSupport(new Object[]{view2}, null, f.f49750a, true, 49541, new Class[]{View.class}, Runnable.class)) {
                        Object[] objArr = {view2};
                        Object[] objArr2 = objArr;
                        runnable = (Runnable) PatchProxy.accessDispatch(objArr2, null, f.f49750a, true, 49541, new Class[]{View.class}, Runnable.class);
                    } else {
                        runnable = new f(view2);
                    }
                    runOnUiThread(runnable);
                }
                if (i8 > this.g) {
                    break;
                }
                if (z3) {
                    ((com.ss.android.ugc.aweme.hotsearch.viewholder.a) createViewHolder).c_(false);
                }
                i7++;
                z2 = true;
            }
            int i9 = i7 + 1;
            if (i5 == 1 || i5 == 3) {
                if (i9 < itemCount) {
                    for (int i10 = i9; i10 < itemCount - 1; i10++) {
                        countDownLatch.countDown();
                    }
                }
                try {
                    countDownLatch.await();
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
            return Integer.valueOf(i9);
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.l, com.ss.android.experiencekit.c.d.END);
        return null;
    }
}
