package com.perficient.sample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MoviesResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movie> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}

//public class MoviesResponse {
////    @SerializedName("page")
////    private int page;
////    @SerializedName("results")
////    private List<Movie> results;
////    @SerializedName("total_results")
////    private int totalResults;
////    @SerializedName("total_pages")
////    private int totalPages;
//
//    @SerializedName("success")
//    private String success;
//    @SerializedName("Images")
//    private List<Movie> Images;
//
//    public String getSuccess() {
//        return success;
//    }
//
//    public void setSuccess (String success) {
//        this.success = success;
//    }
//
//    public List<Movie> getImages() {
//        return Images;
//    }
//
//    public void setImages(List<Movie> Images) {
//        this.Images = Images;
//    }
//
////    public int getPage() {
////        return page;
////    }
////
////    public void setPage(int page) {
////        this.page = page;
////    }
////
////    public List<Movie> getResults() {
////        return results;
////    }
////
////    public void setResults(List<Movie> results) {
////        this.results = results;
////    }
////
////    public int getTotalResults() {
////        return totalResults;
////    }
////
////    public void setTotalResults(int totalResults) {
////        this.totalResults = totalResults;
////    }
////
////    public int getTotalPages() {
////        return totalPages;
////    }
////
////    public void setTotalPages(int totalPages) {
////        this.totalPages = totalPages;
////    }
//}