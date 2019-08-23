package com.ss.android.ugc.aweme.discover.hotspot;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotCurWordChangeCallBack;", "Landroid/arch/lifecycle/ViewModel;", "()V", "mData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SpotCurWordChangeCallBack extends ViewModel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f42418b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b<String> f42419a = new b<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nj\u0002`\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotCurWordChangeCallBack$Companion;", "", "()V", "addSpotChangeListener", "", "context", "Landroid/support/v4/app/FragmentActivity;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "listener", "Lkotlin/Function1;", "", "Lcom/ss/android/ugc/aweme/discover/hotspot/OnSpotChangeListener;", "getCurSpot", "activity", "getCurrentChangeLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "onSpotChange", "spot", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42420a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "aweme", "", "onChanged"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.SpotCurWordChangeCallBack$a$a  reason: collision with other inner class name */
        static final class C0539a<T> implements Observer<String> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42421a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Function1 f42422b;

            C0539a(Function1 function1) {
                this.f42422b = function1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f42421a, false, 36552, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f42421a, false, 36552, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                this.f42422b.invoke(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final b<String> a(FragmentActivity fragmentActivity) {
            if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, this, f42420a, false, 36548, new Class[]{FragmentActivity.class}, b.class)) {
                return ((SpotCurWordChangeCallBack) ViewModelProviders.of(fragmentActivity).get(SpotCurWordChangeCallBack.class)).f42419a;
            }
            return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, this, f42420a, false, 36548, new Class[]{FragmentActivity.class}, b.class);
        }

        public final void a(@NotNull FragmentActivity fragmentActivity, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super String, Unit> function1) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            LifecycleOwner lifecycleOwner2 = lifecycleOwner;
            Function1<? super String, Unit> function12 = function1;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2, lifecycleOwner2, function12}, this, f42420a, false, 36550, new Class[]{FragmentActivity.class, LifecycleOwner.class, Function1.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity2, lifecycleOwner2, function12}, this, f42420a, false, 36550, new Class[]{FragmentActivity.class, LifecycleOwner.class, Function1.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, "context");
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "owner");
            Intrinsics.checkParameterIsNotNull(function12, "listener");
            a(fragmentActivity2).a(lifecycleOwner2, new C0539a(function12), true);
        }
    }
}
