package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/util/MobUtils;", "", "()V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71078a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f71079b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/util/MobUtils$Companion;", "", "()V", "getJarvisItemShowCid", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71080a;

        private a() {
        }

        @JvmStatic
        @NotNull
        public final String a() {
            if (PatchProxy.isSupport(new Object[0], this, f71080a, false, 80995, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f71080a, false, 80995, new Class[0], String.class);
            } else if (com.ss.android.g.a.b()) {
                return "94349537923";
            } else {
                if (com.ss.android.g.a.c()) {
                    return "94349537828";
                }
                return "94349537798";
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JvmStatic
    @NotNull
    public static final String a() {
        return PatchProxy.isSupport(new Object[0], null, f71078a, true, 80994, new Class[0], String.class) ? (String) PatchProxy.accessDispatch(new Object[0], null, f71078a, true, 80994, new Class[0], String.class) : f71079b.a();
    }
}
