package com.ss.android.ugc.aweme.commerce.preview.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.base.BaseBottomDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0016\u001a\u00020\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/dialog/ServiceIntroDialog;", "Lcom/ss/android/ugc/aweme/commerce/base/BaseBottomDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mDialogRootView", "Landroid/view/View;", "mServiceInfoLayout", "Landroid/view/ViewGroup;", "bindData", "", "serviceList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/GoodsServiceInfo;", "createItem", "serviceEntry", "dip2Px", "", "dpValue", "dip2Px$main_douyinCnRelease", "getDialogFixHeight", "getRootView", "initView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ServiceIntroDialog extends BaseBottomDialog {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f37377d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f37378e;

    /* renamed from: f  reason: collision with root package name */
    private View f37379f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ServiceIntroDialog f37381b;

        a(ServiceIntroDialog serviceIntroDialog) {
            this.f37381b = serviceIntroDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37380a, false, 28907, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37380a, false, 28907, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37381b.dismiss();
        }
    }

    @Nullable
    public final View a() {
        return this.f37379f;
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f37377d, false, 28903, new Class[0], Integer.TYPE)) {
            return (int) (((float) UIUtils.getScreenHeight(getContext())) * 0.6666667f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37377d, false, 28903, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceIntroDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f37377d, false, 28902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37377d, false, 28902, new Class[0], Void.TYPE);
            return;
        }
        setContentView((int) C0906R.layout.hj);
        this.f37379f = findViewById(C0906R.id.b8d);
        b();
        this.f37378e = (ViewGroup) findViewById(C0906R.id.b_j);
        View findViewById = findViewById(C0906R.id.d0i);
        if (findViewById != null) {
            findViewById.setOnClickListener(new a(this));
        }
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37377d, false, 28905, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(getContext(), (float) i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37377d, false, 28905, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
