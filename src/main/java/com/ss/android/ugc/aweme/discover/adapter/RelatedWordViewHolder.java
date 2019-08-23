package com.ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.a.c;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/RelatedWordViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/BaseWordViewHolder;", "Lcom/ss/android/ugc/aweme/discover/model/RelatedSearchWordItem;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mRecommendWordMob", "Lcom/ss/android/ugc/aweme/discover/model/suggest/RecommendWordMob;", "mSearchResultParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "bind", "", "mixFeed", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "param", "bindRealData", "list", "", "checkPlaceHolder", "", "initDifferenceView", "mobShowEvent", "mobShowEventByItem", "item", "position", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelatedWordViewHolder extends BaseWordViewHolder<RelatedSearchWordItem> {
    public static ChangeQuickRedirect h;
    public static final a k = new a((byte) 0);
    public RecommendWordMob i;
    public SearchResultParam j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/RelatedWordViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/RelatedWordViewHolder;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41769a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/RelatedWordViewHolder$bindRealData$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/RelatedSearchWordItem;", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.widget.flowlayout.a<RelatedSearchWordItem> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelatedWordViewHolder f41771b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f41772c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/RelatedWordViewHolder$bindRealData$1$getView$1", "Lcom/ss/android/ugc/aweme/discover/ui/OnSearchItemTouchAnimListener;", "onAction", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends ai {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41773a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f41774b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RelatedSearchWordItem f41775c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f41776d;

            public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                String str;
                String str2;
                String str3;
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41773a, false, 35768, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41773a, false, 35768, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                r.a("related_search_keywords", (Map) d.a().a("action_type", "click").a("search_keyword", this.f41775c.relatedWord).a("order", this.f41776d + 1).a("enter_from", "general_search").f34114b);
                c a2 = new com.ss.android.ugc.aweme.discover.mob.a.b().a(this.f41775c.word);
                d a3 = d.a().a("search_id", e.a().a(3));
                RecommendWordMob recommendWordMob = this.f41774b.f41771b.i;
                String str4 = null;
                if (recommendWordMob != null) {
                    str = recommendWordMob.getQueryId();
                } else {
                    str = null;
                }
                d a4 = a3.a("query_id", str);
                SearchResultParam searchResultParam = this.f41774b.f41771b.j;
                if (searchResultParam != null) {
                    str2 = searchResultParam.getKeyword();
                } else {
                    str2 = null;
                }
                d a5 = a4.a("query", str2).a("rank", this.f41774b.f41771b.getAdapterPosition());
                SearchResultParam searchResultParam2 = this.f41774b.f41771b.j;
                if (searchResultParam2 != null) {
                    str3 = searchResultParam2.getEnterFrom();
                } else {
                    str3 = null;
                }
                d a6 = a5.a("source", str3);
                RecommendWordMob recommendWordMob2 = this.f41774b.f41771b.i;
                if (recommendWordMob2 != null) {
                    str4 = recommendWordMob2.getInfo();
                }
                a2.a(a6.a("info", str4).f34114b).e();
                SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(4).setKeyword(this.f41775c.relatedWord).setEnterFrom("related_search_keyword");
                Intrinsics.checkExpressionValueIsNotNull(enterFrom, "param");
                bg.a(new com.ss.android.ugc.aweme.discover.a.b(enterFrom));
            }

            a(b bVar, RelatedSearchWordItem relatedSearchWordItem, int i) {
                this.f41774b = bVar;
                this.f41775c = relatedSearchWordItem;
                this.f41776d = i;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RelatedWordViewHolder relatedWordViewHolder, List list, List list2) {
            super(list2);
            this.f41771b = relatedWordViewHolder;
            this.f41772c = list;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), relatedSearchWordItem}, this, f41770a, false, 35767, new Class[]{FlowLayout.class, Integer.TYPE, RelatedSearchWordItem.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), relatedSearchWordItem}, this, f41770a, false, 35767, new Class[]{FlowLayout.class, Integer.TYPE, RelatedSearchWordItem.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(relatedSearchWordItem, "item");
            View view = this.f41771b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.vq, flowLayout2, false);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.dcz);
            Intrinsics.checkExpressionValueIsNotNull(textView, "word");
            textView.setText(relatedSearchWordItem.relatedWord);
            inflate.setOnTouchListener(new a(this, relatedSearchWordItem, i));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
            return inflate;
        }
    }

    public final boolean b(@NotNull List<? extends RelatedSearchWordItem> list) {
        List<? extends RelatedSearchWordItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, h, false, 35761, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2}, this, h, false, 35761, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
        return false;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35764, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        com.ss.android.ugc.aweme.discover.mob.a.a aVar = new com.ss.android.ugc.aweme.discover.mob.a.a();
        TagFlowLayout tagFlowLayout = this.f41550d;
        Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "mTagGroup");
        com.ss.android.ugc.aweme.discover.mob.a.a a2 = aVar.a(Integer.valueOf(tagFlowLayout.getVisibleViewCount()));
        RecommendWordMob recommendWordMob = this.i;
        String str5 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getWordsSource();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.discover.mob.a.a a3 = a2.a(str);
        d a4 = d.a().a("search_id", e.a().a(3));
        RecommendWordMob recommendWordMob2 = this.i;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getQueryId();
        } else {
            str2 = null;
        }
        d a5 = a4.a("query_id", str2);
        SearchResultParam searchResultParam = this.j;
        if (searchResultParam != null) {
            str3 = searchResultParam.getKeyword();
        } else {
            str3 = null;
        }
        d a6 = a5.a("query", str3).a("rank", getAdapterPosition());
        SearchResultParam searchResultParam2 = this.j;
        if (searchResultParam2 != null) {
            str4 = searchResultParam2.getEnterFrom();
        } else {
            str4 = null;
        }
        d a7 = a6.a("source", str4);
        RecommendWordMob recommendWordMob3 = this.i;
        if (recommendWordMob3 != null) {
            str5 = recommendWordMob3.getInfo();
        }
        a3.a(a7.a("info", str5).f34114b).e();
    }

    public final void c(@NotNull List<? extends RelatedSearchWordItem> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 35763, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 35763, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.g = list;
        TagFlowLayout tagFlowLayout = this.f41550d;
        Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "mTagGroup");
        tagFlowLayout.setAdapter(new b(this, list, list));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelatedWordViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35760, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f41548b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mTitle");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        textView.setText(view2.getResources().getString(C0906R.string.byw));
        View view3 = this.f41552f;
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        view3.setBackgroundColor(view4.getResources().getColor(C0906R.color.zk));
        View view5 = this.f41552f;
        Intrinsics.checkExpressionValueIsNotNull(view5, "mDecoration");
        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            layoutParams2.setMargins(0, (int) UIUtils.dip2Px(view6.getContext(), 24.0f), 0, 0);
            View view7 = this.f41552f;
            Intrinsics.checkExpressionValueIsNotNull(view7, "mDecoration");
            view7.setLayoutParams(layoutParams2);
            v.a(this.f41551e, 8);
            v.a(this.f41549c, 8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        String str;
        String str2;
        String str3;
        RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) obj;
        if (PatchProxy.isSupport(new Object[]{relatedSearchWordItem, Integer.valueOf(i2)}, this, h, false, 35765, new Class[]{RelatedSearchWordItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relatedSearchWordItem, Integer.valueOf(i2)}, this, h, false, 35765, new Class[]{RelatedSearchWordItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(relatedSearchWordItem, "item");
        r.a("related_search_keywords", (Map) d.a().a("action_type", "show").a("search_keyword", relatedSearchWordItem.relatedWord).a("order", i2 + 1).a("enter_from", "general_search").f34114b);
        String str4 = null;
        c a2 = new c(null, 1).a(relatedSearchWordItem.word);
        d a3 = d.a().a("search_id", e.a().a(3));
        RecommendWordMob recommendWordMob = this.i;
        if (recommendWordMob != null) {
            str = recommendWordMob.getQueryId();
        } else {
            str = null;
        }
        d a4 = a3.a("query_id", str);
        SearchResultParam searchResultParam = this.j;
        if (searchResultParam != null) {
            str2 = searchResultParam.getKeyword();
        } else {
            str2 = null;
        }
        d a5 = a4.a("query", str2).a("rank", getAdapterPosition());
        SearchResultParam searchResultParam2 = this.j;
        if (searchResultParam2 != null) {
            str3 = searchResultParam2.getEnterFrom();
        } else {
            str3 = null;
        }
        d a6 = a5.a("source", str3);
        RecommendWordMob recommendWordMob2 = this.i;
        if (recommendWordMob2 != null) {
            str4 = recommendWordMob2.getInfo();
        }
        a2.a(a6.a("info", str4).f34114b).e();
    }
}
