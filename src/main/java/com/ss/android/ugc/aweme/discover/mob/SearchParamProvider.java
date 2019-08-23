package com.ss.android.ugc.aweme.discover.mob;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchParamProvider;", "Landroid/arch/lifecycle/ViewModel;", "()V", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "getParam", "()Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "setParam", "(Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchParamProvider extends ViewModel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f42643b = new a((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public SearchResultParam f42644a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchParamProvider$Companion;", "", "()V", "getParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "context", "Landroid/content/Context;", "setParam", "", "param", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42645a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @Nullable
        public final SearchResultParam a(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f42645a, false, 36973, new Class[]{Context.class}, SearchResultParam.class)) {
                return (SearchResultParam) PatchProxy.accessDispatch(new Object[]{context2}, this, f42645a, false, 36973, new Class[]{Context.class}, SearchResultParam.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = v.a(context);
            if (a2 != null) {
                ViewModel viewModel = ViewModelProviders.of((FragmentActivity) a2).get(SearchParamProvider.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…aramProvider::class.java)");
                return ((SearchParamProvider) viewModel).f42644a;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        public final void a(@NotNull Context context, @NotNull SearchResultParam searchResultParam) {
            Context context2 = context;
            SearchResultParam searchResultParam2 = searchResultParam;
            if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2}, this, f42645a, false, 36974, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, searchResultParam2}, this, f42645a, false, 36974, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
            Activity a2 = v.a(context);
            if (a2 != null) {
                ViewModel viewModel = ViewModelProviders.of((FragmentActivity) a2).get(SearchParamProvider.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…aramProvider::class.java)");
                ((SearchParamProvider) viewModel).f42644a = searchResultParam2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
