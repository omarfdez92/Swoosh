package com.omarparra.swoosh.Model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Omar Parra on 12/31/18.
 */
class Player (var league: String, var skill:String): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }

}
