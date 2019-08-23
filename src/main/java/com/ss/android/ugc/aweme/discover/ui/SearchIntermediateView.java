package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.helper.g;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002./B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animHelper", "Lcom/ss/android/ugc/aweme/discover/helper/SearchIntermediateAnimHelper;", "fragment", "Landroid/support/v4/app/Fragment;", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "intermediateState", "intermediateStateObserver", "Landroid/arch/lifecycle/Observer;", "intermediateTabObserver", "intermediateViewModel", "Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;", "isSearchResultActivity", "", "openSugFromState", "getOpenSugFromState", "()I", "setOpenSugFromState", "(I)V", "responder", "Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateView$IOpenSearchResponder;", "checkAndInitFragment", "", "hide", "anim", "installPageIndex", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "isSquareShow", "isSugShow", "openSearchSquare", "fromMainPage", "openSearchSug", "keyword", "", "setup", "showSelfAnimation", "Companion", "IOpenSearchResponder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchIntermediateView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43001a;
    public static final a k = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SearchIntermediateViewModel f43002b;

    /* renamed from: c  reason: collision with root package name */
    public b f43003c;

    /* renamed from: d  reason: collision with root package name */
    FragmentManager f43004d;

    /* renamed from: e  reason: collision with root package name */
    Fragment f43005e;

    /* renamed from: f  reason: collision with root package name */
    final g f43006f;
    public int g;
    boolean h;
    final Observer<Integer> i;
    final Observer<Integer> j;
    private int l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateView$IOpenSearchResponder;", "", "intermediateTabChanged", "", "tabIndex", "", "requestOpenSearch", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull SearchResultParam searchResultParam);

        void b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateView$Companion;", "", "()V", "TAG_INTERMEDIATE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateView f43008b;

        c(SearchIntermediateView searchIntermediateView) {
            this.f43008b = searchIntermediateView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f43007a, false, 37980, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f43007a, false, 37980, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                if (this.f43008b.g != num.intValue() && num.intValue() == 0) {
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f43008b.f43002b;
                    if (searchIntermediateViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
                    }
                    SearchResultParam searchResultParam = (SearchResultParam) searchIntermediateViewModel.getOpenSearchParam().getValue();
                    if (searchResultParam != null) {
                        SearchIntermediateView.a(this.f43008b).a(searchResultParam);
                    }
                }
                this.f43008b.g = num.intValue();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateView f43010b;

        d(SearchIntermediateView searchIntermediateView) {
            this.f43010b = searchIntermediateView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f43009a, false, 37981, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f43009a, false, 37981, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                SearchIntermediateView.a(this.f43010b).b(num.intValue());
            }
        }
    }

    @JvmOverloads
    public SearchIntermediateView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SearchIntermediateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getOpenSugFromState() {
        return this.l;
    }

    private final void c() {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[0], this, f43001a, false, 37969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43001a, false, 37969, new Class[0], Void.TYPE);
            return;
        }
        FragmentManager fragmentManager = this.f43004d;
        if (fragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
        }
        this.f43005e = fragmentManager.findFragmentByTag("tag_intermediate");
        if (this.f43005e == null) {
            if (com.ss.android.ugc.aweme.discover.helper.b.c()) {
                fragment = new TabIntermediateFragment();
            } else {
                fragment = new SingleIntermediateFragment();
            }
            this.f43005e = fragment;
            FragmentManager fragmentManager2 = this.f43004d;
            if (fragmentManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            }
            FragmentTransaction beginTransaction = fragmentManager2.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
            Fragment fragment2 = this.f43005e;
            if (fragment2 == null) {
                Intrinsics.throwNpe();
            }
            beginTransaction.replace(C0906R.id.clf, fragment2, "tag_intermediate").commitAllowingStateLoss();
            return;
        }
        if ((this.f43005e instanceof TabIntermediateFragment) && !this.h && this.g == 0) {
            Fragment fragment3 = this.f43005e;
            if (fragment3 != null) {
                TabIntermediateFragment tabIntermediateFragment = (TabIntermediateFragment) fragment3;
                if (PatchProxy.isSupport(new Object[0], tabIntermediateFragment, TabIntermediateFragment.f43052a, false, 38109, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], tabIntermediateFragment, TabIntermediateFragment.f43052a, false, 38109, new Class[0], Void.TYPE);
                } else if (tabIntermediateFragment.isViewValid()) {
                    ViewPager viewPager = tabIntermediateFragment.f43054b;
                    if (viewPager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    }
                    viewPager.setCurrentItem(0, false);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment");
            }
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f43001a, false, 37975, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43001a, false, 37975, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f43002b;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43001a, false, 37974, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43001a, false, 37974, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f43002b;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 2) {
            z = true;
        }
        return z;
    }

    public final void setOpenSugFromState(int i2) {
        this.l = i2;
    }

    public static final /* synthetic */ b a(SearchIntermediateView searchIntermediateView) {
        b bVar = searchIntermediateView.f43003c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responder");
        }
        return bVar;
    }

    private final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43001a, false, 37968, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43001a, false, 37968, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f43006f.c().b();
        } else {
            this.f43006f.b();
        }
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f43001a, false, 37973, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f43001a, false, 37973, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        c();
        b(false);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f43002b;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
        }
        searchIntermediateViewModel.openSearchSug(str);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43001a, false, 37972, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43001a, false, 37972, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!b()) {
            c();
            b(z);
            SearchIntermediateViewModel searchIntermediateViewModel = this.f43002b;
            if (searchIntermediateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
            }
            searchIntermediateViewModel.openSearchSquare();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchIntermediateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setVisibility(8);
        this.g = 0;
        this.f43006f = new g(context, this);
        this.i = new c(this);
        this.j = new d(this);
        this.l = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchIntermediateView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
