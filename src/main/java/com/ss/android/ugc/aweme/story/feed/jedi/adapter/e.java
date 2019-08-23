package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "", "()V", "itemCount", "", "getItemCount", "()I", "itemInitiationStateList", "", "", "clear", "", "get", "position", "insert", "put", "isOnCreateCalled", "remove", "swap", "from", "to", "update", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72636a;

    /* renamed from: b  reason: collision with root package name */
    final List<Boolean> f72637b = new ArrayList();

    private final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72636a, false, 83520, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72636a, false, 83520, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i < this.f72637b.size()) {
            this.f72637b.set(i, Boolean.TRUE);
        } else {
            this.f72637b.add(i, Boolean.TRUE);
        }
    }

    private final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72636a, false, 83521, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72636a, false, 83521, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72637b.add(i, Boolean.FALSE);
    }

    public final void a(int i, boolean z) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f72636a, false, 83519, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f72636a, false, 83519, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i2 >= 0) {
            if (i2 <= this.f72637b.size()) {
                if (z) {
                    a(i);
                } else {
                    b(i);
                }
            }
        }
    }
}
