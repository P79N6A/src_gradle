package com.ss.android.ugc.aweme.miniapp.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.miniapp.t;
import com.ss.android.ugc.aweme.miniapp.x;
import com.tt.option.menu.AbstractHostOptionMenuDepend;
import com.tt.option.menu.ITitleMenuItem;
import java.util.ArrayList;
import java.util.List;

public final class e extends AbstractHostOptionMenuDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55680a;

    public final List<ITitleMenuItem> createTitleMenuItems() {
        if (PatchProxy.isSupport(new Object[0], this, f55680a, false, 59387, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f55680a, false, 59387, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!a.a()) {
            arrayList.add(new t());
            arrayList.add(new x());
        }
        return arrayList;
    }
}
