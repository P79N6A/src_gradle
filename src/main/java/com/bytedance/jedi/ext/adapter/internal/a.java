package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "", "()V", "itemCount", "", "getItemCount", "()I", "itemInitiationStateList", "", "", "clear", "", "get", "position", "insert", "put", "isOnCreateCalled", "remove", "swap", "from", "to", "update", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Boolean> f21483a = new ArrayList();

    private final void b(int i) {
        this.f21483a.add(i, Boolean.FALSE);
    }

    private final void a(int i) {
        if (i < this.f21483a.size()) {
            this.f21483a.set(i, Boolean.TRUE);
        } else {
            this.f21483a.add(i, Boolean.TRUE);
        }
    }

    public final void a(int i, boolean z) {
        if (i >= 0 && i <= this.f21483a.size()) {
            if (z) {
                a(i);
            } else {
                b(i);
            }
        }
    }
}
