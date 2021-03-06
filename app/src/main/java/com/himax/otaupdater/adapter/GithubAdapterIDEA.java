package com.himax.otaupdater.adapter;

import android.content.Context;

import org.json.JSONArray;

/**
 * Created by: veli
 * Date: 10/25/16 10:18 PM
 */

abstract public class GithubAdapterIDEA extends AbstractGithubAdapter
{
    JSONArray mList = new JSONArray();

    public GithubAdapterIDEA(Context context)
    {
        super(context);
    }

    @Override
    protected JSONArray onIndex()
    {
        return this.mList;
    }

    @Override
    protected void onUpdate(JSONArray list)
    {
        this.mList = list;
    }
}
