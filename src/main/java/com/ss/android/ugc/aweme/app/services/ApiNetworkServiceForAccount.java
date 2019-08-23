package com.ss.android.ugc.aweme.app.services;

import android.text.TextUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Url;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.e;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class ApiNetworkServiceForAccount implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34225a;

    /* renamed from: b  reason: collision with root package name */
    private AccountApi f34226b = ((AccountApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(AccountApi.class));

    public interface AccountApi {
        @GET
        Call<String> doGet(@Url String str);

        @FormUrlEncoded
        @POST
        Call<String> doPost(@Url String str, @FieldMap Map<String, String> map);

        @FormUrlEncoded
        @POST
        q<UserResponse> postUserResponse(@Url String str, @FieldMap Map<String, String> map);
    }

    public final void b(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34225a, false, 23590, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34225a, false, 23590, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a.b((String) this.f34226b.doGet(str2).execute().body(), str2);
    }

    public final User a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34225a, false, 23589, new Class[]{String.class}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{str2}, this, f34225a, false, 23589, new Class[]{String.class}, User.class);
        }
        String str3 = (String) this.f34226b.doGet(str2).execute().body();
        JSONObject jSONObject = new JSONObject(str3);
        a.a(jSONObject, str3, str2);
        return (User) m.d().fromJson(jSONObject.opt(AllStoryActivity.f73306b).toString(), User.class);
    }

    public final UserResponse a(String str, List<com.ss.android.http.a.b.e> list) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, f34225a, false, 23588, new Class[]{String.class, List.class}, UserResponse.class)) {
            return (UserResponse) PatchProxy.accessDispatch(new Object[]{str2, list}, this, f34225a, false, 23588, new Class[]{String.class, List.class}, UserResponse.class);
        }
        HashMap hashMap = new HashMap();
        if (!j.a((Collection<T>) list)) {
            for (com.ss.android.http.a.b.e next : list) {
                hashMap.put(next.a(), next.b());
            }
            NetUtil.putCommonParams(hashMap, true);
        }
        return (UserResponse) this.f34226b.postUserResponse(str2, hashMap).get();
    }

    public final void a(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f34225a, false, 23592, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f34225a, false, 23592, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("phone_number", str2);
        }
        hashMap.put("login_type", String.valueOf(i));
        NetUtil.putCommonParams(hashMap, true);
        a.b((String) this.f34226b.doPost("https://aweme.snssdk.com/aweme/v1/friend/register/notice/", hashMap).execute().body(), "https://aweme.snssdk.com/aweme/v1/friend/register/notice/");
    }

    public final AvatarUri a(String str, int i, String str2, List<com.ss.android.http.a.b.e> list) throws Exception {
        Object obj;
        Object obj2;
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, list2}, this, f34225a, false, 23591, new Class[]{String.class, Integer.TYPE, String.class, List.class}, AvatarUri.class)) {
            Object[] objArr = {str3, Integer.valueOf(i), str4, list2};
            return (AvatarUri) PatchProxy.accessDispatch(objArr, this, f34225a, false, 23591, new Class[]{String.class, Integer.TYPE, String.class, List.class}, AvatarUri.class);
        } else if (list2 == null) {
            Class<AvatarUri> cls = AvatarUri.class;
            Object[] objArr2 = {str3, Integer.valueOf(i), str4, cls, "data"};
            if (PatchProxy.isSupport(objArr2, null, a.f33783a, true, 23027, new Class[]{String.class, Integer.TYPE, String.class, Class.class, String.class}, Object.class)) {
                Object[] objArr3 = {str3, Integer.valueOf(i), str4, cls, "data"};
                Object[] objArr4 = objArr3;
                obj2 = PatchProxy.accessDispatch(objArr4, null, a.f33783a, true, 23027, new Class[]{String.class, Integer.TYPE, String.class, Class.class, String.class}, Object.class);
            } else if (String.class.equals(cls)) {
                obj2 = a.a(str3, i2, str4, (a.c<T>) a.d.a(), "data");
            } else {
                obj2 = a.a(str3, i2, str4, (a.c<T>) new a.b<T>(cls), "data");
            }
            return (AvatarUri) obj2;
        } else {
            Class<AvatarUri> cls2 = AvatarUri.class;
            Object[] objArr5 = {str3, Integer.valueOf(i), str4, cls2, "data", list2};
            if (PatchProxy.isSupport(objArr5, null, a.f33783a, true, 23028, new Class[]{String.class, Integer.TYPE, String.class, Class.class, String.class, List.class}, Object.class)) {
                Object[] objArr6 = {str3, Integer.valueOf(i), str4, cls2, "data", list2};
                Object[] objArr7 = objArr6;
                obj = PatchProxy.accessDispatch(objArr7, null, a.f33783a, true, 23028, new Class[]{String.class, Integer.TYPE, String.class, Class.class, String.class, List.class}, Object.class);
            } else if (String.class.equals(cls2)) {
                obj = a.a(str3, i2, str4, (a.c<T>) a.d.a(), "data");
            } else {
                a.b bVar = new a.b(cls2);
                Object[] objArr8 = {str3, Integer.valueOf(i), str4, bVar, "data", list2};
                if (PatchProxy.isSupport(objArr8, null, a.f33783a, true, 23029, new Class[]{String.class, Integer.TYPE, String.class, a.c.class, String.class, List.class}, Object.class)) {
                    Object[] objArr9 = {str3, Integer.valueOf(i), str4, bVar, "data", list2};
                    Object[] objArr10 = objArr9;
                    obj = PatchProxy.accessDispatch(objArr10, null, a.f33783a, true, 23029, new Class[]{String.class, Integer.TYPE, String.class, a.c.class, String.class, List.class}, Object.class);
                } else if (NetworkUtils.isNetworkAvailable(k.a())) {
                    obj = a.a(NetworkUtils.postFile(i2, str3, "file", str4, list2), bVar, "data", str3);
                } else {
                    throw new IOException();
                }
            }
            return (AvatarUri) obj;
        }
    }
}
