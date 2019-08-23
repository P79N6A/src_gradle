package com.ss.android.ugc.aweme.newfollow.vh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"isIns", "", "isInsStyle", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57764a;

    public static final boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f57764a, true, 62422, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f57764a, true, 62422, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aB() != 3) {
            AbTestManager a3 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
            if (a3.aB() != 6) {
                AbTestManager a4 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                if (a4.aB() != 9) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f57764a, true, 62421, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f57764a, true, 62421, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aB() != 3) {
            AbTestManager a3 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
            if (a3.aB() != 4) {
                AbTestManager a4 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                if (a4.aB() != 5) {
                    AbTestManager a5 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a5, "AbTestManager.getInstance()");
                    if (a5.aB() != 6) {
                        AbTestManager a6 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a6, "AbTestManager.getInstance()");
                        if (a6.aB() != 7) {
                            AbTestManager a7 = AbTestManager.a();
                            Intrinsics.checkExpressionValueIsNotNull(a7, "AbTestManager.getInstance()");
                            if (a7.aB() != 9) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
