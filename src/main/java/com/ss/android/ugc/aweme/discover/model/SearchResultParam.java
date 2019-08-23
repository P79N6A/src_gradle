package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class SearchResultParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String enterFrom = "";
    private int intermediatePageIndex;
    private boolean isAd;
    private boolean isOpenNewSearchContainer;
    private String keyword;
    private int position;
    private String realSearchWord;
    private int searchFrom;
    private String source;

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public int getIntermediatePageIndex() {
        return this.intermediatePageIndex;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getPosition() {
        return this.position;
    }

    public String getRealSearchWord() {
        return this.realSearchWord;
    }

    public int getSearchFrom() {
        return this.searchFrom;
    }

    public String getSource() {
        return this.source;
    }

    public boolean isAd() {
        return this.isAd;
    }

    public boolean isOpenNewSearchContainer() {
        return this.isOpenNewSearchContainer;
    }

    public SearchResultParam setAd(boolean z) {
        this.isAd = z;
        return this;
    }

    public SearchResultParam setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public SearchResultParam setIntermediatePageIndex(int i) {
        this.intermediatePageIndex = i;
        return this;
    }

    public SearchResultParam setKeyword(String str) {
        this.keyword = str;
        return this;
    }

    public SearchResultParam setOpenNewSearchContainer(boolean z) {
        this.isOpenNewSearchContainer = z;
        return this;
    }

    public SearchResultParam setPosition(int i) {
        this.position = i;
        return this;
    }

    public SearchResultParam setRealSearchWord(String str) {
        this.realSearchWord = str;
        return this;
    }

    public SearchResultParam setSearchFrom(int i) {
        this.searchFrom = i;
        return this;
    }

    public SearchResultParam setSource(String str) {
        this.source = str;
        return this;
    }
}
