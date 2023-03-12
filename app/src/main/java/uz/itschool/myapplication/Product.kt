package uz.itschool.myapplication

import android.os.Parcel
import android.os.Parcelable

data class Product(var product_name: Int, var price: Int?, var desc: Int, var img:Int, var bg_color: Int, var discount:String?, var orientation: String):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(product_name)
        parcel.writeValue(price)
        parcel.writeInt(desc)
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
