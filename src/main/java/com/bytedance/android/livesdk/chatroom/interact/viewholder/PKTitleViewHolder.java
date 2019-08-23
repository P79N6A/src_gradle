package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PKTitleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11001a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11002b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f11003c;

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f11001a, false, 5020, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f11001a, false, 5020, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f11003c.setText(str2);
    }

    public PKTitleViewHolder(View view, int i) {
        super(view);
        this.f11003c = (TextView) view;
        this.f11002b = i;
    }
}
