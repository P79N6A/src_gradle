package com.ss.android.ugc.aweme.im.sdk.group.b;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J&\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/utils/IMErrorUtils;", "", "()V", "showDefaultNetError", "", "context", "Landroid/content/Context;", "showErrorOperation", "conversationId", "", "defaultAction", "Ljava/lang/Runnable;", "showIMErrorCheckMsg", "error", "Lcom/bytedance/im/core/model/IMError;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51579a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f51580b = new b();

    private b() {
    }

    @JvmStatic
    private static void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f51579a, true, 52249, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f51579a, true, 52249, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        a.b(context2, (int) C0906R.string.ave).a();
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable j jVar) {
        boolean z;
        Context context2 = context;
        j jVar2 = jVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{context2, jVar2}, null, f51579a, true, 52247, new Class[]{Context.class, j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, jVar2}, null, f51579a, true, 52247, new Class[]{Context.class, j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (jVar2 != null) {
            CharSequence charSequence = jVar2.f21287e;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                com.ss.android.ugc.aweme.im.sdk.group.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.group.a.b) l.a(jVar2.f21287e, com.ss.android.ugc.aweme.im.sdk.group.a.b.class);
                if (bVar != null) {
                    CharSequence statusMsg = bVar.getStatusMsg();
                    if (statusMsg == null || statusMsg.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        a.b(context2, bVar.getStatusMsg()).a();
                        return;
                    }
                }
                a(context);
                return;
            }
        }
        a(context);
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable String str, @Nullable Runnable runnable) {
        Context context2 = context;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str2, runnable}, null, f51579a, true, 52248, new Class[]{Context.class, String.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, runnable}, null, f51579a, true, 52248, new Class[]{Context.class, String.class, Runnable.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            com.bytedance.im.core.d.b a2 = new e(str2).a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ConversationModel(conversationId).conversation");
            if (a2.isMember() && !a.a(str)) {
                runnable.run();
                return;
            }
        }
        a.b(context2, (int) C0906R.string.aw2).a();
    }
}
