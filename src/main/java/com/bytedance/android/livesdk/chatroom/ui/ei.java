package com.bytedance.android.livesdk.chatroom.ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ei extends dk {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12145a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12146b;

    /* renamed from: c  reason: collision with root package name */
    private final User f12147c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12148d;

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12145a, false, 6287, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12145a, false, 6287, new Class[]{View.class}, Void.TYPE);
        } else if (this.f12148d) {
            onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = textPaint;
        if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f12145a, false, 6286, new Class[]{TextPaint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f12145a, false, 6286, new Class[]{TextPaint.class}, Void.TYPE);
            return;
        }
        textPaint2.setUnderlineText(false);
        textPaint2.setColor(this.f12146b);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12145a, false, 6285, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12145a, false, 6285, new Class[]{View.class}, Void.TYPE);
        } else if (this.f12147c != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f12147c.getId());
            userProfileEvent.mSource = "live_comment";
            a.a().a((Object) userProfileEvent);
        }
    }

    public ei(User user, int i, boolean z) {
        this.f12147c = user;
        this.f12146b = i;
        this.f12148d = z;
    }
}
