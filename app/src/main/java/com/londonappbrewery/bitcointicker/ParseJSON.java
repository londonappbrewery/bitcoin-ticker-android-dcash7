package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by student on 1/14/2018.
 */

public class ParseJSON {

    private String mPrice;

    public static ParseJSON fromJSON(JSONObject jsonObject){
        ParseJSON JSON = new ParseJSON();
        try {
            JSON.mPrice = jsonObject.getString("last");
            return JSON;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice(){
        return mPrice;
    }
}
