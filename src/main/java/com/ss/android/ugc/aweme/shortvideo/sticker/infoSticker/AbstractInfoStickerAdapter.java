package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.animation.ObjectAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerListLoadingViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerEmptyViewHolder;

public abstract class AbstractInfoStickerAdapter<T> extends BaseAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69671a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69672b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69673c;

    /* renamed from: d  reason: collision with root package name */
    private StickerListLoadingViewHolder f69674d;

    static class EmptyViewHolder extends RecyclerView.ViewHolder {
        EmptyViewHolder(View view) {
            super(view);
        }
    }

    public abstract int a(int i);

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i);

    public abstract void a(RecyclerView.ViewHolder viewHolder, int i);

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f69671a, false, 79237, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69671a, false, 79237, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f69672b) {
            return 1;
        } else {
            return super.getBasicItemCount() + 2;
        }
    }

    public int getBasicItemViewType(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69671a, false, 79236, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69671a, false, 79236, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f69672b && i2 == 0) {
            return -3;
        } else {
            if (i2 == 0) {
                return -2;
            }
            if (i2 == getBasicItemCount() - 1) {
                return -5;
            }
            return a(i);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f69671a, false, 79238, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f69671a, false, 79238, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69675a;

                public int getSpanSize(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69675a, false, 79241, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69675a, false, 79241, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (AbstractInfoStickerAdapter.this.getBasicItemViewType(i) == -2 || AbstractInfoStickerAdapter.this.getBasicItemViewType(i) == -5 || AbstractInfoStickerAdapter.this.getBasicItemViewType(i) == -4 || AbstractInfoStickerAdapter.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.getSpanCount();
                    } else {
                        return 1;
                    }
                }
            });
        }
    }

    private static View b(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, null, f69671a, true, 79240, new Class[]{ViewGroup.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, null, f69671a, true, 79240, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69671a, false, 79235, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69671a, false, 79235, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getBasicItemViewType(i)) {
            case -5:
                return;
            case -4:
                return;
            case -3:
                StickerListLoadingViewHolder stickerListLoadingViewHolder = (StickerListLoadingViewHolder) viewHolder;
                if (PatchProxy.isSupport(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69229a, false, 78695, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69229a, false, 78695, new Class[0], Void.TYPE);
                    break;
                } else {
                    if (PatchProxy.isSupport(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69229a, false, 78697, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69229a, false, 78697, new Class[0], Void.TYPE);
                        break;
                    } else {
                        stickerListLoadingViewHolder.f69231c = ObjectAnimator.ofFloat(stickerListLoadingViewHolder.f69230b, "rotation", new float[]{0.0f, 360.0f});
                        stickerListLoadingViewHolder.f69231c.setDuration(800);
                        stickerListLoadingViewHolder.f69231c.setRepeatMode(1);
                        stickerListLoadingViewHolder.f69231c.setRepeatCount(-1);
                        stickerListLoadingViewHolder.f69231c.start();
                        return;
                    }
                }
            case -2:
                return;
            default:
                a(viewHolder, i);
                break;
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69671a, false, 79234, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69671a, false, 79234, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case -5:
                return new EmptyViewHolder(b(viewGroup, 8));
            case -4:
                return new StickerEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0w, viewGroup, false));
            case -3:
                this.f69674d = new StickerListLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0x, viewGroup, false));
                return this.f69674d;
            case -2:
                return new EmptyViewHolder(b(viewGroup, 5));
            default:
                return a(viewGroup, i);
        }
    }
}
