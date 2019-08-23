package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.c.a;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.u.am;
import com.ss.android.ugc.aweme.u.n;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements RecyclerViewVisibilityObserver.d, AnimatedListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41566a;

    /* renamed from: b  reason: collision with root package name */
    public static final Category f41567b = new Category();

    /* renamed from: c  reason: collision with root package name */
    public final WrapLinearLayoutManager f41568c;

    /* renamed from: d  reason: collision with root package name */
    public Category f41569d;

    /* renamed from: e  reason: collision with root package name */
    public int f41570e;

    /* renamed from: f  reason: collision with root package name */
    public AnimatedListAdapter f41571f;
    public Context g;
    public View h;
    private OnAnimatedScrollListener i = new OnAnimatedScrollListener();
    @BindView(2131495374)
    public View mCategoryCountView;
    @BindView(2131495184)
    public RemoteImageView mIvType;
    @BindView(2131496876)
    public RecyclerView mListView;
    @BindView(2131496848)
    public View mRoot;
    @BindView(2131497867)
    public TextView mTvCount;
    @BindView(2131498191)
    public TextView mTvTitle;
    @BindView(2131498210)
    public TextView mTvType;
    @BindView(2131493975)
    public ImageView mViewDiscoverBg;
    @BindView(2131498564)
    public ViewStub mViewStubPlaceHolder;

    private static String b(boolean z) {
        return z ? "cell_slide" : "cell_click";
    }

    private static String c(boolean z) {
        return z ? "into" : "header_click";
    }

    private int d() {
        return this.f41570e + 1;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41566a, false, 35532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41566a, false, 35532, new Class[0], Void.TYPE);
            return;
        }
        a(true);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41566a, false, 35530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41566a, false, 35530, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a(this.mListView, false);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41566a, false, 35531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41566a, false, 35531, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            OnAnimatedScrollListener onAnimatedScrollListener = this.i;
            RecyclerView recyclerView = this.mListView;
            if (PatchProxy.isSupport(new Object[]{recyclerView}, onAnimatedScrollListener, OnAnimatedScrollListener.f35558a, false, 26296, new Class[]{RecyclerView.class}, Void.TYPE)) {
                OnAnimatedScrollListener onAnimatedScrollListener2 = onAnimatedScrollListener;
                PatchProxy.accessDispatch(new Object[]{recyclerView}, onAnimatedScrollListener2, OnAnimatedScrollListener.f35558a, false, 26296, new Class[]{RecyclerView.class}, Void.TYPE);
            } else if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
                    if (childViewHolder.getItemViewType() == 0) {
                        AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) childViewHolder;
                        if (animatedViewHolder != null) {
                            animatedViewHolder.g();
                        }
                    }
                }
            }
        }
    }

    public CategoryViewHolder(View view) {
        super(view);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41572a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41572a, false, 35534, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41572a, false, 35534, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                CategoryViewHolder.this.a(false);
            }
        });
        this.g = view.getContext();
        ButterKnife.bind((Object) this, view);
        int color = view.getContext().getResources().getColor(C0906R.color.ox);
        this.f41568c = new WrapLinearLayoutManager(view.getContext(), 0, false);
        this.mListView.setLayoutManager(this.f41568c);
        this.mListView.addItemDecoration(new DividerItemDecoration(color, (int) UIUtils.dip2Px(view.getContext(), 2.0f), 0));
        this.mListView.addOnScrollListener(this.i);
        this.mListView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41574a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f41574a, false, 35535, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f41574a, false, 35535, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    r.a((Context) null, "cell_slide", "slide", 0, 0);
                }
            }
        });
    }

    public final void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41566a, false, 35533, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41566a, false, 35533, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!ex.b() && this.f41569d != null) {
            Challenge challenge = this.f41569d.getChallenge();
            if (challenge != null) {
                if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).havePGCShow() || z || !challenge.isPgcshow()) {
                    h a2 = h.a();
                    j a3 = j.a("aweme://challenge/detail/" + challenge.getCid()).a("enter_from", "discovery").a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                    if (com.ss.android.ugc.aweme.commercialize.utils.r.b(challenge)) {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    a2.a(a3.a("is_commerce", str).a());
                    r.a("cell_click", (Map) new d().a("enter_from", "discovery").a("tag_id", challenge.getCid()).a("client_order", d()).f34114b);
                    r.onEvent(MobClick.obtain().setEventName(b(z)).setLabelName(c(z)).setValue(challenge.getCid()).setJsonObject(new c().a("cell_type", "challenge").b()));
                    if (this.f41569d.isAd()) {
                        if (z) {
                            g.a(this.g, this.f41569d);
                        } else {
                            g.b(this.g, this.f41569d);
                        }
                    }
                } else {
                    a aVar = new a();
                    aVar.setItems(new ArrayList());
                    com.ss.android.ugc.aweme.feed.a.a().f44610c = aVar;
                    h a4 = h.a();
                    a4.a(j.a("aweme://aweme/detail/" + this.f41569d.getItems().get(0).getAid()).a("refer", "discovery").a("video_from", "from_challenge").a("challenge_id", challenge.getCid()).a());
                }
                ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b("discovery").a("click_discovery_cover")).e(challenge.getCid()).e();
                z.a(z.c.CHALLENGE);
                return;
            }
            Music music = this.f41569d.getMusic();
            if (music != null && com.ss.android.ugc.aweme.music.util.d.a(com.ss.android.ugc.aweme.music.util.c.f56796b.a(music), this.g, true)) {
                h a5 = h.a();
                a5.a("aweme://music/detail/" + music.getMid());
                r.a("cell_click", (Map) new d().a("enter_from", "discovery").a("music_id", music.getMid()).a("client_order", d()).f34114b);
                r.onEvent(MobClick.obtain().setEventName(b(z)).setLabelName(c(z)).setValue(String.valueOf(music.getMid())).setJsonObject(new c().a("cell_type", "music").b()));
                ((n) new n().b("discovery").f(music.getMid()).a("click_discovery_cover")).e();
                z.a(z.c.MUSICAL);
            }
        }
    }

    public final void a(int i2, @Nullable Object obj, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable View view, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj, viewHolder, view, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f41566a, false, 35528, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj, viewHolder, view, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f41566a, false, 35528, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 == 0 && i4 != 0) {
            Category category = this.f41569d;
            if (category != null) {
                Challenge challenge = category.getChallenge();
                Music music = category.getMusic();
                if (challenge != null) {
                    r.a(this.mListView.getContext(), "show_challenge", "discovery", challenge.getCid(), 0);
                    am amVar = new am();
                    amVar.f75043b = "discovery";
                    amVar.f75044c = challenge.getCid();
                    amVar.e();
                    r.a("cell_show", (Map) new d().a("enter_from", "discovery").a("tag_id", challenge.getCid()).a("client_order", d()).f34114b);
                    if (this.f41569d.isAd()) {
                        Context context = this.g;
                        Category category2 = this.f41569d;
                        if (PatchProxy.isSupport(new Object[]{context, category2}, null, g.f39316a, true, 31738, new Class[]{Context.class, Category.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, category2}, null, g.f39316a, true, 31738, new Class[]{Context.class, Category.class}, Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.commercialize.log.d.a().b("show").g(category2.getLogExtra()).a("discovery_ad").d("hashtag").a(Long.valueOf(category2.getCreativeId())).a(context);
                            g.a((g.a) new v(category2), category2.getTrackUrlList(), false);
                        }
                    }
                } else if (music != null) {
                    r.a(this.mListView.getContext(), "show_music", "discovery", music.getMid(), 0);
                    r.a("cell_show", (Map) new d().a("enter_from", "discovery").a("music_id", music.getMid()).a("client_order", d()).f34114b);
                }
            }
        }
    }
}
