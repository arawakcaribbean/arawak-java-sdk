package ca.tourism.platform.sdk.entity.page;

import java.util.List;

/**
 * Created by ups on 9/05/19.
 */
public class CustomPage<T> {
    private int size ;
    private int page ;
    private long totalElements ;
    private int countPages ;
    private boolean isFirst ;
    private boolean isLast ;
    private boolean hasNext ;
    private boolean hasPrevious ;
    private List<T> content ;

    public CustomPage() {
    }

    public CustomPage(int size, int page, long totalElements, int countPages, boolean isFirst, boolean isLast, boolean hasNext, boolean hasPrevious, List<T> content) {
        this.size = size;
        this.page = page;
        this.totalElements = totalElements;
        this.countPages = countPages;
        this.isFirst = isFirst;
        this.isLast = isLast;
        this.hasNext = hasNext;
        this.hasPrevious = hasPrevious;
        this.content = content;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CustomPage{" +
                "size=" + size +
                ", page=" + page +
                ", totalElements=" + totalElements +
                ", countPages=" + countPages +
                ", isFirst=" + isFirst +
                ", isLast=" + isLast +
                ", hasNext=" + hasNext +
                ", hasPrevious=" + hasPrevious +
                ", content=" + content +
                '}';
    }
}
