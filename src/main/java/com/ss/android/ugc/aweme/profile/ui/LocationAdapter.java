package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.d.w;
import com.ss.android.ugc.aweme.profile.model.LocationViewModel;

public class LocationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61898a;

    /* renamed from: b  reason: collision with root package name */
    a f61899b;

    /* renamed from: c  reason: collision with root package name */
    public int f61900c;

    /* renamed from: d  reason: collision with root package name */
    String f61901d;

    /* renamed from: e  reason: collision with root package name */
    private w f61902e;

    /* renamed from: f  reason: collision with root package name */
    private LocationViewModel f61903f;
    private int g;

    public static class LocationHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        CommonItemView f61904a;

        /* renamed from: b  reason: collision with root package name */
        CommonItemView f61905b;

        public LocationHeaderViewHolder(View view) {
            super(view);
            this.f61904a = (CommonItemView) view.findViewById(C0906R.id.dal);
            this.f61905b = (CommonItemView) view.findViewById(C0906R.id.dcq);
        }
    }

    public static class LocationIndexViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f61906a;

        public LocationIndexViewHolder(View view) {
            super(view);
            this.f61906a = (TextView) view.findViewById(C0906R.id.dd9);
        }
    }

    public static class LocationNameViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        CommonItemView f61907a;

        public LocationNameViewHolder(View view) {
            super(view);
            this.f61907a = (CommonItemView) view;
        }
    }

    public interface a {
        void a(String str, String str2, int i, int i2, boolean z);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f61898a, false, 68117, new Class[0], Integer.TYPE)) {
            return this.f61902e.size() + this.g;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61898a, false, 68117, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61898a, false, 68116, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61898a, false, 68116, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g != 1) {
            return 1;
        } else {
            if (i == 0) {
                return 0;
            }
            if (TextUtils.equals(((w) this.f61902e.get(i - this.g)).getName(), ((w) this.f61902e.get(i - this.g)).getCode())) {
                return 2;
            }
            return 1;
        }
    }

    public final void a(boolean z, String str) {
        if (z) {
            this.g = 1;
            this.f61901d = str;
            return;
        }
        this.g = 0;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        CommonItemView commonItemView;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61898a, false, 68115, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61898a, false, 68115, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder instanceof LocationNameViewHolder) {
            int i3 = i - this.g;
            w wVar = (w) this.f61902e.get(i3);
            LocationNameViewHolder locationNameViewHolder = (LocationNameViewHolder) viewHolder;
            locationNameViewHolder.f61907a.setLeftText(wVar.getName());
            if (wVar.size() == 0) {
                commonItemView = locationNameViewHolder.f61907a;
            } else {
                commonItemView = locationNameViewHolder.f61907a;
                if (b.a(locationNameViewHolder.f61907a.getContext())) {
                    i2 = 2130841630;
                } else {
                    i2 = 2130841631;
                }
            }
            commonItemView.setRightIconRes(i2);
            locationNameViewHolder.f61907a.setOnClickListener(new ac(this, wVar, i3));
        } else if (viewHolder instanceof LocationHeaderViewHolder) {
            if (this.f61901d != null) {
                ((LocationHeaderViewHolder) viewHolder).f61904a.setLeftText(this.f61901d);
            }
            LocationHeaderViewHolder locationHeaderViewHolder = (LocationHeaderViewHolder) viewHolder;
            locationHeaderViewHolder.f61904a.setOnClickListener(new ad(this));
            locationHeaderViewHolder.f61905b.setOnClickListener(new ae(this));
        } else {
            if (viewHolder instanceof LocationIndexViewHolder) {
                ((LocationIndexViewHolder) viewHolder).f61906a.setText(((w) this.f61902e.get(i - this.g)).getName());
            }
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61898a, false, 68114, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61898a, false, 68114, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case 0:
                return new LocationHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wc, viewGroup2, false));
            case 1:
                CommonItemView commonItemView = new CommonItemView(viewGroup.getContext());
                commonItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new LocationNameViewHolder(commonItemView);
            case 2:
                return new LocationIndexViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wb, viewGroup2, false));
            default:
                return null;
        }
    }

    public LocationAdapter(FragmentActivity fragmentActivity, @NonNull String str, @NonNull a aVar) {
        String[] split = str.split("-");
        this.f61903f = (LocationViewModel) ViewModelProviders.of(fragmentActivity).get(LocationViewModel.class);
        this.f61902e = (w) this.f61903f.getLocationTree(fragmentActivity).getValue();
        if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
            this.f61900c = 0;
        } else {
            for (String valueOf : split) {
                this.f61902e = (w) this.f61902e.get(Integer.valueOf(valueOf).intValue());
            }
            this.f61900c = split.length;
        }
        this.f61899b = aVar;
    }
}
