package com.bytedance.android.livesdk.chatroom.ui;

import android.support.v7.widget.GridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class RoomDecorationListDialog$1 extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ eq f11767b;

    RoomDecorationListDialog$1(eq eqVar) {
        this.f11767b = eqVar;
    }

    public int getSpanSize(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11766a, false, 6407, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11766a, false, 6407, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (this.f11767b.f12214b.getItemViewType(i)) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
                return 1;
            default:
                return 1;
        }
    }
}
