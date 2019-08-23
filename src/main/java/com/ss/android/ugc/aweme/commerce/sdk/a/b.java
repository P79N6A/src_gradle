package com.ss.android.ugc.aweme.commerce.sdk.a;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.sdk.a.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResultFragment;", "Landroid/app/Fragment;", "()V", "mCallbacks", "", "", "Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult$Callback;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "startForResult", "intent", "callback", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37691a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, a.C0486a> f37692b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private HashMap f37693c;

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f37691a, false, 29259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37691a, false, 29259, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f37692b.clear();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37691a, false, 29261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37691a, false, 29261, new Class[0], Void.TYPE);
            return;
        }
        if (this.f37693c != null) {
            this.f37693c.clear();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37691a, false, 29256, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37691a, false, 29256, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f37691a, false, 29258, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f37691a, false, 29258, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        a.C0486a remove = this.f37692b.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.a(i, i2, intent2);
        }
    }
}
