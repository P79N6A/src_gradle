package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.CommonToastMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class h extends c<CommonToastMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16626a;
    @SerializedName("discardable")

    /* renamed from: b  reason: collision with root package name */
    public boolean f16627b;
    @SerializedName("immediate")

    /* renamed from: c  reason: collision with root package name */
    public boolean f16628c;
    @SerializedName("duration")

    /* renamed from: d  reason: collision with root package name */
    public int f16629d;
    @SerializedName("background_color_start")

    /* renamed from: e  reason: collision with root package name */
    public String f16630e;
    @SerializedName("background_color_end")

    /* renamed from: f  reason: collision with root package name */
    public String f16631f;
    @SerializedName("text_color")
    public String g;
    @SerializedName("position")
    public int h;
    @SerializedName("top_img")
    public ImageModel i;
    @SerializedName("top_img_width")
    public int j;
    @SerializedName("top_img_height")
    public int k;
    @SerializedName("show_mongolia_layer")
    public boolean l;

    public h() {
        this.type = a.COMMON_TOAST;
    }

    public /* synthetic */ c wrap(Message message) {
        CommonToastMessage commonToastMessage = (CommonToastMessage) message;
        if (PatchProxy.isSupport(new Object[]{commonToastMessage}, this, f16626a, false, 11026, new Class[]{CommonToastMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{commonToastMessage}, this, f16626a, false, 11026, new Class[]{CommonToastMessage.class}, c.class);
        }
        h hVar = new h();
        hVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(commonToastMessage.common);
        hVar.f16627b = ((Boolean) Wire.get(commonToastMessage.discardable, Boolean.FALSE)).booleanValue();
        hVar.f16628c = ((Boolean) Wire.get(commonToastMessage.immediate, Boolean.FALSE)).booleanValue();
        hVar.f16629d = ((Long) Wire.get(commonToastMessage.duration, 0L)).intValue();
        hVar.g = (String) Wire.get(commonToastMessage.text_color, "#ffffff");
        hVar.i = com.bytedance.android.livesdk.message.a.a.a(commonToastMessage.top_img);
        hVar.f16630e = (String) Wire.get(commonToastMessage.background_color_start, "#ff9d5c");
        hVar.f16631f = (String) Wire.get(commonToastMessage.background_color_end, "#ff5c67");
        hVar.h = ((Number) Wire.get(commonToastMessage.position, 1)).intValue();
        hVar.k = ((Number) Wire.get(commonToastMessage.top_img_height, 0)).intValue();
        hVar.j = ((Number) Wire.get(commonToastMessage.top_img_width, 0)).intValue();
        hVar.l = ((Boolean) Wire.get(commonToastMessage.show_mongolia_layer, Boolean.FALSE)).booleanValue();
        return hVar;
    }
}
