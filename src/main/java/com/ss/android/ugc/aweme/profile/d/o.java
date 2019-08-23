package com.ss.android.ugc.aweme.profile.d;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.q.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/util/ProfileAuthorizeUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61460a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f61461b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/util/ProfileAuthorizeUtils$Companion;", "", "()V", "AUTHORIZATION_SP_FILE", "", "YOUTUBE_REQUEST_OFFLINE_AUTH_KEY", "getSp", "Landroid/content/SharedPreferences;", "isYoutubeRequestOfflineAuth", "", "setYoutubeRequestOfflineAuth", "", "value", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61462a;

        private a() {
        }

        @JvmStatic
        private SharedPreferences a() {
            if (PatchProxy.isSupport(new Object[0], this, f61462a, false, 69979, new Class[0], SharedPreferences.class)) {
                return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f61462a, false, 69979, new Class[0], SharedPreferences.class);
            }
            SharedPreferences a2 = c.a(GlobalContext.getContext(), "authorization_sp_file", 0);
            Intrinsics.checkExpressionValueIsNotNull(a2, "GlobalContext.getContext…LE, Context.MODE_PRIVATE)");
            return a2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61462a, false, 69977, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61462a, false, 69977, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            a().edit().putBoolean("enalbe_youtube_request_server_auth_code", z).commit();
        }
    }

    @JvmStatic
    public static final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f61460a, true, 69974, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f61460a, true, 69974, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f61461b.a(z);
    }
}
