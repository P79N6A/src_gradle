package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.WatchStatus;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.af;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.s;
import com.ss.android.ugc.aweme.profile.ui.a.b;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.ss.android.ugc.aweme.report.a.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.live.f;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.ac;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class MusUserProfileFragment extends MusAbsProfileFragment implements Observer<Boolean>, WeakHandler.IHandler, aa, m, n, s, b, a {
    public static ChangeQuickRedirect af;
    private String aA;
    private boolean aB;
    private MTAwemeListFragment aC;
    private OriginMusicListFragment aD;
    private ImageView aE;
    private boolean aF;
    private boolean aG;
    private Aweme aH;
    private String aI;
    private String aJ;
    private MainAnimViewModel aK;
    private e aL = new e();
    private View aM;
    private boolean aN = false;
    private boolean aO = false;
    private String aP;
    private String aQ;
    private String aR;
    private String aS;
    private boolean aT = true;
    private String aU;
    private String aV;
    private String aW;
    private String aX;
    private String aY;
    private String aZ;
    @BindView(2131492956)
    TextView adBottomMoreBtn;
    public i ag;
    String ah;
    public int ai;
    public String aj;
    public MTAwemeListFragment ak;
    public String al;
    FrameLayout am;
    public WeakHandler an;
    String ao = "";
    public String ap;
    public String aq;
    public String ar;
    public String as;
    public String at;
    public String au;
    private ae av;
    private af aw;
    private ImageView ax;
    private String ay;
    private String az;
    private boolean ba = false;
    private FollowViewModel bb;
    private List<String> bc = new ArrayList();
    private at bd;
    @BindView(2131496473)
    Button followBn;
    @BindView(2131494354)
    ImageView followIv;
    @BindView(2131494312)
    FrameLayout mFlHead;
    @BindView(2131493046)
    AnimationImageView mLiveStatusView;
    @BindView(2131496718)
    Button requestedBtn;
    @BindView(2131497039)
    Button sendMsgBtn;
    @BindView(2131498259)
    TextView txtAdBottomDes;

    public final void a() {
    }

    public final void a(Object obj) {
    }

    public final void a(String str) {
    }

    public final void a(boolean z, boolean z2, boolean z3) {
    }

    public final void b(@Nullable User user) {
    }

    public final void e(boolean z) {
    }

    public final void f(int i) {
    }

    public final void f(User user) {
    }

    public final void g(int i) {
    }

    public final void g(String str) {
    }

    public final void h(int i) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final int x() {
        return C0906R.layout.r2;
    }

    public String getUserId() {
        return this.ah;
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68358, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68358, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.aG = z2;
        setUserVisibleHint(z);
        if (getActivity() != null) {
            v.b((Activity) getActivity());
            if (z2) {
                v.c((Activity) getActivity());
                if (this.J != null && !TextUtils.isEmpty(this.J.getBioEmail())) {
                    l("email");
                }
                if (this.J != null && !TextUtils.isEmpty(this.J.getBioUrl())) {
                    l("weblink");
                }
            } else {
                FragmentActivity activity = getActivity();
                if (PatchProxy.isSupport(new Object[]{activity}, null, cs.f75695a, true, 88407, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity}, null, cs.f75695a, true, 88407, new Class[]{Activity.class}, Void.TYPE);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(1024);
                }
            }
        }
        if (this.aK != null) {
            this.aK.f54177d.setValue(Boolean.valueOf(z));
        }
        if (z2) {
            D();
            this.aN = false;
            i(true);
            if (this.J != null && this.J.isLive()) {
                com.ss.android.ugc.aweme.story.live.b.a(this.J.getUid(), this.J.roomId, "others_homepage", "others_photo", this.J.getRequestId(), -1, true, "");
            }
        } else {
            E();
        }
        if (this.V != null) {
            this.V.b(z2);
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, af, false, 68367, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, af, false, 68367, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.ah = str;
        this.ay = str2;
        if (this.aD != null) {
            this.aD.a(str, str2);
        }
        if (this.aC != null) {
            this.aC.a(str, str2);
        }
        if (this.ak != null) {
            this.ak.a(str, str2);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68414, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68414, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            super.a(user);
            a(user.getUid(), user.getSecUid());
            this.ba = true;
            this.J = user;
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68413, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, af, false, 68413, new Class[0], Void.TYPE);
            } else {
                l(this.J);
                this.i.a(this.h, this.w.contains(3), false, this);
                u();
                this.S.notifyDataSetChanged();
            }
            g(ex.a(this.J, s()));
            h(this.J != null && this.J.isBlock());
            I();
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68416, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, af, false, 68416, new Class[0], Void.TYPE);
            } else if (s()) {
                this.aE.setVisibility(8);
            } else {
                this.aE.setVisibility(0);
                this.N.setVisibility(8);
            }
            if (!TextUtils.equals(user.getUid(), this.ah)) {
                this.av.a(this.ah, this.ay);
                return;
            }
            h(this.J);
            if (i()) {
                this.i.setScrollable(false);
                this.h.setScrollable(false);
            }
        }
    }

    public final void a(WatchStatus watchStatus) {
        WatchStatus watchStatus2 = watchStatus;
        if (PatchProxy.isSupport(new Object[]{watchStatus2}, this, af, false, 68427, new Class[]{WatchStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{watchStatus2}, this, af, false, 68427, new Class[]{WatchStatus.class}, Void.TYPE);
        } else if (watchStatus2.watchStatus == 0) {
            UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.be3);
        } else {
            UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.be6);
        }
    }

    private String R() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68398, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, af, false, 68398, new Class[0], String.class);
        }
        String str = "";
        if (!TextUtils.isEmpty(this.aJ)) {
            str = this.aJ;
        } else if (this.aH != null) {
            str = this.aH.getRequestId();
        }
        return str;
    }

    public final int B() {
        if (!PatchProxy.isSupport(new Object[0], this, af, false, 68385, new Class[0], Integer.TYPE)) {
            return ((int) UIUtils.dip2Px(getContext(), 49.0f)) + this.mStatusView.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, af, false, 68385, new Class[0], Integer.TYPE)).intValue();
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68365, new Class[0], Void.TYPE);
            return;
        }
        b(this.ah, this.ay);
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68372, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null && isAdded()) {
            P();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void O() throws Exception {
        this.J.setFollowerStatus(0);
        if (this.J.getFollowStatus() == 2) {
            this.J.setFollowStatus(1);
        }
        a(this.J.getFollowStatus(), this.J.getFollowerStatus());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68415, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        j(this.J);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68368, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        c.a(this.followIv);
        c.a(this.sendMsgBtn);
        c.a(this.requestedBtn);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, af, false, 68436, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("others_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, af, false, 68436, new Class[0], Analysis.class);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68369, new Class[0], Void.TYPE);
            return;
        }
        o(0);
        p(0);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68370, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        this.ba = false;
        if (this.aC != null) {
            this.aC.C();
        }
        if (this.ak != null) {
            this.ak.C();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68371, new Class[0], Void.TYPE);
            return;
        }
        super.o();
        this.ba = false;
        if (this.aC != null) {
            this.aC.C();
        }
        if (this.ak != null) {
            this.ak.C();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68376, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.aG) {
            E();
        }
        if (this.aK != null) {
            this.aK.f54177d.setValue(Boolean.FALSE);
        }
    }

    public final boolean q_() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68428, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, af, false, 68428, new Class[0], Boolean.TYPE)).booleanValue();
        }
        a(true, true);
        this.aO = false;
        return false;
    }

    private int S() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68399, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, af, false, 68399, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.ai;
        if (i2 != 4) {
            switch (i2) {
                case 0:
                    if (!this.J.isSecret()) {
                        if (this.J.getFollowerStatus() != 1) {
                            i = 1;
                            break;
                        } else {
                            i = 2;
                            break;
                        }
                    } else {
                        i = 4;
                        break;
                    }
            }
        }
        return i;
    }

    private void U() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68435, new Class[0], Void.TYPE);
            return;
        }
        if (this.av != null) {
            this.av.a(this.ah, this.ay);
        }
        boolean a2 = ex.a(this.J, s());
        if (a2) {
            g(a2);
            if (this.ak != null) {
                this.ak.m();
            }
            if (this.aC != null) {
                this.aC.m();
            }
        } else {
            if (this.ak != null) {
                this.ak.x();
            }
            if (this.aC != null) {
                this.aC.x();
            }
        }
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68384, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.J != null) {
            if (!this.J.isLive() || ex.a(this.J, s())) {
                HeaderDetailActivity.a(getActivity(), this.f3801e, this.J, false, m());
            } else {
                f.a(getContext(), this.J, false, new m() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62015a;

                    public final void onFollowFail(Exception exc) {
                        Exception exc2 = exc;
                        if (PatchProxy.isSupport(new Object[]{exc2}, this, f62015a, false, 68453, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc2}, this, f62015a, false, 68453, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        MusUserProfileFragment.this.onFollowFail(exc2);
                    }

                    public final void onFollowSuccess(FollowStatus followStatus) {
                        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f62015a, false, 68452, new Class[]{FollowStatus.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f62015a, false, 68452, new Class[]{FollowStatus.class}, Void.TYPE);
                            return;
                        }
                        MusUserProfileFragment.this.onFollowSuccess(followStatus);
                        MusUserProfileFragment.this.J.setFollowStatus(followStatus.followStatus);
                        f.a(MusUserProfileFragment.this.getContext(), MusUserProfileFragment.this.J, false, null);
                    }
                });
            }
        }
    }

    public final void J() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68404, new Class[0], Void.TYPE);
        } else if (!d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, this.aV, "report");
        } else {
            if (!(this.J == null || this.aw == null)) {
                r.a("click_post_notification", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("to_user_id", this.J.getUid()).f34114b);
                this.aw.a(this.J.getUid(), Integer.valueOf(this.J.getWatchwStatus()));
            }
        }
    }

    public final void K() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68405, new Class[0], Void.TYPE);
            return;
        }
        if (this.J != null) {
            r.a("report_user", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("to_user_id", this.J.getUid()).f34114b);
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), AllStoryActivity.f73306b, this.J.getUid(), this.J.getUid(), null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void N() {
        FollowViewModel followViewModel;
        r.a("remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68438, new Class[0], FollowViewModel.class)) {
            followViewModel = (FollowViewModel) PatchProxy.accessDispatch(new Object[0], this, af, false, 68438, new Class[0], FollowViewModel.class);
        } else {
            if (this.bb == null) {
                this.bb = new FollowViewModel(this);
            }
            followViewModel = this.bb;
        }
        followViewModel.a(this.J.getUid(), new bg(this), new ay(this));
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68373, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.av != null) {
            this.av.k();
            this.av = null;
        }
        if (this.ag != null) {
            this.ag.k();
            this.ag = null;
        }
        if (this.aw != null) {
            this.aw.k();
            this.aw = null;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68375, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!(this.av == null || this.J == null || !this.J.isLive())) {
            H();
        }
        if (this.aK != null && this.aK.a() && TextUtils.equals((CharSequence) this.aK.f54178e.getValue(), "page_profile")) {
            this.aK.f54177d.setValue(Boolean.TRUE);
        }
    }

    public final boolean w() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68424, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, af, false, 68424, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof MainActivity) {
                if (!((MainActivity) activity).isFeedPage()) {
                    return true;
                }
                return false;
            } else if (activity instanceof DetailActivity) {
                if (!((DetailActivity) activity).c()) {
                    return true;
                }
                return false;
            } else if (activity instanceof UserProfileActivity) {
                return true;
            }
        }
        return false;
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68382, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("others_homepage"));
            r.a("click_follow_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").f34114b);
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this, this.ah, TextUtils.equals(this.ah, d.a().getCurUserId()), SimpleUserFragment.b.following, this.x);
            aVar.a(this.J).a();
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68383, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            r.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("others_homepage"));
            r.a("click_fans_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").f34114b);
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this, this.ah, TextUtils.equals(this.ah, d.a().getCurUserId()), SimpleUserFragment.b.follower, this.y);
            aVar.a(this.J).a();
        }
    }

    private void P() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68378, new Class[0], Void.TYPE);
            return;
        }
        if (this.G == this.S.d(1) && this.aC != null && this.aC.j()) {
            this.aC.a(ex.a(this.J, s()));
            MTAwemeListFragment mTAwemeListFragment = this.aC;
            if (this.J == null || !this.J.isBlocked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            mTAwemeListFragment.d(z2);
            this.aC.H_();
        }
        if (this.G == this.S.d(0) && this.ak != null && this.ak.j()) {
            this.ak.a(ex.a(this.J, s()));
            MTAwemeListFragment mTAwemeListFragment2 = this.ak;
            if (this.J == null || !this.J.isBlocked()) {
                z = false;
            } else {
                z = true;
            }
            mTAwemeListFragment2.d(z);
            this.ak.H_();
        }
        if (this.G == this.S.d(3) && this.aD != null && this.aD.j()) {
            GeneralPermission generalPermission = this.J.getGeneralPermission();
            if (generalPermission == null || generalPermission.getOriginalList() != 1) {
                this.aD.a(ex.a(this.J, s()));
                OriginMusicListFragment originMusicListFragment = this.aD;
                if (this.J != null && this.J.isBlocked()) {
                    z3 = true;
                }
                originMusicListFragment.d(z3);
                this.aD.H_();
            } else {
                this.aD.y_();
            }
        }
    }

    public final void L() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68406, new Class[0], Void.TYPE);
            return;
        }
        User user = this.J;
        if (user == null) {
            user = new User();
            user.setUid(this.ah);
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.aH)) {
            com.ss.android.ugc.aweme.im.b.a().startChatWithAdLog(getContext(), com.ss.android.ugc.aweme.im.b.a(this.J), new com.ss.android.ugc.aweme.im.service.model.a(this.aH.getAwemeRawAd().getLogExtra(), String.valueOf(this.aH.getAwemeRawAd().getCreativeId())));
        } else {
            com.ss.android.ugc.aweme.im.b.a().startChat(getContext(), com.ss.android.ugc.aweme.im.b.a(user));
        }
        com.ss.android.ugc.aweme.im.f.a(this.ah);
        com.ss.android.ugc.aweme.im.f.a(this.ah, this.al, this.aI, this.aJ, "click_stranger_chat_button");
    }

    public final void M() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68407, new Class[0], Void.TYPE);
            return;
        }
        if (this.J != null) {
            r.a("click_block", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("to_user_id", this.J.getUid()).f34114b);
            boolean isBlock = this.J.isBlock();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isBlock ? (byte) 1 : 0)}, this, af, false, 68408, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isBlock)}, this, af, false, 68408, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (isBlock) {
                BlockApi.a((Handler) this.an, this.J.getUid(), 0);
                com.ss.android.ugc.aweme.im.f.a("others_homepage", this.J.getUid());
            } else {
                AnonymousClass3 r0 = new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62020a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62020a, false, 68455, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62020a, false, 68455, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == -2 || i != -1) {
                            com.ss.android.ugc.aweme.im.f.a("cancel", MusUserProfileFragment.this.J.getUid(), "others_homepage");
                            dialogInterface.dismiss();
                        } else {
                            dialogInterface.dismiss();
                            BlockApi.a((Handler) MusUserProfileFragment.this.an, MusUserProfileFragment.this.J.getUid(), 1);
                            com.ss.android.ugc.aweme.im.f.a("success", MusUserProfileFragment.this.J.getUid(), "others_homepage");
                            if (TextUtils.equals(MusUserProfileFragment.this.aj, "chat")) {
                                com.ss.android.ugc.aweme.im.f.b(MusUserProfileFragment.this.J.getUid());
                            }
                            if (MusUserProfileFragment.this.ai != 0) {
                                MusUserProfileFragment.this.ai = 0;
                                MusUserProfileFragment.this.l(MusUserProfileFragment.this.ai);
                            }
                        }
                    }
                };
                new a.C0185a(getContext()).b((int) C0906R.string.ny).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) r0).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) r0).a().a();
                com.ss.android.ugc.aweme.im.f.a("others_homepage", this.J.getUid(), "");
            }
        }
    }

    private String[] T() {
        Resources resources;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68403, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, af, false, 68403, new Class[0], String[].class);
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.aq)) {
            this.aq = getResources().getString(C0906R.string.bzd);
        }
        if (TextUtils.isEmpty(this.at)) {
            this.at = getResources().getString(C0906R.string.c44);
        }
        arrayList.add(this.aq);
        this.bc.add("report_user");
        if (this.J != null && d.a().isLogin()) {
            if (this.J.isBlock()) {
                resources = getResources();
                i = C0906R.string.dn6;
            } else {
                resources = getResources();
                i = C0906R.string.nj;
            }
            this.ar = resources.getString(i);
            arrayList.add(this.ar);
            if (this.J.isBlock()) {
                this.bc.add("unblock");
            } else {
                this.bc.add("block");
            }
            if (((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().c()).booleanValue() && this.J != null && this.J.getFollowerStatus() == 1) {
                this.bc.add("remove_follower");
                this.as = getString(C0906R.string.bz3);
                arrayList.add(this.as);
            }
            Resources resources2 = getResources();
            if (this.J.getWatchwStatus() == 0) {
                i2 = C0906R.string.be4;
            } else {
                i2 = C0906R.string.be1;
            }
            this.ap = resources2.getString(i2);
            if (ex.a(this.J, s())) {
                if (ex.a(this.J.getFollowStatus())) {
                    arrayList.add(0, this.ap);
                    if (this.J.getWatchwStatus() == 0) {
                        this.bc.add("turnon_post_notification");
                    } else {
                        this.bc.add("turnoff_post_notification");
                    }
                }
            } else if (!this.J.isBlock()) {
                arrayList.add(0, this.ap);
                if (this.J.getWatchwStatus() == 0) {
                    this.bc.add("turnon_post_notification");
                } else {
                    this.bc.add("turnoff_post_notification");
                }
            }
            if (!this.J.isBlock() && com.ss.android.ugc.aweme.im.b.b() && !ex.b()) {
                arrayList.add(this.at);
                this.bc.add("message");
            }
        }
        if (TextUtils.isEmpty(this.au)) {
            this.au = getResources().getString(C0906R.string.c7g);
        }
        if (this.J != null && (this.J.isMe() || !this.J.isSecret())) {
            arrayList.add(0, this.au);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private void Q() {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68397, new Class[0], Void.TYPE);
            return;
        }
        boolean a2 = ex.a(this.ai);
        int S = S();
        if (S == 4) {
            a((Activity) getActivity());
        }
        if (this.ai != 4 && !a2) {
            i = 1;
        }
        bg.a(new com.ss.android.ugc.aweme.challenge.a.d(S, this.J));
        if (d.a().isLogin()) {
            if (!TextUtils.isEmpty(this.aj)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("enter_from", this.aI);
                    jSONObject.put("request_id", this.aJ);
                    if (!TextUtils.isEmpty(this.aU)) {
                        jSONObject.put("poi_id", this.aU);
                    }
                } catch (JSONException unused) {
                }
                if (StringUtils.isEmpty(this.aQ) || a2) {
                    if (!a2 && this.aL.a()) {
                        g.s(getContext(), this.aH);
                    }
                    MobClick obtain = MobClick.obtain();
                    if (a2) {
                        str3 = "follow_cancel";
                    } else {
                        str3 = "follow";
                    }
                    r.onEvent(obtain.setEventName(str3).setLabelName("others_homepage").setValue(this.ah).setExtValueString(this.al).setJsonObject(jSONObject));
                    if (a2) {
                        r.a("follow_cancel", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", this.ah).a("enter_from", "others_homepage").a("previous_page", this.ao).a("scene_id", "1007").f34114b);
                    }
                    if (TextUtils.equals(this.ao, "search_result") || TextUtils.equals(this.ao, "search_for_you_list")) {
                        j jVar = j.f42669b;
                        if (a2) {
                            str4 = "search_follow_cancel";
                        } else {
                            str4 = "search_follow";
                        }
                        jVar.a(str4, this.ah, "others_homepage", true);
                    }
                } else {
                    com.ss.android.ugc.aweme.story.live.b.a("others_homepage", "live", this.aR, this.aQ, Boolean.valueOf(d.a().getCurUserId().equals(this.aR)), this.ah, this.aP);
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("others_homepage").setValue(this.aR).setExtValueString(this.aQ).setJsonObject(new t().a("enter_from", "live_aud").a("request_id", this.aP).a("user_id", this.ah).a("user_type", this.aS).a()));
                }
                if (!a2 && StringUtils.isEmpty(this.aQ)) {
                    com.ss.android.ugc.aweme.u.s f2 = new com.ss.android.ugc.aweme.u.s().b("others_homepage").g(this.aZ).f(this.ao);
                    if (this.J != null) {
                        str = this.J.getRequestId();
                    } else {
                        str = "";
                    }
                    com.ss.android.ugc.aweme.u.s h = f2.k(str).c("follow_button").h(this.ah);
                    if (this.aH == null) {
                        str2 = "";
                    } else {
                        str2 = this.aH.getAid();
                    }
                    h.i(str2).k(R()).e();
                }
            }
            l(S);
            if (this.ag != null) {
                this.ag.a(new i.a().a(this.ah).b(this.ay).a(i).c("others_homepage").a());
            }
        } else {
            r.a((Context) getActivity(), "follow", "personal_homepage", this.ah, 0);
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, this.aI, "click_follow", ad.a().a("group_id", this.al).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(this.al)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new bc(this, S, i));
        }
    }

    public final void i(String str) {
        this.ao = str;
    }

    public final void j(String str) {
        this.aZ = str;
    }

    public final void a(at atVar) {
        this.bd = atVar;
    }

    public final void h(String str) {
        this.aI = str;
    }

    @Subscribe
    public void onMobRequestIdEvent(x xVar) {
        this.aJ = xVar.f45320a;
    }

    public final void k(String str) {
        if (this.aC != null) {
            this.aC.F = str;
        }
        if (this.ak != null) {
            this.ak.F = str;
        }
    }

    public final void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, af, false, 68425, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, af, false, 68425, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        super.a(urlModel);
    }

    private void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, af, false, 68396, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, af, false, 68396, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        an<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.c()).intValue();
        if (intValue == 0) {
            new a.C0185a(activity2).b((int) C0906R.string.br4).a((int) C0906R.string.anv, (DialogInterface.OnClickListener) null).a().a();
        } else if (intValue > 0 && intValue < 4) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) activity2, (int) C0906R.string.br5).a();
        }
        privacyAccountFollowCount.a(Integer.valueOf(intValue + 1));
    }

    private void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68417, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68417, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.aC != null) {
            this.aC.a(z);
        }
        if (this.ak != null) {
            this.ak.a(z);
        }
        if (this.aD != null) {
            this.aD.a(z);
        }
    }

    private void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68418, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68418, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.aC != null) {
            this.aC.c(z);
        }
        if (this.ak != null) {
            this.ak.c(z);
        }
    }

    private void l(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, af, false, 68359, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, af, false, 68359, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("show_link", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("link_type", str2).a("scene_id", "1008").a("author_id", this.J.getUid()).f34114b);
    }

    private void t(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68430, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68430, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            int i2 = ((RelativeLayout.LayoutParams) this.aM.getLayoutParams()).bottomMargin;
            if (i2 >= 0) {
                com.ss.android.ugc.aweme.utils.c.a(this.aM, i2, (this.aM.getMeasuredHeight() + 1) * -1, i).start();
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, af, false, 68423, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, af, false, 68423, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.b(exc);
        this.aF = true;
    }

    public final void d(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68360, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68360, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.d(user);
        this.q.a(this.J, (Aweme) null);
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68420, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68420, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z, false);
    }

    public final void i(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68421, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68421, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (user != null) {
                if (this.av == null) {
                    this.av = new ae();
                    this.av.a(this);
                    this.av.h = this.aI;
                }
                this.av.a(user, false);
            }
            if (this.E != null) {
                this.E.t();
            }
            C();
        }
    }

    @OnClick({2131493213})
    public void onBack(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68400, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68400, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(this.aj, "feed_detail")) {
            getActivity().finish();
        } else if (this.bd != null) {
            this.bd.a();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        Boolean bool = (Boolean) obj;
        if (PatchProxy.isSupport(new Object[]{bool}, this, af, false, 68437, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, af, false, 68437, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().an()) {
            if (this.ak != null) {
                this.ak.a(bool);
            }
            if (this.aC != null) {
                this.aC.a(bool);
            }
            f(bool.booleanValue());
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, af, false, 68357, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, af, false, 68357, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            this.ah = bundle.getString("uid");
            this.ay = bundle.getString("sec_user_id");
        }
        super.onCreate(bundle);
        this.aK = (MainAnimViewModel) ViewModelProviders.of(getActivity()).get(MainAnimViewModel.class);
        this.aK.f54177d.observe(this, this);
        setUserVisibleHint(false);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, af, false, 68391, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, af, false, 68391, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(AllStoryActivity.f73306b, gVar2.itemType)) {
            dv.a(getActivity(), this.ax, gVar2);
        }
    }

    public void onFollowFail(Exception exc) {
        final Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, af, false, 68410, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, af, false, 68410, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc2, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62022a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f62022a, false, 68456, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f62022a, false, 68456, new Class[0], Void.TYPE);
                            return;
                        }
                        MusUserProfileFragment.this.ag.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f62022a, false, 68457, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f62022a, false, 68457, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.app.api.a.a.a(MusUserProfileFragment.this.getActivity(), exc2, C0906R.string.afx);
                    }
                });
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc2, C0906R.string.afx);
        }
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68377, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68377, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onPageSelected(i);
        P();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, af, false, 68374, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, af, false, 68374, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            bundle.putString("uid", this.ah);
            bundle.putString("sec_user_id", this.ay);
        }
        super.onSaveInstanceState(bundle);
    }

    @Subscribe
    public void onUpdateUserEvent(com.ss.android.ugc.aweme.base.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, af, false, 68390, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, af, false, 68390, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(bVar.f34476a.getUid(), this.ah) && this.av != null) {
            this.av.a(bVar.f34476a);
        }
    }

    @Subscribe
    public void onWatchStatusEvent(WatchStatus watchStatus) {
        if (PatchProxy.isSupport(new Object[]{watchStatus}, this, af, false, 68412, new Class[]{WatchStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{watchStatus}, this, af, false, 68412, new Class[]{WatchStatus.class}, Void.TYPE);
        } else if (TextUtils.equals(watchStatus.userId, this.ah) && this.J != null && watchStatus.watchStatus != this.J.getWatchwStatus()) {
            if (watchStatus.watchStatus == 0) {
                if (this.J != null) {
                    this.J.setWatchStatus(watchStatus.watchStatus);
                }
            } else if (this.J != null) {
                this.J.setWatchStatus(watchStatus.watchStatus);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void g(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68395, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68395, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid() && isAdded() && this.J != null && !com.ss.android.ugc.aweme.c.a.a.a(view, 300)) {
            if (ex.b()) {
                com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.sk).a();
            } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.bgf);
            } else {
                if (!TextUtils.isEmpty(this.aX)) {
                    h(this.aX);
                }
                if (this.ai == 4) {
                    com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
                    aVar.a((CharSequence[]) new String[]{getActivity().getResources().getString(C0906R.string.pt), getActivity().getResources().getString(C0906R.string.pm)}, (DialogInterface.OnClickListener) new bb(this));
                    aVar.b();
                    return;
                }
                Q();
            }
        }
    }

    private void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68431, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!isViewValid() || this.aN) {
        } else {
            if ((this.aL.b() || this.aL.e()) && this.aL.d()) {
                int i = ((RelativeLayout.LayoutParams) this.aM.getLayoutParams()).bottomMargin;
                if (i < 0) {
                    com.ss.android.ugc.aweme.utils.c.a(this.aM, i, 0, (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).start();
                }
                if (z) {
                    g.z(getContext(), this.aH);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68393, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68393, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (this.J == null) {
            return false;
        } else {
            if (!d.a().isLogin()) {
                com.ss.android.ugc.aweme.login.e.a((Fragment) this, this.aI, "click_follow", ad.a().a("group_id", this.al).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(this.al)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new ax(this, view));
                return false;
            } else if (this.ai != 0) {
                return true;
            } else {
                if (this.J.getGeneralPermission() != null) {
                    i = this.J.getGeneralPermission().getFollowToast();
                } else {
                    i = 0;
                }
                if (i == 1) {
                    com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bm5).a();
                    return false;
                } else if (i != 2) {
                    return true;
                } else {
                    new a.C0185a(view.getContext()).a((int) C0906R.string.bly).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new az(this, view)).a().b();
                    return false;
                }
            }
        }
    }

    @OnClick({2131496473})
    public void follow(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68392, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68392, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68394, new Class[]{View.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68394, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (this.J != null && this.J.isBlock && !ex.a(this.ai)) {
                Context context = getContext();
                if (context != null) {
                    new a.C0185a(context).a((int) C0906R.string.dnp).b((int) C0906R.string.dno).a((int) C0906R.string.afp, (DialogInterface.OnClickListener) new ba(this, view)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a().a();
                }
            }
            z = false;
        }
        if (!z && e(view)) {
            g(view);
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, af, false, 68411, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, af, false, 68411, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (TextUtils.equals(followStatus.userId, this.ah)) {
            l(followStatus.followStatus);
            if (this.J != null && followStatus.followStatus != this.J.getFollowStatus()) {
                if (followStatus.followStatus == 0) {
                    if (this.J != null && !ex.a(this.J, s())) {
                        int followerCount = this.J.getFollowerCount() - 1;
                        this.J.setFollowerCount(followerCount);
                        a(followerCount);
                        this.J.setFollowStatus(followStatus.followStatus);
                    }
                } else if (followStatus.followStatus == 1 && this.J != null && !ex.a(this.J, s())) {
                    int followerCount2 = this.J.getFollowerCount() + 1;
                    this.J.setFollowerCount(followerCount2);
                    a(followerCount2);
                    this.J.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, af, false, 68409, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, af, false, 68409, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        User user = this.J;
        if (user == null) {
            user = new User();
            user.setUid(this.ah);
            user.setFollowStatus(followStatus.followStatus);
        }
        com.ss.android.ugc.aweme.im.b.a().updateIMUser(com.ss.android.ugc.aweme.im.b.a(user));
        l(followStatus.followStatus);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("follow_status", followStatus.followStatus);
        } catch (JSONException unused) {
        }
        if ((followStatus.followStatus == 1 || followStatus.followStatus == 4) && user.isBlock()) {
            user.setBlock(false);
            U();
        }
        bg.a(new com.ss.android.ugc.aweme.web.jsbridge.t("userFollowStatusChange", jSONObject));
    }

    @OnClick({2131497039, 2131494354, 2131496718})
    public void onImClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68401, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68401, new Class[]{View.class}, Void.TYPE);
        } else if (this.J != null) {
            if (view.equals(this.sendMsgBtn)) {
                IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
                if (!com.ss.android.ugc.aweme.im.b.b() || a2 == null) {
                    follow(this.followIv);
                    return;
                }
                if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.aH)) {
                    com.ss.android.ugc.aweme.im.b.a().startChatWithAdLog(getContext(), com.ss.android.ugc.aweme.im.b.a(this.J), new com.ss.android.ugc.aweme.im.service.model.a(this.aH.getAwemeRawAd().getLogExtra(), String.valueOf(this.aH.getAwemeRawAd().getCreativeId())));
                } else {
                    a2.startChat(getContext(), com.ss.android.ugc.aweme.im.b.a(this.J));
                }
                com.ss.android.ugc.aweme.im.f.a(this.J.getUid());
                com.ss.android.ugc.aweme.im.f.a(this.ah, this.al, this.aI, this.aJ, "click_message");
            } else if (view.equals(this.followIv) || view.equals(this.requestedBtn)) {
                follow(view);
            }
        }
    }

    @OnClick({2131496474})
    public void onReport(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68402, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68402, new Class[]{View.class}, Void.TYPE);
        } else if (this.J != null && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            r.a("click_more_action", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
            if (AbTestManager.a().aT() != 1) {
                ac acVar = new ac();
                acVar.f75013c = "more_action_list";
                acVar.f75012b = "personal_detail";
                acVar.e();
                com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
                final String[] T = T();
                aVar.a((CharSequence[]) T, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62017a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62017a, false, 68454, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62017a, false, 68454, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (TextUtils.equals(T[i], MusUserProfileFragment.this.ap)) {
                            MusUserProfileFragment.this.J();
                        } else if (TextUtils.equals(T[i], MusUserProfileFragment.this.aq)) {
                            MusUserProfileFragment.this.K();
                        } else if (TextUtils.equals(T[i], MusUserProfileFragment.this.ar)) {
                            MusUserProfileFragment.this.M();
                        } else if (TextUtils.equals(T[i], MusUserProfileFragment.this.as)) {
                            MusUserProfileFragment.this.an.sendEmptyMessage(56);
                        } else if (TextUtils.equals(T[i], MusUserProfileFragment.this.at)) {
                            MusUserProfileFragment.this.L();
                        } else if (TextUtils.equals(T[i], MusUserProfileFragment.this.au)) {
                            com.ss.android.ugc.aweme.profile.d.x.a(MusUserProfileFragment.this.getActivity(), MusUserProfileFragment.this.J, MusUserProfileFragment.this.ak.D());
                        }
                        dialogInterface.dismiss();
                    }
                });
                aVar.a(bd.f62513b);
                try {
                    aVar.b();
                } catch (Resources.NotFoundException unused) {
                }
            } else if (this.J != null) {
                this.bc.clear();
                T();
                String[] strArr = new String[this.bc.size()];
                this.bc.toArray(strArr);
                com.ss.android.ugc.aweme.profile.d.x.a((Handler) this.an, (Activity) getActivity(), this.J, (List<Aweme>) this.ak.D(), strArr);
            }
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68363, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68363, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.b(view);
        this.am = (FrameLayout) view.findViewById(C0906R.id.c72);
        this.aE = (ImageView) view.findViewById(C0906R.id.c6w);
        if (AbTestManager.a().bK() && com.ss.android.g.a.a()) {
            if (com.ss.android.g.a.b()) {
                this.aE.setImageResource(2130839380);
            } else {
                this.aE.setImageResource(2130839381);
            }
        }
        this.f3801e.setBorderColor(C0906R.color.ud);
        if (TextUtils.equals(this.ah, d.a().getCurUserId())) {
            this.n.setVisibility(0);
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        int i;
        if (PatchProxy.isSupport(new Object[]{message}, this, af, false, 68426, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, af, false, 68426, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid()) {
            int i2 = message.what;
            Object obj = message.obj;
            if (i2 == 30) {
                if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    UIUtils.displayToast(GlobalContext.getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg());
                } else if (obj instanceof Exception) {
                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.bga);
                } else if (obj instanceof BlockStruct) {
                    int i3 = ((BlockStruct) obj).blockStatus;
                    User user = this.J;
                    if (i3 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    user.setBlock(z);
                    Context context = GlobalContext.getContext();
                    Resources resources = getResources();
                    if (i3 == 1) {
                        i = C0906R.string.eo;
                    } else {
                        i = C0906R.string.dn6;
                    }
                    UIUtils.displayToast(context, resources.getString(i));
                    if (i3 == 1) {
                        this.J.setFollowStatus(0);
                        o();
                        h(true);
                        if (this.ak != null) {
                            this.ak.y_();
                        }
                        if (this.aC != null) {
                            this.aC.y_();
                        }
                        if (this.aD != null) {
                            this.aD.y_();
                        }
                        bg.a(new com.ss.android.ugc.aweme.feed.f.b());
                    } else {
                        U();
                    }
                    com.ss.android.ugc.aweme.im.b.a().updateIMUser(com.ss.android.ugc.aweme.im.b.a(this.J));
                }
            } else if (i2 == 50) {
                K();
            } else if (i2 == 51 || i2 == 52) {
                J();
            } else if (i2 == 53) {
                L();
            } else if (i2 == 54 || i2 == 55) {
                M();
            } else if (i2 == 56) {
                r.a("click_remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
                Dialog b2 = new a.C0185a(getContext()).a((int) C0906R.string.bz3).b(String.format(getResources().getString(C0906R.string.bz2), new Object[]{ex.b(this.J)})).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.bz1, (DialogInterface.OnClickListener) new be(this)).a().b();
                if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                    ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(getResources().getColor(C0906R.color.ho));
                }
            }
        }
    }

    public final void l(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68388, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68388, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.ai = i;
            if (TextUtils.equals(this.ah, d.a().getCurUserId())) {
                this.followBn.setVisibility(8);
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                this.O.setVisibility(0);
                return;
            }
            this.O.setVisibility(8);
            this.followBn.setVisibility(0);
            if (i == 0) {
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                this.followBn.setVisibility(0);
            } else if (i == 1 || i == 2) {
                this.requestedBtn.setVisibility(8);
                this.followBn.setVisibility(8);
                this.sendMsgBtn.setVisibility(0);
                if (i == 1) {
                    this.followIv.setImageResource(2130839416);
                } else {
                    this.followIv.setImageResource(2130839415);
                }
                this.followIv.setVisibility(0);
            } else if (i == 4) {
                this.requestedBtn.setVisibility(0);
                this.followBn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68434, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68434, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.im.b.b() || !(i == 1 || i == 2)) {
                this.followBn.setBackgroundResource(2130840293);
                this.followBn.setText(C0906R.string.bdc);
                this.followBn.setTextColor(getResources().getColor(C0906R.color.a17));
            } else {
                this.sendMsgBtn.setVisibility(8);
                this.followBn.setVisibility(0);
                this.followIv.setVisibility(8);
                this.followBn.setBackgroundResource(2130839243);
                this.followBn.setTextColor(getResources().getColor(C0906R.color.a08));
                this.followBn.setText(C0906R.string.ah0);
            }
        }
    }

    public final void m(int i) {
        OriginMusicListFragment originMusicListFragment;
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68379, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68379, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 3) {
            if (this.aD == null) {
                if (PatchProxy.isSupport(new Object[0], this, af, false, 68381, new Class[0], OriginMusicListFragment.class)) {
                    originMusicListFragment = (OriginMusicListFragment) PatchProxy.accessDispatch(new Object[0], this, af, false, 68381, new Class[0], OriginMusicListFragment.class);
                } else {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(u + 0);
                    if (findFragmentByTag instanceof OriginMusicListFragment) {
                        originMusicListFragment = (OriginMusicListFragment) findFragmentByTag;
                    } else {
                        originMusicListFragment = OriginMusicListFragment.a(this.ah, false);
                    }
                }
                this.aD = originMusicListFragment;
                this.aD.k = eg.a(3);
            }
            this.aD.a(this.ah, this.ay);
            a((ProfileListFragment) this.aD, (Integer) 3);
        } else if (i == 0) {
            if (this.ak == null) {
                this.ak = d(0, 1);
                this.ak.r = this.Z;
                MTAwemeListFragment mTAwemeListFragment = this.ak;
                if (this.G != r()) {
                    z = false;
                }
                mTAwemeListFragment.f3789f = z;
                this.ak.g = this.aB;
                this.ak.k = eg.a(0);
                this.ak.G = this.ao;
            }
            this.ak.a(this.ah, this.ay);
            a((ProfileListFragment) this.ak, (Integer) 0);
        } else {
            int i2 = 2;
            if (i == 2) {
                if (this.aC == null) {
                    this.aC = d(1, 2);
                    this.aC.r = this.Z;
                    MTAwemeListFragment mTAwemeListFragment2 = this.aC;
                    int i3 = this.G;
                    if (!r()) {
                        i2 = 1;
                    }
                    if (i3 == i2) {
                        z2 = true;
                    }
                    mTAwemeListFragment2.f3789f = z2;
                    this.aC.g = this.aB;
                    this.aC.k = eg.a(1);
                    this.aC.G = this.ao;
                }
                this.aC.a(this.ah, this.ay);
                a((ProfileListFragment) this.aC, (Integer) 1);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r0.equals("web") != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0190, code lost:
        com.ss.android.ugc.aweme.commercialize.log.g.A(getContext(), r9.aH);
        com.ss.android.ugc.aweme.commercialize.log.g.C(getContext(), r9.aH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a8, code lost:
        if (r9.aL.c() == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01aa, code lost:
        com.ss.android.ugc.aweme.commercialize.utils.g.b(getContext(), r9.aH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b4, code lost:
        com.ss.android.ugc.aweme.commercialize.utils.g.c(getContext(), r9.aH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bd, code lost:
        return;
     */
    @butterknife.OnClick({2131492953, 2131492955})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdBottomClick(android.view.View r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = af
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 68432(0x10b50, float:9.5894E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = af
            r3 = 0
            r4 = 68432(0x10b50, float:9.5894E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            int r0 = r10.getId()
            r1 = 2131165264(0x7f070050, float:1.794474E38)
            if (r0 != r1) goto L_0x0043
            r9.aN = r7
            r0 = 300(0x12c, float:4.2E-43)
            r9.t(r0)
            return
        L_0x0043:
            r1 = 2131165266(0x7f070052, float:1.7944744E38)
            if (r0 != r1) goto L_0x01be
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = af
            r3 = 0
            r4 = 68433(0x10b51, float:9.5895E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = af
            r3 = 0
            r4 = 68433(0x10b51, float:9.5895E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.aH
            if (r0 == 0) goto L_0x01be
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.aH
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x01be
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.aH
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x01be
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.aH
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r0 = r0.getType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x01be
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case 96801: goto L_0x00ca;
                case 117588: goto L_0x00c1;
                case 3083120: goto L_0x00b7;
                case 3148996: goto L_0x00ad;
                case 957829685: goto L_0x00a3;
                case 1893962841: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00d4
        L_0x0099:
            java.lang.String r2 = "redpacket"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            r7 = 5
            goto L_0x00d5
        L_0x00a3:
            java.lang.String r2 = "counsel"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            r7 = 0
            goto L_0x00d5
        L_0x00ad:
            java.lang.String r2 = "form"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            r7 = 4
            goto L_0x00d5
        L_0x00b7:
            java.lang.String r2 = "dial"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            r7 = 3
            goto L_0x00d5
        L_0x00c1:
            java.lang.String r2 = "web"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r2 = "app"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d4
            r7 = 2
            goto L_0x00d5
        L_0x00d4:
            r7 = -1
        L_0x00d5:
            r0 = 8
            r1 = 0
            switch(r7) {
                case 0: goto L_0x0175;
                case 1: goto L_0x0190;
                case 2: goto L_0x0138;
                case 3: goto L_0x011c;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00dd;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x01be
        L_0x00dd:
            android.content.Context r2 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r2, r3)
            android.content.Context r2 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.I(r2, r3)
            android.support.v4.app.FragmentActivity r2 = r9.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.c.b r4 = com.ss.android.ugc.aweme.profile.ui.bf.f62517b
            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (com.ss.android.ugc.aweme.commercialize.feed.e) r1, (int) r0, (com.ss.android.ugc.aweme.commercialize.c.b) r4)
            goto L_0x01be
        L_0x00fc:
            android.content.Context r1 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.F(r1, r2)
            android.content.Context r1 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r1, r2)
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.aH
            android.support.v4.app.FragmentManager r3 = r9.getChildFragmentManager()
            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.app.Activity) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r2, (android.support.v4.app.FragmentManager) r3, (int) r0)
            return
        L_0x011c:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.E(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.d((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x0138:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r9.aL
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0162
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.D(r0, r1)
            return
        L_0x0162:
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r9.aL
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0174
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x0174:
            return
        L_0x0175:
            android.content.Context r2 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.A(r2, r3)
            android.content.Context r2 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r2, r3)
            android.support.v4.app.FragmentActivity r2 = r9.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (com.ss.android.ugc.aweme.commercialize.feed.e) r1, (int) r0, (com.ss.android.ugc.aweme.commercialize.c.b) r1)
        L_0x0190:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.A(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r9.aL
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01b4
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x01b4:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.aH
            com.ss.android.ugc.aweme.commercialize.utils.g.c((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.MusUserProfileFragment.onAdBottomClick(android.view.View):void");
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68386, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68386, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.aE;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68361, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68361, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.ax = (ImageView) view.findViewById(C0906R.id.ix);
        if (com.ss.android.g.a.c()) {
            this.ax.setImageResource(2130839370);
        }
        this.ax.setVisibility(0);
        this.aM = view.findViewById(C0906R.id.bj);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            this.az = arguments.getString("unique_id", "");
            String string2 = arguments.getString("sec_user_id", "");
            this.aj = arguments.getString("profile_from", "");
            this.aV = arguments.getString("enter_from");
            this.aU = arguments.getString("poi_id");
            this.aA = arguments.getString("video_id", "");
            this.aB = TextUtils.equals(this.aj, "feed_detail");
            this.aW = arguments.getString("type", "");
            this.aX = arguments.getString("enter_from", "");
            this.aY = arguments.getString("from_discover", "");
            this.aP = arguments.getString("request_id", "");
            this.aQ = arguments.getString("room_id", "");
            this.aR = arguments.getString("room_owner_id", "");
            this.aS = arguments.getString("user_type", "");
            this.aV = arguments.getString("enter_from");
            this.aU = arguments.getString("poi_id");
            this.aT = arguments.getBoolean("isFromFeed", true);
            if (!StringUtils.isEmpty(this.aY)) {
                i(this.aY);
            }
            if (!TextUtils.isEmpty(this.aV)) {
                h(this.aV);
            }
            this.aZ = arguments.getString("extra_previous_page_position", "other_places");
            b(string, string2);
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68362, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, af, false, 68362, new Class[0], Void.TYPE);
            } else if (this.V != null) {
                this.V.f2737c = new aw(this);
            }
        }
        this.an = new WeakHandler(this);
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, af, false, 68366, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, af, false, 68366, new Class[]{Aweme.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.aH = aweme;
            if (this.aH == null) {
                this.aL.k();
                return;
            }
            this.al = this.aH.getAid();
            this.aL.a(getContext(), this.aH);
            if (com.ss.android.ugc.aweme.commercialize.utils.n.a(aweme, false)) {
                com.ss.android.ugc.aweme.utils.c.a(this.adBottomMoreBtn);
                this.adBottomMoreBtn.setBackground(new com.ss.android.ugc.aweme.commercialize.ad.c((float) u.a(2.0d), Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(aweme))));
                this.adBottomMoreBtn.setText(com.ss.android.ugc.aweme.commercialize.utils.n.a(getContext(), aweme, false));
            } else {
                t(0);
            }
            if (aweme.getAwemeRawAd() != null && !TextUtils.isEmpty(aweme.getAwemeRawAd().getHomepageBottomTextual())) {
                this.txtAdBottomDes.setText(aweme.getAwemeRawAd().getHomepageBottomTextual());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            Q();
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i, int i2) {
        if (this.ag != null && this.ag.l()) {
            l(i);
            this.ag.a(new i.a().a(this.ah).b(this.ay).a(i2).a());
        }
    }

    private void a(boolean z, boolean z2) {
        AwemeListFragment awemeListFragment;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, af, false, 68422, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, af, false, 68422, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.v != null && this.G < this.v.size()) {
            if (this.v.get(this.G) instanceof AwemeListFragment) {
                awemeListFragment = (AwemeListFragment) this.v.get(this.G);
            } else {
                awemeListFragment = null;
            }
            if (awemeListFragment != null) {
                if (z) {
                    if (AbTestManager.a().an()) {
                        awemeListFragment.z();
                    }
                    awemeListFragment.a(false, z2);
                    return;
                }
                if (AbTestManager.a().an()) {
                    awemeListFragment.A();
                }
                awemeListFragment.y();
            }
        }
    }

    private void b(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, af, false, 68364, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, af, false, 68364, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!this.ba) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.az)) {
                this.ah = str;
                this.ay = str2;
                if (!NetworkUtils.isNetworkAvailable(k.a())) {
                    if (!this.aF) {
                        UIUtils.displayToast((Context) k.a(), (int) C0906R.string.bgf);
                    }
                    this.aF = true;
                    return;
                }
                if (this.av == null) {
                    this.av = new ae();
                    this.av.a(this);
                    this.av.h = this.aI;
                }
                if (this.ag == null) {
                    this.ag = new i();
                    this.ag.a(this);
                }
                if (this.aw == null) {
                    this.aw = new af();
                    this.aw.a(this);
                }
                this.av.a(this.ah, this.ay, this.az);
                f(this.ah);
                this.aF = false;
                this.U = -1;
            }
            this.aN = false;
        }
    }

    private MTAwemeListFragment d(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68380, new Class[]{Integer.TYPE, Integer.TYPE}, MTAwemeListFragment.class)) {
            return (MTAwemeListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68380, new Class[]{Integer.TYPE, Integer.TYPE}, MTAwemeListFragment.class);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        MTAwemeListFragment mTAwemeListFragment = (MTAwemeListFragment) childFragmentManager.findFragmentByTag(u + i2);
        if (mTAwemeListFragment == null) {
            mTAwemeListFragment = MTAwemeListFragment.a(-1, i, this.ah, false);
        }
        return mTAwemeListFragment;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, af, false, 68429, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, af, false, 68429, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(f2, f3);
        if (f3 > 5.0f) {
            if (!this.aO) {
                t(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            }
            this.aO = true;
            return;
        }
        if (f3 < -5.0f) {
            if (!this.aO) {
                i(false);
            }
            this.aO = true;
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        l(i);
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, af, false, 68387, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, af, false, 68387, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.mLiveStatusView != null) {
            if (!z || !com.ss.android.ugc.aweme.story.a.a() || ex.a(this.J, s())) {
                this.f3801e.setBorderColor(C0906R.color.bc);
                this.mLiveStatusView.cancelAnimation();
                this.mLiveStatusView.setVisibility(8);
                return;
            }
            if (this.aG && this.J != null) {
                com.ss.android.ugc.aweme.story.live.b.a(getContext(), false, 0, this.J.getRequestId(), this.ah, this.J.roomId);
            }
            if (!this.aT && this.J != null) {
                com.ss.android.ugc.aweme.story.live.b.a(this.J.getUid(), this.J.roomId, "others_homepage", "others_photo", this.J.getRequestId(), -1, true, "");
            }
            this.f3801e.setBorderColor(C0906R.color.a1z);
            this.f3801e.setBorderWidth(2);
            this.mLiveStatusView.setVisibility(0);
            this.mLiveStatusView.setAnimation("tag_profile_live.json");
            this.mLiveStatusView.playAnimation();
        }
    }
}
