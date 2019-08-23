package com.bytedance.android.livesdk.admin.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.admin.b.b;
import com.bytedance.android.livesdk.admin.b.c;
import com.bytedance.android.livesdk.common.AbsViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class AdminListAdapter extends RecyclerView.Adapter<AbsViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8977a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f8978b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public c f8979c;

    /* renamed from: d  reason: collision with root package name */
    private Context f8980d;

    /* renamed from: e  reason: collision with root package name */
    private long f8981e;

    /* renamed from: f  reason: collision with root package name */
    private long f8982f;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f8977a, false, 3093, new Class[0], Integer.TYPE)) {
            return this.f8978b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8977a, false, 3093, new Class[0], Integer.TYPE)).intValue();
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbsViewHolder absViewHolder = (AbsViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{absViewHolder, Integer.valueOf(i)}, this, f8977a, false, 3092, new Class[]{AbsViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absViewHolder, Integer.valueOf(i)}, this, f8977a, false, 3092, new Class[]{AbsViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        absViewHolder.a(this.f8978b.get(i));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8977a, false, 3091, new Class[]{ViewGroup.class, Integer.TYPE}, AbsViewHolder.class)) {
            return (AbsViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8977a, false, 3091, new Class[]{ViewGroup.class, Integer.TYPE}, AbsViewHolder.class);
        }
        AdminListViewHolder adminListViewHolder = new AdminListViewHolder(this.f8980d, LayoutInflater.from(this.f8980d).inflate(C0906R.layout.aiw, viewGroup2, false), this.f8981e, this.f8982f);
        return adminListViewHolder;
    }

    public AdminListAdapter(Context context, long j, long j2) {
        this.f8980d = context;
        this.f8981e = j;
        this.f8982f = j2;
    }
}
