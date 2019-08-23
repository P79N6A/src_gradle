package com.bytedance.android.livesdk.kickout.ui;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15764a;

    /* renamed from: b  reason: collision with root package name */
    private final BannedViewHolder f15765b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15766c;

    /* renamed from: d  reason: collision with root package name */
    private final User f15767d;

    c(BannedViewHolder bannedViewHolder, String str, User user) {
        this.f15765b = bannedViewHolder;
        this.f15766c = str;
        this.f15767d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15764a, false, 10220, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15764a, false, 10220, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        BannedViewHolder bannedViewHolder = this.f15765b;
        String str = this.f15766c;
        User user = this.f15767d;
        bannedViewHolder.f15751d.setVisibility(0);
        bannedViewHolder.f15750c.setVisibility(8);
        if (str.equals("activity_kick_out")) {
            bannedViewHolder.j.a(false, bannedViewHolder.m, user.getId());
        } else {
            bannedViewHolder.k.a(false, bannedViewHolder.m, user.getId());
        }
        dialogInterface.dismiss();
    }
}
