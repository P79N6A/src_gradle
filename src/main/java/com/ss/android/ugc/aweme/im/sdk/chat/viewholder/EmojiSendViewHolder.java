package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;

public class EmojiSendViewHolder extends EmojiViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51063a;
    private c p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51063a, false, 51456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51063a, false, 51456, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
        this.p = new c(this.j);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51063a, false, 51457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51063a, false, 51457, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51063a, false, 51458, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51063a, false, 51458, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener2);
    }

    public EmojiSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, EmojiContent emojiContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, emojiContent, Integer.valueOf(i)}, this, f51063a, false, 51459, new Class[]{n.class, n.class, EmojiContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, emojiContent, Integer.valueOf(i)}, this, f51063a, false, 51459, new Class[]{n.class, n.class, EmojiContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, emojiContent, i);
        this.p.a(this.m);
    }
}
