package uz.itschool.myapplication

import android.os.Parcel
import android.os.Parcelable

data class Product(var product_name:String, var price: Int?, var desc:String, var img:Int, var bg_color: Int, var discount:String?, var orientation: String):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(product_name)
        parcel.writeValue(price)
        parcel.writeString(desc)
        parcel.writeInt(img)
        parcel.writeInt(bg_color)
        parcel.writeString(discount)
        parcel.writeString(orientation)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }

}
