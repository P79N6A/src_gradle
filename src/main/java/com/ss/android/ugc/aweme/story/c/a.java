package com.ss.android.ugc.aweme.story.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.q;
import com.ss.android.ugc.aweme.sticker.c;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000f\u001a\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0015j\b\u0012\u0004\u0012\u00020\u000f`\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¨\u0006\u0019"}, d2 = {"bindPoiStickerData", "", "aweme", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "eventListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;", "adaptionStrategy", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "eventParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "getPoiStickerLocation", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "interactStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getTrackTimeStamps", "", "Lcom/ss/android/ugc/aweme/sticker/data/BaseTrackTimeStamp;", "struct", "muckFakeData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setTrackTimeStamps", "listData", "awemestory_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72129a;

    public static final void a(@NotNull b bVar, @NotNull DataCenter dataCenter, @Nullable com.ss.android.ugc.aweme.sticker.a.a aVar, @Nullable com.ss.android.ugc.aweme.sticker.a.b bVar2, @Nullable c cVar) {
        List<InteractStickerStruct> list;
        ArrayList arrayList;
        b bVar3 = bVar;
        DataCenter dataCenter2 = dataCenter;
        com.ss.android.ugc.aweme.sticker.a.a aVar2 = aVar;
        com.ss.android.ugc.aweme.sticker.a.b bVar4 = bVar2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{bVar3, dataCenter2, aVar2, bVar4, cVar2}, null, f72129a, true, 86500, new Class[]{b.class, DataCenter.class, com.ss.android.ugc.aweme.sticker.a.a.class, com.ss.android.ugc.aweme.sticker.a.b.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar3, dataCenter2, aVar2, bVar4, cVar2}, null, f72129a, true, 86500, new Class[]{b.class, DataCenter.class, com.ss.android.ugc.aweme.sticker.a.a.class, com.ss.android.ugc.aweme.sticker.a.b.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar3, "aweme");
        Intrinsics.checkParameterIsNotNull(dataCenter2, "dataCenter");
        if (((q) ServiceManager.get().getService(q.class)).a()) {
            List<InteractStickerStruct> list2 = null;
            dataCenter2.a("interact_sticker_clear_data", (Object) null);
            LifeStory lifeStory = bVar.getLifeStory();
            if (lifeStory != null) {
                list = lifeStory.getInteractStickerStructs();
            } else {
                list = null;
            }
            if (list == null) {
                arrayList = null;
            } else {
                LifeStory lifeStory2 = bVar.getLifeStory();
                if (lifeStory2 != null) {
                    list2 = lifeStory2.getInteractStickerStructs();
                }
                new ArrayList(list2);
            }
            d dVar = new d();
            dVar.a(aVar2).a(bVar4).a(cVar2);
            dataCenter2.a("interact_sticker_data", (Object) dVar);
            dataCenter2.a("interact_sticker_aweme_data", (Object) arrayList);
        }
    }
}
