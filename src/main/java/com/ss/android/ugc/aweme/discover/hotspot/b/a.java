package com.ss.android.ugc.aweme.discover.hotspot.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/detail/IHotSpotCons;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42442a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0541a f42443b = new C0541a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/detail/IHotSpotCons$Companion;", "", "()V", "DEFAULT_GUIDE_TIME", "", "DURATION", "", "HOT_SPOT_TRANS", "", "shouldAdaptingBottom", "", "shouldWidgetTrans", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.b.a$a  reason: collision with other inner class name */
    public static final class C0541a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42444a;

        private C0541a() {
        }

        @JvmStatic
        public final boolean a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f42444a, false, 36583, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42444a, false, 36583, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!b()) {
                z = true;
            }
            return z;
        }

        @JvmStatic
        public final boolean b() {
            if (!PatchProxy.isSupport(new Object[0], this, f42444a, false, 36584, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.profile.a.a().l;
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42444a, false, 36584, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public /* synthetic */ C0541a(byte b2) {
            this();
        }
    }
}
