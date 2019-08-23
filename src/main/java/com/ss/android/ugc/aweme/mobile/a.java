package com.ss.android.ugc.aweme.mobile;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56074a;

    /* renamed from: b  reason: collision with root package name */
    private final EditProfileActivityV2 f56075b;

    a(EditProfileActivityV2 editProfileActivityV2) {
        this.f56075b = editProfileActivityV2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f56074a, false, 59685, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f56074a, false, 59685, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        EditProfileActivityV2 editProfileActivityV2 = this.f56075b;
        if (editProfileActivityV2.f56041b != null) {
            editProfileActivityV2.a((CharSequence) editProfileActivityV2.f56041b.i(editProfileActivityV2.f56041b.getCurrentNumber()));
        }
    }
}
