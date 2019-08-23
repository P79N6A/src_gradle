package com.ss.android.ugc.aweme.crossplatform.platform;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/BlockJumpMonitor;", "", "()V", "MONITOR_NAME", "", "TAG", "downloadApkBlocked", "", "url", "hasClickInTimeInterval", "", "jumpBlocked", "passed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40828a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f40829b = new a();

    private a() {
    }

    @JvmStatic
    public static final void a(@Nullable String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f40828a, true, 34316, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f40828a, true, 34316, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        n.a("h5_block_app_url", 0, new JSONObject().put("jump_url", str2).put("jump_has_click", z).put("jump_block_by", "blocked"));
    }

    @JvmStatic
    public static final void b(@Nullable String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f40828a, true, 34317, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f40828a, true, 34317, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        n.a("h5_block_app_url", 0, new JSONObject().put("jump_url", str2).put("jump_has_click", z).put("jump_block_by", "apk_download"));
    }

    @JvmStatic
    public static final void c(@Nullable String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f40828a, true, 34318, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f40828a, true, 34318, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        n.a("h5_block_app_url", 1, new JSONObject().put("jump_url", str2).put("jump_has_click", z));
    }
}
