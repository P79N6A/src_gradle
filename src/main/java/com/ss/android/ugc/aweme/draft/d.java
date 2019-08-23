package com.ss.android.ugc.aweme.draft;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.shortvideo.ej;

public final /* synthetic */ class d implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43474a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeDraftViewHolder f43475b;

    d(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f43475b = awemeDraftViewHolder;
    }

    public final boolean onLongClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f43474a, false, 38383, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f43474a, false, 38383, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        AwemeDraftViewHolder awemeDraftViewHolder = this.f43475b;
        if (PatchProxy.isSupport(new Object[]{view2}, awemeDraftViewHolder, AwemeDraftViewHolder.f3080a, false, 38378, new Class[]{View.class}, Boolean.TYPE)) {
            AwemeDraftViewHolder awemeDraftViewHolder2 = awemeDraftViewHolder;
            ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, awemeDraftViewHolder2, AwemeDraftViewHolder.f3080a, false, 38378, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (ej.a().a(view.getContext())) {
            awemeDraftViewHolder.s.a(view2, (c) awemeDraftViewHolder.g);
        }
        return true;
    }
}
