package com.bytedance.android.livesdk.sticker.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.sticker.ui.LiveGestureMagicPageAdapter;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiveGestureMagicAdapter extends RecyclerView.Adapter implements a.C0122a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17314a;

    /* renamed from: b  reason: collision with root package name */
    final a f17315b;

    /* renamed from: c  reason: collision with root package name */
    public LiveGestureMagicPageAdapter.a f17316c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.livesdk.sticker.b.a f17317d;

    /* renamed from: e  reason: collision with root package name */
    List<com.bytedance.android.livesdk.sticker.b.a> f17318e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.android.livesdk.sticker.b.a f17319f;
    boolean g;
    com.bytedance.android.livesdk.sticker.b.a h;
    boolean i;
    private EffectCategoryResponse j;

    class GestureMagicTipViewHolder extends RecyclerView.ViewHolder {
        GestureMagicTipViewHolder(View view) {
            super(view);
        }
    }

    class GestureMagicViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f17321a;

        /* renamed from: b  reason: collision with root package name */
        public final View f17322b;

        /* renamed from: c  reason: collision with root package name */
        public final View f17323c;

        /* renamed from: d  reason: collision with root package name */
        public final ProgressBar f17324d;

        GestureMagicViewHolder(View view) {
            super(view);
            this.f17321a = (ImageView) view.findViewById(C0906R.id.ar6);
            this.f17322b = view.findViewById(C0906R.id.j9);
            this.f17323c = view.findViewById(C0906R.id.a74);
            this.f17324d = (ProgressBar) view.findViewById(C0906R.id.biy);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f17314a, false, 13433, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17314a, false, 13433, new Class[0], Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.f17318e)) {
            return 0;
        } else {
            if (this.f17318e.size() <= 3) {
                return this.f17318e.size() + 1;
            }
            return this.f17318e.size();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17314a, false, 13435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17314a, false, 13435, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        if (this.j != null && !Lists.isEmpty(this.j.totalEffects) && !this.g) {
            this.g = true;
            if (this.h == null) {
                for (com.bytedance.android.livesdk.sticker.b.a next : this.f17318e) {
                    Iterator<com.bytedance.android.livesdk.sticker.b.a> it2 = j.q().o().a(a.f17261b).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().a(next)) {
                                this.f17317d = next;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (this.f17317d != null) {
                        break;
                    }
                }
                if (this.f17317d == null) {
                    this.f17317d = h.a(this.j.totalEffects.get(0));
                }
            } else {
                this.f17317d = this.h;
            }
            if (!this.f17315b.a(this.f17317d)) {
                this.f17319f = this.f17317d;
                this.f17315b.a(a.f17261b, this.f17317d, (a.C0122a) this);
            } else if (this.f17316c != null) {
                this.f17316c.a(Boolean.TRUE, this.f17317d);
            }
            if (this.f17316c != null) {
                this.f17316c.a(Boolean.TRUE, this.f17317d);
            }
            notifyDataSetChanged();
        }
    }

    public LiveGestureMagicAdapter(a aVar) {
        this.f17315b = aVar;
    }

    /* access modifiers changed from: package-private */
    public int a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17314a, false, 13440, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f17314a, false, 13440, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Integer.TYPE)).intValue();
        }
        for (int i2 = 0; i2 < this.f17318e.size(); i2++) {
            if (com.bytedance.android.livesdk.sticker.b.a.a(aVar, this.f17318e.get(i2))) {
                this.f17318e.set(i2, aVar);
                return i2;
            }
        }
        return -1;
    }

    public int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17314a, false, 13434, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17314a, false, 13434, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 >= this.f17318e.size()) {
            return 2;
        } else {
            return 1;
        }
    }

    public final void a(EffectCategoryResponse effectCategoryResponse) {
        if (PatchProxy.isSupport(new Object[]{effectCategoryResponse}, this, f17314a, false, 13430, new Class[]{EffectCategoryResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryResponse}, this, f17314a, false, 13430, new Class[]{EffectCategoryResponse.class}, Void.TYPE);
            return;
        }
        if (effectCategoryResponse != null && !Lists.isEmpty(effectCategoryResponse.totalEffects)) {
            this.j = effectCategoryResponse;
            this.f17318e.clear();
            for (Effect a2 : effectCategoryResponse.totalEffects) {
                com.bytedance.android.livesdk.sticker.b.a a3 = h.a(a2);
                a3.s = this.f17315b.a(a3);
                this.f17318e.add(a3);
            }
            if (this.i) {
                a();
                this.i = false;
            }
            notifyDataSetChanged();
        }
    }

    public final void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17314a, false, 13438, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17314a, false, 13438, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d1c);
        int a2 = a(aVar);
        if (a2 >= 0) {
            notifyItemChanged(a2);
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f17314a, false, 13431, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f17314a, false, 13431, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 2) {
            return new GestureMagicTipViewHolder(from.inflate(C0906R.layout.ajo, viewGroup, false));
        }
        return new GestureMagicViewHolder(from.inflate(C0906R.layout.ajm, viewGroup, false));
    }

    public final void c(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17314a, false, 13439, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17314a, false, 13439, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        if (this.g && aVar.f17252d == this.f17319f.f17252d && this.f17316c != null) {
            this.f17316c.a(Boolean.FALSE, this.f17317d);
            com.bytedance.android.livesdk.sticker.b.a aVar2 = this.f17317d;
            this.f17317d = aVar;
            if (aVar2 != null && this.f17318e.contains(aVar2)) {
                int indexOf = this.f17318e.indexOf(aVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f17316c.a(Boolean.TRUE, this.f17317d);
        }
        int a2 = a(aVar);
        if (a2 >= 0) {
            notifyItemChanged(a2);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f17314a, false, 13432, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f17314a, false, 13432, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i2) == 1) {
            GestureMagicViewHolder gestureMagicViewHolder = (GestureMagicViewHolder) viewHolder;
            com.bytedance.android.livesdk.sticker.b.a aVar = this.f17318e.get(i2);
            b.a(gestureMagicViewHolder.f17321a, aVar.f17250b.a());
            int i5 = 8;
            gestureMagicViewHolder.f17322b.setVisibility(8);
            if (this.f17317d != null && this.f17317d.f17252d == aVar.f17252d) {
                gestureMagicViewHolder.f17322b.setVisibility(0);
            }
            ProgressBar progressBar = gestureMagicViewHolder.f17324d;
            if (aVar.t) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            progressBar.setVisibility(i3);
            View view = gestureMagicViewHolder.f17323c;
            if (!aVar.s) {
                i5 = 0;
            }
            view.setVisibility(i5);
            gestureMagicViewHolder.itemView.setOnClickListener(new a(this, i2));
        }
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, aVar2}, this, f17314a, false, 13437, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar2}, this, f17314a, false, 13437, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        if (a(aVar2) >= 0) {
            notifyDataSetChanged();
        }
    }
}
