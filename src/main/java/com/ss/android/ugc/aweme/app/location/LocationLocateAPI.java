package com.ss.android.ugc.aweme.app.location;

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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001Jr\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/location/LocationLocateAPI;", "", "doPost", "Lcom/bytedance/retrofit2/Call;", "", "maxLength", "", "relativePath", "queryMap", "", "fieldMap", "headerList", "", "Lcom/bytedance/retrofit2/client/Header;", "extraInfo", "addCommonPara", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface LocationLocateAPI {
    @FormUrlEncoded
    @POST
    @NotNull
    Call<String> doPost(@MaxLength int i, @NotNull @Url String str, @NotNull @QueryMap Map<String, String> map, @NotNull @FieldMap(a = true) Map<String, String> map2, @HeaderList @NotNull List<Header> list, @NotNull @ExtraInfo Object obj, @AddCommonParam boolean z);
}
