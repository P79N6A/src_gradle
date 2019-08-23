package com.ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchMobParamUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42664a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchMobParamUtils$Companion;", "", "()V", "get", "Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "view", "Landroid/view/View;", "put", "", "param", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42665a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final s a(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f42665a, false, 36970, new Class[]{View.class}, s.class)) {
                return (s) PatchProxy.accessDispatch(new Object[]{view2}, this, f42665a, false, 36970, new Class[]{View.class}, s.class);
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            s sVar = (s) g.f42663a.a(view2);
            if (sVar == null) {
                return new s(true);
            }
            return sVar;
        }
    }
}
