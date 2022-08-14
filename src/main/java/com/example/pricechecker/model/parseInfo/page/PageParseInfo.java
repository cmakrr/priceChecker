package com.example.pricechecker.model.parseInfo.page;

import com.example.pricechecker.logic.parsing.pageParsers.PageParser;

import java.net.URI;

public class PageParseInfo<ValueType>{
    private URI uri;
    private PageParser<ValueType> pageParser;

    public PageParseInfo(URI uri,PageParser<ValueType> pageParser){
        this.uri = uri;
        this.pageParser = pageParser;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public PageParser<ValueType> getPageParser() {
        return pageParser;
    }

    public void setPageParser(PageParser<ValueType> pageParser) {
        this.pageParser = pageParser;
    }
}
