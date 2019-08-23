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

public final /* synthetic */ class at implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9066a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveBaseFragment f9067b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9068c;

    at(StartLiveBaseFragment startLiveBaseFragment, String str) {
        this.f9067b = startLiveBaseFragment;
        this.f9068c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9066a, false, 2795, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9066a, false, 2795, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveBaseFragment startLiveBaseFragment = this.f9067b;
        String str = this.f9068c;
        if (a.a()) {
            j.q().f().a((Context) startLiveBaseFragment.getActivity(), c.b(str).a(startLiveBaseFragment.getContext().getResources().getString(C0906R.string.cpi)));
        } else {
            BaseDialogFragment.a(startLiveBaseFragment.getFragmentManager(), j.q().f().a(c.a(str).a((int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).b(400)));
        }
        dialogInterface.dismiss();
    }
}
