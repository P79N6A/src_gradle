package com.ss.android.ugc.aweme.comment.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.user.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36280a;

    public static void a(Comment comment, String str) {
        Comment comment2 = comment;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{comment2, str2}, null, f36280a, true, 27187, new Class[]{Comment.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, str2}, null, f36280a, true, 27187, new Class[]{Comment.class, String.class}, Void.TYPE);
            return;
        }
        if (comment.getUserDigged() == 1) {
            comment2.setUserDigged(0);
            comment2.setDiggCount(comment.getDiggCount() - 1);
        } else {
            comment2.setUserDigged(1);
            comment2.setDiggCount(comment.getDiggCount() + 1);
        }
        if (AbTestManager.a().bZ() && TextUtils.equals(str2, c.a().e()) && comment.getLabelType() != 1) {
            if (comment.getUserDigged() == 1) {
                z = true;
            }
            comment2.setAuthorDigged(z);
        }
    }
}
