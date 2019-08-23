package com.ss.android.ugc.aweme.comment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.c;

public abstract /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36392a;

    public static boolean a(CommentInputManager.b bVar) {
        CommentInputManager.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f36392a, true, 27132, new Class[]{CommentInputManager.b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f36392a, true, 27132, new Class[]{CommentInputManager.b.class}, Boolean.TYPE)).booleanValue();
        }
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, bg.f75615a, true, 88276, new Class[]{Object.class}, Boolean.TYPE)) {
            return c.a().b((Object) bVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, null, bg.f75615a, true, 88276, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
