package com.tt.appbrandimpl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import java.util.List;
import org.json.JSONObject;

public class RequestGameVideoHandler implements IAsyncHostDataHandler {
    public static final String TAG = "RequestGameVideoHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String currentHashTagName;
    private String currentMicroAppId;
    private MicroGameVideoModel gameVideoModel;
    private b gameVideoPresenter;

    @NonNull
    public String getType() {
        return "request_game_video";
    }

    public void action(@Nullable CrossProcessDataEntity crossProcessDataEntity, @NonNull AsyncIpcHandler asyncIpcHandler) {
        long j;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity, asyncIpcHandler}, this, changeQuickRedirect, false, 91907, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity, asyncIpcHandler}, this, changeQuickRedirect, false, 91907, new Class[]{CrossProcessDataEntity.class, AsyncIpcHandler.class}, Void.TYPE);
        } else if (crossProcessDataEntity != null) {
            JSONObject dataJSONObject = crossProcessDataEntity.getDataJSONObject();
            String optString = dataJSONObject.optString("type");
            String optString2 = dataJSONObject.optString("micro_app_id");
            String optString3 = dataJSONObject.optString("hashTagName");
            int optInt = dataJSONObject.optInt("cursor");
            if (TextUtils.equals("fetch_video", optString)) {
                if (!TextUtils.equals(this.currentMicroAppId, optString2)) {
                    this.gameVideoModel = null;
                    this.gameVideoPresenter = null;
                    this.currentMicroAppId = optString2;
                }
                if (!TextUtils.equals(this.currentHashTagName, optString3)) {
                    this.gameVideoModel = null;
                    this.gameVideoPresenter = null;
                    this.currentHashTagName = optString3;
                }
                if (this.gameVideoModel == null) {
                    this.gameVideoModel = new MicroGameVideoModel();
                }
                if (this.gameVideoPresenter == null) {
                    this.gameVideoPresenter = new b();
                }
                this.gameVideoPresenter.a(this.gameVideoModel);
                FeedItemList feedItemList = (FeedItemList) this.gameVideoModel.getData();
                if (feedItemList != null) {
                    j = feedItemList.cursor;
                } else {
                    j = 0;
                }
                if (this.gameVideoModel.isHasMore() || j == 0) {
                    this.gameVideoPresenter.a(4, optString2, optString3, Long.valueOf(j), 10);
                }
                return;
            }
            if (TextUtils.equals("open_video", optString)) {
                List items = this.gameVideoModel.getItems();
                if (optInt >= 0 && optInt < items.size() && !CollectionUtils.isEmpty(items)) {
                    asyncIpcHandler.callback(new CrossProcessDataEntity(((Aweme) items.get(optInt)).getAid()), true);
                    a.a().f44610c = this.gameVideoModel;
                }
            }
        }
    }
}
