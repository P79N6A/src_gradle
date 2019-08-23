package com.ss.android.ugc.aweme.im.sdk.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.utils.as;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class ChatRoomFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50200a;

    /* renamed from: b  reason: collision with root package name */
    BaseChatPanel f50201b;

    /* renamed from: c  reason: collision with root package name */
    private View f50202c;

    /* renamed from: d  reason: collision with root package name */
    private o f50203d;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50200a, false, 50264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50200a, false, 50264, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        getLifecycle().removeObserver(this.f50201b);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50200a, false, 50262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50200a, false, 50262, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        as.a("enter_chat_room");
    }

    public void onPause() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f50200a, false, 50263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50200a, false, 50263, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis() - as.c("enter_chat_room").longValue();
        as.b("enter_chat_room");
        if (currentTimeMillis > 86400000) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(" start: ");
            if (as.c("enter_chat_room") != null) {
                sb.append(as.c("enter_chat_room"));
            } else {
                sb.append(0);
            }
            sb.append(" leave: ");
            sb.append(System.currentTimeMillis());
            sb.append(" duration: ");
            sb.append(currentTimeMillis);
            hashMap.put("tag", sb.toString());
            d.b("leave_chat_duration", hashMap);
        }
        String conversationId = this.f50203d.getConversationId();
        if (this.f50203d.isGroupChat()) {
            str = "group";
        } else {
            str = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
        }
        if (PatchProxy.isSupport(new Object[]{conversationId, str, new Long(currentTimeMillis)}, null, z.f52670a, true, 53641, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{conversationId, str, new Long(currentTimeMillis)}, null, z.f52670a, true, 53641, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("conversation_id", conversationId);
        hashMap2.put("chat_type", str);
        hashMap2.put("duration", String.valueOf(currentTimeMillis));
        r.a("leave_chat", (Map) hashMap2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        a aVar;
        BaseChatPanel baseChatPanel;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f50200a, false, 50261, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f50200a, false, 50261, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        as.a("enterChatRoom");
        if (PatchProxy.isSupport(new Object[0], this, f50200a, false, 50265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50200a, false, 50265, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f50203d = (o) arguments.getSerializable("key_session_info");
                if (this.f50203d != null) {
                    if (PatchProxy.isSupport(new Object[0], this, f50200a, false, 50270, new Class[0], a.class)) {
                        aVar = (a) PatchProxy.accessDispatch(new Object[0], this, f50200a, false, 50270, new Class[0], a.class);
                    } else {
                        aVar = new a(this);
                    }
                    View view2 = this.f50202c;
                    o oVar = this.f50203d;
                    if (!PatchProxy.isSupport(new Object[]{view2, oVar}, aVar, a.f50274a, false, 50237, new Class[]{View.class, o.class}, BaseChatPanel.class)) {
                        Intrinsics.checkParameterIsNotNull(view2, "view");
                        Intrinsics.checkParameterIsNotNull(oVar, "sessionInfo");
                        switch (oVar.getChatType()) {
                            case 0:
                            case 1:
                            case 2:
                                baseChatPanel = new SingleChatPanel(aVar.f50275b, view2, (p) oVar);
                                break;
                            case 3:
                                baseChatPanel = new GroupChatPanel(aVar.f50275b, view2, (d) oVar);
                                break;
                            default:
                                baseChatPanel = new BaseChatPanel(aVar.f50275b, view2, oVar);
                                break;
                        }
                    } else {
                        a aVar2 = aVar;
                        baseChatPanel = (BaseChatPanel) PatchProxy.accessDispatch(new Object[]{view2, oVar}, aVar2, a.f50274a, false, 50237, new Class[]{View.class, o.class}, BaseChatPanel.class);
                    }
                    this.f50201b = baseChatPanel;
                    getLifecycle().addObserver(this.f50201b);
                }
            }
            if (getActivity() != null) {
                UIUtils.displayToast(getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.ar9));
                getActivity().finish();
            }
        }
        as.b("enterChatRoom");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f50200a, false, 50269, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f50200a, false, 50269, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f50201b != null) {
            int i3 = i;
            int i4 = i2;
            this.f50201b.a(i, i2, intent2);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f50200a, false, 50260, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f50200a, false, 50260, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f50202c = layoutInflater.inflate(C0906R.layout.n7, viewGroup2, false);
        return this.f50202c;
    }
}
