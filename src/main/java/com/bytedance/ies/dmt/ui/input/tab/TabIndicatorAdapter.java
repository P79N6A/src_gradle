package com.bytedance.ies.dmt.ui.input.tab;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.base.BaseViewHolder;
import com.bytedance.ies.dmt.ui.input.c;
import com.ss.android.ugc.aweme.C0906R;

public class TabIndicatorAdapter extends RecyclerView.Adapter<TabHolder> {

    /* renamed from: a  reason: collision with root package name */
    a f20423a;

    public class TabHolder extends BaseViewHolder<c> {

        /* renamed from: a  reason: collision with root package name */
        ImageView f20424a;

        public final void a() {
            this.f20424a = (ImageView) this.itemView.findViewById(C0906R.id.cyy);
        }

        public TabHolder(View view) {
            super(view);
        }
    }

    public int getItemCount() {
        return this.f20423a.e().c();
    }

    public TabIndicatorAdapter(a aVar) {
        this.f20423a = aVar;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TabHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ap2, null));
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        TabHolder tabHolder = (TabHolder) viewHolder;
        c cVar = this.f20423a.e().f20398c.get(i);
        tabHolder.f20424a.setImageResource(cVar.a());
        ImageView imageView = tabHolder.f20424a;
        if (i == TabIndicatorAdapter.this.f20423a.e().f20397b) {
            z = true;
        } else {
            z = false;
        }
        imageView.setSelected(z);
        if (!TextUtils.isEmpty(cVar.b())) {
            tabHolder.f20424a.setContentDescription(cVar.b());
        }
        tabHolder.f20424a.setOnClickListener(new View.OnClickListener(i) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f20426a;

            public final void onClick(View view) {
                TabIndicatorAdapter.this.f20423a.a(this.f20426a);
            }

            {
                this.f20426a = r2;
            }
        });
    }
}
