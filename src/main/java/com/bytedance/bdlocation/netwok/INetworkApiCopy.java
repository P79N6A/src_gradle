package com.bytedance.bdlocation.netwok;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import java.util.List;
import java.util.Map;

public interface INetworkApiCopy {
    @FormUrlEncoded
    @POST
    Call<String> doPost(@MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @FieldMap(a = true) Map<String, String> map2, @HeaderList List<Header> list, @ExtraInfo Object obj, @AddCommonParam boolean z);
}
