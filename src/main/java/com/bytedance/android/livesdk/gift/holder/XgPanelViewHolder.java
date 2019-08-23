package com.bytedance.android.livesdk.gift.holder;

import android.support.annotation.NonNull;
import android.view.View;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class XgPanelViewHolder extends BaseGiftPanelViewHolder<a> implements View.OnClickListener {
    public static ChangeQuickRedirect p;
    public SendGiftAnimationView q;
    private View r;
    private a s;
    private boolean t;

    public final ComboTarget a() {
        return null;
    }

    public final void a(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, p, false, 9744, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, p, false, 9744, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.s = aVar;
        this.r = this.j.findViewById(C0906R.id.yx);
        this.q = (SendGiftAnimationView) this.j.findViewById(C0906R.id.f_);
        super.a(aVar);
        if (this.t) {
            if (getAdapterPosition() == 0) {
                aVar.f15096b = true;
                a(true);
                return;
            }
            this.j.setAlpha(0.3f);
            this.j.setEnabled(false);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 9746, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 9746, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.f_ && (view instanceof SendGiftAnimationView)) {
            ((SendGiftAnimationView) view).a(0.7f);
            if (this.n != null) {
                this.n.a(this, this.s);
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, p, false, 9745, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, p, false, 9745, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.s != null && (this.s.f15098d instanceof b)) {
            if (z) {
                this.q.a();
                this.q.a((b) this.s.f15098d);
                this.r.setVisibility(8);
                this.q.setVisibility(0);
                this.q.a(1.08f);
                this.q.setOnClickListener(this);
                return;
            }
            this.r.setVisibility(0);
            this.q.setVisibility(8);
        }
    }

    public XgPanelViewHolder(View view, boolean z) {
        super(view);
        this.t = z;
    }
}
