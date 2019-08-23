package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.profile.model.SelelctCityModel;
import com.ss.android.ugc.aweme.profile.presenter.aa;
import com.ss.android.ugc.aweme.profile.presenter.p;
import com.ss.android.ugc.aweme.profile.ui.WheelPicker;
import java.util.List;

public final class du extends PopupWindow implements p, WheelPicker.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62699a;

    /* renamed from: b  reason: collision with root package name */
    WheelPicker f62700b;

    /* renamed from: c  reason: collision with root package name */
    WheelPicker f62701c;

    /* renamed from: d  reason: collision with root package name */
    public aa f62702d = new aa();

    /* renamed from: e  reason: collision with root package name */
    public String f62703e;

    /* renamed from: f  reason: collision with root package name */
    public int f62704f;
    public a g;
    private TextView h;
    private Activity i;

    public interface a {
        void a(boolean z, String str);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62699a, false, 69047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62699a, false, 69047, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this.i)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.i, this.i.getResources().getString(C0906R.string.bga)).a();
        } else {
            if (this.i != null && !this.i.isFinishing() && !isShowing()) {
                showAtLocation(this.i.getWindow().getDecorView(), 80, 0, 0);
            }
        }
    }

    public du(Activity activity) {
        super(activity);
        this.i = activity;
        View inflate = ((LayoutInflater) k.a().getSystemService("layout_inflater")).inflate(C0906R.layout.abk, null);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62699a, false, 69046, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62699a, false, 69046, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(inflate);
            setWidth(UIUtils.getScreenWidth(k.a()));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(this.i.getResources().getColor(C0906R.color.ano)));
            setFocusable(true);
            setOutsideTouchable(true);
            setAnimationStyle(C0906R.style.tz);
            update();
        }
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62699a, false, 69045, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62699a, false, 69045, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.h = (TextView) inflate.findViewById(C0906R.id.dfp);
        this.f62700b = (WheelPicker) inflate.findViewById(C0906R.id.bl6);
        this.f62700b.setOnItemSelectedListener(this);
        this.f62701c = (WheelPicker) inflate.findViewById(C0906R.id.bl7);
        this.f62701c.setOnItemSelectedListener(this);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62705a;

            public final void onClick(View view) {
                boolean z;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f62705a, false, 69050, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62705a, false, 69050, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (du.this.g != null) {
                    a aVar = du.this.g;
                    if (du.this.f62704f != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.a(z, du.this.f62703e);
                    if (du.this.f62704f == 0) {
                        z2 = false;
                    }
                    SelelctCityModel.uploadLocation(z2);
                }
                du.this.dismiss();
            }
        });
        this.f62702d.a(this);
        this.f62702d.a(new Object[0]);
    }

    public final void a(List<String> list, List<String> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f62699a, false, 69049, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2}, this, f62699a, false, 69049, new Class[]{List.class, List.class}, Void.TYPE);
        } else if (this.f62700b != null && this.f62701c != null && list != null && list2 != null) {
            this.f62700b.setData(list);
            this.f62701c.setData(list2);
        }
    }

    public final void a(WheelPicker wheelPicker, Object obj, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{wheelPicker, obj, Integer.valueOf(i2)}, this, f62699a, false, 69048, new Class[]{WheelPicker.class, Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wheelPicker, obj, Integer.valueOf(i2)}, this, f62699a, false, 69048, new Class[]{WheelPicker.class, Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int id = wheelPicker.getId();
        if (id == C0906R.id.bl6) {
            this.f62704f = i3;
            this.f62701c.setData(((SelelctCityModel) this.f62702d.i()).getCityData(i3));
            this.f62701c.setSelectedItemPosition(0);
            this.f62703e = String.valueOf(this.f62701c.getData().get(0));
            return;
        }
        if (id == C0906R.id.bl7) {
            this.f62703e = String.valueOf(obj);
        }
    }
}
