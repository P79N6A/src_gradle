package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.a.n;
import com.bytedance.android.livesdk.message.proto.LinkMicArmies;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.List;

public final class ah extends c<LinkMicArmies> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16450a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public List<n> f16451b;

    public ah() {
        this.type = a.LINK_MIC_ARMIES;
    }

    public final /* synthetic */ c wrap(Message message) {
        LinkMicArmies linkMicArmies = (LinkMicArmies) message;
        if (PatchProxy.isSupport(new Object[]{linkMicArmies}, this, f16450a, false, 11058, new Class[]{LinkMicArmies.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicArmies}, this, f16450a, false, 11058, new Class[]{LinkMicArmies.class}, c.class);
        }
        ah ahVar = new ah();
        ahVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(linkMicArmies.common);
        if (linkMicArmies.user_armies_map != null && linkMicArmies.user_armies_map.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (Long next : linkMicArmies.user_armies_map.keySet()) {
                n nVar = new n();
                nVar.f11061a = next.longValue();
                LinkMicArmies.UserArmies userArmies = linkMicArmies.user_armies_map.get(next);
                if (userArmies.user_armies != null && userArmies.user_armies.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (LinkMicArmies.UserArmies.UserArmy next2 : userArmies.user_armies) {
                        n.a aVar = new n.a();
                        aVar.f11063a = ((Long) Wire.get(next2.user_id, 0L)).longValue();
                        aVar.f11064b = (int) ((Long) Wire.get(next2.score, 0L)).longValue();
                        aVar.f11065c = next2.nickname;
                        aVar.f11066d = com.bytedance.android.livesdk.message.a.a.a(next2.avatar_thumb);
                        arrayList2.add(aVar);
                    }
                    nVar.f11062b = arrayList2;
                }
                arrayList.add(nVar);
            }
            ahVar.f16451b = arrayList;
        }
        return ahVar;
    }
}
