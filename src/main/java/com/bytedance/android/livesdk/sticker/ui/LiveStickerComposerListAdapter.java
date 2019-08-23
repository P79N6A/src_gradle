package com.bytedance.android.livesdk.sticker.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public class LiveStickerComposerListAdapter extends RecyclerView.Adapter<StickerViewHolder> implements a.C0122a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17350a;

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.android.livesdk.sticker.c.a f17351b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdk.sticker.b.a f17352c;

    /* renamed from: d  reason: collision with root package name */
    List<com.bytedance.android.livesdk.sticker.b.a> f17353d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f17354e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.android.livesdk.sticker.b.a f17355f;

    class StickerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f17362a;

        /* renamed from: b  reason: collision with root package name */
        View f17363b;

        /* renamed from: c  reason: collision with root package name */
        View f17364c;

        /* renamed from: d  reason: collision with root package name */
        View f17365d;

        /* renamed from: e  reason: collision with root package name */
        View f17366e;

        StickerViewHolder(View view) {
            super(view);
            this.f17362a = (ImageView) view.findViewById(C0906R.id.ar6);
            this.f17363b = view.findViewById(C0906R.id.cmw);
            this.f17364c = view.findViewById(C0906R.id.a74);
            this.f17365d = view.findViewById(C0906R.id.biy);
            this.f17366e = view.findViewById(C0906R.id.a6a);
        }
    }

    public interface a {
        void a(com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f17350a, false, 13485, new Class[0], Integer.TYPE)) {
            return this.f17353d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17350a, false, 13485, new Class[0], Integer.TYPE)).intValue();
    }

    public LiveStickerComposerListAdapter(com.bytedance.android.livesdk.sticker.c.a aVar) {
        this.f17351b = aVar;
    }

    public final void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17350a, false, 13481, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17350a, false, 13481, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.sticker.b.a aVar2 = this.f17352c;
        this.f17352c = aVar;
        if (aVar2 != null && this.f17353d.contains(aVar2)) {
            int indexOf = this.f17353d.indexOf(aVar2);
            if (indexOf >= 0) {
                notifyItemChanged(indexOf);
            }
        }
        notifyDataSetChanged();
    }

    public final int b(com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17350a, false, 13489, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f17350a, false, 13489, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Integer.TYPE)).intValue();
        }
        for (int i = 0; i < this.f17353d.size(); i++) {
            if (com.bytedance.android.livesdk.sticker.b.a.a(aVar, this.f17353d.get(i))) {
                this.f17353d.set(i, aVar);
                return i;
            }
        }
        return -1;
    }

    public final void a(List<Effect> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f17350a, false, 13482, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f17350a, false, 13482, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f17353d.clear();
        for (Effect a2 : list) {
            com.bytedance.android.livesdk.sticker.b.a a3 = h.a(a2);
            a3.s = this.f17351b.a(a3);
            this.f17353d.add(a3);
        }
        notifyDataSetChanged();
    }

    public final void c(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17350a, false, 13488, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17350a, false, 13488, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.livesdk.sticker.b.a.a(this.f17355f, aVar) && this.f17354e != null) {
            com.bytedance.android.livesdk.sticker.b.a aVar2 = this.f17352c;
            this.f17352c = aVar;
            if (aVar2 != null && this.f17353d.contains(aVar2)) {
                int indexOf = this.f17353d.indexOf(aVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f17354e.a(this.f17352c);
        }
        int b2 = b(aVar);
        if (b2 >= 0) {
            notifyItemChanged(b2);
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17350a, false, 13483, new Class[]{ViewGroup.class, Integer.TYPE}, StickerViewHolder.class)) {
            return (StickerViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17350a, false, 13483, new Class[]{ViewGroup.class, Integer.TYPE}, StickerViewHolder.class);
        }
        return new StickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ajr, viewGroup2, false));
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.livesdk.sticker.b.a aVar, m mVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, mVar2}, this, f17350a, false, 13490, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, mVar2}, this, f17350a, false, 13490, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, m.class}, Void.TYPE);
        } else if (aVar2 == null || Lists.isEmpty(aVar2.g) || !aVar2.g.contains("new")) {
            mVar.b();
        } else {
            this.f17351b.a(aVar.a(), aVar2.l, mVar2);
        }
    }

    public final void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17350a, false, 13487, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17350a, false, 13487, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.dda);
        int b2 = b(aVar);
        if (b2 >= 0) {
            notifyItemChanged(b2);
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        final StickerViewHolder stickerViewHolder = (StickerViewHolder) viewHolder;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{stickerViewHolder, Integer.valueOf(i)}, this, f17350a, false, 13484, new Class[]{StickerViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{stickerViewHolder, Integer.valueOf(i)}, this, f17350a, false, 13484, new Class[]{StickerViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.sticker.b.a aVar = this.f17353d.get(i);
        if (aVar != null) {
            if (!aVar.s && this.f17351b != null && this.f17351b.a(aVar)) {
                aVar.t = false;
                aVar.s = true;
            }
            b.a(stickerViewHolder.f17362a, aVar.f17250b.a());
            View view = stickerViewHolder.f17365d;
            int i4 = 8;
            if (aVar.t) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = stickerViewHolder.f17364c;
            if (!aVar.s) {
                i4 = 0;
            }
            view2.setVisibility(i4);
            boolean a2 = com.bytedance.android.livesdk.sticker.b.a.a(this.f17352c, aVar);
            View view3 = stickerViewHolder.f17363b;
            if (!a2) {
                i3 = 4;
            }
            view3.setVisibility(i3);
            a(aVar, (m) new m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17356a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f17356a, false, 13493, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f17356a, false, 13493, new Class[0], Void.TYPE);
                        return;
                    }
                    stickerViewHolder.f17366e.setVisibility(0);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f17356a, false, 13494, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f17356a, false, 13494, new Class[0], Void.TYPE);
                        return;
                    }
                    stickerViewHolder.f17366e.setVisibility(8);
                }
            });
            stickerViewHolder.itemView.setOnClickListener(new m(this, i, stickerViewHolder, aVar));
        }
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17350a, false, 13486, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17350a, false, 13486, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        int b2 = b(aVar);
        if (b2 >= 0) {
            notifyItemChanged(b2);
        }
    }
}
