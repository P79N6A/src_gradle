package com.ss.android.ugc.aweme.commerce.sdk.a;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mResultFragment", "Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResultFragment;", "findAvoidOnActivityResultFragment", "getAvoidOnActivityResultFragment", "startForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "callback", "Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult$Callback;", "Callback", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37688a;

    /* renamed from: c  reason: collision with root package name */
    public static final b f37689c = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public b f37690b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult$Callback;", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$a  reason: collision with other inner class name */
    public interface C0486a {
        void a(int i, int i2, @Nullable Intent intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult$Companion;", "", "()V", "TAG", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public a(@NotNull Activity activity) {
        b bVar;
        b bVar2;
        Activity activity2 = activity;
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f37688a, false, 29254, new Class[]{Activity.class}, b.class)) {
            bVar2 = (b) PatchProxy.accessDispatch(new Object[]{activity2}, this, f37688a, false, 29254, new Class[]{Activity.class}, b.class);
        } else {
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f37688a, false, 29255, new Class[]{Activity.class}, b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[]{activity2}, this, f37688a, false, 29255, new Class[]{Activity.class}, b.class);
            } else {
                bVar = (b) activity.getFragmentManager().findFragmentByTag("AvoidOnActivityResult");
            }
            if (bVar == null) {
                bVar = new b();
                activity.getFragmentManager().beginTransaction().add(bVar, "AvoidOnActivityResult").commitAllowingStateLoss();
                activity.getFragmentManager().executePendingTransactions();
            }
            bVar2 = bVar;
        }
        this.f37690b = bVar2;
    }
}
