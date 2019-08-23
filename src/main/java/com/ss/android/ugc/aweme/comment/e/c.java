package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

public final class c extends b<BaseCommentResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36397c;

    /* renamed from: d  reason: collision with root package name */
    public String f36398d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f36399e = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36397c, false, 27324, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36397c, false, 27324, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36400a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f36400a, false, 27325, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f36400a, false, 27325, new Class[0], Object.class);
                    }
                    c.this.f36398d = (String) objArr[0];
                    return CommentApi.a((String) objArr[0]);
                }
            }, 0);
            return true;
        }
    }
}
