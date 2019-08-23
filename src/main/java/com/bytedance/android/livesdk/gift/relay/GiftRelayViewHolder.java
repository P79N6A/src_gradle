package com.bytedance.android.livesdk.gift.relay;

import android.content.res.Resources;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftRelayViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15421a;

    /* renamed from: b  reason: collision with root package name */
    HSImageView f15422b;

    /* renamed from: c  reason: collision with root package name */
    HSImageView f15423c;

    /* renamed from: d  reason: collision with root package name */
    TextView f15424d;

    /* renamed from: e  reason: collision with root package name */
    TextView f15425e;

    /* renamed from: f  reason: collision with root package name */
    public a f15426f;
    c g;
    private View h;

    public interface a {
        void a(GiftRelayViewHolder giftRelayViewHolder, c.a aVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15421a, false, 10122, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15421a, false, 10122, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.h;
        Resources resources = this.itemView.getContext().getResources();
        if (z) {
            i = 2130841073;
        } else {
            i = 2130841074;
        }
        view.setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(resources, i));
    }

    public GiftRelayViewHolder(@NonNull View view, c cVar) {
        super(view);
        this.h = view.findViewById(C0906R.id.ak3);
        this.f15422b = (HSImageView) view.findViewById(C0906R.id.akb);
        this.f15423c = (HSImageView) view.findViewById(C0906R.id.ak7);
        this.f15424d = (TextView) view.findViewById(C0906R.id.ak8);
        this.f15425e = (TextView) view.findViewById(C0906R.id.ak_);
        this.g = cVar;
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams != null) {
            Point point = new Point();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            layoutParams.width = ((point.x - ((int) ak.a(view.getContext(), 28.0f))) / 3) - ((int) ak.a(view.getContext(), 4.0f));
            this.h.setLayoutParams(layoutParams);
        }
    }
}
