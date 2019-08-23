package com.bytedance.android.livesdk.gift.relay;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.GiftRelayViewHolder;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class GiftRelayAdapter extends RecyclerView.Adapter<GiftRelayViewHolder> implements GiftRelayViewHolder.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15407a;

    /* renamed from: b  reason: collision with root package name */
    final List<c.a> f15408b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public c.a f15409c;

    /* renamed from: d  reason: collision with root package name */
    public a f15410d;

    /* renamed from: e  reason: collision with root package name */
    private Context f15411e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutInflater f15412f;
    private c g;

    public interface a {
        void a(c.a aVar);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f15407a, false, 10084, new Class[0], Integer.TYPE)) {
            return this.f15408b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15407a, false, 10084, new Class[0], Integer.TYPE)).intValue();
    }

    public GiftRelayAdapter(Context context, c cVar) {
        this.f15411e = context;
        this.g = cVar;
        this.f15412f = LayoutInflater.from(this.f15411e);
    }

    public final void a(GiftRelayViewHolder giftRelayViewHolder, c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{giftRelayViewHolder, aVar}, this, f15407a, false, 10086, new Class[]{GiftRelayViewHolder.class, c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{giftRelayViewHolder, aVar}, this, f15407a, false, 10086, new Class[]{GiftRelayViewHolder.class, c.a.class}, Void.TYPE);
            return;
        }
        if (this.f15410d != null) {
            this.f15410d.a(aVar);
        }
        if (this.f15409c != null) {
            this.f15409c.f15445e = false;
            if (this.f15409c == aVar) {
                this.f15409c = null;
                return;
            }
        }
        if (aVar != null) {
            aVar.f15445e = true;
            this.f15409c = aVar;
        }
        giftRelayViewHolder.a(true);
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15407a, false, 10082, new Class[]{ViewGroup.class, Integer.TYPE}, GiftRelayViewHolder.class)) {
            return (GiftRelayViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15407a, false, 10082, new Class[]{ViewGroup.class, Integer.TYPE}, GiftRelayViewHolder.class);
        }
        GiftRelayViewHolder giftRelayViewHolder = new GiftRelayViewHolder(this.f15412f.inflate(C0906R.layout.aip, null), this.g);
        Point point = new Point();
        ((WindowManager) this.f15411e.getSystemService("window")).getDefaultDisplay().getSize(point);
        giftRelayViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams((point.x - ((int) ak.a(this.f15411e, 28.0f))) / 3, (int) ak.a(this.f15411e, 120.0f)));
        return giftRelayViewHolder;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        GiftRelayViewHolder giftRelayViewHolder = (GiftRelayViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{giftRelayViewHolder, Integer.valueOf(i)}, this, f15407a, false, 10083, new Class[]{GiftRelayViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{giftRelayViewHolder, Integer.valueOf(i)}, this, f15407a, false, 10083, new Class[]{GiftRelayViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c.a aVar = this.f15408b.get(i);
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[]{aVar}, giftRelayViewHolder, GiftRelayViewHolder.f15421a, false, 10121, new Class[]{c.a.class}, Void.TYPE)) {
                GiftRelayViewHolder giftRelayViewHolder2 = giftRelayViewHolder;
                PatchProxy.accessDispatch(new Object[]{aVar}, giftRelayViewHolder2, GiftRelayViewHolder.f15421a, false, 10121, new Class[]{c.a.class}, Void.TYPE);
            } else if (!(aVar == null || giftRelayViewHolder.g == null)) {
                Context context = giftRelayViewHolder.itemView.getContext();
                giftRelayViewHolder.a(aVar.f15445e);
                b.a(giftRelayViewHolder.f15422b, aVar.f15443c);
                b.a(giftRelayViewHolder.f15423c, aVar.f15444d);
                giftRelayViewHolder.f15424d.setText(aVar.f15441a);
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(giftRelayViewHolder.g.f15438c);
                if (findGiftById != null) {
                    i2 = findGiftById.f15107f;
                } else {
                    i2 = 0;
                }
                giftRelayViewHolder.f15425e.setText(String.valueOf(aVar.f15442b * i2));
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130841132);
                a2.setBounds(new Rect(0, 0, (int) ak.a(context, 12.0f), (int) UIUtils.dip2Px(context, 12.0f)));
                if (com.bytedance.android.live.uikit.d.c.a(context)) {
                    giftRelayViewHolder.f15425e.setCompoundDrawables(null, null, a2, null);
                } else {
                    giftRelayViewHolder.f15425e.setCompoundDrawables(a2, null, null, null);
                }
                giftRelayViewHolder.itemView.setOnClickListener(new h(giftRelayViewHolder, aVar));
            }
            giftRelayViewHolder.f15426f = this;
        }
    }
}
