package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0019B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J4\u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "mSubDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate;", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "SubSuggestDelegate", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42258a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final SearchSquareAdapter<?> f42259b;

    /* renamed from: c  reason: collision with root package name */
    private a f42260c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J4\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate;", "", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "getSearchSuggestOrder", "", "item", "onBindViewHolder", "", "items", "", "position", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f42261b;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public static final String f42262d;

        /* renamed from: e  reason: collision with root package name */
        public static final C0538a f42263e;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final SearchSquareAdapter<?> f42264c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate$Companion;", "", "()V", "TAG", "", "TAG$annotations", "getTAG", "()Ljava/lang/String;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.discover.delegate.a.h$a$a  reason: collision with other inner class name */
        public static final class C0538a {
            private C0538a() {
            }

            public /* synthetic */ C0538a(byte b2) {
                this();
            }
        }

        @NotNull
        public abstract RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup);

        public abstract void a(@NotNull List<? extends Object> list, int i, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<Object> list2);

        static {
            C0538a aVar = new C0538a((byte) 0);
            f42263e = aVar;
            String simpleName = aVar.getClass().getSimpleName();
            if (simpleName == null) {
                Intrinsics.throwNpe();
            }
            f42262d = simpleName;
        }

        public a(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
            Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
            this.f42264c = searchSquareAdapter;
        }

        public final int a(@NotNull Object obj) {
            ArrayList arrayList;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f42261b, false, 36261, new Class[]{Object.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{obj2}, this, f42261b, false, 36261, new Class[]{Object.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(obj2, "item");
            SearchSquareAdapter<?> searchSquareAdapter = this.f42264c;
            if (PatchProxy.isSupport(new Object[0], searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35881, new Class[0], ArrayList.class)) {
                arrayList = (ArrayList) PatchProxy.accessDispatch(new Object[0], searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35881, new Class[0], ArrayList.class);
            } else {
                arrayList = searchSquareAdapter.a().b();
            }
            Collection collection = arrayList;
            if (CollectionUtils.isEmpty(collection)) {
                return -1;
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(obj2, arrayList.get(i))) {
                    return i;
                }
            }
            return -1;
        }
    }

    public h(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
        this.f42259b = searchSquareAdapter;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42258a, false, 36259, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42258a, false, 36259, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        a aVar = this.f42260c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubDelegate");
        }
        return aVar.a(viewGroup2);
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42258a, false, 36258, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42258a, false, 36258, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        Object obj2 = list.get(i);
        if (obj2 instanceof SuggestUser) {
            this.f42260c = new j(this.f42259b);
            return true;
        } else if (obj2 instanceof SuggestMusic) {
            this.f42260c = new g(this.f42259b);
            return true;
        } else if (!(obj2 instanceof SuggestChallenge)) {
            return false;
        } else {
            this.f42260c = new c(this.f42259b);
            return true;
        }
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42258a, false, 36260, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42258a, false, 36260, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        a aVar = this.f42260c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubDelegate");
        }
        aVar.a(list3, i, viewHolder2, list2);
    }
}
