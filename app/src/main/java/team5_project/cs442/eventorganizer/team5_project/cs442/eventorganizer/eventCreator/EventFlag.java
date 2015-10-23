package team5_project.cs442.eventorganizer.team5_project.cs442.eventorganizer.eventCreator;

import java.util.Date;

/**
 * Created by sangwon on 10/22/15.
 */
public class EventFlag {

    private int mEventId;
    private String mEventName;
    private String mEventLocation;
    private Date mEventStartTime;
    private Date mEventEndTime;
    private Double mLatitude;
    private Double mLongitude;
    private String mDescription;
    private String mHost;
    private String mEventCreator;
    private Double mCost;


    public EventFlag(int mEventId, String mEventName, String mEventLocation, Date mEventStartTime, Date mEventEndTime, Double mLatitude, Double mLongitude, String mDescription, String mHost, String mEventCreator, Double mCost) {
        this.mEventId = mEventId;
        this.mEventName = mEventName;
        this.mEventLocation = mEventLocation;
        this.mEventStartTime = mEventStartTime;
        this.mEventEndTime = mEventEndTime;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
        this.mDescription = mDescription;
        this.mHost = mHost;
        this.mEventCreator = mEventCreator;
        this.mCost = mCost;
    }

    public int getmEventId() {
        return mEventId;
    }

    public void setmEventId(int mEventId) {
        this.mEventId = mEventId;
    }

    public String getmEventName() {
        return mEventName;
    }

    public void setmEventName(String mEventName) {
        this.mEventName = mEventName;
    }

    public String getmEventLocation() {
        return mEventLocation;
    }

    public void setmEventLocation(String mEventLocation) {
        this.mEventLocation = mEventLocation;
    }

    public Date getmEventStartTime() {
        return mEventStartTime;
    }

    public void setmEventStartTime(Date mEventStartTime) {
        this.mEventStartTime = mEventStartTime;
    }

    public Date getmEventEndTime() {
        return mEventEndTime;
    }

    public void setmEventEndTime(Date mEventEndTime) {
        this.mEventEndTime = mEventEndTime;
    }

    public Double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(Double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public Double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(Double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmHost() {
        return mHost;
    }

    public void setmHost(String mHost) {
        this.mHost = mHost;
    }

    public String getmEventCreator() {
        return mEventCreator;
    }

    public void setmEventCreator(String mEventCreator) {
        this.mEventCreator = mEventCreator;
    }

    public Double getmCost() {
        return mCost;
    }

    public void setmCost(Double mCost) {
        this.mCost = mCost;
    }
}