package com.zhihu.matisse.internal.ui.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.entity.d;
import java.io.File;

public final class a extends CursorAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f82702a;

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(C0906R.layout.ew, viewGroup, false);
    }

    public a(Context context, Cursor cursor, boolean z) {
        super(context, null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{C0906R.attr.ae});
        this.f82702a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        com.zhihu.matisse.internal.entity.a a2 = com.zhihu.matisse.internal.entity.a.a(cursor);
        ((TextView) view.findViewById(C0906R.id.e3)).setText(a2.a(context));
        ((TextView) view.findViewById(C0906R.id.e2)).setText(String.valueOf(a2.f82636d));
        d.a().p.a(context, context.getResources().getDimensionPixelSize(C0906R.dimen.ik), this.f82702a, (ImageView) view.findViewById(C0906R.id.dz), Uri.fromFile(new File(a2.f82635c)));
    }
}
