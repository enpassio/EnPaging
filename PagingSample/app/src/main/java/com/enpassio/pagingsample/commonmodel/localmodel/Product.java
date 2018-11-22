package com.enpassio.pagingsample.commonmodel.localmodel;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
    private int productId;
    private String productName;
    private int productPrice;

    Product(int id, String name, int price) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
    }

    private Product(Parcel in) {
        productId = in.readInt();
        productName = in.readString();
        productPrice = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(productId);
        dest.writeString(productName);
        dest.writeInt(productPrice);
    }
}
