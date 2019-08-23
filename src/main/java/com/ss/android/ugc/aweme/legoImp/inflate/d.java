package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.ss.android.ugc.aweme.feed.ui.ao;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53085a;

    /* renamed from: b  reason: collision with root package name */
    private BaseRecyclerView f53086b;

    /* renamed from: c  reason: collision with root package name */
    private DmtStatusView f53087c;

    /* renamed from: d  reason: collision with root package name */
    private a f53088d = new a(this, (byte) 0);

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53089a;

        /* renamed from: b  reason: collision with root package name */
        public View.OnClickListener f53090b;

        private a() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f53089a, false, 55188, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f53089a, false, 55188, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f53090b != null) {
                this.f53090b.onClick(view);
            }
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }
    }

    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    @MeasureFunction
    private BaseRecyclerView b(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f53085a, false, 55182, new Class[]{Context.class}, BaseRecyclerView.class)) {
            return new MainBottomInflate$1(this, context2);
        }
        return (BaseRecyclerView) PatchProxy.accessDispatch(new Object[]{context2}, this, f53085a, false, 55182, new Class[]{Context.class}, BaseRecyclerView.class);
    }

    public final BaseRecyclerView a(Context context) {
        BaseRecyclerView baseRecyclerView;
        if (PatchProxy.isSupport(new Object[]{context}, this, f53085a, false, 55179, new Class[]{Context.class}, BaseRecyclerView.class)) {
            return (BaseRecyclerView) PatchProxy.accessDispatch(new Object[]{context}, this, f53085a, false, 55179, new Class[]{Context.class}, BaseRecyclerView.class);
        }
        if (this.f53086b != null) {
            baseRecyclerView = this.f53086b;
            this.f53086b = null;
        } else {
            baseRecyclerView = b(context);
        }
        return baseRecyclerView;
    }

    @MeasureFunction
    private DmtStatusView b(Context context, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, onClickListener2}, this, f53085a, false, 55181, new Class[]{Context.class, View.OnClickListener.class}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{context2, onClickListener2}, this, f53085a, false, 55181, new Class[]{Context.class, View.OnClickListener.class}, DmtStatusView.class);
        }
        ao aoVar = new ao(context2);
        aoVar.a(e.f53093b, f.f53095b, new g(context2, onClickListener2));
        aoVar.onColorModeChange(1);
        aoVar.setUseScreenHeight(context.getResources().getDimensionPixelSize(C0906R.dimen.lj));
        aoVar.b(0);
        return aoVar;
    }

    public final DmtStatusView a(Context context, View.OnClickListener onClickListener) {
        DmtStatusView dmtStatusView;
        if (PatchProxy.isSupport(new Object[]{context, onClickListener}, this, f53085a, false, 55180, new Class[]{Context.class, View.OnClickListener.class}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{context, onClickListener}, this, f53085a, false, 55180, new Class[]{Context.class, View.OnClickListener.class}, DmtStatusView.class);
        }
        if (this.f53087c != null) {
            dmtStatusView = this.f53087c;
            this.f53088d.f53090b = onClickListener;
            this.f53087c = null;
            this.f53088d = null;
        } else {
            dmtStatusView = b(context, onClickListener);
        }
        return dmtStatusView;
    }

    @MeasureFunction
    public final void a(@NotNull Context context, @Nullable Activity activity) {
        Activity activity2;
        if (PatchProxy.isSupport(new Object[]{context, activity}, this, f53085a, false, 55178, new Class[]{Context.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, activity}, this, f53085a, false, 55178, new Class[]{Context.class, Activity.class}, Void.TYPE);
            return;
        }
        if (activity != null) {
            activity2 = activity;
        } else {
            activity2 = context;
        }
        try {
            this.f53086b = b(activity2);
            this.f53087c = b(activity2, this.f53088d);
        } catch (Exception unused) {
        }
    }
}
