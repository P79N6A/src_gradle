package com.ss.android.ugc.aweme.fe.method;

import android.content.DialogInterface;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44534a;

    /* renamed from: b  reason: collision with root package name */
    private final a f44535b;

    c(a aVar) {
        this.f44535b = aVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f44534a, false, 39736, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f44534a, false, 39736, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        a aVar = this.f44535b;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, aVar, a.f44520a, false, 39732, new Class[]{DialogInterface.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, aVar2, a.f44520a, false, 39732, new Class[]{DialogInterface.class}, Void.TYPE);
        } else {
            FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
            if (frameLayout != null) {
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                from.setPeekHeight(frameLayout.getHeight());
                from.setSkipCollapsed(true);
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
        if (frameLayout2 != null) {
            BottomSheetBehavior from2 = BottomSheetBehavior.from(frameLayout2);
            from2.setPeekHeight(frameLayout2.getHeight());
            from2.setSkipCollapsed(true);
        }
    }
}
