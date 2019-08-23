package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.imported.AutoRTLTextView;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.setting.l;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/AdvanceSettingActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "commentItemChecked", "", "mobData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "reactDuetItemChecked", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdvanceSettingActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68851a;

    /* renamed from: b  reason: collision with root package name */
    public cb f68852b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68853c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68854d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, String> f68855e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f68856f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdvanceSettingActivity f68858b;

        a(AdvanceSettingActivity advanceSettingActivity) {
            this.f68858b = advanceSettingActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68857a, false, 78216, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68857a, false, 78216, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f68858b.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view1", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdvanceSettingActivity f68860b;

        b(AdvanceSettingActivity advanceSettingActivity) {
            this.f68860b = advanceSettingActivity;
        }

        public final void OnSettingItemClick(View view) {
            int i;
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f68859a, false, 78217, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68859a, false, 78217, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactDuetSettingChanged, true);
            e eVar = com.ss.android.ugc.aweme.port.in.a.L;
            e.a aVar = e.a.ReactDuetSettingCurrent;
            SettingItemSwitch settingItemSwitch = (SettingItemSwitch) this.f68860b.a(C0906R.id.cac);
            Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch, "react_duet_setting_item");
            if (settingItemSwitch.isChecked()) {
                i = l.g;
            } else {
                i = l.f63987f;
            }
            eVar.a(aVar, i);
            ((SettingItemSwitch) this.f68860b.a(C0906R.id.cac)).toggle();
            d a2 = d.a();
            cb cbVar = this.f68860b.f68852b;
            if (cbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("model");
            }
            d a3 = a2.a("creation_id", cbVar.creationId).a("enter_from", "video_post_page");
            SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) this.f68860b.a(C0906R.id.cac);
            Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch2, "react_duet_setting_item");
            if (settingItemSwitch2.isChecked()) {
                str = "off";
            } else {
                str = "on";
            }
            r.a("click_react_duet_control", (Map) a3.a("to_status", str).f34114b);
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68851a, false, 78212, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68851a, false, 78212, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f68856f == null) {
            this.f68856f = new HashMap();
        }
        View view = (View) this.f68856f.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f68856f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f68851a, false, 78214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68851a, false, 78214, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68851a, false, 78215, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68851a, false, 78215, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f68851a, false, 78211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68851a, false, 78211, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) a(C0906R.id.vm);
        Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch, "comment_setting_item");
        bundle.putBoolean("comment_item_checked", settingItemSwitch.b());
        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) a(C0906R.id.cac);
        Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch2, "react_duet_setting_item");
        bundle.putBoolean("react_duet_item_checked", settingItemSwitch2.b());
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.onBackPressed();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68851a, false, 78210, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68851a, false, 78210, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("model");
        if (serializableExtra != null) {
            this.f68852b = (cb) serializableExtra;
            this.f68853c = getIntent().getBooleanExtra("comment_item_checked", false);
            this.f68854d = getIntent().getBooleanExtra("react_duet_item_checked", false);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("mob_data");
            if (serializableExtra2 != null) {
                this.f68855e = (HashMap) serializableExtra2;
                setContentView((int) C0906R.layout.a8);
                ((AutoRTLTextView) a(C0906R.id.iu)).setOnClickListener(new a(this));
                af afVar = com.ss.android.ugc.aweme.port.in.a.t;
                SettingItemSwitch settingItemSwitch = (SettingItemSwitch) a(C0906R.id.vm);
                boolean z = this.f68853c;
                HashMap<String, String> hashMap = this.f68855e;
                if (hashMap == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mobData");
                }
                afVar.a(settingItemSwitch, z, hashMap);
                if (l.a()) {
                    cb cbVar = this.f68852b;
                    if (cbVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("model");
                    }
                    if (l.a(cbVar)) {
                        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) a(C0906R.id.cac);
                        Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch2, "react_duet_setting_item");
                        settingItemSwitch2.setVisibility(0);
                        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) a(C0906R.id.cac);
                        Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch3, "react_duet_setting_item");
                        settingItemSwitch3.setChecked(this.f68854d);
                        ((SettingItemSwitch) a(C0906R.id.cac)).setOnSettingItemClickListener(new b(this));
                        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onCreate", false);
                        return;
                    }
                }
                SettingItemSwitch settingItemSwitch4 = (SettingItemSwitch) a(C0906R.id.cac);
                Intrinsics.checkExpressionValueIsNotNull(settingItemSwitch4, "react_duet_setting_item");
                settingItemSwitch4.setVisibility(8);
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.AdvanceSettingActivity", "onCreate", false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
    }
}
