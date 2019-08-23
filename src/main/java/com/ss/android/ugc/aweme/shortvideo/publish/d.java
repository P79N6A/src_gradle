package com.ss.android.ugc.aweme.shortvideo.publish;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\b8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/SilentShareEnhancement;", "", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "downloadItem", "Lcom/bytedance/ies/dmt/ui/widget/setting/SettingItemSwitch;", "downloadItemChecked", "", "getDownloadItemChecked", "()Z", "setDownloadItemChecked", "(Z)V", "enable", "getEnable", "createDownloadItem", "", "parent", "Landroid/widget/LinearLayout;", "disable", "toPixel", "", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68865a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f68866d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SettingItemSwitch f68867b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f68868c = f68866d.a();

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f68869e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/SilentShareEnhancement$Companion;", "", "()V", "enabled", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68870a;

        private a() {
        }

        @JvmStatic
        public final boolean a() {
            Boolean bool;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f68870a, false, 78225, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68870a, false, 78225, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!f.p()) {
                return false;
            } else {
                if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.TTPublishEnhancement) == 0) {
                    try {
                        com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                        Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                        bool = b2.bb();
                        Intrinsics.checkExpressionValueIsNotNull(bool, "SettingsReader.get().silentShareConfigurable");
                    } catch (com.bytedance.ies.a unused) {
                        bool = Boolean.valueOf(com.ss.android.g.a.a());
                    }
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                return z;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f68872b;

        b(d dVar) {
            this.f68872b = dVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68871a, false, 78226, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68871a, false, 78226, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f68872b.f68867b;
            if (settingItemSwitch != null) {
                settingItemSwitch.toggle();
            }
        }
    }

    @JvmStatic
    public static final boolean b() {
        return PatchProxy.isSupport(new Object[0], null, f68865a, true, 78224, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68865a, true, 78224, new Class[0], Boolean.TYPE)).booleanValue() : f68866d.a();
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f68865a, false, 78220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68865a, false, 78220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SettingItemSwitch settingItemSwitch = this.f68867b;
        if (settingItemSwitch != null) {
            z = settingItemSwitch.b();
        }
        return z;
    }

    public d(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f68869e = fragment;
    }

    private final int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(52.0f)}, this, f68865a, false, 78223, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(this.f68869e.getContext(), 52.0f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(52.0f)}, this, f68865a, false, 78223, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(@NotNull LinearLayout linearLayout) {
        if (PatchProxy.isSupport(new Object[]{linearLayout}, this, f68865a, false, 78221, new Class[]{LinearLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout}, this, f68865a, false, 78221, new Class[]{LinearLayout.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(linearLayout, "parent");
        if (this.f68868c) {
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(C0906R.layout.a3e, linearLayout, false);
            if (inflate != null) {
                this.f68867b = (SettingItemSwitch) inflate;
                SettingItemSwitch settingItemSwitch = this.f68867b;
                if (settingItemSwitch != null) {
                    settingItemSwitch.setChecked(true);
                }
                linearLayout.addView(this.f68867b, new LinearLayout.LayoutParams(-1, a(52.0f)));
                SettingItemSwitch settingItemSwitch2 = this.f68867b;
                if (settingItemSwitch2 != null) {
                    settingItemSwitch2.setOnClickListener(new b(this));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch");
        }
    }
}
