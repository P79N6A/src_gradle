package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import android.support.v7.util.DiffUtil;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.widget.a;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.arch.SingleTypeWidgetListAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.SearchUserListWidget;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.SearchUserWidgetViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/SingleTypeWidgetListAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Lcom/bytedance/widget/WidgetManager;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "createItemWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "viewType", "", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserAdapter extends SingleTypeWidgetListAdapter<SearchUser> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48974f;

    @NotNull
    public final ItemWidgetViewHolder<SearchUser> a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f48974f, false, 46742, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class)) {
            return (ItemWidgetViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f48974f, false, 46742, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new SearchUserWidgetViewHolder<>(viewGroup2);
    }

    @NotNull
    public final ItemWidget<SearchUser, ? extends ItemWidgetViewHolder<SearchUser>> b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48974f, false, 46741, new Class[]{Integer.TYPE}, ItemWidget.class)) {
            return new SearchUserListWidget<>();
        }
        return (ItemWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48974f, false, 46741, new Class[]{Integer.TYPE}, ItemWidget.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchUserAdapter(@NotNull a aVar, @Nullable e.b bVar) {
        super(aVar, (DiffUtil.ItemCallback) new SearchUserDiffer(), bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
    }

    public /* synthetic */ SearchUserAdapter(a aVar, e.b bVar, int i) {
        this(aVar, null);
    }
}
