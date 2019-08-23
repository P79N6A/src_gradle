package com.ss.android.ugc.aweme.tools.debug;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "ameSchema", "", "challengeId", "dSchema", "enterFrom", "hint", "localSchema", "mSchema", "musicId", "routeUrl", "getRouteUrl", "()Ljava/lang/String;", "schema", "sdkSchema", "getSdkSchema", "stickerId", "tSchema", "type", "typeOpenRecord", "typeStudio", "addListener", "", "createRecordUrl", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateText", "SimpleTextWatcher", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVSchemaTestActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74667a;

    /* renamed from: b  reason: collision with root package name */
    public final String f74668b = "openRecord";

    /* renamed from: c  reason: collision with root package name */
    public final String f74669c = "studio/create";

    /* renamed from: d  reason: collision with root package name */
    public final String f74670d = com.ss.android.ugc.aweme.app.e.f34152b;

    /* renamed from: e  reason: collision with root package name */
    public final String f74671e = "aweme";

    /* renamed from: f  reason: collision with root package name */
    public String f74672f = a();
    public String g = this.f74669c;
    public String h = "";
    public String i = "";
    public String j = "";
    private final String k = "准备打开的链接是:";
    private final String l = "snssdk1128";
    private final String m = "snssdk1233";
    private final String n = "snssdk1180";
    private String o = "";
    private HashMap p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$SimpleTextWatcher;", "Landroid/text/TextWatcher;", "()V", "beforeTextChanged", "", "s", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static abstract class a implements TextWatcher {
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$addListener$1", "Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74674b;

        b(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74674b = aVSchemaTestActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f74673a, false, 87020, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f74673a, false, 87020, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f74674b.i = editable.toString();
                    EditText editText = (EditText) this.f74674b.a(C0906R.id.aa0);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f74674b.a(C0906R.id.aa1);
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f74674b.c();
                }
            }
            EditText editText3 = (EditText) this.f74674b.a(C0906R.id.aa0);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f74674b.a(C0906R.id.aa1);
            Intrinsics.checkExpressionValueIsNotNull(editText4, "etSticker");
            editText4.setEnabled(true);
            this.f74674b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$addListener$2", "Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74676b;

        c(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74676b = aVSchemaTestActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f74675a, false, 87021, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f74675a, false, 87021, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f74676b.h = editable.toString();
                    EditText editText = (EditText) this.f74676b.a(C0906R.id.aa0);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f74676b.a(C0906R.id.a_x);
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "etChallenge");
                    editText2.setEnabled(false);
                    this.f74676b.c();
                }
            }
            EditText editText3 = (EditText) this.f74676b.a(C0906R.id.aa0);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f74676b.a(C0906R.id.a_x);
            Intrinsics.checkExpressionValueIsNotNull(editText4, "etChallenge");
            editText4.setEnabled(true);
            this.f74676b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$addListener$3", "Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74678b;

        d(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74678b = aVSchemaTestActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f74677a, false, 87022, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f74677a, false, 87022, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f74678b.j = editable.toString();
                    EditText editText = (EditText) this.f74678b.a(C0906R.id.a_x);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "etChallenge");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f74678b.a(C0906R.id.aa1);
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f74678b.c();
                }
            }
            EditText editText3 = (EditText) this.f74678b.a(C0906R.id.a_x);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "etChallenge");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f74678b.a(C0906R.id.aa1);
            Intrinsics.checkExpressionValueIsNotNull(editText4, "etSticker");
            editText4.setEnabled(true);
            this.f74678b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$addListener$4", "Lcom/ss/android/ugc/aweme/tools/debug/AVSchemaTestActivity$SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74680b;

        e(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74680b = aVSchemaTestActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f74679a, false, 87023, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f74679a, false, 87023, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            this.f74680b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 15})
    static final class f implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74682b;

        f(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74682b = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{radioGroup, Integer.valueOf(i)}, this, f74681a, false, 87024, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{radioGroup, Integer.valueOf(i)}, this, f74681a, false, 87024, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == C0906R.id.c_x) {
                this.f74682b.f74672f = this.f74682b.a();
            } else if (i == C0906R.id.c_w) {
                this.f74682b.f74672f = this.f74682b.f74670d;
            } else if (i == C0906R.id.c_v) {
                this.f74682b.f74672f = this.f74682b.f74671e;
            }
            this.f74682b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 15})
    static final class g implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74684b;

        g(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74684b = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{radioGroup, Integer.valueOf(i)}, this, f74683a, false, 87025, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{radioGroup, Integer.valueOf(i)}, this, f74683a, false, 87025, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == C0906R.id.c_z) {
                this.f74684b.g = this.f74684b.f74669c;
            } else if (i == C0906R.id.c_y) {
                this.f74684b.g = this.f74684b.f74668b;
            }
            this.f74684b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74686b;

        h(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74686b = aVSchemaTestActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f74685a, false, 87026, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f74685a, false, 87026, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String b2 = this.f74686b.b();
            if (StringsKt.startsWith$default(b2, this.f74686b.f74671e, false, 2, null)) {
                com.ss.android.ugc.aweme.ag.h.a().a(b2);
                return;
            }
            Intent intent = new Intent();
            intent.setData(Uri.parse(b2));
            this.f74686b.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 15})
    static final class i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVSchemaTestActivity f74688b;

        i(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f74688b = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74687a, false, 87027, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f74687a, false, 87027, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f74688b.c();
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74667a, false, 87016, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74667a, false, 87016, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.p == null) {
            this.p = new HashMap();
        }
        View view = (View) this.p.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.p.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87018, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74667a, false, 87019, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74667a, false, 87019, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87010, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87010, new Class[0], String.class);
        } else if (com.ss.android.g.a.b()) {
            return this.m;
        } else {
            if (com.ss.android.g.a.c()) {
                return this.n;
            }
            return this.l;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87014, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = (TextView) a(C0906R.id.d8p);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvUrl");
        textView.setText(this.k + b());
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87011, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87011, new Class[0], String.class);
        }
        CheckBox checkBox = (CheckBox) a(C0906R.id.qz);
        Intrinsics.checkExpressionValueIsNotNull(checkBox, "cbUrl");
        if (checkBox.isChecked()) {
            EditText editText = (EditText) a(C0906R.id.aa2);
            Intrinsics.checkExpressionValueIsNotNull(editText, "etUrl");
            return editText.getText().toString();
        }
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87015, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87015, new Class[0], String.class);
        }
        String str = this.f74672f + "://";
        String str2 = this.g;
        if (Intrinsics.areEqual((Object) str2, (Object) this.f74669c)) {
            if (!TextUtils.isEmpty(this.h)) {
                str = str + this.g + "?type=use_sticker&sticker_id=" + this.h;
                if (!TextUtils.isEmpty(this.o)) {
                    str = str + "&enter_from=" + this.o;
                }
            }
        } else if (Intrinsics.areEqual((Object) str2, (Object) this.f74668b)) {
            str = str + this.g + "?recordOrigin=system&";
            if (!TextUtils.isEmpty(this.h)) {
                str = str + "recordParam=sticker&id=" + this.h;
            } else if (!TextUtils.isEmpty(this.i)) {
                str = str + "recordParam=challenge&id=" + this.i;
            } else if (!TextUtils.isEmpty(this.j)) {
                str = str + "recordParam=music&id=" + this.j;
            }
        }
        return str;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f74667a, false, 87012, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f74667a, false, 87012, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ac);
        if (PatchProxy.isSupport(new Object[0], this, f74667a, false, 87013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74667a, false, 87013, new Class[0], Void.TYPE);
        } else {
            ((EditText) a(C0906R.id.a_x)).addTextChangedListener(new b(this));
            ((EditText) a(C0906R.id.aa1)).addTextChangedListener(new c(this));
            ((EditText) a(C0906R.id.aa0)).addTextChangedListener(new d(this));
            ((EditText) a(C0906R.id.a_y)).addTextChangedListener(new e(this));
            ((RadioGroup) a(C0906R.id.ce5)).setOnCheckedChangeListener(new f(this));
            ((RadioGroup) a(C0906R.id.ce6)).setOnCheckedChangeListener(new g(this));
            ((TextView) a(C0906R.id.d8j)).setOnClickListener(new h(this));
            ((CheckBox) a(C0906R.id.qz)).setOnCheckedChangeListener(new i(this));
        }
        ((EditText) a(C0906R.id.aa1)).setText("89604");
        RadioButton radioButton = (RadioButton) a(C0906R.id.c_w);
        Intrinsics.checkExpressionValueIsNotNull(radioButton, "rbLocal");
        radioButton.setChecked(true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", false);
    }
}
