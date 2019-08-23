package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import butterknife.BindView;
import butterknife.OnClick;
import com.alibaba.fastjson.JSON;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.ss.android.ugc.aweme.poi.e.m;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.nearby.b.b;
import com.ss.android.ugc.aweme.poi.ui.coupon.c;
import com.ss.android.ugc.aweme.poi.ui.h;
import com.ss.android.ugc.aweme.poi.ui.publish.PoiContext;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity;
import com.ss.android.ugc.aweme.u.ak;
import com.ss.android.ugc.aweme.utils.dq;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public abstract class AbsPoiAwemeFeedFragment extends FeedFragment implements ViewTreeObserver.OnGlobalLayoutListener, f, IShareService.IActionHandler, IShareService.OnShareCallback, ScreenBroadcastReceiver.a, b, c.a, h.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3749a;
    private boolean A;
    private boolean B = true;

    /* renamed from: b  reason: collision with root package name */
    protected i f3750b;

    /* renamed from: c  reason: collision with root package name */
    protected h f3751c;

    /* renamed from: d  reason: collision with root package name */
    protected l f3752d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.poi.c f3753e;

    /* renamed from: f  reason: collision with root package name */
    public String f3754f;
    protected String g;
    public String h;
    protected PoiDetail i;
    protected PoiStruct j;
    public boolean k;
    @BindView(2131495411)
    public NestedScrollingRecyclerView mRecyclerView;
    @Nullable
    @BindView(2131497316)
    protected View mStartRecodeLayout;
    @Nullable
    @BindView(2131497319)
    protected View mStartRecordOutRing;
    @BindView(2131497326)
    protected DmtStatusView mStatusView;
    public com.ss.android.ugc.aweme.poi.widget.c q;
    public boolean r;
    boolean s = true;
    private aa t;
    private com.ss.android.ugc.aweme.newfollow.f.f u;
    private com.ss.android.ugc.aweme.poi.nearby.b.a v;
    private ScreenBroadcastReceiver w;
    private boolean x;
    private IShareService.SharePage y;
    private boolean z;

    class a implements IShareService.IActionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60392a;

        /* renamed from: b  reason: collision with root package name */
        IShareService.ShareStruct f60393b;

        /* renamed from: c  reason: collision with root package name */
        String f60394c;

        /* renamed from: d  reason: collision with root package name */
        String f60395d;

        public final boolean checkStatus(String str) {
            return true;
        }

        public final boolean onAction(IShareService.ShareStruct shareStruct, String str) {
            if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f60392a, false, 65909, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f60392a, false, 65909, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            if (TextUtils.equals(str, "chat_merge")) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("share_struct", shareStruct);
                com.ss.android.ugc.aweme.im.b.a().enterChooseContact(AbsPoiAwemeFeedFragment.this.getContext(), bundle, null);
            } else {
                if (PatchProxy.isSupport(new Object[]{str}, this, f60392a, false, 65910, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f60392a, false, 65910, new Class[]{String.class}, Void.TYPE);
                } else if (!(AbsPoiAwemeFeedFragment.this.getActivity() == null || AbsPoiAwemeFeedFragment.this.j == null)) {
                    com.ss.android.ugc.aweme.poi.e.h.a(AbsPoiAwemeFeedFragment.this.f3753e, "share_coupon", d.a().a("enter_from", "poi_page").a("poi_id", AbsPoiAwemeFeedFragment.this.f3754f).a("platform", str).a("to_user_id", PushConstants.PUSH_TYPE_NOTIFY).a("coupon_id", this.f60395d));
                    ShareInfo shareInfo = new ShareInfo();
                    shareInfo.setShareTitle(AbsPoiAwemeFeedFragment.this.j.poiName);
                    shareInfo.setShareDesc(this.f60393b.description);
                    ShareCommandFactory shareCommandFactory = new ShareCommandFactory(AbsPoiAwemeFeedFragment.this.getActivity(), str, shareInfo);
                    shareCommandFactory.f45923e = this.f60395d;
                    shareCommandFactory.f45924f = AbsPoiAwemeFeedFragment.this.f3753e;
                    shareCommandFactory.a("sslocal://poi/detail?id=" + AbsPoiAwemeFeedFragment.this.f3754f + "&attached_activity_id=" + this.f60394c, 22, AbsPoiAwemeFeedFragment.this.f3754f);
                }
            }
            return true;
        }

        private a(IShareService.ShareStruct shareStruct, String str, String str2) {
            this.f60393b = shareStruct;
            this.f60394c = str;
            this.f60395d = str2;
        }

        /* synthetic */ a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, IShareService.ShareStruct shareStruct, String str, String str2, byte b2) {
            this(shareStruct, str, str2);
        }
    }

    public PoiAwemeFeedAdapter.a G() {
        return null;
    }

    public g H() {
        return null;
    }

    public final boolean d(boolean z2) {
        return false;
    }

    public final int e() {
        return 10;
    }

    public abstract int k();

    public abstract int l();

    public Fragment m() {
        return this;
    }

    public void u() {
    }

    public PoiDetailHeaderInfoPresenter.a z() {
        return null;
    }

    public final l c() {
        return this.f3752d;
    }

    public boolean a(PoiDetail poiDetail) {
        List list;
        IShareService.ShareStruct shareStruct;
        PoiDetail poiDetail2 = poiDetail;
        if (PatchProxy.isSupport(new Object[]{poiDetail2}, this, f3749a, false, 65864, new Class[]{PoiDetail.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiDetail2}, this, f3749a, false, 65864, new Class[]{PoiDetail.class}, Boolean.TYPE)).booleanValue();
        } else if (this.j != null) {
            return true;
        } else {
            if (poiDetail2 != null) {
                this.i = poiDetail2;
                this.j = poiDetail2.poiStruct;
                this.g = this.j.poiName;
                this.h = this.j.getTypeCode();
                if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65862, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65862, new Class[0], Void.TYPE);
                } else if (isViewValid() && getActivity() != null) {
                    ck ckVar = new ck();
                    ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList();
                    if (this.i != null && this.i.isPoiOwnerValid()) {
                        ckVar.p = TextUtils.isEmpty(this.i.getEnterpriseId());
                    }
                    if (this.i != null && !TextUtils.isEmpty(this.i.getFeedbackUrl())) {
                        ckVar.q = true;
                    }
                    ckVar.i = true;
                    this.y = new SimpleShareDialog(getActivity(), ckVar);
                    this.y.setActionHandler(this);
                    this.y.setShareCallback(this);
                }
            }
            if (this.y == null) {
                return false;
            }
            if (this.j == null) {
                this.y.updateShareStruct(null);
            } else if (this.j.getShareInfo() != null) {
                IShareService.SharePage sharePage = this.y;
                Context context = getContext();
                PoiStruct poiStruct = this.j;
                if (this.t == null) {
                    list = null;
                } else {
                    list = this.t.getItems();
                }
                if (PatchProxy.isSupport(new Object[]{context, poiStruct, list}, null, i.f46055a, true, 42130, new Class[]{Context.class, PoiStruct.class, List.class}, IShareService.ShareStruct.class)) {
                    shareStruct = (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, poiStruct, list}, null, i.f46055a, true, 42130, new Class[]{Context.class, PoiStruct.class, List.class}, IShareService.ShareStruct.class);
                } else {
                    IShareService.ShareStruct a2 = i.a();
                    a2.identifier = poiStruct.getPoiId();
                    if (context != null) {
                        a2.appName = context.getString(C0906R.string.ak);
                    } else {
                        a2.appName = "抖音短视频";
                    }
                    a2.title = poiStruct.getShareInfo().getShareTitle();
                    if (!TextUtils.isEmpty(poiStruct.getShareInfo().getShareDesc())) {
                        a2.description = poiStruct.getShareInfo().getShareDesc();
                    } else {
                        a2.description = " ";
                    }
                    a2.thumbUrl = com.ss.android.ugc.aweme.base.c.a(poiStruct.getCoverThumb());
                    a2.videoCover = m.b(poiStruct.getPoiId());
                    a2.url = i.a(poiStruct.getShareInfo().getShareUrl());
                    a2.shareText = null;
                    a2.groupId = 0;
                    a2.itemId = 0;
                    a2.adId = 0;
                    a2.poiId = poiStruct.getPoiId();
                    a2.enterFrom = "poi_page";
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("user_count", poiStruct.getItemCount());
                    hashMap.put("poi_name", poiStruct.poiName);
                    hashMap.put("simple_addr", poiStruct.address == null ? "" : poiStruct.address.getSimpleAddr());
                    if (list != null && list.size() >= 3) {
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            if (!(list.get(i3) == null || ((com.ss.android.ugc.aweme.newfollow.e.b) list.get(i3)).getAweme() == null)) {
                                Aweme aweme = ((com.ss.android.ugc.aweme.newfollow.e.b) list.get(i3)).getAweme();
                                if (aweme.getAwemeType() == 2) {
                                    UrlModel a3 = i.a(aweme);
                                    if (a3 != null) {
                                        arrayList.add(a3);
                                        i2++;
                                    }
                                } else {
                                    arrayList.add(aweme.getVideo().getCover());
                                    i2++;
                                }
                                if (i2 >= 3) {
                                    break;
                                }
                            }
                        }
                        if (arrayList.size() >= 3) {
                            hashMap.put("cover_url", JSON.toJSONString(arrayList));
                        }
                    }
                    hashMap.put("map_url", JSON.toJSONString(m.b(poiStruct.getPoiId())));
                    hashMap.put("poi_icon_url", JSON.toJSONString(poiStruct.iconOnEntry));
                    a2.extraParams = hashMap;
                    a2.itemType = "poi";
                    shareStruct = a2;
                }
                sharePage.updateShareStruct(shareStruct);
            } else {
                this.y.updateShareStruct(null);
            }
            return false;
        }
    }

    public final boolean g() {
        if (this.f3752d != null) {
            return this.f3752d.hasActivity;
        }
        return false;
    }

    public final String j() {
        if (this.f3752d != null) {
            return this.f3752d.challengeId;
        }
        return "";
    }

    public final String A() {
        if (!PatchProxy.isSupport(new Object[0], this, f3749a, false, 65880, new Class[0], String.class)) {
            return c().awemeid;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65880, new Class[0], String.class);
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65888, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3750b != null) {
            this.f3750b.n();
        }
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65890, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3750b != null) {
            this.f3750b.o();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void J() {
        if (isViewValid() && getActivity() != null) {
            this.q = new com.ss.android.ugc.aweme.poi.widget.c(getActivity());
            this.q.j = u.a(-5.0d);
            this.q.o = 3000;
            this.q.c(C0906R.string.bpg);
            this.q.a(this.mStartRecodeLayout, 48);
        }
    }

    public void L_() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65877, new Class[0], Void.TYPE);
            return;
        }
        if (!e.a().b()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a("poi_page", "list");
        }
    }

    public final void W_() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65882, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            b(af.a(getContext()).f());
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65876, new Class[0], Void.TYPE);
            return;
        }
        if (!dq.a()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a();
        }
    }

    public final String n() {
        if (!PatchProxy.isSupport(new Object[0], this, f3749a, false, 65879, new Class[0], String.class)) {
            return c().from;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65879, new Class[0], String.class);
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65852, new Class[0], Void.TYPE);
        } else if (this.mStartRecodeLayout != null) {
            this.mStartRecodeLayout.post(new c(this));
        }
    }

    public void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65874, new Class[0], Void.TYPE);
            return;
        }
        if (this.mRecyclerView != null) {
            this.mRecyclerView.setPadding(0, 0, 0, 0);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65872, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        if (this.f3750b != null) {
            this.f3750b.l();
        }
        L_();
        this.x = false;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65871, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f3750b != null) {
            this.f3750b.k();
        }
        this.x = false;
    }

    public h w() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65868, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65868, new Class[0], h.class);
        }
        if (this.f3751c == null) {
            this.f3751c = new h(this);
        }
        return this.f3751c;
    }

    public i x() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65869, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65869, new Class[0], i.class);
        }
        if (this.f3750b == null) {
            this.f3750b = new i();
        }
        return this.f3750b;
    }

    public aa y() {
        if (!PatchProxy.isSupport(new Object[0], this, f3749a, false, 65870, new Class[0], aa.class)) {
            return new aa(l());
        }
        return (aa) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65870, new Class[0], aa.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void L() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65858, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            if (!this.f3750b.f60805f) {
                this.mStatusView.f();
            }
        } else {
            com.ss.android.ugc.aweme.poi.a aVar = null;
            if (this.k) {
                aVar = af.a(getContext()).a((f) this);
                if (aVar != null) {
                    af.a(getContext()).d();
                    b(aVar);
                }
            } else {
                b((com.ss.android.ugc.aweme.poi.a) null);
            }
            a(aVar);
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65887, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.e.h.a(this.j, "click_poi_feedback", d.a().a("enter_from", "poi_page").a("enter_method", "click_button").a("poi_id", this.f3754f));
        com.ss.android.ugc.aweme.ag.h.a().a(com.ss.android.ugc.aweme.music.util.f.a((String) SharePrefCache.inst().getPoiErrorReport().c()).a("poiId", this.f3754f).a().toString());
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65893, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStartRecodeLayout != null && this.A && this.B) {
            this.mStartRecordOutRing.clearAnimation();
            this.mStartRecodeLayout.startAnimation(com.ss.android.ugc.aweme.detail.a.a.b());
            this.mStartRecodeLayout.setVisibility(8);
            this.B = false;
            if (this.q != null) {
                this.q.dismiss();
                this.q = null;
            }
        }
    }

    public final void F() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65894, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStartRecodeLayout != null && this.A && !this.B) {
            this.mStartRecodeLayout.setVisibility(0);
            this.mStartRecodeLayout.startAnimation(com.ss.android.ugc.aweme.detail.a.a.a());
            this.B = true;
            this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
        }
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65881, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.x) {
            if (this.f3750b != null) {
                this.f3750b.j();
            }
            h();
            this.x = true;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65873, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            if (this.f3750b != null) {
                this.f3750b.j();
            }
            h();
            this.x = true;
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65853, new Class[0], Void.TYPE);
        } else if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.clearAnimation();
            this.mStartRecordOutRing.setVisibility(4);
            this.mStartRecodeLayout.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dj));
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65854, new Class[0], Void.TYPE);
        } else if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.setVisibility(0);
            this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
            this.mStartRecodeLayout.clearAnimation();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65878, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.mRecyclerView != null) {
            this.mRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (this.f3751c != null) {
            this.f3751c.k();
            this.f3751c.j();
            this.f3751c.p();
            this.f3751c.o();
        }
        if (this.u != null) {
            this.u.k();
            this.u.j();
            this.u.e();
        }
        if (this.v != null) {
            this.v.k();
            this.v.j();
        }
        if (this.f3750b != null) {
            this.f3750b.m();
        }
        this.w.a();
        e.a().a("key_container_poi");
        if (this.q != null) {
            this.q.d();
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65857, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.f3750b;
        if (PatchProxy.isSupport(new Object[0], iVar, i.f60800a, false, 65985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], iVar, i.f60800a, false, 65985, new Class[0], Void.TYPE);
            return;
        }
        if (iVar.j != null) {
            PoiAwemeFeedAdapter poiAwemeFeedAdapter = (PoiAwemeFeedAdapter) iVar.j;
            if (PatchProxy.isSupport(new Object[0], poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64756, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64756, new Class[0], Void.TYPE);
            } else if (poiAwemeFeedAdapter.g != null) {
                PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = poiAwemeFeedAdapter.g;
                if (PatchProxy.isSupport(new Object[0], poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64850, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64850, new Class[0], Void.TYPE);
                } else if (poiOptimizedDetailViewHolder.f59580d != null) {
                    poiOptimizedDetailViewHolder.f59580d.d();
                }
            }
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65860, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("click_share_button").setLabelName("poi_page").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("poi_id", this.f3754f).b()));
        com.ss.android.ugc.aweme.poi.e.h.a(this.f3753e, "click_share_poi_button", d.a().a("enter_from", "poi_page").a("poi_id", this.f3754f).a("poi_type", this.h).a("group_id", A()).a("previous_page", n()));
        if (!(this.j == null || this.y == null)) {
            this.y.show();
            com.ss.android.ugc.aweme.sec.a.a("share");
        }
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65863, new Class[0], Void.TYPE);
        } else if (this.f3752d != null) {
            String str = this.f3752d.from;
            d a2 = d.a();
            a2.a("enter_from", str).a("group_id", this.f3752d.awemeid).a("poi_type", this.f3752d.poiType).a("poi_id", this.f3752d.poiId).a("to_user_id", this.f3752d.toUserId).a("poi_channel", com.ss.android.ugc.aweme.u.aa.b()).a("enter_method", this.f3752d.clickMethod).a("author_id", this.f3752d.authorId).a("city_info", com.ss.android.ugc.aweme.u.aa.a()).a("distance_info", this.f3752d.distanceInfo).a(this.f3752d.forwardTypeV3Params);
            if (com.ss.android.ugc.aweme.u.aa.d(str)) {
                a2.a("log_pb", ai.a().a(this.f3752d.requestId));
                com.ss.android.ugc.aweme.poi.e.h.b(this.j, "request_poi_detail", a2);
                return;
            }
            com.ss.android.ugc.aweme.poi.e.h.a(this.j, "request_poi_detail", a2);
        }
    }

    public final void I() {
        IShareService.ShareStruct shareStruct;
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65898, new Class[0], Void.TYPE);
            return;
        }
        ck ckVar = new ck();
        ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList();
        ckVar.a(Arrays.asList(new String[]{"weixin_moments", "qzone", "weibo"}));
        ckVar.r = true;
        SimpleShareDialog simpleShareDialog = new SimpleShareDialog(getActivity(), ckVar);
        Context context = getContext();
        PoiStruct poiStruct = this.i.poiStruct;
        com.ss.android.ugc.aweme.commercialize.coupon.model.c couponInfo = this.i.getPoiActivityInfo().getCouponInfo();
        if (PatchProxy.isSupport(new Object[]{context, poiStruct, couponInfo}, null, i.f46055a, true, 42111, new Class[]{Context.class, PoiStruct.class, com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, IShareService.ShareStruct.class)) {
            shareStruct = (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, poiStruct, couponInfo}, null, i.f46055a, true, 42111, new Class[]{Context.class, PoiStruct.class, com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, IShareService.ShareStruct.class);
        } else {
            IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
            shareStruct2.identifier = poiStruct.getPoiId();
            if (context != null) {
                shareStruct2.appName = context.getString(C0906R.string.ak);
            } else {
                shareStruct2.appName = "抖音短视频";
            }
            shareStruct2.title = poiStruct.poiName;
            shareStruct2.description = couponInfo.getTitle();
            shareStruct2.thumbUrl = com.ss.android.ugc.aweme.base.c.a(couponInfo.getLogoImageUrl());
            shareStruct2.videoCover = couponInfo.getLogoImageUrl();
            shareStruct2.url = i.a(poiStruct.getShareInfo().getShareUrl());
            shareStruct2.shareText = String.format(context.getString(C0906R.string.a35), new Object[]{poiStruct.poiName, couponInfo.getTitle()});
            shareStruct2.groupId = 0;
            shareStruct2.itemId = 0;
            shareStruct2.adId = 0;
            shareStruct2.poiId = poiStruct.getPoiId();
            shareStruct2.enterFrom = "poi_page";
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("poi_name", poiStruct.poiName);
            hashMap.put("activity_id", String.valueOf(couponInfo.getActivityId()));
            hashMap.put("coupon_id", String.valueOf(couponInfo.getCouponId()));
            hashMap.put("coupon_desc", couponInfo.getTitle());
            shareStruct2.extraParams = hashMap;
            shareStruct2.itemType = "coupon";
            shareStruct = shareStruct2;
        }
        simpleShareDialog.updateShareStruct(shareStruct);
        a aVar = new a(this, shareStruct, String.valueOf(this.i.getPoiActivityInfo().getCouponInfo().getActivityId()), String.valueOf(this.i.getPoiActivityInfo().getCouponInfo().getCouponId()), (byte) 0);
        simpleShareDialog.setActionHandler(aVar);
        simpleShareDialog.setShareCallback(this);
        simpleShareDialog.show();
    }

    public final void r() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65855, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            String uuid = UUID.randomUUID().toString();
            r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("poi_page").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("poi_id", this.f3754f).b()));
            ak a2 = new ak().a("poi_page");
            a2.f75039c = this.f3754f;
            a2.p = uuid;
            if (com.ss.android.ugc.aweme.u.aa.d(this.f3752d.from)) {
                a2.r = true;
                ai a3 = ai.a();
                if (this.f3752d != null) {
                    str = this.f3752d.requestId;
                } else {
                    str = null;
                }
                a2.q = a3.a(str);
            }
            a2.e();
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                Intent intent = new Intent();
                intent.putExtra("shoot_way", "poi_page");
                intent.putExtra("creation_id", uuid);
                PoiContext poiContext = new PoiContext();
                poiContext.mShootPoiId = this.f3754f;
                poiContext.mShootPoiName = this.g;
                poiContext.setLat(this.j.getPoiLatitude());
                poiContext.setLng(this.j.getPoiLongitude());
                if (this.f3752d.hasActivity) {
                    if (w().s()) {
                        poiContext.mPoiActivity = w().t();
                    } else {
                        poiContext.mSelectPoiId = this.f3754f;
                        poiContext.mSelectPoiName = this.g;
                    }
                } else if (!TextUtils.isEmpty(this.f3752d.challengeId) || !TextUtils.isEmpty(this.f3752d.challengeId)) {
                    poiContext.mSelectPoiId = this.f3754f;
                    poiContext.mSelectPoiName = this.g;
                }
                intent.putExtra("poi_struct_in_tools_line", PoiContext.serializeToStr(poiContext));
                intent.putExtra("first_face_sticker", this.f3752d.sticker);
                intent.putExtra("challenge_id", this.f3752d.challengeId);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) getActivity(), intent);
                return;
            }
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, "poi_page", "click_record");
        }
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3749a, false, 65891, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3749a, false, 65891, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.s) {
            if (i3 > 30) {
                E();
                return;
            }
            if (i3 < -30) {
                F();
            }
        }
    }

    public final void b(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3749a, false, 65897, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3749a, false, 65897, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) exc2).getErrorMsg()).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), getString(C0906R.string.a2n)).a();
            }
        }
    }

    @OnClick({2131493213, 2131497081})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3749a, false, 65859, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3749a, false, 65859, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ix) {
            if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65861, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65861, new Class[0], Void.TYPE);
            } else {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    u();
                    activity.onBackPressed();
                }
            }
        } else if (id == C0906R.id.cp9) {
            t();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3749a, false, 65867, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3749a, false, 65867, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putBoolean("permissionGranted", this.k);
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
        IShareService.ShareResult shareResult2 = shareResult;
        if (PatchProxy.isSupport(new Object[]{shareResult2}, this, f3749a, false, 65889, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult2}, this, f3749a, false, 65889, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
            return;
        }
        if (shareResult2 != null) {
            r.onEvent(MobClick.obtain().setEventName("share_poi_page").setLabelName(shareResult2.type).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("poi_id", this.f3754f).b()));
        }
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3749a, false, 65875, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3749a, false, 65875, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (this.f3750b != null) {
            this.f3750b.d(z2);
        }
        if (z2) {
            h();
        } else {
            L_();
        }
    }

    public void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3749a, false, 65849, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3749a, false, 65849, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        if (bundle != null) {
            this.f3752d = (l) bundle.getSerializable("poi_bundle");
            if (this.f3752d != null) {
                str = this.f3752d.poiId;
            } else {
                str = "";
            }
            this.f3754f = str;
            if (this.f3752d != null) {
                str2 = this.f3752d.poiName;
            } else {
                str2 = "";
            }
            this.g = str2;
            if (this.f3752d != null) {
                str3 = this.f3752d.poiType;
            } else {
                str3 = "";
            }
            this.h = str3;
            if (!com.ss.android.g.a.a() && this.f3752d != null && this.f3752d.hasActivity()) {
                z2 = true;
            }
            this.r = z2;
            if (this.r) {
                this.z = true;
            }
        }
    }

    public void b(com.ss.android.ugc.aweme.poi.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3749a, false, 65866, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3749a, false, 65866, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
            return;
        }
        if (!(!isViewValid() || aVar == null || this.f3750b == null)) {
            i iVar = this.f3750b;
            if (PatchProxy.isSupport(new Object[0], iVar, i.f60800a, false, 65992, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], iVar, i.f60800a, false, 65992, new Class[0], Void.TYPE);
            } else if (iVar.j != null && ((PoiAwemeFeedAdapter) iVar.j).getItemCount() > 0) {
                ((PoiAwemeFeedAdapter) iVar.j).notifyItemChanged(0, "UPDATE_LOCATION");
            }
        }
    }

    public boolean checkStatus(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3749a, false, 65883, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f3749a, false, 65883, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!cg.a(str, 5)) {
            return true;
        } else {
            if (PatchProxy.isSupport(new Object[]{str}, this, f3749a, false, 65884, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f3749a, false, 65884, new Class[]{String.class}, Void.TYPE);
            } else if (!(getActivity() == null || this.j == null)) {
                new ShareCommandFactory(getActivity(), str, this.j.getShareInfo()).a("sslocal://poi/detail?id=" + this.f3754f, 7, this.f3754f);
            }
            return false;
        }
    }

    public final void a(RecyclerView.OnScrollListener onScrollListener) {
        RecyclerView.OnScrollListener onScrollListener2 = onScrollListener;
        if (PatchProxy.isSupport(new Object[]{onScrollListener2}, this, f3749a, false, 65856, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScrollListener2}, this, f3749a, false, 65856, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE);
            return;
        }
        i iVar = this.f3750b;
        if (PatchProxy.isSupport(new Object[]{onScrollListener2}, iVar, i.f60800a, false, 65984, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE)) {
            Object[] objArr = {onScrollListener2};
            i iVar2 = iVar;
            ChangeQuickRedirect changeQuickRedirect = i.f60800a;
            PatchProxy.accessDispatch(objArr, iVar2, changeQuickRedirect, false, 65984, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE);
        } else {
            iVar.mRecyclerView.addOnScrollListener(onScrollListener2);
        }
        this.mRecyclerView.setOnTouchListener(new d(this));
    }

    public final void a(com.ss.android.ugc.aweme.poi.a aVar) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3749a, false, 65865, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3749a, false, 65865, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(getContext())) {
                if (!this.f3750b.f60805f && this.mStatusView != null) {
                    this.mStatusView.f();
                }
            } else if (aVar == null) {
                i iVar = this.f3750b;
                if (this.f3752d != null) {
                    z3 = this.f3752d.isPreviewMode;
                }
                iVar.a(z3, "", "", this.r);
            } else {
                String[] a2 = p.a(aVar);
                i iVar2 = this.f3750b;
                if (this.f3752d != null) {
                    z2 = this.f3752d.isPreviewMode;
                } else {
                    z2 = false;
                }
                iVar2.a(z2, a2[0], a2[1], this.r);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.poi.model.af afVar) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{afVar}, this, f3749a, false, 65896, new Class[]{com.ss.android.ugc.aweme.poi.model.af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, f3749a, false, 65896, new Class[]{com.ss.android.ugc.aweme.poi.model.af.class}, Void.TYPE);
        } else if (afVar != null && isViewValid() && getContext() != null) {
            i x2 = x();
            if (x2 != null) {
                com.ss.android.ugc.aweme.commercialize.coupon.model.c couponInfo = afVar.getCouponInfo();
                if (couponInfo != null) {
                    if (this.i.couponShareSetting == null || this.i.couponShareSetting.shareFlag != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    boolean z4 = !TextUtils.isEmpty(this.i.getBookUrl());
                    if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40076, new Class[0], Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40076, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z3 = com.ss.android.ugc.aweme.base.sharedpref.e.d().a("show_coupon_guide_dialog", false);
                    }
                    if (z4) {
                        com.ss.android.ugc.aweme.poi.ui.coupon.b bVar = new com.ss.android.ugc.aweme.poi.ui.coupon.b(getContext(), couponInfo, true, this.i.getBookUrl(), z2, this.f3753e, this);
                        bVar.show();
                    } else if (!z3) {
                        com.ss.android.ugc.aweme.poi.ui.coupon.b bVar2 = new com.ss.android.ugc.aweme.poi.ui.coupon.b(getContext(), couponInfo, false, this.i.getBookUrl(), z2, this.f3753e, this);
                        bVar2.show();
                    } else if (z2) {
                        c cVar = new c(getContext(), this.i.couponShareSetting.shareText, String.valueOf(couponInfo.getCouponId()), this.f3753e, this);
                        cVar.show();
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.c(getContext(), getString(C0906R.string.a37)).a();
                    }
                    if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40075, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40075, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.base.sharedpref.e.d().b("show_coupon_guide_dialog", true);
                    }
                    if (PatchProxy.isSupport(new Object[]{couponInfo}, x2, i.f60800a, false, 65995, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{couponInfo}, x2, i.f60800a, false, 65995, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE);
                        return;
                    }
                    if (x2.j != null && ((PoiAwemeFeedAdapter) x2.j).getItemCount() > 0) {
                        PoiAwemeFeedAdapter poiAwemeFeedAdapter = (PoiAwemeFeedAdapter) x2.j;
                        if (PatchProxy.isSupport(new Object[]{couponInfo}, poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64752, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{couponInfo}, poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64752, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE);
                        } else if (poiAwemeFeedAdapter.g != null) {
                            poiAwemeFeedAdapter.g.a(couponInfo);
                        }
                    }
                }
            }
        }
    }

    public boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        String str2 = str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct, str2}, this, f3749a, false, 65885, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str2}, this, f3749a, false, 65885, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.equals(str2, "chat_merge") && !TextUtils.equals(str2, "TYPE_POI_ENTERPRISE_CLAIM") && !TextUtils.equals(str2, "qr_code") && !TextUtils.equals(str2, "TYPE_POI_CORRECT") && !cg.b(str)) {
            com.ss.android.ugc.aweme.poi.e.h.a(this.f3753e, "share_poi", d.a().a("enter_from", "poi_page").a("previous_page", n()).a("poi_id", this.f3754f).a("platform", str2));
        }
        if (TextUtils.equals("copy", str2)) {
            if (PatchProxy.isSupport(new Object[0], this, f3749a, false, 65886, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3749a, false, 65886, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.j == null) {
                return false;
            } else {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
                shareStruct2.url = this.j.getShareInfo().getShareUrl();
                if (this.j.getShareInfo().getBoolPersist() == 1) {
                    z2 = true;
                }
                shareStruct2.boolPersist = z2;
                String a2 = cg.a(shareStruct2, "copy");
                String str3 = this.j.getShareInfo().getShareTitle() + " " + a2;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str3));
                com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                r.a((Context) getActivity(), "share_poi_page", "copy", this.f3754f, 0);
                return true;
            }
        } else if (TextUtils.equals(str2, "qr_code")) {
            if (cg.c()) {
                new z(getActivity(), new bt.a().a(this.j.poiName, (long) this.i.getVisitors()).a(7, this.f3754f, "poi_page").f64830b).show();
            } else {
                Context context = getContext();
                d.a a3 = new d.a().a(7, this.f3754f, "poi_page");
                String str4 = this.j.poiName;
                int visitors = this.i.getVisitors();
                if (PatchProxy.isSupport(new Object[]{str4, Integer.valueOf(visitors)}, a3, d.a.f63386a, false, 70360, new Class[]{String.class, Integer.TYPE}, d.a.class)) {
                    a3 = (d.a) PatchProxy.accessDispatch(new Object[]{str4, Integer.valueOf(visitors)}, a3, d.a.f63386a, false, 70360, new Class[]{String.class, Integer.TYPE}, d.a.class);
                } else {
                    a3.f63387b.title = str4;
                    a3.f63387b.describe = String.valueOf(visitors);
                }
                QRCodeActivityV2.a(context, a3.f63387b);
            }
            com.ss.android.ugc.aweme.poi.e.h.a(this.j, "click_qr_code", com.ss.android.ugc.aweme.app.d.d.a().a("poi_id", this.f3754f).a("platform", "scan").a("qr_code_type", "shaped").a("enter_from", "poi_page"));
            return true;
        } else if (TextUtils.equals(str2, "chat_merge")) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("share_struct", this.y.getShareStruct());
            com.ss.android.ugc.aweme.im.b.a().enterChooseContact(getContext(), bundle, null);
            return true;
        } else if (TextUtils.equals(str2, "TYPE_POI_ENTERPRISE_CLAIM")) {
            com.ss.android.ugc.aweme.poi.e.h.a(this.f3753e, "click_im_seller", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("poi_id", this.f3753e.getPoiId()).a("poi_type", this.f3753e.getPoiType()));
            try {
                com.ss.android.ugc.aweme.ag.h.a().a(com.ss.android.ugc.aweme.music.util.f.a(com.ss.android.ugc.aweme.global.config.settings.g.b().aq().getMerchantSettleUrl()).a("enter_from", "poi_page").a().toString());
            } catch (com.bytedance.ies.a unused) {
                Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
                intent.setData(Uri.parse(this.i.getEnterpriseClaimUrl()));
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("hide_status_bar", false);
                intent.putExtra("bundle_user_webview_title", true);
                getContext().startActivity(intent);
            }
            return true;
        } else if (TextUtils.equals(str2, "TYPE_POI_CORRECT")) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                com.ss.android.ugc.aweme.login.e.a((Activity) getActivity(), "poi_page", "click_poi_feedback", (com.ss.android.ugc.aweme.base.component.f) new com.ss.android.ugc.aweme.base.component.f() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60390a;

                    public final void a(Bundle bundle) {
                        if (PatchProxy.isSupport(new Object[]{null}, this, f60390a, false, 65908, new Class[]{Bundle.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{null}, this, f60390a, false, 65908, new Class[]{Bundle.class}, Void.TYPE);
                        }
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f60390a, false, 65907, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f60390a, false, 65907, new Class[0], Void.TYPE);
                            return;
                        }
                        AbsPoiAwemeFeedFragment.this.B();
                    }
                });
                return true;
            }
            B();
            return true;
        } else if (!cg.b(str)) {
            return false;
        } else {
            new z(getActivity(), new bt.a().a(this.j.poiName, (long) this.i.getVisitors()).a(7, this.f3754f, "poi_page").f64830b, 7, str2).show();
            com.ss.android.ugc.aweme.poi.e.h.a(this.f3753e, "share_poi", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("previous_page", n()).a("poi_id", this.f3754f).a("platform", str2).a("share_mode", "shaped_qr_code").a("enter_method", "normal_share"));
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3749a, false, 65851, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3749a, false, 65851, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.k = bundle.getBoolean("permissionGranted");
        }
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getActivity()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new a(this)).f20493a;
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(cVar).a(new c.a(getActivity()).b((int) C0906R.string.b5r).c(C0906R.string.b6y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new b(this)).f20493a));
        this.f3750b = x();
        this.f3751c = w();
        this.f3751c.a((Fragment) this, e());
        this.u = new com.ss.android.ugc.aweme.newfollow.f.f(this.n, n(), this.o);
        this.u.d();
        this.w = new ScreenBroadcastReceiver(getContext());
        this.w.a(this);
        this.u.a(new com.ss.android.ugc.aweme.feed.h.aa());
        this.u.a((j) this.f3750b);
        this.f3751c.a(this.f3750b);
        this.f3753e = this.f3750b.a(this.f3752d);
        this.f3750b.r = z();
        this.f3750b.a(this, view, this.f3751c, (com.ss.android.ugc.aweme.newfollow.b.a) this.u);
        this.t = y();
        this.f3751c.a(this.t);
        this.v = new com.ss.android.ugc.aweme.poi.nearby.b.a();
        this.v.a(new com.ss.android.ugc.aweme.poi.model.u());
        this.v.a(this);
        if (!this.k) {
            if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) getActivity(), af.f2626c)) {
                com.ss.android.ugc.aweme.utils.permission.a.a((Activity) getActivity(), 65282, af.f2626c, (a.C0792a) new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60384a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f60384a, false, 65904, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f60384a, false, 65904, new Class[0], Void.TYPE);
                            return;
                        }
                        AbsPoiAwemeFeedFragment.this.b((com.ss.android.ugc.aweme.poi.a) null);
                        AbsPoiAwemeFeedFragment.this.a((com.ss.android.ugc.aweme.poi.a) null);
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f60384a, false, 65903, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f60384a, false, 65903, new Class[0], Void.TYPE);
                            return;
                        }
                        AbsPoiAwemeFeedFragment.this.k = true;
                        com.ss.android.ugc.aweme.poi.a a2 = af.a(AbsPoiAwemeFeedFragment.this.getContext()).a((f) AbsPoiAwemeFeedFragment.this);
                        if (a2 != null) {
                            af.a(AbsPoiAwemeFeedFragment.this.getContext()).d();
                            AbsPoiAwemeFeedFragment.this.b(a2);
                        }
                        AbsPoiAwemeFeedFragment.this.a(a2);
                    }
                });
                this.mStatusView.d();
            } else {
                this.k = true;
                com.ss.android.ugc.aweme.poi.a a2 = af.a(getContext()).a((f) this);
                if (a2 != null) {
                    af.a(getContext()).d();
                    b(a2);
                }
                a(a2);
            }
            if (this.mStartRecodeLayout != null) {
                boolean z2 = this.z;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3749a, false, 65892, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3749a, false, 65892, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    this.A = z2;
                    View view2 = this.mStartRecodeLayout;
                    if (!z2) {
                        i2 = 8;
                    }
                    v.a(view2, i2);
                }
                if (this.z) {
                    this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
                    this.mStartRecodeLayout.setOnTouchListener(new View.OnTouchListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60386a;

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f60386a, false, 65905, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f60386a, false, 65905, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                            }
                            switch (motionEvent.getAction()) {
                                case 0:
                                    AbsPoiAwemeFeedFragment.this.p();
                                    break;
                                case 1:
                                    AbsPoiAwemeFeedFragment.this.q();
                                    break;
                            }
                            return false;
                        }
                    });
                    this.mStartRecodeLayout.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60388a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f60388a, false, 65906, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f60388a, false, 65906, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (AbsPoiAwemeFeedFragment.this.q != null) {
                                AbsPoiAwemeFeedFragment.this.q.dismiss();
                                AbsPoiAwemeFeedFragment.this.q = null;
                            }
                            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                            if (curUser != null && curUser.isLive()) {
                                com.bytedance.ies.dmt.ui.d.a.c(AbsPoiAwemeFeedFragment.this.getContext(), (int) C0906R.string.b3m).a();
                            } else if (ChooseMusicActivity.a(AbsPoiAwemeFeedFragment.this.getContext())) {
                                AbsPoiAwemeFeedFragment.this.r();
                            }
                        }
                    });
                }
                this.mRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f3749a, false, 65895, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f3749a, false, 65895, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.a(str, Integer.valueOf(i2));
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3749a, false, 65850, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3749a, false, 65850, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(k(), viewGroup2, false);
        com.ss.android.ugc.aweme.common.ui.b.a(inflate.findViewById(C0906R.id.cv0));
        if (p.d()) {
            inflate.findViewById(C0906R.id.cp9).setVisibility(8);
        }
        return inflate;
    }
}
