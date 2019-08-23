package com.bytedance.android.livesdk.sticker.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

public final class b extends Dialog implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17375a;

    /* renamed from: b  reason: collision with root package name */
    final a f17376b;

    /* renamed from: c  reason: collision with root package name */
    public SwitchCompat f17377c;

    /* renamed from: d  reason: collision with root package name */
    public LoadingStatusView f17378d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f17379e;

    /* renamed from: f  reason: collision with root package name */
    public LiveGestureMagicPageAdapter f17380f;
    public List<EffectCategoryResponse> g;
    private final DataCenter h;
    private View i;
    private boolean j;
    private View k;

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17375a, false, 13445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17375a, false, 13445, new Class[0], Void.TYPE);
            return;
        }
        this.f17378d.b();
        this.f17376b.a(a.f17261b, new a.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17381a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f17381a, false, 13453, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f17381a, false, 13453, new Class[0], Void.TYPE);
                    return;
                }
                b.this.f17378d.d();
            }

            public final void a(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f17381a, false, 13452, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f17381a, false, 13452, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                    return;
                }
                b.this.a(0);
                if (effectChannelResponse2 != null) {
                    List<EffectCategoryResponse> list = effectChannelResponse2.categoryResponseList;
                    if (Lists.isEmpty(list)) {
                        b.this.f17378d.c();
                        return;
                    }
                    if (list.size() > 3) {
                        ViewGroup.LayoutParams layoutParams = b.this.f17379e.getLayoutParams();
                        layoutParams.height = (int) UIUtils.dip2Px(b.this.getContext(), 216.0f);
                        b.this.f17379e.setLayoutParams(layoutParams);
                    }
                    b.this.g = list;
                    b.this.f17378d.a();
                    b.this.f17378d.setVisibility(8);
                    LiveGestureMagicPageAdapter liveGestureMagicPageAdapter = b.this.f17380f;
                    List<EffectCategoryResponse> list2 = b.this.g;
                    if (PatchProxy.isSupport(new Object[]{list2}, liveGestureMagicPageAdapter, LiveGestureMagicPageAdapter.f17326a, false, 13454, new Class[]{List.class}, Void.TYPE)) {
                        LiveGestureMagicPageAdapter liveGestureMagicPageAdapter2 = liveGestureMagicPageAdapter;
                        PatchProxy.accessDispatch(new Object[]{list2}, liveGestureMagicPageAdapter2, LiveGestureMagicPageAdapter.f17326a, false, 13454, new Class[]{List.class}, Void.TYPE);
                    } else if (!Lists.isEmpty(list2)) {
                        liveGestureMagicPageAdapter.f17328c = list2;
                        if (liveGestureMagicPageAdapter.f17329d) {
                            liveGestureMagicPageAdapter.a();
                            liveGestureMagicPageAdapter.f17329d = false;
                        }
                        liveGestureMagicPageAdapter.notifyDataSetChanged();
                    }
                    b.this.a(((Boolean) com.bytedance.android.livesdk.w.b.ae.a()).booleanValue());
                    if (((Boolean) com.bytedance.android.livesdk.w.b.ae.a()).booleanValue()) {
                        b.this.f17380f.a();
                    }
                    b.this.f17377c.setOnCheckedChangeListener(null);
                    b.this.f17377c.setChecked(((Boolean) com.bytedance.android.livesdk.w.b.ae.a()).booleanValue());
                    b.this.f17377c.setOnCheckedChangeListener(b.this);
                }
            }
        });
    }

    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f17375a, false, 13444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17375a, false, 13444, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        a(4);
        a();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17375a, false, 13448, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17375a, false, 13448, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k.setVisibility(i2);
        this.f17379e.setVisibility(i2);
        this.f17377c.setVisibility(i2);
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f17375a, false, 13447, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f17375a, false, 13447, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.i;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17375a, false, 13442, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f17375a, false, 13442, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        j.b().a(f.GESTURE_MAGIC, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.a(false));
        j.a().a(f.MORE, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.a(false));
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agr, null));
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.k = findViewById(C0906R.id.dc7);
        this.f17377c = (SwitchCompat) findViewById(C0906R.id.aj_);
        this.f17377c.setThumbResource(2130841574);
        this.f17377c.setTrackResource(2130841577);
        this.f17378d = (LoadingStatusView) findViewById(C0906R.id.cvd);
        this.f17379e = (RecyclerView) findViewById(C0906R.id.ccc);
        this.f17379e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f17379e.addItemDecoration(new LiveGesturePageItemDecoration());
        this.f17380f = new LiveGestureMagicPageAdapter(this.f17376b);
        this.f17380f.f17327b = new c(this);
        this.f17379e.setAdapter(this.f17380f);
        this.i = findViewById(C0906R.id.bnf);
        this.f17378d.setOnClickListener(d.f17386b);
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ani, null, false);
        inflate.setOnClickListener(new e(this));
        this.f17378d.setBuilder(LoadingStatusView.a.a(getContext()).a((int) UIUtils.dip2Px(getContext(), 56.0f)).c(inflate));
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f17375a, false, 13443, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f17375a, false, 13443, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.w.b.ae.a(Boolean.valueOf(z));
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f17375a, false, 13446, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f17375a, false, 13446, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            this.j = z;
            if (z) {
                this.h.lambda$put$1$DataCenter("cmd_sticker_tip", getContext().getString(C0906R.string.d3c));
                this.f17380f.a();
            } else {
                this.h.lambda$put$1$DataCenter("cmd_sticker_tip", "");
                this.f17380f.b();
            }
        }
        a(z);
    }

    public b(@NonNull Context context, a aVar, DataCenter dataCenter) {
        super(context, C0906R.style.w7);
        this.f17376b = aVar;
        this.h = dataCenter;
        com.bytedance.android.livesdk.w.b.ac.a(Boolean.FALSE);
    }
}
