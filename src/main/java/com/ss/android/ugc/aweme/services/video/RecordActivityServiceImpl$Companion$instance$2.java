package com.ss.android.ugc.aweme.services.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
final class RecordActivityServiceImpl$Companion$instance$2 extends Lambda implements Function0<RecordActivityServiceImpl> {
    public static final RecordActivityServiceImpl$Companion$instance$2 INSTANCE = new RecordActivityServiceImpl$Companion$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    RecordActivityServiceImpl$Companion$instance$2() {
        super(0);
    }

    @NotNull
    public final RecordActivityServiceImpl invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71620, new Class[0], RecordActivityServiceImpl.class)) {
            return new RecordActivityServiceImpl(null);
        }
        return (RecordActivityServiceImpl) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71620, new Class[0], RecordActivityServiceImpl.class);
    }
}
