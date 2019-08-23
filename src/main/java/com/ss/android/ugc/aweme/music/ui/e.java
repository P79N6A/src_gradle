package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class e extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56696a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f56697b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f56698c;

    /* renamed from: d  reason: collision with root package name */
    public View f56699d;

    public e(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f56696a, false, 60133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56696a, false, 60133, new Class[0], Void.TYPE);
            return;
        }
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0906R.layout.gg, this);
        this.f56697b = (TextView) findViewById(C0906R.id.d9o);
        this.f56698c = (TextView) findViewById(C0906R.id.d9p);
        this.f56699d = findViewById(C0906R.id.atm);
    }
}
