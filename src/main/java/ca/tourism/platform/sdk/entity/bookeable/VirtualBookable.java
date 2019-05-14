package ca.tourism.platform.sdk.entity.bookeable ;

import java.util.Date;

public class VirtualBookable implements Comparable<VirtualBookable>{

    private Date dateStart;
    private Date dateEnd;
    private String bookableId;
    private BookableState bookableState;

    public VirtualBookable() {
    }

    public VirtualBookable(Date dateStart, Date dateEnd, String bookableId, BookableState bookableState) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.bookableId = bookableId;
        this.bookableState = bookableState;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public String getBookableId() {
        return bookableId;
    }

    public BookableState getBookableState() {
        return bookableState;
    }

    public int compareTo(VirtualBookable virtualBookable) {
        if (getDateStart() == null || virtualBookable.getDateStart() == null)
            return 0;
        return getDateStart().compareTo(virtualBookable.getDateStart());
    }

    @Override
    public String toString() {
        return "VirtualBookable{" +
                "dateStart=" + dateStart.toString() +
                ", dateEnd=" + dateEnd.toString() +
                ", bookableId=" + bookableId +
                ", bookableState=" + bookableState +
                '}';
    }
}
