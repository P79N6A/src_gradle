package com.ss.android.ugc.aweme.photomovie;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.fl;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58993a;

    /* access modifiers changed from: package-private */
    public final void a(PhotoMovieContext photoMovieContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2, synthetiseResult2, linkedHashMap2}, this, f58993a, false, 63956, new Class[]{PhotoMovieContext.class, SynthetiseResult.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext2, synthetiseResult2, linkedHashMap2}, this, f58993a, false, 63956, new Class[]{PhotoMovieContext.class, SynthetiseResult.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        linkedHashMap2.put("video_type", "6");
        if (photoMovieContext2.mMusic != null) {
            linkedHashMap2.put("music_id", String.valueOf(photoMovieContext2.mMusic.getId()));
        }
        if (!TextUtils.isEmpty(photoMovieContext2.creationId)) {
            linkedHashMap2.put("creation_id", photoMovieContext2.creationId);
        }
        linkedHashMap2.put("original", PushConstants.PUSH_TYPE_NOTIFY);
        if (photoMovieContext2.mPlayType == 0) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
        }
        linkedHashMap2.put("transition_type", str);
        if (!TextUtils.isEmpty(photoMovieContext2.shopDraftId)) {
            linkedHashMap2.put("shop_draft_id", photoMovieContext2.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoMovieContext2.mFilterName)) {
            linkedHashMap2.put("filter_name", photoMovieContext2.mFilterName);
        }
        if (photoMovieContext2.mFilterId > 0) {
            linkedHashMap2.put("filter_id", String.valueOf(photoMovieContext2.mFilterId));
        }
        linkedHashMap2.put("cover_tsp", photoMovieContext2.mCoverStartTm);
        new fl().a(photoMovieContext2, synthetiseResult2, linkedHashMap2);
        HashMap<String, String> a2 = a.t.a((Object) photoMovieContext2);
        if (a2 != null && !a2.isEmpty()) {
            linkedHashMap2.putAll(a2);
        }
    }
}
