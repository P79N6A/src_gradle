package com.bytedance.android.livesdk;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class cr implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13652a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13653b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13654c;

    cr(StartLiveFragmentDefault startLiveFragmentDefault, String str) {
        this.f13653b = startLiveFragmentDefault;
        this.f13654c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13652a, false, 2967, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13652a, false, 2967, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13653b;
        String str = this.f13654c;
        if (a.a()) {
            j.q().f().a((Context) startLiveFragmentDefault.getActivity(), c.b(str).a(startLiveFragmentDefault.getContext().getResources().getString(C0906R.string.cpi)));
        } else {
            BaseDialogFragment.a(startLiveFragmentDefault.getFragmentManager(), j.q().f().a(c.a(str).a((int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).b(400)));
        }
        dialogInterface.dismiss();
    }
}
