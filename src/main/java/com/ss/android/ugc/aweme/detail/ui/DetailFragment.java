package com.ss.android.ugc.aweme.detail.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.feed.f.aj;
import com.ss.android.ugc.aweme.feed.listener.j;
import com.ss.android.ugc.aweme.feed.listener.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.utils.a;
import com.ss.android.ugc.aweme.main.base.c;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.main.f;
import com.ss.android.ugc.aweme.main.g;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.UUID;
import org.greenrobot.eventbus.Subscribe;

public class DetailFragment extends AmeBaseFragment implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3004a;

    /* renamed from: b  reason: collision with root package name */
    protected ScrollableViewPager f3005b;

    /* renamed from: c  reason: collision with root package name */
    public bu f3006c;

    /* renamed from: d  reason: collision with root package name */
    protected MainPagerAdapter f3007d;

    /* renamed from: e  reason: collision with root package name */
    protected b f3008e = new b();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f3009f = false;
    protected boolean g;
    protected DataCenter h;
    protected e i = new e();
    protected String j;
    protected Aweme k;
    String l = "";
    private boolean m = false;
    private AnalysisStayTimeFragmentComponent n;

    public String getPlayListId() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35097, new Class[0], String.class)) {
            return g.c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35097, new Class[0], String.class);
    }

    public String getPlayListIdKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35096, new Class[0], String.class)) {
            return g.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35096, new Class[0], String.class);
    }

    public String getPlayListType() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35095, new Class[0], String.class)) {
            return g.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35095, new Class[0], String.class);
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public Aweme getCurrentAweme() {
        return this.k;
    }

    public String getLastUserId() {
        return this.j;
    }

    private String g() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35069, new Class[0], String.class)) {
            return this.f3008e.getUid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35069, new Class[0], String.class);
    }

    private boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35071, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals("from_user_state_tab", c());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35071, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    private DetailPageFragment j() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35080, new Class[0], DetailPageFragment.class)) {
            return (DetailPageFragment) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35080, new Class[0], DetailPageFragment.class);
        } else if (this.f3007d == null) {
            return null;
        } else {
            CommonPageFragment d2 = this.f3007d.d("page_home");
            if (d2 instanceof DetailPageFragment) {
                return (DetailPageFragment) d2;
            }
            return null;
        }
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3004a, false, 35074, new Class[0], String.class)) {
            return this.f3008e.getFrom();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35074, new Class[0], String.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35090, new Class[0], Void.TYPE);
            return;
        }
        this.h.a(c.f54428a, (Object) null);
    }

    public Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35092, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35092, new Class[0], Analysis.class);
        } else if (k()) {
            return new Analysis().setLabelName("others_homepage");
        } else {
            return super.getAnalysis();
        }
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35067, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35067, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!"from_nearby".equals(c()) || !this.k.isLive()) {
            return f();
        } else {
            return true;
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35068, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35068, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((h() || i()) && this.k != null && this.k.getAuthor() != null && TextUtils.equals(this.k.getAuthor().getUid(), g())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35070, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35070, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ("from_profile_self".equals(c()) || "from_profile_other".equals(c())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35094, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35094, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3008e == null || TextUtils.isEmpty(this.f3008e.getFeedsAwemeId()) || (!TextUtils.equals(this.f3008e.getPreviousPage(), "homepage_follow") && !TextUtils.equals(this.f3008e.getPreviousPage(), "homepage_hot"))) {
            return false;
        } else {
            return true;
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35064, new Class[0], Void.TYPE);
            return;
        }
        MainPagerAdapter.a aVar = new MainPagerAdapter.a();
        Bundle bundle = new Bundle();
        bundle.putString("related_gid", this.f3008e.getRelatedId());
        aVar.a(DetailPageFragment.class, "page_home", 0, 1.0f, getArguments()).a(ProfilePageFragment.class, "page_profile", bundle);
        this.f3007d = aVar.a(getFragmentManager());
        this.f3005b.setAdapter(this.f3007d);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35066, new Class[0], Void.TYPE);
        } else if (this.k != null) {
            if (!this.k.isCanPlay() || this.k.isDelete()) {
                this.f3006c.c(false);
                this.f3005b.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41347a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f41347a, false, 35104, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f41347a, false, 35104, new Class[0], Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = DetailFragment.this.getActivity();
                        if (activity != null) {
                            if (a.a(DetailFragment.this.k)) {
                                com.bytedance.ies.dmt.ui.d.a.c(DetailFragment.this.getContext(), a.a(DetailFragment.this.k, C0906R.string.drx)).a();
                            } else if (DetailFragment.this.k.isImage()) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.b0y).a();
                            } else {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.drx).a();
                            }
                        }
                    }
                });
                return;
            }
            if (!this.i.a() || this.i.d()) {
                if (this.i.d()) {
                    this.f3006c.c(true);
                } else {
                    this.f3006c.c(false);
                }
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.F(this.k).booleanValue()) {
                this.f3006c.c(false);
                return;
            } else if (this.i.b()) {
                this.f3006c.c(true);
            } else {
                this.f3006c.c(false);
            }
            if (ex.b() || e()) {
                this.f3006c.c(false);
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35060, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.m) {
            if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35061, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35061, new Class[0], Void.TYPE);
            } else {
                h.a("prop_reuse");
                Intent intent = new Intent();
                ArrayList arrayList = new ArrayList();
                for (String str : this.k.getStickerIDs().split(",")) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
                intent.putStringArrayListExtra("reuse_sticker_ids", arrayList);
                intent.putExtra("first_face_sticker", (String) arrayList.get(0));
                intent.putExtra("sticker_music", this.k.getMusic());
                intent.putExtra("translation_type", 3);
                intent.putExtra("creation_id", UUID.randomUUID().toString());
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) getActivity(), intent);
            }
            this.m = false;
        }
    }

    @Subscribe
    public void receiveJumpToRecord(com.ss.android.ugc.aweme.shortvideo.sticker.unlock.f fVar) {
        this.m = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ao a(ao aoVar) {
        aoVar.c(this.f3008e.getPreviousPage()).k(this.f3008e.getUid()).i(this.f3008e.getFeedsAwemeId());
        if ("poi_page".equalsIgnoreCase(this.f3008e.getPreviousPage())) {
            aoVar.b("poi_page");
        }
        return aoVar;
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f3004a, true, 35076, new Class[]{String.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.detail.d.a.f41172b.b(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f3004a, true, 35076, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3004a, false, 35091, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3004a, false, 35091, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.n != null) {
            this.n.b(z);
        }
    }

    @Subscribe
    public void onEvent(a aVar) {
        long j2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3004a, false, 35083, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3004a, false, 35083, new Class[]{a.class}, Void.TYPE);
        } else if (getActivity() != null) {
            DetailPageFragment j3 = j();
            if (j3 != null) {
                if (PatchProxy.isSupport(new Object[0], j3, DetailPageFragment.f3010a, false, 35106, new Class[0], Long.TYPE)) {
                    j2 = ((Long) PatchProxy.accessDispatch(new Object[0], j3, DetailPageFragment.f3010a, false, 35106, new Class[0], Long.TYPE)).longValue();
                } else {
                    j2 = j3.f3013d.at();
                }
                if (j2 != aVar2.f41365b) {
                    getActivity().finish();
                }
            }
        }
    }

    @Subscribe
    public void onScrollToProfileEvent(aj ajVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{ajVar}, this, f3004a, false, 35082, new Class[]{aj.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ajVar}, this, f3004a, false, 35082, new Class[]{aj.class}, Void.TYPE);
        } else if (ajVar != null && this.f3006c != null && getActivity() != null && ajVar.f45286a == getActivity().hashCode() && this.f3006c != null) {
            if (this.i.a() && !this.i.b() && !this.i.d()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.c9).a();
            } else if (f()) {
                d();
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35084, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35084, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.G(this.k) || !com.ss.android.ugc.aweme.commercialize.utils.g.b(getContext(), this.k)) {
                    z = false;
                }
                if (!z && !e()) {
                    this.f3006c.a(this.k, ajVar.f45287b);
                }
            }
        }
    }

    public void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3004a, false, 35065, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3004a, false, 35065, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        String authorUid = aweme.getAuthorUid();
        if (!aweme.isAd() || this.i.d()) {
            if (!TextUtils.equals(this.l, authorUid)) {
                this.i.a(getContext(), aweme, this.f3008e.getEventType());
            } else {
                return;
            }
        } else if (this.i.b()) {
            getActivity();
            getFragmentManager();
            aweme.getAwemeRawAd().getWebUrl();
        }
        this.l = authorUid;
    }

    public void a(boolean z) {
        Aweme aweme;
        long j2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3004a, false, 35078, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3004a, false, 35078, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.detail.d.a aVar = com.ss.android.ugc.aweme.detail.d.a.f41172b;
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35079, new Class[0], Aweme.class)) {
            aweme = (Aweme) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35079, new Class[0], Aweme.class);
        } else {
            DetailPageFragment j3 = j();
            if (j3 != null) {
                if (PatchProxy.isSupport(new Object[0], j3, DetailPageFragment.f3010a, false, 35144, new Class[0], Aweme.class)) {
                    aweme = (Aweme) PatchProxy.accessDispatch(new Object[0], j3, DetailPageFragment.f3010a, false, 35144, new Class[0], Aweme.class);
                } else {
                    aweme = j3.f3013d.r();
                }
            } else {
                aweme = null;
            }
        }
        Aweme aweme2 = aweme;
        String c2 = c();
        int videoType = this.f3008e.getVideoType();
        String eventType = this.f3008e.getEventType();
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35081, new Class[0], Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35081, new Class[0], Long.TYPE)).longValue();
        } else {
            DetailPageFragment j4 = j();
            if (j4 != null) {
                if (PatchProxy.isSupport(new Object[0], j4, DetailPageFragment.f3010a, false, 35155, new Class[0], Long.TYPE)) {
                    j2 = ((Long) PatchProxy.accessDispatch(new Object[0], j4, DetailPageFragment.f3010a, false, 35155, new Class[0], Long.TYPE)).longValue();
                } else {
                    j2 = j4.f3013d.z();
                }
            } else {
                j2 = -1;
            }
        }
        aVar.a(aweme2, c2, videoType, eventType, j2, z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3004a, false, 35059, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3004a, false, 35059, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.h = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
        this.f3005b = (ScrollableViewPager) view.findViewById(C0906R.id.duu);
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f3004a, false, 35062, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f3004a, false, 35062, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            this.f3008e = (b) arguments.getSerializable("feed_param");
            this.f3009f = arguments.getBoolean("extra_challenge_is_hashtag", false);
            if (com.ss.android.g.a.a() && ("from_profile_self".equals(c()) || "from_profile_other".equals(c()) || "from_roaming".equals(c()))) {
                this.g = true;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35063, new Class[0], Void.TYPE);
        } else {
            a();
            this.f3007d.notifyDataSetChanged();
            this.f3006c = new bu(getActivity(), this.f3005b, this.f3007d);
            getActivity();
            this.f3006c.c(this.f3008e.getEventType());
            this.f3006c.d("page_home");
            this.f3006c.a((bu.a) new bu.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41337a;

                public final void a(int i) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41337a, false, 35099, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41337a, false, 35099, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 0) {
                        bg.a(new com.ss.android.ugc.aweme.music.a.g());
                    } else {
                        if (i2 == 1) {
                            a.c.f33273e = String.valueOf(i);
                        }
                    }
                }
            });
            this.f3006c.a((j) new j() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41339a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f41339a, false, 35100, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f41339a, false, 35100, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!(DetailFragment.this.f3005b == null || DetailFragment.this.i == null || !DetailFragment.this.f3006c.j())) {
                        DetailFragment.this.i.h();
                    }
                }
            });
            this.f3006c.m = new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41341a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41341a, false, 35101, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41341a, false, 35101, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!(DetailFragment.this.f3005b == null || !TextUtils.equals(DetailFragment.this.f3006c.a(i), "page_profile") || DetailFragment.this.k == null)) {
                        DetailFragment.this.i.i();
                        if (DetailFragment.this.f3006c != null && DetailFragment.this.k.isAd()) {
                            DetailFragment.this.k.withFakeUser();
                        }
                    }
                }
            };
            AwemeChangeCallBack.a(getActivity(), this, new AwemeChangeCallBack.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41343a;

                public final void a(Aweme aweme) {
                    if (PatchProxy.isSupport(new Object[]{aweme}, this, f41343a, false, 35102, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme}, this, f41343a, false, 35102, new Class[]{Aweme.class}, Void.TYPE);
                        return;
                    }
                    DetailFragment.this.i.a(DetailFragment.this.getContext(), aweme, DetailFragment.this.f3008e.getEventType());
                    DetailFragment.this.i.g();
                    if (!(aweme == null || aweme.getAuthor() == null)) {
                        a.C0419a.f33262a = aweme.getAid();
                        a.C0419a.f33263b = aweme.getAuthorUid();
                        a.C0419a.f33264c = DetailFragment.this.f3008e.getEventType();
                        DetailFragment.this.k = aweme;
                        DetailFragment.this.b();
                        String authorUid = aweme.getAuthorUid();
                        if (!TextUtils.equals(DetailFragment.this.j, authorUid)) {
                            DetailFragment.this.j = authorUid;
                            if (DetailFragment.this.k.isAd() && DetailFragment.this.k.getAuthor() != null) {
                                DetailFragment.this.k.getAuthor().getNickname();
                            }
                            com.ss.android.b.a.a.a.a(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f41345a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f41345a, false, 35103, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f41345a, false, 35103, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (DetailFragment.this.isAdded() && !DetailFragment.this.getActivity().isFinishing() && DetailFragment.this.k != null) {
                                        DetailFragment.this.a(DetailFragment.this.k);
                                    }
                                }
                            }, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
                        }
                    }
                }
            });
            this.f3006c.c(true);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3004a, false, 35093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3004a, false, 35093, new Class[0], Void.TYPE);
            return;
        }
        if (k()) {
            this.n = new AnalysisStayTimeFragmentComponent(this, true);
            this.n.f2737c = new e(this);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3004a, false, 35058, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ne, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3004a, false, 35058, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
