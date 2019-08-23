package com.ss.android.ugc.aweme.face2face.ui.viewholder;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFriendsAdapter;

public class Face2FaceBaseViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44089a;

    /* renamed from: b  reason: collision with root package name */
    View f44090b;

    /* renamed from: c  reason: collision with root package name */
    f f44091c;

    /* renamed from: d  reason: collision with root package name */
    Face2FaceFriendsAdapter.a f44092d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarImageView f44093e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f44094f;

    Face2FaceBaseViewHolder(@NonNull View view, Face2FaceFriendsAdapter.a aVar) {
        super(view);
        this.f44092d = aVar;
        this.f44093e = (AvatarImageView) ViewCompat.requireViewById(view, C0906R.id.aw_);
        this.f44094f = (TextView) ViewCompat.requireViewById(view, C0906R.id.axy);
        this.f44090b = ViewCompat.requireViewById(view, C0906R.id.abn);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(f fVar, int i) {
        if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f44089a, false, 39265, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f44089a, false, 39265, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f44091c = fVar;
        c.b(this.f44093e, this.f44091c.getUser().getAvatarMedium());
        this.f44094f.setText(this.f44091c.getUser().getNickname());
        this.f44090b.setOnClickListener(new a(this, i));
        this.f44090b.setOnTouchListener(b.f44101b);
    }
}
