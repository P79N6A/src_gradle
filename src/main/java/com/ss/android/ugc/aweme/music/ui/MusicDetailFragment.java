package com.ss.android.ugc.aweme.music.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.a.c;
import com.ss.android.ugc.aweme.detail.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.music.a.a;
import com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter;
import com.ss.android.ugc.aweme.music.c;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.f;
import com.ss.android.ugc.aweme.music.presenter.m;
import com.ss.android.ugc.aweme.music.presenter.n;
import com.ss.android.ugc.aweme.music.presenter.r;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.ui.dialog.CollectGuidePopupWindow;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.views.DividerItemDecoration;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class MusicDetailFragment extends BaseDetailFragment implements b, aa<a>, IShareService.IActionHandler, IShareService.OnShareCallback, f, n {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f3621f = null;
    public static final String g = "com.ss.android.ugc.aweme.music.ui.MusicDetailFragment";
    float J;
    float K;
    private ViewGroup L;
    private ViewGroup M;
    private RecyclerView N;
    private ThirdMusicCoverAdapter O;
    private boolean P;
    private boolean Q;
    private String R;
    private String S;
    private m T;
    private String U;
    private String V;
    private com.ss.android.ugc.aweme.favorites.c.a W;
    private IShareService.SharePage X;
    private boolean Y;
    private DetailAwemeListFragment Z;
    private MusicDetail aa;
    private int ab;
    private IShareService.ShareStruct ac;
    private String ad;
    private r ae;
    private int af;
    private boolean ag;
    private long ah;
    private String ai;
    private String aj;
    @BindView(2131494082)
    Button btnEditMusicTitle;
    CollectGuidePopupWindow h;
    public boolean i;
    @BindView(2131495813)
    CheckableImageView ivMusicCollect;
    @BindView(2131495828)
    CheckableImageView ivMusicRingtone;
    @BindView(2131496069)
    ImageView ivMusicianMark;
    @BindView(2131496065)
    OriginalMusicEntryView ivOriginalMusicEntryView;
    @BindView(2131495826)
    ImageView ivPlay;
    @BindView(2131497081)
    ImageView ivShareBtn;
    @BindView(2131495832)
    ImageView ivStop;
    String j;
    d k;
    public Music l;
    public MusicModel m;
    @BindView(2131493263)
    RemoteImageView mBgCover;
    @BindView(2131497316)
    FrameLayout mFlStartRecord;
    @BindView(2131494572)
    View mHeadLayout;
    @BindView(2131495566)
    View mMusicCollectLayout;
    @BindView(2131498010)
    TextView mMusicCollectionText;
    @BindView(2131495814)
    RemoteImageView mMusicCover;
    @BindView(2131495823)
    ViewGroup mMusicName;
    @BindView(2131495568)
    View mMusicRingstoneLayout;
    @BindView(2131498013)
    TextView mMusicRingtoneText;
    @BindView(2131495834)
    TextView mMusicTitle;
    @BindView(2131498339)
    TextView mMusicUsedCount;
    @BindView(2131495103)
    ImageView mMusicianEntry;
    @BindView(2131495104)
    ImageView mMusicianEntryI18n;
    @BindView(2131498026)
    TextView mNickName;
    @BindView(2131498051)
    TextView mPlaceHolder;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497613)
    View mTitleLayout;
    @BindView(2131498563)
    ViewStub mVsOriginalMusic;
    @BindView(2131498568)
    ViewStub mVsThirdMusic;
    public com.ss.android.ugc.b.b n;
    DetailAwemeListFragment o;
    String p;
    @BindView(2131497461)
    RecyclerView recyclerTag;
    @BindView(2131493928)
    View tagLayout;
    @BindView(2131497459)
    View tagMask;
    @BindView(2131494096)
    TextView txtElse;

    public final String a(int i2) {
        return i2 == 0 ? "single_song" : i2 == 1 ? "single_song_fresh" : "";
    }

    public final String i() {
        return "single_song";
    }

    public final int n() {
        return C0906R.layout.os;
    }

    public final String p() {
        return "single_song";
    }

    public final String o() {
        return this.j;
    }

    public final /* synthetic */ void a(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3621f, false, 60233, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3621f, false, 60233, new Class[]{a.class}, Void.TYPE);
            return;
        }
        int i2 = aVar.f56165a;
        if (i2 == 0) {
            this.P = true;
        } else if (i2 == 1) {
            this.Q = true;
        }
        if (this.Q && this.P) {
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60234, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60234, new Class[0], Void.TYPE);
                return;
            }
            if (this.o != null) {
                this.o.b();
            }
            if (this.Z != null) {
                this.Z.b();
            }
        }
    }

    public final void a(View view) {
        View view2 = view;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f3621f, false, 60167, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f3621f, false, 60167, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        ViewStub viewStub = (ViewStub) view2.findViewById(C0906R.id.cuv);
        if (viewStub != null) {
            viewStub.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            Context context = getContext();
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71987, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71987, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 != null) {
                    z = d2.showMusicDetailNewRecordButtonStyle;
                }
            }
            if (!z || !com.ss.android.g.a.a()) {
                viewStub.setLayoutResource(C0906R.layout.a6o);
                viewStub.inflate();
            } else {
                this.ag = true;
                viewStub.setLayoutResource(C0906R.layout.a6n);
                viewStub.inflate();
                ((TextView) view2.findViewById(C0906R.id.cut)).setText(C0906R.string.c7l);
                View findViewById = view2.findViewById(C0906R.id.cup);
                int color = ContextCompat.getColor(context, C0906R.color.xy);
                com.ss.android.ugc.aweme.detail.d dVar = new com.ss.android.ugc.aweme.detail.d(UIUtils.dip2Px(context, 6.0f), BlurMaskFilter.Blur.INNER, 0.0f, UIUtils.dip2Px(context, 3.0f), ContextCompat.getColor(context, C0906R.color.a2h));
                findViewById.setBackground(new e(color, dVar));
            }
        }
    }

    public final com.ss.android.ugc.aweme.detail.a a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f3621f, false, 60168, new Class[]{ViewGroup.class}, com.ss.android.ugc.aweme.detail.a.class)) {
            return (com.ss.android.ugc.aweme.detail.a) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f3621f, false, 60168, new Class[]{ViewGroup.class}, com.ss.android.ugc.aweme.detail.a.class);
        } else if (this.ag) {
            return new c(getContext(), viewGroup2);
        } else {
            return super.a(viewGroup);
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3621f, false, 60178, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3621f, false, 60178, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.j = bundle.getString("id");
            this.R = bundle.getString("aweme_id");
            this.S = bundle.getString("extra_music_from");
            this.G = bundle.getString("sticker_id");
            this.ab = bundle.getInt("click_reason");
            this.p = bundle.getString("from_token");
            this.U = bundle.getString("partnerMusicId");
            this.V = bundle.getString("partnerName");
        }
    }

    public final void a(MusicDetail musicDetail) {
        Music music;
        SpannableStringBuilder spannableStringBuilder;
        MusicDetail musicDetail2 = musicDetail;
        if (PatchProxy.isSupport(new Object[]{musicDetail2}, this, f3621f, false, 60191, new Class[]{MusicDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicDetail2}, this, f3621f, false, 60191, new Class[]{MusicDetail.class}, Void.TYPE);
        } else if (isViewValid() && musicDetail2 != null) {
            if (TextUtils.isEmpty(this.j) || (musicDetail2.music != null && !this.j.equals(musicDetail2.music.getMid()))) {
                this.j = musicDetail2.music.getMid();
                if (this.D != null && this.D.size() > 0) {
                    for (AbstractBaseDetailFragment.a aVar : this.D) {
                        ((DetailAwemeListFragment) aVar).f2815c = this.j;
                        aVar.e();
                    }
                }
            }
            if (com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[]{musicDetail2}, this, f3621f, false, 60202, new Class[]{MusicDetail.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicDetail2}, this, f3621f, false, 60202, new Class[]{MusicDetail.class}, Void.TYPE);
                } else if (musicDetail2 == null || musicDetail2.music == null) {
                    this.mStatusView.b(false);
                } else {
                    this.mStatusView.b(true);
                    this.aa = musicDetail2;
                    Music music2 = musicDetail2.music;
                    this.l = music2;
                    boolean isOriginMusic = music2.isOriginMusic();
                    c(isOriginMusic);
                    if (isOriginMusic) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(music2.getMusicName() + " ");
                        this.mMusicTitle.setText(spannableStringBuilder2);
                        this.mMusicTitle.setHighlightColor(getResources().getColor(C0906R.color.a7l));
                        this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
                        this.mMusicTitle.setText(a(spannableStringBuilder2));
                        this.mNickName.setText(music2.getAuthorName());
                        this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838774), null);
                        this.mPlaceHolder.setText(C0906R.string.bks);
                        this.mMusicName.setClickable(true);
                        this.mMusicName.setVisibility(0);
                        music = music2;
                    } else {
                        boolean z = !TextUtils.isEmpty(music2.getOwnerId());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        if (z) {
                            String musicName = music2.getMusicName();
                            if (musicName.startsWith("@")) {
                                musicName = musicName.substring(1);
                            }
                            spannableStringBuilder3.append(musicName);
                            this.mNickName.setText(music2.getOwnerNickName());
                            this.mPlaceHolder.setText(C0906R.string.bkp);
                            this.mMusicName.setVisibility(0);
                            this.mMusicName.setClickable(true);
                            if (com.ss.android.g.a.a()) {
                                this.mMusicTitle.setHighlightColor(getResources().getColor(C0906R.color.a7l));
                                this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                            this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838774), null);
                            spannableStringBuilder = spannableStringBuilder3;
                            music = music2;
                        } else {
                            String musicName2 = music2.getMusicName();
                            if (TextUtils.isEmpty(musicName2)) {
                                spannableStringBuilder = spannableStringBuilder3;
                                music = music2;
                                if (PatchProxy.isSupport(new Object[]{music2}, this, f3621f, false, 60243, new Class[]{Music.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{music}, this, f3621f, false, 60243, new Class[]{Music.class}, Void.TYPE);
                                } else if (music != null) {
                                    com.ss.android.ugc.aweme.base.n.b("music_name_empty", "", com.ss.android.ugc.aweme.app.d.c.a().a("music_id", Long.valueOf(music.getId())).b());
                                }
                            } else {
                                spannableStringBuilder = spannableStringBuilder3;
                                music = music2;
                                spannableStringBuilder.append(musicName2);
                            }
                            this.mMusicTitle.setClickable(true);
                            this.mNickName.setText(music.getAuthorName());
                            this.mMusicName.setVisibility(0);
                        }
                        a(z, a(music), spannableStringBuilder);
                        this.mMusicTitle.setText(spannableStringBuilder);
                    }
                    this.u.setText(music.getMusicName());
                    String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) music.getUserCount());
                    this.mMusicUsedCount.setText(a2 + " ");
                    if (CollectionUtils.isEmpty(musicDetail2.relatedChallengeMusicList)) {
                        this.tagLayout.setVisibility(8);
                    } else {
                        b(musicDetail);
                        this.txtElse.setVisibility(0);
                        this.tagLayout.setVisibility(0);
                        RelatedMusicChallengeAdapter relatedMusicChallengeAdapter = new RelatedMusicChallengeAdapter(musicDetail2.relatedChallengeMusicList, getContext());
                        relatedMusicChallengeAdapter.f35572e = "music_page";
                        relatedMusicChallengeAdapter.f35570c = this.j;
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
                    com.ss.android.ugc.aweme.base.c.b(this.mMusicCover, music.getCoverMedium());
                    if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isNeedDetailBgCover()) {
                        com.ss.android.ugc.aweme.base.c.b(this.mBgCover, music.getCoverLarge());
                    } else {
                        this.mBgCover.setVisibility(8);
                    }
                    this.m = com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.l);
                    if (this.m.getCollectionType() != null) {
                        this.Y = MusicModel.CollectionType.COLLECTED.equals(this.m.getCollectionType());
                    }
                    d();
                    e();
                    if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60224, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60224, new Class[0], Void.TYPE);
                    } else if (com.ss.android.ugc.aweme.music.util.a.a("is_need_show_collect_guide", Boolean.TRUE, "music_sp")) {
                        if (this.h == null) {
                            this.h = new CollectGuidePopupWindow(getContext());
                        }
                        getLifecycle().addObserver(this.h);
                        this.mMusicCollectLayout.post(new k(this));
                        com.ss.android.ugc.aweme.music.util.a.a("is_need_show_collect_guide", Boolean.FALSE, "music_sp");
                    }
                    if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isThisMusicIsBaned(music)) {
                        h();
                        this.ivMusicCollect.setVisibility(8);
                        this.ivPlay.setVisibility(8);
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{musicDetail2}, this, f3621f, false, 60199, new Class[]{MusicDetail.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicDetail2}, this, f3621f, false, 60199, new Class[]{MusicDetail.class}, Void.TYPE);
                } else if (musicDetail2 == null || musicDetail2.music == null) {
                    this.mStatusView.b(false);
                } else {
                    this.mStatusView.b(true);
                    this.aa = musicDetail2;
                    Music music3 = musicDetail2.music;
                    this.l = music3;
                    boolean isOriginMusic2 = music3.isOriginMusic();
                    c(isOriginMusic2);
                    if (isOriginMusic2) {
                        this.mMusicTitle.setText(a(a(music3, new SpannableStringBuilder(music3.getMusicName()))));
                        this.mMusicTitle.setHighlightColor(getResources().getColor(C0906R.color.a7l));
                        this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
                        this.mNickName.setText(music3.getAuthorName());
                        this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838774), null);
                        this.mPlaceHolder.setText(C0906R.string.bks);
                        this.mMusicName.setClickable(true);
                        this.mMusicName.setVisibility(0);
                    } else {
                        boolean z2 = !TextUtils.isEmpty(music3.getOwnerId());
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (z2) {
                            String musicName3 = music3.getMusicName();
                            if (!TextUtils.isEmpty(musicName3) && musicName3.startsWith("@")) {
                                musicName3 = musicName3.substring(1);
                            }
                            spannableStringBuilder4.append(musicName3);
                            this.mNickName.setText(music3.getOwnerNickName());
                            this.mPlaceHolder.setText(C0906R.string.bkp);
                            this.mMusicName.setVisibility(0);
                            this.mMusicName.setClickable(true);
                            this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838774), null);
                        } else {
                            if (!TextUtils.isEmpty(music3.getMusicName())) {
                                spannableStringBuilder4.append(music3.getMusicName());
                            }
                            this.mMusicTitle.setClickable(true);
                            this.mNickName.setText(music3.getAuthorName());
                            this.mMusicName.setVisibility(0);
                        }
                        SpannableStringBuilder a3 = a(music3, spannableStringBuilder4);
                        a(z2, a(music3), a3);
                        this.mMusicTitle.setHighlightColor(getResources().getColor(C0906R.color.a7l));
                        this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
                        this.mMusicTitle.setText(a3);
                    }
                    this.u.setText(music3.getMusicName());
                    String a4 = a((long) music3.getUserCount());
                    this.mMusicUsedCount.setText(a4 + " ");
                    if (CollectionUtils.isEmpty(musicDetail2.relatedChallengeMusicList)) {
                        this.tagLayout.setVisibility(8);
                    } else {
                        b(musicDetail);
                        this.txtElse.setVisibility(0);
                        this.tagLayout.setVisibility(0);
                        RelatedMusicChallengeAdapter relatedMusicChallengeAdapter2 = new RelatedMusicChallengeAdapter(musicDetail2.relatedChallengeMusicList, getContext());
                        relatedMusicChallengeAdapter2.f35572e = "music_page";
                        relatedMusicChallengeAdapter2.f35570c = this.j;
                        RecyclerView recyclerView2 = this.recyclerTag;
                        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(getResources().getColor(C0906R.color.a17), (int) UIUtils.dip2Px(getActivity(), 4.0f), 0, UIUtils.dip2Px(getActivity(), 0.0f), UIUtils.dip2Px(getActivity(), 0.0f), false);
                        recyclerView2.addItemDecoration(dividerItemDecoration2);
                        this.recyclerTag.setHasFixedSize(true);
                        this.recyclerTag.setLayoutManager(new WrapLinearLayoutManager(getActivity(), 0, false));
                        this.recyclerTag.setAdapter(relatedMusicChallengeAdapter2);
                    }
                    int height2 = this.recyclerTag.getHeight();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.tagMask.getLayoutParams();
                    layoutParams2.height = height2;
                    this.tagMask.setLayoutParams(layoutParams2);
                    com.ss.android.ugc.aweme.discover.base.b.a(this.mMusicCover, music3.getCoverMedium());
                    com.ss.android.ugc.aweme.discover.base.b.a(this.mBgCover, music3.getCoverLarge());
                    this.m = com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.l);
                    if (this.m.getCollectionType() != null) {
                        this.Y = MusicModel.CollectionType.COLLECTED.equals(this.m.getCollectionType());
                    }
                    d();
                    e();
                }
            }
            final Music music4 = musicDetail2.music;
            if (PatchProxy.isSupport(new Object[]{music4}, this, f3621f, false, 60193, new Class[]{Music.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{music4}, this, f3621f, false, 60193, new Class[]{Music.class}, Void.TYPE);
            } else if (music4 != null && music4.isOriginMusic()) {
                if (this.M == null) {
                    this.M = (ViewGroup) this.mVsOriginalMusic.inflate();
                }
                ViewGroup.LayoutParams layoutParams3 = this.M.getLayoutParams();
                layoutParams3.height = (int) UIUtils.dip2Px(getContext(), 72.0f);
                this.M.setLayoutParams(layoutParams3);
                this.M.setOnTouchListener(new ai() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56471a;

                    public final void b(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f56471a, false, 60252, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f56471a, false, 60252, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                            return;
                        }
                        h a2 = h.a();
                        a2.a(j.a("aweme://user/profile/" + music4.getOwnerId()).a("sec_user_id", music4.getSecUid()).a());
                    }
                });
                AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) this.M.findViewById(C0906R.id.b1u);
                avatarImageWithVerify.setPlaceHolder(C0906R.color.bs);
                UrlModel avatarThumb = music4.getAvatarThumb();
                if (PatchProxy.isSupport(new Object[]{avatarThumb, 2}, avatarImageWithVerify, AvatarImageWithVerify.f34916a, false, 24959, new Class[]{UrlModel.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{avatarThumb, 2}, avatarImageWithVerify, AvatarImageWithVerify.f34916a, false, 24959, new Class[]{UrlModel.class, Integer.TYPE}, Void.TYPE);
                } else {
                    User user = new User();
                    user.setVerificationType(2);
                    user.setAvatarThumb(avatarThumb);
                    avatarImageWithVerify.setData(user);
                }
                ((TextView) this.M.findViewById(C0906R.id.d9b)).setText(music4.getAuthorName());
                this.M.setVisibility(0);
            } else if (this.M != null) {
                this.M.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[]{musicDetail2}, this, f3621f, false, 60192, new Class[]{MusicDetail.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{musicDetail2}, this, f3621f, false, 60192, new Class[]{MusicDetail.class}, Void.TYPE);
            } else if (musicDetail2 == null || musicDetail2.music == null || musicDetail2.music.getExternalMusicInfos() == null) {
                l();
            } else {
                List<ExternalMusicInfo> externalMusicInfos = musicDetail2.music.getExternalMusicInfos();
                if (CollectionUtils.isEmpty(externalMusicInfos)) {
                    l();
                    return;
                }
                List<ExternalMusicInfo> a5 = com.ss.android.ugc.aweme.music.ui.a.b.f56658c.a(externalMusicInfos);
                if (CollectionUtils.isEmpty(a5)) {
                    l();
                } else {
                    a(a5);
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3621f, false, 60208, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3621f, false, 60208, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, i3);
        bg.a(new com.ss.android.ugc.aweme.profile.a.e(i2, 2, i3));
    }

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f3621f, false, 60220, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f3621f, false, 60220, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f3621f, false, 60222, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f3621f, false, 60222, new Class[]{BaseResponse.class}, Void.TYPE);
            } else if (this.Y) {
                this.m.setCollectionType(MusicModel.CollectionType.COLLECTED);
                this.l.setCollectStatus(1);
                com.ss.android.ugc.aweme.music.a.e eVar = new com.ss.android.ugc.aweme.music.a.e(1, this.m);
                eVar.f56171c = "music_detail";
                bg.a(eVar);
                if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60223, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60223, new Class[0], Void.TYPE);
                } else if (com.ss.android.ugc.aweme.music.util.a.a("is_need_show_collect_succed_dialog", Boolean.TRUE, "music_sp")) {
                    new a.C0185a(getActivity()).b((int) C0906R.string.dk).a((int) C0906R.string.di).a((int) C0906R.string.bdg, (DialogInterface.OnClickListener) null).d(-3476230).c(2130840147).a().b();
                    com.ss.android.ugc.aweme.music.util.a.a("is_need_show_collect_succed_dialog", Boolean.FALSE, "music_sp");
                }
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(this.m.getMusicId())).setExtValueLong(0));
            } else {
                this.m.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                this.l.setCollectStatus(0);
                com.ss.android.ugc.aweme.music.a.e eVar2 = new com.ss.android.ugc.aweme.music.a.e(0, this.m);
                eVar2.f56171c = "music_detail";
                bg.a(eVar2);
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(this.m.getMusicId())).setExtValueLong(0));
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f3621f, false, 60221, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f3621f, false, 60221, new Class[]{BaseResponse.class}, Void.TYPE);
            } else if (this.Y) {
                this.m.setCollectionType(MusicModel.CollectionType.COLLECTED);
                this.l.setCollectStatus(1);
                com.ss.android.ugc.aweme.music.a.e eVar3 = new com.ss.android.ugc.aweme.music.a.e(1, this.m);
                eVar3.f56171c = "music_detail";
                bg.a(eVar3);
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m))).setExtValueLong(0));
            } else {
                this.m.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                this.l.setCollectStatus(0);
                com.ss.android.ugc.aweme.music.a.e eVar4 = new com.ss.android.ugc.aweme.music.a.e(0, this.m);
                eVar4.f56171c = "music_detail";
                bg.a(eVar4);
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m))).setExtValueLong(0));
            }
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3621f, false, 60225, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3621f, false, 60225, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (getActivity() != null) {
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) getActivity(), (Throwable) exc2);
        }
        m();
        d();
    }

    public final void a(int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f3621f, false, 60227, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f3621f, false, 60227, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, z);
        if (System.currentTimeMillis() - this.ah >= 1000) {
            if (z) {
                if (i3 == 0) {
                    com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "slide_right", "single_song", 0, 0);
                } else if (i3 == 1) {
                    com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "slide_left", "single_song", 0, 0);
                }
            }
            this.ah = System.currentTimeMillis();
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f3621f, false, 60237, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f3621f, false, 60237, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        super.a(musicModel);
        com.ss.android.ugc.aweme.common.r.a("download_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "single_song").a("enter_method", "click_shoot").f34114b);
    }

    public final void a(@NonNull Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f3621f, false, 60238, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f3621f, false, 60238, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(this.ad)) {
            this.ad = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.ad);
    }

    private void m() {
        this.Y = !this.Y;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        a(true);
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60195, new Class[0], Void.TYPE);
            return;
        }
        if (this.L != null) {
            this.L.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public ImageView a() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60190, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60190, new Class[0], ImageView.class);
        } else if (com.ss.android.g.a.a()) {
            return this.mMusicianEntryI18n;
        } else {
            return this.mMusicianEntry;
        }
    }

    public final void d() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60217, new Class[0], Void.TYPE);
        } else if (this.ivMusicCollect != null) {
            CheckableImageView checkableImageView = this.ivMusicCollect;
            if (this.Y) {
                i2 = 2130839385;
            } else {
                i2 = 2130839386;
            }
            checkableImageView.setImageResource(i2);
        }
    }

    public final void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60218, new Class[0], Void.TYPE);
        } else if (this.mMusicCollectionText != null) {
            TextView textView = this.mMusicCollectionText;
            if (this.Y) {
                i2 = C0906R.string.uc;
            } else {
                i2 = C0906R.string.u2;
            }
            textView.setText(i2);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60177, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        com.ss.android.ugc.aweme.music.c.a().f56320b = null;
        if (this.T != null) {
            this.T.k();
        }
        this.n.a();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60229, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        t();
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60179, new Class[0], Void.TYPE);
            return;
        }
        super.q();
        this.u.setAlpha(0.0f);
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60187, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.U)) {
            this.T.a(this.j, Integer.valueOf(this.ab), 0);
        } else {
            this.T.a(this.U, this.V, 1);
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60232, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        this.ivPlay.setVisibility(0);
        this.ivStop.setVisibility(8);
        this.n.b();
        if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isThisMusicIsBaned(this.l)) {
            h();
            this.ivMusicCollect.setVisibility(8);
            this.ivPlay.setVisibility(8);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60230, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60188, new Class[0], Void.TYPE);
        } else if (this.k != null && this.k.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.n.a();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60170, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!com.ss.android.g.a.a() && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            if (this.ae == null) {
                this.ae = new r();
                this.ae.a(this);
            }
            String bindPhone = com.ss.android.ugc.aweme.account.d.a().getCurUser().getBindPhone();
            if (!TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(bindPhone)) {
                this.ae.a(this.j, bindPhone);
            }
        }
    }

    private FragmentPagerAdapter j() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60175, new Class[0], FragmentPagerAdapter.class)) {
            return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60175, new Class[0], FragmentPagerAdapter.class);
        }
        this.D = new ArrayList();
        this.f2808b = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.o = (DetailAwemeListFragment) childFragmentManager.findFragmentByTag(r + 0);
        if (this.o == null) {
            this.o = DetailAwemeListFragment.a(0, "single_song", this.j, this.S);
        }
        DetailAwemeListFragment detailAwemeListFragment = this.o;
        if (this.B == 0) {
            z = true;
        } else {
            z = false;
        }
        detailAwemeListFragment.m = z;
        this.o.g = this;
        this.D.add(this.o);
        this.f2808b.add(0);
        if (!TextUtils.isEmpty(this.p)) {
            this.o.a((com.ss.android.ugc.aweme.fragment.a) new h(this));
        }
        ArrayList arrayList = new ArrayList();
        for (AmeBaseFragment add : this.D) {
            arrayList.add(add);
        }
        return new ProfileFragmentAdapter(getChildFragmentManager(), arrayList, this.f2808b);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60216, new Class[0], Void.TYPE);
        } else if (this.m != null && this.ivMusicCollect != null) {
            this.W.a(1, com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m), Integer.valueOf(true ^ this.Y ? 1 : 0));
            m();
            this.ivMusicCollect.b();
        }
    }

    public final FragmentPagerAdapter s() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60174, new Class[0], FragmentPagerAdapter.class)) {
            return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60174, new Class[0], FragmentPagerAdapter.class);
        } else if (!com.ss.android.g.a.a()) {
            return j();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60176, new Class[0], FragmentPagerAdapter.class)) {
                return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60176, new Class[0], FragmentPagerAdapter.class);
            }
            this.D = new ArrayList();
            this.f2808b = new ArrayList();
            FragmentManager childFragmentManager = getChildFragmentManager();
            this.o = (DetailAwemeListFragment) childFragmentManager.findFragmentByTag(r + 0);
            if (this.o == null) {
                this.o = DetailAwemeListFragment.a(0, "single_song", this.j, this.S);
            }
            DetailAwemeListFragment detailAwemeListFragment = this.o;
            if (this.B == 0) {
                z = true;
            } else {
                z = false;
            }
            detailAwemeListFragment.m = z;
            this.o.g = this;
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            this.Z = (DetailAwemeListFragment) childFragmentManager2.findFragmentByTag(r + 1);
            this.D.add(this.o);
            this.f2808b.add(0);
            if (g()) {
                if (this.Z == null) {
                    this.Z = DetailAwemeListFragment.a(1, "single_song_fresh", this.j, this.S);
                }
                DetailAwemeListFragment detailAwemeListFragment2 = this.Z;
                if (this.B == 1) {
                    z2 = true;
                }
                detailAwemeListFragment2.m = z2;
                this.Z.g = this;
                this.D.add(this.Z);
                this.f2808b.add(1);
            } else {
                this.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            for (AmeBaseFragment add : this.D) {
                arrayList.add(add);
            }
            return new ProfileFragmentAdapter(getChildFragmentManager(), arrayList, this.f2808b);
        }
    }

    private SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder2}, this, f3621f, false, 60198, new Class[]{SpannableStringBuilder.class}, SpannableStringBuilder.class)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{spannableStringBuilder2}, this, f3621f, false, 60198, new Class[]{SpannableStringBuilder.class}, SpannableStringBuilder.class);
        }
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130839153);
        a2.setBounds(0, 0, (int) UIUtils.dip2Px(getContext(), 20.0f), (int) UIUtils.dip2Px(getContext(), 20.0f));
        com.ss.android.ugc.aweme.music.ui.b.a aVar = new com.ss.android.ugc.aweme.music.ui.b.a(getContext(), a2, 2);
        SpannableStringBuilder append = new SpannableStringBuilder().append(" ", 0, 1);
        append.setSpan(aVar, 0, 1, 17);
        append.append(spannableStringBuilder2);
        return append;
    }

    private void b(boolean z) {
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3621f, false, 60200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3621f, false, 60200, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            z2 = g.b().h().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            z2 = false;
        }
        if (z2) {
            try {
                i2 = g.b().i().intValue();
            } catch (com.bytedance.ies.a unused2) {
                i2 = 0;
            }
            if (i2 == 1 || z) {
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56474a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f56474a, false, 60253, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f56474a, false, 60253, new Class[0], Void.TYPE);
                            return;
                        }
                        MusicDetailFragment musicDetailFragment = MusicDetailFragment.this;
                        if (PatchProxy.isSupport(new Object[0], musicDetailFragment, MusicDetailFragment.f3621f, false, 60201, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], musicDetailFragment, MusicDetailFragment.f3621f, false, 60201, new Class[0], Void.TYPE);
                            return;
                        }
                        ImageView a2 = musicDetailFragment.a();
                        if (a2 != null) {
                            a2.setVisibility(0);
                            a2.setClickable(true);
                        }
                    }
                });
            }
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3621f, false, 60203, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3621f, false, 60203, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(z);
        a().setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56476a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56476a, false, 60254, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56476a, false, 60254, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                String str = "";
                try {
                    str = g.b().j();
                } catch (com.bytedance.ies.a unused) {
                }
                Intent intent = new Intent(view.getContext(), CrossPlatformActivity.class);
                intent.setData(Uri.parse(str));
                intent.putExtra("bundle_user_webview_title", true);
                intent.putExtra("status_bar_color", MusicDetailFragment.this.getResources().getString(C0906R.color.yx).replace(String.valueOf("#"), ""));
                MusicDetailFragment.this.startActivity(intent);
            }
        });
    }

    public final void b_(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3621f, false, 60207, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3621f, false, 60207, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.a(true);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3621f, false, 60183, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3621f, false, 60183, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("music", gVar2.itemType)) {
            dv.a(getActivity(), this.mHeadLayout, gVar2);
        }
    }

    private void a(List<ExternalMusicInfo> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3621f, false, 60194, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3621f, false, 60194, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.L == null) {
            this.L = (ViewGroup) this.mVsThirdMusic.inflate();
        }
        if (this.N == null) {
            this.N = (RecyclerView) this.L.findViewById(C0906R.id.d2e);
            this.N.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
            this.N.addItemDecoration(new ThirdMusicItemDecoration());
            this.O = new ThirdMusicCoverAdapter();
            this.O.f56258b = new j(this, list);
            this.O.setShowFooter(false);
            this.N.setAdapter(this.O);
        }
        if (this.O != null) {
            this.O.setData(list);
        }
        for (ExternalMusicInfo next : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", next.getPartnerSongId());
            hashMap.put("music_from", next.getPartnerName());
            com.ss.android.ugc.aweme.common.r.a("show_copyright_music", (Map) hashMap);
        }
        this.L.setVisibility(0);
    }

    private void b(MusicDetail musicDetail) {
        String str;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{musicDetail}, this, f3621f, false, 60206, new Class[]{MusicDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicDetail}, this, f3621f, false, 60206, new Class[]{MusicDetail.class}, Void.TYPE);
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
        if (TextUtils.equals(this.S, "from_related_tag")) {
            str = this.j;
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
        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.j).setJsonObject(jSONObject));
    }

    private String d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60240, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60240, new Class[]{Integer.TYPE}, String.class);
        }
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fringtone%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_ringtone%26bg_theme%3D%2523161823%26hide_nav_bar%3D1";
        try {
            str = g.b().O().getRingtone().getSchema();
        } catch (com.bytedance.ies.a unused) {
        }
        if (i2 == 2 || i2 == 3) {
            if (TextUtils.isEmpty(this.aj)) {
                this.aj = com.ss.android.ugc.aweme.music.util.f.a(str).a("music_id", this.j).a().toString();
            }
            return this.aj;
        }
        if (TextUtils.isEmpty(this.ai)) {
            this.ai = str;
        }
        return this.ai;
    }

    public final void c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60226, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60226, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.c(i2);
        if (i3 == 0) {
            com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "click_hot", "single_song", 0, 0);
            return;
        }
        if (i3 == 1) {
            com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "click_fresh", "single_song", 0, 0);
        }
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f3621f, false, 60235, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f3621f, false, 60235, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
        } else if (this.m != null && shareResult != null) {
            com.ss.android.ugc.aweme.common.r.onEvent(new MobClick().setEventName("share_single_song").setLabelName(shareResult.type).setExtValueString(this.m.getSongId()).setJsonObject(new t().a("request_id", String.valueOf(this.o.i())).a()));
            if (!TextUtils.equals(shareResult.type, "qr_code")) {
                com.ss.android.ugc.aweme.common.r.a("share_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m)).a("platform", shareResult.type).a("share_mode", "normal_share").f34114b);
            }
            ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).addShareRecord(shareResult.type);
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3621f, false, 60236, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3621f, false, 60236, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (arVar.f45292b == 2) {
            String str = (String) arVar.f45293c;
            if (isViewValid() && this.aa != null && !TextUtils.isEmpty(str)) {
                Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str);
                if (!(b2 == null || b2.getMusic() == null || b2.getMusic().getId() != this.aa.music.getId())) {
                    int userCount = this.aa.music.getUserCount();
                    if (userCount > 0) {
                        this.aa.music.setUserCount(userCount - 1);
                        a(this.aa);
                    }
                }
            }
        }
    }

    public boolean checkStatus(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3621f, false, 60209, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f3621f, false, 60209, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || !cg.a(str, 5)) {
            return true;
        } else {
            if (PatchProxy.isSupport(new Object[]{str}, this, f3621f, false, 60210, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f3621f, false, 60210, new Class[]{String.class}, Void.TYPE);
            } else if (!(getActivity() == null || this.l == null || this.l.getShareInfo() == null)) {
                new ShareCommandFactory(getActivity(), str, this.l.getShareInfo()).a("sslocal://music/detail/" + this.j, 3, this.j);
                if (PatchProxy.isSupport(new Object[]{str, "token"}, this, f3621f, false, 60211, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, "token"}, this, f3621f, false, 60211, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.common.r.a("share_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.l.getId()).a("platform", str).a("share_mode", "token").f34114b);
                }
            }
            if (this.X != null) {
                this.X.dismiss();
            }
            return false;
        }
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3621f, false, 60171, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3621f, false, 60171, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mStatusView.c(true)) {
            k();
            if (z) {
                for (AbstractBaseDetailFragment.a e2 : this.D) {
                    e2.e();
                }
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60239, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60239, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.af = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60241, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60241, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i2 == 1 || i2 == 3) {
                this.mMusicRingstoneLayout.setVisibility(0);
                this.ivMusicRingtone.setImageResource(2130839702);
                this.mMusicRingtoneText.setText(C0906R.string.c4d);
            } else if (i2 == 2) {
                this.mMusicRingstoneLayout.setVisibility(0);
                this.ivMusicRingtone.setImageResource(2130839701);
                this.mMusicRingtoneText.setText(C0906R.string.alu);
            } else {
                this.mMusicRingstoneLayout.setVisibility(8);
            }
        }
    }

    @OnClick({2131493213, 2131497316, 2131495814, 2131497081, 2131495566, 2131495832, 2131495826, 2131495823, 2131495568})
    public void click(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3621f, false, 60182, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3621f, false, 60182, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return;
        }
        if (id != C0906R.id.cup) {
            List list = null;
            if (id == C0906R.id.bh_) {
                if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60219, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60219, new Class[0], Void.TYPE);
                } else {
                    if (!this.Y) {
                        com.ss.android.ugc.aweme.common.r.a("favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m)).f34114b);
                    } else {
                        com.ss.android.ugc.aweme.common.r.a("cancel_favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m)).f34114b);
                    }
                    if ((TextUtils.equals(this.S, "search_result") || TextUtils.equals(this.S, "general_search")) && !this.Y) {
                        com.ss.android.ugc.aweme.discover.mob.j jVar = com.ss.android.ugc.aweme.discover.mob.j.f42669b;
                        String a2 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m);
                        boolean equals = TextUtils.equals(this.S, "search_result");
                        if (PatchProxy.isSupport(new Object[]{"search_favourite", "single_song", a2, Byte.valueOf(equals ? (byte) 1 : 0)}, jVar, com.ss.android.ugc.aweme.discover.mob.j.f42668a, false, 36983, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.discover.mob.j jVar2 = jVar;
                            PatchProxy.accessDispatch(new Object[]{"search_favourite", "single_song", a2, Byte.valueOf(equals)}, jVar2, com.ss.android.ugc.aweme.discover.mob.j.f42668a, false, 36983, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull("search_favourite", "event");
                            Intrinsics.checkParameterIsNotNull("single_song", "enterFrom");
                            Intrinsics.checkParameterIsNotNull(a2, "musicId");
                            if (equals) {
                                str2 = com.ss.android.ugc.aweme.discover.mob.e.a().a(1);
                            } else {
                                str2 = com.ss.android.ugc.aweme.discover.mob.e.a().a(3);
                            }
                            Map<String, String> map = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", a2).a("log_pb", com.ss.android.ugc.aweme.feed.ai.a().a(str2)).f34114b;
                            Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
                            jVar.a("search_favourite", map);
                        }
                    }
                }
                if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a((Fragment) this, "single_song", "click_favorite_music", (Bundle) null, (com.ss.android.ugc.aweme.base.component.f) new i(this));
                } else {
                    b();
                }
            } else if (id == C0906R.id.cp9) {
                if (this.l != null) {
                    com.ss.android.ugc.aweme.common.r.a(getActivity().getApplicationContext(), "click_share_button", "music_hot", this.l.getMid(), 0);
                    if (com.ss.android.g.a.a()) {
                        new com.ss.android.ugc.aweme.u.h().e("music_hot").f("music_hot").h(this.R).e();
                    }
                }
                if (this.X != null) {
                    com.ss.android.ugc.aweme.sec.a.a("share");
                    if (this.l == null || this.l.getShareInfo() == null) {
                        this.X.updateShareStruct(null);
                    } else {
                        if (this.o != null) {
                            list = this.o.l();
                        }
                        this.X.updateShareStruct(i.a((Context) getActivity(), this.l, list));
                    }
                    this.X.show();
                }
            } else if (id == C0906R.id.bon) {
                if (com.ss.android.ugc.aweme.music.util.d.a(this.m, (Context) getActivity(), true)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60231, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60231, new Class[0], Void.TYPE);
                    } else {
                        this.i = true;
                        this.ivPlay.setVisibility(8);
                        this.ivStop.setVisibility(0);
                        if (this.m != null) {
                            final com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
                            aVar.a(com.ss.android.ugc.aweme.music.util.d.a(true));
                            if (this.m.getMusicType() == MusicModel.MusicType.ONLINE) {
                                aVar.f77132b = 4;
                            }
                            aVar.f77133c = this.m.getDuration();
                            com.ss.android.ugc.aweme.music.c.a().f56320b = new c.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f56480a;

                                public final void a(String str) {
                                    String str2;
                                    if (PatchProxy.isSupport(new Object[]{str}, this, f56480a, false, 60256, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str}, this, f56480a, false, 60256, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.b.b.a aVar = aVar;
                                    if (com.ss.android.g.a.a()) {
                                        str2 = str;
                                    } else {
                                        str2 = MusicDetailFragment.this.m.getPath();
                                    }
                                    aVar.f77131a = str2;
                                    MusicDetailFragment.this.n.a(aVar);
                                }
                            };
                            this.n.a((com.ss.android.ugc.b.a.d) new com.ss.android.ugc.b.a.d() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f56483a;

                                public final void a(int i, int i2) {
                                    if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f56483a, false, 60257, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f56483a, false, 60257, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    if (!MusicDetailFragment.this.i) {
                                        MusicDetailFragment.this.n.b();
                                    }
                                    MusicDetailFragment musicDetailFragment = MusicDetailFragment.this;
                                    MusicModel musicModel = MusicDetailFragment.this.m;
                                    if (PatchProxy.isSupport(new Object[]{musicModel, "play_music"}, musicDetailFragment, MusicDetailFragment.f3621f, false, 60181, new Class[]{MusicModel.class, String.class}, Void.TYPE)) {
                                        MusicDetailFragment musicDetailFragment2 = musicDetailFragment;
                                        PatchProxy.accessDispatch(new Object[]{musicModel, "play_music"}, musicDetailFragment2, MusicDetailFragment.f3621f, false, 60181, new Class[]{MusicModel.class, String.class}, Void.TYPE);
                                        return;
                                    }
                                    if (musicModel != null) {
                                        com.ss.android.ugc.aweme.common.r.a("play_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "single_song").a("enter_method", "click_play_music").f34114b);
                                    }
                                }
                            });
                            com.ss.android.ugc.aweme.music.c.a().a(this.m, aVar.f77134d);
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("single_song").setJsonObject(new t().a("song_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.m)).a()));
                        }
                    }
                }
            } else if (id == C0906R.id.bot) {
                t();
            } else if (id == C0906R.id.bok) {
                if (!(this.m == null || this.m.getMusic() == null || TextUtils.isEmpty(this.m.getMusic().getOwnerId()))) {
                    h a3 = h.a();
                    a3.a(j.a("aweme://user/profile/" + this.m.getMusic().getOwnerId()).a("sec_user_id", this.m.getMusic().getSecUid()).a());
                }
            } else if (id == C0906R.id.bhb) {
                h.a().a(d(this.af));
                int i2 = this.af;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60242, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3621f, false, 60242, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i2 == 1 || i2 == 3) {
                    str = "set_ringtone";
                } else {
                    str = "cancel_ringtone";
                }
                com.ss.android.ugc.aweme.common.r.a(str, com.ss.android.ugc.aweme.u.aa.a(com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("music_id", this.j).f34114b));
            }
        } else if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60184, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60184, new Class[0], Void.TYPE);
            } else if (com.ss.android.ugc.aweme.account.d.a().getCurUser().isLive()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.b3m).a();
            } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.es).a();
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject.put("group_id", this.R);
                } catch (JSONException unused) {
                }
                aj.a(i());
                aj.b("click_music_publish");
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(this.j).setJsonObject(jSONObject));
                this.ad = UUID.randomUUID().toString();
                com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.ad).a("shoot_way", "single_song").a("music_id", this.j).a("group_id", this.R);
                if (com.ss.android.ugc.aweme.u.aa.e(this.S)) {
                    a4.a("log_pb", com.ss.android.ugc.aweme.feed.ai.a().a(com.ss.android.ugc.aweme.u.aa.f(this.R)));
                }
                com.ss.android.ugc.aweme.common.r.a("shoot", (Map) a4.f34114b);
                if (TextUtils.equals("search_result", this.S) || TextUtils.equals("general_search", this.S) || TextUtils.equals("search_for_you_list", this.S)) {
                    com.ss.android.ugc.aweme.app.d.d a5 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.ad).a("shoot_way", "single_song").a("music_id", this.j);
                    if (TextUtils.equals("general_search", this.S)) {
                        str5 = "general";
                    } else {
                        str5 = "music";
                    }
                    com.ss.android.ugc.aweme.app.d.d a6 = a5.a("search_type", str5);
                    if (TextUtils.equals("general_search", this.S)) {
                        str6 = "search_result";
                    } else {
                        str6 = this.S;
                    }
                    com.ss.android.ugc.aweme.common.r.a("search_shoot", (Map) a6.a("previous_page", str6).f34114b);
                }
                if (com.ss.android.ugc.aweme.music.util.d.a(this.m, (Context) getActivity(), true)) {
                    b(this.m);
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60185, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60185, new Class[0], Void.TYPE);
            } else if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), getString(C0906R.string.chy)).a();
            } else if (com.ss.android.ugc.aweme.account.d.a().getCurUser().isLive()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.b3m).a();
            } else {
                if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().checkIsAlreadyPublished(getContext())) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        jSONObject2.put("group_id", this.R);
                    } catch (JSONException unused2) {
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(this.j).setJsonObject(jSONObject2));
                    this.ad = UUID.randomUUID().toString();
                    com.ss.android.ugc.aweme.app.d.d a7 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.ad).a("shoot_way", "single_song").a("music_id", this.j).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(com.ss.android.ugc.aweme.feed.a.a().b(this.R))).a("group_id", this.R);
                    if (com.ss.android.ugc.aweme.u.aa.e(this.S)) {
                        a7.a("log_pb", com.ss.android.ugc.aweme.feed.ai.a().a(com.ss.android.ugc.aweme.u.aa.f(this.R)));
                    }
                    com.ss.android.ugc.aweme.common.r.a("shoot", (Map) a7.f34114b);
                    if (TextUtils.equals("search_result", this.S) || TextUtils.equals("general_search", this.S) || TextUtils.equals("search_for_you_list", this.S)) {
                        com.ss.android.ugc.aweme.app.d.d a8 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.ad).a("shoot_way", "single_song").a("music_id", this.j);
                        if (TextUtils.equals("general_search", this.S)) {
                            str3 = "general";
                        } else {
                            str3 = "music";
                        }
                        com.ss.android.ugc.aweme.app.d.d a9 = a8.a("search_type", str3);
                        if (TextUtils.equals("general_search", this.S)) {
                            str4 = "search_result";
                        } else {
                            str4 = this.S;
                        }
                        com.ss.android.ugc.aweme.common.r.a("search_shoot", (Map) a9.a("previous_page", str4).f34114b);
                    }
                    if (com.ss.android.ugc.aweme.music.util.d.a(this.m, (Context) getActivity(), true)) {
                        b(this.m);
                    }
                }
            }
        }
    }

    private boolean a(Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, this, f3621f, false, 60204, new Class[]{Music.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{music}, this, f3621f, false, 60204, new Class[]{Music.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private SpannableStringBuilder a(Music music, SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder2;
        String str;
        int i2;
        if (PatchProxy.isSupport(new Object[]{music, spannableStringBuilder}, this, f3621f, false, 60189, new Class[]{Music.class, SpannableStringBuilder.class}, SpannableStringBuilder.class)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{music, spannableStringBuilder}, this, f3621f, false, 60189, new Class[]{Music.class, SpannableStringBuilder.class}, SpannableStringBuilder.class);
        }
        try {
            z = g.b().Q().getHotsearchMusicBillboardSwitch().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            z = false;
        }
        if (!com.ss.android.ugc.aweme.discover.helper.d.a() || !z || music.getBillboardRank() <= 0 || music.getBillboardRank() > 30) {
            spannableStringBuilder2 = spannableStringBuilder;
        } else if (!AbTestManager.a().ay() && music.getBillboardType() > 0) {
            return spannableStringBuilder;
        } else {
            if (music.getBillboardType() <= 0 || music.getWeeklyBillInfo() == null) {
                str = getString(C0906R.string.bes);
            } else {
                str = String.format(getString(C0906R.string.bet), new Object[]{Integer.valueOf(music.getWeeklyBillInfo().getEditionNo())});
            }
            com.ss.android.ugc.aweme.hotsearch.view.h hVar = new com.ss.android.ugc.aweme.hotsearch.view.h(music.getBillboardRank(), str, 4);
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(hVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56469a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56469a, false, 60251, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56469a, false, 60251, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.common.r.a("enter_music_leaderboard", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "single_song").a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).f34114b);
                    String str = "aweme://search/trending?type=2";
                    if (MusicDetailFragment.this.l.getBillboardType() != 0) {
                        str = str + "&edition_uid=" + MusicDetailFragment.this.l.getWeeklyBillInfo().getUid();
                    }
                    h.a().a(str);
                }
            }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
            if (getContext() != null) {
                float textSize = this.mMusicTitle.getTextSize();
                int size = hVar.getSize(this.mMusicTitle.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), this.mMusicTitle.getPaint().getFontMetricsInt());
                this.mMusicTitle.getPaint().setTextSize(textSize);
                i2 = size;
            } else {
                i2 = SearchJediMixFeedAdapter.g;
            }
            spannableStringBuilder2 = com.ss.android.ugc.aweme.hotsearch.d.h.a(spannableStringBuilder, this.mMusicTitle.getPaint(), this.mMusicTitle.getMeasuredWidth(), this.mMusicTitle.getMaxLines(), 1, i2);
        }
        return spannableStringBuilder2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3621f, false, 60166, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3621f, false, 60166, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        }
        if (!TextUtils.isEmpty(this.j) || !TextUtils.isEmpty(this.U)) {
            this.n = new com.ss.android.ugc.b.b();
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60172, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60172, new Class[0], Void.TYPE);
            } else if (com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60173, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60173, new Class[0], Void.TYPE);
                } else {
                    ck ckVar = new ck();
                    ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
                    ckVar.f64975d = true;
                    ckVar.i = true;
                    this.X = new SimpleShareDialog(getActivity(), ckVar);
                    this.X.setActionHandler(this);
                    this.X.setShareCallback(this);
                    this.X.updateShareStruct(this.ac);
                }
            } else {
                ck ckVar2 = new ck();
                ckVar2.f64974c = true;
                ckVar2.i = true;
                ckVar2.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
                this.X = new SimpleShareDialog(getActivity(), ckVar2);
                this.X.setActionHandler(this);
                this.X.setShareCallback(this);
            }
            this.T = new m();
            this.T.a(this);
            this.W = new com.ss.android.ugc.aweme.favorites.c.a();
            this.W.a(this);
            this.ivMusicCollect.setOnStateChangeListener(new CheckableImageView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56467a;

                public final void a() {
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56467a, false, 60250, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56467a, false, 60250, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 1) {
                        MusicDetailFragment.this.d();
                        MusicDetailFragment.this.e();
                    }
                }
            });
            this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(new c.a(getContext()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new g(this)).f20493a));
            a(false);
            if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60169, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60169, new Class[0], Void.TYPE);
                return;
            }
            if (!com.ss.android.g.a.a()) {
                this.mFlStartRecord.setContentDescription(getResources().getString(C0906R.string.cdm));
            }
            return;
        }
        getActivity().finish();
    }

    public boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f3621f, false, 60212, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f3621f, false, 60212, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() && this.l == null) {
            return false;
        } else {
            if (TextUtils.equals("copy", str2)) {
                if (com.ss.android.g.a.a()) {
                    if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, f3621f, false, 60214, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, f3621f, false, 60214, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
                    } else if (shareStruct2 != null) {
                        String a2 = cg.a(shareStruct2, "copy_link");
                        ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a2, a2));
                        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                        com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "share_single_song", "copy", this.l.getMid(), 0);
                        return true;
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60215, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60215, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (this.l == null) {
                        return false;
                    } else {
                        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        IShareService.ShareStruct shareStruct3 = new IShareService.ShareStruct();
                        shareStruct3.url = this.l.getShareInfo().getShareUrl();
                        if (this.l.getShareInfo().getBoolPersist() == 1) {
                            z = true;
                        }
                        shareStruct3.boolPersist = z;
                        String a3 = cg.a(shareStruct3, "copy");
                        String str3 = this.l.getShareInfo().getShareWeiboDesc() + " " + a3;
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str3));
                        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                        com.ss.android.ugc.aweme.common.r.a((Context) getActivity(), "share_single_song", "copy", this.l.getMid(), 0);
                        z = true;
                    }
                }
                return z;
            } else if (TextUtils.equals("report", str2)) {
                if (PatchProxy.isSupport(new Object[0], this, f3621f, false, 60213, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3621f, false, 60213, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.l == null) {
                    return false;
                } else {
                    if (com.ss.android.g.a.a()) {
                        ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "music", this.l.getMid(), this.l.getOwnerId(), null);
                    } else {
                        com.ss.android.ugc.aweme.report.a.a(getActivity(), "music", this.l.getMid(), this.l.getOwnerId());
                    }
                    return true;
                }
            } else if (TextUtils.equals(str2, "qr_code")) {
                if (cg.c()) {
                    new z(getActivity(), new bt.a().a(3, this.j, "single_song").b(com.ss.android.ugc.aweme.u.aa.a(this.l), (long) com.ss.android.ugc.aweme.u.aa.b(this.l)).f64830b).show();
                } else {
                    d.a a4 = new d.a().a(3, this.j, "single_song");
                    String a5 = com.ss.android.ugc.aweme.u.aa.a(this.l);
                    int b2 = com.ss.android.ugc.aweme.u.aa.b(this.l);
                    if (PatchProxy.isSupport(new Object[]{a5, Integer.valueOf(b2)}, a4, d.a.f63386a, false, 70359, new Class[]{String.class, Integer.TYPE}, d.a.class)) {
                        a4 = (d.a) PatchProxy.accessDispatch(new Object[]{a5, Integer.valueOf(b2)}, a4, d.a.f63386a, false, 70359, new Class[]{String.class, Integer.TYPE}, d.a.class);
                    } else {
                        a4.f63387b.title = a5;
                        a4.f63387b.describe = String.valueOf(b2);
                    }
                    QRCodeActivityV2.a(getContext(), a4.f63387b);
                }
                com.ss.android.ugc.aweme.common.r.a("click_qr_code", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.l.getId()).a("platform", "scan").a("qr_code_type", "shaped").a("enter_from", "single_song").f34114b);
                return true;
            } else if (TextUtils.equals(str2, "chat_merge")) {
                if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a((Fragment) this, "", "click_shareim_button");
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("share_struct", shareStruct2);
                com.ss.android.ugc.aweme.im.b.a().enterChooseContact(getContext(), bundle, null);
                return true;
            } else if (!cg.b(str)) {
                return false;
            } else {
                new z(getActivity(), new bt.a().a(3, this.j, "single_song").b(com.ss.android.ugc.aweme.u.aa.a(this.l), (long) com.ss.android.ugc.aweme.u.aa.b(this.l)).f64830b, 7, str2).show();
                com.ss.android.ugc.aweme.common.r.a("share_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.l.getId()).a("platform", str2).a("enter_from", "single_song").a("share_mode", "shaped_qr_code").a("enter_method", "normal_share").f34114b);
                return true;
            }
        }
    }

    public final void b(int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3621f, false, 60180, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3621f, false, 60180, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2, i3);
        if (this.h != null) {
            CollectGuidePopupWindow collectGuidePopupWindow = this.h;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, collectGuidePopupWindow, CollectGuidePopupWindow.f3629a, false, 60540, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                CollectGuidePopupWindow collectGuidePopupWindow2 = collectGuidePopupWindow;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, collectGuidePopupWindow2, CollectGuidePopupWindow.f3629a, false, 60540, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i4 > u.a(44.0d)) {
                collectGuidePopupWindow.dismiss();
            }
        }
        float f2 = 0.0f;
        if (this.K == 0.0f) {
            if (this.mMusicName.getVisibility() == 0) {
                this.K = (float) (this.mMusicName.getBottom() - this.v.getBottom());
            } else if (this.mMusicTitle.getVisibility() == 0) {
                this.K = (float) (this.mMusicTitle.getBottom() - this.v.getBottom());
            }
        }
        if (this.J == 0.0f) {
            this.J = (float) (this.mHeadLayout.getBottom() - this.v.getBottom());
        }
        float f3 = (float) i4;
        float f4 = (f3 - this.K) / (this.J - this.K);
        if (f4 >= 0.0f) {
            f2 = f4;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.v.setAlpha(f2);
        if (com.ss.android.g.a.a()) {
            this.u.setAlpha(f2);
            this.mHeadLayout.setAlpha(1.0f - (f3 / this.J));
        } else {
            this.u.setAlpha(f2 * f2 * f2);
            this.mHeadLayout.setAlpha((float) Math.pow((double) (1.0f - (f3 / this.J)), 3.0d));
        }
        a().setAlpha(1.0f - f2);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3621f, false, 60186, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3621f, false, 60186, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == -1 && intent2 != null) {
            if (this.l != null) {
                this.l.setMusicName(intent2.getStringExtra("MUSIC_TITLE"));
                a(true, true, null);
            }
            k();
        }
    }

    private void a(boolean z, boolean z2, @Nullable SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), spannableStringBuilder2}, this, f3621f, false, 60205, new Class[]{Boolean.TYPE, Boolean.TYPE, SpannableStringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), spannableStringBuilder2}, this, f3621f, false, 60205, new Class[]{Boolean.TYPE, Boolean.TYPE, SpannableStringBuilder.class}, Void.TYPE);
            return;
        }
        if (z) {
            if (z2) {
                this.mMusicTitle.setText(this.aa.music.getMusicName());
                this.btnEditMusicTitle.setVisibility(8);
                return;
            }
            String ownerId = this.aa.music.getOwnerId();
            if (this.aa != null && !StringUtils.isEmpty(ownerId) && StringUtils.equal(ownerId, com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                this.btnEditMusicTitle.setVisibility(8);
                SpannableString spannableString = new SpannableString(getResources().getString(C0906R.string.a_d));
                z zVar = new z(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838085));
                zVar.a(UIUtils.dip2Px(getContext(), 8.5f));
                zVar.a(getResources().getColor(C0906R.color.zx));
                zVar.a(UIUtils.dip2Px(getContext(), 4.0f), UIUtils.dip2Px(getContext(), 4.0f), UIUtils.dip2Px(getContext(), 4.0f), UIUtils.dip2Px(getContext(), 4.0f));
                zVar.a(UIUtils.dip2Px(getContext(), 4.0f), 0.0f);
                l.a(spannableString, zVar, 0, spannableString.length(), 18);
                l.a(spannableString, new ClickableSpan() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56478a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f56478a, false, 60255, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f56478a, false, 60255, new Class[]{View.class}, Void.TYPE);
                        } else if (MusicDetailFragment.this.l != null) {
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("edit_title").setLabelName("song_cover").setValue(String.valueOf(MusicDetailFragment.this.l.getId())));
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("original_title_click").setLabelName("original_music"));
                            Intent intent = new Intent(MusicDetailFragment.this.getActivity(), EditOriginMusicTitleActivity.class);
                            intent.putExtra("MUSIC_TITLE", String.valueOf(MusicDetailFragment.this.l.getId()));
                            MusicDetailFragment.this.startActivityForResult(intent, 0);
                        }
                    }
                }, 0, spannableString.length(), 18);
                if (spannableStringBuilder2 != null) {
                    spannableStringBuilder2.append(spannableString);
                }
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("original_title_show").setLabelName("original_music").setValue(String.valueOf(this.l.getId())));
            }
        }
    }
}
