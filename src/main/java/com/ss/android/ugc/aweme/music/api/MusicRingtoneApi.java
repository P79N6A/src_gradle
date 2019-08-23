package com.ss.android.ugc.aweme.music.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.RingtoneStatus;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class MusicRingtoneApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56298a;

    /* renamed from: b  reason: collision with root package name */
    private static API f56299b = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/web/api/v2/ringtone/entry/")
        i<RingtoneStatus> fetchMusicRingtoneStatus(@Query(a = "music_id") String str, @Query(a = "mobile") String str2);
    }

    public static i<RingtoneStatus> a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, null, f56298a, true, 60000, new Class[]{String.class, String.class}, i.class)) {
            return f56299b.fetchMusicRingtoneStatus(str3, str4);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f56298a, true, 60000, new Class[]{String.class, String.class}, i.class);
    }
}
