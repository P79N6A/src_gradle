package com.bytedance.android.livesdk.chatroom.ui;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.model.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LuckyBoxDescriptionAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11684a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f11685b;

    /* renamed from: c  reason: collision with root package name */
    private int f11686c;

    /* renamed from: d  reason: collision with root package name */
    private List<y> f11687d;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        HSImageView f11688a;

        /* renamed from: b  reason: collision with root package name */
        TextView f11689b;

        ViewHolder(View view) {
            super(view);
            this.f11688a = (HSImageView) view.findViewById(C0906R.id.ar6);
            this.f11689b = (TextView) view.findViewById(C0906R.id.daa);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f11684a, false, 6211, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11684a, false, 6211, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f11687d == null) {
            return 0;
        } else {
            return this.f11687d.size();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<y> list) {
        List<y> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f11684a, false, 6208, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f11684a, false, 6208, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f11687d = list2;
        notifyDataSetChanged();
    }

    LuckyBoxDescriptionAdapter(@NonNull LayoutInflater layoutInflater, @LayoutRes int i) {
        this.f11685b = layoutInflater;
        this.f11686c = i;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f11684a, false, 6210, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f11684a, false, 6210, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        y yVar = this.f11687d.get(i);
        if (yVar.f11187a != null) {
            b.a(viewHolder2.f11688a, yVar.f11187a);
        }
        viewHolder2.f11689b.setText(yVar.f11188b);
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11684a, false, 6209, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return new ViewHolder(this.f11685b.inflate(this.f11686c, viewGroup, false));
        }
        return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11684a, false, 6209, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
    }
}
