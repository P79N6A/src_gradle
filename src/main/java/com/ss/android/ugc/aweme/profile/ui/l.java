package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.DecorationAdapter;
import java.util.Map;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62956a;

    /* renamed from: b  reason: collision with root package name */
    private final DecorationAdapter.AvatarDecorationViewHolder f62957b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62958c;

    l(DecorationAdapter.AvatarDecorationViewHolder avatarDecorationViewHolder, int i) {
        this.f62957b = avatarDecorationViewHolder;
        this.f62958c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62956a, false, 67947, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62956a, false, 67947, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DecorationAdapter.AvatarDecorationViewHolder avatarDecorationViewHolder = this.f62957b;
        int i = this.f62958c;
        DecorationAdapter.this.a(i);
        if (DecorationAdapter.this.f61785d != null) {
            DecorationAdapter.this.f61785d.a(i);
        }
        if (DecorationAdapter.this.f61783b) {
            Boolean bool = DecorationAdapter.this.f61786e.get(Integer.valueOf(i));
            DecorationAdapter.this.f61786e.put(Integer.valueOf(i), Boolean.valueOf(bool == null || !bool.booleanValue()));
            DecorationAdapter decorationAdapter = DecorationAdapter.this;
            if (PatchProxy.isSupport(new Object[]{bool, Integer.valueOf(i)}, decorationAdapter, DecorationAdapter.f61782a, false, 67945, new Class[]{Boolean.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool, Integer.valueOf(i)}, decorationAdapter, DecorationAdapter.f61782a, false, 67945, new Class[]{Boolean.class, Integer.TYPE}, Void.TYPE);
            } else if (bool == null || !bool.booleanValue()) {
                for (Map.Entry next : decorationAdapter.f61786e.entrySet()) {
                    if (((Integer) next.getKey()).intValue() != i) {
                        next.setValue(Boolean.FALSE);
                    }
                }
            }
        }
    }
}
