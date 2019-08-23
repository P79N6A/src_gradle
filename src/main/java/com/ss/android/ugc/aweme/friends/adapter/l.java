package com.ss.android.ugc.aweme.friends.adapter;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48809a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteMoreViewHolder f48810b;

    l(InviteMoreViewHolder inviteMoreViewHolder) {
        this.f48810b = inviteMoreViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48809a, false, 46320, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f48809a, false, 46320, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        InviteMoreViewHolder inviteMoreViewHolder = this.f48810b;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, inviteMoreViewHolder, InviteMoreViewHolder.f48738a, false, 46318, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            InviteMoreViewHolder inviteMoreViewHolder2 = inviteMoreViewHolder;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, inviteMoreViewHolder2, InviteMoreViewHolder.f48738a, false, 46318, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(inviteMoreViewHolder.f48743f == null || inviteMoreViewHolder.f48741d == null)) {
            inviteMoreViewHolder.f48741d.a(inviteMoreViewHolder.f48743f, z);
        }
    }
}
