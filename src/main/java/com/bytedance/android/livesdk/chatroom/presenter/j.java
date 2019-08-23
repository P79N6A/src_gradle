package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.presenter.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11367a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11368b;

    j(i iVar) {
        this.f11368b = iVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11367a, false, 5172, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11367a, false, 5172, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i iVar = this.f11368b;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            String str = null;
            if (th instanceof a) {
                str = ((a) th).getPrompt();
            }
            if (TextUtils.isEmpty(str)) {
                str = iVar.a((int) C0906R.string.cuv);
            }
            if (iVar.b() != null) {
                ((i.a) iVar.b()).a(str);
            }
        }
    }
}
