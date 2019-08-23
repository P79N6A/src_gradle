package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.a.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public CursorAdapter f82729a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f82730b;

    /* renamed from: c  reason: collision with root package name */
    public ListPopupWindow f82731c;

    /* renamed from: d  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f82732d;

    public a(@NonNull Context context) {
        this.f82731c = new ListPopupWindow(context, null, C0906R.attr.rg);
        this.f82731c.setModal(true);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f82731c.setContentWidth((int) (216.0f * f2));
        this.f82731c.setHorizontalOffset((int) (16.0f * f2));
        this.f82731c.setVerticalOffset((int) (f2 * -48.0f));
        this.f82731c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                a.this.a(adapterView.getContext(), i);
                if (a.this.f82732d != null) {
                    a.this.f82732d.onItemSelected(adapterView, view, i, j);
                }
            }
        });
    }

    public final void a(Context context, int i) {
        this.f82731c.dismiss();
        Cursor cursor = this.f82729a.getCursor();
        cursor.moveToPosition(i);
        String a2 = com.zhihu.matisse.internal.entity.a.a(cursor).a(context);
        if (this.f82730b.getVisibility() == 0) {
            this.f82730b.setText(a2);
        } else if (d.a()) {
            this.f82730b.setAlpha(0.0f);
            this.f82730b.setVisibility(0);
            this.f82730b.setText(a2);
            this.f82730b.animate().alpha(1.0f).setDuration((long) context.getResources().getInteger(17694722)).start();
        } else {
            this.f82730b.setVisibility(0);
            this.f82730b.setText(a2);
        }
    }
}
