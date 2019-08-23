package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56348a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56348a, false, 60021, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f56348a, false, 60021, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56349a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f56349a, false, 60022, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f56349a, false, 60022, new Class[0], Object.class);
                    }
                    int intValue = ((Integer) objArr[0]).intValue();
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
                    String str3 = (String) objArr[3];
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), str, str2, str3}, null, MusicApi.f56294a, true, 59989, new Class[]{Integer.TYPE, String.class, String.class, String.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), str, str2, str3}, null, MusicApi.f56294a, true, 59989, new Class[]{Integer.TYPE, String.class, String.class, String.class}, String.class);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("upload_type", String.valueOf(intValue));
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("song_uri", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("source_url", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        hashMap.put(PushConstants.TITLE, str3);
                    }
                    NetUtil.putCommonParams(hashMap, true);
                    MusicApi.f56295b.uploadLocalMusicInfo(hashMap).execute();
                    return str3;
                }
            }, 0);
            return true;
        }
    }
}
