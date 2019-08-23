package com.ss.android.ugc.aweme.requesttask.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.message.c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/normal/FetchNoticeCountRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "()V", "request", "", "context", "Landroid/content/Context;", "coldBoot", "", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63594a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f63595b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static boolean f63596c = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/normal/FetchNoticeCountRequest$Companion;", "", "()V", "isColdStart", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final e a() {
        return e.NORMAL;
    }

    public final void a(@NotNull Context context, boolean z) {
        Context context2 = context;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63594a, false, 70829, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f63594a, false, 70829, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        c a2 = c.a();
        if (!f63596c) {
            i = 5;
        }
        a2.a(false, i);
        f63596c = false;
    }
}
