package com.bytedance.android.livesdk.chatroom.a;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9712a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9713b;

    b(a aVar) {
        this.f9713b = aVar;
    }

    public final void onClick(View view) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f9712a, false, 3922, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9712a, false, 3922, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9713b;
        int id = view.getId();
        if (id == C0906R.id.az4 || id == C0906R.id.d9k) {
            i = 0;
        } else if (!(id == C0906R.id.az3 || id == C0906R.id.d9j)) {
            if (id == C0906R.id.az2 || id == C0906R.id.d9i) {
                i = 2;
            } else {
                return;
            }
        }
        aVar.a(i);
        com.bytedance.android.livesdk.w.b.O.a(Integer.valueOf(i));
    }
}
