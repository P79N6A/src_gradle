package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchSuggestFirstItemHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "mDividerLine", "bind", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchSuggestFirstItemHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41897a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f41898c = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final SearchSquareAdapter<?> f41899b;

    /* renamed from: d  reason: collision with root package name */
    private View f41900d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchSuggestFirstItemHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSuggestFirstItemHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41901a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f41897a, false, 35914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41897a, false, 35914, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.c()) {
            this.f41900d.setAlpha(0.12f);
        } else {
            this.f41900d.setAlpha(0.2f);
        }
        SearchSquareAdapter<?> searchSquareAdapter = this.f41899b;
        if (PatchProxy.isSupport(new Object[0], searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35880, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35880, new Class[0], Integer.TYPE)).intValue();
        } else {
            i = searchSquareAdapter.a().a().size();
        }
        if (i > 0) {
            this.f41900d.setVisibility(0);
        } else {
            this.f41900d.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSuggestFirstItemHolder(@NotNull View view, @NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
        this.f41899b = searchSquareAdapter;
        View findViewById = view.findViewById(C0906R.id.bbx);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…line_upper_suggest_first)");
        this.f41900d = findViewById;
    }
}
