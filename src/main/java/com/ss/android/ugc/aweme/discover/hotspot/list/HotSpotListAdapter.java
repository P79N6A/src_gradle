package com.ss.android.ugc.aweme.discover.hotspot.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.hotspot.list.CenterLayoutManager;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotListDialog;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotViewHolder;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotViewHolder;", "fragment", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;", "(Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;)V", "getFragment", "()Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;", "value", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "clearMob", "", "getItemCount", "", "onBindViewHolder", "viewholder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotListAdapter extends RecyclerView.Adapter<HotSpotViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42451a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public List<HotSearchItem> f42452b = CollectionsKt.emptyList();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final HotSpotListDialog f42453c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListAdapter$onCreateViewHolder$1", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/ItemCallback;", "onClick", "", "item", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "position", "", "view", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListAdapter f42455b;

        a(HotSpotListAdapter hotSpotListAdapter) {
            this.f42455b = hotSpotListAdapter;
        }

        public final void a(@NotNull HotSearchItem hotSearchItem, int i, @NotNull View view) {
            HotSearchItem hotSearchItem2 = hotSearchItem;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{hotSearchItem2, Integer.valueOf(i), view2}, this, f42454a, false, 36597, new Class[]{HotSearchItem.class, Integer.TYPE, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSearchItem2, Integer.valueOf(i), view2}, this, f42454a, false, 36597, new Class[]{HotSearchItem.class, Integer.TYPE, View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSearchItem2, "item");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            HotSpotListDialog hotSpotListDialog = this.f42455b.f42453c;
            if (PatchProxy.isSupport(new Object[]{hotSearchItem2}, hotSpotListDialog, HotSpotListDialog.f42456a, false, 36604, new Class[]{HotSearchItem.class}, Void.TYPE)) {
                HotSpotListDialog hotSpotListDialog2 = hotSpotListDialog;
                PatchProxy.accessDispatch(new Object[]{hotSearchItem2}, hotSpotListDialog2, HotSpotListDialog.f42456a, false, 36604, new Class[]{HotSearchItem.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(hotSearchItem2, "item");
                HotSpotMainViewModel hotSpotMainViewModel = hotSpotListDialog.f42460e;
                String word = hotSearchItem.getWord();
                if (word == null) {
                    word = "";
                }
                HotSpotMainViewModel.a(hotSpotMainViewModel, word, hotSearchItem2, false, 4);
                if (b.f()) {
                    View view3 = hotSpotListDialog.f42459d;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootView");
                    }
                    view3.postDelayed(new HotSpotListDialog.e(hotSpotListDialog), 100);
                }
            }
            HotSpotListDialog hotSpotListDialog3 = this.f42455b.f42453c;
            if (PatchProxy.isSupport(new Object[]{view2}, hotSpotListDialog3, HotSpotListDialog.f42456a, false, 36605, new Class[]{View.class}, Void.TYPE)) {
                HotSpotListDialog hotSpotListDialog4 = hotSpotListDialog3;
                PatchProxy.accessDispatch(new Object[]{view2}, hotSpotListDialog4, HotSpotListDialog.f42456a, false, 36605, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
            if (!b.f()) {
                RecyclerView recyclerView = hotSpotListDialog3.f42457b;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listView");
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                    RecyclerView recyclerView2 = hotSpotListDialog3.f42457b;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("listView");
                    }
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 != null) {
                        int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findFirstCompletelyVisibleItemPosition();
                        RecyclerView recyclerView3 = hotSpotListDialog3.f42457b;
                        if (recyclerView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("listView");
                        }
                        int childAdapterPosition = recyclerView3.getChildAdapterPosition(view2);
                        if (childAdapterPosition > findLastCompletelyVisibleItemPosition || childAdapterPosition < findFirstCompletelyVisibleItemPosition) {
                            RecyclerView recyclerView4 = hotSpotListDialog3.f42457b;
                            if (recyclerView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("listView");
                            }
                            Context context = recyclerView4.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "listView.context");
                            CenterLayoutManager.CenterSmoothScroller centerSmoothScroller = new CenterLayoutManager.CenterSmoothScroller(context);
                            centerSmoothScroller.setTargetPosition(childAdapterPosition);
                            RecyclerView recyclerView5 = hotSpotListDialog3.f42457b;
                            if (recyclerView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("listView");
                            }
                            RecyclerView.LayoutManager layoutManager3 = recyclerView5.getLayoutManager();
                            if (layoutManager3 != null) {
                                ((LinearLayoutManager) layoutManager3).startSmoothScroll(centerSmoothScroller);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42451a, false, 36594, new Class[0], Integer.TYPE)) {
            return this.f42452b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42451a, false, 36594, new Class[0], Integer.TYPE)).intValue();
    }

    public HotSpotListAdapter(@NotNull HotSpotListDialog hotSpotListDialog) {
        Intrinsics.checkParameterIsNotNull(hotSpotListDialog, "fragment");
        this.f42453c = hotSpotListDialog;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        HotSpotViewHolder hotSpotViewHolder = (HotSpotViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{hotSpotViewHolder, Integer.valueOf(i)}, this, f42451a, false, 36595, new Class[]{HotSpotViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSpotViewHolder, Integer.valueOf(i)}, this, f42451a, false, 36595, new Class[]{HotSpotViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hotSpotViewHolder, "viewholder");
        hotSpotViewHolder.a_(this.f42452b.get(i2), i2);
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HotSpotViewHolder hotSpotViewHolder;
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42451a, false, 36593, new Class[]{ViewGroup.class, Integer.TYPE}, HotSpotViewHolder.class)) {
            hotSpotViewHolder = (HotSpotViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42451a, false, 36593, new Class[]{ViewGroup.class, Integer.TYPE}, HotSpotViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            HotSpotViewHolder.a aVar = HotSpotViewHolder.k;
            b aVar2 = new a(this);
            if (PatchProxy.isSupport(new Object[]{viewGroup2, aVar2}, aVar, HotSpotViewHolder.a.f42478a, false, 36621, new Class[]{ViewGroup.class, b.class}, HotSpotViewHolder.class)) {
                HotSpotViewHolder.a aVar3 = aVar;
                hotSpotViewHolder = (HotSpotViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, aVar2}, aVar3, HotSpotViewHolder.a.f42478a, false, 36621, new Class[]{ViewGroup.class, b.class}, HotSpotViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "view");
                Intrinsics.checkParameterIsNotNull(aVar2, "callback");
                if (b.f()) {
                    i2 = C0906R.layout.ada;
                } else {
                    i2 = C0906R.layout.adb;
                }
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "inflate");
                hotSpotViewHolder = new HotSpotViewHolder(inflate, aVar2);
            }
        }
        return hotSpotViewHolder;
    }
}
