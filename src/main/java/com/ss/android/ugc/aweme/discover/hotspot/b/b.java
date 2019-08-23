package com.ss.android.ugc.aweme.discover.hotspot.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002¨\u0006\t"}, d2 = {"fade", "", "Landroid/view/View;", "it", "", "duration", "", "slideEnter", "transForSpot", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42445a;

    /* access modifiers changed from: private */
    @JvmOverloads
    public static void a(@NotNull View view, boolean z, long j) {
        float f2;
        View view2 = view;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, f42445a, true, 36585, new Class[]{View.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), new Long(j2)}, null, f42445a, true, 36585, new Class[]{View.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "$this$fade");
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        animate.alpha(f2).setDuration(j2).start();
    }
}
