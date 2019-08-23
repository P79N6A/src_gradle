package com.ss.android.ugc.aweme.following.ui.view;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/view/EmptyFollowView;", "Landroid/view/View;", "Lcom/ss/android/ugc/aweme/following/ui/view/IFollowStatusView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLifeCycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "setFollowStatus", "", "status", "followStatus", "followerStatus", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends View implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48166a;

    public final void a(int i, int i2) {
    }

    public final void setFollowStatus(int i) {
    }

    @NotNull
    public final LifecycleOwner getLifeCycleOwner() {
        if (PatchProxy.isSupport(new Object[0], this, f48166a, false, 45148, new Class[0], LifecycleOwner.class)) {
            return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f48166a, false, 45148, new Class[0], LifecycleOwner.class);
        }
        Context context = getContext();
        if (context != null) {
            return (LifecycleOwner) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public b(@Nullable Context context) {
        super(context);
    }

    public final void setOnClickListener(@NotNull View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f48166a, false, 45149, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f48166a, false, 45149, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onClickListener2, "listener");
        onClickListener2.onClick(this);
    }
}
