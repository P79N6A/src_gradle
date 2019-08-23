package com.ss.android.ugc.aweme.setting;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.PopupResponse;
import com.ss.android.ugc.aweme.setting.model.PopupSetting;
import java.util.List;
import java.util.Map;
import retrofit2.http.GET;

public final class PopupSettingManager implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63785a;

    /* renamed from: b  reason: collision with root package name */
    static PopupSettingRequestApi f63786b = ((PopupSettingRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PopupSettingRequestApi.class));

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f63787c;

    /* renamed from: d  reason: collision with root package name */
    private int f63788d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, PopupSetting> f63789e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f63790f;

    interface PopupSettingRequestApi {
        @GET(a = "/aweme/v1/user/popup/")
        q<PopupResponse> requestPopupConfig();
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f63785a, false, 72054, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f63785a, false, 72054, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof a) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((a) obj).getErrorMsg()).a();
        } else if (obj instanceof Exception) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.bgg)).a();
        } else {
            if ((obj instanceof PopupResponse) && i == 1) {
                PopupResponse popupResponse = (PopupResponse) obj;
                if (popupResponse != null) {
                    List<PopupSetting> list = popupResponse.popups;
                    if (list != null) {
                        for (PopupSetting next : list) {
                            if (next != null) {
                                try {
                                    String str = next.id;
                                    if (!TextUtils.isEmpty(str)) {
                                        this.f63789e.put(str, next);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        this.f63790f = true;
                        if (this.f63787c != null) {
                            this.f63787c.sendEmptyMessage(this.f63788d);
                        }
                    }
                }
            }
        }
    }
}
