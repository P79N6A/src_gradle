package com.ss.android.ugc.aweme.discover.adapter;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotVideoViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41660a;

    /* renamed from: b  reason: collision with root package name */
    public String f41661b;

    /* renamed from: c  reason: collision with root package name */
    public f<Aweme> f41662c;

    /* renamed from: d  reason: collision with root package name */
    public List<Aweme> f41663d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private HotVideoAdapter f41664e;

    /* renamed from: f  reason: collision with root package name */
    private List<HotVideoItem> f41665f;
    private LinearLayoutManager g;
    @BindView(2131498191)
    View mLeftTitleView;
    @BindView(2131496874)
    RecyclerView mRecyclerView;
    @BindView(2131495061)
    View mRightArrowView;
    @BindView(2131497953)
    View mRightTitleView;
    @BindView(2131498508)
    View mYellowDotView;

    class HotVideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41670a;

        /* renamed from: b  reason: collision with root package name */
        List<HotVideoItem> f41671b;

        public int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f41670a, false, 35657, new Class[0], Integer.TYPE)) {
                return this.f41671b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41670a, false, 35657, new Class[0], Integer.TYPE)).intValue();
        }

        HotVideoAdapter() {
        }

        public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f41670a, false, 35658, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f41670a, false, 35658, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            super.onViewAttachedToWindow(viewHolder);
            int adapterPosition = viewHolder.getAdapterPosition();
            if (!(CollectionUtils.isEmpty(this.f41671b) || this.f41671b.get(adapterPosition) == null || this.f41671b.get(adapterPosition).getAweme() == null)) {
                r.a("hot_search_video_keyword", (Map) new d().a("group_id", this.f41671b.get(viewHolder.getAdapterPosition()).getAweme().getAid()).a("author_id", this.f41671b.get(viewHolder.getAdapterPosition()).getAweme().getAuthorUid()).a("action_type", "show").a("enter_from", "discovery").a("order", viewHolder.getAdapterPosition() + 1).f34114b);
            }
        }

        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41670a, false, 35654, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41670a, false, 35654, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }
            String str = HotVideoViewHolder.this.f41661b;
            f<Aweme> fVar = HotVideoViewHolder.this.f41662c;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, str, fVar}, null, HotVideoItemViewHolder.f41654a, true, 35631, new Class[]{ViewGroup.class, String.class, f.class}, HotVideoItemViewHolder.class)) {
                return new HotVideoItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a18, viewGroup2, false), str, fVar);
            }
            return (HotVideoItemViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, str, fVar}, null, HotVideoItemViewHolder.f41654a, true, 35631, new Class[]{ViewGroup.class, String.class, f.class}, HotVideoItemViewHolder.class);
        }

        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41670a, false, 35655, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41670a, false, 35655, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HotVideoItemViewHolder hotVideoItemViewHolder = (HotVideoItemViewHolder) viewHolder;
            HotVideoItem hotVideoItem = this.f41671b.get(i2);
            if (PatchProxy.isSupport(new Object[]{hotVideoItem, Integer.valueOf(i)}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35632, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotVideoItem, Integer.valueOf(i)}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35632, new Class[]{HotVideoItem.class, Integer.TYPE}, Void.TYPE);
            } else if (hotVideoItem != null) {
                hotVideoItemViewHolder.f41656c = hotVideoItem.getAweme();
                if (hotVideoItemViewHolder.f41656c != null) {
                    if (PatchProxy.isSupport(new Object[0], hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35633, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35633, new Class[0], Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35637, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35637, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if ((!a.a() || !c.a()) && com.ss.android.ugc.aweme.framework.d.a.a(hotVideoItemViewHolder.itemView.getContext()) && com.ss.android.ugc.aweme.setting.f.a(hotVideoItemViewHolder.itemView.getContext())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Video video = hotVideoItemViewHolder.f41656c.getVideo();
                            if (PatchProxy.isSupport(new Object[]{video}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35638, new Class[]{Video.class}, Boolean.TYPE)) {
                                HotVideoItemViewHolder hotVideoItemViewHolder2 = hotVideoItemViewHolder;
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{video}, hotVideoItemViewHolder2, HotVideoItemViewHolder.f41654a, false, 35638, new Class[]{Video.class}, Boolean.TYPE)).booleanValue();
                            } else if (video == null || video.getDynamicCover() == null || TextUtils.isEmpty(video.getDynamicCover().getUri()) || video.getDynamicCover().getUrlList() == null || video.getDynamicCover().getUrlList().isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                hotVideoItemViewHolder.mCover.a(hotVideoItemViewHolder.f41656c.getVideo().getDynamicCover());
                                hotVideoItemViewHolder.mCover.setUserVisibleHint(true);
                                hotVideoItemViewHolder.mCover.setAttached(true);
                            }
                        }
                        com.ss.android.ugc.aweme.base.c.b(hotVideoItemViewHolder.mCover, hotVideoItemViewHolder.f41656c.getVideo().getCover());
                    }
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35634, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        HotVideoItemViewHolder hotVideoItemViewHolder3 = hotVideoItemViewHolder;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, hotVideoItemViewHolder3, HotVideoItemViewHolder.f41654a, false, 35634, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        h.a(hotVideoItemViewHolder.mRank, i2 + 1, 4);
                    }
                    String hotValue = hotVideoItem.getHotValue();
                    if (PatchProxy.isSupport(new Object[]{hotValue}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35635, new Class[]{String.class}, Void.TYPE)) {
                        HotVideoItemViewHolder hotVideoItemViewHolder4 = hotVideoItemViewHolder;
                        PatchProxy.accessDispatch(new Object[]{hotValue}, hotVideoItemViewHolder4, HotVideoItemViewHolder.f41654a, false, 35635, new Class[]{String.class}, Void.TYPE);
                    } else {
                        String a2 = b.a(Long.parseLong(hotValue));
                        hotVideoItemViewHolder.mText.setText(hotVideoItemViewHolder.itemView.getContext().getString(C0906R.string.cng, new Object[]{a2}));
                    }
                    hotVideoItemViewHolder.itemView.setOnClickListener(new m(hotVideoItemViewHolder, i2, hotVideoItem));
                }
            }
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41660a, false, 35646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41660a, false, 35646, new Class[0], Void.TYPE);
            return;
        }
        v.a(this.mYellowDotView, 8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mRightArrowView.getLayoutParams();
        layoutParams.leftMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 5.0f);
        this.mRightArrowView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41660a, false, 35643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41660a, false, 35643, new Class[0], Void.TYPE);
            return;
        }
        RankingListVideoActivity.a(this.itemView.getContext());
        if (this.mYellowDotView != null && this.mYellowDotView.isShown()) {
            SharePrefCache.inst().getIsShowRankingIndicator().a(Boolean.FALSE);
            b();
        }
    }

    public HotVideoViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41665f = new ArrayList();
        if (PatchProxy.isSupport(new Object[0], this, f41660a, false, 35642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41660a, false, 35642, new Class[0], Void.TYPE);
            return;
        }
        this.g = new WrapLinearLayoutManager(this.itemView.getContext(), 0, false);
        this.mRecyclerView.setLayoutManager(this.g);
        this.mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41666a;

            public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                Rect rect2 = rect;
                View view2 = view;
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f41666a, false, 35651, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                    Object[] objArr = {rect2, view2, recyclerView2, state};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, this, f41666a, false, 35651, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                rect2.right = u.a(6.0d);
                if (recyclerView.getLayoutManager() != null && recyclerView2.getChildAdapterPosition(view2) == recyclerView.getLayoutManager().getItemCount() - 1) {
                    rect2.right = 0;
                }
            }
        });
        this.f41664e = new HotVideoAdapter();
        this.mRecyclerView.setAdapter(this.f41664e);
        this.mLeftTitleView.setOnClickListener(new n(this));
        this.mRightTitleView.setOnClickListener(new o(this));
        this.f41662c = new f<Aweme>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41668a;

            public final /* synthetic */ void a(Object obj, int i) {
                Aweme aweme = (Aweme) obj;
                if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f41668a, false, 35653, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f41668a, false, 35653, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i, "show", 1);
            }

            public final /* synthetic */ void b(Object obj, int i) {
                Aweme aweme = (Aweme) obj;
                if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f41668a, false, 35652, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f41668a, false, 35652, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i + 1, "click", 1);
                com.ss.android.ugc.aweme.hotsearch.b.b bVar = new com.ss.android.ugc.aweme.hotsearch.b.b();
                List<Aweme> list = HotVideoViewHolder.this.f41663d;
                if (PatchProxy.isSupport(new Object[]{list}, bVar, com.ss.android.ugc.aweme.hotsearch.b.b.f49674a, false, 49721, new Class[]{List.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.hotsearch.b.b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{list}, bVar2, com.ss.android.ugc.aweme.hotsearch.b.b.f49674a, false, 49721, new Class[]{List.class}, Void.TYPE);
                } else if (list != null) {
                    bVar.f49676c.addAll(list);
                }
                com.ss.android.ugc.aweme.feed.a.a().f44610c = bVar;
                com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                a2.a(j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "discovery_hot_search_video").a("video_from", "from_hot_search_aweme").a());
            }
        };
    }

    public final void a(List<HotVideoItem> list) {
        List<HotVideoItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f41660a, false, 35644, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f41660a, false, 35644, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list) && this.f41665f != list2) {
            if (PatchProxy.isSupport(new Object[0], this, f41660a, false, 35647, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41660a, false, 35647, new Class[0], Void.TYPE);
            } else {
                b();
            }
            this.f41665f = list2;
            HotVideoAdapter hotVideoAdapter = this.f41664e;
            List<HotVideoItem> list3 = this.f41665f;
            if (PatchProxy.isSupport(new Object[]{list3}, hotVideoAdapter, HotVideoAdapter.f41670a, false, 35656, new Class[]{List.class}, Void.TYPE)) {
                HotVideoAdapter hotVideoAdapter2 = hotVideoAdapter;
                PatchProxy.accessDispatch(new Object[]{list3}, hotVideoAdapter2, HotVideoAdapter.f41670a, false, 35656, new Class[]{List.class}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(list3)) {
                if (hotVideoAdapter.f41671b == null) {
                    hotVideoAdapter.f41671b = new ArrayList();
                }
                hotVideoAdapter.f41671b.clear();
                hotVideoAdapter.f41671b.addAll(list3);
            }
            this.f41664e.notifyDataSetChanged();
            this.f41663d.clear();
            for (int i = 0; i < this.f41665f.size(); i++) {
                this.f41663d.add(this.f41665f.get(i).getAweme());
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41660a, false, 35648, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41660a, false, 35648, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mRecyclerView != null && this.g != null) {
            int findLastVisibleItemPosition = this.g.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = this.g.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                if (findViewHolderForAdapterPosition != null) {
                    HotVideoItemViewHolder hotVideoItemViewHolder = (HotVideoItemViewHolder) findViewHolderForAdapterPosition;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, hotVideoItemViewHolder, HotVideoItemViewHolder.f41654a, false, 35636, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        HotVideoItemViewHolder hotVideoItemViewHolder2 = hotVideoItemViewHolder;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, hotVideoItemViewHolder2, HotVideoItemViewHolder.f41654a, false, 35636, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (z) {
                        hotVideoItemViewHolder.mCover.b();
                    } else {
                        hotVideoItemViewHolder.mCover.c();
                    }
                }
            }
        }
    }
}
