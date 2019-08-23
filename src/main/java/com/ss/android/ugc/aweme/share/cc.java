package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.i;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/share/ShareConfigs;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class cc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64922a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f64923b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/share/ShareConfigs$Companion;", "", "()V", "disableIId", "", "disableUCode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64924a;

        private a() {
        }

        @JvmStatic
        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f64924a, false, 73292, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64924a, false, 73292, new Class[0], Boolean.TYPE)).booleanValue();
            }
            b b2 = b.b();
            i a2 = i.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AppContextInfoManager.inst()");
            return b2.c(a2.getContext(), "disable_iid_in_share_url");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JvmStatic
    public static final boolean a() {
        return PatchProxy.isSupport(new Object[0], null, f64922a, true, 73290, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f64922a, true, 73290, new Class[0], Boolean.TYPE)).booleanValue() : f64923b.a();
    }
}
