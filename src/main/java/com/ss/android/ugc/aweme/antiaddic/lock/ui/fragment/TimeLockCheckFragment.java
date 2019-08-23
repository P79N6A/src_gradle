package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.b.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/fragment/TimeLockCheckFragment;", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/fragment/AbsTimeLockFragment;", "Lcom/ss/android/ugc/aweme/antiaddic/lock/view/ITeenageView;", "()V", "mPresenter", "Lcom/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter;", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "checkPassword", "", "password", "", "doAfterPasswordChecked", "hideLoading", "initPresenter", "onDestroy", "onFailed", "onSuccess", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class TimeLockCheckFragment extends AbsTimeLockFragment implements a {
    public static ChangeQuickRedirect g;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f2612e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.antiaddic.lock.a.a f2613f;
    private HashMap h;

    public abstract void b();

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21970, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21967, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f2612e;
            if (dmtStatusView != null) {
                dmtStatusView.b();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21964, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21965, new Class[0], Void.TYPE);
            return;
        }
        f();
        b();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21966, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.antiaddic.lock.a.a aVar = this.f2613f;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void c(@Nullable String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, g, false, 21963, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, g, false, 21963, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            DmtStatusView dmtStatusView = this.f2612e;
            if (dmtStatusView != null) {
                dmtStatusView.d();
            }
            com.ss.android.ugc.aweme.antiaddic.lock.a.a aVar = this.f2613f;
            if (aVar != null) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                aVar.a(str2);
            }
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, g, false, 21962, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, g, false, 21962, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f2612e = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        DmtStatusView dmtStatusView = this.f2612e;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()));
        }
        if (PatchProxy.isSupport(new Object[0], this, g, false, 21968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 21968, new Class[0], Void.TYPE);
            return;
        }
        this.f2613f = new com.ss.android.ugc.aweme.antiaddic.lock.a.a();
        com.ss.android.ugc.aweme.antiaddic.lock.a.a aVar = this.f2613f;
        if (aVar != null) {
            aVar.a((a) this);
        }
    }
}
