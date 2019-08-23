package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import java.util.ArrayList;
import java.util.List;

public final class i extends g {
    public static ChangeQuickRedirect g;

    public final int a() {
        return 2130840077;
    }

    public final boolean g() {
        return true;
    }

    public final int h() {
        return 3;
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 50889, new Class[0], String.class)) {
            return GlobalContext.getContext().getString(C0906R.string.aon);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, g, false, 50889, new Class[0], String.class);
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 50887, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 50887, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f50580f == null || this.f50580f.size() == 0) {
            return 1;
        } else {
            return (this.f50580f.size() / 8) + 1;
        }
    }

    public final List<c> b(int i) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 50888, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 50888, new Class[]{Integer.TYPE}, List.class);
        }
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            c cVar = new c();
            if (i2 == 0) {
                cVar.f50559c = 2130839895;
                cVar.f50558b = GlobalContext.getContext().getString(C0906R.string.aon);
            } else {
                int i3 = i2 - 1;
                if (i3 < 0 || i3 >= this.f50580f.size()) {
                    aVar = null;
                } else {
                    aVar = (a) this.f50580f.get(i3);
                }
                if (aVar != null) {
                    cVar.f50558b = aVar.getRealDisplayName();
                    cVar.f50557a = aVar;
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
