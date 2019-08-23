package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.discover.adapter.StaggeredGridSearchAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.newfollow.b.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Iterator;
import java.util.List;

public class CellFeedAdapter extends AnimatedAdapter implements b {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f44660f;
    public z g;
    private String i;
    private d j;
    private CellFeedFragmentPanel k;
    private com.ss.android.ugc.aweme.common.d.b l;
    private int m;
    private int n;

    public final void M_() {
        if (PatchProxy.isSupport(new Object[0], this, f44660f, false, 40327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44660f, false, 40327, new Class[0], Void.TYPE);
        }
    }

    public final void B_() {
        if (PatchProxy.isSupport(new Object[0], this, f44660f, false, 40322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44660f, false, 40322, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.d();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f44660f, false, 40321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44660f, false, 40321, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.e();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f44660f, false, 40323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44660f, false, 40323, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            z zVar = this.g;
            if (PatchProxy.isSupport(new Object[0], zVar, z.f44975a, false, 40643, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], zVar, z.f44975a, false, 40643, new Class[0], Void.TYPE);
                return;
            }
            zVar.f44976b.clear();
        }
    }

    public void setDataAfterLoadLatest(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f44660f, false, 40318, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f44660f, false, 40318, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setDataAfterLoadLatest(list);
        if (this.k != null) {
            this.k.k = false;
        }
    }

