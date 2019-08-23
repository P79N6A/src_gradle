package com.ss.android.ugc.aweme.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class LogListActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33654a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ah> f33655b = new ArrayList<>();
    @BindView(2131493558)
    TextView clearBtn;
    @BindView(2131495412)
    ListView listView;

    class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33659a;

        /* renamed from: com.ss.android.ugc.aweme.app.LogListActivity$a$a  reason: collision with other inner class name */
        class C0432a {

            /* renamed from: a  reason: collision with root package name */
            TextView f33661a;

            private C0432a() {
            }

            /* synthetic */ C0432a(a aVar, byte b2) {
                this();
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f33659a, false, 22556, new Class[0], Integer.TYPE)) {
                return LogListActivity.this.f33655b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33659a, false, 22556, new Class[0], Integer.TYPE)).intValue();
        }

        private a() {
        }

        public final Object getItem(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f33659a, false, 22557, new Class[]{Integer.TYPE}, Object.class)) {
                return LogListActivity.this.f33655b.get(i);
            }
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f33659a, false, 22557, new Class[]{Integer.TYPE}, Object.class);
        }

        /* synthetic */ a(LogListActivity logListActivity, byte b2) {
            this();
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C0432a aVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f33659a, false, 22558, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f33659a, false, 22558, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (view == null) {
                aVar = new C0432a(this, (byte) 0);
                view2 = LayoutInflater.from(LogListActivity.this).inflate(C0906R.layout.a1c, null);
                aVar.f33661a = (TextView) view2.findViewById(C0906R.id.bpn);
                view2.setTag(aVar);
            } else {
                aVar = (C0432a) view.getTag();
                view2 = view;
            }
            int i2 = i;
            ah ahVar = LogListActivity.this.f33655b.get(i);
            if (ahVar != null) {
                String str = "";
                if (ahVar.f33756f != null) {
                    StringBuilder sb = new StringBuilder();
                    JSONObject jSONObject = ahVar.f33756f;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String string = jSONObject.getString(keys.next());
                            sb.append("\n" + r6 + " = " + string);
                        } catch (Exception unused) {
                        }
                    }
                    str = sb.toString();
                }
                String str2 = "";
                if (ahVar.g == 1) {
                    str2 = "category: " + ahVar.f33751a + "\ntag: " + ahVar.f33752b + "\nlabel: " + ahVar.f33753c + "\nextValue:" + ahVar.f33755e + "\nvalue: " + ahVar.f33754d + "\nextJson: " + str;
                } else if (ahVar.g == 2) {
                    str2 = "eventName: " + ahVar.f33752b + "\nextra: " + str;
                }
                aVar.f33661a.setText(str2);
            }
            return view2;
        }
    }

    public final int a() {
        return C0906R.layout.a_u;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33654a, false, 22553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33654a, false, 22553, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33654a, false, 22554, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33654a, false, 22554, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33654a, false, 22552, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33654a, false, 22552, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f33655b = ag.a().f33750b;
        final a aVar = new a(this, (byte) 0);
        this.listView.setAdapter(aVar);
        this.listView.setSelection(this.f33655b.size() - 1);
        this.clearBtn.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33656a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33656a, false, 22555, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33656a, false, 22555, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                LogListActivity.this.f33655b.clear();
                aVar.notifyDataSetChanged();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", false);
    }
}
