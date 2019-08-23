package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.view.DragIndexView;
import com.bytedance.android.livesdk.livecommerce.view.ECBroadcastExplainButton;
import com.bytedance.android.livesdk.livecommerce.view.ECHostCouponView;
import com.bytedance.android.livesdk.livecommerce.view.ECHostDeleteTextButton;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveRoomPromotionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, DragIndexView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16011a;

    /* renamed from: b  reason: collision with root package name */
    DragIndexView f16012b;

    /* renamed from: c  reason: collision with root package name */
    ECPromotionImageView f16013c;

    /* renamed from: d  reason: collision with root package name */
    TextView f16014d;

    /* renamed from: e  reason: collision with root package name */
    ECPriceView f16015e;

    /* renamed from: f  reason: collision with root package name */
    ECBroadcastExplainButton f16016f;
    ECHostDeleteTextButton g;
    ECHostCouponView h;
    ECHostCouponView i;
    a j;
    int k;
    e l;

    public interface a {
        String a();

        void a(int i, String str);

        void a(int i, String str, boolean z);

        void a(Context context, boolean z, String str, String str2);

        boolean j_();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16011a, false, 10521, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16011a, false, 10521, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view == this.f16016f) {
            if (this.l.a() || this.f16016f.f16239b) {
                this.j.a(view.getContext(), !this.f16016f.f16239b, this.l.m, this.l.k);
            }
        } else if (view == this.g) {
            this.j.a(this.k, this.l.m);
        }
    }

    public final void a(View view, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16011a, false, 10522, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f16011a, false, 10522, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (view == this.f16012b) {
            this.j.a(this.k, this.l.m, z);
        }
    }

    public LiveRoomPromotionViewHolder(@NonNull ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.lh, viewGroup, false));
        this.j = aVar;
        if (PatchProxy.isSupport(new Object[0], this, f16011a, false, 10519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16011a, false, 10519, new Class[0], Void.TYPE);
        } else {
            this.f16012b = (DragIndexView) this.itemView.findViewById(C0906R.id.a5p);
            this.f16013c = (ECPromotionImageView) this.itemView.findViewById(C0906R.id.bya);
            this.f16013c.a();
            this.f16014d = (TextView) this.itemView.findViewById(C0906R.id.dgt);
            this.f16015e = (ECPriceView) this.itemView.findViewById(C0906R.id.a8e);
            this.f16016f = (ECBroadcastExplainButton) this.itemView.findViewById(C0906R.id.k1);
            ECBroadcastExplainButton eCBroadcastExplainButton = this.f16016f;
            if (PatchProxy.isSupport(new Object[0], eCBroadcastExplainButton, ECBroadcastExplainButton.f16238a, false, 10774, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eCBroadcastExplainButton, ECBroadcastExplainButton.f16238a, false, 10774, new Class[0], Void.TYPE);
            } else {
                ViewGroup.LayoutParams layoutParams = eCBroadcastExplainButton.getLayoutParams();
                Context context = eCBroadcastExplainButton.getContext();
                if (!(layoutParams == null || context == null || !com.bytedance.android.livesdk.livecommerce.f.a.a())) {
                    layoutParams.width = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 88.0f);
                    layoutParams.height = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 28.0f);
                    eCBroadcastExplainButton.setLayoutParams(layoutParams);
                }
            }
            this.g = (ECHostDeleteTextButton) this.itemView.findViewById(C0906R.id.dar);
            this.g.a();
            this.h = (ECHostCouponView) this.itemView.findViewById(C0906R.id.bg9);
            this.i = (ECHostCouponView) this.itemView.findViewById(C0906R.id.bg_);
            this.f16012b.setOnClickIndexListener(this);
            this.f16016f.setOnClickListener(this);
            this.g.setOnClickListener(this);
        }
        this.itemView.setOnClickListener(this);
    }
}
