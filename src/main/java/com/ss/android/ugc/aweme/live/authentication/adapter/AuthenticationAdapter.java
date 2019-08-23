package com.ss.android.ugc.aweme.live.authentication.adapter;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.live.authentication.model.b;

public class AuthenticationAdapter extends BaseAdapter<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53293a;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53294a;

        /* renamed from: b  reason: collision with root package name */
        static String[] f53295b = GlobalContext.getContext().getResources().getStringArray(C0906R.array.f4409d);

        /* renamed from: c  reason: collision with root package name */
        TextView f53296c;

        /* renamed from: d  reason: collision with root package name */
        TextView f53297d;

        public ViewHolder(View view) {
            super(view);
            this.f53296c = (TextView) view.findViewById(C0906R.id.bpn);
            this.f53297d = (TextView) view.findViewById(C0906R.id.cuw);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f53293a, false, 55619, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sd, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f53293a, false, 55619, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        int i4 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f53293a, false, 55618, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f53293a, false, 55618, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        boolean booleanValue = ((Boolean) getData().get(i4)).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0), Integer.valueOf(i)}, viewHolder2, ViewHolder.f53294a, false, 55620, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue), Integer.valueOf(i)}, viewHolder2, ViewHolder.f53294a, false, 55620, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        viewHolder2.f53296c.setText(ViewHolder.f53295b[i4]);
        TextView textView = viewHolder2.f53296c;
        Resources resources = GlobalContext.getContext().getResources();
        int i5 = C0906R.color.a08;
        if (booleanValue) {
            i2 = C0906R.color.a0b;
        } else {
            i2 = C0906R.color.a08;
        }
        textView.setTextColor(resources.getColor(i2));
        TextView textView2 = viewHolder2.f53297d;
        Resources resources2 = GlobalContext.getContext().getResources();
        if (booleanValue) {
            i5 = C0906R.color.a0b;
        }
        textView2.setTextColor(resources2.getColor(i5));
        TextView textView3 = viewHolder2.f53297d;
        if (booleanValue) {
            i3 = C0906R.string.a0r;
        } else {
            i3 = C0906R.string.b15;
        }
        textView3.setText(i3);
        if (i4 == 0 && b.a().f53325b.realname_verify == 1) {
            viewHolder2.f53297d.setText(C0906R.string.js);
        }
    }
}
