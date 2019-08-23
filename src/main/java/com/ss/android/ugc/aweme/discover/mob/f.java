package com.ss.android.ugc.aweme.discover.mob;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.a.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.HashMap;

public final class f extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String enterFrom;
    private String enterMethod;
    private int order;
    private String rid;
    private String searchKeyword;

    public final HashMap<String, String> buildParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36969, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36969, new Class[0], HashMap.class);
        }
        appendParam("order", String.valueOf(this.order), d.a.f75112a);
        appendParam("search_keyword", this.searchKeyword, d.a.f75112a);
        appendParam("request_id", this.rid, d.a.f75112a);
        appendParam("enter_from", this.enterFrom, d.a.f75112a);
        appendParam("enter_method", this.enterMethod, d.a.f75112a);
        appendParam("lob_pb", this.rid, d.a.f75112a);
        return this.params;
    }

    public final f setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public final f setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public final f setOrder(int i) {
        this.order = i;
        return this;
    }

    public final f setRid(String str) {
        this.rid = str;
        return this;
    }

    public final f setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }
}
