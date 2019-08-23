package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.event.am;
import com.bytedance.android.livesdk.message.c;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class eg implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12141a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnLongClickListener f12142b = new eg();

    private eg() {
    }

    public final boolean onLongClick(View view) {
        View view2 = view;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12141a, false, 6281, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f12141a, false, 6281, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        Object tag = view2.getTag(C0906R.id.d7n);
        if (tag instanceof b) {
            b bVar = (b) tag;
            Context context = view.getContext();
            if (PatchProxy.isSupport(new Object[]{context}, bVar, b.f10012a, false, 5361, new Class[]{Context.class}, Boolean.TYPE)) {
                b bVar2 = bVar;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, bVar2, b.f10012a, false, 5361, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (bVar.e() != null) {
                a.a().a((Object) new am(1, c.a(bVar.e())));
                return true;
            }
        }
        return z;
    }
}
