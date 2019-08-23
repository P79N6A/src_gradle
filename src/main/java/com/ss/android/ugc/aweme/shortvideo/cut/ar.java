package com.ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoConfigManager;", "", "()V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66386a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoConfigManager$Companion;", "", "()V", "DEFAULT_FAST_IMPORT_RESOLUTION", "", "FAST_IMPORT_1080P_RESOLUTION", "enable1080pFastImport", "", "getFastImportEnableResolution", "isLegalResolution", "resolution", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66387a;

        private a() {
        }

        private boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f66387a, false, 75771, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66387a, false, 75771, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.Enable1080pFastImport) == 1) {
                return true;
            } else {
                return false;
            }
        }

        @NotNull
        public final String a() {
            if (PatchProxy.isSupport(new Object[0], this, f66387a, false, 75772, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f66387a, false, 75772, new Class[0], String.class);
            }
            String e2 = com.ss.android.ugc.aweme.port.in.a.M.e(a.C0682a.FastImportResolutionLimit);
            a aVar = this;
            Intrinsics.checkExpressionValueIsNotNull(e2, "resolution");
            if (!aVar.a(e2)) {
                e2 = "720*1280";
            }
            if (StringsKt.startsWith$default(e2, "1080*", false, 2, null) && !aVar.b()) {
                e2 = "720*1280";
            }
            return e2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private boolean a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f66387a, false, 75773, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f66387a, false, 75773, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "resolution");
            CharSequence charSequence = str2;
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
            return new Regex("[0-9]+\\*[0-9]*").matches(charSequence);
        }
    }
}
