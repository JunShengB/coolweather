package lb.com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/12/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
