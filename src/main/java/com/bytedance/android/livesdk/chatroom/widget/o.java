package com.bytedance.android.livesdk.chatroom.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Looper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public final class o extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13532a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13533b;

    /* renamed from: c  reason: collision with root package name */
    private q f13534c;

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13532a, false, 7910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13532a, false, 7910, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f13534c.show();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13532a, false, 7911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13532a, false, 7911, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f13533b = true;
        if (this.f13534c != null && this.f13534c.isShowing()) {
            this.f13534c.dismiss();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f13532a, false, 7909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13532a, false, 7909, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, p.f13537a, true, 7913, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, p.f13537a, true, 7913, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        this.f13533b = true;
        this.f13534c.dismiss();
    }

    public o(Activity activity, Room room, boolean z, int i, String str) {
        super(activity, C0906R.style.w4);
        q qVar = new q(activity, room, z, i, str);
        this.f13534c = qVar;
        this.f13534c.setOnDismissListener(new DialogInterface.OnDismissListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13535a;

            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13535a, false, 7912, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13535a, false, 7912, new Class[]{DialogInterface.class}, Void.TYPE);
                } else if (!o.this.f13533b) {
                    o.this.dismiss();
                }
            }
        });
    }
}
