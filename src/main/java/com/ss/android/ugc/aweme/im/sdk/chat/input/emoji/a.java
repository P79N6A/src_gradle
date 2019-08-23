package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.content.Context;
import com.bytedance.ies.dmt.ui.input.emoji.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.im.sdk.chat.input.a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50549d;

    /* renamed from: e  reason: collision with root package name */
    private f f50550e;

    /* renamed from: f  reason: collision with root package name */
    private int f50551f;

    public final int a() {
        return 2130838905;
    }

    public final int f() {
        return 20;
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f50549d, false, 50765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50549d, false, 50765, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50551f == 0) {
            this.f50551f = this.f50550e.a();
        }
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f50549d, false, 50766, new Class[0], String.class)) {
            return GlobalContext.getContext().getString(C0906R.string.aoi);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50549d, false, 50766, new Class[0], String.class);
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f50549d, false, 50763, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50549d, false, 50763, new Class[0], Integer.TYPE)).intValue();
        }
        j();
        if (this.f50551f == 0) {
            return 1;
        }
        return ((this.f50551f - 1) / 20) + 1;
    }

    public final int i() {
        if (PatchProxy.isSupport(new Object[0], this, f50549d, false, 50764, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50549d, false, 50764, new Class[0], Integer.TYPE)).intValue();
        }
        j();
        return this.f50551f;
    }

    public a(Context context) {
        this.f50550e = f.a(context);
    }

    public final List<c> b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50549d, false, 50762, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50549d, false, 50762, new Class[]{Integer.TYPE}, List.class);
        }
        ArrayList arrayList = new ArrayList(21);
        int i2 = (i + 1) * 20;
        for (int i3 = i * 20; i3 < i2; i3++) {
            c cVar = new c();
            cVar.f50559c = this.f50550e.a(i3);
            cVar.f50558b = this.f50550e.b(i3);
            arrayList.add(cVar);
        }
        c cVar2 = new c();
        cVar2.f50559c = 2130838997;
        cVar2.f50558b = GlobalContext.getContext().getString(C0906R.string.a4f);
        arrayList.add(cVar2);
        return arrayList;
    }
}
