package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class TimeLockAboutFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33494a;

    /* renamed from: b  reason: collision with root package name */
    private Button f33495b;

    /* renamed from: c  reason: collision with root package name */
    private View f33496c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f33497d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f33498e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f33499f;

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33494a, false, 21959, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33494a, false, 21959, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f33495b = (Button) view.findViewById(C0906R.id.oe);
        this.f33499f = (TextView) view.findViewById(C0906R.id.aij);
        TextView textView = this.f33499f;
        if (AbTestManager.a().aI() == 0 || a.c() || a.b()) {
            i = C0906R.string.a1p;
        } else {
            i = C0906R.string.a1q;
        }
        textView.setText(i);
        this.f33496c = view.findViewById(C0906R.id.ix);
        this.f33496c.setOnClickListener(new a(this));
        this.f33497d = (TextView) view.findViewById(C0906R.id.title);
        this.f33497d.setText(getResources().getText(C0906R.string.cl2));
        this.f33498e = (ViewGroup) view.findViewById(C0906R.id.d3v);
        if (a.b()) {
            this.f33498e.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        }
        this.f33495b.setOnClickListener(new b(this));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33494a, false, 21958, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qu, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33494a, false, 21958, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
