package com.ss.android.ugc.aweme.commerce.live;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/ContextWrapperUtils;", "", "()V", "contextToActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36961a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36962b = new a();

    private a() {
    }

    @Nullable
    public final Activity a(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f36961a, false, 28229, new Class[]{Context.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{context2}, this, f36961a, false, 28229, new Class[]{Context.class}, Activity.class);
        } else if (context2 == null) {
            return null;
        } else {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            if (context2 instanceof ContextWrapper) {
                return f36962b.a(((ContextWrapper) context2).getBaseContext());
            }
            return null;
        }
    }
}
