package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.c.d;
import com.bytedance.android.livesdk.livecommerce.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FooterHolder extends PromotionViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15994a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f15995b = ((TextView) this.itemView.findViewById(C0906R.id.dcs));

    public FooterHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.lf, viewGroup, false));
    }

    public final void a(f fVar, int i, boolean z) {
        int i2;
        f fVar2 = fVar;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15994a, false, 10507, new Class[]{f.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f15994a, false, 10507, new Class[]{f.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (fVar2 instanceof d) {
            z2 = ((d) fVar2).f16125a;
        }
        TextView textView = this.f15995b;
        if (z2) {
            i2 = C0906R.string.a9c;
        } else {
            i2 = C0906R.string.a9b;
        }
        textView.setText(i2);
    }
}
