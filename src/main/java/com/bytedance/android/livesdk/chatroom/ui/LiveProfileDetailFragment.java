package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.Animator;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.g;
import com.bytedance.android.live.base.model.user.m;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.event.am;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.bytedance.android.livesdk.chatroom.presenter.ap;
import com.bytedance.android.livesdk.chatroom.presenter.aq;
import com.bytedance.android.livesdk.chatroom.presenter.ar;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.v;
import com.bytedance.android.livesdk.utils.y;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import org.aspectj.lang.a;

public class LiveProfileDetailFragment extends BaseFragment implements View.OnClickListener, af.a {
    private static final int G;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11636a;
    private static final /* synthetic */ a.C0900a aS;
    public String A;
    public String B;
    boolean C;
    public List<b> D;
    boolean E;
    BaseDialogFragment F;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private View R;
    private View S;
    private ImageView T;
    private View U;
    private ImageView V;
    private View W;
    private ImageView X;
    private View Y;
    private TextView Z;
    private LinearLayout aA;
    private TextView aB;
    private LinearLayout aC;
    private LinearLayout aD;
    private LinearLayout aE;
    private TextView aF;
    private TextView aG;
    private View aH;
    private LinearLayout aI;
    private ImageView aJ;
    private Animator[] aK = {null, null};
    private Animator[] aL = {null, null};
    private boolean aM;
    private boolean aN;
    private FansClubData aO;
    private boolean aP = true;
    private boolean aQ = true;
    private boolean aR = true;
    private TextView aa;
    private View ab;
    private View ac;
    private View ad;
    private View ae;
    private HSImageView af;
    private TextView ag;
    private HSImageView ah;
    private TextView ai;
    private HSImageView aj;
    private TextView ak;
    private HSImageView al;
    private TextView am;
    private View an;
    private HSImageView ao;
    private TextView ap;
    private TextView aq;
    private View ar;
    private TextView as;
    private RecyclerView at;
    private UserFeatureLabelListAdapter au;
    private LinearLayout av;
    private LinearLayout aw;
    private LinearLayout ax;
    private TextView ay;
    private TextView az;

    /* renamed from: b  reason: collision with root package name */
    TextView f11637b;

