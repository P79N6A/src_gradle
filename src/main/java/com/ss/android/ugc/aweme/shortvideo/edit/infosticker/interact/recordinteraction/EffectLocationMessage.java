package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class EffectLocationMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    List<EffectLocation> locations;

    public List<EffectLocation> getLocations() {
        return this.locations;
    }

    public void setLocations(List<EffectLocation> list) {
        this.locations = list;
    }
}
