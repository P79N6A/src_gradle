package com.ss.android.ugc.aweme.im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.group.a.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.login.d;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.io.Serializable;
import java.util.HashMap;

public class ChatRoomActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50196a;

    /* renamed from: b  reason: collision with root package name */
    private ChatRoomFragment f50197b;

    /* renamed from: c  reason: collision with root package name */
    private o f50198c;

    /* renamed from: d  reason: collision with root package name */
    private String f50199d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50196a, false, 50259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50259, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", false);
    }

    public static boolean a(Context context, IMUser iMUser, int i, String str, a aVar, Serializable serializable) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        String str2 = str;
        a aVar2 = aVar;
        Serializable serializable2 = serializable;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2, Integer.valueOf(i), str2, aVar2, serializable2}, null, f50196a, true, 50244, new Class[]{Context.class, IMUser.class, Integer.TYPE, String.class, a.class, Serializable.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, iMUser2, Integer.valueOf(i), str2, aVar2, serializable2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f50196a, true, 50244, new Class[]{Context.class, IMUser.class, Integer.TYPE, String.class, a.class, Serializable.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null || TextUtils.isEmpty(iMUser.getUid())) {
            com.ss.android.ugc.aweme.framework.a.a.a("ChatRoomActivity.start user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            d.a((Activity) context2);
            return false;
        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().isEnableShowTeenageTip()) {
            return false;
        } else {
            Intent intent = new Intent(context2, ChatRoomActivity.class);
            intent.putExtra("simple_uesr", iMUser2);
            intent.putExtra("key_enter_from", i);
            intent.putExtra("from_user_id", str2);
            intent.putExtra("chat_ext", serializable2);
            intent.putExtra("im_ad_log", aVar2);
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        }
    }

    public static boolean a(Context context, String str, Bundle bundle) {
        Context context2 = context;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, str2, bundle2}, null, f50196a, true, 50245, new Class[]{Context.class, String.class, Bundle.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, bundle2}, null, f50196a, true, 50245, new Class[]{Context.class, String.class, Bundle.class}, Boolean.TYPE)).booleanValue();
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            d.a((Activity) context2);
            return false;
        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().isEnableShowTeenageTip()) {
            return false;
        } else {
            if (com.ss.android.ugc.aweme.im.sdk.group.b.a.a(str)) {
                com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.as2).a();
                return false;
            }
            Intent intent = new Intent(context2, ChatRoomActivity.class);
            intent.putExtra("session_id", str2);
            intent.putExtras(bundle2);
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        }
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f50196a, false, 50255, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("chat");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50255, new Class[0], Analysis.class);
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f50196a, false, 50250, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ph);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50250, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50196a, false, 50256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50256, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f50196a, false, 50253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50253, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50197b != null) {
            ChatRoomFragment chatRoomFragment = this.f50197b;
            if (PatchProxy.isSupport(new Object[0], chatRoomFragment, ChatRoomFragment.f50200a, false, 50266, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], chatRoomFragment, ChatRoomFragment.f50200a, false, 50266, new Class[0], Void.TYPE);
            } else if (chatRoomFragment.f50201b != null) {
                BaseChatPanel baseChatPanel = chatRoomFragment.f50201b;
                if (PatchProxy.isSupport(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50212, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50212, new Class[0], Void.TYPE);
                    return;
                }
                baseChatPanel.j.d();
            }
        }
    }

    private void a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50196a, false, 50251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50251, new Class[0], Void.TYPE);
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f50198c = (o) extras.get("key_session_info");
            if (this.f50198c == null) {
                this.f50199d = extras.getString("session_id");
                IMUser iMUser = (IMUser) extras.getSerializable("simple_uesr");
                int i2 = extras.getInt("key_enter_from", 0);
                String string = extras.getString("from_user_id");
                a aVar = (a) extras.getSerializable("im_ad_log");
                Serializable serializable = extras.getSerializable("chat_ext");
                b bVar = (b) extras.getSerializable("key_group_create_error");
                if (iMUser == null) {
                    d dVar = new d();
                    dVar.setChatType(3);
                    dVar.setGroupCheckMessage(bVar);
                    this.f50198c = dVar;
                } else {
                    p pVar = new p();
                    pVar.setFromUser(iMUser);
                    pVar.setFromUserId(string);
                    pVar.setChatExt(serializable);
                    pVar.setImAdLog(aVar);
                    if (iMUser.getCommerceUserLevel() > 0) {
                        i = 2;
                    } else if (i2 == 2) {
                        i = 1;
                    }
                    pVar.setChatType(i);
                    this.f50199d = e.a(Long.valueOf(iMUser.getUid()).longValue());
                    this.f50198c = pVar;
                    if (TextUtils.isEmpty(iMUser.getUid())) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(AllStoryActivity.f73306b, iMUser.toString());
                        hashMap.put("conversation_id", this.f50199d);
                        com.ss.android.ugc.aweme.im.sdk.utils.d.b("empty_user", hashMap);
                    }
                }
                this.f50198c.setConversationId(this.f50199d);
                this.f50198c.setEnterFrom(i2);
            }
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f50196a, false, 50254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50196a, false, 50254, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50197b != null) {
            ChatRoomFragment chatRoomFragment = this.f50197b;
            if (PatchProxy.isSupport(new Object[0], chatRoomFragment, ChatRoomFragment.f50200a, false, 50267, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], chatRoomFragment, ChatRoomFragment.f50200a, false, 50267, new Class[0], Void.TYPE);
            } else if (chatRoomFragment.f50201b != null) {
                BaseChatPanel baseChatPanel = chatRoomFragment.f50201b;
                if (PatchProxy.isSupport(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50213, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50213, new Class[0], Void.TYPE);
                } else {
                    baseChatPanel.j.e();
                }
            }
        }
        super.finish();
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50196a, false, 50252, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50196a, false, 50252, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("chat_room_fragment");
        if (findFragmentByTag == null || z) {
            findFragmentByTag = new ChatRoomFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_session_info", this.f50198c);
            findFragmentByTag.setArguments(bundle);
        }
        this.f50197b = (ChatRoomFragment) findFragmentByTag;
        supportFragmentManager.beginTransaction().replace(C0906R.id.aic, findFragmentByTag, "chat_room_fragment").commitAllowingStateLoss();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50196a, false, 50247, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50196a, false, 50247, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        setContentView((int) C0906R.layout.am);
        getWindow().getDecorView().setBackgroundResource(2130837846);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        com.ss.android.ugc.aweme.im.sdk.d.a.a().f();
        a();
        a(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", false);
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f50196a, false, 50249, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f50196a, false, 50249, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        a();
        a(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50196a, false, 50248, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50196a, false, 50248, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.f50198c != null) {
            bundle.putSerializable("key_session_info", this.f50198c);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50196a, false, 50257, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50196a, false, 50257, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (this.f50197b != null) {
            ChatRoomFragment chatRoomFragment = this.f50197b;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, chatRoomFragment, ChatRoomFragment.f50200a, false, 50268, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                ChatRoomFragment chatRoomFragment2 = chatRoomFragment;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, chatRoomFragment2, ChatRoomFragment.f50200a, false, 50268, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (chatRoomFragment.f50201b != null) {
                BaseChatPanel baseChatPanel = chatRoomFragment.f50201b;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, baseChatPanel, BaseChatPanel.f50171a, false, 50216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    BaseChatPanel baseChatPanel2 = baseChatPanel;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, baseChatPanel2, BaseChatPanel.f50171a, false, 50216, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                baseChatPanel.l = z2;
                if (z2) {
                    baseChatPanel.j.b(0);
                }
            }
        }
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f50196a, true, 50246, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f50196a, true, 50246, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intent intent = new Intent(context2, ChatRoomActivity.class);
        intent.addFlags(268435456);
        context2.startActivity(intent);
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f50196a, false, 50258, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f50196a, false, 50258, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f50197b != null) {
            int i3 = i;
            int i4 = i2;
            this.f50197b.onActivityResult(i, i2, intent2);
        }
    }

    public static boolean a(Context context, IMUser iMUser, int i) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        if (!PatchProxy.isSupport(new Object[]{context2, iMUser2, Integer.valueOf(i)}, null, f50196a, true, 50239, new Class[]{Context.class, IMUser.class, Integer.TYPE}, Boolean.TYPE)) {
            return a(context2, iMUser2, i, null, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2, Integer.valueOf(i)}, null, f50196a, true, 50239, new Class[]{Context.class, IMUser.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, IMUser iMUser, int i, a aVar, Serializable serializable) {
        if (!PatchProxy.isSupport(new Object[]{context, iMUser, Integer.valueOf(i), aVar, serializable}, null, f50196a, true, 50243, new Class[]{Context.class, IMUser.class, Integer.TYPE, a.class, Serializable.class}, Boolean.TYPE)) {
            return a(context, iMUser, i, "", aVar, serializable);
        }
        Object[] objArr = {context, iMUser, Integer.valueOf(i), aVar, serializable};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, f50196a, true, 50243, new Class[]{Context.class, IMUser.class, Integer.TYPE, a.class, Serializable.class}, Boolean.TYPE)).booleanValue();
    }
}
