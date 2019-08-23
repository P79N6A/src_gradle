package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.g;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.j.c.n;
import com.bytedance.android.livesdk.message.a;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdkapi.depend.d.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import io.reactivex.Observable;
import java.util.List;

@Keep
public interface IGiftService extends f {
    void clearAssets(String str);

    void clearGiftIconBitmapCache();

    void downloadAssets(String str, long j, g gVar, int i);

    b findGiftById(long j);

    AssetsModel getAssets(String str, long j);

    a getAssetsInterceptor(boolean z);

    h getAssetsManager();

    String getAssetsPath(String str, long j);

    b getFastGift();

    Dialog getGiftGuideDialog(Context context, Room room, i iVar, com.bytedance.android.live.gift.a.b bVar, long j, String str, long j2, String str2, DataCenter dataCenter);

    com.bytedance.android.live.gift.a.a getGiftGuidePresenter(DataCenter dataCenter);

    Bitmap getGiftIconBitmap(long j);

    a getGiftInterceptor(long j, boolean z);

    ab getGiftMessage(long j, com.bytedance.android.livesdk.gift.model.i iVar, User user);

    b getRedEnvelopeGift();

    n getSendGiftResultLog(com.bytedance.android.livesdk.gift.model.i iVar);

    List<b> getStickerGifts();

    Widget getVideoGiftWidget();

    com.bytedance.android.livesdkapi.depend.d.a.b giftPlayControllerManager();

    boolean isAssetsDownloaded(String str, long j);

    void onTurnTableUrlEmpty(String str);

    void openGiftDialog(String str, boolean z);

    void removeAnimationEngine(b bVar);

    Observable<d<com.bytedance.android.livesdk.gift.model.i>> sendGift(long j, long j2, long j3, int i);

    void setGiftAnimationEngine(b bVar, c cVar) throws Exception;

    void syncAssetsList(String str, int i);

    void syncGiftList(int i);

    void syncGiftList(d dVar, long j, int i, boolean z);
}
