package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class be extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11914a;

    public be(Context context) {
        super(context, C0906R.style.vy);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11914a, false, 5748, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11914a, false, 5748, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.age, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
    }
}
