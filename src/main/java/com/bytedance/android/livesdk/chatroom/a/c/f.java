package com.bytedance.android.livesdk.chatroom.a.c;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.barrage.a.c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f9741a;

    /* renamed from: b  reason: collision with root package name */
    private final View f9742b;

    public f(View view, float f2, float f3, e eVar) {
        int i;
        this.f9742b = view;
        boolean z = false;
        if (!(eVar == null || eVar.f16615d == null || TTLiveSDKContext.getHostService().k().b() != eVar.f16615d.getId())) {
            z = true;
        }
        TextView textView = (TextView) view.findViewById(C0906R.id.da0);
        if (!(eVar == null || eVar.f16614c == null)) {
            textView.setText(eVar.f16614c);
        }
        textView.setTextSize(1, f2);
        textView.setAlpha(f3);
        int i2 = -1;
        if (!(view.getContext() == null || view.getContext().getResources() == null)) {
            Resources resources = view.getContext().getResources();
            if (z) {
                i = C0906R.color.ahe;
            } else {
                i = C0906R.color.si;
            }
            i2 = resources.getColor(i);
        }
        textView.setTextColor(i2);
        this.f9741a = new c(this.f9742b);
    }
}
