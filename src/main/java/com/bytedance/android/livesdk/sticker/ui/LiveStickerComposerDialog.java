package com.bytedance.android.livesdk.sticker.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;

public final class LiveStickerComposerDialog extends Dialog implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17336a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17337b;

    /* renamed from: c  reason: collision with root package name */
    final DataCenter f17338c;

    /* renamed from: d  reason: collision with root package name */
    LoadingStatusView f17339d;

    /* renamed from: e  reason: collision with root package name */
    RtlViewPager f17340e;

    /* renamed from: f  reason: collision with root package name */
    public LivePagerSlidingTabStrip f17341f;
    public List<EffectCategoryResponse> g;
    DialogInterface.OnDismissListener h;
    private LiveStickerComposerPageAdapter i;

    class StickerOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17345a;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        StickerOnPageChangeListener() {
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17345a, false, 13477, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17345a, false, 13477, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            EffectCategoryResponse effectCategoryResponse = LiveStickerComposerDialog.this.g.get(i);
            LiveStickerComposerDialog.this.f17337b.a(effectCategoryResponse.id, effectCategoryResponse.tagsUpdateTime, (p) new l(this, effectCategoryResponse, i));
            com.bytedance.android.livesdk.j.a.a().a("pm_live_sticker_tab_change", new j().b("live_take").f("other").a("live_take_detail"), new k(), Room.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17336a, false, 13468, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17336a, false, 13468, new Class[0], Void.TYPE);
            return;
        }
        this.f17339d.d();
    }

    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f17336a, false, 13465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17336a, false, 13465, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f17337b.a(a.f17262c, this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f17338c.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        if (this.i != null) {
            LiveStickerComposerPageAdapter liveStickerComposerPageAdapter = this.i;
            if (PatchProxy.isSupport(new Object[]{0, null}, liveStickerComposerPageAdapter, LiveStickerComposerPageAdapter.f17368e, false, 13502, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                LiveStickerComposerPageAdapter liveStickerComposerPageAdapter2 = liveStickerComposerPageAdapter;
                PatchProxy.accessDispatch(new Object[]{0, null}, liveStickerComposerPageAdapter2, LiveStickerComposerPageAdapter.f17368e, false, 13502, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            liveStickerComposerPageAdapter.a(0, null);
        }
    }

    public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.h = onDismissListener;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17336a, false, 13464, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f17336a, false, 13464, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agx, null));
        getWindow().setLayout(-1, (int) UIUtils.dip2Px(getContext(), 232.0f));
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.f17339d = (LoadingStatusView) findViewById(C0906R.id.cvd);
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ani, null, false);
        inflate.setOnClickListener(new h(this));
        this.f17339d.setBuilder(LoadingStatusView.a.a(getContext()).a(getContext().getResources().getDimensionPixelSize(C0906R.dimen.ms)).c(inflate));
        this.f17341f = (LivePagerSlidingTabStrip) findViewById(C0906R.id.cz6);
        this.f17340e = (RtlViewPager) findViewById(C0906R.id.cvm);
        findViewById(C0906R.id.ng).setOnClickListener(new i(this));
        this.f17339d.setVisibility(0);
        this.f17341f.setVisibility(4);
        this.f17340e.setVisibility(4);
        setOnDismissListener(new j(this));
    }

    public final void a(EffectChannelResponse effectChannelResponse) {
        com.bytedance.android.livesdk.sticker.b.a aVar;
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f17336a, false, 13467, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f17336a, false, 13467, new Class[]{EffectChannelResponse.class}, Void.TYPE);
        } else if (effectChannelResponse == null || Lists.isEmpty(effectChannelResponse.categoryResponseList)) {
            this.f17339d.c();
        } else {
            this.f17339d.setVisibility(4);
            this.f17341f.setVisibility(0);
            this.f17340e.setVisibility(0);
            this.g = effectChannelResponse.categoryResponseList;
            if (this.i == null) {
                if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f17336a, false, 13470, new Class[]{EffectChannelResponse.class}, com.bytedance.android.livesdk.sticker.b.a.class)) {
                    aVar = (com.bytedance.android.livesdk.sticker.b.a) PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f17336a, false, 13470, new Class[]{EffectChannelResponse.class}, com.bytedance.android.livesdk.sticker.b.a.class);
                } else {
                    Iterator<EffectCategoryResponse> it2 = effectChannelResponse.categoryResponseList.iterator();
                    loop0:
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        EffectCategoryResponse next = it2.next();
                        if (next == null) {
                            break;
                        }
                        Iterator<Effect> it3 = next.totalEffects.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Effect next2 = it3.next();
                                Iterator<com.bytedance.android.livesdk.sticker.b.a> it4 = com.bytedance.android.livesdk.v.j.q().o().a(a.f17262c).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        com.bytedance.android.livesdk.sticker.b.a next3 = it4.next();
                                        if (next3.a(h.a(next2))) {
                                            aVar = next3;
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    aVar = null;
                }
                this.i = new LiveStickerComposerPageAdapter(getContext(), aVar, this.f17337b);
                this.f17340e.setAdapter(this.i);
                this.i.a(this.g);
                this.i.f17369f = new k(this);
                this.f17341f.setOnPageChangeListener(new StickerOnPageChangeListener());
                this.f17341f.setViewPager(this.f17340e);
            } else {
                this.i.a(this.g);
            }
            this.f17340e.setCurrentItem(((Integer) b.ah.a()).intValue());
            if (PatchProxy.isSupport(new Object[0], this, f17336a, false, 13469, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17336a, false, 13469, new Class[0], Void.TYPE);
                return;
            }
            for (final int i2 = 0; i2 < this.g.size(); i2++) {
                a(this.g.get(i2), new m() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17342a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f17342a, false, 13475, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f17342a, false, 13475, new Class[0], Void.TYPE);
                            return;
                        }
                        LiveStickerComposerDialog.this.f17341f.a(i2);
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f17342a, false, 13476, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f17342a, false, 13476, new Class[0], Void.TYPE);
                            return;
                        }
                        LiveStickerComposerDialog.this.f17341f.b(i2);
                    }
                });
            }
        }
    }

    public final void a(EffectCategoryResponse effectCategoryResponse, m mVar) {
        EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{effectCategoryResponse2, mVar2}, this, f17336a, false, 13466, new Class[]{EffectCategoryResponse.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryResponse2, mVar2}, this, f17336a, false, 13466, new Class[]{EffectCategoryResponse.class, m.class}, Void.TYPE);
        } else if (effectCategoryResponse2 == null || Lists.isEmpty(effectCategoryResponse2.tags) || !effectCategoryResponse2.tags.contains("new")) {
            mVar.b();
        } else {
            this.f17337b.a(effectCategoryResponse2.id, effectCategoryResponse2.tagsUpdateTime, mVar2);
        }
    }

    public LiveStickerComposerDialog(@NonNull Context context, DataCenter dataCenter, a aVar) {
        super(context, C0906R.style.w7);
        this.f17337b = aVar;
        this.f17338c = dataCenter;
    }
}
