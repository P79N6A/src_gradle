package com.ss.android.ugc.aweme.setting.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64449a;

    /* renamed from: b  reason: collision with root package name */
    private final TestDependenciesActivity f64450b;

    s(TestDependenciesActivity testDependenciesActivity) {
        this.f64450b = testDependenciesActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64449a, false, 72695, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64449a, false, 72695, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TestDependenciesActivity testDependenciesActivity = this.f64450b;
        String obj = testDependenciesActivity.f64228b.getText().toString();
        if (testDependenciesActivity.f64229c.size() > 0) {
            if (TextUtils.isEmpty(obj)) {
                testDependenciesActivity.f64230d.a(testDependenciesActivity.f64229c);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = testDependenciesActivity.f64229c.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next.contains(obj)) {
                    arrayList.add(next);
                }
            }
            testDependenciesActivity.f64230d.a(arrayList);
        }
    }
}
