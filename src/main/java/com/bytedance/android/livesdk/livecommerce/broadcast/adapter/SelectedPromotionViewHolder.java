package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.view.DragIndexView;
import com.bytedance.android.livesdk.livecommerce.view.ECHostDeleteTextButton;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SelectedPromotionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, DragIndexView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16020a;

    /* renamed from: b  reason: collision with root package name */
    DragIndexView f16021b;

    /* renamed from: c  reason: collision with root package name */
    ECPromotionImageView f16022c;

    /* renamed from: d  reason: collision with root package name */
    TextView f16023d;

    /* renamed from: e  reason: collision with root package name */
    ECPriceView f16024e;

    /* renamed from: f  reason: collision with root package name */
    int f16025f;
    e g;
    private ECHostDeleteTextButton h;
    private View i;
    private a j;

    public interface a {
        void a(int i, String str);

        void a(int i, String str, boolean z);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16020a, false, 10528, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16020a, false, 10528, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view == this.h) {
            this.j.a(this.f16025f, this.g.m);
        }
    }

    public final void a(View view, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16020a, false, 10529, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f16020a, false, 10529, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (view == this.f16021b) {
            this.j.a(this.f16025f, this.g.m, z);
        }
    }

    public SelectedPromotionViewHolder(@NonNull ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.lk, viewGroup, false));
        this.j = aVar;
        if (PatchProxy.isSupport(new Object[0], this, f16020a, false, 10526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16020a, false, 10526, new Class[0], Void.TYPE);
        } else {
            this.f16021b = (DragIndexView) this.itemView.findViewById(C0906R.id.a5p);
            this.f16022c = (ECPromotionImageView) this.itemView.findViewById(C0906R.id.bya);
            this.f16022c.a();
            this.f16023d = (TextView) this.itemView.findViewById(C0906R.id.dgt);
            this.f16024e = (ECPriceView) this.itemView.findViewById(C0906R.id.a8e);
            this.h = (ECHostDeleteTextButton) this.itemView.findViewById(C0906R.id.dar);
            this.h.a();
            this.i = this.itemView.findViewById(C0906R.id.dqq);
            if (!com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                this.i.setVisibility(8);
            }
            this.f16021b.setOnClickIndexListener(this);
            this.h.setOnClickListener(this);
        }
        this.itemView.setOnClickListener(this);
    }
}
