package com.ss.android.ugc.aweme.feed.h;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class v extends a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45529a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45529a, false, 42076, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45529a, false, 42076, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45530a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f45530a, false, 42077, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f45530a, false, 42077, new Class[0], Object.class);
                    }
                    Aweme aweme = (Aweme) objArr[0];
                    if (PatchProxy.isSupport(new Object[]{aweme}, null, AwemeApi.f61302a, true, 67432, new Class[]{Aweme.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, AwemeApi.f61302a, true, 67432, new Class[]{Aweme.class}, String.class);
                    } else if (aweme == null) {
                        return "";
                    } else {
                        HashMap hashMap = new HashMap();
                        String aid = aweme.getAid();
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        if (aweme.isAd()) {
                            str = String.valueOf(aweme.getAwemeRawAd().getAdId());
                            str2 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
                            str3 = aweme.getAwemeRawAd().getLogExtra();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("ad_id", str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("creative_id", str2);
                        }
                        if (!TextUtils.isEmpty("")) {
                            hashMap.put("ad_category", "");
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("log_extra", str3);
                        }
                        if (!TextUtils.isEmpty("")) {
                            hashMap.put("dislike_source", "");
                        }
                        NetUtil.putCommonParams(hashMap, true);
                        AwemeApi.f61303b.disLikeAweme(aid, hashMap).execute();
                        return aid;
                    }
                }
            }, 0);
            return true;
        }
    }
}
