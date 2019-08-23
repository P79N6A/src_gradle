package com.ss.android.ugc.aweme.player.ab;

import com.google.gson.annotations.SerializedName;

public class PlayerTypeAbConfig {
    @SerializedName("player_type")
    @PlayerType

    /* renamed from: a  reason: collision with root package name */
    public int f59102a;
    @SerializedName("h264_decode_type")
    @DecodeType

    /* renamed from: b  reason: collision with root package name */
    public int f59103b;
    @SerializedName("h265_decode_type")
    @DecodeType

    /* renamed from: c  reason: collision with root package name */
    public int f59104c;

    @interface DecodeType {
    }

    @interface PlayerType {
    }
}
