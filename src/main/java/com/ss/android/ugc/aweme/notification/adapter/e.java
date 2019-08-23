package com.ss.android.ugc.aweme.notification.adapter;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57952a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationAdapter f57953b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57954c;

    e(NotificationAdapter notificationAdapter, int i) {
        this.f57953b = notificationAdapter;
        this.f57954c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57952a, false, 63071, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57952a, false, 63071, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        NotificationAdapter notificationAdapter = this.f57953b;
        int i2 = this.f57954c;
        int size = notificationAdapter.mItems.size();
        if (size > 0 && i2 >= 0 && i2 < size) {
            BaseNotice baseNotice = (BaseNotice) notificationAdapter.mItems.get(i2);
            if (baseNotice != null) {
                NoticeApiManager.a(baseNotice.nid);
            }
            notificationAdapter.mItems.remove(i2);
            if (!CollectionUtils.isEmpty(notificationAdapter.f57930d)) {
                notificationAdapter.f57930d.remove(baseNotice);
            }
            notificationAdapter.notifyItemRemoved(i2);
            if (PatchProxy.isSupport(new Object[]{baseNotice, Integer.valueOf(i2)}, notificationAdapter, NotificationAdapter.f57927a, false, 63070, new Class[]{BaseNotice.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {baseNotice, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = NotificationAdapter.f57927a;
                Object[] objArr2 = objArr;
                NotificationAdapter notificationAdapter2 = notificationAdapter;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr2, notificationAdapter2, changeQuickRedirect2, false, 63070, new Class[]{BaseNotice.class, Integer.TYPE}, Void.TYPE);
            } else if (baseNotice != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("scene_id", "1005");
                String str = "";
                switch (notificationAdapter.f57928b) {
                    case 0:
                        str = "fans";
                        break;
                    case 1:
                        str = "like";
                        break;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        str = "comment";
                        break;
                    case 13:
                        str = "story";
                        break;
                }
                hashMap.put("account_type", str);
                hashMap.put("client_order", String.valueOf(i2));
                hashMap.put("action_type", "delete");
                String str2 = "";
                if (!(notificationAdapter.f57929c == null || notificationAdapter.f57929c.getIntent() == null)) {
                    str2 = notificationAdapter.f57929c.getIntent().getStringExtra("rule_id");
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("rule_id", str2);
                }
                r.a("notification_message_inner_message", (Map) hashMap);
            }
        }
        dialogInterface.dismiss();
    }
}
