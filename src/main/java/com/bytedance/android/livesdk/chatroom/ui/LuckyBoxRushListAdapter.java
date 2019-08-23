package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.model.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LuckyBoxRushListAdapter extends RecyclerView.Adapter<RushListViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11690a;

    /* renamed from: b  reason: collision with root package name */
    private List<t.a> f11691b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f11692c;

    static class RushListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f11693a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f11694b;

        /* renamed from: c  reason: collision with root package name */
        public HSImageView f11695c;

        RushListViewHolder(View view) {
            super(view);
            this.f11693a = (TextView) view.findViewById(C0906R.id.bpn);
            this.f11694b = (TextView) view.findViewById(C0906R.id.a08);
            this.f11695c = (HSImageView) view.findViewById(C0906R.id.ar6);
        }
    }

    public int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f11690a, false, 6247, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11690a, false, 6247, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f11691b != null) {
            i = this.f11691b.size();
        }
        return i;
    }

    LuckyBoxRushListAdapter(Context context, List<t.a> list) {
        this.f11692c = LayoutInflater.from(context);
        this.f11691b = list;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11690a, false, 6245, new Class[]{ViewGroup.class, Integer.TYPE}, RushListViewHolder.class)) {
            return new RushListViewHolder(this.f11692c.inflate(C0906R.layout.anc, viewGroup2, false));
        }
        return (RushListViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11690a, false, 6245, new Class[]{ViewGroup.class, Integer.TYPE}, RushListViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RushListViewHolder rushListViewHolder = (RushListViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{rushListViewHolder, Integer.valueOf(i)}, this, f11690a, false, 6246, new Class[]{RushListViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rushListViewHolder, Integer.valueOf(i)}, this, f11690a, false, 6246, new Class[]{RushListViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a aVar = this.f11691b.get(i);
        if (aVar != null && aVar.f11165a != null) {
            rushListViewHolder.f11693a.setText(aVar.f11165a.getNickName());
            if (!TextUtils.isEmpty(aVar.f11167c)) {
                rushListViewHolder.f11694b.setVisibility(0);
                rushListViewHolder.f11694b.setText(aVar.f11167c);
            } else {
                rushListViewHolder.f11694b.setVisibility(8);
            }
            if (aVar.f11166b != null) {
                rushListViewHolder.f11695c.setVisibility(0);
                b.a(rushListViewHolder.f11695c, aVar.f11166b);
                return;
            }
            rushListViewHolder.f11695c.setVisibility(8);
        }
    }
}
