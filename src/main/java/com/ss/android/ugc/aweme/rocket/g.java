package com.ss.android.ugc.aweme.rocket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.websocket.b.c.b;
import com.ss.android.websocket.internal.a;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FlipChatParser;", "Lcom/ss/android/websocket/ws/parser/PayloadParser;", "()V", "generateIMChannelMsg", "Lcom/ss/android/ugc/aweme/rocket/FlipChatChannelMsg;", "frame", "Lcom/ss/android/websocket/internal/IFrame;", "parse", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63659a;

    @Nullable
    public final Object a(@Nullable a aVar) {
        if (!PatchProxy.isSupport(new Object[]{aVar}, this, f63659a, false, 70896, new Class[]{a.class}, Object.class)) {
            return b(aVar);
        }
        return PatchProxy.accessDispatch(new Object[]{aVar}, this, f63659a, false, 70896, new Class[]{a.class}, Object.class);
    }

    private final c b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63659a, false, 70897, new Class[]{a.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63659a, false, 70897, new Class[]{a.class}, c.class);
        } else if (aVar == null) {
            return null;
        } else {
            try {
                c cVar = new c();
                cVar.f63645a = aVar.getMethod();
                cVar.f63646b = aVar.getService();
                cVar.f63647c = aVar.getPayload();
                cVar.f63648d = aVar.getPayloadType();
                cVar.f63649e = aVar.getPayloadEncoding();
                return cVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
