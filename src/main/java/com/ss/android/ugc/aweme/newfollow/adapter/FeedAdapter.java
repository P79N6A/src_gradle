package com.ss.android.ugc.aweme.newfollow.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.forward.d.k;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardImageViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.FavoriteTitleViewHolder;
import com.ss.android.ugc.aweme.newfollow.b.a;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FavoriteVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedArticleViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.w;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.utils.di;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FeedAdapter<T extends b> extends RecyclerHeaderViewAdapter<T> implements Observer<d>, com.ss.android.ugc.aweme.newfollow.b.b, l.a, FollowVideoViewHolder.a {
    public static ChangeQuickRedirect i;

    /* renamed from: f  reason: collision with root package name */
    private i f57063f;
    private int g;
    protected l j;
    protected Set<BaseFollowViewHolder> k;
    protected Set<BaseForwardViewHolder> l;
    public BaseFollowViewHolder.a m;
    public FlowFeedArticleViewHolder.a n;
    public a o;
    public com.ss.android.ugc.aweme.common.d.b p;
    protected com.ss.android.ugc.aweme.feed.d q;
    public com.ss.android.ugc.aweme.forward.a.a r;
    protected RecyclerView s;
    public String t;
    public String u;
    public String v;
    public String w;
    public int x;
    protected boolean y;

    public void M_() {
    }

    public List<T> a(List<T> list) {
        return list;
    }

    public void a(Aweme aweme, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, Aweme aweme, int i2) {
    }

    public boolean d(int i2) {
        return true;
    }

    public final com.ss.android.ugc.aweme.newfollow.b.b g() {
        return this;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return true;
    }

    public final void a(Exception exc, Aweme aweme, int i2) {
        Exception exc2 = exc;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{exc2, aweme2, Integer.valueOf(i2)}, this, i, false, 61039, new Class[]{Exception.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, aweme2, Integer.valueOf(i2)}, this, i, false, 61039, new Class[]{Exception.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder f2 = f(aweme2);
        if (f2 instanceof w) {
            ((w) f2).c(aweme2);
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this.r.d(), exc, i2 == 1 ? C0906R.string.a5i : C0906R.string.dnt);
    }

    public final void a(String str, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{str, comment}, this, i, false, 61040, new Class[]{String.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, comment}, this, i, false, 61040, new Class[]{String.class, Comment.class}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            a(a(c2), -1);
            a(c2).addComment(comment);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
            if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof w)) {
                w wVar = (w) findViewHolderForAdapterPosition;
                wVar.F();
                wVar.d(0);
            }
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, i, false, 61042, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, i, false, 61042, new Class[]{b.class}, Void.TYPE);
        } else if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setForwardCount(statistics.getForwardCount() + 1);
                } else {
                    statistics = new AwemeStatistics();
                    statistics.setForwardCount(1);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, i, false, 61045, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, i, false, 61045, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            a(a(c2), i2);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
            if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof w)) {
                ((w) findViewHolderForAdapterPosition).F();
            }
        }
    }

    public final void a(String str, String str2, int i2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, Integer.valueOf(i2)}, this, i, false, 61046, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3, Integer.valueOf(i2)}, this, i, false, 61046, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            int updateComment = a(c2).updateComment(str2, i2);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
            if (updateComment >= 0 && findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof w)) {
                ((w) findViewHolderForAdapterPosition).f(updateComment);
            }
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, i, false, 61049, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, i, false, 61049, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            int deleteComment = a(c2).deleteComment(str2);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
            if (deleteComment >= 0 && (findViewHolderForAdapterPosition instanceof w)) {
                ((w) findViewHolderForAdapterPosition).e(deleteComment);
            }
        }
    }

    public final void a(boolean z, Aweme aweme) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme}, this, i, false, 61052, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme}, this, i, false, 61052, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        if (z) {
            if (aweme != null) {
                Rect e2 = e(aweme);
                if (e2 != null) {
                    int[] iArr = new int[2];
                    this.s.getLocationOnScreen(iArr);
                    i2 = e2.top - iArr[1];
                    this.g = i2;
                }
            }
            i2 = 0;
            this.g = i2;
        } else {
            i2 = -this.g;
            this.g = 0;
        }
        if (this.s != null) {
            this.s.smoothScrollBy(0, i2);
        }
    }

    public void a(Aweme aweme, boolean z, String str, long j2) {
        Aweme aweme2 = aweme;
        String str2 = str;
        long j3 = j2;
        int i2 = 4;
        if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z ? (byte) 1 : 0), str2, new Long(j3)}, this, i, false, 61053, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z), str2, new Long(j3)}, this, i, false, 61053, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE);
        } else if (aweme2 != null && TextUtils.equals(str2, this.u)) {
            String a2 = com.ss.android.ugc.aweme.newfollow.util.d.a(this.r.e(), aweme.getAid());
            com.ss.android.ugc.aweme.newfollow.util.d c2 = e.a().c(a2);
            if (c2 == null) {
                c2 = new com.ss.android.ugc.aweme.newfollow.util.d(aweme2, new bo(1), a2);
            }
            c2.i = com.ss.android.ugc.aweme.feed.g.d.a().f45349b;
            com.ss.android.ugc.aweme.feed.g.d.a().f45349b = null;
            if (z) {
                i2 = 3;
            }
            c2.f57412c = i2;
            if (j3 > 0) {
                Object[] objArr = {new Long(j3)};
                if (PatchProxy.isSupport(objArr, c2, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61892, new Class[]{Long.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {new Long(j3)};
                    Object[] objArr3 = objArr2;
                    com.ss.android.ugc.aweme.newfollow.util.d dVar = c2;
                    PatchProxy.accessDispatch(objArr3, dVar, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61892, new Class[]{Long.TYPE}, Void.TYPE);
                } else if (j3 > 0) {
                    c2.g = j3;
                } else {
                    c2.a();
                }
            }
            e.a().a(a2, c2);
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61027, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.f();
        }
        if (this.f57063f != null) {
            this.f57063f.b().removeObserver(this);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61026, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.h();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61025, new Class[0], Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.k)) {
            for (BaseFollowViewHolder next : this.k) {
                if (next instanceof FollowVideoViewHolder) {
                    ((FollowVideoViewHolder) next).ae();
                }
            }
        }
        if (!CollectionUtils.isEmpty(this.l)) {
            for (BaseForwardViewHolder next2 : this.l) {
                if (next2 instanceof ForwardVideoViewHolder) {
                    ((k) next2.n).m();
                }
            }
        }
    }

    public void B_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61024, new Class[0], Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.k)) {
            for (BaseFollowViewHolder V : this.k) {
                V.V();
            }
        }
        if (!CollectionUtils.isEmpty(this.l)) {
            for (BaseForwardViewHolder B_ : this.l) {
                B_.B_();
            }
        }
        if (this.j != null) {
            l lVar = this.j;
            if (PatchProxy.isSupport(new Object[0], lVar, l.f57435a, false, 61964, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], lVar, l.f57435a, false, 61964, new Class[0], Void.TYPE);
                return;
            }
            lVar.g();
            lVar.b();
            lVar.d();
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61023, new Class[0], Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.k)) {
            for (BaseFollowViewHolder S : this.k) {
                S.S();
            }
        }
        if (!CollectionUtils.isEmpty(this.l)) {
            for (BaseForwardViewHolder d2 : this.l) {
                d2.d();
            }
        }
    }

    public void setData(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, i, false, 61054, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, i, false, 61054, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(a(list));
    }

    private Rect e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, i, false, 61035, new Class[]{Aweme.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{aweme}, this, i, false, 61035, new Class[]{Aweme.class}, Rect.class);
        } else if (aweme == null) {
            return null;
        } else {
            RecyclerView.ViewHolder f2 = f(aweme);
            if (f2 != null) {
                return di.a(f2);
            }
            return null;
        }
    }

    public int b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, i, false, 61037, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, i, false, 61037, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme == null) {
            return -1;
        } else {
            if (c(aweme)) {
                return 16;
            }
            if (aweme.getAwemeType() == 2) {
                return 17;
            }
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    return 20;
                }
                if (c(aweme.getForwardItem())) {
                    return 18;
                }
                if (aweme.getForwardItem().getAwemeType() == 2) {
                    return 19;
                }
            }
            return -1;
        }
    }

    public final int c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 61051, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 61051, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (getData() == null) {
            return -1;
        } else {
            for (int i2 = 0; i2 < getData().size(); i2++) {
                b a2 = a(i2);
                if (a2.getAweme() != null && TextUtils.equals(a2.getAweme().getAid(), str2)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public BaseForwardViewHolder d(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, i, false, 61015, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, i, false, 61015, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        ForwardVideoViewHolder forwardVideoViewHolder = new ForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o);
        forwardVideoViewHolder.a((FollowVideoViewHolder.a) this);
        return forwardVideoViewHolder;
    }

    @NonNull
    public RecyclerView.ViewHolder f(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, i, false, 61019, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, i, false, 61019, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.m, this.o);
        return forwardTextViewHolder;
    }

    public int getLoadMoreHeight(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 61028, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 61028, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view == null) {
            return 0;
        } else {
            return (int) UIUtils.dip2Px(view.getContext(), 95.0f);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, i, false, 61010, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, i, false, 61010, new Class[]{d.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.mItems) && dVar.f71832b) {
            for (b aweme : this.mItems) {
                Aweme aweme2 = aweme.getAweme();
                if (!(aweme2 == null || aweme2.getAuthor() == null || !TextUtils.equals(dVar.f71831a, aweme2.getAuthor().getUid()))) {
                    aweme2.getAuthor().setHasUnreadStory(false);
                }
            }
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, i, false, 61021, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, i, false, 61021, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (this.p != null) {
            this.p.a(viewHolder);
        }
        if (viewHolder instanceof BaseFollowViewHolder) {
            this.k.add((BaseFollowViewHolder) viewHolder);
        }
        if (viewHolder instanceof BaseForwardViewHolder) {
            this.l.add((BaseForwardViewHolder) viewHolder);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, i, false, 61022, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, i, false, 61022, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof BaseFollowViewHolder) {
            this.k.remove(viewHolder);
        }
        if (viewHolder instanceof BaseForwardViewHolder) {
            this.l.remove(viewHolder);
        }
    }

    public void setLoadingPadding(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, i, false, 61029, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, i, false, 61029, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            view2.setPadding(0, 0, 0, (int) UIUtils.dip2Px(view.getContext(), 40.5f));
        }
    }

    public static boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, i, true, 61038, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, i, true, 61038, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 33 || aweme.getAwemeType() == 1 || aweme.getAwemeType() == 12 || aweme.getAwemeType() == 30 || aweme.getAwemeType() == 31 || aweme.getAwemeType() == 34 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53) {
                return true;
            }
            return false;
        }
    }

    private RecyclerView.ViewHolder f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, i, false, 61036, new Class[]{Aweme.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{aweme}, this, i, false, 61036, new Class[]{Aweme.class}, RecyclerView.ViewHolder.class);
        }
        Pair a2 = di.a(this.s);
        List data = getData();
        if (CollectionUtils.isEmpty(data)) {
            return null;
        }
        for (int intValue = ((Integer) a2.first).intValue(); intValue <= ((Integer) a2.second).intValue(); intValue++) {
            if (intValue < data.size() && intValue >= 0 && ((b) getData().get(intValue)).getFeedType() == 65280) {
                Aweme aweme2 = ((b) data.get(intValue)).getAweme();
                if (!(aweme2 == null || aweme2.getAid() == null || !aweme2.getAid().equals(aweme.getAid()))) {
                    return this.s.findViewHolderForAdapterPosition(intValue);
                }
            }
        }
        return null;
    }

    public final b a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 61030, new Class[]{Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 61030, new Class[]{Integer.TYPE}, b.class);
        } else if (i2 < 0 || i2 >= getBasicItemCount() || this.mItems == null) {
            return null;
        } else {
            return (b) this.mItems.get(i2);
        }
    }

    public BaseFollowViewHolder b(ViewGroup viewGroup) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, i, false, 61012, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return new FollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o);
        }
        return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, i, false, 61012, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
    }

    public FavoriteVideoViewHolder e(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, i, false, 61016, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class)) {
            return new FavoriteVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u4, viewGroup2, false));
        }
        return (FavoriteVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, i, false, 61016, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class);
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 61020, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 61020, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mItems == null) {
            return -1;
        } else {
            b bVar = (b) this.mItems.get(i2);
            if (bVar == null) {
                return -1;
            }
            if (bVar.getFeedType() == 65286) {
                return 22;
            }
            if (bVar.getFeedType() == 65287) {
                return 23;
            }
            if (bVar.getFeedType() == 65280) {
                return b(bVar.getAweme());
            }
            if (bVar.getFeedType() == 65285) {
                return 21;
            }
            return -1;
        }
    }

    public BaseFollowViewHolder a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, i, false, 61013, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, i, false, 61013, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        FollowVideoViewHolder followVideoViewHolder = new FollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.q);
        followVideoViewHolder.V = this;
        return followVideoViewHolder;
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 61031, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 61031, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mItems != null) {
            this.mItems.remove(i2);
            if (this.s.isComputingLayout()) {
                this.s.post(new a(this, i2));
            } else {
                c(i2);
            }
            this.j.a(500);
        }
    }

    public BaseForwardViewHolder c(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, i, false, 61014, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, i, false, 61014, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        ForwardImageViewHolder forwardImageViewHolder = new ForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.m, this.o);
        return forwardImageViewHolder;
    }

    public final void d(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, i, false, 61043, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, i, false, 61043, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder f2 = f(aweme);
        if (f2 != null && (f2 instanceof BaseFollowViewHolder)) {
            ((BaseFollowViewHolder) f2).b(aweme2);
        }
    }

    public final void a(ad adVar) {
        ad adVar2 = adVar;
        if (PatchProxy.isSupport(new Object[]{adVar2}, this, i, false, 61044, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar2}, this, i, false, 61044, new Class[]{ad.class}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder f2 = f(adVar2.f45279b);
        if (f2 != null && (f2 instanceof w)) {
            w wVar = (w) f2;
            wVar.a(adVar2.f45279b.getStatus(), adVar2.f45278a.labelPrivate);
            wVar.L();
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 61047, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 61047, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str);
            if (b2 != null) {
                a(c2).getAweme().setUserDigg(b2.getUserDigg());
                a(c2).getAweme().setStatistics(b2.getStatistics());
                RecyclerView.ViewHolder f2 = f(b2);
                if (f2 != null && (f2 instanceof w)) {
                    ((w) f2).G();
                }
            }
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 61032, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 61032, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.mItems.size() == 0) {
                notifyDataSetChanged();
            } else {
                notifyItemRemoved(i2);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("FeedAdapter_NotifyRemove_Crash", e2);
        }
    }

    public void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, i, false, 61033, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, i, false, 61033, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        Pair a2 = di.a(this.s);
        for (int intValue = ((Integer) a2.first).intValue(); intValue <= ((Integer) a2.second).intValue(); intValue++) {
            if (intValue >= 0 && intValue < getData().size() && ((b) getData().get(intValue)).getFeedType() == 65280) {
                Aweme aweme2 = ((b) getData().get(intValue)).getAweme();
                if (!(aweme2 == null || aweme2.getAid() == null || aweme2.getAid().equals(aweme.getAid()))) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(intValue);
                    if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof FollowVideoViewHolder)) {
                        FollowVideoViewHolder followVideoViewHolder = (FollowVideoViewHolder) findViewHolderForAdapterPosition;
                        if (followVideoViewHolder.C) {
                            followVideoViewHolder.ae();
                        }
                    }
                    if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof ForwardVideoViewHolder)) {
                        ForwardVideoViewHolder forwardVideoViewHolder = (ForwardVideoViewHolder) findViewHolderForAdapterPosition;
                        if (forwardVideoViewHolder.g) {
                            ((k) forwardVideoViewHolder.n).m();
                        }
                    }
                }
            }
        }
    }

    public FeedAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar) {
        this(recyclerView, dVar, null);
    }

    private void a(b bVar, int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i2)}, this, i, false, 61041, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i2)}, this, i, false, 61041, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
        } else if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    if (i2 >= 0) {
                        i4 = i2;
                    } else {
                        i4 = statistics.getCommentCount() + 1;
                    }
                    statistics.setCommentCount(i4);
                } else {
                    statistics = new AwemeStatistics();
                    if (i2 >= 0) {
                        i3 = i2;
                    } else {
                        i3 = 1;
                    }
                    statistics.setCommentCount(i3);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 61017, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 61017, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i2) {
            case SearchJediMixFeedAdapter.f42514c:
                return a(viewGroup);
            case 17:
                return b(viewGroup);
            case 18:
                return d(viewGroup);
            case 19:
                return c(viewGroup);
            case 20:
                return f(viewGroup);
            case 21:
                return new FlowFeedArticleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ud, viewGroup, false), this.n);
            case 22:
                return e(viewGroup);
            case 23:
                return new FavoriteTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u6, viewGroup, false));
            default:
                if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, i, false, 61018, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
                    return new RecyclerView.ViewHolder(new View(viewGroup.getContext())) {
                    };
                }
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, i, false, 61018, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        b bVar;
        List arrayList;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 61011, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 61011, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar2 = (b) this.mItems.get(i3);
        int i4 = i3 + 1;
        List list = null;
        if (i4 < this.mItems.size()) {
            bVar = (b) this.mItems.get(i4);
        } else {
            bVar = null;
        }
        switch (getBasicItemViewType(i3)) {
            case SearchJediMixFeedAdapter.f42514c:
            case 17:
                BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) viewHolder;
                baseFollowViewHolder.u = this.t;
                baseFollowViewHolder.s = this.x;
                baseFollowViewHolder.t = "list";
                baseFollowViewHolder.r = this.u;
                baseFollowViewHolder.a(bVar2, bVar);
                if (j()) {
                    baseFollowViewHolder.E = d(i3);
                }
                baseFollowViewHolder.a(((b) this.mItems.get(i3)).getAweme(), ((b) this.mItems.get(i3)).getCommentList(), ((b) this.mItems.get(i3)).getLikeList(), this.m);
                if (!TextUtils.isEmpty(this.w)) {
                    baseFollowViewHolder.I = this.w;
                    return;
                }
                break;
            case 18:
            case 19:
            case 20:
                if (((b) this.mItems.get(i3)).getAweme() != null) {
                    BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) viewHolder;
                    baseForwardViewHolder.a(bVar2, bVar);
                    Aweme aweme = ((b) this.mItems.get(i3)).getAweme();
                    if (this.mItems.get(i3) != null) {
                        arrayList = ((b) this.mItems.get(i3)).getCommentList();
                    } else {
                        arrayList = new ArrayList();
                    }
                    List list2 = arrayList;
                    if (this.mItems.get(i3) != null) {
                        list = ((b) this.mItems.get(i3)).getLikeList();
                    }
                    baseForwardViewHolder.a(aweme, list2, list, this.u, this.v);
                    return;
                }
                break;
            case 21:
                if (((b) this.mItems.get(i3)).getArticleList() != null) {
                    FlowFeedArticleViewHolder flowFeedArticleViewHolder = (FlowFeedArticleViewHolder) viewHolder;
                    List articleList = ((b) this.mItems.get(i3)).getArticleList();
                    if (PatchProxy.isSupport(new Object[]{articleList}, flowFeedArticleViewHolder, FlowFeedArticleViewHolder.f57523a, false, 62154, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{articleList}, flowFeedArticleViewHolder, FlowFeedArticleViewHolder.f57523a, false, 62154, new Class[]{List.class}, Void.TYPE);
                        break;
                    } else {
                        if (articleList != null) {
                            flowFeedArticleViewHolder.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(flowFeedArticleViewHolder.itemView.getContext()));
                            flowFeedArticleViewHolder.f57524b = new FlowFeedArticleAdapter(flowFeedArticleViewHolder.f57525c);
                            flowFeedArticleViewHolder.f57524b.setData(articleList);
                            flowFeedArticleViewHolder.f57524b.setShowFooter(false);
                            flowFeedArticleViewHolder.mRecyclerView.setAdapter(flowFeedArticleViewHolder.f57524b);
                            flowFeedArticleViewHolder.mRecyclerView.setFocusable(false);
                        }
                        return;
                    }
                }
                break;
            case 22:
                ((FavoriteVideoViewHolder) viewHolder).a((FollowFeed) this.mItems.get(i3), this.y);
                return;
            case 23:
                ((FavoriteTitleViewHolder) viewHolder).a((FollowFeed) this.mItems.get(i3), this.y);
                break;
        }
    }

    public final void b(String str, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{str, comment}, this, i, false, 61048, new Class[]{String.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, comment}, this, i, false, 61048, new Class[]{String.class, Comment.class}, Void.TYPE);
            return;
        }
        int c2 = c(str);
        if (c2 >= 0) {
            a(c2).addComment(comment);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
            if (findViewHolderForAdapterPosition instanceof w) {
                ((w) findViewHolderForAdapterPosition).d(0);
            }
        }
    }

    public FeedAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar, g gVar) {
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.s = recyclerView;
        this.j = new l(recyclerView, gVar, this);
        this.q = dVar;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61009, new Class[0], Void.TYPE);
            return;
        }
        this.f57063f = (i) ServiceManager.get().getService(i.class);
        if (this.f57063f != null) {
            this.f57063f.b().observe((LifecycleOwner) v.a(this.s.getContext()), this);
        }
    }
}
