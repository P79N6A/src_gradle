package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.ImageModel;

public final class d extends ImageModel {

    /* renamed from: a  reason: collision with root package name */
    public String f18703a;

    /* renamed from: b  reason: collision with root package name */
    public int f18704b;

    /* renamed from: c  reason: collision with root package name */
    public int f18705c;

    public d(int i) {
        this.f18704b = 2;
        this.f18705c = i;
    }

    public d(ImageModel imageModel, int i) {
        setAvgColor(imageModel.getAvgColor());
        setUri(imageModel.getUri());
        setUrls(imageModel.getUrls());
        setWidth(imageModel.getWidth());
        setHeight(imageModel.getHeight());
        this.f18704b = i;
    }
}
