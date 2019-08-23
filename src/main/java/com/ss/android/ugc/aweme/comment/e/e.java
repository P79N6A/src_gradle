package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.constants.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

public final class e extends b<BaseCommentResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36404c;

    /* renamed from: d  reason: collision with root package name */
    public String f36405d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f36406e = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36404c, false, 27328, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36404c, false, 27328, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36407a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f36407a, false, 27329, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f36407a, false, 27329, new Class[0], Object.class);
                    }
                    e.this.f36405d = (String) objArr[0];
                    e.this.f36406e = (String) objArr[1];
                    return CommentApi.a((String) objArr[0], (String) objArr[1], (String) objArr[2], a.a((String) objArr[3]));
                }
            }, 0);
            return true;
        }
    }
}
