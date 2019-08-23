package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.l;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.ss.android.ugc.aweme.discover.delegate.FallbackDelegate;
import com.ss.android.ugc.aweme.discover.delegate.d;
import com.ss.android.ugc.aweme.discover.delegate.f;
import com.ss.android.ugc.aweme.discover.delegate.g;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000245B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0016J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001eJ\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0016\u0010(\u001a\u00020!2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*J\u0010\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010-J\u0018\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020!H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/CategoryListAdapter;", "Lcom/ss/android/ugc/aweme/discover/base/MultiTypeAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "mBannerDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/BannerDelegate;", "mCategoryDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/CategoryDelegate;", "mCategoryNewDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/CategoryNewDelegate;", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "mHotSearchDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/NewHotSearchDelegate;", "mRankingListDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/RankingListDelegate;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getCategoryOrAdOffset", "", "getHotSearchWordsOffset", "getUniqueId", "pos", "isCategoryOrAd", "", "position", "onAttachedToRecyclerView", "", "recyclerView", "onDetachedFromRecyclerView", "onHiddenChanged", "hidden", "setCurVisible", "isVisible", "setData", "list", "", "setOnHeadReadyListener", "listener", "Lcom/ss/android/ugc/aweme/discover/adapter/CategoryListAdapter$OnHeadReadyListener;", "setPullGuide", "pullGuide", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/PullGuide;", "context", "Landroid/content/Context;", "triggerCheckVisibility", "Companion", "OnHeadReadyListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CategoryListAdapter extends MultiTypeAdapter<DiscoverItemData> implements RecyclerViewVisibilityObserver.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41553a = null;

    /* renamed from: f  reason: collision with root package name */
    public static final int f41554f = f41554f;
    public static final int g = g;
    public static final int h = h;
    public static final int i = i;
    @NotNull
    public static final String j = j;
    public static final a k = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f41555b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.delegate.a f41556c;

    /* renamed from: d  reason: collision with root package name */
    public final g f41557d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.jedi.arch.ext.list.differ.b<Object> f41558e;
    private final f o;
    private d p;
    private com.ss.android.ugc.aweme.discover.delegate.c q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/CategoryListAdapter$Companion;", "", "()V", "TAG", "", "getTAG$main_douyinCnRelease", "()Ljava/lang/String;", "TYPE_CATEGORY", "", "getTYPE_CATEGORY", "()I", "TYPE_CATEGORY_NEW", "getTYPE_CATEGORY_NEW", "TYPE_HOT_VIDEO", "getTYPE_HOT_VIDEO", "TYPE_MUSIC", "getTYPE_MUSIC", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return CategoryListAdapter.f41554f;
        }

        public static int b() {
            return CategoryListAdapter.i;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/CategoryListAdapter$OnHeadReadyListener;", "", "onHeadReady", "", "view", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull View view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f41560b;

        public c(RecyclerView recyclerView) {
            this.f41560b = recyclerView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f41559a, false, 35515, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41559a, false, 35515, new Class[0], Void.TYPE);
                return;
            }
            RecyclerViewVisibilityObserver.a(this.f41560b);
        }
    }

    @JvmOverloads
    public CategoryListAdapter() {
        this(null, 1);
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f41553a, false, 35513, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41553a, false, 35513, new Class[0], Integer.TYPE)).intValue();
        }
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((DiscoverItemData) this.n.get(i2)).getType() == 5) {
                return i2;
            }
        }
        return -1;
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f41553a, false, 35505, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f41553a, false, 35505, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f41555b = recyclerView2;
    }

    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f41553a, false, 35506, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f41553a, false, 35506, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f41555b = null;
    }

    @JvmOverloads
    public CategoryListAdapter(@Nullable Fragment fragment) {
        this.f41558e = new com.bytedance.jedi.arch.ext.list.differ.b<>((RecyclerView.Adapter) this, (DiffUtil.ItemCallback) new Differ(), (e.b) null);
        this.o = new f(fragment);
        a(this.o);
        this.f41557d = new g(fragment);
        a(this.f41557d);
        a(i, new com.ss.android.ugc.aweme.discover.delegate.e());
        this.f41556c = new com.ss.android.ugc.aweme.discover.delegate.a();
        a(this.f41556c);
        if (com.ss.android.ugc.aweme.discover.helper.b.a()) {
            com.ss.android.ugc.aweme.common.adapter.a fallbackDelegate = new FallbackDelegate();
            if (PatchProxy.isSupport(new Object[]{fallbackDelegate}, this, MultiTypeAdapter.l, false, 36139, new Class[]{com.ss.android.ugc.aweme.common.adapter.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fallbackDelegate}, this, MultiTypeAdapter.l, false, 36139, new Class[]{com.ss.android.ugc.aweme.common.adapter.a.class}, Void.TYPE);
            } else {
                this.m.b(fallbackDelegate);
            }
            this.p = new d();
            int i2 = g;
            d dVar = this.p;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            a(i2, dVar);
            a(new com.ss.android.ugc.aweme.discover.delegate.b());
            return;
        }
        this.q = new com.ss.android.ugc.aweme.discover.delegate.c();
        int i3 = f41554f;
        com.ss.android.ugc.aweme.discover.delegate.c cVar = this.q;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        a(i3, cVar);
    }

    @NotNull
    public final Object a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f41553a, false, 35507, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f41553a, false, 35507, new Class[]{Integer.TYPE}, Object.class);
        }
        int a2 = a();
        if (i2 < 0 || i2 < a2 || i2 >= this.n.size()) {
            return Integer.valueOf(i2);
        }
        return (Serializable) this.n.get(i2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41553a, false, 35510, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41553a, false, 35510, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.an()) {
            boolean z2 = !z;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f41553a, false, 35511, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f41553a, false, 35511, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                if (this.q != null) {
                    com.ss.android.ugc.aweme.discover.delegate.c cVar = this.q;
                    if (cVar == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar.f42271b = z2;
                }
                com.ss.android.ugc.aweme.discover.delegate.a aVar = this.f41556c;
                if (aVar != null) {
                    aVar.f42237b = z2;
                }
                if (this.p != null) {
                    d dVar = this.p;
                    if (dVar == null) {
                        Intrinsics.throwNpe();
                    }
                    dVar.f42273b = z2;
                }
            }
        }
        if (this.f41556c != null) {
            this.f41556c.a(!z);
            this.f41556c.b(!z);
        }
    }

    private /* synthetic */ CategoryListAdapter(Fragment fragment, int i2) {
        this(null);
    }

    public final void a(@Nullable l lVar, @NotNull Context context) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{lVar, context}, this, f41553a, false, 35509, new Class[]{l.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar, context}, this, f41553a, false, 35509, new Class[]{l.class, Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        ((com.ss.android.ugc.aweme.commercialize.loft.model.e) com.ss.android.ugc.aweme.commercialize.loft.model.e.m.a(context)).f39242d = lVar;
        if (!PatchProxy.isSupport(new Object[0], this, f41553a, false, 35514, new Class[0], Integer.TYPE)) {
            int size = this.n.size();
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                } else if (((DiscoverItemData) this.n.get(i3)).getType() == 1) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41553a, false, 35514, new Class[0], Integer.TYPE)).intValue();
        }
        if (i2 >= 0) {
            notifyItemChanged(i2, lVar);
        }
    }
}
