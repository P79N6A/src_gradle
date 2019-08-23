package com.ss.android.ugc.aweme.following.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public class FollowAndInviteUserBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48161a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48161a, false, 45152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48161a, false, 45152, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(0);
        this.f48163c.setTextColor(getResources().getColor(C0906R.color.hx));
        this.f48163c.setText(getResources().getString(C0906R.string.b27));
        this.f48163c.setBackground(a.a(getResources(), 2130838156));
        this.f48164d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48161a, false, 45153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48161a, false, 45153, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(0);
        this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
        this.f48163c.setText(getResources().getString(C0906R.string.b3f));
        this.f48163c.setBackground(a.a(getResources(), 2130837983));
        this.f48164d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
    }

    public FollowAndInviteUserBtn(Context context) {
        super(context);
    }

    public FollowAndInviteUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowAndInviteUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
