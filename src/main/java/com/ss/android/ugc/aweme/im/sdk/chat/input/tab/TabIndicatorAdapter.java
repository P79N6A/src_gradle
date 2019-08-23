package com.ss.android.ugc.aweme.im.sdk.chat.input.tab;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.input.c;
import com.ss.android.ugc.aweme.im.sdk.utils.a;

public class TabIndicatorAdapter extends RecyclerView.Adapter<TabHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50870a;

    /* renamed from: b  reason: collision with root package name */
    public a f50871b;

    public class TabHolder extends BaseViewHolder<c> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50872c;

        /* renamed from: e  reason: collision with root package name */
        private RemoteImageView f50874e;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50872c, false, 51094, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50872c, false, 51094, new Class[0], Void.TYPE);
                return;
            }
            this.f50874e = (RemoteImageView) this.itemView.findViewById(C0906R.id.cyy);
        }

        public TabHolder(View view) {
            super(view);
        }

        public final void a(c cVar, final int i) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f50872c, false, 51095, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f50872c, false, 51095, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (cVar.h() == 2) {
                com.ss.android.ugc.aweme.base.c.a(this.f50874e, cVar.b());
            } else {
                this.f50874e.setImageResource(cVar.a());
            }
            if (!TextUtils.isEmpty(cVar.c())) {
                a.a((View) this.f50874e, cVar.c());
            }
            RemoteImageView remoteImageView = this.f50874e;
            if (i == TabIndicatorAdapter.this.f50871b.f().f50564d) {
                z = true;
            }
            remoteImageView.setSelected(z);
            this.f50874e.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50875a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50875a, false, 51096, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50875a, false, 51096, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    TabIndicatorAdapter.this.f50871b.a(i);
                }
            });
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f50870a, false, 51093, new Class[0], Integer.TYPE)) {
            return this.f50871b.f().e();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50870a, false, 51093, new Class[0], Integer.TYPE)).intValue();
    }

    public TabIndicatorAdapter(a aVar) {
        this.f50871b = aVar;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        TabHolder tabHolder = (TabHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{tabHolder, Integer.valueOf(i)}, this, f50870a, false, 51092, new Class[]{TabHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tabHolder, Integer.valueOf(i)}, this, f50870a, false, 51092, new Class[]{TabHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        tabHolder.a(this.f50871b.f().e(i2), i2);
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50870a, false, 51091, new Class[]{ViewGroup.class, Integer.TYPE}, TabHolder.class)) {
            return (TabHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50870a, false, 51091, new Class[]{ViewGroup.class, Integer.TYPE}, TabHolder.class);
        }
        return new TabHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a13, viewGroup2, false));
    }
}
