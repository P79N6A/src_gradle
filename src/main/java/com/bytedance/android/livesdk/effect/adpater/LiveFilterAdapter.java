package com.bytedance.android.livesdk.effect.adpater;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class LiveFilterAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13713a;

    /* renamed from: b  reason: collision with root package name */
    List<FilterModel> f13714b;

    /* renamed from: c  reason: collision with root package name */
    int f13715c;

    /* renamed from: d  reason: collision with root package name */
    a f13716d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13717e;

    /* renamed from: f  reason: collision with root package name */
    private Context f13718f;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13719a;

        /* renamed from: b  reason: collision with root package name */
        public final View f13720b;

        /* renamed from: c  reason: collision with root package name */
        public View f13721c;

        /* renamed from: d  reason: collision with root package name */
        public HSImageView f13722d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f13723e;

        /* renamed from: f  reason: collision with root package name */
        View f13724f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f13719a, false, 8236, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13719a, false, 8236, new Class[0], Void.TYPE);
                return;
            }
            this.f13724f.setVisibility(4);
        }

        ViewHolder(View view) {
            super(view);
            this.f13721c = view.findViewById(C0906R.id.lx);
            this.f13722d = (HSImageView) view.findViewById(C0906R.id.az5);
            this.f13723e = (TextView) view.findViewById(C0906R.id.df7);
            this.f13720b = view.findViewById(C0906R.id.b2w);
            this.f13724f = view.findViewById(C0906R.id.aw1);
        }
    }

    public interface a {
        void a(int i);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f13713a, false, 8233, new Class[0], Integer.TYPE)) {
            return this.f13714b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f13713a, false, 8233, new Class[0], Integer.TYPE)).intValue();
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f13713a, false, 8229, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f13713a, false, 8229, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(this.f13718f);
        if (this.f13717e) {
            i2 = C0906R.layout.ajl;
        } else {
            i2 = C0906R.layout.ajk;
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onBindViewHolder(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            r21 = this;
            r7 = r21
            r8 = r23
            r9 = r22
            com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter$ViewHolder r9 = (com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.ViewHolder) r9
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f13713a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter$ViewHolder> r1 = com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 8230(0x2026, float:1.1533E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f13713a
            r3 = 0
            r4 = 8230(0x2026, float:1.1533E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter$ViewHolder> r1 = com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.util.List<com.bytedance.android.livesdk.effect.model.FilterModel> r0 = r7.f13714b
            java.lang.Object r0 = r0.get(r8)
            r10 = r0
            com.bytedance.android.livesdk.effect.model.FilterModel r10 = (com.bytedance.android.livesdk.effect.model.FilterModel) r10
            int r0 = r7.f13715c
            if (r8 != r0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            android.view.View r1 = r9.f13721c
            r13 = 4
            if (r0 == 0) goto L_0x0066
            r2 = 0
            goto L_0x0067
        L_0x0066:
            r2 = 4
        L_0x0067:
            r1.setVisibility(r2)
            if (r0 == 0) goto L_0x0083
            boolean r1 = r7.f13717e
            if (r1 == 0) goto L_0x0083
            android.widget.TextView r1 = r9.f13723e
            android.content.Context r2 = r7.f13718f
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131625614(0x7f0e068e, float:1.887844E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x0095
        L_0x0083:
            android.widget.TextView r1 = r9.f13723e
            android.content.Context r2 = r7.f13718f
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131624646(0x7f0e02c6, float:1.8876478E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L_0x0095:
            if (r0 == 0) goto L_0x00aa
            android.widget.TextView r0 = r9.f13723e
            android.content.Context r1 = r7.f13718f
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131625223(0x7f0e0507, float:1.8877648E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x00bc
        L_0x00aa:
            android.widget.TextView r0 = r9.f13723e
            android.content.Context r1 = r7.f13718f
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131625224(0x7f0e0508, float:1.887765E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x00bc:
            int r0 = r10.getFilterType()
            r1 = 8
            switch(r0) {
                case 0: goto L_0x01aa;
                case 1: goto L_0x0186;
                case 2: goto L_0x00c7;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x01e7
        L_0x00c7:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.f13722d
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r10.getEffect()
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f13713a
            r17 = 1
            r18 = 8232(0x2028, float:1.1535E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.effectmanager.common.model.UrlModel> r4 = com.ss.android.ugc.effectmanager.common.model.UrlModel.class
            r3[r11] = r4
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r20 = com.bytedance.android.live.base.model.ImageModel.class
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x0106
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f13713a
            r17 = 1
            r18 = 8232(0x2028, float:1.1535E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.effectmanager.common.model.UrlModel> r3 = com.ss.android.ugc.effectmanager.common.model.UrlModel.class
            r2[r11] = r3
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r20 = com.bytedance.android.live.base.model.ImageModel.class
            r19 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.bytedance.android.live.base.model.ImageModel r2 = (com.bytedance.android.live.base.model.ImageModel) r2
            goto L_0x0116
        L_0x0106:
            com.bytedance.android.live.base.model.ImageModel r3 = new com.bytedance.android.live.base.model.ImageModel
            r3.<init>()
            java.lang.String r4 = r2.uri
            r3.setUri(r4)
            java.util.List<java.lang.String> r2 = r2.url_list
            r3.setUrls(r2)
            r2 = r3
        L_0x0116:
            com.bytedance.android.live.core.utils.k.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r2)
            android.widget.TextView r0 = r9.f13723e
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r10.getEffect()
            java.lang.String r2 = r2.name
            r0.setText(r2)
            com.bytedance.android.livesdk.effect.j r0 = com.bytedance.android.livesdk.effect.j.a()
            boolean r0 = r0.c(r10)
            if (r0 == 0) goto L_0x0134
            android.view.View r0 = r9.f13720b
            r0.setVisibility(r11)
            goto L_0x0139
        L_0x0134:
            android.view.View r0 = r9.f13720b
            r0.setVisibility(r1)
        L_0x0139:
            boolean r0 = r10.isNew()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.ViewHolder.f13719a
            r3 = 0
            r4 = 8235(0x202b, float:1.154E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.bytedance.android.livesdk.effect.model.FilterModel> r1 = com.bytedance.android.livesdk.effect.model.FilterModel.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.ViewHolder.f13719a
            r3 = 0
            r4 = 8235(0x202b, float:1.154E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.bytedance.android.livesdk.effect.model.FilterModel> r1 = com.bytedance.android.livesdk.effect.model.FilterModel.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01e7
        L_0x016e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r10.getEffect()
            if (r0 == 0) goto L_0x0180
            boolean r0 = r10.isNew()
            if (r0 == 0) goto L_0x0180
            android.view.View r0 = r9.f13724f
            r0.setVisibility(r11)
            goto L_0x01e7
        L_0x0180:
            android.view.View r0 = r9.f13724f
            r0.setVisibility(r13)
            goto L_0x01e7
        L_0x0186:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.f13722d
            com.bytedance.android.livesdk.effect.model.LocalFilterModel r2 = r10.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.utils.ac.c(r2)
            r0.setImageDrawable(r2)
            android.widget.TextView r0 = r9.f13723e
            com.bytedance.android.livesdk.effect.model.LocalFilterModel r2 = r10.getLocalFilter()
            java.lang.String r2 = r2.getName()
            r0.setText(r2)
            android.view.View r0 = r9.f13720b
            r0.setVisibility(r1)
            goto L_0x01e4
        L_0x01aa:
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.START_LIVE_STYLE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x01c1
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.f13722d
            r2 = 2130841374(0x7f020f1e, float:1.7287813E38)
            r0.setImageResource(r2)
            goto L_0x01d2
        L_0x01c1:
            com.bytedance.android.live.core.widget.HSImageView r0 = r9.f13722d
            com.bytedance.android.livesdk.effect.model.LocalFilterModel r2 = r10.getLocalFilter()
            int r2 = r2.getCoverResId()
            android.graphics.drawable.Drawable r2 = com.bytedance.android.live.core.utils.ac.c(r2)
            r0.setImageDrawable(r2)
        L_0x01d2:
            android.widget.TextView r0 = r9.f13723e
            com.bytedance.android.livesdk.effect.model.LocalFilterModel r2 = r10.getLocalFilter()
            java.lang.String r2 = r2.getName()
            r0.setText(r2)
            android.view.View r0 = r9.f13720b
            r0.setVisibility(r1)
        L_0x01e4:
            r9.a()
        L_0x01e7:
            android.view.View r0 = r9.itemView
            com.bytedance.android.livesdk.effect.adpater.a r1 = new com.bytedance.android.livesdk.effect.adpater.a
            r1.<init>(r7, r8, r9)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public LiveFilterAdapter(Context context, List<FilterModel> list, a aVar, boolean z) {
        this.f13718f = context;
        list = list == null ? new ArrayList<>() : list;
        this.f13717e = z;
        this.f13714b = list;
        this.f13715c = ((Integer) b.E.a()).intValue();
        this.f13716d = aVar;
    }
}
