package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.animation.ObjectAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.util.List;

public abstract class StickerAdapter<T> extends BaseAdapter<T> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f69632d;

    /* renamed from: a  reason: collision with root package name */
    private final int f69633a = -3;

    /* renamed from: b  reason: collision with root package name */
    private final int f69634b = -2;

    /* renamed from: c  reason: collision with root package name */
    private final int f69635c = -4;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69636e;

    /* renamed from: f  reason: collision with root package name */
    private final int f69637f = Integer.MAX_VALUE;
    private boolean g;
    private StickerListLoadingViewHolder h;

    class EmptyViewHolder extends RecyclerView.ViewHolder {
        EmptyViewHolder(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i);

    /* access modifiers changed from: package-private */
    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i);

    /* access modifiers changed from: package-private */
    public abstract void a(RecyclerView.ViewHolder viewHolder, int i);

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f69632d, false, 79196, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69632d, false, 79196, new Class[0], Integer.TYPE)).intValue();
        } else if (this.g || this.f69636e) {
            return 1;
        } else {
            return super.getBasicItemCount() + 2;
        }
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69632d, false, 79198, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69632d, false, 79198, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g && i == 0) {
            return -3;
        } else {
            if (this.f69636e && i == 0) {
                return -4;
            }
            if (i == 0) {
                return -2;
            }
            if (i == getBasicItemCount() - 1) {
                return Integer.MAX_VALUE;
            }
            return a(i);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f69632d, false, 79197, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f69632d, false, 79197, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69638a;

                public int getSpanSize(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69638a, false, 79201, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69638a, false, 79201, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (StickerAdapter.this.getBasicItemViewType(i) == -2 || StickerAdapter.this.getBasicItemViewType(i) == Integer.MAX_VALUE || StickerAdapter.this.getBasicItemViewType(i) == -4) {
                        return gridLayoutManager.getSpanCount();
                    } else {
                        return 1;
                    }
                }
            });
        }
    }

    public final T b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69632d, false, 79199, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69632d, false, 79199, new Class[]{Integer.TYPE}, Object.class);
        } else if (i >= getBasicItemCount() || Lists.isEmpty(this.mItems)) {
            return null;
        } else {
            int min = Math.min(i - 1, this.mItems.size() - 1);
            List list = this.mItems;
            if (min < 0) {
                min = 0;
            }
            return list.get(min);
        }
    }

    private View b(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69632d, false, 79200, new Class[]{ViewGroup.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69632d, false, 79200, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69632d, false, 79195, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69632d, false, 79195, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int basicItemViewType = getBasicItemViewType(i);
        if (basicItemViewType != Integer.MAX_VALUE) {
            switch (basicItemViewType) {
                case -4:
                    return;
                case -3:
                    StickerListLoadingViewHolder stickerListLoadingViewHolder = (StickerListLoadingViewHolder) viewHolder;
                    if (PatchProxy.isSupport(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69643a, false, 79212, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69643a, false, 79212, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (PatchProxy.isSupport(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69643a, false, 79214, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], stickerListLoadingViewHolder, StickerListLoadingViewHolder.f69643a, false, 79214, new Class[0], Void.TYPE);
                            break;
                        } else {
                            stickerListLoadingViewHolder.f69645c = ObjectAnimator.ofFloat(stickerListLoadingViewHolder.f69644b, "rotation", new float[]{0.0f, 360.0f});
                            stickerListLoadingViewHolder.f69645c.setDuration(800);
                            stickerListLoadingViewHolder.f69645c.setRepeatMode(1);
                            stickerListLoadingViewHolder.f69645c.setRepeatCount(-1);
                            stickerListLoadingViewHolder.f69645c.start();
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
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69632d, false, 79194, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69632d, false, 79194, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == Integer.MAX_VALUE) {
            return new EmptyViewHolder(b(viewGroup, 10));
        } else {
            switch (i) {
                case -4:
                    return new StickerEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0w, viewGroup, false));
                case -3:
                    this.h = new StickerListLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0x, viewGroup, false));
                    return this.h;
                case -2:
                    return new EmptyViewHolder(b(viewGroup, 5));
                default:
                    return a(viewGroup, i);
            }
        }
    }
}
