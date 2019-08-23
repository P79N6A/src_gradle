package com.ss.android.ugc.aweme.login.ui;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.model.a;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53820a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f53821b;

    /* renamed from: c  reason: collision with root package name */
    private int f53822c;

    class CountryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f53826a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f53827b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f53828c;

        CountryViewHolder(View view) {
            super(view);
            this.f53826a = (TextView) view.findViewById(C0906R.id.dd8);
            this.f53827b = (TextView) view.findViewById(C0906R.id.df7);
            this.f53828c = (TextView) view.findViewById(C0906R.id.d_n);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f53820a, false, 56466, new Class[0], Integer.TYPE)) {
            return this.f53821b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53820a, false, 56466, new Class[0], Integer.TYPE)).intValue();
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53820a, false, 56464, new Class[]{ViewGroup.class, Integer.TYPE}, CountryViewHolder.class)) {
            return new CountryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.f53822c, null));
        }
        return (CountryViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53820a, false, 56464, new Class[]{ViewGroup.class, Integer.TYPE}, CountryViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        CountryViewHolder countryViewHolder = (CountryViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{countryViewHolder, Integer.valueOf(i)}, this, f53820a, false, 56465, new Class[]{CountryViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{countryViewHolder, Integer.valueOf(i)}, this, f53820a, false, 56465, new Class[]{CountryViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final a aVar = this.f53821b.get(i);
        if (i == 0 || !TextUtils.equals(this.f53821b.get(i - 1).f32261c, aVar.f32261c)) {
            countryViewHolder.f53826a.setVisibility(0);
            countryViewHolder.f53826a.setText(aVar.f32261c);
        } else {
            countryViewHolder.f53826a.setVisibility(8);
        }
        countryViewHolder.f53827b.setText(aVar.f32260b);
        countryViewHolder.f53828c.setText(aVar.f32263e);
        countryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53823a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53823a, false, 56467, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53823a, false, 56467, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
    }
}
