package com.ss.android.ugc.aweme.music.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.music.a.a;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.m;
import com.ss.android.ugc.aweme.music.presenter.n;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.views.DividerItemDecoration;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class MusicDetailFragmentOld extends BaseDetailFragment implements b, aa<a>, IShareService.IActionHandler, IShareService.OnShareCallback, n {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f3622f;
    private String J;
    private String K;
    private m L;
    private com.ss.android.ugc.aweme.favorites.c.a M;
    private IShareService.SharePage N;
    private Music O;
    private boolean P;
    private DetailAwemeListFragment Q;
    private MusicDetail R;
    private int S;
    private String T;
    private long U;
    @BindView(2131494082)
    Button btnEditMusicTitle;
    public String g;
    d h;
    public MusicModel i;
    @BindView(2131495813)
    CheckableImageView ivMusicCollect;
    @BindView(2131496069)
    ImageView ivMusicianMark;
    @BindView(2131496065)
    OriginalMusicEntryView ivOriginalMusicEntryView;
    @BindView(2131495826)
    ImageView ivPlay;
    @BindView(2131495832)
    ImageView ivStop;
    public com.ss.android.ugc.b.b j;
    public DetailAwemeListFragment k;
    public String l;
    float m;
    @BindView(2131493263)
    RemoteImageView mBgCover;
    @BindView(2131494572)
    View mHeadLayout;
    @BindView(2131495814)
    RemoteImageView mMusicCover;
    @BindView(2131495823)
    ViewGroup mMusicName;
    @BindView(2131495834)
    TextView mMusicTitle;
    @BindView(2131498339)
    TextView mMusicUsedCount;
    @BindView(2131498026)
    TextView mNickName;
    @BindView(2131498051)
    TextView mPlaceHolder;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497613)
    View mTitleLayout;
    float n;
    private boolean o;
    private boolean p;
    @BindView(2131497461)
    RecyclerView recyclerTag;
    @BindView(2131493928)
    View tagLayout;
    @BindView(2131497459)
    View tagMask;
    @BindView(2131494096)
    TextView txtElse;
    @BindView(2131496067)
    TextView txtOriginMusicName;

    public final String a(int i2) {
        return i2 == 0 ? "single_song" : i2 == 1 ? "single_song_fresh" : "";
    }

    public final int n() {
        return C0906R.layout.ot;
    }

    public final String p() {
        return "single_song";
    }

    public final String o() {
        return this.g;
    }

    public final /* synthetic */ void a(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3622f, false, 60295, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3622f, false, 60295, new Class[]{a.class}, Void.TYPE);
            return;
        }
        int i2 = aVar.f56165a;
        if (i2 == 0) {
            this.o = true;
        } else if (i2 == 1) {
            this.p = true;
        }
        if (this.p && this.o) {
            if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60296, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60296, new Class[0], Void.TYPE);
                return;
            }
            this.k.b();
            this.Q.b();
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3622f, false, 60264, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3622f, false, 60264, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.g = bundle.getString("id");
            this.J = bundle.getString("aweme_id");
            this.K = bundle.getString("extra_music_from");
            this.G = bundle.getString("sticker_id");
            this.S = bundle.getInt("click_reason");
            this.l = bundle.getString("from_token");
        }
    }

    public final void a(MusicDetail musicDetail) {
        MusicDetail musicDetail2 = musicDetail;
        if (PatchProxy.isSupport(new Object[]{musicDetail2}, this, f3622f, false, 60273, new Class[]{MusicDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicDetail2}, this, f3622f, false, 60273, new Class[]{MusicDetail.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (musicDetail2 == null || musicDetail2.music == null) {
                this.mStatusView.b(false);
                return;
            }
            this.mStatusView.b(true);
            this.R = musicDetail2;
            Music music = musicDetail2.music;
            this.O = music;
            if (music.isOriginMusic()) {
                if (((Boolean) SharePrefCache.inst().getOriginalMusicianEntry().c()).booleanValue()) {
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f56489a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f56489a, false, 60306, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f56489a, false, 60306, new Class[0], Void.TYPE);
                                return;
                            }
                            if (MusicDetailFragmentOld.this.ivOriginalMusicEntryView != null) {
                                OriginalMusicEntryView originalMusicEntryView = MusicDetailFragmentOld.this.ivOriginalMusicEntryView;
                                if (PatchProxy.isSupport(new Object[0], originalMusicEntryView, OriginalMusicEntryView.f56650a, false, 60526, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], originalMusicEntryView, OriginalMusicEntryView.f56650a, false, 60526, new Class[0], Void.TYPE);
                                    return;
                                }
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(originalMusicEntryView, "translationX", new float[]{120.0f, 50.0f});
                                ofFloat.setDuration(300);
                                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(originalMusicEntryView, "translationY", new float[]{0.0f, 10.0f, 0.0f});
                                ofFloat2.setDuration(1200);
                                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                                ofFloat2.setRepeatCount(-1);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(ofFloat2).after(ofFloat);
                                animatorSet.start();
                            }
                        }
                    }, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                }
                this.ivMusicianMark.setVisibility(0);
                this.ivMusicianMark.setImageDrawable(ContextCompat.getDrawable(getContext(), 2130840173));
                this.ivOriginalMusicEntryView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56491a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f56491a, false, 60307, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f56491a, false, 60307, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        Intent intent = new Intent(MusicDetailFragmentOld.this.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse((String) SharePrefCache.inst().getOrginalMusicianUrl().c()));
                        MusicDetailFragmentOld.this.startActivity(intent);
                    }
                });
                this.mMusicTitle.setText(music.getMusicName());
                this.mMusicTitle.setVisibility(0);
                this.mNickName.setText(String.format("@%s", new Object[]{music.getAuthorName()}));
                this.mPlaceHolder.setText(C0906R.string.bks);
                ViewCompat.setLayoutDirection(this.mMusicName, 1);
                this.mMusicName.setClickable(true);
                this.mMusicName.setVisibility(0);
            } else {
                boolean z = !TextUtils.isEmpty(music.getOwnerId());
                if (z) {
                    this.mNickName.setText(String.format("@%s", new Object[]{music.getOwnerNickName()}));
                    this.mPlaceHolder.setText(C0906R.string.bkp);
                    this.mMusicName.setVisibility(0);
                    this.mMusicName.setClickable(true);
                } else {
                    this.mMusicTitle.setText(music.getMusicName() + " - " + music.getAuthorName());
                    this.mMusicTitle.setVisibility(0);
                    this.mMusicTitle.setClickable(true);
                    this.mMusicName.setVisibility(8);
                }
                this.u.setText(z ? music.getOwnerNickName() : music.getMusicName());
                a(z, a(music));
            }
            String a2 = a((long) music.getUserCount());
            this.mMusicUsedCount.setText(a2 + " ");
            if (CollectionUtils.isEmpty(musicDetail2.relatedChallengeMusicList)) {
                this.tagLayout.setVisibility(8);
            } else {
                b(musicDetail);
                this.txtElse.setVisibility(0);
                this.tagLayout.setVisibility(0);
                RelatedMusicChallengeAdapter relatedMusicChallengeAdapter = new RelatedMusicChallengeAdapter(musicDetail2.relatedChallengeMusicList, getContext());
                relatedMusicChallengeAdapter.f35572e = "music_page";
                relatedMusicChallengeAdapter.f35570c = this.g;
                RecyclerView recyclerView = this.recyclerTag;
                DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(C0906R.color.a17), (int) UIUtils.dip2Px(getActivity(), 4.0f), 0, UIUtils.dip2Px(getActivity(), 0.0f), UIUtils.dip2Px(getActivity(), 0.0f), false);
                recyclerView.addItemDecoration(dividerItemDecoration);
                this.recyclerTag.setHasFixedSize(true);
                this.recyclerTag.setLayoutManager(new WrapLinearLayoutManager(getActivity(), 0, false));
                this.recyclerTag.setAdapter(relatedMusicChallengeAdapter);
            }
            int height = this.recyclerTag.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.tagMask.getLayoutParams();
            layoutParams.height = height;
            this.tagMask.setLayoutParams(layoutParams);
            c.b(this.mMusicCover, music.getCoverMedium());
            c.b(this.mBgCover, music.getCoverLarge());
            this.i = com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.O);
            if (this.i.getCollectionType() != null) {
                this.P = MusicModel.CollectionType.COLLECTED.equals(this.i.getCollectionType());
            }
            b();
        }
    }

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f3622f, false, 60287, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f3622f, false, 60287, new Class[]{BaseResponse.class}, Void.TYPE);
        } else if (this.P) {
            this.i.setCollectionType(MusicModel.CollectionType.COLLECTED);
            this.O.setCollectStatus(1);
            bg.a(new e(1, this.i));
            r.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i))).setExtValueLong(0));
        } else {
            this.i.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            this.O.setCollectStatus(0);
            bg.a(new e(0, this.i));
            r.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i))).setExtValueLong(0));
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f3622f, false, 60299, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f3622f, false, 60299, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        super.a(musicModel);
        r.a("download_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "single_song").a("enter_method", "click_shoot").f34114b);
    }

    public final void a(@NonNull Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f3622f, false, 60300, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f3622f, false, 60300, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(this.T)) {
            this.T = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.T);
    }

    private void e() {
        this.P = !this.P;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        a(true);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60294, new Class[0], Void.TYPE);
            return;
        }
        this.ivPlay.setVisibility(0);
        this.ivStop.setVisibility(8);
        this.j.b();
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60285, new Class[0], Void.TYPE);
        } else if (this.ivMusicCollect != null) {
            CheckableImageView checkableImageView = this.ivMusicCollect;
            if (this.P) {
                i2 = 2130839385;
            } else {
                i2 = 2130839386;
            }
            checkableImageView.setImageResource(i2);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60263, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.L != null) {
            this.L.k();
        }
        if (this.j != null) {
            this.j.a();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60291, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        f();
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60265, new Class[0], Void.TYPE);
            return;
        }
        super.q();
        this.u.setAlpha(0.0f);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60292, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60272, new Class[0], Void.TYPE);
        } else if (this.h != null && this.h.isShowing()) {
            this.h.dismiss();
            this.h = null;
        }
        if (this.j != null) {
            this.j.a();
        }
    }

    public final FragmentPagerAdapter s() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60262, new Class[0], FragmentPagerAdapter.class)) {
            return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60262, new Class[0], FragmentPagerAdapter.class);
        }
        this.D = new ArrayList();
        this.f2808b = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.k = (DetailAwemeListFragment) childFragmentManager.findFragmentByTag(r + 0);
        if (this.k == null) {
            this.k = DetailAwemeListFragment.a(0, "single_song", this.g, this.K);
        }
        DetailAwemeListFragment detailAwemeListFragment = this.k;
        if (this.B == 0) {
            z = true;
        } else {
            z = false;
        }
        detailAwemeListFragment.m = z;
        this.k.g = this;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        this.Q = (DetailAwemeListFragment) childFragmentManager2.findFragmentByTag(r + 1);
        if (this.Q == null) {
            this.Q = DetailAwemeListFragment.a(1, "single_song_fresh", this.g, this.K);
        }
        DetailAwemeListFragment detailAwemeListFragment2 = this.Q;
        if (this.B == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        detailAwemeListFragment2.m = z2;
        this.Q.g = this;
        this.D.add(this.k);
        this.f2808b.add(0);
        this.D.add(this.Q);
        this.f2808b.add(1);
        if (!TextUtils.isEmpty(this.l)) {
            this.k.a((com.ss.android.ugc.aweme.fragment.a) new com.ss.android.ugc.aweme.fragment.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56487a;

                public final void a(boolean z, boolean z2) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f56487a, false, 60305, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f56487a, false, 60305, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        r.a("enter_music_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("request_id", String.valueOf(MusicDetailFragmentOld.this.k.j())).a("music_id", MusicDetailFragmentOld.this.g).a("enter_from", MusicDetailFragmentOld.this.l).b().f34114b);
                    }
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractBaseDetailFragment.a aVar : this.D) {
            arrayList.add((AmeBaseFragment) aVar);
        }
        return new ProfileFragmentAdapter(getChildFragmentManager(), arrayList, this.f2808b);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60284, new Class[0], Void.TYPE);
        } else if (this.i != null && this.ivMusicCollect != null) {
            this.M.a(1, com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i), Integer.valueOf(true ^ this.P ? 1 : 0));
            e();
            if (this.ivMusicCollect != null) {
                this.ivMusicCollect.b();
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3622f, false, 60288, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3622f, false, 60288, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        e();
        b();
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3622f, false, 60261, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3622f, false, 60261, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mStatusView.c(true)) {
            this.L.a(this.g, Integer.valueOf(this.S));
            if (z) {
                for (AbstractBaseDetailFragment.a e2 : this.D) {
                    e2.e();
                }
            }
        }
    }

    public final void b_(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3622f, false, 60277, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3622f, false, 60277, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.a(true);
        }
    }

    public final void c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3622f, false, 60289, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3622f, false, 60289, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.c(i2);
        if (i3 == 0) {
            r.a((Context) getActivity(), "click_hot", "single_song", 0, 0);
            return;
        }
        if (i3 == 1) {
            r.a((Context) getActivity(), "click_fresh", "single_song", 0, 0);
        }
    }

    @Subscribe
    public void onEvent(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3622f, false, 60269, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3622f, false, 60269, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("music", gVar2.itemType)) {
            dv.a(getActivity(), this.mHeadLayout, gVar2);
        }
    }

    private void b(MusicDetail musicDetail) {
        String str;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{musicDetail}, this, f3622f, false, 60276, new Class[]{MusicDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicDetail}, this, f3622f, false, 60276, new Class[]{MusicDetail.class}, Void.TYPE);
            return;
        }
        Music music = musicDetail.music;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<RelatedChallengeMusic> list = musicDetail.relatedChallengeMusicList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            RelatedChallengeMusic relatedChallengeMusic = list.get(i4);
            if (relatedChallengeMusic.categoryType == 1) {
                Music music2 = relatedChallengeMusic.music;
                if (music2 != null) {
                    sb.append(music2.getMid());
                    sb.append(",");
                }
            } else if (relatedChallengeMusic.categoryType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (music != null) {
                    sb2.append(challenge.getCid());
                    sb2.append(",");
                }
            }
        }
        String str2 = PushConstants.PUSH_TYPE_NOTIFY;
        if (TextUtils.equals(this.K, "from_related_tag")) {
            str = this.g;
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str2);
            jSONObject.put("enter_from", str);
            JSONObject jSONObject2 = new JSONObject();
            String sb3 = sb.toString();
            if (sb.length() > 0) {
                i2 = sb.length() - 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("music", sb3.substring(0, i2));
            String sb4 = sb2.toString();
            if (sb2.length() > 0) {
                i3 = sb2.length() - 1;
            } else {
                i3 = 0;
            }
            jSONObject2.put("challenge", sb4.substring(0, i3));
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.g).setJsonObject(jSONObject));
    }

    public boolean checkStatus(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3622f, false, 60279, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f3622f, false, 60279, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!cg.a(str, 5)) {
            return true;
        } else {
            if (PatchProxy.isSupport(new Object[]{str}, this, f3622f, false, 60280, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f3622f, false, 60280, new Class[]{String.class}, Void.TYPE);
            } else if (!(getActivity() == null || this.O == null || this.O.getShareInfo() == null)) {
                new ShareCommandFactory(getActivity(), str, this.O.getShareInfo()).a("sslocal://music/detail/" + this.g, 3, this.g);
                r.a("share_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.O.getId()).a("platform", str).a("share_mode", "token").f34114b);
            }
            if (this.N != null) {
                this.N.dismiss();
            }
            return false;
        }
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f3622f, false, 60297, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f3622f, false, 60297, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
        } else if (this.i != null) {
            r.onEvent(new MobClick().setEventName("share_single_song").setLabelName(shareResult.type).setExtValueString(this.i.getSongId()).setJsonObject(new t().a("request_id", String.valueOf(this.k.i())).a()));
            if (!TextUtils.equals(shareResult.type, "qr_code")) {
                r.a("share_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i)).a("platform", shareResult.type).a("share_mode", "normal_share").f34114b);
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3622f, false, 60298, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3622f, false, 60298, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (arVar.f45292b == 2) {
            String str = (String) arVar.f45293c;
            if (isViewValid() && this.R != null && !TextUtils.isEmpty(str)) {
                Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str);
                if (!(b2 == null || b2.getMusic() == null || b2.getMusic().getId() != this.R.music.getId())) {
                    int userCount = this.R.music.getUserCount();
                    if (userCount > 0) {
                        this.R.music.setUserCount(userCount - 1);
                        a(this.R);
                    }
                }
            }
        }
    }

    private boolean a(Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, this, f3622f, false, 60274, new Class[]{Music.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{music}, this, f3622f, false, 60274, new Class[]{Music.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    @OnClick({2131493213, 2131497316, 2131495814, 2131497081, 2131495813, 2131495832, 2131495826, 2131495823, 2131494082})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3622f, false, 60268, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3622f, false, 60268, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (id != C0906R.id.cup) {
            List<Aweme> list = null;
            if (id == C0906R.id.bo_) {
                if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60286, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60286, new Class[0], Void.TYPE);
                } else if (!this.P) {
                    r.a("favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i)).f34114b);
                } else {
                    r.a("cancel_favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i)).f34114b);
                }
                if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a((Fragment) this, "single_song", "click_favorite_music", (Bundle) null, (f) new n(this));
                } else {
                    a();
                }
            } else {
                if (id == C0906R.id.cp9) {
                    if (this.O != null) {
                        r.a(getActivity().getApplicationContext(), "click_share_button", "music_hot", this.O.getMid(), 0);
                    }
                    if (this.N != null) {
                        if (this.O == null || this.O.getShareInfo() == null) {
                            this.N.updateShareStruct(null);
                        } else {
                            if (this.k != null) {
                                list = this.k.l();
                            }
                            this.N.updateShareStruct(i.a((Context) getActivity(), this.O, list));
                        }
                        com.ss.android.ugc.aweme.sec.a.a("share");
                        this.N.show();
                    }
                } else if (id == C0906R.id.bon) {
                    if (com.ss.android.ugc.aweme.music.util.d.a(this.i, (Context) getActivity(), true)) {
                        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60293, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60293, new Class[0], Void.TYPE);
                        } else {
                            this.ivPlay.setVisibility(8);
                            this.ivStop.setVisibility(0);
                            if (this.i != null) {
                                final com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
                                aVar.a(com.ss.android.ugc.aweme.music.util.d.a(true));
                                if (this.i.getMusicType() == MusicModel.MusicType.ONLINE) {
                                    aVar.f77132b = 4;
                                }
                                aVar.f77133c = this.i.getDuration();
                                com.ss.android.ugc.aweme.music.c.a().f56320b = new c.a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f56493a;

                                    public final void a(String str) {
                                        if (PatchProxy.isSupport(new Object[]{str}, this, f56493a, false, 60308, new Class[]{String.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{str}, this, f56493a, false, 60308, new Class[]{String.class}, Void.TYPE);
                                            return;
                                        }
                                        aVar.f77131a = MusicDetailFragmentOld.this.i.getPath();
                                        MusicDetailFragmentOld.this.j.a(aVar);
                                    }
                                };
                                this.j.a((com.ss.android.ugc.b.a.d) new com.ss.android.ugc.b.a.d() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f56496a;

                                    public final void a(int i, int i2) {
                                        if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f56496a, false, 60309, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f56496a, false, 60309, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        MusicDetailFragmentOld musicDetailFragmentOld = MusicDetailFragmentOld.this;
                                        MusicModel musicModel = MusicDetailFragmentOld.this.i;
                                        if (PatchProxy.isSupport(new Object[]{musicModel, "play_music"}, musicDetailFragmentOld, MusicDetailFragmentOld.f3622f, false, 60267, new Class[]{MusicModel.class, String.class}, Void.TYPE)) {
                                            Object[] objArr = {musicModel, "play_music"};
                                            Object[] objArr2 = objArr;
                                            ChangeQuickRedirect changeQuickRedirect = MusicDetailFragmentOld.f3622f;
                                            PatchProxy.accessDispatch(objArr2, musicDetailFragmentOld, changeQuickRedirect, false, 60267, new Class[]{MusicModel.class, String.class}, Void.TYPE);
                                            return;
                                        }
                                        if (musicModel != null) {
                                            r.a("play_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "single_song").a("enter_method", "click_play_music").f34114b);
                                        }
                                    }
                                });
                                com.ss.android.ugc.aweme.music.c.a().a(this.i, aVar.f77134d);
                                r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("single_song").setJsonObject(new t().a("song_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.i)).a()));
                            }
                        }
                    }
                } else if (id == C0906R.id.bot) {
                    f();
                } else if (id == C0906R.id.bok) {
                    if (!(this.i == null || this.i.getMusic() == null || TextUtils.isEmpty(this.i.getMusic().getOwnerId()))) {
                        h a2 = h.a();
                        a2.a(j.a("aweme://user/profile/" + this.i.getMusic().getOwnerId()).a("sec_user_id", this.i.getMusic().getSecUid()).a());
                    }
                } else if (id == C0906R.id.a8p && this.O != null) {
                    r.onEvent(MobClick.obtain().setEventName("edit_title").setLabelName("song_cover").setValue(String.valueOf(this.O.getId())));
                    r.onEvent(MobClick.obtain().setEventName("original_title_click").setLabelName("original_music"));
                    Intent intent = new Intent(getActivity(), EditOriginMusicTitleActivity.class);
                    intent.putExtra("MUSIC_TITLE", String.valueOf(this.O.getId()));
                    startActivityForResult(intent, 0);
                }
            }
        } else if (TimeLockRuler.isTeenModeON()) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), getString(C0906R.string.chy)).a();
        } else if (com.ss.android.ugc.aweme.account.d.a().getCurUser().isLive()) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.b3m).a();
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().checkIsAlreadyPublished(getContext())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject.put("group_id", this.J);
            } catch (JSONException unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(this.g).setJsonObject(jSONObject));
            if (TextUtils.isEmpty(this.T)) {
                this.T = UUID.randomUUID().toString();
            }
            r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.T).a("shoot_way", "single_song").a("music_id", this.g).a("group_id", this.J).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(com.ss.android.ugc.aweme.feed.a.a().b(this.J))).f34114b);
            if (com.ss.android.ugc.aweme.music.util.d.a(this.i, (Context) getActivity(), true)) {
                b(this.i);
            }
        }
    }

    private void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3622f, false, 60275, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f3622f, false, 60275, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (z2) {
                this.mMusicTitle.setText(this.R.music.getMusicName());
                this.mMusicTitle.setVisibility(0);
                this.btnEditMusicTitle.setVisibility(8);
                return;
            }
            String ownerId = this.R.music.getOwnerId();
            if (this.R != null && !StringUtils.isEmpty(ownerId) && StringUtils.equal(ownerId, com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                this.btnEditMusicTitle.setVisibility(0);
                this.mMusicTitle.setVisibility(8);
                r.onEvent(MobClick.obtain().setEventName("original_title_show").setLabelName("original_music").setValue(String.valueOf(this.O.getId())));
            }
        }
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3622f, false, 60266, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3622f, false, 60266, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2, i3);
        float f2 = 0.0f;
        if (this.n == 0.0f) {
            this.n = (float) (this.mMusicName.getBottom() - this.v.getBottom());
        }
        if (this.m == 0.0f) {
            this.m = (float) (this.mHeadLayout.getBottom() - this.v.getBottom());
        }
        float f3 = (float) i2;
        float f4 = (f3 - this.n) / (this.m - this.n);
        if (f4 >= 0.0f) {
            f2 = f4;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.v.setAlpha(f2);
        this.u.setAlpha(f2);
        this.mHeadLayout.setAlpha(1.0f - (f3 / this.m));
    }

    public boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f3622f, false, 60281, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f3622f, false, 60281, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.O == null) {
            return false;
        } else {
            if (TextUtils.equals("copy", str)) {
                if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60283, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60283, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.O == null) {
                    return false;
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                    IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
                    shareStruct2.url = this.O.getShareInfo().getShareUrl();
                    if (this.O.getShareInfo().getBoolPersist() == 1) {
                        z = true;
                    }
                    shareStruct2.boolPersist = z;
                    String a2 = cg.a(shareStruct2, "copy");
                    String str2 = this.O.getShareInfo().getShareWeiboDesc() + " " + a2;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str2));
                    com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                    r.a((Context) getActivity(), "share_single_song", "copy", this.O.getMid(), 0);
                    return true;
                }
            } else if (TextUtils.equals("report", str)) {
                if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60282, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60282, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.O == null) {
                    return false;
                } else {
                    com.ss.android.ugc.aweme.report.a.a(getActivity(), "music", this.O.getMid(), this.O.getOwnerId());
                    return true;
                }
            } else if (TextUtils.equals(str, "qr_code")) {
                new z(getActivity(), new bt.a().a(3, this.g, "music").b(com.ss.android.ugc.aweme.u.aa.a(this.O), (long) com.ss.android.ugc.aweme.u.aa.b(this.O)).f64830b).show();
                return true;
            } else if (TextUtils.equals(str, "chat_merge")) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("share_struct", shareStruct);
                com.ss.android.ugc.aweme.im.b.a().enterChooseContact(getContext(), bundle, null);
                return true;
            } else if (!cg.b(str)) {
                return false;
            } else {
                new z(getActivity(), new bt.a().a(3, this.g, "music").b(com.ss.android.ugc.aweme.u.aa.a(this.O), (long) com.ss.android.ugc.aweme.u.aa.b(this.O)).f64830b, 7, str).show();
                return true;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3622f, false, 60260, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3622f, false, 60260, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        }
        if (TextUtils.isEmpty(this.g)) {
            getActivity().finish();
            return;
        }
        this.j = new com.ss.android.ugc.b.b();
        if (PatchProxy.isSupport(new Object[0], this, f3622f, false, 60270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3622f, false, 60270, new Class[0], Void.TYPE);
        } else {
            ck ckVar = new ck();
            ckVar.f64974c = true;
            ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(false);
            this.N = new SimpleShareDialog(getActivity(), ckVar);
            this.N.setActionHandler(this);
            this.N.setShareCallback(this);
        }
        this.L = new m();
        this.L.a(this);
        this.M = new com.ss.android.ugc.aweme.favorites.c.a();
        this.M.a(this);
        this.ivMusicCollect.setOnStateChangeListener(new CheckableImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56485a;

            public final void a() {
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56485a, false, 60304, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56485a, false, 60304, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1) {
                    MusicDetailFragmentOld.this.b();
                }
            }
        });
        boolean isRecording = ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording();
        if (!com.ss.android.ugc.aweme.account.d.a().getCurUser().isLive() && isRecording) {
            view.findViewById(C0906R.id.cup).setVisibility(8);
        }
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(com.ss.android.ugc.aweme.views.e.a(getContext(), new m(this))));
        a(false);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3622f, false, 60278, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3622f, false, 60278, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, i3);
        bg.a(new com.ss.android.ugc.aweme.profile.a.e(i2, 2, i3));
    }

    public final void a(int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f3622f, false, 60290, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f3622f, false, 60290, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, z);
        if (System.currentTimeMillis() - this.U >= 1000) {
            if (z) {
                if (i3 == 0) {
                    r.a((Context) getActivity(), "slide_right", "single_song", 0, 0);
                } else if (i3 == 1) {
                    r.a((Context) getActivity(), "slide_left", "single_song", 0, 0);
                }
            }
            this.U = System.currentTimeMillis();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3622f, false, 60271, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3622f, false, 60271, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == -1 && intent2 != null) {
            if (this.O != null) {
                this.O.setMusicName(intent2.getStringExtra("MUSIC_TITLE"));
                a(true, true);
            }
            this.L.a(this.g, Integer.valueOf(this.S));
        }
    }
}
