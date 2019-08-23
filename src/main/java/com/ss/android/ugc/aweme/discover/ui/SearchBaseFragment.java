package com.ss.android.ugc.aweme.discover.ui;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.mob.g;
import com.ss.android.ugc.aweme.discover.mob.h;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010*\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R$\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0015@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchBaseFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mEnterFrom", "getMEnterFrom", "setMEnterFrom", "(Ljava/lang/String;)V", "mEnterMethod", "getMEnterMethod", "setMEnterMethod", "mHotSearchWord", "getMHotSearchWord", "setMHotSearchWord", "mKeyword", "getMKeyword", "setMKeyword", "mSearchFrom", "", "getMSearchFrom", "()I", "setMSearchFrom", "(I)V", "mSearchMob", "Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "getMSearchMob", "()Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "setMSearchMob", "(Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;)V", "value", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "mSearchParam", "getMSearchParam", "()Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "setMSearchParam", "(Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;)V", "mSearchType", "getMSearchType", "setMSearchType", "pageIndex", "getPageIndex", "setPageIndex", "<set-?>", "searchCorrectType", "getSearchCorrectType", "setSearchCorrectType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SearchBaseFragment extends AmeBaseFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f3053e = null;
    @NotNull
    public static final String p = p;
    @NotNull
    @JvmField
    public static final String q = q;
    public static final int r = 1;
    public static final int s = s;
    public static final a t = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private HashMap f3054a;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public SearchResultParam f3055f;
    @NotNull
    public s g = new s(true);
    @NotNull
    public String h = "";
    @NotNull
    public String i = "";
    public int j;
    public int k;
    @NotNull
    public String l = "";
    @NotNull
    public String m = "";
    public int n;
    public int o = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0004XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\t8\u0006XD¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0007R\u001c\u0010\u0010\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchBaseFragment$Companion;", "", "()V", "ERROR_CODE_NEED_LOGIN", "", "ERROR_CODE_NEED_LOGIN$annotations", "getERROR_CODE_NEED_LOGIN", "()I", "SEARCH_KEYWORD", "", "TAG", "getTAG", "()Ljava/lang/String;", "TYPE_FROM_HOT_SEARCH", "TYPE_FROM_HOT_SEARCH$annotations", "getTYPE_FROM_HOT_SEARCH", "TYPE_NOT_FROM_HOT_SEARCH", "TYPE_NOT_FROM_HOT_SEARCH$annotations", "getTYPE_NOT_FROM_HOT_SEARCH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return SearchBaseFragment.r;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3053e, false, 37796, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3053e, false, 37796, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f3054a == null) {
            this.f3054a = new HashMap();
        }
        View view = (View) this.f3054a.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f3054a.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3053e, false, 37797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3053e, false, 37797, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3054a != null) {
            this.f3054a.clear();
        }
    }

    @NotNull
    public abstract String i();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public final void c(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3053e, false, 37791, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3053e, false, 37791, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.h = str2;
    }

    public final void d(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3053e, false, 37794, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3053e, false, 37794, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.m = str2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3053e, false, 37795, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3053e, false, 37795, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        h.a aVar = h.f42664a;
        s sVar = this.g;
        if (PatchProxy.isSupport(new Object[]{view2, sVar}, aVar, h.a.f42665a, false, 36971, new Class[]{View.class, s.class}, Void.TYPE)) {
            h.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{view2, sVar}, aVar2, h.a.f42665a, false, 36971, new Class[]{View.class, s.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(sVar, "param");
        g.f42663a.a(view2, sVar);
    }
}
