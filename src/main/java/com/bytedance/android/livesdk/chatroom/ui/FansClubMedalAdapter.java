package com.bytedance.android.livesdk.chatroom.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class FansClubMedalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11506a;

    /* renamed from: b  reason: collision with root package name */
    public FansClubData f11507b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11508c = true;

    /* renamed from: d  reason: collision with root package name */
    public a f11509d;

    /* renamed from: e  reason: collision with root package name */
    private List<b> f11510e;

    class FansClubMedalViewModel extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11511a;

        /* renamed from: b  reason: collision with root package name */
        HSImageView f11512b;

        /* renamed from: c  reason: collision with root package name */
        TextView f11513c;

        /* renamed from: d  reason: collision with root package name */
        TextView f11514d;

        /* renamed from: e  reason: collision with root package name */
        TextView f11515e;

        /* renamed from: f  reason: collision with root package name */
        View f11516f;
        TextView g;
        b h;
        int i;

        FansClubMedalViewModel(View view, int i2) {
            super(view);
            this.i = i2;
            this.f11512b = (HSImageView) view.findViewById(C0906R.id.ac4);
            this.f11513c = (TextView) view.findViewById(C0906R.id.title);
            this.f11514d = (TextView) view.findViewById(C0906R.id.bb7);
            this.f11516f = view.findViewById(C0906R.id.cnh);
            this.f11515e = (TextView) view.findViewById(C0906R.id.f6);
            this.f11512b.setOnClickListener(new aq(this));
            this.g = (TextView) view.findViewById(C0906R.id.abw);
            this.g.setOnClickListener(new ar(this));
        }
    }

    interface a {
        void a(b bVar);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f11506a, false, 5679, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11506a, false, 5679, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f11510e == null) {
            return 0;
        } else {
            return this.f11510e.size();
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11506a, false, 5680, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11506a, false, 5680, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == this.f11510e.size() - 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f11506a, false, 5681, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f11506a, false, 5681, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar2 != null) {
            bVar2.f7697d = true;
        }
        for (b next : this.f11510e) {
            if (next != null && !next.equals(bVar2)) {
                next.f7697d = false;
            }
        }
        notifyDataSetChanged();
    }

    public final void a(View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f11506a, false, 5682, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f11506a, false, 5682, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11506a, false, 5677, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11506a, false, 5677, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new FansClubMedalViewModel(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aj4, viewGroup2, false), i);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f11506a, false, 5678, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f11506a, false, 5678, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FansClubMedalViewModel fansClubMedalViewModel = (FansClubMedalViewModel) viewHolder;
        b bVar = this.f11510e.get(i);
        if (PatchProxy.isSupport(new Object[]{bVar}, fansClubMedalViewModel, FansClubMedalViewModel.f11511a, false, 5683, new Class[]{b.class}, Void.TYPE)) {
            FansClubMedalViewModel fansClubMedalViewModel2 = fansClubMedalViewModel;
            PatchProxy.accessDispatch(new Object[]{bVar}, fansClubMedalViewModel2, FansClubMedalViewModel.f11511a, false, 5683, new Class[]{b.class}, Void.TYPE);
            return;
        }
        fansClubMedalViewModel.h = bVar;
        if (fansClubMedalViewModel.i == 1) {
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.g, 0);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11512b, 8);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11513c, 8);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11514d, 8);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11515e, 8);
        } else {
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.g, 8);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11512b, 0);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11513c, 0);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11514d, 0);
            FansClubMedalAdapter.this.a(fansClubMedalViewModel.f11515e, 0);
            if (bVar.f7696c != null) {
                com.bytedance.android.livesdk.chatroom.f.b.a(fansClubMedalViewModel.f11512b, bVar.f7696c.f7693b);
                fansClubMedalViewModel.f11513c.setText(bVar.f7696c.f7692a);
            }
            fansClubMedalViewModel.f11514d.setText(ac.a((int) C0906R.string.cwb, String.valueOf(bVar.f7695b)));
            if (bVar.f7694a != null) {
                fansClubMedalViewModel.f11515e.setText(bVar.f7694a.getNickName());
            }
            if (FansClubMedalAdapter.this.f11508c && FansClubMedalAdapter.this.f11507b != null && !TextUtils.isEmpty(FansClubMedalAdapter.this.f11507b.clubName) && FansClubMedalAdapter.this.f11507b.clubName.equals(bVar.f7696c.f7692a)) {
                bVar.f7697d = true;
                FansClubMedalAdapter.this.f11508c = false;
            }
        }
        if (bVar != null) {
            View view = fansClubMedalViewModel.f11516f;
            if (!bVar.f7697d) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    public FansClubMedalAdapter(List<b> list, FansClubData fansClubData, a aVar) {
        if (list != null) {
            b bVar = new b();
            if (fansClubData == null) {
                bVar.f7697d = true;
            }
            list.add(bVar);
        }
        this.f11510e = list;
        this.f11507b = fansClubData;
        this.f11509d = aVar;
    }
}
