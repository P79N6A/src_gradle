package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.PreloadScrollListener;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 '2\u00020\u0001:\u0004'()*B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0007J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0006\u0010%\u001a\u00020\u0013J\b\u0010&\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper;", "Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper;", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "isLoading", "", "mLoadMoreView", "Landroid/view/View;", "mLoadMoreViewCreator", "Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$LoadMoreViewCreator;", "mOnLoadMoreListener", "Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$OnLoadMoreListener;", "mPreloadScrollListener", "Lcom/ss/android/ugc/aweme/discover/base/PreloadScrollListener;", "mState", "", "loadComplete", "", "state", "onAttachedToRecyclerView", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onDetachedFromRecyclerView", "onStateChanged", "oldState", "newState", "onViewAttachedToWindow", "holder", "setLoadMoreViewCreator", "creator", "setOnLoadMoreListener", "listener", "setPreloadEnable", "preloadEnable", "setState", "triggerLoadMore", "tryLoadMore", "Companion", "LoadMoreViewCreator", "OnLoadMoreListener", "State", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoadMoreAdapterWrapper extends HeaderAndFooterWrapper {
    public static ChangeQuickRedirect g;
    public static final a j = new a((byte) 0);
    public b h = new a();
    public c i;
    private int k = -1;
    private PreloadScrollListener l = new PreloadScrollListener();
    private boolean m;
    private View n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$State;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$Companion;", "", "()V", "STATE_ERROR", "", "STATE_HAS_MORE", "STATE_INIT", "STATE_NO_MORE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$LoadMoreViewCreator;", "", "()V", "onCreateView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "wrapper", "Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper;", "setState", "", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static abstract class b {
        @NotNull
        public abstract View a(@NotNull ViewGroup viewGroup, @NotNull LoadMoreAdapterWrapper loadMoreAdapterWrapper);

        public abstract void a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/LoadMoreAdapterWrapper$OnLoadMoreListener;", "", "onLoadMore", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoadMoreAdapterWrapper f42125b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42126c;

        d(LoadMoreAdapterWrapper loadMoreAdapterWrapper, int i) {
            this.f42125b = loadMoreAdapterWrapper;
            this.f42126c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42124a, false, 36136, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42124a, false, 36136, new Class[0], Void.TYPE);
                return;
            }
            this.f42125b.h.a(this.f42126c);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 36131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 36131, new Class[0], Void.TYPE);
            return;
        }
        if (!this.m && this.k == 1) {
            this.m = true;
            c cVar = this.i;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadMoreAdapterWrapper(@NotNull RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        super(adapter);
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        PreloadScrollListener preloadScrollListener = this.l;
        PreloadScrollListener.a r7 = new PreloadScrollListener.a(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42122a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LoadMoreAdapterWrapper f42123b;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f42122a, false, 36135, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42122a, false, 36135, new Class[0], Void.TYPE);
                    return;
                }
                this.f42123b.d();
            }

            {
                this.f42123b = r1;
            }
        };
        if (PatchProxy.isSupport(new Object[]{r7}, preloadScrollListener, PreloadScrollListener.f42130a, false, 36166, new Class[]{PreloadScrollListener.a.class}, Void.TYPE)) {
            PreloadScrollListener preloadScrollListener2 = preloadScrollListener;
            PatchProxy.accessDispatch(new Object[]{r7}, preloadScrollListener2, PreloadScrollListener.f42130a, false, 36166, new Class[]{PreloadScrollListener.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(r7, "listener");
        preloadScrollListener.f42131b = r7;
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 36132, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 36132, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            this.m = false;
            c(i2);
        } else {
            throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 36133, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 36133, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.k;
        if (i3 != i2) {
            this.k = i2;
            a(i3, i2);
        }
    }

    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, g, false, 36127, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, g, false, 36127, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView2.removeOnScrollListener(this.l);
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, g, false, 36125, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, g, false, 36125, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (this.n == viewHolder2.itemView) {
            d();
        }
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, g, false, 36126, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, g, false, 36126, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.n == null) {
            this.n = this.h.a(recyclerView, this);
            this.h.a(0);
            View view = this.n;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[]{view}, this, HeaderAndFooterWrapper.f42110a, false, 36111, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, HeaderAndFooterWrapper.f42110a, false, 36111, new Class[]{View.class}, Void.TYPE);
            } else {
                int size = this.f42111b.size();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size), view}, this, HeaderAndFooterWrapper.f42110a, false, 36112, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size), view}, this, HeaderAndFooterWrapper.f42110a, false, 36112, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
                } else if (size >= 0 && size <= this.f42111b.size() && view != null) {
                    int a2 = this.f42113d.a();
                    ViewHolder viewHolder = new ViewHolder(a2, view);
                    this.f42111b.add(viewHolder);
                    this.f42112c.put(a2, viewHolder);
                    notifyItemInserted((getItemCount() - super.b()) + size);
                }
            }
        }
        recyclerView.addOnScrollListener(this.l);
    }

    private final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, g, false, 36134, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, g, false, 36134, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f42114e;
        if (recyclerView != null) {
            recyclerView.post(new d(this, i3));
        }
    }
}
