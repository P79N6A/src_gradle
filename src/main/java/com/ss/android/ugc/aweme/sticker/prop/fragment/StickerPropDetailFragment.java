package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.net.y;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.aweme.sticker.prop.adapter.StickerPropFragmentAdapter;
import com.ss.android.ugc.aweme.sticker.prop.b.a;
import com.ss.android.ugc.aweme.sticker.prop.fragment.i;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;

public class StickerPropDetailFragment extends AbstractBaseDetailFragment implements IShareService.IActionHandler, IShareService.OnShareCallback, i {
    public static ChangeQuickRedirect v;
    public boolean A = false;
    private StickerPropFragmentAdapter B;
    private String C;
    private String D;
    private a E;
    private String F;
    private e G;
    private com.ss.android.ugc.aweme.sticker.prop.adapter.a H;
    private float I;
    private float J;
    private IShareService.SharePage K;
    private IShareService.ShareStruct L;
    private bv M;
    private String N;
    private com.ss.android.ugc.aweme.shortvideo.e O;
    private Serializable P;
    private List<String> Q;
    private s<g> R = new s<g>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71685a;

        /* renamed from: b  reason: collision with root package name */
        g f71686b;

        public final /* synthetic */ Object get() {
            if (PatchProxy.isSupport(new Object[0], this, f71685a, false, 82052, new Class[0], g.class)) {
                return (g) PatchProxy.accessDispatch(new Object[0], this, f71685a, false, 82052, new Class[0], g.class);
            }
            if (this.f71686b == null) {
                this.f71686b = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(StickerPropDetailFragment.this.getContext(), com.ss.android.ugc.aweme.language.e.b(), y.a().b());
            }
            return this.f71686b;
        }
    };
    private long S = -1;
    private boolean T = false;
    @BindView(2131497348)
    RemoteImageView coverImgView;
    @BindView(2131497343)
    GridView gridView;
    @BindView(2131494792)
    ImageView imgToRecord;
    @BindView(2131497347)
    CheckableImageView ivCollect;
    @BindView(2131494180)
    ImageView ivDisclaimer;
    @BindView(2131497349)
    RemoteImageView lockImageView;
    @BindView(2131492994)
    TextView mAdNickNameTv;
    @BindView(2131493000)
    View mAdOwnerLL;
    @BindView(2131493128)
    View mArrowImg;
    @BindView(2131493263)
    RemoteImageView mBgCover;
    @BindView(2131493333)
    View mBottomLineView;
    @BindView(2131497346)
    View mCollectView;
    @BindView(2131494572)
    View mHeadLayout;
    @BindView(2131494812)
    View mInfoView;
    @BindView(2131495268)
    LinearLayout mLayoutStickerUrl;
    @BindView(2131495387)
    ImageView mLinkIconIv;
    @BindView(2131497081)
    ImageView mShareBtn;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131495306)
    ViewGroup mStickerOwnerProfileView;
    @BindView(2131495166)
    RemoteImageView mStickerPropActImgView;
    @BindView(2131495167)
    RemoteImageView mStickerPropActImgView_i18n;
    @BindView(2131497518)
    TextView mTextStickerInfo;
    @BindView(2131497519)
    TextView mTextStickerUrl;
    @BindView(2131497664)
    View mTopLineView;
    @BindView(2131494179)
    LinearLayout mVpExpandContainer;
    @BindView(2131498026)
    TextView nickNameTextView;
    @BindView(2131497350)
    TextView titleTextView;
    @BindView(2131498170)
    DmtTextView tvCollect;
    @BindView(2131494181)
    TextView txtDisclaimer;
    @BindView(2131498339)
    TextView usedCountTextView;
    public d w;
    String x;
    String y;
    public s<IStickerUtilsService> z = new s<IStickerUtilsService>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71688a;

        /* renamed from: b  reason: collision with root package name */
        IStickerUtilsService f71689b;

        public final /* synthetic */ Object get() {
            if (PatchProxy.isSupport(new Object[0], this, f71688a, false, 82053, new Class[0], IStickerUtilsService.class)) {
                return (IStickerUtilsService) PatchProxy.accessDispatch(new Object[0], this, f71688a, false, 82053, new Class[0], IStickerUtilsService.class);
            }
            if (this.f71689b == null) {
                this.f71689b = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
            }
            return this.f71689b;
        }
    };

    public final String d() {
        return "prop_page";
    }

    public final void e() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void a(boolean z2) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 82006, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 82006, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            if (this.mCollectView != null) {
                this.mCollectView.setEnabled(!z2);
                if (com.ss.android.g.a.b()) {
                    if (z2) {
                        this.mCollectView.setAlpha(0.34f);
                    } else {
                        this.mCollectView.setAlpha(1.0f);
                    }
                } else if (com.ss.android.g.a.c()) {
                    if (z2) {
                        this.mCollectView.setAlpha(0.2f);
                    } else {
                        this.mCollectView.setAlpha(1.0f);
                    }
                }
            }
            if (this.lockImageView != null) {
                RemoteImageView remoteImageView = this.lockImageView;
                if (!z2) {
                    i = 8;
                }
                remoteImageView.setVisibility(i);
            }
            if (this.imgToRecord != null) {
                this.imgToRecord.setImageResource(z2 ? 2130840580 : 2130838321);
            }
        }
    }

    public final void a(e eVar) {
        String str;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, v, false, 82036, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, v, false, 82036, new Class[]{e.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (eVar2 == null || eVar2.mStickers == null || eVar2.mStickers.size() == 0) {
                this.mStatusView.b(false);
                this.mStatusView.e();
                return;
            }
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, v, false, 82021, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, v, false, 82021, new Class[]{e.class}, Void.TYPE);
            } else {
                this.G = eVar2;
                if (PatchProxy.isSupport(new Object[0], this, v, false, 82010, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, v, false, 82010, new Class[0], Void.TYPE);
                } else {
                    super.e();
                    this.j.setVisibility(8);
                    String str2 = (String) SharePrefCache.inst().getStickerArtlistUrl().c();
                    boolean booleanValue = ((Boolean) SharePrefCache.inst().getStickerArtEntry().c()).booleanValue();
                    try {
                        str = com.ss.android.ugc.aweme.global.config.settings.g.b().bC();
                    } catch (com.bytedance.ies.a unused) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && booleanValue) {
                        j().setVisibility(0);
                        if (PatchProxy.isSupport(new Object[]{str}, this, v, false, 82011, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, v, false, 82011, new Class[]{String.class}, Void.TYPE);
                        } else {
                            j().setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(j().getController())).setControllerListener(new ControllerListener<ImageInfo>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71695a;

                                public final void onFailure(String str, Throwable th) {
                                }

                                public final void onIntermediateImageFailed(String str, Throwable th) {
                                }

                                public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                                }

                                public final void onRelease(String str) {
                                }

                                public final void onSubmit(String str, Object obj) {
                                }

                                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                    ImageInfo imageInfo = (ImageInfo) obj;
                                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f71695a, false, 82057, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f71695a, false, 82057, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                    } else if (StickerPropDetailFragment.this.getContext() != null && imageInfo != null && imageInfo.getWidth() != 0 && imageInfo.getHeight() != 0) {
                                        StickerPropDetailFragment.this.j().setLayoutParams(new FrameLayout.LayoutParams((int) ((UIUtils.dip2Px(StickerPropDetailFragment.this.getContext(), 25.0f) * ((float) imageInfo.getWidth())) / ((float) imageInfo.getHeight())), (int) UIUtils.dip2Px(StickerPropDetailFragment.this.getContext(), 25.0f)));
                                    }
                                }
                            })).setUri(Uri.parse(str)).build());
                        }
                    }
                    j().setOnClickListener(new d(this));
                }
                c(eVar2.mStickers.get(0));
                eVar2.mStickers.get(0).mIsSelect = true;
                if (eVar2.mStickers.size() == 1) {
                    this.gridView.setVisibility(8);
                    this.mTopLineView.setVisibility(8);
                } else {
                    this.gridView.setVisibility(0);
                    this.mTopLineView.setVisibility(0);
                    com.ss.android.ugc.aweme.sticker.prop.adapter.a aVar = this.H;
                    List<d> list = eVar2.mStickers;
                    if (PatchProxy.isSupport(new Object[]{list}, aVar, com.ss.android.ugc.aweme.sticker.prop.adapter.a.f71667a, false, 81997, new Class[]{List.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.sticker.prop.adapter.a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{list}, aVar2, com.ss.android.ugc.aweme.sticker.prop.adapter.a.f71667a, false, 81997, new Class[]{List.class}, Void.TYPE);
                    } else if (!(list == null || list.size() == 0)) {
                        aVar.f71668b.clear();
                        aVar.f71668b.addAll(list);
                        aVar.notifyDataSetChanged();
                    }
                    this.gridView.setNumColumns(eVar2.mStickers.size());
                    int dip2Px = (int) UIUtils.dip2Px(getActivity(), 16.0f);
                    int size = eVar2.mStickers.size();
                    this.gridView.setLayoutParams(new LinearLayout.LayoutParams((((int) UIUtils.dip2Px(getActivity(), 42.0f)) * size) + ((size - 1) * dip2Px) + (dip2Px * 2), -2));
                }
            }
            this.mStatusView.b(true);
            if (this.mShareBtn != null) {
                this.mShareBtn.setVisibility(0);
            }
            a(this.A);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, v, false, 82037, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, v, false, 82037, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.a(true);
        }
        if (this.mShareBtn != null) {
            this.mShareBtn.setVisibility(8);
        }
        a(this.A);
    }

    public final String h() {
        if (this.w != null) {
            return this.w.id;
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        this.f3295d.scrollTo(0, -this.f3295d.getCurScrollY());
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 82042, new Class[0], Boolean.TYPE)) {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isHaveLatestTab();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 82042, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final RemoteImageView j() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82023, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, v, false, 82023, new Class[0], RemoteImageView.class);
        } else if (com.ss.android.g.a.a()) {
            return this.mStickerPropActImgView_i18n;
        } else {
            return this.mStickerPropActImgView;
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 82009, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView.c(true)) {
            this.E.a(this.F, 0);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 82040, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.S = System.currentTimeMillis();
        if (com.ss.android.g.a.a()) {
            if (this.T) {
                bv bvVar = this.M;
                if (PatchProxy.isSupport(new Object[0], bvVar, bv.f64837a, false, 73255, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bvVar, bv.f64837a, false, 73255, new Class[0], Void.TYPE);
                } else if (bvVar.p != null) {
                    bvVar.a(bvVar.p, UUID.randomUUID().toString());
                }
                this.T = false;
                this.A = false;
            }
            a(this.A);
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 82027, new Class[0], Void.TYPE);
        } else if (this.w != null) {
            if (!c.d().isLogin()) {
                com.ss.android.ugc.aweme.login.e.a((Activity) getActivity(), "prop_page", "click_favorite_prop", (Bundle) null, (f) new h(this));
                return;
            }
            if (this.w.isFavorite) {
                str = "cancel_favorite_prop";
            } else {
                str = "favourite_prop";
            }
            r.a(str, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "prop_page").a("prop_id", this.w.id).f34114b);
            a aVar = this.E;
            FragmentActivity activity = getActivity();
            d dVar = this.w;
            if (PatchProxy.isSupport(new Object[]{activity, dVar}, aVar, a.f71676a, false, 82075, new Class[]{Context.class, d.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{activity, dVar}, aVar2, a.f71676a, false, 82075, new Class[]{Context.class, d.class}, Void.TYPE);
            } else {
                dVar.isFavorite = !dVar.isFavorite;
                ((g) aVar.f71677b.get()).a("default", Collections.singletonList(dVar.id), Boolean.valueOf(dVar.isFavorite), (n) new n(dVar) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71680a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f71681b;

                    public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f71680a, false, 82079, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f71680a, false, 82079, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                            return;
                        }
                        if (a.this.f2979f != null) {
                            this.f71681b.isFavorite = !this.f71681b.isFavorite;
                            ((i) a.this.f2979f).a(this.f71681b, cVar);
                        }
                    }

                    public final void a(List<String> list) {
                        if (PatchProxy.isSupport(new Object[]{list}, this, f71680a, false, 82078, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, this, f71680a, false, 82078, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        if (a.this.f2979f != null) {
                            ((i) a.this.f2979f).b(this.f71681b);
                        }
                    }

                    {
                        this.f71681b = r2;
                    }
                });
            }
            this.ivCollect.b();
        }
    }

    public void onStop() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 82041, new Class[0], Void.TYPE);
            return;
        }
        if (this.w == null) {
            str = "";
        } else {
            str = this.w.id;
        }
        this.u = -1;
        super.onStop();
        if (this.S != -1) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", str).a("enter_from", "prop_page");
            r.a("stay_time", (Map) a2.a("duration", (System.currentTimeMillis() - this.S)).a("group_id", this.y).a("log_pb", this.x).f34114b);
            this.S = -1;
        }
    }

    public final FragmentPagerAdapter a() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82015, new Class[0], FragmentPagerAdapter.class)) {
            return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, v, false, 82015, new Class[0], FragmentPagerAdapter.class);
        }
        e eVar = this.G;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, v, false, 82016, new Class[]{e.class}, List.class)) {
            List list = (List) PatchProxy.accessDispatch(new Object[]{eVar}, this, v, false, 82016, new Class[]{e.class}, List.class);
        } else {
            this.r = new ArrayList(eVar.mStickers.size() - 1);
            for (d next : eVar.mStickers) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                Object obj = (AbstractBaseDetailFragment.a) childFragmentManager.findFragmentByTag(AbstractBaseDetailFragment.f3293b + next.id);
                if (obj == null) {
                    obj = DetailAwemeListFragment.a(15, "sticker_prop_detail", next.id, this.C);
                }
                if (obj instanceof DetailAwemeListFragment) {
                    DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) obj;
                    if (this.p == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    detailAwemeListFragment.m = z2;
                    detailAwemeListFragment.n = true;
                }
                this.r.add(obj);
            }
            List list2 = this.r;
        }
        ArrayList arrayList = new ArrayList();
        for (AmeBaseFragment add : this.r) {
            arrayList.add(add);
        }
        this.B = new StickerPropFragmentAdapter(getChildFragmentManager(), arrayList);
        return this.B;
    }

    @Subscribe
    public void receiveJumpMessage(com.ss.android.ugc.aweme.shortvideo.sticker.unlock.e eVar) {
        this.T = true;
    }

    public final void a(d dVar) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, v, false, 82028, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, v, false, 82028, new Class[]{d.class}, Void.TYPE);
        } else if (dVar != null && this.tvCollect != null && this.ivCollect != null) {
            CheckableImageView checkableImageView = this.ivCollect;
            if (dVar.isFavorite) {
                i = 2130839385;
            } else {
                i = 2130839386;
            }
            checkableImageView.setImageResource(i);
            DmtTextView dmtTextView = this.tvCollect;
            if (dVar.isFavorite) {
                i2 = C0906R.string.bec;
            } else {
                i2 = C0906R.string.cds;
            }
            dmtTextView.setText(i2);
        }
    }

    public final void b(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, v, false, 82038, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, v, false, 82038, new Class[]{d.class}, Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.favorites.b.a(dVar2));
    }

    public boolean checkStatus(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, v, false, 82030, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, v, false, 82030, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || !cg.a(str, 5)) {
            return true;
        } else {
            if (this.K != null) {
                this.K.dismiss();
            }
            return false;
        }
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
        if (PatchProxy.isSupport(new Object[]{shareResult}, this, v, false, 82035, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult}, this, v, false, 82035, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
        } else if (this.w != null && shareResult != null) {
            r.a("share_prop", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", this.w.id).a("platform", shareResult.type).a("enter_from", "prop_page").f34114b);
            ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).addShareRecord(shareResult.type);
        }
    }

    private void c(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, v, false, 82018, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, v, false, 82018, new Class[]{d.class}, Void.TYPE);
        } else if (dVar2 != null) {
            com.ss.android.ugc.aweme.base.c.b(this.coverImgView, dVar2.iconUrl);
            com.ss.android.ugc.aweme.sticker.model.a aVar = dVar2.commerceSticker;
            ServiceManager.get().getService(IFestivalService.class);
            if (aVar != null) {
                if (PatchProxy.isSupport(new Object[]{dVar2, aVar}, this, v, false, 82019, new Class[]{d.class, com.ss.android.ugc.aweme.sticker.model.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar2, aVar}, this, v, false, 82019, new Class[]{d.class, com.ss.android.ugc.aweme.sticker.model.a.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.base.c.b(this.coverImgView, dVar2.iconUrl);
                    this.coverImgView.setVisibility(0);
                    this.lockImageView.setVisibility(8);
                    this.imgToRecord.setImageResource(2130838321);
                    this.mTextStickerInfo.setVisibility(0);
                    this.mTextStickerInfo.setTextColor(getResources().getColor(C0906R.color.zx));
                    this.txtDisclaimer.setTextColor(getResources().getColor(C0906R.color.zv));
                    String detailDesc = aVar.getDetailDesc();
                    if (PatchProxy.isSupport(new Object[]{detailDesc}, this, v, false, 82017, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{detailDesc}, this, v, false, 82017, new Class[]{String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(detailDesc)) {
                        this.mTextStickerInfo.setVisibility(0);
                        ((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).setTextForChallengeDesc(detailDesc, this.mTextStickerInfo, this.mVpExpandContainer, this.txtDisclaimer, this.ivDisclaimer, true);
                    } else {
                        this.mTextStickerInfo.setVisibility(8);
                    }
                    this.mBottomLineView.setVisibility(0);
                    String detailLetters = aVar.getDetailLetters();
                    if (TextUtils.isEmpty(detailLetters)) {
                        this.mLayoutStickerUrl.setVisibility(8);
                    } else {
                        r.a("show_link", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "prop_page").a("type", "web_link").a("prop_id", aVar.getId()).f34114b);
                        this.mLayoutStickerUrl.setVisibility(0);
                        this.mTextStickerUrl.setText(detailLetters);
                        if (com.ss.android.g.a.b()) {
                            this.mTextStickerUrl.setTextColor(getResources().getColor(C0906R.color.hn));
                        } else {
                            this.mTextStickerUrl.setTextColor(getResources().getColor(C0906R.color.zp));
                        }
                        this.mTextStickerUrl.setOnClickListener(new e(this, aVar));
                    }
                    String adOwnerName = aVar.getAdOwnerName();
                    if (TextUtils.isEmpty(adOwnerName)) {
                        this.mAdOwnerLL.setVisibility(8);
                    } else {
                        r.a("show_aduser_head", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "prop_page").a("to_user_id", aVar.getAdOwnerId()).a("prop_id", aVar.getId()).f34114b);
                        this.mAdOwnerLL.setVisibility(0);
                        this.mAdNickNameTv.setText(adOwnerName);
                        this.mAdOwnerLL.setOnClickListener(new f(aVar));
                    }
                }
            } else {
                this.lockImageView.setVisibility(8);
                this.imgToRecord.setImageResource(2130838321);
                this.mTextStickerInfo.setVisibility(8);
                this.mLayoutStickerUrl.setVisibility(8);
                this.mAdOwnerLL.setVisibility(8);
            }
            this.titleTextView.setText(dVar2.name);
            if (!TextUtils.isEmpty(dVar2.ownerName)) {
                this.nickNameTextView.setText(dVar2.ownerName);
                this.mStickerOwnerProfileView.setVisibility(0);
                if (TextUtils.isEmpty(dVar2.ownerId)) {
                    this.mArrowImg.setVisibility(8);
                } else {
                    this.mArrowImg.setVisibility(0);
                }
            } else {
                this.mStickerOwnerProfileView.setVisibility(8);
            }
            this.usedCountTextView.setText(String.format(getActivity().getString(C0906R.string.bfa), new Object[]{b.b(dVar2.userCount)}));
            this.f3296e.setText(dVar2.name);
            this.w = dVar2;
            this.i.setCurrentItem(this.H.f71669c);
            ((AbstractBaseDetailFragment.a) this.r.get(this.H.f71669c)).e();
            a(dVar);
            r.a("prop_select", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", dVar2.id).a("enter_from", "prop_page").f34114b);
            View view = this.mInfoView;
            if (PatchProxy.isSupport(new Object[]{view}, this, v, false, 82020, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, v, false, 82020, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i) {
        if (i != this.H.f71669c) {
            com.ss.android.ugc.aweme.sticker.prop.adapter.a aVar = this.H;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aVar, com.ss.android.ugc.aweme.sticker.prop.adapter.a.f71667a, false, 81998, new Class[]{Integer.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.sticker.prop.adapter.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, com.ss.android.ugc.aweme.sticker.prop.adapter.a.f71667a, false, 81998, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (aVar.f71668b != null && i < aVar.f71668b.size()) {
                for (d dVar : aVar.f71668b) {
                    dVar.mIsSelect = false;
                }
                aVar.f71668b.get(i).mIsSelect = true;
                aVar.f71669c = i;
                aVar.notifyDataSetChanged();
            }
            c(this.H.f71668b.get(i));
            if (((IStickerUtilsService) this.z.get()).isLockCommerceFaceSticker(this.H.f71668b.get(i))) {
                a(true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    @butterknife.OnClick({2131493213, 2131497316, 2131497081, 2131495306, 2131497346})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void click(android.view.View r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = v
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 82029(0x1406d, float:1.14947E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82029(0x1406d, float:1.14947E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            int r0 = r20.getId()
            r1 = 2131165550(0x7f07016e, float:1.794532E38)
            if (r0 != r1) goto L_0x0049
            android.support.v4.app.FragmentActivity r0 = r19.getActivity()
            if (r0 == 0) goto L_0x0048
            r0.finish()
        L_0x0048:
            return
        L_0x0049:
            r1 = 2131170085(0x7f071325, float:1.7954518E38)
            r10 = 0
            r11 = 2
            if (r0 != r1) goto L_0x01d4
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x0065
            android.support.v4.app.FragmentActivity r0 = r19.getActivity()
            r1 = 2131562855(0x7f0d1167, float:1.875115E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x0065:
            com.google.common.a.s<com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService> r0 = r7.z
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService r0 = (com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService) r0
            android.content.Context r1 = r20.getContext()
            com.ss.android.ugc.aweme.sticker.model.d r2 = r7.w
            java.lang.String r3 = "prop_collection"
            boolean r0 = r0.showCommerceStickerDialog(r1, r2, r3)
            if (r0 != 0) goto L_0x034f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82024(0x14068, float:1.1494E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82024(0x14068, float:1.1494E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x034f
        L_0x00a2:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r0.needLoginBeforeRecord()
            if (r0 == 0) goto L_0x00c3
            android.support.v4.app.FragmentActivity r0 = r19.getActivity()
            java.lang.String r1 = "prop_page"
            java.lang.String r2 = "prop_reuse_icon"
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r10, (com.ss.android.ugc.aweme.base.component.f) r10)
            goto L_0x034f
        L_0x00c3:
            com.ss.android.ugc.aweme.share.bv r0 = r7.M
            if (r0 != 0) goto L_0x00d4
            com.ss.android.ugc.aweme.share.bv r0 = new com.ss.android.ugc.aweme.share.bv
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            java.lang.String r2 = "prop_page"
            r0.<init>(r1, r2)
            r7.M = r0
        L_0x00d4:
            com.ss.android.ugc.aweme.share.bv r0 = r7.M
            com.ss.android.ugc.aweme.sticker.prop.fragment.g r1 = new com.ss.android.ugc.aweme.sticker.prop.fragment.g
            r1.<init>(r7)
            r0.k = r1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82025(0x14069, float:1.14942E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0107
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82025(0x14069, float:1.14942E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            goto L_0x014d
        L_0x0107:
            com.ss.android.ugc.aweme.sticker.model.e r0 = r7.G
            if (r0 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.sticker.model.e r0 = r7.G
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r0 = r0.mStickers
            if (r0 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.sticker.model.e r0 = r7.G
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r0 = r0.mStickers
            int r0 = r0.size()
            if (r0 != 0) goto L_0x011c
            goto L_0x014d
        L_0x011c:
            java.util.ArrayList r10 = new java.util.ArrayList
            com.ss.android.ugc.aweme.sticker.model.e r0 = r7.G
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r0 = r0.mStickers
            int r0 = r0.size()
            r10.<init>(r0)
            com.ss.android.ugc.aweme.sticker.model.e r0 = r7.G
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r0 = r0.mStickers
            java.util.Iterator r0 = r0.iterator()
        L_0x0131:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x014d
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.sticker.model.d r1 = (com.ss.android.ugc.aweme.sticker.model.d) r1
            boolean r2 = r1.mIsSelect
            if (r2 != 0) goto L_0x0147
            java.lang.String r1 = r1.id
            r10.add(r1)
            goto L_0x0131
        L_0x0147:
            java.lang.String r1 = r1.id
            r10.add(r9, r1)
            goto L_0x0131
        L_0x014d:
            if (r10 == 0) goto L_0x01d3
            int r0 = r10.size()
            if (r0 == 0) goto L_0x01d3
            java.io.Serializable r0 = r7.P
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.music.model.Music
            if (r0 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.share.bv r0 = r7.M
            java.io.Serializable r1 = r7.P
            com.ss.android.ugc.aweme.music.model.Music r1 = (com.ss.android.ugc.aweme.music.model.Music) r1
            r0.h = r1
        L_0x0163:
            com.ss.android.ugc.aweme.share.bv r0 = r7.M
            java.lang.String r1 = "prop_page"
            java.lang.String r2 = r7.D
            r3 = 4
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r9] = r10
            java.lang.Byte r4 = java.lang.Byte.valueOf(r9)
            r12[r8] = r4
            r12[r11] = r1
            r4 = 3
            r12[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.bv.f64837a
            r15 = 0
            r16 = 73247(0x11e1f, float:1.02641E-40)
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r5[r9] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r5[r8] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r11] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r4] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x01cc
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r9] = r10
            java.lang.Byte r5 = java.lang.Byte.valueOf(r9)
            r12[r8] = r5
            r12[r11] = r1
            r12[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.bv.f64837a
            r15 = 0
            r16 = 73247(0x11e1f, float:1.02641E-40)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r1[r9] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r8] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r4] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x034f
        L_0x01cc:
            r0.n = r1
            r0.o = r2
            r0.a((java.util.ArrayList<java.lang.String>) r10, (boolean) r9, (boolean) r9)
        L_0x01d3:
            return
        L_0x01d4:
            r1 = 2131170123(0x7f07134b, float:1.7954595E38)
            if (r0 != r1) goto L_0x01dd
            r19.k()
            return
        L_0x01dd:
            r1 = 2131169883(0x7f07125b, float:1.7954109E38)
            if (r0 != r1) goto L_0x02ea
            com.ss.android.ugc.aweme.u.h r0 = new com.ss.android.ugc.aweme.u.h
            r0.<init>()
            java.lang.String r1 = "prop_page"
            com.ss.android.ugc.aweme.u.h r0 = r0.e((java.lang.String) r1)
            java.lang.String r1 = "prop_page"
            com.ss.android.ugc.aweme.u.h r0 = r0.f((java.lang.String) r1)
            com.ss.android.ugc.aweme.sticker.model.d r1 = r7.w
            java.lang.String r1 = r1.id
            r0.f75124b = r1
            com.ss.android.ugc.aweme.feed.ai r1 = com.ss.android.ugc.aweme.feed.ai.a()
            java.lang.String r2 = r7.y
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.f((java.lang.String) r2)
            java.lang.String r1 = r1.a((java.lang.String) r2)
            r0.f75126d = r1
            java.lang.String r1 = r7.y
            com.ss.android.ugc.aweme.u.h r0 = r0.h(r1)
            r1 = 1009(0x3f1, float:1.414E-42)
            r0.f75125c = r1
            r0.e()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82026(0x1406a, float:1.14943E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x023d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 82026(0x1406a, float:1.14943E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x034f
        L_0x023d:
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r7.K
            if (r0 == 0) goto L_0x02e9
            java.lang.String r0 = "share"
            com.ss.android.ugc.aweme.sec.a.a(r0)
            com.ss.android.ugc.aweme.sticker.model.d r0 = r7.w
            if (r0 == 0) goto L_0x02df
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r7.K
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            com.ss.android.ugc.aweme.sticker.model.d r2 = r7.w
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r9] = r1
            r12[r8] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.share.i.f46055a
            r15 = 1
            r16 = 42133(0xa495, float:5.9041E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r4 = com.ss.android.ugc.aweme.sticker.model.d.class
            r3[r8] = r4
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r18 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0295
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r9] = r1
            r12[r8] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.share.i.f46055a
            r15 = 1
            r16 = 42133(0xa495, float:5.9041E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r2 = com.ss.android.ugc.aweme.sticker.model.d.class
            r1[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r18 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r1
            goto L_0x02db
        L_0x0295:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r3.<init>()
            java.lang.String r4 = r2.id
            r3.identifier = r4
            r3.setThumbPath(r10)
            r4 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r1 = r1.getString(r4)
            r3.appName = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareTitle()
            r3.title = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareUrl()
            r3.url = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareDesc()
            r3.description = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareSignatureDesc()
            r3.shareSignatureDesc = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareSignatureUrl()
            r3.shareSignatureUrl = r1
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r2.shareInfo
            java.lang.String r1 = r1.getShareQuote()
            r3.shareQuote = r1
            r1 = r3
        L_0x02db:
            r0.updateShareStruct(r1)
            goto L_0x02e4
        L_0x02df:
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r7.K
            r0.updateShareStruct(r10)
        L_0x02e4:
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = r7.K
            r0.show()
        L_0x02e9:
            return
        L_0x02ea:
            r1 = 2131167952(0x7f070ad0, float:1.7950192E38)
            if (r0 != r1) goto L_0x034f
            com.ss.android.ugc.aweme.sticker.model.d r0 = r7.w
            if (r0 == 0) goto L_0x034f
            com.ss.android.ugc.aweme.sticker.model.d r0 = r7.w
            java.lang.String r0 = r0.ownerId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x034f
            com.ss.android.ugc.aweme.sticker.model.d r0 = r7.w
            java.lang.String r0 = r0.ownerName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x034f
            java.lang.String r0 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.model.d r3 = r7.w
            java.lang.String r3 = r3.id
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "to_user_id"
            com.ss.android.ugc.aweme.sticker.model.d r3 = r7.w
            java.lang.String r3 = r3.ownerId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "prop_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "click_name"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "aweme://user/profile/"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.sticker.model.d r2 = r7.w
            java.lang.String r2 = r2.ownerId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a((java.lang.String) r1)
        L_0x034f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment.click(android.view.View):void");
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, v, false, 82007, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, v, false, 82007, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.y = bundle.getString("aweme_id");
            this.x = bundle.getString("extra_log_pb");
            this.C = bundle.getString("extra_music_from");
            this.D = bundle.getString("extra_sticker_from");
            this.O = (com.ss.android.ugc.aweme.shortvideo.e) bundle.getSerializable("sticker_music");
            this.P = bundle.getSerializable("music_model");
            this.Q = bundle.getStringArrayList("extra_stickers");
            StringBuilder sb = new StringBuilder();
            if (this.Q != null && this.Q.size() > 0) {
                this.N = this.Q.get(0);
                Iterator<String> it2 = this.Q.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next() + ",");
                }
            }
            if (sb.toString().endsWith(",")) {
                this.F = sb.toString().substring(0, sb.toString().length() - 1);
            }
            this.t = bundle.getString("sticker_id");
            this.q = false;
        }
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, v, false, 82022, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, v, false, 82022, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i, i2);
        float f2 = 0.0f;
        if (this.J == 0.0f) {
            if (this.mStickerOwnerProfileView.getVisibility() == 0) {
                this.J = (float) (this.mStickerOwnerProfileView.getBottom() - this.f3297f.getBottom());
            } else if (this.titleTextView.getVisibility() == 0) {
                this.J = (float) (this.titleTextView.getBottom() - this.f3297f.getBottom());
            }
        }
        if (this.I == 0.0f) {
            this.I = (float) (this.mHeadLayout.getBottom() - this.f3297f.getBottom());
        }
        float f3 = (float) i;
        float f4 = (f3 - this.J) / (this.I - this.J);
        if (f4 >= 0.0f) {
            f2 = f4;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f3297f.setAlpha(f2);
        if (com.ss.android.g.a.a()) {
            this.f3296e.setAlpha(f2);
            this.mHeadLayout.setAlpha(1.0f - (f3 / this.I));
        } else {
            this.f3296e.setAlpha(f2 * f2 * f2);
            this.mHeadLayout.setAlpha((float) Math.pow((double) (1.0f - (f3 / this.I)), 3.0d));
        }
        j().setAlpha(1.0f - f2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, v, false, 82008, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, v, false, 82008, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().updateUnlockedIdsFromNet(null);
        this.E = new a(this.R);
        this.E.a(this);
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840142).b((int) C0906R.string.b1c).b("").f20493a;
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).a(cVar).b(com.ss.android.ugc.aweme.views.e.a(getContext(), new a(this))));
        this.mCollectView.setVisibility(0);
        this.ivCollect.setOnStateChangeListener(new CheckableImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71691a;

            public final void a() {
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71691a, false, 82054, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71691a, false, 82054, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1) {
                    StickerPropDetailFragment.this.a(StickerPropDetailFragment.this.w);
                }
            }
        });
        View view2 = this.mBottomLineView;
        if (com.ss.android.g.a.b()) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        if (PatchProxy.isSupport(new Object[0], this, v, false, 82012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 82012, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], this, v, false, 82013, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, v, false, 82013, new Class[0], Void.TYPE);
            } else {
                this.K = a(getActivity(), ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(false), false, true);
                this.K.setActionHandler(this);
                this.K.setShareCallback(this);
                this.K.updateShareStruct(this.L);
            }
        } else {
            this.K = a(getActivity(), ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(false), false, true);
            this.K.setActionHandler(this);
            this.K.setShareCallback(this);
        }
        this.f3296e.setAlpha(0.0f);
        this.f3296e.setOnClickListener(new b(this));
        this.H = new com.ss.android.ugc.aweme.sticker.prop.adapter.a(getActivity());
        this.gridView.setAdapter(this.H);
        this.gridView.setOnItemClickListener(new c(this));
        if (com.ss.android.g.a.a()) {
            this.g.setVisibility(8);
        }
        i();
        if (com.ss.android.g.a.a()) {
            ((g) this.R.get()).a(this.Q.get(0), (String) null, (com.ss.android.ugc.effectmanager.effect.b.i) new com.ss.android.ugc.effectmanager.effect.b.i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71693a;

                public final void b(Effect effect) {
                }

                public final void a(Effect effect) {
                    if (PatchProxy.isSupport(new Object[]{effect}, this, f71693a, false, 82055, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect}, this, f71693a, false, 82055, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    if (StickerPropDetailFragment.this.g != null) {
                        StickerPropDetailFragment.this.g.setVisibility(0);
                    }
                    if (((IStickerUtilsService) StickerPropDetailFragment.this.z.get()).isLockSticker(effect) && ((!com.ss.android.ugc.aweme.account.c.d().isLogin() && !((IStickerUtilsService) StickerPropDetailFragment.this.z.get()).isCommerceLockSticker(effect)) || !((IStickerUtilsService) StickerPropDetailFragment.this.z.get()).hasUnlocked(effect))) {
                        StickerPropDetailFragment.this.A = true;
                        StickerPropDetailFragment.this.a(StickerPropDetailFragment.this.A);
                    }
                }

                public final void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
                    if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f71693a, false, 82056, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f71693a, false, 82056, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                        return;
                    }
                    if (StickerPropDetailFragment.this.g != null) {
                        StickerPropDetailFragment.this.g.setVisibility(0);
                    }
                }
            });
        }
    }

    public boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str2 = str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, v, false, 82031, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, v, false, 82031, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() && this.w == null) {
            return false;
        } else {
            if (TextUtils.equals("copy", str2)) {
                if (com.ss.android.g.a.a()) {
                    if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, v, false, 82032, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, v, false, 82032, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
                    } else if (shareStruct2 != null) {
                        String a2 = cg.a(shareStruct2, "copy_link");
                        ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a2, a2));
                        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                        return true;
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, v, false, 82033, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 82033, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (this.w == null) {
                        return false;
                    } else {
                        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        IShareService.ShareStruct shareStruct3 = new IShareService.ShareStruct();
                        shareStruct3.url = this.w.shareInfo.getShareUrl();
                        if (this.w.shareInfo.getBoolPersist() == 1) {
                            z2 = true;
                        }
                        shareStruct3.boolPersist = z2;
                        String a3 = cg.a(shareStruct3, "copy");
                        String str3 = this.w.shareInfo.getShareWeiboDesc() + " " + a3;
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str3));
                        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                        z2 = true;
                    }
                }
                return z2;
            } else if (TextUtils.equals(str2, "qr_code")) {
                FragmentActivity activity = getActivity();
                d dVar = this.w;
                String str4 = this.y;
                if (PatchProxy.isSupport(new Object[]{activity, dVar, str4}, null, com.ss.android.ugc.aweme.sticker.prop.a.f71646a, true, 81985, new Class[]{Activity.class, d.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity, dVar, str4}, null, com.ss.android.ugc.aweme.sticker.prop.a.f71646a, true, 81985, new Class[]{Activity.class, d.class, String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                    Intrinsics.checkParameterIsNotNull(dVar, "mCurStickerBean");
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("to_user_id", "");
                    if (str4 == null) {
                        str4 = "";
                    }
                    map.put("group_id", str4);
                    r.a("click_qr_code", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", dVar.id).a("platform", "qr_code").a("qr_code_type", "shaped").a("enter_from", "prop_page").a(hashMap).f34114b);
                    map.put("enter_method", "click_qr_code");
                    if (cg.c()) {
                        bt.a d2 = new bt.a().a(17, dVar.id, "prop_page").d(dVar.name, dVar.userCount);
                        if (PatchProxy.isSupport(new Object[]{map}, d2, bt.a.f64829a, false, 73239, new Class[]{Map.class}, bt.a.class)) {
                            d2 = (bt.a) PatchProxy.accessDispatch(new Object[]{map}, d2, bt.a.f64829a, false, 73239, new Class[]{Map.class}, bt.a.class);
                        } else {
                            d2.f64830b.f64828f.putAll(map);
                        }
                        new z(activity, d2.f64830b).show();
                    } else {
                        Context context = activity;
                        d.a a4 = new d.a().a(17, dVar.id, "prop_page");
                        String str5 = dVar.name;
                        long j = dVar.userCount;
                        if (PatchProxy.isSupport(new Object[]{str5, new Long(j)}, a4, d.a.f63386a, false, 70362, new Class[]{String.class, Long.TYPE}, d.a.class)) {
                            a4 = (d.a) PatchProxy.accessDispatch(new Object[]{str5, new Long(j)}, a4, d.a.f63386a, false, 70362, new Class[]{String.class, Long.TYPE}, d.a.class);
                        } else {
                            a4.f63387b.title = str5;
                            a4.f63387b.describe = b.b(j);
                        }
                        QRCodeActivityV2.a(context, a4.f63387b);
                    }
                }
                return true;
            } else if (!cg.b(str)) {
                return false;
            } else {
                new z(getActivity(), new bt.a().a(17, this.w.id, "prop_page").d(this.w.name, this.w.userCount).f64830b, 7, str2).show();
                r.a("share_prop", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", this.w.id).a("enter_from", "prop_page").a("platform", str2).a("group_id", this.y).a("to_user_id", "").a("enter_method", "normal_share").a("share_mode", "shaped_qr_code").f34114b);
                return true;
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.model.d dVar, com.ss.android.ugc.effectmanager.common.e.c cVar) {
        com.ss.android.ugc.aweme.sticker.model.d dVar2 = dVar;
        com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, cVar2}, this, v, false, 82039, new Class[]{com.ss.android.ugc.aweme.sticker.model.d.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, cVar2}, this, v, false, 82039, new Class[]{com.ss.android.ugc.aweme.sticker.model.d.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.favorites.b.a(dVar2));
        a(dVar);
        int i = cVar2.f77315a;
        if (i == 2004 || i == 2002) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), getResources().getString(C0906R.string.ac6)).a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.framework.services.IShareService.SharePage a(android.app.Activity r22, java.lang.String[] r23, boolean r24, boolean r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r10)
            r12 = 2
            r3[r12] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r11)
            r13 = 3
            r3[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = v
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r13] = r4
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r9 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r6 = 0
            r7 = 82014(0x1405e, float:1.14926E-40)
            r4 = r21
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0075
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r0
            r14[r11] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r10)
            r14[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)
            r14[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = v
            r17 = 0
            r18 = 82014(0x1405e, float:1.14926E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r20 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.framework.services.IShareService$SharePage r0 = (com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r0
            return r0
        L_0x0075:
            com.ss.android.ugc.aweme.share.ck r2 = new com.ss.android.ugc.aweme.share.ck
            r2.<init>()
            r2.f64974c = r10
            r2.i = r11
            r2.f64976e = r1
            com.ss.android.ugc.aweme.share.SimpleShareDialog r1 = new com.ss.android.ugc.aweme.share.SimpleShareDialog
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment.a(android.app.Activity, java.lang.String[], boolean, boolean):com.ss.android.ugc.aweme.framework.services.IShareService$SharePage");
    }
}
