package com.ss.android.ugc.aweme.comment.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.comment.d.a;
import java.io.Serializable;

public class a<T extends a> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String aid;
    protected String authorUid;
    protected String cid;

    public String getAid() {
        return this.aid;
    }

    public String getAuthorUid() {
        return this.authorUid;
    }

    public String getCid() {
        return this.cid;
    }

    public a setAid(String str) {
        this.aid = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.authorUid = str;
        return this;
    }

    public a setCid(String str) {
        this.cid = str;
        return this;
    }

    public a(String str) {
        this.aid = str;
    }
}
