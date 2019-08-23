package com.ss.android.ugc.aweme.follow;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.FollowCellViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder;
import com.ss.android.ugc.aweme.follow.ui.ImageCellViewHolder;
import com.ss.android.ugc.aweme.follow.ui.RecommendUsersViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class FollowFeedAdapter extends BaseAdapter<FollowFeed> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47707a;

    /* renamed from: b  reason: collision with root package name */
    public e f47708b;

    /* renamed from: c  reason: collision with root package name */
    public a f47709c;

    /* renamed from: d  reason: collision with root package name */
    private String f47710d;

    /* renamed from: e  reason: collision with root package name */
    private d f47711e = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47713a;

        public final void a(View view, Aweme aweme, String str) {
            View view2 = view;
            Aweme aweme2 = aweme;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{view2, aweme2, str2}, this, f47713a, false, 44565, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, aweme2, str2}, this, f47713a, false, 44565, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
                return;
            }
            FollowFeedAdapter.this.f47708b.a(view2, new FollowFeed(aweme2), str2);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private FollowCellFeedFragmentPanel f47712f;
    private b g;
    private boolean h = true;

    public interface a {
        void c(boolean z);
    }

    @NonNull
    private FollowFeed b() {
        if (PatchProxy.isSupport(new Object[0], this, f47707a, false, 44557, new Class[0], FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[0], this, f47707a, false, 44557, new Class[0], FollowFeed.class);
        }
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65283);
        return followFeed;
    }

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f47707a, false, 44564, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47707a, false, 44564, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mItems == null) {
            return 0;
        } else {
            if (this.h) {
                return this.mItems.size();
            }
            return this.mItems.size() - 1;
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f47707a, false, 44550, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47707a, false, 44550, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mItems == null || this.mItems.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < this.mItems.size(); i++) {
                if (((FollowFeed) this.mItems.get(i)).getFeedType() == 65283) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void setLoadMoreListener(LoadMoreRecyclerViewAdapter.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47707a, false, 44558, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f47707a, false, 44558, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE);
            return;
        }
        super.setLoadMoreListener(aVar);
        if (this.f47712f != null) {
            this.f47712f.f3253e = false;
        }
    }

    private int a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f47707a, false, 44562, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, f47707a, false, 44562, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme == null || aweme.getAwemeType() != 2) {
            return 0;
        } else {
            return 3;
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f47707a, false, 44553, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f47707a, false, 44553, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47715a;

                public int getSpanSize(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47715a, false, 44566, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47715a, false, 44566, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (i == 0 && FollowFeedAdapter.this.mItems != null && i < FollowFeedAdapter.this.mItems.size() && FollowFeedAdapter.this.getBasicItemViewType(i) == 1) {
                        return gridLayoutManager.getSpanCount();
                    } else {
                        if (FollowFeedAdapter.this.getItemViewType(i) == Integer.MIN_VALUE) {
                            return gridLayoutManager.getSpanCount();
                        }
                        return 1;
                    }
                }
            });
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f47707a, false, 44547, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f47707a, false, 44547, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((AnimatedViewHolder) viewHolder).a(true);
        }
        if (viewHolder.getItemViewType() == 0) {
            if (!(this.f47712f == null || !this.f47712f.aq || this.g == null)) {
                this.g.a(viewHolder);
            }
        } else if (viewHolder.getItemViewType() == 2 && (viewHolder instanceof RecommendUsersViewHolder)) {
            ((RecommendUsersViewHolder) viewHolder).b();
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f47707a, false, 44548, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f47707a, false, 44548, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) viewHolder;
            animatedViewHolder.a(false);
            animatedViewHolder.g();
        }
    }

    public void setData(List<FollowFeed> list) {
        List<FollowFeed> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f47707a, false, 44556, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47707a, false, 44556, new Class[]{List.class}, Void.TYPE);
            return;
        }
        FollowFeed b2 = b();
        if (list != null) {
            list.add(0, b2);
            list2 = list;
        } else {
            list2 = new ArrayList<>();
            list2.add(b2);
        }
        a(true);
        super.setData(list2);
        if (this.f47712f != null) {
            this.f47712f.f3253e = false;
        }
    }

    public void setDataAfterLoadLatest(List<FollowFeed> list) {
        List<FollowFeed> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f47707a, false, 44559, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47707a, false, 44559, new Class[]{List.class}, Void.TYPE);
            return;
        }
        FollowFeed b2 = b();
        if (list != null) {
            list.add(0, b2);
            list2 = list;
        } else {
            list2 = new ArrayList<>();
            list2.add(b2);
        }
        a(true);
        super.setDataAfterLoadLatest(list2);
        if (this.f47712f != null) {
            this.f47712f.f3253e = false;
        }
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47707a, false, 44561, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47707a, false, 44561, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mItems == null) {
            return 0;
        } else {
            if (this.h) {
                FollowFeed followFeed = (FollowFeed) this.mItems.get(i);
                if (followFeed == null) {
                    return 0;
                }
                if (followFeed.getFeedType() == 65281) {
                    return 2;
                }
                if (followFeed.getFeedType() == 65280) {
                    return a(followFeed.getAweme());
                }
                if (followFeed.getFeedType() == 65283) {
                    return 1;
                }
                return 0;
            }
            int i2 = i + 1;
            if (i2 >= this.mItems.size()) {
                return 0;
            }
            FollowFeed followFeed2 = (FollowFeed) this.mItems.get(i2);
            if (followFeed2 == null) {
                return 0;
            }
            if (followFeed2.getFeedType() == 65281) {
                return 2;
            }
            if (followFeed2.getFeedType() == 65280) {
                return a(followFeed2.getAweme());
            }
            return 0;
        }
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f47707a, false, 44549, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f47707a, false, 44549, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mItems == null || this.mItems.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        } else {
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                if (((FollowFeed) this.mItems.get(i)).getFeedType() == 65280) {
                    Aweme aweme = ((FollowFeed) this.mItems.get(i)).getAweme();
                    if (aweme != null && StringUtils.equal(str, aweme.getAid())) {
                        if (this.h) {
                            return i;
                        }
                        return i - 1;
                    }
                }
            }
            return -1;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47707a, false, 44563, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47707a, false, 44563, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = z;
        notifyDataSetChanged();
        if (this.f47709c != null) {
            this.f47709c.c(z);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47707a, false, 44555, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47707a, false, 44555, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case 0:
                return new FollowCellViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uc, viewGroup, false), this.f47710d, this.f47711e);
            case 1:
                return new HeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.up, viewGroup, false));
            case 2:
                return new RecommendUsersViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zk, viewGroup, false));
            case 3:
                return new ImageCellViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vx, viewGroup, false), this.f47710d, this.f47711e);
            default:
                return new FollowCellViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uc, viewGroup, false), this.f47710d, this.f47711e);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f47707a, false, 44554, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f47707a, false, 44554, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getBasicItemViewType(i5)) {
            case 0:
                if (!this.h) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
                FollowCellViewHolder followCellViewHolder = (FollowCellViewHolder) viewHolder;
                Aweme aweme = ((FollowFeed) this.mItems.get(i2)).getAweme();
                if (this.f47712f != null) {
                    z = true;
                }
                followCellViewHolder.a(aweme, i2, z);
                return;
            case 1:
                ((HeaderViewHolder) viewHolder).a(this.f47712f.ar, false);
                return;
            case 2:
                if (!this.h) {
                    i3 = i5 + 1;
                } else {
                    i3 = i5;
                }
                RecommendUsersViewHolder recommendUsersViewHolder = (RecommendUsersViewHolder) viewHolder;
                List<User> user = ((FollowFeed) this.mItems.get(i3)).getUser();
                if (PatchProxy.isSupport(new Object[]{user}, recommendUsersViewHolder, RecommendUsersViewHolder.f47829a, false, 44738, new Class[]{List.class}, Void.TYPE)) {
                    RecommendUsersViewHolder recommendUsersViewHolder2 = recommendUsersViewHolder;
                    PatchProxy.accessDispatch(new Object[]{user}, recommendUsersViewHolder2, RecommendUsersViewHolder.f47829a, false, 44738, new Class[]{List.class}, Void.TYPE);
                    break;
                } else {
                    if (user != null) {
                        recommendUsersViewHolder.f47830b = user;
                        switch (user.size()) {
                            case 0:
                                break;
                            case 1:
                                recommendUsersViewHolder.f47831c.setUser(user.get(0));
                                recommendUsersViewHolder.f47832d.setUser(null);
                                break;
                            default:
                                recommendUsersViewHolder.f47831c.setUser(user.get(0));
                                recommendUsersViewHolder.f47832d.setUser(user.get(1));
                                break;
                        }
                    }
                    return;
                }
            case 3:
                if (!this.h) {
                    i4 = i5 + 1;
                } else {
                    i4 = i5;
                }
                ImageCellViewHolder imageCellViewHolder = (ImageCellViewHolder) viewHolder;
                Aweme aweme2 = ((FollowFeed) this.mItems.get(i4)).getAweme();
                if (this.f47712f != null) {
                    z = true;
                }
                imageCellViewHolder.a(aweme2, i4, z);
                break;
        }
    }

    public FollowFeedAdapter(FollowCellFeedFragmentPanel followCellFeedFragmentPanel, String str, e eVar, b<AbsCellViewHolder> bVar) {
        this.f47710d = str;
        this.f47708b = eVar;
        this.f47712f = followCellFeedFragmentPanel;
        this.g = bVar;
    }
}
