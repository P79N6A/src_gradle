package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.profile.ui.PickCollegeAdapter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public final class k extends Dialog implements PickCollegeAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62948a;

    /* renamed from: b  reason: collision with root package name */
    public a f62949b;

    /* renamed from: c  reason: collision with root package name */
    private TextTitleBar f62950c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f62951d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f62952e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private PickCollegeAdapter f62953f;

    public interface a {
        void a(String str);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62948a, false, 67914, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62948a, false, 67914, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(C0906R.style.fi);
            }
        }
    }

    public final void a(View view, String str) {
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f62948a, false, 67916, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f62948a, false, 67916, new Class[]{View.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f62949b != null) {
            this.f62949b.a(str);
        }
        dismiss();
    }

    public k(@NonNull Context context, List<String> list) {
        super(context, C0906R.style.fu);
        if (!CollectionUtils.isEmpty(list)) {
            this.f62952e.addAll(list);
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.iq, null);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62948a, false, 67911, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62948a, false, 67911, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(inflate);
            this.f62950c = (TextTitleBar) inflate.findViewById(C0906R.id.d3m);
            this.f62951d = (RecyclerView) inflate.findViewById(C0906R.id.by5);
            this.f62951d.setLayoutManager(new WrapLinearLayoutManager(getContext()));
            this.f62953f = new PickCollegeAdapter();
            this.f62951d.setAdapter(this.f62953f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f62948a, false, 67912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62948a, false, 67912, new Class[0], Void.TYPE);
        } else {
            this.f62950c.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62954a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62954a, false, 67917, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62954a, false, 67917, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    k.this.dismiss();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62954a, false, 67918, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62954a, false, 67918, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    k kVar = k.this;
                    if (PatchProxy.isSupport(new Object[0], kVar, k.f62948a, false, 67913, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], kVar, k.f62948a, false, 67913, new Class[0], Void.TYPE);
                        return;
                    }
                    Window window = kVar.getWindow();
                    if (window != null) {
                        window.setWindowAnimations(0);
                    }
                    Intent intent = new Intent(kVar.getContext(), CrossPlatformActivity.class);
                    intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/college_declare?hide_nav_bar=1"));
                    kVar.getContext().startActivity(intent);
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f62948a, false, 67915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62948a, false, 67915, new Class[0], Void.TYPE);
            return;
        }
        this.f62953f.setData(this.f62952e);
        this.f62953f.f62079b = this;
    }
}
