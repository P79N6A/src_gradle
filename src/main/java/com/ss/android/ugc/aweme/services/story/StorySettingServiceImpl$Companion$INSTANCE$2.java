package com.ss.android.ugc.aweme.services.story;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
final class StorySettingServiceImpl$Companion$INSTANCE$2 extends Lambda implements Function0<StorySettingServiceImpl> {
    public static final StorySettingServiceImpl$Companion$INSTANCE$2 INSTANCE = new StorySettingServiceImpl$Companion$INSTANCE$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    StorySettingServiceImpl$Companion$INSTANCE$2() {
        super(0);
    }

    @NotNull
    public final StorySettingServiceImpl invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71597, new Class[0], StorySettingServiceImpl.class)) {
            return new StorySettingServiceImpl(null);
        }
        return (StorySettingServiceImpl) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71597, new Class[0], StorySettingServiceImpl.class);
    }
}
