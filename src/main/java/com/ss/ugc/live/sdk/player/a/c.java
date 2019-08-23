package com.ss.ugc.live.sdk.player.a;

import android.content.Context;
import android.util.SparseIntArray;
import com.ss.ttm.player.TTMediaPlayer;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.ugc.live.sdk.player.ILivePlayer;
import com.ss.ugc.live.sdk.player.b;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f78751a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78752b;

    /* renamed from: c  reason: collision with root package name */
    public b f78753c;

    /* renamed from: d  reason: collision with root package name */
    public SparseIntArray f78754d = new SparseIntArray();

    private TTMediaPlayer b() {
        TTPlayerConfiger.setValue(2, this.f78752b);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return TTMediaPlayer.create(this.f78751a);
    }

    public final ILivePlayer a() throws Exception {
        TTMediaPlayer b2 = b();
        if (b2 == null) {
            b2 = b();
            if (b2 == null || b2.isOSPlayer()) {
                if (this.f78753c != null) {
                    this.f78753c.a(new JSONObject().put("body_type", "init").put("fail_code", 1).put("error_msg", "ttplayer init failed"));
                }
                throw new Exception("create ttplayer fail");
            }
        }
        if (this.f78753c != null) {
            this.f78753c.a(new JSONObject().put("body_type", "init").put("fail_code", 0));
        }
        for (int i = 0; i < this.f78754d.size(); i++) {
            b2.setIntOption(this.f78754d.keyAt(i), this.f78754d.valueAt(i));
        }
        return new b(this, b2);
    }

    public c(Context context) {
        this.f78751a = context;
    }
}
