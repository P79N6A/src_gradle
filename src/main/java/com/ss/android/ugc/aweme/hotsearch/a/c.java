package com.ss.android.ugc.aweme.hotsearch.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49647a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f49648b;

    /* renamed from: c  reason: collision with root package name */
    private View f49649c;

    public final TextView getTitle() {
        return this.f49648b;
    }

    public c(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f49647a, false, 49635, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f49647a, false, 49635, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a4s, this, true);
        this.f49648b = (TextView) inflate.findViewById(C0906R.id.ap0);
        this.f49649c = inflate.findViewById(C0906R.id.ap1);
    }

    public final void setTitleTipVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49647a, false, 49636, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49647a, false, 49636, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f49649c != null) {
            this.f49649c.setVisibility(i);
        }
    }
}
