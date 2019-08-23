package com.ss.android.ugc.aweme.services.sticker;

import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.LockStickerTextBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J2\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019H&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0018\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019H&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/services/sticker/IUnLockStickerManagerService;", "", "addUnlockedStickerId", "", "id", "", "clearUnlockedStickerIds", "getDefaultTextBean", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/LockStickerTextBean;", "getShareString", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getTextBeanForActivity", "getUnlockedStickerIds", "Ljava/util/ArrayList;", "getUpdateState", "", "resolve2UnlockSticker", "onUnlockSucceed", "Lkotlin/Function1;", "", "onUnlockFailed", "Lkotlin/Function0;", "updateLockStickerTextBeans", "list", "", "updateUnlockedIdsFromNet", "listener", "Lcom/ss/android/ugc/aweme/common/INotifyListener;", "updateUnlockedStickerIdList", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IUnLockStickerManagerService {
    void addUnlockedStickerId(@Nullable String str);

    void clearUnlockedStickerIds();

    @NotNull
    LockStickerTextBean getDefaultTextBean();

    @Nullable
    LockStickerTextBean getShareString(@Nullable Effect effect);

    @Nullable
    LockStickerTextBean getTextBeanForActivity(@NotNull Effect effect);

    @NotNull
    ArrayList<String> getUnlockedStickerIds();

    boolean getUpdateState();

    void resolve2UnlockSticker(@NotNull Effect effect, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function0<Unit> function0);

    void updateLockStickerTextBeans(@Nullable List<? extends LockStickerTextBean> list);

    void updateUnlockedIdsFromNet(@Nullable p pVar);

    void updateUnlockedStickerIdList(@Nullable List<String> list);
}
