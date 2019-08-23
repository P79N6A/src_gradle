package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.gamora.recorder.d;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class dr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66790a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66791b;

    dr(PlanC planC) {
        this.f66791b = planC;
    }

    public final void run() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66790a, false, 74345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66790a, false, 74345, new Class[0], Void.TYPE);
            return;
        }
        PlanC planC = this.f66791b;
        if (PatchProxy.isSupport(new Object[0], planC, PlanC.f65353a, false, 74297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], planC, PlanC.f65353a, false, 74297, new Class[0], Void.TYPE);
        } else if (planC.Q != null && planC.Q.b() != null) {
            d dVar = (d) planC.Q.b().a("RecordBottomTabScene");
            String string = planC.getString(C0906R.string.bx5);
            Intrinsics.checkParameterIsNotNull(string, "tag");
            TabHost tabHost = dVar.i;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabHost");
            }
            int tabCount = tabHost.getTabCount();
            while (true) {
                if (i >= tabCount) {
                    i = -1;
                    break;
                }
                TabHost tabHost2 = dVar.i;
                if (tabHost2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabHost");
                }
                if (Intrinsics.areEqual((Object) string, tabHost2.a(i))) {
                    break;
                }
                i++;
            }
            if (i > 0) {
                TabHost tabHost3 = dVar.i;
                if (tabHost3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabHost");
                }
                tabHost3.setIndexWithoutAnim(i);
            }
        }
    }
}
