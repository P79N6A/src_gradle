package com.ss.android.ugc.aweme.story.comment.view;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import java.util.Map;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72302a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentActivity f72303b;

    b(CommentActivity commentActivity) {
        this.f72303b = commentActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f72302a, false, 82936, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f72302a, false, 82936, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CommentActivity commentActivity = this.f72303b;
        Map map = (Map) ((a) obj).a();
        if (PatchProxy.isSupport(new Object[]{map}, commentActivity, CommentActivity.f72210a, false, 82916, new Class[]{Map.class}, Void.TYPE)) {
            CommentActivity commentActivity2 = commentActivity;
            PatchProxy.accessDispatch(new Object[]{map}, commentActivity2, CommentActivity.f72210a, false, 82916, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        if (map != null) {
            commentActivity.m.putAll(map);
        }
    }
}
