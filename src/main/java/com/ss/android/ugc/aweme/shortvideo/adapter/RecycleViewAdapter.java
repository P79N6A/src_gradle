package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache;

public class RecycleViewAdapter extends RecyclerView.Adapter<NormalTextViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65482a;

    /* renamed from: b  reason: collision with root package name */
    private int f65483b;

    /* renamed from: c  reason: collision with root package name */
    private int f65484c;

    /* renamed from: d  reason: collision with root package name */
    private float f65485d;

    /* renamed from: e  reason: collision with root package name */
    private int f65486e;

    /* renamed from: f  reason: collision with root package name */
    private int f65487f;
    private VideoCoverBitmapCache g;

    static class NormalTextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65492a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f65493b;

        /* renamed from: c  reason: collision with root package name */
        CloseableReference<CloseableImage> f65494c;

        NormalTextViewHolder(View view) {
            super(view);
            this.f65493b = (ImageView) view.findViewById(C0906R.id.b61);
            view.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65495a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65495a, false, 74994, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65495a, false, 74994, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                }
            });
        }
    }

    public int getItemCount() {
        return this.f65487f;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f65482a, false, 74990, new Class[]{ViewGroup.class, Integer.TYPE}, NormalTextViewHolder.class)) {
            return new NormalTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ae0, viewGroup2, false));
        }
        return (NormalTextViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f65482a, false, 74990, new Class[]{ViewGroup.class, Integer.TYPE}, NormalTextViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        final NormalTextViewHolder normalTextViewHolder = (NormalTextViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{normalTextViewHolder, Integer.valueOf(i)}, this, f65482a, false, 74991, new Class[]{NormalTextViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{normalTextViewHolder, Integer.valueOf(i)}, this, f65482a, false, 74991, new Class[]{NormalTextViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], normalTextViewHolder, NormalTextViewHolder.f65492a, false, 74993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], normalTextViewHolder, NormalTextViewHolder.f65492a, false, 74993, new Class[0], Void.TYPE);
        } else {
            CloseableReference.closeSafely(normalTextViewHolder.f65494c);
        }
        final int min = (int) Math.min(((float) i2) * this.f65485d * 1000.0f, (float) this.f65484c);
        ImageView imageView = normalTextViewHolder.f65493b;
        imageView.setTag(min);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) normalTextViewHolder.f65493b.getLayoutParams();
        layoutParams.height = this.f65483b;
        layoutParams.width = this.f65483b;
        layoutParams.setMargins(0, 0, 0, 0);
        if (i2 <= 0 || i2 >= this.f65487f - 1) {
            int i3 = this.f65483b >> 1;
            if (i2 == this.f65487f - 1 && i2 == 0) {
                double d2 = (double) (((float) this.f65484c) % (this.f65485d * 1000.0f));
                Double.isNaN(d2);
                double d3 = (double) (this.f65485d * 1000.0f);
                Double.isNaN(d3);
                double d4 = (d2 * 1.0d) / d3;
                double d5 = (double) this.f65483b;
                Double.isNaN(d5);
                layoutParams.width = (int) (d4 * d5);
                layoutParams.setMargins(i3, 0, this.f65486e, 0);
            } else if (i2 == 0) {
                layoutParams.width = this.f65483b;
                layoutParams.setMargins(i3, 0, 0, 0);
            } else if (i2 == this.f65487f - 1) {
                float f2 = ((float) this.f65484c) % (this.f65485d * 1000.0f);
                if (f2 == 0.0f) {
                    f2 = this.f65485d * 1000.0f;
                }
                double d6 = (double) f2;
                Double.isNaN(d6);
                double d7 = (double) (this.f65485d * 1000.0f);
                Double.isNaN(d7);
                double d8 = (d6 * 1.0d) / d7;
                double d9 = (double) this.f65483b;
                Double.isNaN(d9);
                layoutParams.width = (int) (d8 * d9);
                if (i2 < 5) {
                    layoutParams.setMargins(0, 0, i3 + this.f65486e, 0);
                } else {
                    layoutParams.setMargins(0, 0, i3, 0);
                }
            }
        } else {
            layoutParams.width = this.f65483b;
            normalTextViewHolder.f65493b.setPadding(0, 0, 0, 0);
        }
        normalTextViewHolder.f65493b.setLayoutParams(layoutParams);
        normalTextViewHolder.f65493b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        normalTextViewHolder.f65493b.setImageBitmap(null);
        if (this.g != null) {
            this.g.a(min, new VideoCoverBitmapCache.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65488a;

                public final void a(@NonNull CloseableReference<CloseableImage> closeableReference) {
                    if (PatchProxy.isSupport(new Object[]{closeableReference}, this, f65488a, false, 74992, new Class[]{CloseableReference.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{closeableReference}, this, f65488a, false, 74992, new Class[]{CloseableReference.class}, Void.TYPE);
                        return;
                    }
                    Bitmap underlyingBitmap = ((a) closeableReference.get()).getUnderlyingBitmap();
                    if (!(underlyingBitmap == null || underlyingBitmap.isRecycled() || normalTextViewHolder.f65493b == null)) {
                        Object tag = normalTextViewHolder.f65493b.getTag();
                        if (tag.equals(min)) {
                            normalTextViewHolder.f65494c = closeableReference;
                            normalTextViewHolder.f65493b.setImageBitmap(underlyingBitmap);
                        }
                    }
                }
            });
        }
    }
}
