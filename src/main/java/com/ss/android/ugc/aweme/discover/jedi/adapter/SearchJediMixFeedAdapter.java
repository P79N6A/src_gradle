package com.ss.android.ugc.aweme.discover.jedi.adapter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.ext.list.differ.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchCustomViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.adapter.RecommendCellBViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010&\u001a\u00020\u001d2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019H\u0016J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0007J\u0018\u0010*\u001a\u00020\u001d2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019H\u0016R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/adapter/SearchJediMixFeedAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "mAwemeClickListener", "Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;", "(Landroid/support/v7/widget/RecyclerView;Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;)V", "isEmpty", "", "()Z", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "findAwemePosition", "", "awemeId", "", "getBasicItemViewType", "position", "getCurrentList", "", "getItem", "getItemCount", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "setData", "list", "setKeyword", "param", "submitList", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchJediMixFeedAdapter extends BaseAdapter<com.ss.android.ugc.aweme.discover.mixfeed.a> implements com.bytedance.jedi.arch.ext.list.a<com.ss.android.ugc.aweme.discover.mixfeed.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42513a = null;

    /* renamed from: c  reason: collision with root package name */
    public static final int f42514c = 16;

    /* renamed from: d  reason: collision with root package name */
    public static final int f42515d = 96;

    /* renamed from: e  reason: collision with root package name */
    public static final int f42516e = f42516e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f42517f = f42517f;
    public static final int g = g;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SearchResultParam f42518b;
    @NotNull
    private final b<com.ss.android.ugc.aweme.discover.mixfeed.a> i = new b<>(this, new Differ(), null, 4);
    private final RecyclerView j;
    private d k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/adapter/SearchJediMixFeedAdapter$Companion;", "", "()V", "TYPE_CUSTOM_VIEW", "", "getTYPE_CUSTOM_VIEW", "()I", "TYPE_SEARCH_CHALLENGE", "getTYPE_SEARCH_CHALLENGE", "TYPE_SEARCH_MUSIC", "getTYPE_SEARCH_MUSIC", "TYPE_SEARCH_USER", "getTYPE_SEARCH_USER", "TYPE_VIDEO", "getTYPE_VIDEO", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(@Nullable List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
    }

    @NotNull
    public final b<com.ss.android.ugc.aweme.discover.mixfeed.a> a() {
        return this.i;
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42513a, false, 36724, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42513a, false, 36724, new Class[0], Integer.TYPE)).intValue();
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f42513a, false, 36729, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f42513a, false, 36729, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof AnimatedViewHolder) {
            ((AnimatedViewHolder) viewHolder2).a(true);
        }
        if (viewHolder2 instanceof RecommendCellBViewHolder) {
            ((RecommendCellBViewHolder) viewHolder2).m();
        }
    }

    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f42513a, false, 36730, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f42513a, false, 36730, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof AnimatedViewHolder) {
            ((AnimatedViewHolder) viewHolder2).a(false);
        }
    }

    public final void setData(@Nullable List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
        List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f42513a, false, 36728, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42513a, false, 36728, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(list);
        if (list == null) {
            list2 = new ArrayList<>();
            setShowFooter(false);
        } else {
            list2 = list;
        }
        this.mItems = list2;
        notifyDataSetChanged();
    }

    public final int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42513a, false, 36727, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42513a, false, 36727, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.discover.mixfeed.a aVar = (com.ss.android.ugc.aweme.discover.mixfeed.a) this.mItems.get(i2);
        Intrinsics.checkExpressionValueIsNotNull(aVar, "flowFeed");
        if (aVar.getFeedType() == 65280) {
            return f42514c;
        }
        if (aVar.getFeedType() == 65456) {
            return f42517f;
        }
        if (aVar.getFeedType() == 65457) {
            return f42516e;
        }
        if (aVar.getFeedType() == 65465) {
            return g;
        }
        if (aVar.getFeedType() == 65458) {
            return f42515d;
        }
        return -1;
    }

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f42513a, false, 36725, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f42513a, false, 36725, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        com.ss.android.ugc.aweme.discover.mixfeed.a aVar = (com.ss.android.ugc.aweme.discover.mixfeed.a) this.mItems.get(i3);
        int basicItemViewType = getBasicItemViewType(i3);
        if (basicItemViewType == f42515d) {
            SearchMixUserData searchMixUserData = new SearchMixUserData();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mixFeed");
            SearchMixUserData hasTopUser = searchMixUserData.setUsers(aVar.f42543d).setHasTopUser(aVar.g);
            Intrinsics.checkExpressionValueIsNotNull(hasTopUser, "searchMixUserData");
            hasTopUser.setAd(aVar.q);
            ((SearchMixUserViewHolder) viewHolder2).a(hasTopUser, this.f42518b, aVar.p);
        } else if (basicItemViewType == f42516e) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mixFeed");
            ((SearchMixMusicViewHolder) viewHolder2).a(aVar.f42544e, this.f42518b, aVar.p);
        } else if (basicItemViewType == f42517f) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mixFeed");
            ((SearchMixChallengeViewHolder) viewHolder2).a(aVar.f42545f, this.f42518b, aVar.p);
        } else if (basicItemViewType == f42514c) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mixFeed");
            ((RecommendCellBViewHolder) viewHolder2).a(aVar.getAweme(), i3, true);
        } else if (basicItemViewType == g) {
            SearchCustomViewHolder searchCustomViewHolder = (SearchCustomViewHolder) viewHolder2;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mixFeed");
            String str = aVar.f42541b;
            Intrinsics.checkExpressionValueIsNotNull(str, "mixFeed.customContent");
            if (PatchProxy.isSupport(new Object[]{str}, searchCustomViewHolder, SearchCustomViewHolder.f42585c, false, 36892, new Class[]{String.class}, Void.TYPE)) {
                SearchCustomViewHolder searchCustomViewHolder2 = searchCustomViewHolder;
                PatchProxy.accessDispatch(new Object[]{str}, searchCustomViewHolder2, SearchCustomViewHolder.f42585c, false, 36892, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
            DmtTextView dmtTextView = searchCustomViewHolder.f42587d;
            if (dmtTextView != null) {
                dmtTextView.setText(str);
            }
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        SearchCustomViewHolder searchCustomViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f42513a, false, 36726, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f42513a, false, 36726, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        if (i3 == f42515d) {
            SearchMixUserViewHolder a2 = SearchMixUserViewHolder.a(viewGroup);
            Intrinsics.checkExpressionValueIsNotNull(a2, "SearchMixUserViewHolder.create(parent)");
            return a2;
        } else if (i3 == f42516e) {
            SearchMixMusicViewHolder a3 = SearchMixMusicViewHolder.a(viewGroup);
            Intrinsics.checkExpressionValueIsNotNull(a3, "SearchMixMusicViewHolder.create(parent)");
            return a3;
        } else if (i3 == f42517f) {
            SearchMixChallengeViewHolder a4 = SearchMixChallengeViewHolder.a(viewGroup);
            Intrinsics.checkExpressionValueIsNotNull(a4, "SearchMixChallengeViewHolder.create(parent)");
            return a4;
        } else if (i3 == g) {
            SearchCustomViewHolder.a aVar = SearchCustomViewHolder.f42586e;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar, SearchCustomViewHolder.a.f42588a, false, 36893, new Class[]{ViewGroup.class}, SearchCustomViewHolder.class)) {
                SearchCustomViewHolder.a aVar2 = aVar;
                searchCustomViewHolder = (SearchCustomViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar2, SearchCustomViewHolder.a.f42588a, false, 36893, new Class[]{ViewGroup.class}, SearchCustomViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a89, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                searchCustomViewHolder = new SearchCustomViewHolder(inflate);
            }
            return searchCustomViewHolder;
        } else if (i3 == f42514c) {
            RecommendCellBViewHolder recommendCellBViewHolder = new RecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zb, viewGroup2, false), "", this.k, true);
            recommendCellBViewHolder.k = true;
            return recommendCellBViewHolder;
        } else {
            return new SearchJediMixFeedAdapter$onCreateBasicViewHolder$1(viewGroup2, new View(viewGroup.getContext()));
        }
    }

    public SearchJediMixFeedAdapter(@NotNull RecyclerView recyclerView, @Nullable SearchResultParam searchResultParam, @NotNull d dVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "mRecyclerView");
        Intrinsics.checkParameterIsNotNull(dVar, "mAwemeClickListener");
        this.j = recyclerView;
        this.f42518b = searchResultParam;
        this.k = dVar;
        this.spanSizeLookup = new GridLayoutManager.SpanSizeLookup(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42519a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchJediMixFeedAdapter f42520b;

            /* renamed from: c  reason: collision with root package name */
            private final int f42521c = 1;

            /* renamed from: d  reason: collision with root package name */
            private final int f42522d = 2;

            {
                this.f42520b = r1;
            }

            public final int getSpanSize(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42519a, false, 36731, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42519a, false, 36731, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else if (this.f42520b.getBasicItemViewType(i) == SearchJediMixFeedAdapter.f42514c) {
                    return this.f42521c;
                } else {
                    return this.f42522d;
                }
            }
        };
    }
}
