package com.ss.android.ugc.aweme.face2face.ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44097a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceBaseViewHolder f44098b;

    /* renamed from: c  reason: collision with root package name */
    private final int f44099c;

    a(Face2FaceBaseViewHolder face2FaceBaseViewHolder, int i) {
        this.f44098b = face2FaceBaseViewHolder;
        this.f44099c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44097a, false, 39266, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44097a, false, 39266, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Face2FaceBaseViewHolder face2FaceBaseViewHolder = this.f44098b;
        int i = this.f44099c;
        if (face2FaceBaseViewHolder.f44092d != null) {
            face2FaceBaseViewHolder.f44092d.a(face2FaceBaseViewHolder.f44090b, face2FaceBaseViewHolder.f44091c, i);
        }
    }
}
