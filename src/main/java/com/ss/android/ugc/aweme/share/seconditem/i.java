package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class i extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65287a;

    /* renamed from: b  reason: collision with root package name */
    private View.OnClickListener f65288b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f65289c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f65290d;

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        this.f65288b = onClickListener;
    }

    public static i a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f65287a, true, 73725, new Class[]{Context.class}, i.class)) {
            return new i(context2);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{context2}, null, f65287a, true, 73725, new Class[]{Context.class}, i.class);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65287a, false, 73724, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65287a, false, 73724, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f65288b != null) {
            this.f65288b.onClick(view);
        }
    }

    private i(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f65287a, false, 73720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65287a, false, 73720, new Class[0], Void.TYPE);
            return;
        }
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0906R.layout.arr, this);
        this.f65289c = (ImageView) findViewById(C0906R.id.cp6);
        this.f65290d = (TextView) findViewById(C0906R.id.cp7);
        setOnClickListener(this);
    }

    public void setBackground(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65287a, false, 73721, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65287a, false, 73721, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65289c.setImageResource(i);
    }

    public void setText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65287a, false, 73722, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65287a, false, 73722, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65290d.setText(getContext().getString(i));
    }

    public void setText(String str) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{str}, this, f65287a, false, 73723, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f65287a, false, 73723, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f65290d;
        if (str.contains(" ")) {
            i = 2;
        }
        textView.setMaxLines(i);
        this.f65290d.setText(str);
    }
}
