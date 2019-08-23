package com.ss.android.ugc.aweme.story.profile.view;

import android.arch.lifecycle.Observer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.profile.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.e;
import com.ss.android.ugc.aweme.story.base.adapter.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "Lcom/ss/android/ugc/aweme/story/base/adapter/RecyclerHeaderViewAdapter;", "Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "(Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;)V", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "", "onChanged", "kvData", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryAdapter extends RecyclerHeaderViewAdapter<LifeStoryItem> implements Observer<a> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f73314f;
    private User g;

    public AllStoryAdapter(@NotNull DataCenter dataCenter) {
        Intrinsics.checkParameterIsNotNull(dataCenter, "dataCenter");
        dataCenter.a(j.f61548a, (Observer<a>) this);
        this.g = (User) dataCenter.a(j.f61548a);
        setLoadEmptyTextResId(C0906R.string.k9);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f73314f
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r3 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 84917(0x14bb5, float:1.18994E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0038
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f73314f
            r13 = 0
            r14 = 84917(0x14bb5, float:1.18994E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r0 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0038:
            r1 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = r0.f34376a
            goto L_0x003f
        L_0x003e:
            r2 = r1
        L_0x003f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = com.ss.android.ugc.aweme.profile.j.f61548a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r0.a()
            r1 = r0
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
        L_0x0054:
            r0 = r17
            r0.g = r1
            goto L_0x005b
        L_0x0059:
            r0 = r17
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryAdapter.onChanged(java.lang.Object):void");
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f73314f, false, 84915, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f73314f, false, 84915, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof AllStoryImageViewHolder) {
            ((AllStoryImageViewHolder) viewHolder2).b(true);
        }
    }

    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f73314f, false, 84916, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f73314f, false, 84916, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof AllStoryImageViewHolder) {
            AllStoryImageViewHolder allStoryImageViewHolder = (AllStoryImageViewHolder) viewHolder2;
            allStoryImageViewHolder.b(false);
            allStoryImageViewHolder.d();
        }
    }

    public final void onBindBasicViewHolder(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        b bVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f73314f, false, 84913, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f73314f, false, 84913, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LifeStoryItem lifeStoryItem = (LifeStoryItem) this.mItems.get(i2);
        e eVar = new e();
        if (lifeStoryItem != null) {
            j = lifeStoryItem.getDate();
        } else {
            j = 0;
        }
        eVar.setDate(j);
        Iterable<LifeStoryItem> a2 = com.ss.android.ugc.aweme.story.profile.a.a.a(i2, this.mItems);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        for (LifeStoryItem awemeWithComment : a2) {
            arrayList.add(awemeWithComment.getAwemeWithComment());
        }
        eVar.setStoryList((List) arrayList);
        if (viewHolder != null) {
            AllStoryImageViewHolder allStoryImageViewHolder = (AllStoryImageViewHolder) viewHolder;
            if (lifeStoryItem != null) {
                bVar = lifeStoryItem.getAwemeWithComment();
            } else {
                bVar = null;
            }
            if (PatchProxy.isSupport(new Object[]{bVar, eVar}, allStoryImageViewHolder, AllStoryImageViewHolder.f73315a, false, 84918, new Class[]{b.class, e.class}, Void.TYPE)) {
                AllStoryImageViewHolder allStoryImageViewHolder2 = allStoryImageViewHolder;
                PatchProxy.accessDispatch(new Object[]{bVar, eVar}, allStoryImageViewHolder2, AllStoryImageViewHolder.f73315a, false, 84918, new Class[]{b.class, e.class}, Void.TYPE);
                return;
            }
            allStoryImageViewHolder.f73320f = bVar;
            allStoryImageViewHolder.a();
            allStoryImageViewHolder.f73318d = new AllStoryImageViewHolder.c(allStoryImageViewHolder, bVar, eVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder");
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@Nullable ViewGroup viewGroup, int i) {
        AllStoryImageViewHolder allStoryImageViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f73314f, false, 84914, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f73314f, false, 84914, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        AllStoryImageViewHolder.b bVar = AllStoryImageViewHolder.h;
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        User user = this.g;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, user}, bVar, AllStoryImageViewHolder.b.f73324a, false, 84927, new Class[]{ViewGroup.class, User.class}, AllStoryImageViewHolder.class)) {
            Object[] objArr = {viewGroup2, user};
            AllStoryImageViewHolder.b bVar2 = bVar;
            allStoryImageViewHolder = (AllStoryImageViewHolder) PatchProxy.accessDispatch(objArr, bVar2, AllStoryImageViewHolder.b.f73324a, false, 84927, new Class[]{ViewGroup.class, User.class}, AllStoryImageViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqa, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            allStoryImageViewHolder = new AllStoryImageViewHolder(inflate, user);
        }
        return allStoryImageViewHolder;
    }
}
