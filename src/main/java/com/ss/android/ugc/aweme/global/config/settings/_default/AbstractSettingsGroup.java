package com.ss.android.ugc.aweme.global.config.settings._default;

import com.bytedance.ies.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueGroup;
import com.squareup.wire.Message;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;

public abstract class AbstractSettingsGroup implements DefaultValueGroup<IESSettings, IESSettings.Builder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected WireTypeAdapterFactory mFactory;
    protected WireDeserializeErrorListener mListener;

    public abstract void addOptionalObjectDefaultValue();

    public <T extends Message> void registerDefaultValue(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, changeQuickRedirect, false, 47604, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, changeQuickRedirect, false, 47604, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a.a().f20215a.put(t.getClass(), t);
        this.mFactory.registerDefaultValue(t, this.mListener);
    }

    public void registerOptionalObjectDefaultValue(WireTypeAdapterFactory wireTypeAdapterFactory, WireDeserializeErrorListener wireDeserializeErrorListener) {
        if (PatchProxy.isSupport(new Object[]{wireTypeAdapterFactory, wireDeserializeErrorListener}, this, changeQuickRedirect, false, 47603, new Class[]{WireTypeAdapterFactory.class, WireDeserializeErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wireTypeAdapterFactory, wireDeserializeErrorListener}, this, changeQuickRedirect, false, 47603, new Class[]{WireTypeAdapterFactory.class, WireDeserializeErrorListener.class}, Void.TYPE);
            return;
        }
        this.mFactory = wireTypeAdapterFactory;
        this.mListener = wireDeserializeErrorListener;
        addOptionalObjectDefaultValue();
    }
}
