package com.ss.android.ugc.aweme.feed.h;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45475a;

    public boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 5 && objArr.length != 6)) {
            return false;
        }
        return true;
    }

    public boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45475a, false, 42015, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45475a, false, 42015, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45476a;

                public final Object call() throws Exception {
                    int i;
                    if (PatchProxy.isSupport(new Object[0], this, f45476a, false, 42016, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f45476a, false, 42016, new Class[0], Object.class);
                    }
                    if (objArr.length == 5) {
                        i = -1;
                    } else {
                        i = ((Integer) objArr[5]).intValue();
                    }
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    int intValue2 = ((Integer) objArr[2]).intValue();
                    int intValue3 = ((Integer) objArr[3]).intValue();
                    int intValue4 = ((Integer) objArr[4]).intValue();
                    if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), Integer.valueOf(i)}, null, AwemeStatsApi.f45048a, true, 40873, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), Integer.valueOf(i)}, null, AwemeStatsApi.f45048a, true, 40873, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("item_id", str);
                        }
                        if (i >= 0) {
                            hashMap.put("tab_type", String.valueOf(i));
                        }
                        if (intValue > 0) {
                            hashMap.put("share_delta", String.valueOf(intValue));
                        }
                        if (intValue2 > 0) {
                            hashMap.put("play_delta", String.valueOf(intValue2));
                        }
                        if (intValue3 > 0) {
                            hashMap.put("download_delta", String.valueOf(intValue3));
                        }
                        if (intValue4 >= 0) {
                            hashMap.put("aweme_type", String.valueOf(intValue4));
                        }
                        NetUtil.putCommonParams(hashMap, true);
                        AwemeStatsApi.f45049b.awemeStatsReport(hashMap).execute();
                    }
                    return null;
                }
            }, 0);
            return true;
        }
    }
}
