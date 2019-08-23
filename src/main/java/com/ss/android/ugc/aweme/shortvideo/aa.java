package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class aa implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65445a;

    /* renamed from: b  reason: collision with root package name */
    private final y f65446b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65447c;

    aa(y yVar, String str) {
        this.f65446b = yVar;
        this.f65447c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65445a, false, 73958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65445a, false, 73958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        y yVar = this.f65446b;
        String str = this.f65447c;
        r.a("tutorial_popup_confirm", (Map) d.a().a("enter_from", "video_shoot_page").f34114b);
        dialogInterface.dismiss();
        if (PatchProxy.isSupport(new Object[]{str}, yVar, y.f71489a, false, 73954, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = y.f71489a;
            PatchProxy.accessDispatch(objArr, yVar, changeQuickRedirect, false, 73954, new Class[]{String.class}, Void.TYPE);
            return;
        }
        yVar.f71490b.getActivity();
    }
}
