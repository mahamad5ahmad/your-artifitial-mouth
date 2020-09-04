package com.example.cv1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {


        @SerializedName("predictions")
        private String predictions;

        @SerializedName("fivePredictions")
        private String[] fivePredictions;

        @SerializedName("success")
        private int success;


        public String getpredictions() {
            return predictions;
        }


        public String[] getfivepredictions() {
        return fivePredictions;
        }


        public int getsuccess() {
        return success;
        }
        public  void setpredictions(String p) {
                this.predictions=p;
        }


        public  void setFivePredictions(String[] f) {
                this.fivePredictions=f;
        }
        public  void setSuccess(int s) {
                this.success=s;
        }
}
