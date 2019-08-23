package com.zhihu.matisse.internal.ui.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.entity.IncapableCause;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.ui.widget.MediaGrid;

public class AlbumMediaAdapter extends RecyclerViewCursorAdapter<RecyclerView.ViewHolder> implements MediaGrid.a {

    /* renamed from: a  reason: collision with root package name */
    public a f82690a;

    /* renamed from: b  reason: collision with root package name */
    public b f82691b;

    /* renamed from: d  reason: collision with root package name */
    private final com.zhihu.matisse.internal.model.a f82692d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f82693e;

    /* renamed from: f  reason: collision with root package name */
    private d f82694f = d.a();
    private RecyclerView g;
    private int h;

    static class CaptureViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f82696a;

        CaptureViewHolder(View view) {
            super(view);
            this.f82696a = (TextView) view.findViewById(C0906R.id.ao1);
        }
    }

    static class MediaViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public MediaGrid f82697a;

        MediaViewHolder(View view) {
            super(view);
            this.f82697a = (MediaGrid) view;
        }
    }

    public interface a {
        void b();
    }

    public interface b {
        void a(com.zhihu.matisse.internal.entity.a aVar, com.zhihu.matisse.internal.entity.c cVar, int i);
    }

    public interface c {
        void d();
    }

    private void a() {
        notifyDataSetChanged();
        if (this.f82690a != null) {
            this.f82690a.b();
        }
    }

    public final int a(Cursor cursor) {
        boolean z;
        if (com.zhihu.matisse.internal.entity.c.a(cursor).f82641a == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1;
        }
        return 2;
    }

    private boolean a(Context context, com.zhihu.matisse.internal.entity.c cVar) {
        IncapableCause d2 = this.f82692d.d(cVar);
        IncapableCause.a(context, d2);
        if (d2 == null) {
            return true;
        }
        return false;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            CaptureViewHolder captureViewHolder = new CaptureViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.abi, viewGroup, false));
            captureViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (view.getContext() instanceof c) {
                        ((c) view.getContext()).d();
                    }
                }
            });
            return captureViewHolder;
        } else if (i == 2) {
            return new MediaViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aa9, viewGroup, false));
        } else {
            return null;
        }
    }

    public final void a(com.zhihu.matisse.internal.entity.c cVar, RecyclerView.ViewHolder viewHolder) {
        if (this.f82691b != null) {
            this.f82691b.a(null, cVar, viewHolder.getAdapterPosition());
        }
    }

    public final void b(com.zhihu.matisse.internal.entity.c cVar, RecyclerView.ViewHolder viewHolder) {
        if (this.f82694f.f82651f) {
            if (this.f82692d.e(cVar) != Integer.MIN_VALUE) {
                this.f82692d.b(cVar);
                a();
            } else if (a(viewHolder.itemView.getContext(), cVar)) {
                this.f82692d.a(cVar);
                a();
            }
        } else if (this.f82692d.c(cVar)) {
            this.f82692d.b(cVar);
            a();
        } else if (a(viewHolder.itemView.getContext(), cVar)) {
            this.f82692d.a(cVar);
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(RecyclerView.ViewHolder viewHolder, Cursor cursor) {
        int i;
        if (viewHolder instanceof CaptureViewHolder) {
            CaptureViewHolder captureViewHolder = (CaptureViewHolder) viewHolder;
            Drawable[] compoundDrawables = captureViewHolder.f82696a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = viewHolder.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{C0906R.attr.dy});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
                Drawable drawable = compoundDrawables[i2];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        Drawable mutate = constantState.newDrawable().mutate();
                        mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        mutate.setBounds(drawable.getBounds());
                        compoundDrawables[i2] = mutate;
                    }
                }
            }
            captureViewHolder.f82696a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return;
        }
        if (viewHolder instanceof MediaViewHolder) {
            MediaViewHolder mediaViewHolder = (MediaViewHolder) viewHolder;
            com.zhihu.matisse.internal.entity.c a2 = com.zhihu.matisse.internal.entity.c.a(cursor);
            MediaGrid mediaGrid = mediaViewHolder.f82697a;
            Context context = mediaViewHolder.f82697a.getContext();
            if (this.h == 0) {
                int spanCount = ((GridLayoutManager) this.g.getLayoutManager()).getSpanCount();
                this.h = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(C0906R.dimen.il) * (spanCount - 1))) / spanCount;
                this.h = (int) (((float) this.h) * this.f82694f.o);
            }
            mediaGrid.f82718f = new MediaGrid.b(this.h, this.f82693e, this.f82694f.f82651f, viewHolder);
            MediaGrid mediaGrid2 = mediaViewHolder.f82697a;
            mediaGrid2.f82717e = a2;
            ImageView imageView = mediaGrid2.f82715c;
            if (mediaGrid2.f82717e.b()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            mediaGrid2.f82714b.setCountable(mediaGrid2.f82718f.f82721c);
            if (mediaGrid2.f82717e.b()) {
                d.a().p.b(mediaGrid2.getContext(), mediaGrid2.f82718f.f82719a, mediaGrid2.f82718f.f82720b, mediaGrid2.f82713a, mediaGrid2.f82717e.f82643c);
            } else {
                d.a().p.a(mediaGrid2.getContext(), mediaGrid2.f82718f.f82719a, mediaGrid2.f82718f.f82720b, mediaGrid2.f82713a, mediaGrid2.f82717e.f82643c);
            }
            if (mediaGrid2.f82717e.c()) {
                mediaGrid2.f82716d.setVisibility(0);
                mediaGrid2.f82716d.setText(DateUtils.formatElapsedTime(mediaGrid2.f82717e.f82645e / 1000));
            } else {
                mediaGrid2.f82716d.setVisibility(8);
            }
            mediaViewHolder.f82697a.setOnMediaGridClickListener(this);
            MediaGrid mediaGrid3 = mediaViewHolder.f82697a;
            if (this.f82694f.f82651f) {
                int e2 = this.f82692d.e(a2);
                if (e2 > 0 || !this.f82692d.e()) {
                    mediaGrid3.setCheckEnabled(true);
                    mediaGrid3.setCheckedNum(e2);
                    return;
                }
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setCheckedNum(Integer.MIN_VALUE);
            } else if (this.f82692d.c(a2)) {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(true);
            } else if (this.f82692d.e()) {
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setChecked(false);
            } else {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(false);
            }
        }
    }

    public AlbumMediaAdapter(Context context, com.zhihu.matisse.internal.model.a aVar, RecyclerView recyclerView) {
        super(null);
        this.f82692d = aVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{C0906R.attr.o3});
        this.f82693e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.g = recyclerView;
    }
}
