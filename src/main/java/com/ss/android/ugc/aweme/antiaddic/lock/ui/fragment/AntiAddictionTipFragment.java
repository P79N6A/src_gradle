package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/fragment/AntiAddictionTipFragment;", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/fragment/TimeLockCheckFragment;", "()V", "doAfterPasswordChecked", "", "isRegisterEventBus", "", "onCloseAntiAddictionEvent", "event", "Lcom/ss/android/ugc/aweme/antiaddic/event/CloseAntiAddictionTipEvent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNextBtnClick", "input", "", "onViewCreated", "view", "passLocalPasswordCheck", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AntiAddictionTipFragment extends TimeLockCheckFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f2610e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f2611f = new a((byte) 0);
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/fragment/AntiAddictionTipFragment$Companion;", "", "()V", "newInstance", "Landroid/support/v4/app/Fragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33493a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2610e, false, 21956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2610e, false, 21956, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2610e, false, 21954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2610e, false, 21954, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (d.c()) {
            d.a(false);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2610e, false, 21952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2610e, false, 21952, new Class[0], Void.TYPE);
            return;
        }
        a((View) this.f2607b);
        com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cl3).a();
        x a2 = x.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
        an<Boolean> aj = a2.aj();
        Intrinsics.checkExpressionValueIsNotNull(aj, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
        aj.a(Boolean.TRUE);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(@NotNull com.ss.android.ugc.aweme.antiaddic.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2610e, false, 21951, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2610e, false, 21951, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        a((View) this.f2607b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0092, code lost:
        if (android.text.TextUtils.equals(r18, r2.getPassword()) != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.Nullable java.lang.String r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f2610e
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 21950(0x55be, float:3.0759E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f2610e
            r13 = 0
            r14 = 21950(0x55be, float:3.0759E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.antiaddic.lock.c r2 = com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x003e
            r17.c(r18)
            return
        L_0x003e:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f2610e
            r13 = 0
            r14 = 21953(0x55c1, float:3.0763E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0075
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f2610e
            r13 = 0
            r14 = 21953(0x55c1, float:3.0763E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L_0x0096
        L_0x0075:
            com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting r2 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.getUserSetting()
            if (r2 == 0) goto L_0x0095
            r0 = r18
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting r2 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.getUserSetting()
            java.lang.String r3 = "TimeLockRuler.getUserSetting()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getPassword()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 == 0) goto L_0x009c
            r17.b()
            return
        L_0x009c:
            android.content.Context r0 = com.ss.android.ugc.aweme.base.utils.d.a()
            r1 = 2131564680(0x7f0d1888, float:1.8754852E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AntiAddictionTipFragment.b(java.lang.String):void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f2610e, false, 21949, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f2610e, false, 21949, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        d.a(view2, "teen_mode", true);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2610e, false, 21948, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2610e, false, 21948, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.mw, viewGroup2, false);
    }
}
