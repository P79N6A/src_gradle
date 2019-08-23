package com.ss.android.ugc.aweme.property;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.g;
import java.util.Comparator;
import java.util.TreeSet;

public class TestABActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63241a;

    /* renamed from: b  reason: collision with root package name */
    protected LinearLayout f63242b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63241a, false, 70281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63241a, false, 70281, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestABActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestABActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63241a, false, 70282, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63241a, false, 70282, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestABActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63241a, false, 70279, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63241a, false, 70279, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestABActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ab);
        ((TextView) findViewById(C0906R.id.title)).setText("工具线");
        this.f63242b = (LinearLayout) findViewById(C0906R.id.ba9);
        if (PatchProxy.isSupport(new Object[0], this, f63241a, false, 70280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63241a, false, 70280, new Class[0], Void.TYPE);
        } else {
            Comparator comparator = j.f63298b;
            TreeSet<a.C0682a> treeSet = new TreeSet<>(comparator);
            TreeSet<a.C0682a> treeSet2 = new TreeSet<>(comparator);
            for (a.C0682a aVar : (a.C0682a[]) a.C0682a.class.getEnumConstants()) {
                if (aVar.type() == g.b.Boolean) {
                    treeSet2.add(aVar);
                }
                if (aVar.type() == g.b.Integer || aVar.type() == g.b.Long || aVar.type() == g.b.Float) {
                    treeSet.add(aVar);
                }
            }
            for (a.C0682a aVABProperty : treeSet2) {
                c cVar = new c(this);
                cVar.setAVABProperty(aVABProperty);
                this.f63242b.addView(cVar);
            }
            for (a.C0682a aVABProperty2 : treeSet) {
                b bVar = new b(this);
                bVar.setAVABProperty(aVABProperty2);
                this.f63242b.addView(bVar);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestABActivity", "onCreate", false);
    }
}
