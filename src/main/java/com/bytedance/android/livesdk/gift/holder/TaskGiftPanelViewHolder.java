package com.bytedance.android.livesdk.gift.holder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.e.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.gift.model.a.j;
import com.bytedance.android.livesdk.gift.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class TaskGiftPanelViewHolder extends BaseGiftPanelViewHolder<j> {
    public static ChangeQuickRedirect p;
    private final TextView q;

    public TaskGiftPanelViewHolder(View view) {
        super(view);
        this.q = (TextView) view.findViewById(C0906R.id.dc_);
    }

    /* access modifiers changed from: private */
    public void a(@NonNull j jVar) {
        long j;
        if (PatchProxy.isSupport(new Object[]{jVar}, this, p, false, 9742, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, p, false, 9742, new Class[]{j.class}, Void.TYPE);
            return;
        }
        super.a(jVar);
        if (((a) b.a(a.class)).user().c()) {
            j = u.a().b();
        } else {
            j = 0;
        }
        this.q.setText(ac.a((int) C0906R.string.d3s, Long.valueOf(j)));
        this.q.setVisibility(0);
        this.f15013d.setVisibility(8);
        this.k.setVisibility(4);
        if (j <= 0) {
            jVar.f15096b = false;
            this.j.setAlpha(0.32f);
            this.f15014e.setBackgroundResource(0);
        }
    }

    public final /* synthetic */ void a(@NonNull com.bytedance.android.livesdk.gift.model.a.b bVar, @NonNull List list) {
        long j;
        j jVar = (j) bVar;
        if (PatchProxy.isSupport(new Object[]{jVar, list}, this, p, false, 9743, new Class[]{j.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar, list}, this, p, false, 9743, new Class[]{j.class, List.class}, Void.TYPE);
            return;
        }
        Bundle bundle = (Bundle) list.get(0);
        if (((a) b.a(a.class)).user().c()) {
            j = u.a().b();
        } else {
            j = 0;
        }
        for (String str : bundle.keySet()) {
            char c2 = 65535;
            if (str.hashCode() == 1611446874 && str.equals("key_task_gift_count")) {
                c2 = 0;
            }
            if (c2 == 0) {
                this.q.setText(ac.a((int) C0906R.string.d3s, Long.valueOf(j)));
                a(jVar.f15096b);
                if (j <= 0) {
                    jVar.f15096b = false;
                    this.j.setAlpha(0.32f);
                    this.f15014e.setBackgroundResource(0);
                }
            }
        }
    }
}
