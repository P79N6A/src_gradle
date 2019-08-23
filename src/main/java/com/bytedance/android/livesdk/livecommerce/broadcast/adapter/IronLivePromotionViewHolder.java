package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.view.ECHostCouponView;
import com.bytedance.android.livesdk.livecommerce.view.ECHostOpenDetailTextButton;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.bytedance.android.livesdk.livecommerce.view.IronPromotionIndexView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class IronLivePromotionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16001a;

    /* renamed from: b  reason: collision with root package name */
    ECPromotionImageView f16002b;

    /* renamed from: c  reason: collision with root package name */
    IronPromotionIndexView f16003c;

    /* renamed from: d  reason: collision with root package name */
    TextView f16004d;

    /* renamed from: e  reason: collision with root package name */
    ECPriceView f16005e;

    /* renamed from: f  reason: collision with root package name */
    ECHostOpenDetailTextButton f16006f;
    ECHostCouponView g;
    ECHostCouponView h;
    a i;
    e j;
    int k;

    public interface a {
        String a();

        void a(Context context, e eVar);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16001a, false, 10514, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16001a, false, 10514, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view == this.f16006f || view == this.itemView) {
            this.i.a(view.getContext(), this.j);
        }
    }

    public IronLivePromotionViewHolder(@NonNull ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.lg, viewGroup, false));
        this.i = aVar;
        if (PatchProxy.isSupport(new Object[0], this, f16001a, false, 10512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16001a, false, 10512, new Class[0], Void.TYPE);
        } else {
            this.f16002b = (ECPromotionImageView) this.itemView.findViewById(C0906R.id.bya);
            this.f16002b.a(com.bytedance.android.livesdk.livecommerce.f.a.a(this.itemView.getContext().getApplicationContext(), 96.0f));
            this.f16003c = (IronPromotionIndexView) this.itemView.findViewById(C0906R.id.avi);
            this.f16004d = (TextView) this.itemView.findViewById(C0906R.id.dgt);
            this.f16005e = (ECPriceView) this.itemView.findViewById(C0906R.id.a8e);
            this.f16006f = (ECHostOpenDetailTextButton) this.itemView.findViewById(C0906R.id.dfr);
            this.g = (ECHostCouponView) this.itemView.findViewById(C0906R.id.bg9);
            this.h = (ECHostCouponView) this.itemView.findViewById(C0906R.id.bg_);
            ECHostOpenDetailTextButton eCHostOpenDetailTextButton = this.f16006f;
            if (PatchProxy.isSupport(new Object[0], eCHostOpenDetailTextButton, ECHostOpenDetailTextButton.f16259a, false, 10787, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eCHostOpenDetailTextButton, ECHostOpenDetailTextButton.f16259a, false, 10787, new Class[0], Void.TYPE);
            } else {
                if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    eCHostOpenDetailTextButton.setTypeface(Typeface.DEFAULT_BOLD);
                }
                ViewGroup.LayoutParams layoutParams = eCHostOpenDetailTextButton.getLayoutParams();
                Context context = eCHostOpenDetailTextButton.getContext();
                if (!(layoutParams == null || context == null)) {
                    if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                        layoutParams.width = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 88.0f);
                        layoutParams.height = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 32.0f);
                        eCHostOpenDetailTextButton.setLayoutParams(layoutParams);
                    } else {
                        layoutParams.width = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 80.0f);
                        layoutParams.height = com.bytedance.android.livesdk.livecommerce.f.a.a(context, 28.0f);
                        eCHostOpenDetailTextButton.setLayoutParams(layoutParams);
                    }
                }
            }
            this.f16006f.setOnClickListener(this);
            this.itemView.setOnClickListener(this);
        }
        this.itemView.setOnClickListener(this);
    }
}
