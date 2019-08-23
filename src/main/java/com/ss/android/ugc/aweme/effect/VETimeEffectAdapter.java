package com.ss.android.ugc.aweme.effect;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.themechange.base.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public class VETimeEffectAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43634a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<EffectModel> f43635b = e.a();

    /* renamed from: c  reason: collision with root package name */
    public a f43636c;

    /* renamed from: d  reason: collision with root package name */
    int f43637d;

    /* renamed from: e  reason: collision with root package name */
    boolean f43638e;

    class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43639a;

        /* renamed from: b  reason: collision with root package name */
        public AVDmtImageTextView f43640b;

        ViewHolder(View view) {
            super(view);
            this.f43640b = (AVDmtImageTextView) view.findViewById(C0906R.id.cvk);
            this.f43640b.c();
            this.f43640b.b();
            this.f43640b.setOnClickListener(new View.OnClickListener(VETimeEffectAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43642a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f43642a, false, 38817, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f43642a, false, 38817, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = ViewHolder.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        if (VETimeEffectAdapter.this.f43636c != null) {
                            VETimeEffectAdapter.this.f43636c.a(adapterPosition);
                        }
                        VETimeEffectAdapter.this.f43637d = adapterPosition;
                        VETimeEffectAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    public interface a {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43634a, false, 38810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43634a, false, 38810, new Class[0], Void.TYPE);
            return;
        }
        if (this.f43637d != 0) {
            this.f43637d = 0;
            notifyDataSetChanged();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43634a, false, 38812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43634a, false, 38812, new Class[0], Void.TYPE);
            return;
        }
        if (this.f43637d == 1) {
            this.f43637d = 0;
            notifyItemRangeChanged(0, 2);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f43634a, false, 38809, new Class[0], Integer.TYPE)) {
            return this.f43635b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43634a, false, 38809, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43634a, false, 38813, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43634a, false, 38813, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        notifyItemChanged(this.f43637d);
        this.f43637d = i;
        notifyItemChanged(this.f43637d);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43634a, false, 38811, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43634a, false, 38811, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f43638e = z;
        if (this.f43637d == 1) {
            notifyItemChanged(1);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43634a, false, 38807, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43634a, false, 38807, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        return new ViewHolder(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C0906R.layout.tp, viewGroup2, false));
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43634a, false, 38808, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43634a, false, 38808, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, viewHolder2, ViewHolder.f43639a, false, 38816, new Class[]{Integer.TYPE}, Void.TYPE)) {
            ViewHolder viewHolder3 = viewHolder2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, viewHolder3, ViewHolder.f43639a, false, 38816, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        EffectModel effectModel = VETimeEffectAdapter.this.f43635b.get(i2);
        if (i2 == 0) {
            AVDmtImageTextView aVDmtImageTextView = viewHolder2.f43640b;
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(viewHolder2.f43640b.getResources(), effectModel.imagePath);
            int dip2Px = (int) UIUtils.dip2Px(viewHolder2.f43640b.getContext(), 12.0f);
            if (PatchProxy.isSupport(new Object[]{a2, (byte) 1, Integer.valueOf(dip2Px)}, aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86775, new Class[]{Drawable.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                AVDmtImageTextView aVDmtImageTextView2 = aVDmtImageTextView;
                PatchProxy.accessDispatch(new Object[]{a2, (byte) 1, Integer.valueOf(dip2Px)}, aVDmtImageTextView2, AVDmtImageTextView.f74552a, false, 86775, new Class[]{Drawable.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (a2 != null) {
                Drawable a3 = b.f74589e.a(a2, false);
                StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
                if (stickerImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                }
                stickerImageView.a(a3);
                StickerImageView stickerImageView2 = aVDmtImageTextView.f74554b;
                if (stickerImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                }
                stickerImageView2.setPadding(dip2Px, dip2Px, dip2Px, dip2Px);
            }
            AVDmtImageTextView aVDmtImageTextView3 = viewHolder2.f43640b;
            if (PatchProxy.isSupport(new Object[0], aVDmtImageTextView3, AVDmtImageTextView.f74552a, false, 86776, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVDmtImageTextView3, AVDmtImageTextView.f74552a, false, 86776, new Class[0], Void.TYPE);
            } else {
                StickerImageView stickerImageView3 = aVDmtImageTextView3.f74554b;
                if (stickerImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                }
                stickerImageView3.setBackground(aVDmtImageTextView3.f74555c);
            }
        } else {
            viewHolder2.f43640b.a(com.ss.android.ugc.bytex.a.a.a.a(viewHolder2.f43640b.getResources(), effectModel.imagePath));
        }
        viewHolder2.f43640b.setText(effectModel.name);
        AVDmtImageTextView aVDmtImageTextView4 = viewHolder2.f43640b;
        if (i2 == VETimeEffectAdapter.this.f43637d) {
            z = true;
        }
        aVDmtImageTextView4.a(z);
    }
}
