package com.bytedance.apm.impl;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefaultTTNetImpl implements IHttpService {
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private List<Header> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (next != null) {
                    arrayList.add(new Header((String) next.getKey(), (String) next.getValue()));
                }
            }
        }
        return arrayList;
    }

    public b doGet(String str, Map<String, String> map) throws Exception {
        SsResponse execute = ((RetrofitMonitorService) RetrofitUtils.createSsService("http://mon.snssdk.com", RetrofitMonitorService.class)).fetch(str, map).execute();
        return new b(execute.code(), toByteArray(((TypedInput) execute.body()).in()));
    }

    public b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        SsResponse execute = ((RetrofitMonitorService) RetrofitUtils.createSsService("http://mon.snssdk.com", RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map)).execute();
        return new b(execute.code(), toByteArray(((TypedInput) execute.body()).in()));
    }
}
