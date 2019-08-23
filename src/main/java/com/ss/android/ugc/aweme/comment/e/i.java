package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.constants.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import java.util.List;
import java.util.concurrent.Callable;

public final class i extends b<CommentResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36423c;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36423c, false, 27344, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36423c, false, 27344, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36424a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f36424a, false, 27345, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f36424a, false, 27345, new Class[0], Object.class);
                    } else if (objArr.length == 5 && (objArr[2] instanceof List)) {
                        CommentResponse a2 = CommentApi.a((String) objArr[0], (String) objArr[1], null, (List) objArr[2], null, a.a((String) objArr[3]));
                        a2.comment.setFakeId((String) objArr[4]);
                        return a2;
                    } else if (objArr.length == 6) {
                        CommentResponse a3 = CommentApi.a((String) objArr[0], (String) objArr[1], (String) objArr[2], (List) objArr[3], null, a.a((String) objArr[4]));
                        a3.comment.setFakeId((String) objArr[5]);
                        return a3;
                    } else if (objArr.length != 7) {
                        return null;
                    } else {
                        CommentResponse a4 = CommentApi.a((String) objArr[0], (String) objArr[1], (String) objArr[2], (List) objArr[3], (String) objArr[4], a.a((String) objArr[5]));
                        a4.comment.setFakeId((String) objArr[6]);
                        return a4;
                    }
                }
            }, 0);
            return true;
        }
    }
}
