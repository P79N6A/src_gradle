package com.alimama.tunion.trade.convert;

public class TUnionConvertResult {

    /* renamed from: a  reason: collision with root package name */
    private TUnionJumpType f5204a;

    /* renamed from: b  reason: collision with root package name */
    private String f5205b;

    public TUnionConvertResult() {
    }

    public TUnionJumpType getJumpType() {
        return this.f5204a;
    }

    public String getResultUrl() {
        return this.f5205b;
    }

    public void setJumpType(TUnionJumpType tUnionJumpType) {
        this.f5204a = tUnionJumpType;
    }

    public void setResultUrl(String str) {
        this.f5205b = str;
    }

    public TUnionConvertResult(TUnionJumpType tUnionJumpType, String str) {
        this.f5204a = tUnionJumpType;
        this.f5205b = str;
    }
}
