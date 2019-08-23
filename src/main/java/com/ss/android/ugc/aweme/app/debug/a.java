package com.ss.android.ugc.aweme.app.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.annotation.c;
import java.io.Serializable;
import java.util.ArrayList;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String category;

    public ArrayList<c> getExtraInfoDelegates() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23323, new Class[0], ArrayList.class)) {
            return c.f63822b.get(this.category);
        }
        return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23323, new Class[0], ArrayList.class);
    }

    public a setCategory(String str) {
        this.category = str;
        return this;
    }
}
