package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eH\u0016J\u001a\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0016\u0010*\u001a\u00020\u001e2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0018\u0010,\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020.R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "mAwemes", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "onItemClickListener", "(Ljava/util/List;Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;)V", "getMAwemes", "()Ljava/util/List;", "setMAwemes", "(Ljava/util/List;)V", "mCurrentIndex", "", "getMCurrentIndex", "()I", "setMCurrentIndex", "(I)V", "mDefaultOffset", "getMDefaultOffset", "setMDefaultOffset", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "setOnItemClickListener", "(Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;)V", "getItemCount", "onAttachedToRecyclerView", "", "recyclerView", "onBindViewHolder", "discoverExpandViewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "view", "Landroid/view/View;", "setData", "awemes", "setSelectedPosition", "byClick", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverExpandAdapter extends RecyclerView.Adapter<DiscoverExpandViewHolder> implements DiscoverExpandViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41594a;

    /* renamed from: b  reason: collision with root package name */
    public int f41595b;

    /* renamed from: c  reason: collision with root package name */
    public int f41596c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<? extends Aweme> f41597d = null;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public DiscoverExpandViewHolder.b f41598e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f41599f;

    public final int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f41594a, false, 35563, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41594a, false, 35563, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends Aweme> list = this.f41597d;
        if (list != null) {
            i = list.size();
        }
        return i;
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f41594a, false, 35560, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f41594a, false, 35560, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f41599f = recyclerView2;
    }

    public DiscoverExpandAdapter(@Nullable List<? extends Aweme> list, @Nullable DiscoverExpandViewHolder.b bVar) {
        this.f41598e = bVar;
        this.f41596c = (int) UIUtils.dip2Px(k.a(), 24.0f);
    }

    public final void a(@Nullable View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f41594a, false, 35564, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f41594a, false, 35564, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        DiscoverExpandViewHolder.b bVar = this.f41598e;
        if (bVar != null) {
            bVar.a(view, i);
        }
        if (this.f41595b != i) {
            a(i, true);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        RecyclerView.LayoutManager layoutManager;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41594a, false, 35565, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f41594a, false, 35565, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder viewHolder2 = null;
        if (!z) {
            RecyclerView recyclerView = this.f41599f;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, this.f41596c);
            }
        }
        if (this.f41595b != i) {
            if (this.f41595b < getItemCount()) {
                RecyclerView recyclerView2 = this.f41599f;
                if (recyclerView2 != null) {
                    viewHolder = recyclerView2.findViewHolderForAdapterPosition(this.f41595b);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof DiscoverExpandViewHolder) {
                    ((DiscoverExpandViewHolder) viewHolder).a(false);
                }
            }
            this.f41595b = i;
            if (this.f41595b < getItemCount()) {
                RecyclerView recyclerView3 = this.f41599f;
                if (recyclerView3 != null) {
                    viewHolder2 = recyclerView3.findViewHolderForAdapterPosition(this.f41595b);
                }
                if (viewHolder2 instanceof DiscoverExpandViewHolder) {
                    ((DiscoverExpandViewHolder) viewHolder2).a(true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r16, int r17) {
        /*
            r15 = this;
            r7 = r15
            r8 = r17
            r9 = r16
            com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder r9 = (com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder) r9
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f41594a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder> r1 = com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 35561(0x8ae9, float:4.9832E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f41594a
            r3 = 0
            r4 = 35561(0x8ae9, float:4.9832E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder> r1 = com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004e:
            java.lang.String r0 = "discoverExpandViewHolder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r7.f41597d
            r13 = 0
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            r14 = r0
            goto L_0x0061
        L_0x0060:
            r14 = r13
        L_0x0061:
            int r0 = r7.f41595b
            if (r0 != r8) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.f41600a
            r3 = 0
            r4 = 35567(0x8aef, float:4.984E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.f41600a
            r3 = 0
            r4 = 35567(0x8aef, float:4.984E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00ac:
            r9.a(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f41602b
            if (r14 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.feed.model.Video r1 = r14.getVideo()
            if (r1 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getOriginCover()
            goto L_0x00bf
        L_0x00be:
            r1 = r13
        L_0x00bf:
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f41603c
            if (r14 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.profile.model.User r1 = r14.getAuthor()
            if (r1 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r1.getAvatarThumb()
        L_0x00d0:
            com.ss.android.ugc.aweme.base.c.b(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        DiscoverExpandViewHolder discoverExpandViewHolder;
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41594a, false, 35559, new Class[]{ViewGroup.class, Integer.TYPE}, DiscoverExpandViewHolder.class)) {
            discoverExpandViewHolder = (DiscoverExpandViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41594a, false, 35559, new Class[]{ViewGroup.class, Integer.TYPE}, DiscoverExpandViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
            DiscoverExpandViewHolder.a aVar = DiscoverExpandViewHolder.f41601d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, aVar, DiscoverExpandViewHolder.a.f41608a, false, 35569, new Class[]{ViewGroup.class, Integer.TYPE}, View.class)) {
                DiscoverExpandViewHolder.a aVar2 = aVar;
                inflate = (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, aVar2, DiscoverExpandViewHolder.a.f41608a, false, 35569, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tf, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…pand_view, parent, false)");
            }
            new DiscoverExpandViewHolder(inflate, this);
        }
        return discoverExpandViewHolder;
    }
}
