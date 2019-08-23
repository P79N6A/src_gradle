package com.ss.android.ugc.aweme.discover.delegate.a;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u001e\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J4\u0010\u0016\u001a\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/HotSearchOrGuessWordDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "mGuessWordHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "mHotSearchHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "mNeedRefresh", "", "checkGuessWordList", "item", "checkHotSearchList", "isForViewType", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setGuessWordHandler", "handler", "setHotSearchHandler", "setNeedRefresh", "needRefresh", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42243a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f42244f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ak.a f42245b;

    /* renamed from: c  reason: collision with root package name */
    public ak.b f42246c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42247d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final LifecycleOwner f42248e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/HotSearchOrGuessWordDelegate$Companion;", "", "()V", "TAG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f42248e = lifecycleOwner;
    }

    private final boolean a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f42243a, false, 36229, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f42243a, false, 36229, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null && !CollectionUtils.isEmpty(list) && (list.get(0) instanceof HotSearchItem)) {
            return true;
        }
        return false;
    }

    private final boolean b(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f42243a, false, 36230, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f42243a, false, 36230, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null && !CollectionUtils.isEmpty(list) && (list.get(0) instanceof Word)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        GuessWordsViewHolder guessWordsViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42243a, false, 36232, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42243a, false, 36232, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
            GuessWordsViewHolder.a aVar = GuessWordsViewHolder.k;
            ak.a aVar2 = this.f42245b;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, aVar2}, aVar, GuessWordsViewHolder.a.f41614a, false, 35583, new Class[]{ViewGroup.class, ak.a.class}, GuessWordsViewHolder.class)) {
                GuessWordsViewHolder.a aVar3 = aVar;
                guessWordsViewHolder = (GuessWordsViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, aVar2}, aVar3, GuessWordsViewHolder.a.f41614a, false, 35583, new Class[]{ViewGroup.class, ak.a.class}, GuessWordsViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vp, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                guessWordsViewHolder = new GuessWordsViewHolder(inflate, aVar2);
            }
            return guessWordsViewHolder;
        }
        HotSearchWordViewHolder a2 = HotSearchWordViewHolder.a(viewGroup2, "hot_search_section_search", this.f42246c);
        Intrinsics.checkExpressionValueIsNotNull(a2, "HotSearchWordViewHolder.…     , mHotSearchHandler)");
        return a2;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42243a, false, 36231, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42243a, false, 36231, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        Object obj2 = list.get(i);
        if (a(obj2) || b(obj2)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        int i2 = i;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42243a, false, 36233, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42243a, false, 36233, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (this.f42247d) {
            this.f42247d = false;
            if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
                if (b(list3.get(i2))) {
                    GuessWordsViewHolder guessWordsViewHolder = (GuessWordsViewHolder) viewHolder2;
                    Object obj2 = list3.get(i2);
                    if (obj2 != null) {
                        guessWordsViewHolder.a((List) obj2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
                }
            } else if (a(list3.get(i2))) {
                HotSearchWordViewHolder hotSearchWordViewHolder = (HotSearchWordViewHolder) viewHolder2;
                Object obj3 = list3.get(i2);
                if (obj3 != null) {
                    hotSearchWordViewHolder.a((List) obj3);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.HotSearchItem>");
                }
            }
        }
    }
}
