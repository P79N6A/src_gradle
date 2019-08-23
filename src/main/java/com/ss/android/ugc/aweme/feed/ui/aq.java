package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.views.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/MTLocationPopupDialog;", "Lcom/ss/android/ugc/aweme/views/ResizableDialog;", "Lcom/ss/android/ugc/aweme/utils/permission/AwemePermissionUtils$OnPermissionListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mActivity", "allowRequestPermission", "", "customerWidthAndHeight", "initView", "notAllowRequestPermission", "onBackPressed", "onPermissionDenied", "onPermissionGranted", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aq extends o implements a.C0792a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46507a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f46508b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aq f46510b;

        a(aq aqVar) {
            this.f46510b = aqVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46509a, false, 42892, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46509a, false, 42892, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f46510b.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aq f46512b;

        b(aq aqVar) {
            this.f46512b = aqVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46511a, false, 42893, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46511a, false, 42893, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            aq aqVar = this.f46512b;
            if (PatchProxy.isSupport(new Object[0], aqVar, aq.f46507a, false, 42889, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aqVar, aq.f46507a, false, 42889, new Class[0], Void.TYPE);
                return;
            }
            aqVar.dismiss();
            r.a("location_permission_result", (Map) d.a().a("is_allow", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).requestLocationPermissions(aqVar.f46508b, aqVar);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42891, new Class[0], Void.TYPE);
            return;
        }
        r.a("system_location_permission_result", (Map) d.a().a("is_allow", PushConstants.PUSH_TYPE_NOTIFY).f34114b);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42885, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        this.g = -2;
        this.h = -2;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42888, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
        r.a("location_permission_result", (Map) d.a().a("is_allow", PushConstants.PUSH_TYPE_NOTIFY).f34114b);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42887, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42890, new Class[0], Void.TYPE);
            return;
        }
        r.a("system_location_permission_result", (Map) d.a().a("is_allow", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryRefreshLocation(this.f46508b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(@NotNull Activity activity) {
        super(activity, 0, 0);
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f46508b = activity;
        setContentView(C0906R.layout.jq);
        if (PatchProxy.isSupport(new Object[0], this, f46507a, false, 42886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46507a, false, 42886, new Class[0], Void.TYPE);
            return;
        }
        setCanceledOnTouchOutside(false);
        ((DmtTextView) findViewById(C0906R.id.dkk)).setFontType(c.g);
        ((DmtTextView) findViewById(C0906R.id.d93)).setFontType(c.g);
        ((DmtTextView) findViewById(C0906R.id.d9v)).setOnClickListener(new a(this));
        ((DmtTextView) findViewById(C0906R.id.d93)).setOnClickListener(new b(this));
    }
}
