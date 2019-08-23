package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a.c;
import com.ss.android.ugc.aweme.poi.adapter.a;

public class PoiCateMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59492a;
    @BindView(2131496200)
    View mDivider;
    @BindView(2131496201)
    TextView mTxtMore;

    public PoiCateMoreViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    public final void a(c cVar, boolean z, int i, a aVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), aVar}, this, f59492a, false, 64794, new Class[]{c.class, Boolean.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z), Integer.valueOf(i), aVar}, this, f59492a, false, 64794, new Class[]{c.class, Boolean.TYPE, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        View view = this.itemView;
        final a aVar2 = aVar;
        final c cVar3 = cVar;
        final boolean z2 = z;
        final int i2 = i;
        AnonymousClass1 r0 = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59493a;

            public final void onClick(View view) {
                int i;
                if (PatchProxy.isSupport(new Object[]{view}, this, f59493a, false, 64795, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f59493a, false, 64795, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (aVar2 != null) {
                    a aVar = aVar2;
                    String str = cVar3.aid;
                    String str2 = cVar3.relatedId;
                    boolean z = z2;
                    if (z2) {
                        i = i2;
                    } else {
                        i = cVar3.targetPosition;
                    }
                    aVar.a(str, str2, z, i);
                }
            }
        };
        view.setOnClickListener(r0);
        if (cVar2.showDividerLine) {
            this.mDivider.setVisibility(0);
        } else {
            this.mDivider.setVisibility(8);
        }
    }
}
