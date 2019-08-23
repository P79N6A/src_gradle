package com.ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/param/FeedParamProvider;", "Landroid/arch/lifecycle/ViewModel;", "()V", "param", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "getParam", "()Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "setParam", "(Lcom/ss/android/ugc/aweme/feed/param/FeedParam;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FeedParamProvider extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45760a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f45761c = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public b f45762b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/param/FeedParamProvider$Companion;", "", "()V", "getParam", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "context", "Landroid/content/Context;", "setParam", "", "param", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45763a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final b a(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f45763a, false, 41960, new Class[]{Context.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{context2}, this, f45763a, false, 41960, new Class[]{Context.class}, b.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = v.a(context);
            if (a2 != null) {
                ViewModel viewModel = ViewModelProviders.of((FragmentActivity) a2).get(FeedParamProvider.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…aramProvider::class.java)");
                b bVar = ((FeedParamProvider) viewModel).f45762b;
                if (bVar == null) {
                    bVar = new b();
                }
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @JvmStatic
    @NotNull
    public static final b a(@NotNull Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f45760a, true, 41958, new Class[]{Context.class}, b.class)) {
            return f45761c.a(context2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f45760a, true, 41958, new Class[]{Context.class}, b.class);
    }
}
