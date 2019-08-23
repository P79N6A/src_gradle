package com.bytedance.ies.dmt.ui.input.indicator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;

public class EmojiIndicatorAdapter extends RecyclerView.Adapter<IndicatorViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public int f20415a;

    /* renamed from: b  reason: collision with root package name */
    public int f20416b;

    /* renamed from: c  reason: collision with root package name */
    List<a> f20417c = new ArrayList();

    public static class IndicatorViewHolder extends BaseViewHolder<a> {

        /* renamed from: a  reason: collision with root package name */
        ImageView f20418a;

        public final void a(a aVar) {
            super.a(aVar);
            this.f20418a.setSelected(aVar.f20421c);
        }

        public IndicatorViewHolder(View view) {
            super(view);
            int dip2Px = (int) UIUtils.dip2Px(view.getContext(), 6.0f);
            int dip2Px2 = (int) UIUtils.dip2Px(view.getContext(), 4.0f);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(dip2Px, dip2Px);
            layoutParams.setMargins(dip2Px2, dip2Px2, dip2Px2, dip2Px2);
            view.setLayoutParams(layoutParams);
            this.f20418a = (ImageView) view;
            this.f20418a.setImageResource(2130841609);
        }
    }

    public int getItemCount() {
        return this.f20417c.size();
    }

    public final void a(int i) {
        if (i == this.f20416b) {
            this.f20417c.get(this.f20416b).f20421c = true;
            notifyItemChanged(this.f20416b);
            return;
        }
        for (int i2 = 0; i2 < this.f20417c.size(); i2++) {
            if (i2 == i) {
                this.f20416b = i;
                this.f20417c.get(this.f20416b).f20421c = true;
            } else {
                this.f20417c.get(i2).f20421c = false;
            }
        }
        notifyDataSetChanged();
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((IndicatorViewHolder) viewHolder).a(this.f20417c.get(i));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new IndicatorViewHolder(new ImageView(viewGroup.getContext()));
    }

    public final void a(int i, int i2) {
        this.f20415a = i;
        this.f20417c.clear();
        for (int i3 = 0; i3 < i; i3++) {
            this.f20417c.add(new a("", i3));
            if (i3 == i2) {
                this.f20416b = i2;
                this.f20417c.get(i2).f20421c = true;
            }
        }
        notifyDataSetChanged();
    }
}
