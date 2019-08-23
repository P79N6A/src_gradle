package com.ss.android.ugc.aweme.discover.mob;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.a.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.HashMap;

public final class c extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bannerId;
    private int clientOrder;
    private String enterFrom = "discovery";
    private String tagId;

    public final HashMap<String, String> buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36960, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36960, new Class[0], HashMap.class);
        }
        appendParam("banner_id", this.bannerId, d.a.f75113b);
        appendParam("enter_from", this.enterFrom, d.a.f75112a);
        appendParam("tag_id", this.tagId, d.a.f75112a);
        appendParam("client_order", String.valueOf(this.clientOrder), d.a.f75112a);
        return this.params;
    }

    public final c setBannerId(String str) {
        this.bannerId = str;
        return this;
    }

    public final c setClientOrder(int i) {
        this.clientOrder = i;
        return this;
    }

    public final c setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public final c setTagId(String str) {
        this.tagId = str;
        return this;
    }
}
