package com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FaceMattingLoadingViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69444a;

    /* renamed from: b  reason: collision with root package name */
    private ObjectAnimator f69445b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f69446c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69444a, false, 79017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69444a, false, 79017, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69444a, false, 79018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69444a, false, 79018, new Class[0], Void.TYPE);
            return;
        }
        this.f69445b = ObjectAnimator.ofFloat(this.f69446c, "rotation", new float[]{0.0f, 360.0f});
        this.f69445b.setDuration(800);
        this.f69445b.setRepeatMode(1);
        this.f69445b.setRepeatCount(-1);
        this.f69445b.start();
    }

    public FaceMattingLoadingViewHolder(View view) {
        super(view);
        this.f69446c = (ImageView) view.findViewById(C0906R.id.b2w);
    }
}
