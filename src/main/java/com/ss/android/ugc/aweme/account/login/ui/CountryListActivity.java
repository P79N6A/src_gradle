package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.login.model.a;
import com.ss.android.ugc.aweme.account.login.ui.CountryAdapter;
import com.ss.android.ugc.aweme.account.login.ui.WaveSideBar;
import com.ss.android.ugc.aweme.common.ui.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CountryListActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32427a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f32428b;
    @BindView(2131492914)
    ImageView back;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f32429c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f32430d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private WaveSideBar f32431e;
    @BindView(2131493329)
    EditText etSearch;
    @BindView(2131493334)
    TextView txtSearch;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32427a, false, 20556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32427a, false, 20556, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32427a, false, 20557, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32427a, false, 20557, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f32427a, false, 20555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32427a, false, 20555, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f32427a, false, 20554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32427a, false, 20554, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32427a, false, 20551, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32427a, false, 20551, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        a(C0906R.anim.r, 0);
        if (PatchProxy.isSupport(new Object[0], this, f32427a, false, 20553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32427a, false, 20553, new Class[0], Void.TYPE);
        } else {
            ArrayList<a> arrayList = new ArrayList<>(a.b());
            List asList = Arrays.asList(new String[]{"CN", "HK", "MO", "TW"});
            a[] aVarArr = new a[asList.size()];
            for (a aVar : arrayList) {
                int indexOf = asList.indexOf(aVar.f32262d);
                if (indexOf >= 0) {
                    a a2 = aVar.a(aVar.f32260b, aVar.f32261c, aVar.f32262d, aVar.f32263e);
                    a2.a("#");
                    aVarArr[indexOf] = a2;
                }
            }
            arrayList.addAll(0, Arrays.asList(aVarArr));
            this.f32430d.addAll(arrayList);
            this.f32429c.addAll(arrayList);
        }
        if (PatchProxy.isSupport(new Object[0], this, f32427a, false, 20552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32427a, false, 20552, new Class[0], Void.TYPE);
        } else {
            setContentView((int) C0906R.layout.av);
            this.f32428b = (RecyclerView) findViewById(C0906R.id.cif);
            this.f32428b.setLayoutManager(new LinearLayoutManager(this));
            final CountryAdapter countryAdapter = new CountryAdapter(this.f32429c, C0906R.layout.t9);
            this.f32428b.setAdapter(countryAdapter);
            countryAdapter.f32417b = new CountryAdapter.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32432a;

                public final void a(a aVar) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f32432a, false, 20558, new Class[]{a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f32432a, false, 20558, new Class[]{a.class}, Void.TYPE);
                        return;
                    }
                    if (aVar != null) {
                        GlobalListener.a(aVar);
                        CountryListActivity.this.onBackPressed();
                    }
                }
            };
            this.f32431e = (WaveSideBar) findViewById(C0906R.id.cre);
            this.f32431e.setOnSelectIndexItemListener(new WaveSideBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32434a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f32434a, false, 20559, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f32434a, false, 20559, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    for (int i = 0; i < CountryListActivity.this.f32429c.size(); i++) {
                        if (TextUtils.equals(CountryListActivity.this.f32429c.get(i).f32261c, str)) {
                            ((LinearLayoutManager) CountryListActivity.this.f32428b.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                            return;
                        }
                    }
                }
            });
            b.a((Activity) this, (View) this.etSearch);
            this.txtSearch.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32436a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32436a, false, 20560, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32436a, false, 20560, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    String obj = CountryListActivity.this.etSearch.getText().toString();
                    CountryListActivity.this.f32429c.clear();
                    Iterator<a> it2 = CountryListActivity.this.f32430d.iterator();
                    while (it2.hasNext()) {
                        a next = it2.next();
                        if (CountryListActivity.this.getString(next.f32260b).contains(obj)) {
                            CountryListActivity.this.f32429c.add(next);
                        }
                    }
                    countryAdapter.notifyDataSetChanged();
                }
            });
            this.back.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32439a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32439a, false, 20561, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32439a, false, 20561, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    CountryListActivity.this.onBackPressed();
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
