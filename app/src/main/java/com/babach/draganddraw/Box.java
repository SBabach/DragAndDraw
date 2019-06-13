package com.babach.draganddraw;

import android.graphics.PointF;

public class Box
{
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin)
    {
        this.mOrigin = origin;
        this.mCurrent = origin;
    }


    public PointF getOrigin()
    {
        return mOrigin;
    }

    public PointF getCurrent()
    {
        return mCurrent;
    }

    public void setCurrent(PointF current)
    {
        mCurrent = current;
    }
}