    /* renamed from: c  reason: collision with root package name */
    public View f11638c;
    Activity h;
    DataCenter i;
    public View j;
    public View k;
    public View l;
    View m;
    public View n;
    View o;
    Animator p;
    Animator q;
    User r;
    int s;
    boolean t;
    long u;
    Room v;
    y w;
    boolean x;
    af y;
    int z;

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11636a, false, 6103, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11636a, false, 6103, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
        } else if (this.aN && this.r != null && this.r.getFollowInfo() != null && ((int) this.r.getFollowInfo().f7764d) != aVar.a()) {
            this.r.setFollowStatus(aVar.a());
            b(this.r);
        }
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11636a, false, 6104, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11636a, false, 6104, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.aN) {
            if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
                ai.a(((com.bytedance.android.live.a.a.b.a) th2).getPrompt());
            } else {
                ai.a((int) C0906R.string.d9g);
            }
        }
    }

    static {
        int i2;
        if (PatchProxy.isSupport(new Object[0], null, f11636a, true, 6115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11636a, true, 6115, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveProfileDetailFragment.java", LiveProfileDetailFragment.class);
            aS = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 719);
        }
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.f()) {
            i2 = 12;
        } else {
            i2 = 17;
        }
        G = i2;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6109, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.aN = false;
        a(this.aK[0]);
        a(this.aK[1]);
        a(this.aL[0]);
        a(this.aL[1]);
        a(this.p);
        a(this.q);
    }

    private void b() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6098, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live_detail");
        hashMap.put("action_type", "click");
        hashMap.put("event_module", "right_anchor");
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "right_anchor");
        hashMap.put("anchor_id", String.valueOf(this.r.getId()));
        hashMap.put("room_id", String.valueOf(this.r.getLiveRoomId()));
        hashMap.put("right_user_id", String.valueOf(this.r.getId()));
        if (this.v.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put("live_type", str);
        if (LinkCrossRoomDataHolder.a().f9030d > 0) {
            hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.a().f9030d));
            hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.a().f9031e));
            if (LinkCrossRoomDataHolder.a().i == 0) {
                str2 = "anchor";
            } else {
                str2 = PushConstants.URI_PACKAGE_NAME;
            }
            hashMap.put("connection_type", str2);
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            hashMap.put("enter_from_merge", "live_detail");
            hashMap.put("enter_method", "right_anchor");
        }
        com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, new Object[0]);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6112, new Class[0], Void.TYPE);
            return;
        }
        this.H.getPaint().setFakeBoldText(true);
        this.P.setTextColor(getResources().getColor(C0906R.color.a99));
        UIUtils.setViewVisibility(this.L, 8);
        UIUtils.setViewVisibility(this.K, 8);
        if (this.s == 0 || this.s == 2) {
            UIUtils.setViewVisibility(this.aC, 8);
            UIUtils.setViewVisibility(this.aw, 8);
            UIUtils.setViewVisibility(this.aA, 0);
            UIUtils.setViewVisibility(this.av, 0);
            UIUtils.setViewVisibility(this.aI, 8);
            UIUtils.setViewVisibility(this.aC, 0);
            if (this.r.getAuthorInfo() != null) {
                this.az.setText(a(v.a(this.r.getAuthorInfo().f7746a), G));
                this.aB.setText(a(v.a(this.r.getAuthorInfo().f7747b), G));
            } else {
                this.aB.setText(PushConstants.PUSH_TYPE_NOTIFY);
                this.az.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
        } else {
            UIUtils.setViewVisibility(this.aC, 8);
        }
        if (!TextUtils.isEmpty(this.r.getVerifiedContent())) {
            UIUtils.setViewVisibility(this.aD, 0);
            this.aF.setText(this.r.getVerifiedContent());
        } else {
            UIUtils.updateLayoutMargin(this.aE, -1, (int) UIUtils.dip2Px(getContext(), 14.0f), -1, -1);
        }
        if (!TextUtils.isEmpty(this.r.getSignature())) {
            UIUtils.setViewVisibility(this.aE, 0);
            this.aG.setText(this.r.getSignature());
        }
        if (this.r.displayId == null || this.r.displayId.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
            UIUtils.setViewVisibility(this.aH, 8);
            UIUtils.setViewVisibility(this.J, 8);
        }
        if (TextUtils.isEmpty(this.r.getCity())) {
            UIUtils.setViewVisibility(this.aH, 8);
            UIUtils.setViewVisibility(this.I, 8);
            UIUtils.setViewVisibility(this.aJ, 8);
        }
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f11636a, false, 6111, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f11636a, false, 6111, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setCameraDistance(getResources().getDisplayMetrics().density * 16000.0f);
    }

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11636a, false, 6105, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11636a, false, 6105, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar.f18619a;
        if (aVar2 != null && aVar2.f18689a == this.u) {
            a(aVar2);
        }
    }

    private void c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f11636a, false, 6100, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f11636a, false, 6100, new Class[]{User.class}, Void.TYPE);
        } else if (((Integer) e.a().f9041c).intValue() == 2) {
            ai.a((int) C0906R.string.d57);
        } else {
            if (this.s == 0) {
                this.w.a("live_audience_c_anchor", user.getId());
            } else if (this.s == 2) {
                this.w.a("right_anchor", user.getId());
            } else {
                this.w.a("live_audience_c_audience", user.getId());
            }
            this.w.a(user.getIdStr());
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.i.get("log_enter_live_source"));
            hashMap.put("sec_user_id", user.getSecUid());
            j.q().m().a(user.getId(), null, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f11636a, false, 6114, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f11636a, false, 6114, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            if (!user.isFollowing()) {
                UIUtils.setViewVisibility(this.Z, 0);
                UIUtils.setViewVisibility(this.aa, 8);
                return;
            }
            UIUtils.setViewVisibility(this.Z, 8);
            UIUtils.setViewVisibility(this.aa, 0);
            if (com.bytedance.android.live.uikit.a.a.j()) {
                String string = getResources().getString(C0906R.string.d9l);
                if (user.getFollowInfo() != null && user.getFollowInfo().f7764d == 2) {
                    string = getResources().getString(C0906R.string.cvm);
                }
                if (this.aa != null) {
                    this.aa.setText(string);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        if (PatchProxy.isSupport(new Object[]{animator}, this, f11636a, false, 6110, new Class[]{Animator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animator}, this, f11636a, false, 6110, new Class[]{Animator.class}, Void.TYPE);
        } else if (animator != null) {
            animator.removeAllListeners();
            if (animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    public final void a(User user) {
        boolean z2;
        boolean z3;
        FansClubData fansClubData;
        if (PatchProxy.isSupport(new Object[]{user}, this, f11636a, false, 6095, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f11636a, false, 6095, new Class[]{User.class}, Void.TYPE);
        } else if (!this.aN || user == null || user.getId() <= 0) {
            if (this.ae != null) {
                this.ae.setVisibility(8);
            }
        } else {
            if (this.ae.getVisibility() == 8) {
                this.ae.setVisibility(0);
            }
            if (this.w == null) {
                this.w = new y(this.h, this.v, user.getId());
            }
            this.r = user;
            this.u = this.r.getId();
            long b2 = TTLiveSDKContext.getHostService().k().b();
            if (b2 == this.u) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.aM = z2;
            if (this.v.getOwner().getId() == this.u) {
                this.s = 0;
            } else if (LinkCrossRoomDataHolder.a().f9032f == this.u) {
                this.s = 2;
            } else {
                this.s = 1;
            }
            if (b2 == this.v.getOwner().getId()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.t = z3;
            this.au.a(this.r.getBadgeImageList());
            this.au.f11795b = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11639a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f11640c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f11639a, true, 6130, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f11639a, true, 6130, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveProfileDetailFragment.java", AnonymousClass1.class);
                    f11640c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 439);
                }

                public void onClick(View view) {
                    boolean z;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    View view2 = view;
                    boolean z2 = false;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f11639a, false, 6129, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f11639a, false, 6129, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11640c, this, this, view2));
                    if (view.getTag() instanceof ImageModel) {
                        ImageModel imageModel = (ImageModel) view.getTag();
                        if (!StringUtils.isEmpty(imageModel.getSchema()) && LiveProfileDetailFragment.this.getContext() != null) {
                            LiveProfileDetailFragment liveProfileDetailFragment = LiveProfileDetailFragment.this;
                            String schema = imageModel.getSchema();
                            if (PatchProxy.isSupport(new Object[]{schema}, liveProfileDetailFragment, LiveProfileDetailFragment.f11636a, false, 6113, new Class[]{String.class}, Boolean.TYPE)) {
                                LiveProfileDetailFragment liveProfileDetailFragment2 = liveProfileDetailFragment;
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{schema}, liveProfileDetailFragment2, LiveProfileDetailFragment.f11636a, false, 6113, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                            } else if (liveProfileDetailFragment.i != null) {
                                Uri parse = Uri.parse(schema);
                                if (TextUtils.equals("webcast_webview", parse.getHost()) || TextUtils.equals("http", parse.getHost()) || TextUtils.equals("https", parse.getHost())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    String queryParameter = parse.getQueryParameter(PushConstants.WEB_URL);
                                    if (!StringUtils.isEmpty(queryParameter)) {
                                        boolean booleanValue = ((Boolean) liveProfileDetailFragment.i.get("data_is_portrait", Boolean.TRUE)).booleanValue();
                                        if (!(liveProfileDetailFragment.getContext() == null || liveProfileDetailFragment.getContext().getResources() == null)) {
                                            int px2dip = UIUtils.px2dip(liveProfileDetailFragment.getContext(), (float) ak.a(liveProfileDetailFragment.getContext()));
                                            if (booleanValue) {
                                                i = 440;
                                            } else {
                                                i = px2dip;
                                            }
                                            if (liveProfileDetailFragment.F != null) {
                                                liveProfileDetailFragment.F.dismissAllowingStateLoss();
                                                liveProfileDetailFragment.F = null;
                                            }
                                            com.bytedance.android.livesdk.browser.c.b f2 = j.q().f();
                                            b.C0073b b2 = c.a(queryParameter).a(px2dip).b(i);
                                            int i5 = 8;
                                            if (booleanValue) {
                                                i2 = 0;
                                            } else {
                                                i2 = 8;
                                            }
                                            if (booleanValue) {
                                                i3 = 0;
                                            } else {
                                                i3 = 8;
                                            }
                                            b.C0073b b3 = b2.a(8, 8, i2, i3).b(!booleanValue);
                                            if (booleanValue) {
                                                i5 = 0;
                                            }
                                            b.C0073b c2 = b3.c(i5);
                                            if (booleanValue) {
                                                i4 = 80;
                                            } else {
                                                i4 = 8388613;
                                            }
                                            liveProfileDetailFragment.F = f2.a(c2.e(i4).c(false));
                                            if (liveProfileDetailFragment.F != null) {
                                                BaseDialogFragment.a((FragmentActivity) liveProfileDetailFragment.getContext(), (DialogFragment) liveProfileDetailFragment.F);
                                            }
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            if (!z2) {
                                j.q().m().a(LiveProfileDetailFragment.this.getContext(), imageModel.getSchema());
                            }
                        }
                    }
                }
            };
            if (com.bytedance.android.live.uikit.a.a.h()) {
                this.H.setText(this.r.displayId);
            } else {
                this.H.setText(this.r.getNickName());
            }
            if (this.r.getGender() == 1) {
                if (com.bytedance.android.live.uikit.a.a.b()) {
                    this.as.setText(C0906R.string.cxq);
                    UIUtils.setViewVisibility(this.as, 0);
                }
            } else if (this.r.getGender() == 2) {
                if (com.bytedance.android.live.uikit.a.a.b()) {
                    this.as.setText(C0906R.string.cxp);
                    UIUtils.setViewVisibility(this.as, 0);
                }
            } else if (com.bytedance.android.live.uikit.a.a.b()) {
                this.as.setText(C0906R.string.cxr);
                UIUtils.setViewVisibility(this.as, 0);
            } else {
                UIUtils.setViewVisibility(this.as, 8);
            }
            if (TextUtils.isEmpty(this.r.getCity()) || com.bytedance.android.live.uikit.a.a.g()) {
                this.I.setText(C0906R.string.dfd);
            } else {
                this.I.setText(this.r.getCity());
            }
            if (!TextUtils.isEmpty(this.r.getSpecialId())) {
                this.J.setVisibility(8);
                this.f11637b.setVisibility(0);
                this.f11637b.setText(ac.a((int) C0906R.string.cto, this.r.getSpecialId()));
                this.f11637b.postDelayed(new cx(this), 1000);
            } else {
                this.J.setVisibility(0);
                this.f11637b.setVisibility(8);
                this.f11638c.setVisibility(8);
                this.J.setText(ac.a((int) C0906R.string.d9p, this.r.displayId));
            }
            if (!this.r.isVerified() || TextUtils.isEmpty(this.r.getVerifiedReason())) {
                this.K.setVisibility(8);
            } else {
                this.K.setText(this.r.getVerifiedReason());
                this.K.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.r.getSignature())) {
                this.L.setText(C0906R.string.cuz);
            } else {
                this.L.setText(this.r.getSignature());
            }
            this.L.setMaxLines(2);
            this.O.setText(a(v.a(this.r.getFanTicketCount()), G));
            g followInfo = this.r.getFollowInfo();
            if (followInfo != null) {
                this.M.setText(a(v.a(followInfo.f7762b), G));
                this.N.setText(a(v.a(followInfo.f7763c), G));
            } else {
                this.M.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (followInfo != null) {
                this.N.setText(a(v.a(followInfo.f7763c), G));
            } else {
                this.N.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (this.r.getUserHonor() != null) {
                this.P.setText(a(v.a(this.r.getUserHonor().f()), G));
            } else {
                this.P.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
            this.Q.setText(C0906R.string.d_1);
            if (CollectionUtils.isEmpty(this.r.getTopFans()) || com.bytedance.android.livesdkapi.a.a.f18614b) {
                this.R.setVisibility(8);
            } else {
                int size = this.r.getTopFans().size();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    User user2 = this.r.getTopFans().get(i3);
                    if (user2 != null) {
                        if (i2 == 1) {
                            com.bytedance.android.livesdk.chatroom.f.b.b(this.T, user2.getAvatarThumb(), this.T.getWidth(), this.T.getHeight(), 0);
                            this.S.setVisibility(0);
                            this.S.setTag(C0906R.id.hk, user2);
                            this.S.setOnClickListener(this);
                        } else if (i2 == 2) {
                            com.bytedance.android.livesdk.chatroom.f.b.b(this.V, user2.getAvatarThumb(), this.V.getWidth(), this.V.getHeight(), 0);
                            this.U.setVisibility(0);
                            this.U.setTag(C0906R.id.hk, user2);
                            this.U.setOnClickListener(this);
                        } else if (i2 == 3) {
                            com.bytedance.android.livesdk.chatroom.f.b.b(this.X, user2.getAvatarThumb(), this.X.getWidth(), this.X.getHeight(), 0);
                            this.W.setVisibility(0);
                            this.W.setTag(C0906R.id.hk, user2);
                            this.W.setOnClickListener(this);
                        }
                        i2++;
                    }
                }
                if (this.aQ) {
                    this.R.setVisibility(0);
                }
            }
            if (this.aM && this.t) {
                this.Y.setVisibility(8);
            } else if (this.aM) {
                this.Z.setVisibility(8);
                this.aa.setVisibility(8);
                this.ab.setVisibility(8);
                if (this.aP) {
                    UIUtils.setViewVisibility(this.ac, 0);
                    this.ac.setTag(this.r);
                }
                this.Y.setVisibility(8);
            } else {
                b(this.r);
                this.Z.setOnClickListener(this);
                this.aa.setOnClickListener(this);
                if (LinkCrossRoomDataHolder.a().f9032f == this.r.getId() || this.z == 2) {
                    this.ab.setVisibility(8);
                } else {
                    this.ab.setVisibility(0);
                    this.ab.setOnClickListener(this);
                }
                if (this.t) {
                    UIUtils.setViewVisibility(this.ac, 8);
                    UIUtils.setViewVisibility(this.ad, 8);
                } else if (LinkCrossRoomDataHolder.a().f9032f == this.r.getId()) {
                    UIUtils.setViewVisibility(this.ac, 0);
                    UIUtils.setViewVisibility(this.ad, 0);
                    this.ad.setOnClickListener(this);
                    b();
                } else {
                    UIUtils.setViewVisibility(this.ad, 8);
                    if (this.aP) {
                        UIUtils.setViewVisibility(this.ac, 0);
                        this.ac.setTag(this.r);
                    }
                }
                this.Y.setVisibility(0);
            }
            FansClubMember fansClub = this.r.getFansClub();
            if (fansClub != null) {
                if (fansClub.getPreferData() == null || fansClub.getPreferData().size() <= 0) {
                    fansClubData = null;
                } else {
                    fansClubData = fansClub.getPreferData().get(0);
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel = fansClubData.badge.icons.get(1);
                    if (imageModel != null) {
                        com.bytedance.android.livesdk.chatroom.f.b.a(this.ao, imageModel);
                        this.ap.setText(fansClubData.clubName);
                        this.aq.setText(ac.a((int) C0906R.string.cwb, String.valueOf(fansClubData.level)));
                        if (this.aR) {
                            this.an.setVisibility(0);
                        }
                    }
                    this.aO = fansClubData;
                }
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                c();
            }
            if (com.bytedance.android.live.uikit.a.a.j()) {
                if (this.r == null || this.r.getAuthorInfo() == null) {
                    this.ay.setText(PushConstants.PUSH_TYPE_NOTIFY);
                } else {
                    this.ay.setText(a(v.a(this.r.getAuthorInfo().f7748c), G));
                }
            }
            if (this.E) {
                m userHonor = this.r.getUserHonor();
                if (userHonor == null || userHonor.m() <= 0) {
                    this.j.setVisibility(8);
                    this.l.setVisibility(8);
                } else {
                    com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.af, userHonor.s());
                    this.ag.setText(String.valueOf(userHonor.m()));
                    com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.aj, userHonor.t());
                    this.ak.setText(String.valueOf(userHonor.q() - userHonor.g()));
                    this.j.setVisibility(0);
                    this.l.setVisibility(4);
                }
                com.bytedance.android.live.base.model.user.b anchorLevel = this.r.getAnchorLevel();
                if (anchorLevel == null || anchorLevel.a() <= 0) {
                    this.k.setVisibility(8);
                    this.n.setVisibility(8);
                    return;
                }
                com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.ah, anchorLevel.j());
                this.ai.setText(String.valueOf(anchorLevel.a()));
                com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.al, anchorLevel.k());
                this.am.setText(String.valueOf(anchorLevel.d() - anchorLevel.b()));
                this.k.setVisibility(0);
                this.n.setVisibility(4);
            }
        }
    }

    public void onClick(View view) {
        String str;
        boolean z2;
        String str2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f11636a, false, 6097, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f11636a, false, 6097, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(aS, this, this, view2));
        int id = view.getId();
        if (id == C0906R.id.d4s || id == C0906R.id.d4u || id == C0906R.id.d4w) {
            if (!this.t && (view2.getTag(C0906R.id.hk) instanceof User)) {
                c((User) view2.getTag(C0906R.id.hk));
            }
        } else if (id != C0906R.id.aoe) {
            if (id == C0906R.id.agq || id == C0906R.id.ah_) {
                if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6101, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6101, new Class[0], Void.TYPE);
                } else if (!TTLiveSDKContext.getHostService().k().c()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", "live_detail");
                    bundle.putString("action_type", "follow");
                    bundle.putString("source", "live");
                    bundle.putString("v1_source", "follow");
                    TTLiveSDKContext.getHostService().k().a(this.h, i.a().a(f.a()).b(f.b()).d("live_detail").e("follow").c("live").a(-1).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
                    ai.a((int) C0906R.string.cst);
                } else {
                    if (this.t) {
                        str = "live_anchor_c_audience";
                    } else if (this.s == 0) {
                        str = "live_audience_c_anchor";
                    } else if (this.s == 2) {
                        str = "right_anchor";
                    } else {
                        str = "live_audience_c_audience";
                    }
                    if (!this.r.isFollowing()) {
                        af afVar = this.y;
                        String requestId = this.v.getRequestId();
                        long j2 = this.u;
                        long id2 = this.v.getId();
                        String labels = this.v.getLabels();
                        String str3 = labels;
                        if (PatchProxy.isSupport(new Object[]{requestId, new Long(j2), str, new Long(id2), labels}, afVar, af.f11207a, false, 5228, new Class[]{String.class, Long.TYPE, String.class, Long.TYPE, String.class}, Void.TYPE)) {
                            af afVar2 = afVar;
                            PatchProxy.accessDispatch(new Object[]{requestId, new Long(j2), str, new Long(id2), str3}, afVar2, af.f11207a, false, 5228, new Class[]{String.class, Long.TYPE, String.class, Long.TYPE, String.class}, Void.TYPE);
                        } else {
                            String str4 = str3;
                            if (!afVar.h) {
                                afVar.h = true;
                                TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) com.bytedance.android.livesdk.user.f.a().a(j2)).a(requestId)).b("live_detail")).c(str)).b(id2)).d(str4)).c()).subscribe(new ap(afVar), new aq(afVar), new ar(afVar));
                            }
                        }
                        if (com.bytedance.android.livesdk.utils.j.b(this.i) && this.u == this.v.getOwner().getId()) {
                            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", com.bytedance.android.livesdk.utils.j.c(this.i));
                        }
                        y yVar = this.w;
                        long j3 = this.u;
                        String str5 = this.A;
                        boolean z3 = this.t;
                        int i2 = this.s;
                        String str6 = this.B;
                        if (LinkCrossRoomDataHolder.a().f9032f == this.r.getId()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        yVar.a(true, j3, str5, z3, i2, str6, z2);
                        if (com.bytedance.android.live.uikit.a.a.d()) {
                            com.bytedance.android.livesdk.r.a.a(getContext(), this.v, "card_follow_button");
                        }
                    } else {
                        n.a a2 = n.a().a(getContext());
                        if (com.bytedance.android.live.uikit.a.a.b()) {
                            a2.d(C0906R.string.d_6);
                        } else {
                            a2.c((int) C0906R.string.d_6);
                        }
                        a2.b(0, C0906R.string.dg_, new dc(this, str)).b(1, C0906R.string.cpz, cs.f12037b).c();
                    }
                }
            } else if (id == C0906R.id.g0) {
                if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6102, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6102, new Class[0], Void.TYPE);
                } else if (!com.bytedance.android.live.uikit.a.a.a() || TTLiveSDKContext.getHostService().k().c()) {
                    if (!TTLiveSDKContext.getHostService().k().a(h.AT)) {
                        y yVar2 = this.w;
                        if (PatchProxy.isSupport(new Object[0], yVar2, y.f17645a, false, 13698, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], yVar2, y.f17645a, false, 13698, new Class[0], Void.TYPE);
                        } else {
                            com.bytedance.android.livesdk.j.f.a(yVar2.f17646b);
                        }
                        this.y.c();
                        if (this.v == null || this.v.getOrientation() != 2 || this.i.get("data_is_portrait") == null || ((Boolean) this.i.get("data_is_portrait")).booleanValue()) {
                            if (com.bytedance.android.live.uikit.a.a.j()) {
                                str2 = this.r.displayId;
                            } else {
                                str2 = this.r.getNickName();
                            }
                            com.bytedance.android.livesdk.u.a.a().a((Object) new am(1, str2));
                            this.i.lambda$put$1$DataCenter("cmd_wanna_send_message", new am(1, str2));
                        }
                    }
                } else {
                    TTLiveSDKContext.getHostService().k().a(getContext(), i.a().a(ac.a((int) C0906R.string.csf)).d("live_detail").c("live").a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                }
            } else if (id == C0906R.id.al2) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("enter_from_merge", "live_detail");
                bundle2.putString("enter_method", "right_anchor");
                bundle2.putString("enter_from", "live_detail");
                bundle2.putString("source", "right_anchor");
                bundle2.putString("enter_method", "right_anchor");
                bundle2.putLong("from_room_id", this.v.getId());
                bundle2.putString("superior_page_from", this.B);
                bundle2.putLong("anchor_id", this.r.getId());
                com.bytedance.android.livesdk.rank.a.a(this.i, bundle2);
                com.bytedance.android.livesdk.u.a.a().a((Object) new l(this.r.getLiveRoomId(), "live_detail", bundle2));
            } else if (id == C0906R.id.ac0) {
                if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6099, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6099, new Class[0], Void.TYPE);
                } else {
                    if (!this.aM && this.aO != null) {
                        long b2 = TTLiveSDKContext.getHostService().k().b();
                        if ((this.v == null || this.v.getOwner() == null || this.v.getOwner().getId() != b2) && this.aO.anchorId > 0) {
                            j.q().m().a(this.aO.anchorId);
                        }
                    } else if (this.aM && this.i != null) {
                        this.y.c();
                        com.bytedance.android.livesdk.chatroom.event.h hVar = new com.bytedance.android.livesdk.chatroom.event.h();
                        hVar.f10175a = this.aO;
                        hVar.f10176b = this.D;
                        this.i.lambda$put$1$DataCenter("cmd_show_fans_club_setting", hVar);
                    }
                }
            } else if (id == C0906R.id.dpw || id == C0906R.id.dpx) {
                a(this.aK, this.j, this.l, new cy(this));
            } else if (id == C0906R.id.f3 || id == C0906R.id.f4) {
                a(this.aL, this.k, this.n, new cz(this));
            } else if (id == C0906R.id.dpi || id == C0906R.id.dpj) {
                a(this.aK, this.l, this.j, new da(this));
            } else if (id == C0906R.id.ev || id == C0906R.id.ew) {
                a(this.aL, this.n, this.k, new db(this));
            }
        } else if (!this.t && this.r != null) {
            c(this.r);
        }
    }

    private Spannable a(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f11636a, false, 6096, new Class[]{String.class, Integer.TYPE}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f11636a, false, 6096, new Class[]{String.class, Integer.TYPE}, Spannable.class);
        }
        SpannableString spannableString = new SpannableString(str2);
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 >= str.length()) {
                break;
            } else if (Character.isDigit(str2.charAt(length2))) {
                length = length2 + 1;
                break;
            } else {
                length2--;
            }
        }
        if (length != 0 && length <= str.length() - 1) {
            spannableString.setSpan(new AbsoluteSizeSpan(i2, true), length, str.length(), 33);
        }
        return spannableString;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11636a, false, 6092, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11636a, false, 6092, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.aN = true;
        ((ab) com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).compose(com.bytedance.android.live.core.rxutils.i.a(this)).as(com.bytedance.android.live.core.rxutils.autodispose.e.a((Fragment) this))).a((Consumer<? super T>) new cq<Object>(this));
        ((ab) com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.i.a.class).as(com.bytedance.android.live.core.rxutils.autodispose.e.a((Fragment) this))).a((Consumer<? super T>) new cr<Object>(this));
        if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6093, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            this.aQ = false;
            this.aR = false;
            this.E = false;
        } else if (com.bytedance.android.live.uikit.a.a.b()) {
            this.aP = true;
            this.aQ = false;
            this.aR = false;
            this.E = false;
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            this.aP = false;
            this.aQ = false;
            this.aR = false;
            this.E = false;
        } else if (com.bytedance.android.live.uikit.a.a.j()) {
            this.aP = false;
            this.aQ = false;
            this.aR = false;
            this.E = false;
        }
        this.ae = layoutInflater.inflate(C0906R.layout.aie, viewGroup2, false);
        this.H = (TextView) this.ae.findViewById(C0906R.id.bpn);
        this.at = (RecyclerView) this.ae.findViewById(C0906R.id.dpm);
        this.I = (TextView) this.ae.findViewById(C0906R.id.bjq);
        this.J = (TextView) this.ae.findViewById(C0906R.id.ap_);
        this.f11637b = (TextView) this.ae.findViewById(C0906R.id.csz);
        this.f11638c = this.ae.findViewById(C0906R.id.cs1);
        this.K = (TextView) this.ae.findViewById(C0906R.id.dxb);
        this.L = (TextView) this.ae.findViewById(C0906R.id.crf);
        this.M = (TextView) this.ae.findViewById(C0906R.id.ahe);
        this.N = (TextView) this.ae.findViewById(C0906R.id.aha);
        this.O = (TextView) this.ae.findViewById(C0906R.id.d2p);
        this.P = (TextView) this.ae.findViewById(C0906R.id.a4q);
        this.Q = (TextView) this.ae.findViewById(C0906R.id.cnq);
        this.R = this.ae.findViewById(C0906R.id.d57);
        this.S = this.ae.findViewById(C0906R.id.d4s);
        this.T = (ImageView) this.ae.findViewById(C0906R.id.d4r);
        this.U = this.ae.findViewById(C0906R.id.d4u);
        this.V = (ImageView) this.ae.findViewById(C0906R.id.d4t);
        this.W = this.ae.findViewById(C0906R.id.d4w);
        this.X = (ImageView) this.ae.findViewById(C0906R.id.d4v);
        this.Y = this.ae.findViewById(C0906R.id.aa);
        this.Z = (TextView) this.ae.findViewById(C0906R.id.agq);
        this.aa = (TextView) this.ae.findViewById(C0906R.id.ah_);
        this.ab = this.ae.findViewById(C0906R.id.g0);
        this.ac = this.ae.findViewById(C0906R.id.aoe);
        this.ad = this.ae.findViewById(C0906R.id.al2);
        this.an = this.ae.findViewById(C0906R.id.ac0);
        this.ao = (HSImageView) this.ae.findViewById(C0906R.id.abz);
        this.ap = (TextView) this.ae.findViewById(C0906R.id.ac6);
        this.aq = (TextView) this.ae.findViewById(C0906R.id.ac3);
        this.ar = this.ae.findViewById(C0906R.id.bjv);
        this.as = (TextView) this.ae.findViewById(C0906R.id.aj7);
        this.aH = this.ae.findViewById(C0906R.id.bjw);
        this.aJ = (ImageView) this.ae.findViewById(C0906R.id.bjx);
        if (this.E) {
            this.j = this.ae.findViewById(C0906R.id.dpw);
            this.af = (HSImageView) this.ae.findViewById(C0906R.id.dpv);
            this.ag = (TextView) this.ae.findViewById(C0906R.id.dpu);
            this.k = this.ae.findViewById(C0906R.id.f3);
            this.ah = (HSImageView) this.ae.findViewById(C0906R.id.f2);
            this.ai = (TextView) this.ae.findViewById(C0906R.id.f1);
            this.l = this.ae.findViewById(C0906R.id.dpi);
            this.aj = (HSImageView) this.ae.findViewById(C0906R.id.dph);
            this.m = this.ae.findViewById(C0906R.id.dpk);
            this.ak = (TextView) this.ae.findViewById(C0906R.id.dpg);
            this.n = this.ae.findViewById(C0906R.id.ev);
            this.al = (HSImageView) this.ae.findViewById(C0906R.id.eu);
            this.o = this.ae.findViewById(C0906R.id.ex);
            this.am = (TextView) this.ae.findViewById(C0906R.id.et);
            this.ae.findViewById(C0906R.id.ew).setOnClickListener(this);
            this.ae.findViewById(C0906R.id.dpj).setOnClickListener(this);
            this.ae.findViewById(C0906R.id.f4).setOnClickListener(this);
            this.ae.findViewById(C0906R.id.dpx).setOnClickListener(this);
            a(this.j);
            a(this.l);
            a(this.k);
            a(this.n);
        }
        this.an.setOnClickListener(this);
        this.J.setLongClickable(true);
        this.J.setOnLongClickListener(new cv(this));
        this.f11637b.setLongClickable(true);
        this.f11637b.setOnLongClickListener(new cw(this));
        this.au = new UserFeatureLabelListAdapter();
        this.at.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.at.setAdapter(this.au);
        this.ac.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f11636a, false, 6094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11636a, false, 6094, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.d()) {
            this.P.setCompoundDrawables(null, null, null, null);
        } else if (com.bytedance.android.live.uikit.a.a.b()) {
            UIUtils.setViewVisibility(this.ar, 8);
            UIUtils.setViewVisibility(this.as, 0);
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            this.aI = (LinearLayout) this.ae.findViewById(C0906R.id.a4t);
            this.aw = (LinearLayout) this.ae.findViewById(C0906R.id.ahh);
            this.aA = (LinearLayout) this.ae.findViewById(C0906R.id.dy2);
            this.av = (LinearLayout) this.ae.findViewById(C0906R.id.dy3);
            this.aC = (LinearLayout) this.ae.findViewById(C0906R.id.d2s);
            this.aB = (TextView) this.ae.findViewById(C0906R.id.dsk);
            this.az = (TextView) this.ae.findViewById(C0906R.id.dt5);
            this.aD = (LinearLayout) this.ae.findViewById(C0906R.id.dqi);
            this.aE = (LinearLayout) this.ae.findViewById(C0906R.id.dpe);
            this.aF = (TextView) this.ae.findViewById(C0906R.id.dqg);
            this.aG = (TextView) this.ae.findViewById(C0906R.id.dpd);
            this.P.setCompoundDrawables(null, null, null, null);
            if (!com.bytedance.android.live.uikit.a.a.d()) {
                com.bytedance.android.live.uikit.a.a.g();
            }
            UIUtils.setViewVisibility(this.ac, 8);
        } else if (com.bytedance.android.live.uikit.a.a.j()) {
            this.aI = (LinearLayout) this.ae.findViewById(C0906R.id.a4t);
            this.aC = (LinearLayout) this.ae.findViewById(C0906R.id.d2s);
            this.ax = (LinearLayout) this.ae.findViewById(C0906R.id.bbk);
            this.ay = (TextView) this.ae.findViewById(C0906R.id.bbj);
            UIUtils.setViewVisibility(this.ax, 0);
            UIUtils.setViewVisibility(this.aC, 8);
            UIUtils.setViewVisibility(this.aI, 8);
            UIUtils.setViewVisibility(this.ac, 8);
            if (com.bytedance.android.live.uikit.a.a.h()) {
                UIUtils.setViewVisibility(this.ar, 8);
            } else {
                UIUtils.setViewVisibility(this.aJ, 8);
                UIUtils.setViewVisibility(this.aH, 8);
                UIUtils.setViewVisibility(this.I, 8);
            }
        }
        a(this.r);
        return this.ae;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.animation.Animator[] r18, android.view.View r19, android.view.View r20, java.lang.Runnable r21) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11636a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.animation.Animator[]> r1 = android.animation.Animator[].class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r15] = r1
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6106(0x17da, float:8.556E-42)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f11636a
            r3 = 0
            r4 = 6106(0x17da, float:8.556E-42)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.animation.Animator[]> r1 = android.animation.Animator[].class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r15] = r1
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0064:
            android.animation.Animator r0 = r7.p
            r7.a((android.animation.Animator) r0)
            android.animation.Animator r0 = r7.q
            r7.a((android.animation.Animator) r0)
            r0 = r8[r13]
            r7.a((android.animation.Animator) r0)
            r0 = r8[r14]
            r7.a((android.animation.Animator) r0)
            java.lang.String r0 = "rotationX"
            float[] r1 = new float[r15]
            r1 = {0, -1028390912} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r9, r0, r1)
            r8[r13] = r0
            java.lang.String r0 = "rotationX"
            float[] r1 = new float[r15]
            r1 = {1119092736, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r0, r1)
            r8[r14] = r0
            r0 = r8[r13]
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment$3 r1 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment$3
            r1.<init>(r9, r10, r8)
            r0.addListener(r1)
            r0 = r8[r14]
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment$4 r1 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment$4
            r1.<init>(r10, r11)
            r0.addListener(r1)
            r0 = r8[r13]
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment.a(android.animation.Animator[], android.view.View, android.view.View, java.lang.Runnable):void");
    }
}
