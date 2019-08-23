package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13140a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13141b;

    d(List list) {
        this.f13141b = list;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13140a, false, 6571, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13140a, false, 6571, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13141b.add((Bitmap) obj);
    }
}