    public void setLoadMoreListener(LoadMoreRecyclerViewAdapter.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f44660f, false, 40317, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f44660f, false, 40317, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE);
            return;
        }
        super.setLoadMoreListener(aVar);
        if (this.k != null) {
            this.k.k = false;
        }
    }

    public int getLoadMoreHeight(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44660f, false, 40314, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f44660f, false, 40314, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view == null) {
            return 0;
        } else {
            return (int) UIUtils.dip2Px(view.getContext(), 95.0f);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f44660f, false, 40319, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f44660f, false, 40319, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0 && this.k != null && this.k.aq && this.l != null) {
            this.l.a(viewHolder);
        }
        if (viewHolder instanceof RecommendCellBViewHolder) {
            ((RecommendCellBViewHolder) viewHolder).m();
        }
    }

    public void setData(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f44660f, false, 40316, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f44660f, false, 40316, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(list);
        if (this.k != null) {
            this.k.k = false;
        }
        if (list != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void setLoadingPadding(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f44660f, false, 40315, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f44660f, false, 40315, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            view2.setPadding(0, 0, 0, (int) UIUtils.dip2Px(view.getContext(), 40.5f));
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View view;
        ViewGroup viewGroup2 = viewGroup;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f44660f, false, 40313, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f44660f, false, 40313, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.n == 7) {
            AbTestManager.a();
            StaggeredGridTimelineV2ViewHolder staggeredGridTimelineV2ViewHolder = new StaggeredGridTimelineV2ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0t, viewGroup2, false), this.i, this.j, this.n, this.g);
            return staggeredGridTimelineV2ViewHolder;
        } else if (this.n == 11) {
            StaggeredGridTimeLineViewHolder staggeredGridTimeLineViewHolder = new StaggeredGridTimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0s, viewGroup2, false), this.i, this.j, this.n, null);
            return staggeredGridTimeLineViewHolder;
        } else if (this.n == 1) {
            return new FollowCellViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uc, viewGroup2, false), this.i, this.j);
        } else {
            if (this.n == 9 || this.n == 16) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zb, viewGroup2, false);
                if (this.n == 9) {
                    z = true;
                }
                return new RecommendCellBViewHolder(inflate, this.i, this.j, z);
            } else if (this.n == 15) {
                if (AbTestManager.a().aw() == 1) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0r, viewGroup2, false);
                } else if (AbTestManager.a().aw() == 2) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0q, viewGroup2, false);
                } else {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0p, viewGroup2, false);
                }
                return new StaggeredGridSearchAwemeViewHolder(view, this.i, this.j, this.n);
            } else if (this.m == 1) {
                String str = this.i;
                d dVar = this.j;
                if (!PatchProxy.isSupport(new Object[]{viewGroup2, str, dVar}, null, RecommendCellBViewHolder.f44766a, true, 40610, new Class[]{ViewGroup.class, String.class, d.class}, RecommendCellBViewHolder.class)) {
                    return new RecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zb, viewGroup2, false), str, dVar);
                }
                return (RecommendCellBViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, str, dVar}, null, RecommendCellBViewHolder.f44766a, true, 40610, new Class[]{ViewGroup.class, String.class, d.class}, RecommendCellBViewHolder.class);
            } else if (this.m == 2) {
                return new RecommendCellCViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zc, viewGroup2, false), this.i, this.j);
            } else {
                if (this.m == 3) {
                    return new PoiDetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zb, viewGroup2, false), this.i, this.j);
                }
                return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a16, viewGroup2, false), this.i, this.j);
            }
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f44660f, false, 40312, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f44660f, false, 40312, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.n == 7) {
            AbTestManager.a();
            if (viewHolder2 instanceof StaggeredGridTimeLineViewHolder) {
                ((StaggeredGridTimeLineViewHolder) viewHolder2).a((Aweme) this.mItems.get(i3), i3, true);
                return;
            }
            StaggeredGridTimelineV2ViewHolder staggeredGridTimelineV2ViewHolder = (StaggeredGridTimelineV2ViewHolder) viewHolder2;
            Aweme aweme = (Aweme) this.mItems.get(i3);
            if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i2), (byte) 1}, staggeredGridTimelineV2ViewHolder, StaggeredGridTimelineV2ViewHolder.v, false, 40677, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                StaggeredGridTimelineV2ViewHolder staggeredGridTimelineV2ViewHolder2 = staggeredGridTimelineV2ViewHolder;
                PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i2), (byte) 1}, staggeredGridTimelineV2ViewHolder2, StaggeredGridTimelineV2ViewHolder.v, false, 40677, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            } else {
                if (aweme != null) {
                    staggeredGridTimelineV2ViewHolder.g = aweme;
                    staggeredGridTimelineV2ViewHolder.w = true;
                    if (staggeredGridTimelineV2ViewHolder.w) {
                        staggeredGridTimelineV2ViewHolder.b();
                    }
                    staggeredGridTimelineV2ViewHolder.n();
                }
            }
        } else if (this.n == 11) {
            StaggeredGridTimeLineViewHolder staggeredGridTimeLineViewHolder = (StaggeredGridTimeLineViewHolder) viewHolder2;
            Aweme aweme2 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            staggeredGridTimeLineViewHolder.a(aweme2, i3, z);
        } else if (this.n == 1) {
            FollowCellViewHolder followCellViewHolder = (FollowCellViewHolder) viewHolder2;
            Aweme aweme3 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            followCellViewHolder.a(aweme3, i3, z);
        } else if (this.n == 9 || this.n == 16) {
            RecommendCellBViewHolder recommendCellBViewHolder = (RecommendCellBViewHolder) viewHolder2;
            Aweme aweme4 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            recommendCellBViewHolder.a(aweme4, i3, z);
        } else if (this.n == 15) {
            StaggeredGridSearchAwemeViewHolder staggeredGridSearchAwemeViewHolder = (StaggeredGridSearchAwemeViewHolder) viewHolder2;
            Aweme aweme5 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            staggeredGridSearchAwemeViewHolder.a(aweme5, i3, z);
        } else if (this.m == 1) {
            RecommendCellBViewHolder recommendCellBViewHolder2 = (RecommendCellBViewHolder) viewHolder2;
            Aweme aweme6 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            recommendCellBViewHolder2.a(aweme6, i3, z);
        } else if (this.m == 2) {
            RecommendCellCViewHolder recommendCellCViewHolder = (RecommendCellCViewHolder) viewHolder2;
            Aweme aweme7 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            recommendCellCViewHolder.a(aweme7, i3, z);
        } else if (this.m == 0) {
            TimeLineViewHolder timeLineViewHolder = (TimeLineViewHolder) viewHolder2;
            Aweme aweme8 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            timeLineViewHolder.a(aweme8, i3, z);
        } else if (this.m == 3) {
            PoiDetailViewHolder poiDetailViewHolder = (PoiDetailViewHolder) viewHolder2;
            Aweme aweme9 = (Aweme) this.mItems.get(i3);
            if (this.k == null || this.k.aq) {
                z = true;
            }
            poiDetailViewHolder.a(aweme9, i3, z);
        }
    }

    public CellFeedAdapter(CellFeedFragmentPanel cellFeedFragmentPanel, String str, d dVar, com.ss.android.ugc.aweme.common.d.b<AbsCellViewHolder> bVar, int i2, int i3) {
        this.i = str;
        this.j = dVar;
        this.k = cellFeedFragmentPanel;
        this.l = bVar;
        this.m = i2;
        this.n = i3;
        this.g = new z(cellFeedFragmentPanel.mListView);
    }
}
