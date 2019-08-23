package com.ss.android.ugc.aweme.friends.api;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.DouyinContactModel;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UploadContactsApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48826a;

    /* renamed from: b  reason: collision with root package name */
    public static final UploadContactsService f48827b = ((UploadContactsService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(UploadContactsService.class));

    public interface UploadContactsService {
        @FormUrlEncoded
        @POST("/aweme/v1/upload/contacts/")
        Call<String> uploadContacts(@Query(a = "need_unregistered_user") String str, @FieldMap Map<String, String> map);

        @FormUrlEncoded
        @POST("/aweme/v1/upload/hashcontacts/")
        Call<UploadContactsResult> uploadHashContacts(@Query(a = "need_unregistered_user") String str, @FieldMap Map<String, String> map);
    }

    public static UploadContactsResult a(List<DouyinContactModel> list, int i) throws Exception {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{list, 1}, null, f48826a, true, 46379, new Class[]{List.class, Integer.TYPE}, UploadContactsResult.class)) {
            return (UploadContactsResult) PatchProxy.accessDispatch(new Object[]{list, 1}, null, f48826a, true, 46379, new Class[]{List.class, Integer.TYPE}, UploadContactsResult.class);
        }
        HashMap hashMap = new HashMap();
        if (!CollectionUtils.isEmpty(list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList(list.size());
            for (DouyinContactModel next : list) {
                for (String next2 : next.phoneNumber) {
                    if (next2 != null) {
                        str = DigestUtils.toHexString(instance.digest(next.nationalNumber(next2).getBytes("UTF-8")));
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(next.name)) {
                        str2 = DigestUtils.toHexString(instance.digest(next.name.getBytes("UTF-8")));
                    } else {
                        str2 = "";
                    }
                    arrayList.add(new ContactModel(str, str2));
                }
            }
            hashMap.put("contact", JSON.createAdapterGsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson((Object) arrayList));
        }
        NetUtil.putCommonParams(hashMap, true);
        return (UploadContactsResult) f48827b.uploadHashContacts(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, hashMap).execute().body();
    }
}
