package com.enpassio.pagingwithmvvm.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsResponse implements Parcelable {

    public final static Parcelable.Creator<NewsResponse> CREATOR = new Creator<NewsResponse>() {


        @SuppressWarnings({
                "unchecked"
        })
        public NewsResponse createFromParcel(Parcel in) {
            return new NewsResponse(in);
        }

        public NewsResponse[] newArray(int size) {
            return (new NewsResponse[size]);
        }

    };
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalResults")
    @Expose
    private int totalResults;
    @SerializedName("articles")
    @Expose
    private List<Article> articles = null;

    protected NewsResponse(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.totalResults = ((int) in.readValue((int.class.getClassLoader())));
        in.readList(this.articles, (com.enpassio.pagingwithmvvm.data.model.Article.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     */
    public NewsResponse() {
    }

    /**
     * @param articles
     * @param totalResults
     * @param status
     */
    public NewsResponse(String status, int totalResults, List<Article> articles) {
        super();
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(totalResults);
        dest.writeList(articles);
    }

    public int describeContents() {
        return 0;
    }

}