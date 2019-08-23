package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.forward.f.c;
import com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.e.d;
import com.ss.android.ugc.aweme.newfollow.f.a;
import com.ss.android.ugc.aweme.newfollow.f.e;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.f.g;
import com.ss.android.ugc.aweme.newfollow.f.j;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.n;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dq;
import com.ss.android.ugc.aweme.utils.dv;
import java.util.Iterator;
import org.greenrobot.eventbus.Subscribe;

public class FollowFeedFragment extends FeedFragment implements ScreenBroadcastReceiver.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3648a;

    /* renamed from: b  reason: collision with root package name */
    n f3649b;

    /* renamed from: c  reason: collision with root package name */
    public b f3650c;

    /* renamed from: d  reason: collision with root package name */
    public View f3651d;

    /* renamed from: e  reason: collision with root package name */
    public View f3652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3653f;
    String g;
    String h;
    String i;
    public long j;
    private e k;
    private g q;
    private a r;
    private f s;
    private ScreenBroadcastReceiver t;
    private j u;
    private boolean v;
    private View w;
    private String x;
    private String y;
    @IFollowFeedFetchTrigger.IRefreshType
    private Integer z;

    public boolean isRegisterEventBus() {
        return true;
    }

    public final int e() {
        return this.o;
    }

    private g f() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61482, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61482, new Class[0], g.class);
        }
        if (this.q == null) {
            this.q = new g();
        }
        return this.q;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61502, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f3649b != null) {
            this.f3649b.q();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61503, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f3649b != null) {
            this.f3649b.q();
            a(6);
        }
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f3648a, false, 61493, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("homepage_follow");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61493, new Class[0], Analysis.class);
    }

    public void onDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61488, new Class[0], Void.TYPE);
            return;
        }
        super.onDetach();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61485, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f3649b != null) {
            this.f3649b.k();
        }
        this.v = false;
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61496, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61496, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().aD() && (getActivity() instanceof MainActivity)) {
            return FollowEnterDetailViewModel.a("FollowFeedFragment", getActivity()).f57208b;
        } else {
            return false;
        }
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61500, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.v) {
            if (this.f3649b != null) {
                this.f3649b.j();
            }
            h();
            this.v = true;
        }
    }

    public final void L_() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61497, new Class[0], Void.TYPE);
            return;
        }
        if (AbTestManager.a().aD()) {
            if (!g()) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.n, "list");
            }
        } else if (!com.ss.android.ugc.aweme.newfollow.util.e.a().b()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.n, "list");
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61495, new Class[0], Void.TYPE);
        } else if (getActivity() != null) {
            if (((getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab() && !dq.a()) || (getActivity() instanceof RecommendFollowFeedActivity)) {
                com.ss.android.ugc.aweme.newfollow.g.a.a();
            }
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61486, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        if (this.f3649b != null) {
            this.f3649b.l();
        }
        if (getActivity() != null) {
            if (((getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab()) || (getActivity() instanceof RecommendFollowFeedActivity)) {
                L_();
            }
            this.v = false;
            k.a().d();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61487, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            if (this.f3649b != null) {
                this.f3649b.j();
            }
            h();
            this.v = true;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61506, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            j jVar = this.u;
            if (PatchProxy.isSupport(new Object[0], jVar, j.f57149a, false, 61316, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], jVar, j.f57149a, false, 61316, new Class[0], Void.TYPE);
            } else if (jVar.f57150b != null) {
                jVar.f57150b.q();
                n nVar = jVar.f57150b;
                if (PatchProxy.isSupport(new Object[0], nVar, n.f57731a, false, 62270, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], nVar, n.f57731a, false, 62270, new Class[0], Void.TYPE);
                } else if (!(nVar.j == null || ((FollowFeedAdapter) nVar.j).h == null)) {
                    ((FollowFeedAdapter) nVar.j).h.k();
                }
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61498, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.k != null) {
            this.k.k();
            this.k.j();
            this.k.p();
            this.k.o();
        }
        if (this.r != null) {
            this.r.k();
            this.r.j();
            a aVar = this.r;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f3642a, false, 61208, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f3642a, false, 61208, new Class[0], Void.TYPE);
            } else {
                bg.d(aVar);
            }
        }
        if (this.s != null) {
            this.s.k();
            this.s.j();
            this.s.e();
        }
        if (this.f3649b != null) {
            this.f3649b.m();
        }
        this.t.a();
        com.ss.android.ugc.aweme.newfollow.util.e.a().a("key_container_follow");
        c.a().b();
    }

    public final void a(long j2) {
        if (this.f3650c != null) {
            this.f3650c.f47768e = j2;
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3648a, false, 61480, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3648a, false, 61480, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        this.f3653f = bundle.getBoolean("extra_follow_lazy_refresh", false);
        this.x = bundle.getString("extra_story_insert_uid");
        this.y = bundle.getString("extra_insert_aweme_id");
    }

    public void onAttach(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f3648a, false, 61484, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f3648a, false, 61484, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(activity)) {
            if (activity instanceof MainActivity) {
                MainActivity mainActivity = (MainActivity) activity;
                a(mainActivity.getBinder(), mainActivity.getProcessedCallback());
            }
        } else if (activity instanceof MainActivity) {
            this.q = f();
            this.q.a(false);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3648a, false, 61505, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3648a, false, 61505, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if ((TextUtils.equals("aweme", gVar.itemType) && TextUtils.equals("homepage_follow", gVar.enterFrom) && TextUtils.equals("extra_follow_type_follow", this.p)) || (TextUtils.equals("homepage_friends", gVar.enterFrom) && TextUtils.equals("extra_follow_type_friend", this.p))) {
            dv.a(getActivity(), this.w, gVar);
        }
    }

    public void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3648a, false, 61492, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3648a, false, 61492, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z2);
        if (this.f3649b != null) {
            this.f3649b.b_(!z2);
        }
        if (z2) {
            this.f3650c.f47769f = 0;
            this.j = System.currentTimeMillis();
        }
    }

    @Subscribe
    public void onLiveRoomScrollEvent(com.ss.android.ugc.aweme.live.model.e eVar) {
        com.ss.android.ugc.aweme.live.model.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3648a, false, 61509, new Class[]{com.ss.android.ugc.aweme.live.model.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3648a, false, 61509, new Class[]{com.ss.android.ugc.aweme.live.model.e.class}, Void.TYPE);
            return;
        }
        n nVar = this.f3649b;
        if (PatchProxy.isSupport(new Object[]{eVar2}, nVar, n.f57731a, false, 62285, new Class[]{com.ss.android.ugc.aweme.live.model.e.class}, Void.TYPE)) {
            n nVar2 = nVar;
            PatchProxy.accessDispatch(new Object[]{eVar2}, nVar2, n.f57731a, false, 62285, new Class[]{com.ss.android.ugc.aweme.live.model.e.class}, Void.TYPE);
            return;
        }
        if (nVar.j != null) {
            com.ss.android.ugc.aweme.story.api.b.c cVar = ((FollowFeedAdapter) nVar.j).h;
            if (cVar != null) {
                cVar.a(eVar2.f53503a);
            }
        }
    }

    @Subscribe
    public void onStoryPublishAnimEnd(com.ss.android.ugc.aweme.main.c.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3648a, false, 61507, new Class[]{com.ss.android.ugc.aweme.main.c.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3648a, false, 61507, new Class[]{com.ss.android.ugc.aweme.main.c.e.class}, Void.TYPE);
            return;
        }
        if (this.u != null) {
            j jVar = this.u;
            if (PatchProxy.isSupport(new Object[0], jVar, j.f57149a, false, 61317, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], jVar, j.f57149a, false, 61317, new Class[0], Void.TYPE);
            } else if (jVar.f57150b != null) {
                n nVar = jVar.f57150b;
                if (PatchProxy.isSupport(new Object[0], nVar, n.f57731a, false, 62274, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], nVar, n.f57731a, false, 62274, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.story.api.b.c cVar = ((FollowFeedAdapter) nVar.j).h;
                if (cVar != null) {
                    cVar.l();
                }
            }
        }
    }

    public void setUserVisibleHint(boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3648a, false, 61491, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3648a, false, 61491, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        com.ss.android.ugc.aweme.y.a a2 = com.ss.android.ugc.aweme.y.a.a();
        boolean equals = TextUtils.equals(this.p, "extra_follow_type_follow");
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(equals ? (byte) 1 : 0)}, a2, com.ss.android.ugc.aweme.y.a.f76939a, false, 62684, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(equals)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.y.a aVar = a2;
            PatchProxy.accessDispatch(objArr2, aVar, com.ss.android.ugc.aweme.y.a.f76939a, false, 62684, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.app.k.a(), bm.class);
            if (bmVar != null) {
                bmVar.z(equals);
            }
        }
        if (this.f3649b != null) {
            this.f3649b.d(z3);
        }
        if (z3) {
            h();
            if (getActivity() != null) {
                FriendTabViewModel.a(getActivity()).f57253c.setValue(new n(this.n, true));
            }
        } else {
            L_();
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3648a, false, 61511, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3648a, false, 61511, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f3649b.q();
        n nVar = this.f3649b;
        if (PatchProxy.isSupport(new Object[]{str2}, nVar, n.f57731a, false, 62272, new Class[]{String.class}, Void.TYPE)) {
            n nVar2 = nVar;
            PatchProxy.accessDispatch(new Object[]{str2}, nVar2, n.f57731a, false, 62272, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!(nVar.j == null || ((FollowFeedAdapter) nVar.j).h == null)) {
            ((FollowFeedAdapter) nVar.j).h.a(str2);
        }
    }

    public final boolean d(boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3648a, false, 61489, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3648a, false, 61489, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (z3 && this.f3649b != null) {
            this.f3649b.q();
        }
        e eVar = this.k;
        ((b) eVar.f2978e).f47767d = z3;
        eVar.s = z3;
        if (this.f3649b != null) {
            n nVar = this.f3649b;
            Integer num = this.z;
            if (PatchProxy.isSupport(new Object[]{num}, nVar, n.f57731a, false, 62245, new Class[]{Integer.class}, Void.TYPE)) {
                n nVar2 = nVar;
                PatchProxy.accessDispatch(new Object[]{num}, nVar2, n.f57731a, false, 62245, new Class[]{Integer.class}, Void.TYPE);
            } else {
                nVar.v = num;
                nVar.a();
            }
        }
        return false;
    }

    @Subscribe
    public void onVoteEvent(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a aVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3648a, false, 61508, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3648a, false, 61508, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE);
            return;
        }
        n nVar = this.f3649b;
        if (PatchProxy.isSupport(new Object[]{aVar2}, nVar, n.f57731a, false, 62283, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE)) {
            n nVar2 = nVar;
            PatchProxy.accessDispatch(new Object[]{aVar2}, nVar2, n.f57731a, false, 62283, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE);
        } else if (aVar2 != null && nVar.j != null) {
            for (int i2 = 0; i2 < ((FollowFeedAdapter) nVar.j).getItemCount(); i2++) {
                com.ss.android.ugc.aweme.newfollow.e.b a2 = ((FollowFeedAdapter) nVar.j).a(i2);
                if (a2 instanceof FollowFeed) {
                    Aweme aweme = a2.getAweme();
                    if (aweme != null && TextUtils.equals(aweme.getAid(), aVar2.f69865a)) {
                        for (InteractStickerStruct voteStruct : aweme.getInteractStickerStructs()) {
                            VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                            if (voteStruct2 != null && voteStruct2.getOptions() != null) {
                                Iterator<VoteStruct.OptionsBean> it2 = voteStruct2.getOptions().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (it2.next().getOptionId() == aVar2.f69866b) {
                                            voteStruct2.setSelectOptionId(aVar2.f69866b);
                                            if (!PatchProxy.isSupport(new Object[]{aweme}, nVar, n.f57731a, false, 62284, new Class[]{Aweme.class}, Void.TYPE)) {
                                                int findFirstVisibleItemPosition = nVar.k.findFirstVisibleItemPosition();
                                                int findLastVisibleItemPosition = nVar.k.findLastVisibleItemPosition();
                                                while (true) {
                                                    if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                                                        break;
                                                    }
                                                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = nVar.mRecyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                                                    if (findViewHolderForAdapterPosition instanceof FollowVideoViewHolder) {
                                                        FollowVideoViewHolder followVideoViewHolder = (FollowVideoViewHolder) findViewHolderForAdapterPosition;
                                                        if (TextUtils.equals(followVideoViewHolder.j.getAid(), aweme.getAid())) {
                                                            followVideoViewHolder.j = aweme;
                                                            followVideoViewHolder.ab();
                                                            break;
                                                        }
                                                    }
                                                    if (findViewHolderForAdapterPosition instanceof ForwardVideoViewHolder) {
                                                        ForwardVideoViewHolder forwardVideoViewHolder = (ForwardVideoViewHolder) findViewHolderForAdapterPosition;
                                                        if (TextUtils.equals(forwardVideoViewHolder.f48319d.getAid(), aweme.getAid())) {
                                                            forwardVideoViewHolder.f48319d = aweme;
                                                            forwardVideoViewHolder.N();
                                                            break;
                                                        }
                                                    }
                                                    findFirstVisibleItemPosition++;
                                                }
                                            } else {
                                                n nVar3 = nVar;
                                                PatchProxy.accessDispatch(new Object[]{aweme}, nVar3, n.f57731a, false, 62284, new Class[]{Aweme.class}, Void.TYPE);
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean a(@IFollowFeedFetchTrigger.IRefreshType int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3648a, false, 61490, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3648a, false, 61490, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.z = Integer.valueOf(i2);
        if (!(i2 == 2 || i2 == 1)) {
            z2 = false;
        }
        return d(z2);
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.publish.c cVar, IPublishService.OnPublishCallback onPublishCallback) {
        if (PatchProxy.isSupport(new Object[]{cVar, onPublishCallback}, this, f3648a, false, 61499, new Class[]{com.ss.android.ugc.aweme.shortvideo.publish.c.class, IPublishService.OnPublishCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, onPublishCallback}, this, f3648a, false, 61499, new Class[]{com.ss.android.ugc.aweme.shortvideo.publish.c.class, IPublishService.OnPublishCallback.class}, Void.TYPE);
            return;
        }
        this.q = f();
        this.q.f57133b = onPublishCallback;
        this.q.a(cVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        a aVar;
        e eVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3648a, false, 61479, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3648a, false, 61479, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f3651d = view2.findViewById(C0906R.id.b__);
        this.f3652e = view2.findViewById(C0906R.id.b80);
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61483, new Class[0], a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61483, new Class[0], a.class);
        } else {
            if (this.r == null) {
                this.r = new a();
            }
            aVar = this.r;
        }
        this.r = aVar;
        a aVar2 = this.r;
        if (PatchProxy.isSupport(new Object[0], aVar2, a.f3642a, false, 61207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar2, a.f3642a, false, 61207, new Class[0], Void.TYPE);
        } else {
            bg.c(aVar2);
        }
        this.s = new f(this.n, this.o);
        this.s.d();
        this.f3649b = new n();
        this.f3649b.f57734d = this.p;
        this.f3649b.f57735e = this.n;
        this.s.a(new aa());
        this.s.a((j) this.f3649b);
        this.t = new ScreenBroadcastReceiver(getContext());
        this.t.a(this);
        if (PatchProxy.isSupport(new Object[0], this, f3648a, false, 61481, new Class[0], e.class)) {
            eVar = (e) PatchProxy.accessDispatch(new Object[0], this, f3648a, false, 61481, new Class[0], e.class);
        } else {
            if (this.k == null) {
                this.k = new e(this);
            }
            eVar = this.k;
        }
        this.k = eVar;
        this.k.a((Fragment) this, e());
        this.k.a(this.f3649b);
        this.f3649b.h = this.x;
        this.f3649b.g(this.f3653f);
        this.f3649b.a(this, view2, this.k, (com.ss.android.ugc.aweme.newfollow.b.a) this.s);
        g f2 = f();
        n nVar = this.f3649b;
        if (PatchProxy.isSupport(new Object[]{nVar}, f2, g.f57132a, false, 61305, new Class[]{n.class}, Void.TYPE)) {
            g gVar = f2;
            PatchProxy.accessDispatch(new Object[]{nVar}, gVar, g.f57132a, false, 61305, new Class[]{n.class}, Void.TYPE);
        } else {
            f2.f57135d = nVar;
            if (f2.f57135d != null) {
                f2.f57135d.q();
            }
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(getContext())) {
            f().a();
        }
        this.u = new j();
        j jVar = this.u;
        n nVar2 = this.f3649b;
        if (PatchProxy.isSupport(new Object[]{nVar2}, jVar, j.f57149a, false, 61315, new Class[]{n.class}, Void.TYPE)) {
            j jVar2 = jVar;
            PatchProxy.accessDispatch(new Object[]{nVar2}, jVar2, j.f57149a, false, 61315, new Class[]{n.class}, Void.TYPE);
        } else {
            jVar.f57150b = nVar2;
            if (jVar.f57150b != null) {
                jVar.f57150b.q();
            }
        }
        this.f3650c = new b();
        this.f3650c.f47765b = this.n;
        this.f3650c.f47766c = this.p;
        this.k.a(this.f3650c);
        this.f3650c.f47768e = System.currentTimeMillis();
        if (getActivity() instanceof MainActivity) {
            this.g = ((MainActivity) getActivity()).getPushAwemeId();
            this.h = ((MainActivity) getActivity()).getPushAwemeIds();
            this.i = ((MainActivity) getActivity()).getPushParams();
        }
        if (TextUtils.isEmpty(this.g)) {
            this.g = this.y;
        }
        if (!this.f3653f) {
            if (TextUtils.equals(this.n, "homepage_follow")) {
                FollowPageFirstFrameViewModel.a(getActivity()).b();
            }
            this.f3649b.a(this.g, this.h, this.i);
        }
        this.r.a(this.f3649b);
        this.r.a(new d());
        if (!com.ss.android.g.a.a() || TextUtils.equals(this.n, "rec_follow")) {
            view2.findViewById(C0906R.id.cv0).setVisibility(8);
        }
        this.w = view2.findViewById(C0906R.id.csg);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f3648a, false, 61501, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f3648a, false, 61501, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            d(false);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3648a, false, 61478, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3648a, false, 61478, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.p2, viewGroup2, false);
        com.ss.android.ugc.aweme.common.ui.b.a(inflate.findViewById(C0906R.id.cv0));
        return inflate;
    }
}
