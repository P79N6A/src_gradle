package com.ss.android.ugc.aweme.comment.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.comment.model.Comment;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36386a;

    public static boolean a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, null, f36386a, true, 27292, new Class[]{Comment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment}, null, f36386a, true, 27292, new Class[]{Comment.class}, Boolean.TYPE)).booleanValue();
        } else if (comment != null && d.a().isLogin()) {
            return true;
        } else {
            return false;
        }
    }
}
