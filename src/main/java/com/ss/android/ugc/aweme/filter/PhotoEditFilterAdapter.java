package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.FilterAdapter;

public class PhotoEditFilterAdapter extends FilterAdapter {
    public static ChangeQuickRedirect g;

    public PhotoEditFilterAdapter(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void onBindViewHolder(@NonNull FilterAdapter.MyViewHolder myViewHolder, int i) {
        View view;
        if (PatchProxy.isSupport(new Object[]{myViewHolder, Integer.valueOf(i)}, this, g, false, 44424, new Class[]{FilterAdapter.MyViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{myViewHolder, Integer.valueOf(i)}, this, g, false, 44424, new Class[]{FilterAdapter.MyViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onBindViewHolder(myViewHolder, i);
        int i2 = 8;
        if (i == 0) {
            myViewHolder.f47347c.findViewById(C0906R.id.xt).setVisibility(0);
            view = myViewHolder.f47347c.findViewById(C0906R.id.abs);
        } else {
            myViewHolder.f47347c.findViewById(C0906R.id.xt).setVisibility(8);
            view = myViewHolder.f47347c.findViewById(C0906R.id.abs);
            if (getItem(i).f47598b == this.f47341d) {
                i2 = 0;
            }
        }
        view.setVisibility(i2);
    }
}
