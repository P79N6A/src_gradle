package com.ss.android.ugc.aweme.account.login.ui;

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
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32416a;

    /* renamed from: b  reason: collision with root package name */
    public a f32417b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.account.login.model.a> f32418c;

    /* renamed from: d  reason: collision with root package name */
    private int f32419d;

    class CountryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f32423a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f32424b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f32425c;

        public CountryViewHolder(View view) {
            super(view);
            this.f32423a = (TextView) view.findViewById(C0906R.id.dd8);
            this.f32424b = (TextView) view.findViewById(C0906R.id.df7);
            this.f32425c = (TextView) view.findViewById(C0906R.id.d_n);
        }
    }

    public interface a {
        void a(com.ss.android.ugc.aweme.account.login.model.a aVar);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f32416a, false, 20549, new Class[0], Integer.TYPE)) {
            return this.f32418c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32416a, false, 20549, new Class[0], Integer.TYPE)).intValue();
    }

    public CountryAdapter(List<com.ss.android.ugc.aweme.account.login.model.a> list, int i) {
        this.f32418c = list;
        this.f32419d = i;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f32416a, false, 20547, new Class[]{ViewGroup.class, Integer.TYPE}, CountryViewHolder.class)) {
            return new CountryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.f32419d, null));
        }
        return (CountryViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f32416a, false, 20547, new Class[]{ViewGroup.class, Integer.TYPE}, CountryViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        CountryViewHolder countryViewHolder = (CountryViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{countryViewHolder, Integer.valueOf(i)}, this, f32416a, false, 20548, new Class[]{CountryViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{countryViewHolder, Integer.valueOf(i)}, this, f32416a, false, 20548, new Class[]{CountryViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final com.ss.android.ugc.aweme.account.login.model.a aVar = this.f32418c.get(i);
        if (i == 0 || !TextUtils.equals(this.f32418c.get(i - 1).f32261c, aVar.f32261c)) {
            countryViewHolder.f32423a.setVisibility(0);
            countryViewHolder.f32423a.setText(aVar.f32261c);
        } else {
            countryViewHolder.f32423a.setVisibility(8);
        }
        countryViewHolder.f32424b.setText(aVar.f32260b);
        countryViewHolder.f32425c.setText(aVar.f32263e);
        countryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32420a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32420a, false, 20550, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32420a, false, 20550, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (CountryAdapter.this.f32417b != null) {
                    CountryAdapter.this.f32417b.a(aVar);
                }
            }
        });
    }
}
