package com.ss.android.ugc.aweme.commerce.preview.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.a;
import com.ss.android.ugc.aweme.commerce.base.BaseBottomDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/dialog/FullReductionDialog;", "Lcom/ss/android/ugc/aweme/commerce/base/BaseBottomDialog;", "activity", "Landroid/app/Activity;", "url", "", "(Landroid/app/Activity;Ljava/lang/String;)V", "bindData", "", "info", "", "getDialogFixHeight", "", "getRootView", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FullReductionDialog extends BaseBottomDialog {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f37372d;

    @Nullable
    public final View a() {
        if (!PatchProxy.isSupport(new Object[0], this, f37372d, false, 28899, new Class[0], View.class)) {
            return (LinearLayout) findViewById(C0906R.id.ci1);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f37372d, false, 28899, new Class[0], View.class);
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f37372d, false, 28900, new Class[0], Integer.TYPE)) {
            return (int) (((float) UIUtils.getScreenHeight(getContext())) * 0.6666667f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37372d, false, 28900, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullReductionDialog(@NotNull final Activity activity, @Nullable final String str) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        setContentView((int) C0906R.layout.ir);
        b();
        ((DmtTextView) findViewById(C0906R.id.dca)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37373a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FullReductionDialog f37374b;

            {
                this.f37374b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f37373a, false, 28901, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f37373a, false, 28901, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (str != null) {
                    a.a(str, activity, "", false, false, 24);
                    this.f37374b.dismiss();
                }
            }
        });
    }
}
