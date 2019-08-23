package com.ss.android.ugc.aweme.port.in;

import android.app.Service;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public interface af {

    public interface a {
        String a();

        void a(String str);

        boolean b();
    }

    q<? extends at> a(String str, LinkedHashMap<String, String> linkedHashMap);

    HashMap<String, String> a(Object obj);

    List<Pair<Class<?>, IAVPublishExtension<?>>> a(AVPublishContentType aVPublishContentType);

    void a(SettingItemSwitch settingItemSwitch, boolean z, @Nullable HashMap<String, String> hashMap);

    void a(BaseResponse baseResponse, int i);

    void a(BaseResponse baseResponse, List<InteractStickerStruct> list);

    void a(AVPublishContentType aVPublishContentType, List<Pair<Class<?>, IAVPublishExtension<?>>> list);

    void a(boolean z);

    boolean a();

    boolean a(@NonNull FragmentActivity fragmentActivity, @NonNull Intent intent, Class<? extends Service> cls, String str, String str2);

    q<? extends at> b(String str, LinkedHashMap<String, String> linkedHashMap);

    List<b> b();
}
