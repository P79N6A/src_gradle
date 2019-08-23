package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView;

public class OnlyPictureSendViewHolder extends OnlyPictureViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51079a;
    private b r;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51079a, false, 51482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51079a, false, 51482, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.j);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51079a, false, 51481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51079a, false, 51481, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
        this.r = new b((CircleProgressTextView) this.itemView.findViewById(C0906R.id.c7v), this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51079a, false, 51483, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51079a, false, 51483, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener2);
    }

    public OnlyPictureSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, OnlyPictureContent onlyPictureContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, onlyPictureContent, Integer.valueOf(i)}, this, f51079a, false, 51484, new Class[]{n.class, n.class, OnlyPictureContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, onlyPictureContent, Integer.valueOf(i)}, this, f51079a, false, 51484, new Class[]{n.class, n.class, OnlyPictureContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, onlyPictureContent, i);
        if (PatchProxy.isSupport(new Object[0], this, f51079a, false, 51485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51079a, false, 51485, new Class[0], Void.TYPE);
        } else if (this.m.getMsgStatus() == 3) {
            this.j.setTag(50331648, 6);
            this.j.setTag(67108864, this.m);
            this.j.setImageResource(2130840085);
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        this.r.a(this.m);
    }
}
