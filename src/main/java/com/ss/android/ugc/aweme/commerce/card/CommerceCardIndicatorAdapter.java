package com.ss.android.ugc.aweme.commerce.card;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class CommerceCardIndicatorAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36798a;

    /* renamed from: b  reason: collision with root package name */
    private Context f36799b;

    /* renamed from: c  reason: collision with root package name */
    private List<Boolean> f36800c;

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f36801a;

        public ViewHolder(View view) {
            super(view);
            this.f36801a = (ImageView) view.findViewById(C0906R.id.b2g);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f36798a, false, 28015, new Class[0], Integer.TYPE)) {
            return this.f36800c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36798a, false, 28015, new Class[0], Integer.TYPE)).intValue();
    }

    public CommerceCardIndicatorAdapter(Context context, List<Boolean> list) {
        this.f36799b = context;
        this.f36800c = list;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f36798a, false, 28014, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f36798a, false, 28014, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f36800c.get(i).booleanValue()) {
            viewHolder2.f36801a.setImageResource(2130838405);
        } else {
            viewHolder2.f36801a.setImageResource(2130838404);
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36798a, false, 28013, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return new ViewHolder(LayoutInflater.from(this.f36799b).inflate(C0906R.layout.t3, viewGroup, false));
        }
        return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36798a, false, 28013, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
    }
}
