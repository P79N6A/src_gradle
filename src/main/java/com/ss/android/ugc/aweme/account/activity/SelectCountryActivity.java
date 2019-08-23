package com.ss.android.ugc.aweme.account.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.login.ui.CountryAdapter;
import com.ss.android.ugc.aweme.account.login.ui.WaveSideBar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/account/activity/SelectCountryActivity;", "Lcom/ss/android/ugc/aweme/account/activity/BaseAccountActivity;", "()V", "COUNTRY_CODE_KEY", "", "getCOUNTRY_CODE_KEY", "()Ljava/lang/String;", "countries", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/account/login/model/CountryCode;", "Lkotlin/collections/ArrayList;", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class SelectCountryActivity extends BaseAccountActivity {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f31644d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f31645e = "country_code";

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.account.login.model.a> f31646f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SelectCountryActivity f31648b;

        a(SelectCountryActivity selectCountryActivity) {
            this.f31648b = selectCountryActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31647a, false, 19590, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31647a, false, 19590, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f31648b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "countryCode", "Lcom/ss/android/ugc/aweme/account/login/model/CountryCode;", "kotlin.jvm.PlatformType", "onCountryItemClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements CountryAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SelectCountryActivity f31650b;

        b(SelectCountryActivity selectCountryActivity) {
            this.f31650b = selectCountryActivity;
        }

        public final void a(com.ss.android.ugc.aweme.account.login.model.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f31649a, false, 19591, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f31649a, false, 19591, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                GlobalListener.a(aVar);
                this.f31650b.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onSelectIndexItem"}, k = 3, mv = {1, 1, 13})
    static final class c implements WaveSideBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SelectCountryActivity f31652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView f31653c;

        c(SelectCountryActivity selectCountryActivity, RecyclerView recyclerView) {
            this.f31652b = selectCountryActivity;
            this.f31653c = recyclerView;
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f31651a, false, 19592, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f31651a, false, 19592, new Class[]{String.class}, Void.TYPE);
                return;
            }
            ArrayList<com.ss.android.ugc.aweme.account.login.model.a> arrayList = this.f31652b.f31646f;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countries");
            }
            int i = 0;
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) ((com.ss.android.ugc.aweme.account.login.model.a) next).f32261c, (Object) str)) {
                    RecyclerView recyclerView = this.f31653c;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                }
                i = i2;
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f31644d, false, 19588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31644d, false, 19588, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.SelectCountryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.SelectCountryActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31644d, false, 19589, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31644d, false, 19589, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.SelectCountryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f31644d, false, 19583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31644d, false, 19583, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f31644d, false, 19585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31644d, false, 19585, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f31644d, false, 19584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31644d, false, 19584, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.h5).statusBarDarkFont(true).init();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31644d, false, 19582, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31644d, false, 19582, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.SelectCountryActivity", "onCreate", true);
        super.onCreate(bundle);
        super.overridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.dr);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0906R.id.cc5);
        WaveSideBar waveSideBar = (WaveSideBar) findViewById(C0906R.id.crd);
        this.f31646f = new ArrayList<>(com.ss.android.ugc.aweme.account.login.model.a.g.a());
        ((ImageView) findViewById(C0906R.id.ix)).setImageResource(2130840470);
        findViewById(C0906R.id.ix).setOnClickListener(new a(this));
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<com.ss.android.ugc.aweme.account.login.model.a> arrayList = this.f31646f;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countries");
        }
        CountryAdapter countryAdapter = new CountryAdapter(arrayList, C0906R.layout.t_);
        countryAdapter.f32417b = new b(this);
        recyclerView.setAdapter(countryAdapter);
        waveSideBar.setOnSelectIndexItemListener(new c(this, recyclerView));
        String[] strArr = {"CN", "HK", "MO", "TW"};
        ArrayList arrayList2 = new ArrayList(4);
        ArrayList<com.ss.android.ugc.aweme.account.login.model.a> arrayList3 = this.f31646f;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countries");
        }
        for (com.ss.android.ugc.aweme.account.login.model.a aVar : arrayList3) {
            if (ArraysKt.contains((T[]) strArr, aVar.f32262d)) {
                com.ss.android.ugc.aweme.account.login.model.a a2 = aVar.a(aVar.f32260b, aVar.f32261c, aVar.f32262d, aVar.f32263e);
                a2.a("#");
                arrayList2.add(a2);
            }
        }
        ArrayList<com.ss.android.ugc.aweme.account.login.model.a> arrayList4 = this.f31646f;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countries");
        }
        arrayList4.addAll(0, arrayList2);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.SelectCountryActivity", "onCreate", false);
    }
}
