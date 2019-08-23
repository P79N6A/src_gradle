package com.bytedance.jedi.ext.adapter.decorator;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.internal.LoadingHolder;
import com.bytedance.jedi.ext.adapter.decorator.internal.a;
import com.bytedance.jedi.ext.adapter.decorator.internal.b;
import com.bytedance.jedi.ext.adapter.decorator.internal.c;
import com.bytedance.jedi.ext.adapter.decorator.internal.d;
import com.bytedance.jedi.ext.adapter.decorator.internal.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001a\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bH\u0002J\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\bH\u0016J(\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\b2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010403H\u0016J\u0018\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u0002072\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u00108\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020*2\u0006\u00101\u001a\u00020\u0002H\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u00101\u001a\u00020\u0002H\u0016J\u0010\u0010;\u001a\u00020-2\u0006\u00101\u001a\u00020\u0002H\u0016J\u0010\u0010<\u001a\u00020-2\u0006\u00101\u001a\u00020\u0002H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0016J\u0017\u0010@\u001a\u00020-2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020-0BH\bJ\u000e\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020EJ\u0014\u0010F\u001a\u00020-2\f\b\u0001\u0010G\u001a\u00020H\"\u00020\bJ\u0010\u0010I\u001a\u00020-2\b\u0010J\u001a\u0004\u0018\u00010KJ\u0010\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020*H\u0016J\u0010\u0010N\u001a\u00020-2\b\u0010O\u001a\u0004\u0018\u00010KJ\u000e\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020*J\u0016\u0010R\u001a\u00020-2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010BJ\u000e\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020*J\u0006\u0010Y\u001a\u00020-J\u0006\u0010Z\u001a\u00020-J\u0006\u0010[\u001a\u00020-J\u0006\u0010\\\u001a\u00020-J\u000e\u0010]\u001a\u00020-2\u0006\u0010^\u001a\u00020*J\u0012\u0010_\u001a\u00020-2\b\b\u0001\u0010`\u001a\u00020\bH\u0002J\b\u0010a\u001a\u00020-H\u0002J\u0010\u0010b\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0016J(\u0010c\u001a\u00020-*\u00020d2\b\u0010e\u001a\u0004\u0018\u00010K2\b\u0010f\u001a\u0004\u0018\u00010K2\u0006\u0010'\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\n¨\u0006g"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/RawAdapterDecorator;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "realAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "emptyDelegate", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/EmptyDelegate;", "footerCount", "", "getFooterCount", "()I", "footerDelegate", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/FooterDelegate;", "headerCount", "getHeaderCount", "headerDelegate", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/HeaderDelegate;", "innerTypes", "", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "[Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "loadingCount", "getLoadingCount", "loadingDelegate", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/LoadingDelegate;", "mappingDataObserver", "com/bytedance/jedi/ext/adapter/decorator/RawAdapterDecorator$mappingDataObserver$1", "Lcom/bytedance/jedi/ext/adapter/decorator/RawAdapterDecorator$mappingDataObserver$1;", "myRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "realAdapter$annotations", "()V", "getRealAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "realItemCount", "getRealItemCount", "getItemCount", "getItemId", "", "position", "getItemViewType", "isInnerViewHolder", "", "viewType", "manualLoadMore", "", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onDetachedFromRecyclerView", "onFailedToRecycleView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "registerAdapterDataObserver", "observer", "Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;", "runIfAttached", "block", "Lkotlin/Function0;", "setEmptyView", "empty", "Lcom/bytedance/jedi/ext/adapter/decorator/EmptyView;", "setEmptyViewStrategy", "strategy", "", "setFooter", "footer", "Landroid/view/View;", "setHasStableIds", "hasStableIds", "setHeader", "header", "setLoadMoreEnable", "enable", "setLoadMoreListener", "listener", "setLoadingView", "loading", "Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "showEmpty", "isEmpty", "showError", "showLoading", "showLoadingError", "showLoadingIdle", "showLoadingNoMore", "noMore", "tryShowLoadingStatus", "status", "tryUpdateEmptyView", "unregisterAdapterDataObserver", "replace", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/IDelegate;", "cur", "new", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public class RawAdapterDecorator extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> f21437a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f21438b;

    /* renamed from: c  reason: collision with root package name */
    private final d f21439c;

    /* renamed from: d  reason: collision with root package name */
    private final c f21440d;

    /* renamed from: e  reason: collision with root package name */
    private final f f21441e;

    /* renamed from: f  reason: collision with root package name */
    private final b f21442f;
    private final a[] g;
    private final RawAdapterDecorator$mappingDataObserver$1 h;

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
    }

    private final int b() {
        return this.f21440d.e();
    }

    private final int c() {
        return this.f21437a.getItemCount();
    }

    public final int a() {
        return this.f21439c.e();
    }

    public int getItemCount() {
        if (c() == 0) {
            return this.f21442f.e();
        }
        return c() + a() + b() + this.f21441e.e();
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f21437a.setHasStableIds(z);
    }

    public final boolean a(int i) {
        boolean z;
        for (a f2 : this.g) {
            if (f2.f() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public long getItemId(int i) {
        if (a(getItemViewType(i))) {
            return super.getItemId(i);
        }
        return this.f21437a.getItemId(i);
    }

    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f21438b = null;
        this.f21437a.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f21437a.onFailedToRecycleView(viewHolder);
    }

    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f21437a.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f21437a.onFailedToRecycleView(viewHolder);
        }
    }

    public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f21437a.registerAdapterDataObserver(this.h);
    }

    public void unregisterAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f21437a.unregisterAdapterDataObserver(this.h);
    }

    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21438b = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new RawAdapterDecorator$onAttachedToRecyclerView$1(this, layoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
        this.f21437a.onAttachedToRecyclerView(recyclerView);
    }

    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        a aVar;
        boolean z;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        a[] aVarArr = this.g;
        int length = aVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i];
            if (aVar.f() == viewHolder.getItemViewType()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            super.onViewAttachedToWindow(viewHolder);
            if (!aVar.a()) {
                RecyclerView.ViewHolder c2 = aVar.c();
                if (c2 != null) {
                    View view = c2.itemView;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                            layoutParams = null;
                        }
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.setFullSpan(true);
                            aVar.a(true);
                        }
                    }
                }
            }
            return;
        }
        this.f21437a.onViewAttachedToWindow(viewHolder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r5 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r5) {
        /*
            r4 = this;
            int r0 = r4.c()
            if (r0 != 0) goto L_0x00c9
            com.bytedance.jedi.ext.adapter.decorator.internal.b r0 = r4.f21442f
            r1 = 2
            r2 = 0
            r3 = 1
            switch(r5) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0017;
                case 2: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x00c4
        L_0x0010:
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21459e
            int r5 = r5.f()
            return r5
        L_0x0017:
            boolean r5 = r0.d()
            if (r5 == 0) goto L_0x0029
            int r5 = r0.f21457c
            r5 = r5 & r3
            if (r5 != r3) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0043
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21458d
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0040
            int r5 = r0.f21457c
            r5 = r5 & r1
            if (r5 != r1) goto L_0x003b
            r5 = 1
            goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            if (r5 != 0) goto L_0x00c4
        L_0x0043:
            boolean r5 = r0.d()
            if (r5 == 0) goto L_0x0055
            int r5 = r0.f21457c
            r5 = r5 & r3
            if (r5 != r3) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x00c4
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21458d
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x006b
            int r5 = r0.f21457c
            r5 = r5 & r1
            if (r5 != r1) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 == 0) goto L_0x006b
            r2 = 1
        L_0x006b:
            if (r2 != 0) goto L_0x00c4
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21459e
            int r5 = r5.f()
            return r5
        L_0x0074:
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21458d
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0088
            int r5 = r0.f21457c
            r5 = r5 & r1
            if (r5 != r1) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            if (r5 == 0) goto L_0x0088
            r5 = 1
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            if (r5 == 0) goto L_0x0092
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21458d
            int r5 = r5.f()
            return r5
        L_0x0092:
            boolean r5 = r0.d()
            if (r5 == 0) goto L_0x00a4
            int r5 = r0.f21457c
            r5 = r5 & r3
            if (r5 != r3) goto L_0x009f
            r5 = 1
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 == 0) goto L_0x00a4
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            if (r5 != 0) goto L_0x00c4
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21459e
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x00bb
            int r5 = r0.f21457c
            r1 = 4
            r5 = r5 & r1
            if (r5 != r1) goto L_0x00b7
            r5 = 1
            goto L_0x00b8
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            if (r5 == 0) goto L_0x00bb
            r2 = 1
        L_0x00bb:
            if (r2 == 0) goto L_0x00c4
            com.bytedance.jedi.ext.adapter.decorator.internal.a r5 = r0.f21459e
            int r5 = r5.f()
            return r5
        L_0x00c4:
            int r5 = r0.f()
            return r5
        L_0x00c9:
            if (r5 != 0) goto L_0x00da
            com.bytedance.jedi.ext.adapter.decorator.internal.d r0 = r4.f21439c
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x00da
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f21439c
            int r5 = r5.f()
            return r5
        L_0x00da:
            int r0 = r4.c()
            int r1 = r4.a()
            int r0 = r0 + r1
            if (r5 != r0) goto L_0x00f4
            com.bytedance.jedi.ext.adapter.decorator.internal.c r1 = r4.f21440d
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00f4
            com.bytedance.jedi.ext.adapter.decorator.internal.c r5 = r4.f21440d
            int r5 = r5.f()
            return r5
        L_0x00f4:
            int r1 = r4.b()
            int r0 = r0 + r1
            if (r5 != r0) goto L_0x010a
            com.bytedance.jedi.ext.adapter.decorator.internal.f r0 = r4.f21441e
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x010a
            com.bytedance.jedi.ext.adapter.decorator.internal.f r5 = r4.f21441e
            int r5 = r5.f()
            return r5
        L_0x010a:
            android.support.v7.widget.RecyclerView$Adapter<android.support.v7.widget.RecyclerView$ViewHolder> r0 = r4.f21437a
            int r1 = r4.a()
            int r5 = r5 - r1
            int r5 = r0.getItemViewType(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.RawAdapterDecorator.getItemViewType(int):int");
    }

    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        a aVar;
        boolean z;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        a[] aVarArr = this.g;
        int length = aVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i2];
            if (aVar.f() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        if (aVar != null) {
            return aVar.a(viewGroup);
        }
        RecyclerView.ViewHolder onCreateViewHolder = this.f21437a.onCreateViewHolder(viewGroup, i);
        Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "realAdapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<Object> list) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        if (!a(viewHolder.getItemViewType())) {
            this.f21437a.onBindViewHolder(viewHolder, i - a(), list);
        } else if (viewHolder instanceof LoadingHolder) {
            f fVar = this.f21441e;
            if (fVar.f21465c == 241 && !fVar.f21467e) {
                fVar.f21467e = true;
                fVar.g();
                Function0<Unit> function0 = fVar.f21468f;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
