package com.ss.android.ugc.aweme.poi.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int orderResult;
    public String pageType;

    public boolean isSuccess() {
        if (this.orderResult == 1) {
            return true;
        }
        return false;
    }

    public boolean isBookOrder() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64944, new Class[0], Boolean.TYPE)) {
            return "book".equalsIgnoreCase(this.pageType);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64944, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public b(String str, int i) {
        this.pageType = str;
        this.orderResult = i;
    }
}
