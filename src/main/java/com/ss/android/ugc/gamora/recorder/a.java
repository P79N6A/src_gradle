package com.ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.view.View;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"observeViewVisible", "", "Landroid/arch/lifecycle/LiveData;", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.recorder.a$a  reason: collision with other inner class name */
    static final class C0819a<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f77637a;

        C0819a(View view) {
            this.f77637a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                if (bool.booleanValue()) {
                    this.f77637a.setVisibility(0);
                } else {
                    this.f77637a.setVisibility(8);
                }
            }
        }
    }

    public static final void a(@NotNull LiveData<Boolean> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull View view) {
        Intrinsics.checkParameterIsNotNull(liveData, "$this$observeViewVisible");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(view, "view");
        liveData.observe(lifecycleOwner, new C0819a(view));
    }
}
