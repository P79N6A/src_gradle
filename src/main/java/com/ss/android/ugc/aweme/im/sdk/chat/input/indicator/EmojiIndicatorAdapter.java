package com.ss.android.ugc.aweme.im.sdk.chat.input.indicator;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;

public class EmojiIndicatorAdapter extends RecyclerView.Adapter<IndicatorViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50636a;

    /* renamed from: b  reason: collision with root package name */
    public int f50637b;

    /* renamed from: c  reason: collision with root package name */
    private int f50638c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f50639d = new ArrayList();

    public static class IndicatorViewHolder extends BaseViewHolder<a> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50640c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f50641d;

        public IndicatorViewHolder(View view) {
            super(view);
            this.f50641d = (ImageView) view;
            this.f50641d.setImageResource(2130840481);
            int dip2Px = (int) UIUtils.dip2Px(view.getContext(), 6.0f);
            this.f50641d.setLayoutParams(new RecyclerView.LayoutParams(dip2Px, dip2Px));
        }

        public final void a(a aVar) {
            a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f50640c, false, 50936, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f50640c, false, 50936, new Class[]{a.class}, Void.TYPE);
                return;
            }
            super.a(aVar);
            this.f50641d.setSelected(aVar2.f50644c);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f50636a, false, 50935, new Class[0], Integer.TYPE)) {
            return this.f50639d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50636a, false, 50935, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50636a, false, 50932, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50636a, false, 50932, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == this.f50638c) {
            this.f50639d.get(this.f50638c).f50644c = true;
            notifyItemChanged(this.f50638c);
        } else {
            for (int i2 = 0; i2 < this.f50639d.size(); i2++) {
                if (i2 == i) {
                    this.f50638c = i;
                    this.f50639d.get(this.f50638c).f50644c = true;
                } else {
                    this.f50639d.get(i2).f50644c = false;
                }
            }
            notifyDataSetChanged();
        }
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        IndicatorViewHolder indicatorViewHolder = (IndicatorViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{indicatorViewHolder, Integer.valueOf(i)}, this, f50636a, false, 50934, new Class[]{IndicatorViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{indicatorViewHolder, Integer.valueOf(i)}, this, f50636a, false, 50934, new Class[]{IndicatorViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        indicatorViewHolder.a(this.f50639d.get(i));
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50636a, false, 50933, new Class[]{ViewGroup.class, Integer.TYPE}, IndicatorViewHolder.class)) {
            return new IndicatorViewHolder(new ImageView(viewGroup.getContext()));
        }
        return (IndicatorViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50636a, false, 50933, new Class[]{ViewGroup.class, Integer.TYPE}, IndicatorViewHolder.class);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50636a, false, 50931, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50636a, false, 50931, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f50637b = i;
        this.f50639d.clear();
        for (int i3 = 0; i3 < i; i3++) {
            this.f50639d.add(new a("", i3));
            if (i3 == i2) {
                this.f50638c = i2;
                this.f50639d.get(i2).f50644c = true;
            }
        }
        notifyDataSetChanged();
    }
}
