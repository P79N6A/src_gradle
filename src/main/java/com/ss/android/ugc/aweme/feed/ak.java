package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.f.am;
import com.ss.android.ugc.aweme.utils.bg;

public final class ak extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45031a;

    public ak(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f45031a, false, 40237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45031a, false, 40237, new Class[0], Void.TYPE);
            return;
        }
        ((TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.a6s, this, true).findViewById(C0906R.id.df9)).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45032a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f45032a, false, 40238, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f45032a, false, 40238, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                bg.a(new am());
            }
        });
    }
}
