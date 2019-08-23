package com.bytedance.android.livesdk.feed.banner.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.android.livesdk.feed.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14043a;

    /* renamed from: b  reason: collision with root package name */
    HSImageView f14044b;

    /* renamed from: c  reason: collision with root package name */
    TextView f14045c;

    /* renamed from: d  reason: collision with root package name */
    TextView f14046d;

    /* renamed from: e  reason: collision with root package name */
    Context f14047e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.android.live.base.model.b.a f14048f;
    String g;
    private n h;

    public a(View view, Context context, String str, n nVar) {
        this.f14044b = (HSImageView) view.findViewById(C0906R.id.ar6);
        this.f14045c = (TextView) view.findViewById(C0906R.id.text);
        this.f14046d = (TextView) view.findViewById(C0906R.id.b79);
        this.f14044b.setOnClickListener(new b(this));
        this.f14047e = context;
        this.g = str;
        this.h = nVar;
        if (c.c()) {
            view.setContentDescription(ac.a((int) C0906R.string.czt));
        }
    }
}
