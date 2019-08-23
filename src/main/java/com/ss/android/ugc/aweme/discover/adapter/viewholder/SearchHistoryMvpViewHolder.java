package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/viewholder/SearchHistoryMvpViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "handler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;)V", "clearHistoryView", "getHandler", "()Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "setHandler", "(Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;)V", "historyTagView", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagFlowLayout;", "bind", "", "histories", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchHistoryMvpViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41981a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f41982e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final View f41983b;

    /* renamed from: c  reason: collision with root package name */
    public final TagFlowLayout f41984c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public ak.c f41985d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/viewholder/SearchHistoryMvpViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/viewholder/SearchHistoryMvpViewHolder;", "parent", "Landroid/view/ViewGroup;", "handler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41986a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/viewholder/SearchHistoryMvpViewHolder$bind$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.widget.flowlayout.a<SearchHistory> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchHistoryMvpViewHolder f41988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f41989c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/viewholder/SearchHistoryMvpViewHolder$bind$1$getView$1", "Lcom/ss/android/ugc/aweme/discover/ui/OnSearchItemTouchAnimListener;", "onAction", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends ai {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41990a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f41991b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ SearchHistory f41992c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f41993d;

            public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41990a, false, 35960, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41990a, false, 35960, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                ak.c cVar = this.f41991b.f41988b.f41985d;
                if (cVar != null) {
                    cVar.a(this.f41992c, this.f41993d);
                }
            }

            a(b bVar, SearchHistory searchHistory, int i) {
                this.f41991b = bVar;
                this.f41992c = searchHistory;
                this.f41993d = i;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchHistoryMvpViewHolder searchHistoryMvpViewHolder, List list, List list2) {
            super(list2);
            this.f41988b = searchHistoryMvpViewHolder;
            this.f41989c = list;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            SearchHistory searchHistory = (SearchHistory) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), searchHistory}, this, f41987a, false, 35959, new Class[]{FlowLayout.class, Integer.TYPE, SearchHistory.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), searchHistory}, this, f41987a, false, 35959, new Class[]{FlowLayout.class, Integer.TYPE, SearchHistory.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(searchHistory, "item");
            View view = this.f41988b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.vq, flowLayout2, false);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.dcz);
            Intrinsics.checkExpressionValueIsNotNull(textView, "word");
            textView.setText(searchHistory.keyword);
            inflate.setOnTouchListener(new a(this, searchHistory, i));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
            return inflate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchHistoryMvpViewHolder f41995b;

        public c(SearchHistoryMvpViewHolder searchHistoryMvpViewHolder) {
            this.f41995b = searchHistoryMvpViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41994a, false, 35961, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41994a, false, 35961, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ak.c cVar = this.f41995b.f41985d;
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHistoryMvpViewHolder(@NotNull View view, @Nullable ak.c cVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f41985d = cVar;
        View findViewById = view.findViewById(C0906R.id.t8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.clear_history)");
        this.f41983b = findViewById;
        View findViewById2 = view.findViewById(C0906R.id.czb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tag_history)");
        this.f41984c = (TagFlowLayout) findViewById2;
    }
}
